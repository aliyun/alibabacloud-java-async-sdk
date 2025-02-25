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
 * {@link CreateConfigGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateConfigGroupRequest</p>
 */
public class CreateConfigGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigTimers")
    private java.util.List<ConfigTimers> configTimers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 500)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateConfigGroupRequest(Builder builder) {
        super(builder);
        this.configTimers = builder.configTimers;
        this.description = builder.description;
        this.name = builder.name;
        this.productType = builder.productType;
        this.regionId = builder.regionId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConfigGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateConfigGroupRequest, Builder> {
        private java.util.List<ConfigTimers> configTimers; 
        private String description; 
        private String name; 
        private String productType; 
        private String regionId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateConfigGroupRequest request) {
            super(request);
            this.configTimers = request.configTimers;
            this.description = request.description;
            this.name = request.name;
            this.productType = request.productType;
            this.regionId = request.regionId;
            this.type = request.type;
        } 

        /**
         * ConfigTimers.
         */
        public Builder configTimers(java.util.List<ConfigTimers> configTimers) {
            this.putQueryParameter("ConfigTimers", configTimers);
            this.configTimers = configTimers;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CLOUD_DESKTOP</p>
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Timer</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateConfigGroupRequest build() {
            return new CreateConfigGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateConfigGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateConfigGroupRequest</p>
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
        @com.aliyun.core.annotation.Validation(required = true)
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
             * AllowClientSetting.
             */
            public Builder allowClientSetting(Boolean allowClientSetting) {
                this.allowClientSetting = allowClientSetting;
                return this;
            }

            /**
             * CronExpression.
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * Enforce.
             */
            public Builder enforce(Boolean enforce) {
                this.enforce = enforce;
                return this;
            }

            /**
             * Interval.
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * OperationType.
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * ProcessWhitelist.
             */
            public Builder processWhitelist(java.util.List<String> processWhitelist) {
                this.processWhitelist = processWhitelist;
                return this;
            }

            /**
             * ResetType.
             */
            public Builder resetType(String resetType) {
                this.resetType = resetType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>TIMER_BOOT</p>
             */
            public Builder timerType(String timerType) {
                this.timerType = timerType;
                return this;
            }

            /**
             * TriggerType.
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
}
