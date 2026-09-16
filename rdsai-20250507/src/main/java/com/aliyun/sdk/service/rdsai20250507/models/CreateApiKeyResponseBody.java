// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link CreateApiKeyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateApiKeyResponseBody</p>
 */
public class CreateApiKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateApiKeyResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApiKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateApiKeyResponseBody model) {
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The request result.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateApiKeyResponseBody build() {
            return new CreateApiKeyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateApiKeyResponseBody} extends {@link TeaModel}
     *
     * <p>CreateApiKeyResponseBody</p>
     */
    public static class CustomKeyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("DailyTokenQuota")
        private Long dailyTokenQuota;

        @com.aliyun.core.annotation.NameInMap("KeyName")
        private String keyName;

        @com.aliyun.core.annotation.NameInMap("LimitRate")
        private Float limitRate;

        @com.aliyun.core.annotation.NameInMap("LimitType")
        private String limitType;

        @com.aliyun.core.annotation.NameInMap("RoleArn")
        private String roleArn;

        @com.aliyun.core.annotation.NameInMap("TokenQuota")
        private Long tokenQuota;

        private CustomKeyList(Builder builder) {
            this.apiKey = builder.apiKey;
            this.dailyTokenQuota = builder.dailyTokenQuota;
            this.keyName = builder.keyName;
            this.limitRate = builder.limitRate;
            this.limitType = builder.limitType;
            this.roleArn = builder.roleArn;
            this.tokenQuota = builder.tokenQuota;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomKeyList create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return dailyTokenQuota
         */
        public Long getDailyTokenQuota() {
            return this.dailyTokenQuota;
        }

        /**
         * @return keyName
         */
        public String getKeyName() {
            return this.keyName;
        }

        /**
         * @return limitRate
         */
        public Float getLimitRate() {
            return this.limitRate;
        }

        /**
         * @return limitType
         */
        public String getLimitType() {
            return this.limitType;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        /**
         * @return tokenQuota
         */
        public Long getTokenQuota() {
            return this.tokenQuota;
        }

        public static final class Builder {
            private String apiKey; 
            private Long dailyTokenQuota; 
            private String keyName; 
            private Float limitRate; 
            private String limitType; 
            private String roleArn; 
            private Long tokenQuota; 

            private Builder() {
            } 

            private Builder(CustomKeyList model) {
                this.apiKey = model.apiKey;
                this.dailyTokenQuota = model.dailyTokenQuota;
                this.keyName = model.keyName;
                this.limitRate = model.limitRate;
                this.limitType = model.limitType;
                this.roleArn = model.roleArn;
                this.tokenQuota = model.tokenQuota;
            } 

            /**
             * <p>Api Key</p>
             * 
             * <strong>example:</strong>
             * <p>sk-rds-*****</p>
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * <p>The daily quota of the API key.</p>
             */
            public Builder dailyTokenQuota(Long dailyTokenQuota) {
                this.dailyTokenQuota = dailyTokenQuota;
                return this;
            }

            /**
             * <p>The API key name.</p>
             * 
             * <strong>example:</strong>
             * <p>api-*****</p>
             */
            public Builder keyName(String keyName) {
                this.keyName = keyName;
                return this;
            }

            /**
             * <p>The quota percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder limitRate(Float limitRate) {
                this.limitRate = limitRate;
                return this;
            }

            /**
             * <p>The quota allocation method. Valid values:</p>
             * <ul>
             * <li><p><strong>fixed</strong>: By fixed value.</p>
             * </li>
             * <li><p><strong>ratio</strong>: By percentage.</p>
             * </li>
             * <li><p><strong>auto</strong>: Automatic allocation.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>fixed</p>
             */
            public Builder limitType(String limitType) {
                this.limitType = limitType;
                return this;
            }

            /**
             * RoleArn.
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * <p>The quota limit for the current key.</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
             */
            public Builder tokenQuota(Long tokenQuota) {
                this.tokenQuota = tokenQuota;
                return this;
            }

            public CustomKeyList build() {
                return new CustomKeyList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateApiKeyResponseBody} extends {@link TeaModel}
     *
     * <p>CreateApiKeyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaseUrl")
        private String baseUrl;

        @com.aliyun.core.annotation.NameInMap("CustomKeyList")
        private java.util.List<CustomKeyList> customKeyList;

        @com.aliyun.core.annotation.NameInMap("SystemApiKey")
        private String systemApiKey;

        private Data(Builder builder) {
            this.baseUrl = builder.baseUrl;
            this.customKeyList = builder.customKeyList;
            this.systemApiKey = builder.systemApiKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return baseUrl
         */
        public String getBaseUrl() {
            return this.baseUrl;
        }

        /**
         * @return customKeyList
         */
        public java.util.List<CustomKeyList> getCustomKeyList() {
            return this.customKeyList;
        }

        /**
         * @return systemApiKey
         */
        public String getSystemApiKey() {
            return this.systemApiKey;
        }

        public static final class Builder {
            private String baseUrl; 
            private java.util.List<CustomKeyList> customKeyList; 
            private String systemApiKey; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.baseUrl = model.baseUrl;
                this.customKeyList = model.customKeyList;
                this.systemApiKey = model.systemApiKey;
            } 

            /**
             * <p>The URL for model invocation.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxx.yy/v1">http://xxx.yy/v1</a></p>
             */
            public Builder baseUrl(String baseUrl) {
                this.baseUrl = baseUrl;
                return this;
            }

            /**
             * <p>The list of custom API keys.</p>
             */
            public Builder customKeyList(java.util.List<CustomKeyList> customKeyList) {
                this.customKeyList = customKeyList;
                return this;
            }

            /**
             * <p>The system-generated key.</p>
             * 
             * <strong>example:</strong>
             * <p>sk-rds-xxx</p>
             */
            public Builder systemApiKey(String systemApiKey) {
                this.systemApiKey = systemApiKey;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
