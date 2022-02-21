// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

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
    @NameInMap("MaintenanceAttributes")
    private MaintenanceAttributes maintenanceAttributes;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeInstanceMaintenanceAttributesResponseBody(Builder builder) {
        this.maintenanceAttributes = builder.maintenanceAttributes;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceMaintenanceAttributesResponseBody create() {
        return builder().build();
    }

    /**
     * @return maintenanceAttributes
     */
    public MaintenanceAttributes getMaintenanceAttributes() {
        return this.maintenanceAttributes;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private MaintenanceAttributes maintenanceAttributes; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * MaintenanceAttributes.
         */
        public Builder maintenanceAttributes(MaintenanceAttributes maintenanceAttributes) {
            this.maintenanceAttributes = maintenanceAttributes;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstanceMaintenanceAttributesResponseBody build() {
            return new DescribeInstanceMaintenanceAttributesResponseBody(this);
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

        @NameInMap("SupportedValues")
        private SupportedValues supportedValues;

        @NameInMap("Value")
        private String value;

        private ActionOnMaintenance(Builder builder) {
            this.defaultValue = builder.defaultValue;
            this.supportedValues = builder.supportedValues;
            this.value = builder.value;
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
         * @return supportedValues
         */
        public SupportedValues getSupportedValues() {
            return this.supportedValues;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String defaultValue; 
            private SupportedValues supportedValues; 
            private String value; 

            /**
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * SupportedValues.
             */
            public Builder supportedValues(SupportedValues supportedValues) {
                this.supportedValues = supportedValues;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ActionOnMaintenance build() {
                return new ActionOnMaintenance(this);
            } 

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
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * StartTime.
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
    public static class MaintenanceAttribute extends TeaModel {
        @NameInMap("ActionOnMaintenance")
        private ActionOnMaintenance actionOnMaintenance;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("LiveMigration")
        private Boolean liveMigration;

        @NameInMap("MaintenanceWindows")
        private MaintenanceWindows maintenanceWindows;

        private MaintenanceAttribute(Builder builder) {
            this.actionOnMaintenance = builder.actionOnMaintenance;
            this.instanceId = builder.instanceId;
            this.liveMigration = builder.liveMigration;
            this.maintenanceWindows = builder.maintenanceWindows;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MaintenanceAttribute create() {
            return builder().build();
        }

        /**
         * @return actionOnMaintenance
         */
        public ActionOnMaintenance getActionOnMaintenance() {
            return this.actionOnMaintenance;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return liveMigration
         */
        public Boolean getLiveMigration() {
            return this.liveMigration;
        }

        /**
         * @return maintenanceWindows
         */
        public MaintenanceWindows getMaintenanceWindows() {
            return this.maintenanceWindows;
        }

        public static final class Builder {
            private ActionOnMaintenance actionOnMaintenance; 
            private String instanceId; 
            private Boolean liveMigration; 
            private MaintenanceWindows maintenanceWindows; 

            /**
             * ActionOnMaintenance.
             */
            public Builder actionOnMaintenance(ActionOnMaintenance actionOnMaintenance) {
                this.actionOnMaintenance = actionOnMaintenance;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * LiveMigration.
             */
            public Builder liveMigration(Boolean liveMigration) {
                this.liveMigration = liveMigration;
                return this;
            }

            /**
             * MaintenanceWindows.
             */
            public Builder maintenanceWindows(MaintenanceWindows maintenanceWindows) {
                this.maintenanceWindows = maintenanceWindows;
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
