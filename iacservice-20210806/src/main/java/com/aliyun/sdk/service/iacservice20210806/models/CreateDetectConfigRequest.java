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
 * {@link CreateDetectConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateDetectConfigRequest</p>
 */
public class CreateDetectConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("alarmConfigs")
    private java.util.List<AlarmConfigs> alarmConfigs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cronExpression")
    private String cronExpression;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("detectConfigName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String detectConfigName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("triggerType")
    private String triggerType;

    private CreateDetectConfigRequest(Builder builder) {
        super(builder);
        this.alarmConfigs = builder.alarmConfigs;
        this.clientToken = builder.clientToken;
        this.cronExpression = builder.cronExpression;
        this.description = builder.description;
        this.detectConfigName = builder.detectConfigName;
        this.enabled = builder.enabled;
        this.triggerType = builder.triggerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDetectConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmConfigs
     */
    public java.util.List<AlarmConfigs> getAlarmConfigs() {
        return this.alarmConfigs;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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

    public static final class Builder extends Request.Builder<CreateDetectConfigRequest, Builder> {
        private java.util.List<AlarmConfigs> alarmConfigs; 
        private String clientToken; 
        private String cronExpression; 
        private String description; 
        private String detectConfigName; 
        private Boolean enabled; 
        private String triggerType; 

        private Builder() {
            super();
        } 

        private Builder(CreateDetectConfigRequest request) {
            super(request);
            this.alarmConfigs = request.alarmConfigs;
            this.clientToken = request.clientToken;
            this.cronExpression = request.cronExpression;
            this.description = request.description;
            this.detectConfigName = request.detectConfigName;
            this.enabled = request.enabled;
            this.triggerType = request.triggerType;
        } 

        /**
         * <p>List of alerting addresses</p>
         */
        public Builder alarmConfigs(java.util.List<AlarmConfigs> alarmConfigs) {
            this.putBodyParameter("alarmConfigs", alarmConfigs);
            this.alarmConfigs = alarmConfigs;
            return this;
        }

        /**
         * <p>Idempotence token, format: <code>[0-9a-zA-Z-]{1,64}</code>. It is recommended to use a UUID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a65451293e64979ba7a4b573950217fe</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Cron expression (UTC+8). Required when trigger type is <code>Cron</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 0 ? * 1</p>
         */
        public Builder cronExpression(String cronExpression) {
            this.putBodyParameter("cronExpression", cronExpression);
            this.cronExpression = cronExpression;
            return this;
        }

        /**
         * <p>Description, up to 256 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Detection configuration Name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder detectConfigName(String detectConfigName) {
            this.putBodyParameter("detectConfigName", detectConfigName);
            this.detectConfigName = detectConfigName;
            return this;
        }

        /**
         * <p>Whether the Detection feature is Enabled. The default value is <code>true</code>.</p>
         */
        public Builder enabled(Boolean enabled) {
            this.putBodyParameter("enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>Trigger type  </p>
         * <ul>
         * <li>Manual: Execute manually  </li>
         * <li>Cron: Trigger on a schedule</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        public Builder triggerType(String triggerType) {
            this.putBodyParameter("triggerType", triggerType);
            this.triggerType = triggerType;
            return this;
        }

        @Override
        public CreateDetectConfigRequest build() {
            return new CreateDetectConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDetectConfigRequest} extends {@link TeaModel}
     *
     * <p>CreateDetectConfigRequest</p>
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
             * <p>Alerting address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://metrichub-cms-cn-hangzhou.aliyuncs.com/event/notify?xxxxx">https://metrichub-cms-cn-hangzhou.aliyuncs.com/event/notify?xxxxx</a></p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>Alerting method. Currently only <code>cms</code> is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>cms</p>
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
}
