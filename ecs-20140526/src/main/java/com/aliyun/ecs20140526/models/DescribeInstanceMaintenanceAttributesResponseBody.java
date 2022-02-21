// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceMaintenanceAttributesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceMaintenanceAttributesResponseBody</p>
 */
public class DescribeInstanceMaintenanceAttributesResponseBody extends TeaModel {
    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("MaintenanceAttributes")
    private MaintenanceAttributes maintenanceAttributes;

    private DescribeInstanceMaintenanceAttributesResponseBody(Builder builder) {
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.pageNumber = builder.pageNumber;
        this.totalCount = builder.totalCount;
        this.maintenanceAttributes = builder.maintenanceAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceMaintenanceAttributesResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return maintenanceAttributes
     */
    public MaintenanceAttributes getMaintenanceAttributes() {
        return this.maintenanceAttributes;
    }

    public static final class Builder {
        private Integer pageSize; 
        private String requestId; 
        private Integer pageNumber; 
        private Integer totalCount; 
        private MaintenanceAttributes maintenanceAttributes; 

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The page number of the maintenance attribute list.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The total number of maintenance attributes queried.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The collection of O & M attributes.
         */
        public Builder maintenanceAttributes(MaintenanceAttributes maintenanceAttributes) {
            this.maintenanceAttributes = maintenanceAttributes;
            return this;
        }

        public DescribeInstanceMaintenanceAttributesResponseBody build() {
            return new DescribeInstanceMaintenanceAttributesResponseBody(this);
        } 

    } 

    public static class MaintenanceWindow extends TeaModel {
        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("StartTime")
        private String startTime;

        private MaintenanceWindow(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MaintenanceWindow create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private String startTime; 

            /**
             * The end time of the maintenance window.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The start time of the maintenance time window.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public MaintenanceWindow build() {
                return new MaintenanceWindow(this);
            } 

        } 

    }
    public static class MaintenanceWindows extends TeaModel {
        @NameInMap("MaintenanceWindow")
        private java.util.List < MaintenanceWindow> maintenanceWindow;

        private MaintenanceWindows(Builder builder) {
            this.maintenanceWindow = builder.maintenanceWindow;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MaintenanceWindows create() {
            return builder().build();
        }

        /**
         * @return maintenanceWindow
         */
        public java.util.List < MaintenanceWindow> getMaintenanceWindow() {
            return this.maintenanceWindow;
        }

        public static final class Builder {
            private java.util.List < MaintenanceWindow> maintenanceWindow; 

            /**
             * MaintenanceWindow.
             */
            public Builder maintenanceWindow(java.util.List < MaintenanceWindow> maintenanceWindow) {
                this.maintenanceWindow = maintenanceWindow;
                return this;
            }

            public MaintenanceWindows build() {
                return new MaintenanceWindows(this);
            } 

        } 

    }
    public static class SupportedValues extends TeaModel {
        @NameInMap("SupportedValue")
        private java.util.List < String > supportedValue;

        private SupportedValues(Builder builder) {
            this.supportedValue = builder.supportedValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedValues create() {
            return builder().build();
        }

        /**
         * @return supportedValue
         */
        public java.util.List < String > getSupportedValue() {
            return this.supportedValue;
        }

        public static final class Builder {
            private java.util.List < String > supportedValue; 

            /**
             * SupportedValue.
             */
            public Builder supportedValue(java.util.List < String > supportedValue) {
                this.supportedValue = supportedValue;
                return this;
            }

            public SupportedValues build() {
                return new SupportedValues(this);
            } 

        } 

    }
    public static class ActionOnMaintenance extends TeaModel {
        @NameInMap("DefaultValue")
        private String defaultValue;

        @NameInMap("Value")
        private String value;

        @NameInMap("SupportedValues")
        private SupportedValues supportedValues;

        private ActionOnMaintenance(Builder builder) {
            this.defaultValue = builder.defaultValue;
            this.value = builder.value;
            this.supportedValues = builder.supportedValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActionOnMaintenance create() {
            return builder().build();
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return supportedValues
         */
        public SupportedValues getSupportedValues() {
            return this.supportedValues;
        }

        public static final class Builder {
            private String defaultValue; 
            private String value; 
            private SupportedValues supportedValues; 

            /**
             * Maintenance action, the default value.
             * <p>
             * 
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * Maintenance action, current effective value. Possible values:
             * <p>
             * 
             * -Stop: Stop state (I .e. downtime).
             * -AutoRecover: automatic recovery.
             * -AutoRedeploy: downtime migration, data disk lossy.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * SupportedValues.
             */
            public Builder supportedValues(SupportedValues supportedValues) {
                this.supportedValues = supportedValues;
                return this;
            }

            public ActionOnMaintenance build() {
                return new ActionOnMaintenance(this);
            } 

        } 

    }
    public static class MaintenanceAttribute extends TeaModel {
        @NameInMap("NotifyOnMaintenance")
        private Boolean notifyOnMaintenance;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("MaintenanceWindows")
        private MaintenanceWindows maintenanceWindows;

        @NameInMap("ActionOnMaintenance")
        private ActionOnMaintenance actionOnMaintenance;

        private MaintenanceAttribute(Builder builder) {
            this.notifyOnMaintenance = builder.notifyOnMaintenance;
            this.instanceId = builder.instanceId;
            this.maintenanceWindows = builder.maintenanceWindows;
            this.actionOnMaintenance = builder.actionOnMaintenance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MaintenanceAttribute create() {
            return builder().build();
        }

        /**
         * @return notifyOnMaintenance
         */
        public Boolean getNotifyOnMaintenance() {
            return this.notifyOnMaintenance;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return maintenanceWindows
         */
        public MaintenanceWindows getMaintenanceWindows() {
            return this.maintenanceWindows;
        }

        /**
         * @return actionOnMaintenance
         */
        public ActionOnMaintenance getActionOnMaintenance() {
            return this.actionOnMaintenance;
        }

        public static final class Builder {
            private Boolean notifyOnMaintenance; 
            private String instanceId; 
            private MaintenanceWindows maintenanceWindows; 
            private ActionOnMaintenance actionOnMaintenance; 

            /**
             * Instance downtime operations front whether to send event notification.
             */
            public Builder notifyOnMaintenance(Boolean notifyOnMaintenance) {
                this.notifyOnMaintenance = notifyOnMaintenance;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The list of instances in the O & M window.
             */
            public Builder maintenanceWindows(MaintenanceWindows maintenanceWindows) {
                this.maintenanceWindows = maintenanceWindows;
                return this;
            }

            /**
             * Instance operations action attribute.
             */
            public Builder actionOnMaintenance(ActionOnMaintenance actionOnMaintenance) {
                this.actionOnMaintenance = actionOnMaintenance;
                return this;
            }

            public MaintenanceAttribute build() {
                return new MaintenanceAttribute(this);
            } 

        } 

    }
    public static class MaintenanceAttributes extends TeaModel {
        @NameInMap("MaintenanceAttribute")
        private java.util.List < MaintenanceAttribute> maintenanceAttribute;

        private MaintenanceAttributes(Builder builder) {
            this.maintenanceAttribute = builder.maintenanceAttribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MaintenanceAttributes create() {
            return builder().build();
        }

        /**
         * @return maintenanceAttribute
         */
        public java.util.List < MaintenanceAttribute> getMaintenanceAttribute() {
            return this.maintenanceAttribute;
        }

        public static final class Builder {
            private java.util.List < MaintenanceAttribute> maintenanceAttribute; 

            /**
             * MaintenanceAttribute.
             */
            public Builder maintenanceAttribute(java.util.List < MaintenanceAttribute> maintenanceAttribute) {
                this.maintenanceAttribute = maintenanceAttribute;
                return this;
            }

            public MaintenanceAttributes build() {
                return new MaintenanceAttributes(this);
            } 

        } 

    }
}
