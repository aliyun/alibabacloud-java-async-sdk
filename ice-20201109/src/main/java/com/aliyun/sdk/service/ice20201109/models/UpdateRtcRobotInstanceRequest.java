// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link UpdateRtcRobotInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateRtcRobotInstanceRequest</p>
 */
public class UpdateRtcRobotInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    private Config config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private UpdateRtcRobotInstanceRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRtcRobotInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public Config getConfig() {
        return this.config;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<UpdateRtcRobotInstanceRequest, Builder> {
        private Config config; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRtcRobotInstanceRequest request) {
            super(request);
            this.config = request.config;
            this.instanceId = request.instanceId;
        } 

        /**
         * Config.
         */
        public Builder config(Config config) {
            String configShrink = shrink(config, "Config", "json");
            this.putQueryParameter("Config", configShrink);
            this.config = config;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>727dc0e296014bb58670940a3da95592</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public UpdateRtcRobotInstanceRequest build() {
            return new UpdateRtcRobotInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateRtcRobotInstanceRequest} extends {@link TeaModel}
     *
     * <p>UpdateRtcRobotInstanceRequest</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableVoiceInterrupt")
        private Boolean enableVoiceInterrupt;

        @com.aliyun.core.annotation.NameInMap("Greeting")
        private String greeting;

        @com.aliyun.core.annotation.NameInMap("VoiceId")
        private String voiceId;

        private Config(Builder builder) {
            this.enableVoiceInterrupt = builder.enableVoiceInterrupt;
            this.greeting = builder.greeting;
            this.voiceId = builder.voiceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return enableVoiceInterrupt
         */
        public Boolean getEnableVoiceInterrupt() {
            return this.enableVoiceInterrupt;
        }

        /**
         * @return greeting
         */
        public String getGreeting() {
            return this.greeting;
        }

        /**
         * @return voiceId
         */
        public String getVoiceId() {
            return this.voiceId;
        }

        public static final class Builder {
            private Boolean enableVoiceInterrupt; 
            private String greeting; 
            private String voiceId; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.enableVoiceInterrupt = model.enableVoiceInterrupt;
                this.greeting = model.greeting;
                this.voiceId = model.voiceId;
            } 

            /**
             * EnableVoiceInterrupt.
             */
            public Builder enableVoiceInterrupt(Boolean enableVoiceInterrupt) {
                this.enableVoiceInterrupt = enableVoiceInterrupt;
                return this;
            }

            /**
             * Greeting.
             */
            public Builder greeting(String greeting) {
                this.greeting = greeting;
                return this;
            }

            /**
             * VoiceId.
             */
            public Builder voiceId(String voiceId) {
                this.voiceId = voiceId;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
}
