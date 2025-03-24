// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeTimerGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTimerGroupResponseBody</p>
 */
public class DescribeTimerGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeTimerGroupResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTimerGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * <p>The information about the configuration group.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeTimerGroupResponseBody build() {
            return new DescribeTimerGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTimerGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTimerGroupResponseBody</p>
     */
    public static class ConfigTimers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowClientSetting")
        private Boolean allowClientSetting;

        @com.aliyun.core.annotation.NameInMap("CronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("Enforce")
        private Boolean enforce;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("OperationType")
        private String operationType;

        @com.aliyun.core.annotation.NameInMap("ProcessWhitelist")
        private java.util.List<String> processWhitelist;

        @com.aliyun.core.annotation.NameInMap("ResetType")
        private String resetType;

        @com.aliyun.core.annotation.NameInMap("TimerType")
        private String timerType;

        @com.aliyun.core.annotation.NameInMap("TriggerType")
        private String triggerType;

        private ConfigTimers(Builder builder) {
            this.allowClientSetting = builder.allowClientSetting;
            this.cronExpression = builder.cronExpression;
            this.enforce = builder.enforce;
            this.interval = builder.interval;
            this.operationType = builder.operationType;
            this.processWhitelist = builder.processWhitelist;
            this.resetType = builder.resetType;
            this.timerType = builder.timerType;
            this.triggerType = builder.triggerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigTimers create() {
            return builder().build();
        }

        /**
         * @return allowClientSetting
         */
        public Boolean getAllowClientSetting() {
            return this.allowClientSetting;
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return enforce
         */
        public Boolean getEnforce() {
            return this.enforce;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return operationType
         */
        public String getOperationType() {
            return this.operationType;
        }

        /**
         * @return processWhitelist
         */
        public java.util.List<String> getProcessWhitelist() {
            return this.processWhitelist;
        }

        /**
         * @return resetType
         */
        public String getResetType() {
            return this.resetType;
        }

        /**
         * @return timerType
         */
        public String getTimerType() {
            return this.timerType;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        public static final class Builder {
            private Boolean allowClientSetting; 
            private String cronExpression; 
            private Boolean enforce; 
            private Integer interval; 
            private String operationType; 
            private java.util.List<String> processWhitelist; 
            private String resetType; 
            private String timerType; 
            private String triggerType; 

            /**
             * <p>Indicates whether end users can configure scheduled tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder allowClientSetting(Boolean allowClientSetting) {
                this.allowClientSetting = allowClientSetting;
                return this;
            }

            /**
             * <p>The CRON expression for the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 16 ? * 1,2,3,4,5,6,7</p>
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * <p>Specifies whether to forcibly execute the scheduled task. A value of true specifies the scheduled task will run forcefully, ignoring the cloud computer and connection status.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enforce(Boolean enforce) {
                this.enforce = enforce;
                return this;
            }

            /**
             * <p>The interval at which the scheduled task is executed. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The type of the scheduled disconnection task.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Hibernate: scheduled hibernation.</li>
             * <li>Shutdown: scheduled shutdown.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Shutdown</p>
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * <p>The process whitelist. If whitelisted processes are running, the scheduled task upon inactivity does not take effect.</p>
             */
            public Builder processWhitelist(java.util.List<String> processWhitelist) {
                this.processWhitelist = processWhitelist;
                return this;
            }

            /**
             * <p>The reset operation of the scheduled task.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>RESET_TYPE_SYSTEM: resets the system disk.</li>
             * <li>RESET_TYPE_USER_DISK: resets the data disk.</li>
             * <li>RESET_TYPE_BOTH: resets the system disk and data disk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RESET_TYPE_SYSTEM</p>
             */
            public Builder resetType(String resetType) {
                this.resetType = resetType;
                return this;
            }

            /**
             * <p>The type of the scheduled task.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>NoOperationDisconnect: scheduled disconnection upon inactivity.</li>
             * <li>NoConnect: scheduled disconnection upon specified operation (OperationType).</li>
             * <li>TimerBoot: scheduled start.</li>
             * <li>TimerReset: scheduled reset.</li>
             * <li>NoOperationShutdown: scheduled shutdown upon inactivity.</li>
             * <li>NoOperationHibernate: scheduled hibernation upon inactivity.</li>
             * <li>TimerShutdown: scheduled shutdown.</li>
             * <li>NoOperationReboot: scheduled restart upon inactivity.</li>
             * <li>TimerReboot: scheduled restart.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TimerBoot</p>
             */
            public Builder timerType(String timerType) {
                this.timerType = timerType;
                return this;
            }

            /**
             * <p>The method to trigger the scheduled task upon inactivity.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Advanced: intelligent detection.</li>
             * <li>Standard: standard detection.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Standard</p>
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            public ConfigTimers build() {
                return new ConfigTimers(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTimerGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTimerGroupResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindCount")
        private Integer bindCount;

        @com.aliyun.core.annotation.NameInMap("BindCountMap")
        private java.util.Map<String, Integer> bindCountMap;

        @com.aliyun.core.annotation.NameInMap("ConfigTimers")
        private java.util.List<ConfigTimers> configTimers;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.bindCount = builder.bindCount;
            this.bindCountMap = builder.bindCountMap;
            this.configTimers = builder.configTimers;
            this.description = builder.description;
            this.groupId = builder.groupId;
            this.name = builder.name;
            this.productType = builder.productType;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bindCount
         */
        public Integer getBindCount() {
            return this.bindCount;
        }

        /**
         * @return bindCountMap
         */
        public java.util.Map<String, Integer> getBindCountMap() {
            return this.bindCountMap;
        }

        /**
         * @return configTimers
         */
        public java.util.List<ConfigTimers> getConfigTimers() {
            return this.configTimers;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer bindCount; 
            private java.util.Map<String, Integer> bindCountMap; 
            private java.util.List<ConfigTimers> configTimers; 
            private String description; 
            private String groupId; 
            private String name; 
            private String productType; 
            private String status; 
            private String type; 

            /**
             * <p>The number of resources that are bound to the configuration group.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder bindCount(Integer bindCount) {
                this.bindCount = bindCount;
                return this;
            }

            /**
             * <p>The number of bound resources.</p>
             */
            public Builder bindCountMap(java.util.Map<String, Integer> bindCountMap) {
                this.bindCountMap = bindCountMap;
                return this;
            }

            /**
             * <p>The scheduled task configuration groups.</p>
             */
            public Builder configTimers(java.util.List<ConfigTimers> configTimers) {
                this.configTimers = configTimers;
                return this;
            }

            /**
             * <p>The description of the configuration group.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the configuration group.</p>
             * 
             * <strong>example:</strong>
             * <p>cg-75aazkg2tnqb2*****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the configuration group.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The service type of the configuration group.</p>
             * <p>Valid value:</p>
             * <ul>
             * <li>CLOUD_DESKTOP: the cloud computer service.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CLOUD_DESKTOP</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The state of the configuration group.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>AVAILABLE: The configuration group is available.</li>
             * <li>UNAVAILABLE: The configuration group is deleted.</li>
             * <li>DELETING: The configuration group is being deleted.</li>
             * <li>UPDATING: The configuration group is being modified.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AVAILABLE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the configuration group.</p>
             * <p>Valid value:</p>
             * <ul>
             * <li>Timer: the scheduled task type.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Timer</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
