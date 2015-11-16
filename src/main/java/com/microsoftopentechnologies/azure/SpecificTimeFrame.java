package com.microsoftopentechnologies.azure;

import hudson.Extension;
import hudson.model.Describable;
import hudson.model.Descriptor;
import java.text.ParseException;
import java.util.Calendar;
import jenkins.model.Jenkins;
import org.kohsuke.stapler.DataBoundConstructor;

public class SpecificTimeFrame  implements Describable<SpecificTimeFrame>  {
    private int startHour;
    private int startMinutes;
    private int endHour;
    private int endMinutes;
    private int minVM;
    private int maxVM;
    
    @DataBoundConstructor
    public SpecificTimeFrame(String startHour, String startMinutes, String endHour, String endMinutes, String minVM, String maxVM) throws ParseException {
        this.startHour = Integer.parseInt(startHour);
        this.startMinutes = Integer.parseInt(startMinutes);
        this.endHour = Integer.parseInt(endHour);
        this.endMinutes = Integer.parseInt(endMinutes);
        this.minVM = Integer.parseInt(minVM);
        this.maxVM = Integer.parseInt(maxVM);
    }

    /**
     * @return the startHour
     */
    public Calendar getStartTime() {
        Calendar startTime = Calendar.getInstance();
        startTime.set(Calendar.HOUR_OF_DAY, startHour);
        startTime.set(Calendar.MINUTE, startMinutes);
        return startTime;
    }

    /**
     * @return the endHour
     */
    public Calendar getEndTime() {
        Calendar startTime = Calendar.getInstance();
        startTime.set(Calendar.HOUR_OF_DAY, endHour);
        startTime.set(Calendar.MINUTE, endMinutes);
        return startTime;
    }

    /**
     * @return the startHour
     */
    public int getStartHour() {
        return startHour;
    }

    /**
     * @return the startMinutes
     */
    public int getStartMinutes() {
        return startMinutes;
    }
    
    /**
     * @return the endHour
     */
    public int getEndHour() {
        return endHour;
    }

    /**
     * @return the endMinutes
     */
    public int getEndMinutes() {
        return endMinutes;
    }
    
    /**
     * @return the minVM
     */
    public int getMinVM() {
        return minVM;
    }

    /**
     * @return the maxVM
     */
    public int getMaxVM() {
        return maxVM;
    }

    /**
     *
     * @return
     */
    public Descriptor<SpecificTimeFrame> getDescriptor() {
        return Jenkins.getInstance().getDescriptor(getClass());
    }
    
    @Extension
	public static final class DescriptorImpl extends Descriptor<SpecificTimeFrame> {
        
        public String getDisplayName() {
            return null;
        }
    }

}
