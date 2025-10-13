// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetConsumerResponseBody} extends {@link TeaModel}
 *
 * <p>GetConsumerResponseBody</p>
 */
public class GetConsumerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetConsumerResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConsumerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetConsumerResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>880C61B3-7B90-5570-A3F7-D6D92C0E2D36</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetConsumerResponseBody build() {
            return new GetConsumerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetConsumerResponseBody} extends {@link TeaModel}
     *
     * <p>GetConsumerResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("akSkIdentityConfigs")
        private AkSkIdentityConfig akSkIdentityConfigs;

        @com.aliyun.core.annotation.NameInMap("apiKeyIdentityConfig")
        private ApiKeyIdentityConfig apiKeyIdentityConfig;

        @com.aliyun.core.annotation.NameInMap("consumerId")
        private String consumerId;

        @com.aliyun.core.annotation.NameInMap("createTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("deployStatus")
        private String deployStatus;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("jwtIdentityConfig")
        private JwtIdentityConfig jwtIdentityConfig;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("updateTimestamp")
        private Long updateTimestamp;

        private Data(Builder builder) {
            this.akSkIdentityConfigs = builder.akSkIdentityConfigs;
            this.apiKeyIdentityConfig = builder.apiKeyIdentityConfig;
            this.consumerId = builder.consumerId;
            this.createTimestamp = builder.createTimestamp;
            this.deployStatus = builder.deployStatus;
            this.description = builder.description;
            this.enable = builder.enable;
            this.jwtIdentityConfig = builder.jwtIdentityConfig;
            this.name = builder.name;
            this.updateTimestamp = builder.updateTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return akSkIdentityConfigs
         */
        public AkSkIdentityConfig getAkSkIdentityConfigs() {
            return this.akSkIdentityConfigs;
        }

        /**
         * @return apiKeyIdentityConfig
         */
        public ApiKeyIdentityConfig getApiKeyIdentityConfig() {
            return this.apiKeyIdentityConfig;
        }

        /**
         * @return consumerId
         */
        public String getConsumerId() {
            return this.consumerId;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return deployStatus
         */
        public String getDeployStatus() {
            return this.deployStatus;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return jwtIdentityConfig
         */
        public JwtIdentityConfig getJwtIdentityConfig() {
            return this.jwtIdentityConfig;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return updateTimestamp
         */
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public static final class Builder {
            private AkSkIdentityConfig akSkIdentityConfigs; 
            private ApiKeyIdentityConfig apiKeyIdentityConfig; 
            private String consumerId; 
            private Long createTimestamp; 
            private String deployStatus; 
            private String description; 
            private Boolean enable; 
            private JwtIdentityConfig jwtIdentityConfig; 
            private String name; 
            private Long updateTimestamp; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.akSkIdentityConfigs = model.akSkIdentityConfigs;
                this.apiKeyIdentityConfig = model.apiKeyIdentityConfig;
                this.consumerId = model.consumerId;
                this.createTimestamp = model.createTimestamp;
                this.deployStatus = model.deployStatus;
                this.description = model.description;
                this.enable = model.enable;
                this.jwtIdentityConfig = model.jwtIdentityConfig;
                this.name = model.name;
                this.updateTimestamp = model.updateTimestamp;
            } 

            /**
             * akSkIdentityConfigs.
             */
            public Builder akSkIdentityConfigs(AkSkIdentityConfig akSkIdentityConfigs) {
                this.akSkIdentityConfigs = akSkIdentityConfigs;
                return this;
            }

            /**
             * apiKeyIdentityConfig.
             */
            public Builder apiKeyIdentityConfig(ApiKeyIdentityConfig apiKeyIdentityConfig) {
                this.apiKeyIdentityConfig = apiKeyIdentityConfig;
                return this;
            }

            /**
             * consumerId.
             */
            public Builder consumerId(String consumerId) {
                this.consumerId = consumerId;
                return this;
            }

            /**
             * createTimestamp.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * deployStatus.
             */
            public Builder deployStatus(String deployStatus) {
                this.deployStatus = deployStatus;
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
             * enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * jwtIdentityConfig.
             */
            public Builder jwtIdentityConfig(JwtIdentityConfig jwtIdentityConfig) {
                this.jwtIdentityConfig = jwtIdentityConfig;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * updateTimestamp.
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
