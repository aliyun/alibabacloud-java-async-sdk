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
 * {@link UpdateApiKeyQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateApiKeyQuotaResponseBody</p>
 */
public class UpdateApiKeyQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private UpdateApiKeyQuotaResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApiKeyQuotaResponseBody create() {
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

        private Builder(UpdateApiKeyQuotaResponseBody model) {
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateApiKeyQuotaResponseBody build() {
            return new UpdateApiKeyQuotaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateApiKeyQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateApiKeyQuotaResponseBody</p>
     */
    public static class CustomKeyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("DailyTokenQuota")
        private Long dailyTokenQuota;

        @com.aliyun.core.annotation.NameInMap("LimitRate")
        private Float limitRate;

        @com.aliyun.core.annotation.NameInMap("LimitType")
        private String limitType;

        @com.aliyun.core.annotation.NameInMap("TokenQuota")
        private Long tokenQuota;

        private CustomKeyList(Builder builder) {
            this.apiKey = builder.apiKey;
            this.dailyTokenQuota = builder.dailyTokenQuota;
            this.limitRate = builder.limitRate;
            this.limitType = builder.limitType;
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
         * @return tokenQuota
         */
        public Long getTokenQuota() {
            return this.tokenQuota;
        }

        public static final class Builder {
            private String apiKey; 
            private Long dailyTokenQuota; 
            private Float limitRate; 
            private String limitType; 
            private Long tokenQuota; 

            private Builder() {
            } 

            private Builder(CustomKeyList model) {
                this.apiKey = model.apiKey;
                this.dailyTokenQuota = model.dailyTokenQuota;
                this.limitRate = model.limitRate;
                this.limitType = model.limitType;
                this.tokenQuota = model.tokenQuota;
            } 

            /**
             * <p>The API key.</p>
             * 
             * <strong>example:</strong>
             * <p>sk-rds-xxx</p>
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * DailyTokenQuota.
             */
            public Builder dailyTokenQuota(Long dailyTokenQuota) {
                this.dailyTokenQuota = dailyTokenQuota;
                return this;
            }

            /**
             * <p>The limit rate.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder limitRate(Float limitRate) {
                this.limitRate = limitRate;
                return this;
            }

            /**
             * <p>The quota limiting method. Valid values:</p>
             * <ul>
             * <li><p><code>ratio</code>: Sets the limit based on a ratio.</p>
             * </li>
             * <li><p><code>fixed</code>: Sets the limit to a fixed value.</p>
             * </li>
             * <li><p><code>auto</code>: Allocates the limit automatically.</p>
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
             * <p>The token quota for the API key.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
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
     * {@link UpdateApiKeyQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateApiKeyQuotaResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomKeyList")
        private java.util.List<CustomKeyList> customKeyList;

        private Data(Builder builder) {
            this.customKeyList = builder.customKeyList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return customKeyList
         */
        public java.util.List<CustomKeyList> getCustomKeyList() {
            return this.customKeyList;
        }

        public static final class Builder {
            private java.util.List<CustomKeyList> customKeyList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.customKeyList = model.customKeyList;
            } 

            /**
             * <p>The list of custom API keys.</p>
             */
            public Builder customKeyList(java.util.List<CustomKeyList> customKeyList) {
                this.customKeyList = customKeyList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
