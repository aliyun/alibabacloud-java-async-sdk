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
 * {@link SubmitAIAgentVideoAuditTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitAIAgentVideoAuditTaskRequest</p>
 */
public class SubmitAIAgentVideoAuditTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AIAgentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String AIAgentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditInterval")
    private Integer auditInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackConfig")
    private CallbackConfig callbackConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CapturePolicies")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<CapturePolicies> capturePolicies;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Input")
    @com.aliyun.core.annotation.Validation(required = true)
    private Input input;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitAIAgentVideoAuditTaskRequest(Builder builder) {
        super(builder);
        this.AIAgentId = builder.AIAgentId;
        this.auditInterval = builder.auditInterval;
        this.callbackConfig = builder.callbackConfig;
        this.capturePolicies = builder.capturePolicies;
        this.input = builder.input;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAIAgentVideoAuditTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIAgentId
     */
    public String getAIAgentId() {
        return this.AIAgentId;
    }

    /**
     * @return auditInterval
     */
    public Integer getAuditInterval() {
        return this.auditInterval;
    }

    /**
     * @return callbackConfig
     */
    public CallbackConfig getCallbackConfig() {
        return this.callbackConfig;
    }

    /**
     * @return capturePolicies
     */
    public java.util.List<CapturePolicies> getCapturePolicies() {
        return this.capturePolicies;
    }

    /**
     * @return input
     */
    public Input getInput() {
        return this.input;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitAIAgentVideoAuditTaskRequest, Builder> {
        private String AIAgentId; 
        private Integer auditInterval; 
        private CallbackConfig callbackConfig; 
        private java.util.List<CapturePolicies> capturePolicies; 
        private Input input; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitAIAgentVideoAuditTaskRequest request) {
            super(request);
            this.AIAgentId = request.AIAgentId;
            this.auditInterval = request.auditInterval;
            this.callbackConfig = request.callbackConfig;
            this.capturePolicies = request.capturePolicies;
            this.input = request.input;
            this.userData = request.userData;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>*<strong><strong><strong>3b3d94abda22</strong></strong></strong></p>
         */
        public Builder AIAgentId(String AIAgentId) {
            this.putQueryParameter("AIAgentId", AIAgentId);
            this.AIAgentId = AIAgentId;
            return this;
        }

        /**
         * AuditInterval.
         */
        public Builder auditInterval(Integer auditInterval) {
            this.putQueryParameter("AuditInterval", auditInterval);
            this.auditInterval = auditInterval;
            return this;
        }

        /**
         * CallbackConfig.
         */
        public Builder callbackConfig(CallbackConfig callbackConfig) {
            String callbackConfigShrink = shrink(callbackConfig, "CallbackConfig", "json");
            this.putQueryParameter("CallbackConfig", callbackConfigShrink);
            this.callbackConfig = callbackConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder capturePolicies(java.util.List<CapturePolicies> capturePolicies) {
            String capturePoliciesShrink = shrink(capturePolicies, "CapturePolicies", "json");
            this.putQueryParameter("CapturePolicies", capturePoliciesShrink);
            this.capturePolicies = capturePolicies;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder input(Input input) {
            String inputShrink = shrink(input, "Input", "json");
            this.putQueryParameter("Input", inputShrink);
            this.input = input;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitAIAgentVideoAuditTaskRequest build() {
            return new SubmitAIAgentVideoAuditTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitAIAgentVideoAuditTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitAIAgentVideoAuditTaskRequest</p>
     */
    public static class CallbackConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Token")
        private String token;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private CallbackConfig(Builder builder) {
            this.token = builder.token;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallbackConfig create() {
            return builder().build();
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String token; 
            private String url; 

            private Builder() {
            } 

            private Builder(CallbackConfig model) {
                this.token = model.token;
                this.url = model.url;
            } 

            /**
             * Token.
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public CallbackConfig build() {
                return new CallbackConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitAIAgentVideoAuditTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitAIAgentVideoAuditTaskRequest</p>
     */
    public static class CapturePolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("FrameCount")
        private Integer frameCount;

        @com.aliyun.core.annotation.NameInMap("Prompt")
        private String prompt;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Integer startTime;

        private CapturePolicies(Builder builder) {
            this.duration = builder.duration;
            this.frameCount = builder.frameCount;
            this.prompt = builder.prompt;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CapturePolicies create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return frameCount
         */
        public Integer getFrameCount() {
            return this.frameCount;
        }

        /**
         * @return prompt
         */
        public String getPrompt() {
            return this.prompt;
        }

        /**
         * @return startTime
         */
        public Integer getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Integer duration; 
            private Integer frameCount; 
            private String prompt; 
            private Integer startTime; 

            private Builder() {
            } 

            private Builder(CapturePolicies model) {
                this.duration = model.duration;
                this.frameCount = model.frameCount;
                this.prompt = model.prompt;
                this.startTime = model.startTime;
            } 

            /**
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * FrameCount.
             */
            public Builder frameCount(Integer frameCount) {
                this.frameCount = frameCount;
                return this;
            }

            /**
             * Prompt.
             */
            public Builder prompt(String prompt) {
                this.prompt = prompt;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Integer startTime) {
                this.startTime = startTime;
                return this;
            }

            public CapturePolicies build() {
                return new CapturePolicies(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitAIAgentVideoAuditTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitAIAgentVideoAuditTaskRequest</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Media")
        private String media;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Input(Builder builder) {
            this.media = builder.media;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return media
         */
        public String getMedia() {
            return this.media;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String media; 
            private String type; 

            private Builder() {
            } 

            private Builder(Input model) {
                this.media = model.media;
                this.type = model.type;
            } 

            /**
             * Media.
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
}
