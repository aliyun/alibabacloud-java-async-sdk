// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link GetLivyComputeTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GetLivyComputeTokenResponseBody</p>
 */
public class GetLivyComputeTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetLivyComputeTokenResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLivyComputeTokenResponseBody create() {
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

        private Builder(GetLivyComputeTokenResponseBody model) {
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetLivyComputeTokenResponseBody build() {
            return new GetLivyComputeTokenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLivyComputeTokenResponseBody} extends {@link TeaModel}
     *
     * <p>GetLivyComputeTokenResponseBody</p>
     */
    public static class AutoExpireConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("expireDays")
        private Integer expireDays;

        private AutoExpireConfiguration(Builder builder) {
            this.enable = builder.enable;
            this.expireDays = builder.expireDays;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoExpireConfiguration create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return expireDays
         */
        public Integer getExpireDays() {
            return this.expireDays;
        }

        public static final class Builder {
            private Boolean enable; 
            private Integer expireDays; 

            private Builder() {
            } 

            private Builder(AutoExpireConfiguration model) {
                this.enable = model.enable;
                this.expireDays = model.expireDays;
            } 

            /**
             * enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * expireDays.
             */
            public Builder expireDays(Integer expireDays) {
                this.expireDays = expireDays;
                return this;
            }

            public AutoExpireConfiguration build() {
                return new AutoExpireConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLivyComputeTokenResponseBody} extends {@link TeaModel}
     *
     * <p>GetLivyComputeTokenResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("autoExpireConfiguration")
        private AutoExpireConfiguration autoExpireConfiguration;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("createdBy")
        private String createdBy;

        @com.aliyun.core.annotation.NameInMap("expireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("lastUsedTime")
        private Long lastUsedTime;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("token")
        private String token;

        @com.aliyun.core.annotation.NameInMap("tokenId")
        private String tokenId;

        private Data(Builder builder) {
            this.autoExpireConfiguration = builder.autoExpireConfiguration;
            this.createTime = builder.createTime;
            this.createdBy = builder.createdBy;
            this.expireTime = builder.expireTime;
            this.lastUsedTime = builder.lastUsedTime;
            this.name = builder.name;
            this.token = builder.token;
            this.tokenId = builder.tokenId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return autoExpireConfiguration
         */
        public AutoExpireConfiguration getAutoExpireConfiguration() {
            return this.autoExpireConfiguration;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createdBy
         */
        public String getCreatedBy() {
            return this.createdBy;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return lastUsedTime
         */
        public Long getLastUsedTime() {
            return this.lastUsedTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        /**
         * @return tokenId
         */
        public String getTokenId() {
            return this.tokenId;
        }

        public static final class Builder {
            private AutoExpireConfiguration autoExpireConfiguration; 
            private Long createTime; 
            private String createdBy; 
            private Long expireTime; 
            private Long lastUsedTime; 
            private String name; 
            private String token; 
            private String tokenId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.autoExpireConfiguration = model.autoExpireConfiguration;
                this.createTime = model.createTime;
                this.createdBy = model.createdBy;
                this.expireTime = model.expireTime;
                this.lastUsedTime = model.lastUsedTime;
                this.name = model.name;
                this.token = model.token;
                this.tokenId = model.tokenId;
            } 

            /**
             * autoExpireConfiguration.
             */
            public Builder autoExpireConfiguration(AutoExpireConfiguration autoExpireConfiguration) {
                this.autoExpireConfiguration = autoExpireConfiguration;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * createdBy.
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * expireTime.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * lastUsedTime.
             */
            public Builder lastUsedTime(Long lastUsedTime) {
                this.lastUsedTime = lastUsedTime;
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
             * token.
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            /**
             * <p>Token ID。</p>
             * 
             * <strong>example:</strong>
             * <p>lctk-xxxxxxxxxx</p>
             */
            public Builder tokenId(String tokenId) {
                this.tokenId = tokenId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
