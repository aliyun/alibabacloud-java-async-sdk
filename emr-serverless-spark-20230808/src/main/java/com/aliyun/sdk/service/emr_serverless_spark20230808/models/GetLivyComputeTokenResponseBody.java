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
         * <p>The response code. A value of 1000000 indicates that the request was successful. Other values indicate that the request failed. For more information about the error, see the message parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>484D9DDA-300D-525E-AF7A-0CCCA5C64A7A</p>
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
             * <p>Specifies whether the token automatically expires.</p>
             * <ul>
             * <li><p>true: Yes.</p>
             * </li>
             * <li><p>false: No.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The expiration period, in days.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
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
             * <p>The information about token expiration.</p>
             */
            public Builder autoExpireConfiguration(AutoExpireConfiguration autoExpireConfiguration) {
                this.autoExpireConfiguration = autoExpireConfiguration;
                return this;
            }

            /**
             * <p>The time when the token was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1749456094000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The name of the user who created the token.</p>
             * 
             * <strong>example:</strong>
             * <p>alice</p>
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * <p>The time when the token expires.</p>
             * 
             * <strong>example:</strong>
             * <p>1749457994000</p>
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The time when the token was last used.</p>
             * 
             * <strong>example:</strong>
             * <p>1749456098000</p>
             */
            public Builder lastUsedTime(Long lastUsedTime) {
                this.lastUsedTime = lastUsedTime;
                return this;
            }

            /**
             * <p>The name of the token.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The content of the token.</p>
             * 
             * <strong>example:</strong>
             * <p>d25561157a635bb</p>
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            /**
             * <p>The ID of the token.</p>
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
