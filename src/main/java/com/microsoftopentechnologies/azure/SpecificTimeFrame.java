package com.microsoftopentechnologies.azure;

import hudson.Extension;
import hudson.model.Describable;
import hudson.model.Descriptor;
import hudson.util.ListBoxModel;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import javax.servlet.ServletException;
import jenkins.model.Jenkins;
import org.kohsuke.stapler.DataBoundConstructor;

public class SpecificTimeFrame  implements Describable<SpecificTimeFrame>  {
    private int startHour;
    private int endHour;
    private int minVM;
    private int maxVM;
    
    @DataBoundConstructor
    public SpecificTimeFrame(String startHour, String endHour, String minVM, String maxVM) {
        this.startHour = Integer.parseInt(startHour);
        this.endHour = Integer.parseInt(endHour);
        this.minVM = Integer.parseInt(minVM);
        this.maxVM = Integer.parseInt(maxVM);
    }

    /**
     * @return the startHour
     */
    public int getStartHour() {
        return startHour;
    }

    /**
     * @return the endHour
     */
    public int getEndHour() {
        return endHour;
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
        
//        public ListBoxModel doFillStartHourItems()throws IOException, ServletException {
//            ListBoxModel model = new ListBoxModel();
//
//            List<String> startHours = Arrays.asList("8h", "9h", "10h");
//
//            for (String startHour : startHours) {
//                    model.add(startHour);
//            }
//
//            return model;
//        }
//    
//        public ListBoxModel doFillEndHourItems()throws IOException, ServletException {
//            ListBoxModel model = new ListBoxModel();
//
//            List<String> endHours = Arrays.asList("11h", "12h", "13h");
//
//            for (String endHour : endHours) {
//                    model.add(endHour);
//            }
//
//            return model;
//        }
    
    }

}
