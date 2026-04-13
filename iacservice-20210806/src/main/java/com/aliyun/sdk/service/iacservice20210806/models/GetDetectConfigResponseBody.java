// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link GetDetectConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetDetectConfigResponseBody</p>
 */
public class GetDetectConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("detectConfig")
    private DetectConfig detectConfig;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetDetectConfigResponseBody(Builder builder) {
        this.detectConfig = builder.detectConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDetectConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return detectConfig
     */
    public DetectConfig getDetectConfig() {
        return this.detectConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DetectConfig detectConfig; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDetectConfigResponseBody model) {
            this.detectConfig = model.detectConfig;
            this.requestId = model.requestId;
        } 

        /**
         * detectConfig.
         */
        public Builder detectConfig(DetectConfig detectConfig) {
            this.detectConfig = detectConfig;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>BF72A6FB-B071-5F2E-A036-9D62545B962C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDetectConfigResponseBody build() {
            return new GetDetectConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDetectConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetDetectConfigResponseBody</p>
     */
    public static class AlarmConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private AlarmConfigs(Builder builder) {
            this.address = builder.address;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmConfigs create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String address; 
            private String type; 

            private Builder() {
            } 

            private Builder(AlarmConfigs model) {
                this.address = model.address;
                this.type = model.type;
            } 

            /**
             * address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AlarmConfigs build() {
                return new AlarmConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDetectConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetDetectConfigResponseBody</p>
     */
    public static class DetectConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alarmConfigs")
        private java.util.List<AlarmConfigs> alarmConfigs;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("cronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("detectConfigId")
        private String detectConfigId;

        @com.aliyun.core.annotation.NameInMap("detectConfigName")
        private String detectConfigName;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("triggerType")
        private String triggerType;

        private DetectConfig(Builder builder) {
            this.alarmConfigs = builder.alarmConfigs;
            this.createTime = builder.createTime;
            this.cronExpression = builder.cronExpression;
            this.description = builder.description;
            this.detectConfigId = builder.detectConfigId;
            this.detectConfigName = builder.detectConfigName;
            this.enabled = builder.enabled;
            this.triggerType = builder.triggerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetectConfig create() {
            return builder().build();
        }

        /**
         * @return alarmConfigs
         */
        public java.util.List<AlarmConfigs> getAlarmConfigs() {
            return this.alarmConfigs;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return detectConfigId
         */
        public String getDetectConfigId() {
            return this.detectConfigId;
        }

        /**
         * @return detectConfigName
         */
        public String getDetectConfigName() {
            return this.detectConfigName;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        public static final class Builder {
            private java.util.List<AlarmConfigs> alarmConfigs; 
            private String createTime; 
            private String cronExpression; 
            private String description; 
            private String detectConfigId; 
            private String detectConfigName; 
            private Boolean enabled; 
            private String triggerType; 

            private Builder() {
            } 

            private Builder(DetectConfig model) {
                this.alarmConfigs = model.alarmConfigs;
                this.createTime = model.createTime;
                this.cronExpression = model.cronExpression;
                this.description = model.description;
                this.detectConfigId = model.detectConfigId;
                this.detectConfigName = model.detectConfigName;
                this.enabled = model.enabled;
                this.triggerType = model.triggerType;
            } 

            /**
             * alarmConfigs.
             */
            public Builder alarmConfigs(java.util.List<AlarmConfigs> alarmConfigs) {
                this.alarmConfigs = alarmConfigs;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * cronExpression.
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * detectConfigId.
             */
            public Builder detectConfigId(String detectConfigId) {
                this.detectConfigId = detectConfigId;
                return this;
            }

            /**
             * detectConfigName.
             */
            public Builder detectConfigName(String detectConfigName) {
                this.detectConfigName = detectConfigName;
                return this;
            }

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * triggerType.
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            public DetectConfig build() {
                return new DetectConfig(this);
            } 

        } 

    }
}
