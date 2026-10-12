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
 * {@link GetGatewayResourceQuotaUsageResponseBody} extends {@link TeaModel}
 *
 * <p>GetGatewayResourceQuotaUsageResponseBody</p>
 */
public class GetGatewayResourceQuotaUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetGatewayResourceQuotaUsageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGatewayResourceQuotaUsageResponseBody create() {
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

        private Builder(GetGatewayResourceQuotaUsageResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The quota query result.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;gatewayId&quot;:&quot;gw-d5be0s9q5z6f1234567g&quot;,&quot;observedAt&quot;:&quot;2026-09-17T08:00:00Z&quot;,&quot;items&quot;:[{&quot;quotaKey&quot;:&quot;Route&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:12,&quot;limit&quot;:800},{&quot;quotaKey&quot;:&quot;ConsumerAuthorizationRule&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:20,&quot;limit&quot;:1000},{&quot;quotaKey&quot;:&quot;McpServer&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:false},{&quot;quotaKey&quot;:&quot;Domain&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:2,&quot;limit&quot;:100},{&quot;quotaKey&quot;:&quot;Service&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:5,&quot;limit&quot;:800},{&quot;quotaKey&quot;:&quot;ConsumerQuotaRule&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:0,&quot;limit&quot;:1000},{&quot;quotaKey&quot;:&quot;K8sServiceSource&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:1,&quot;limit&quot;:3},{&quot;quotaKey&quot;:&quot;InstalledPlugin&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:2,&quot;limit&quot;:5},{&quot;quotaKey&quot;:&quot;CustomPlugin&quot;,&quot;usedScope&quot;:&quot;ACCOUNT_REGION&quot;,&quot;limitScope&quot;:&quot;ACCOUNT_GATEWAY_TYPE&quot;,&quot;applicable&quot;:false}]}</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified gateway does not exist.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D0A6A1A0-8793-4C10-AB1A-2C03E770A912</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetGatewayResourceQuotaUsageResponseBody build() {
            return new GetGatewayResourceQuotaUsageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGatewayResourceQuotaUsageResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayResourceQuotaUsageResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("applicable")
        private Boolean applicable;

        @com.aliyun.core.annotation.NameInMap("limit")
        private Long limit;

        @com.aliyun.core.annotation.NameInMap("limitScope")
        private String limitScope;

        @com.aliyun.core.annotation.NameInMap("quotaKey")
        private String quotaKey;

        @com.aliyun.core.annotation.NameInMap("used")
        private Long used;

        @com.aliyun.core.annotation.NameInMap("usedScope")
        private String usedScope;

        private Items(Builder builder) {
            this.applicable = builder.applicable;
            this.limit = builder.limit;
            this.limitScope = builder.limitScope;
            this.quotaKey = builder.quotaKey;
            this.used = builder.used;
            this.usedScope = builder.usedScope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return applicable
         */
        public Boolean getApplicable() {
            return this.applicable;
        }

        /**
         * @return limit
         */
        public Long getLimit() {
            return this.limit;
        }

        /**
         * @return limitScope
         */
        public String getLimitScope() {
            return this.limitScope;
        }

        /**
         * @return quotaKey
         */
        public String getQuotaKey() {
            return this.quotaKey;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        /**
         * @return usedScope
         */
        public String getUsedScope() {
            return this.usedScope;
        }

        public static final class Builder {
            private Boolean applicable; 
            private Long limit; 
            private String limitScope; 
            private String quotaKey; 
            private Long used; 
            private String usedScope; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.applicable = model.applicable;
                this.limit = model.limit;
                this.limitScope = model.limitScope;
                this.quotaKey = model.quotaKey;
                this.used = model.used;
                this.usedScope = model.usedScope;
            } 

            /**
             * <p>Indicates whether quota numerical values are provided.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder applicable(Boolean applicable) {
                this.applicable = applicable;
                return this;
            }

            /**
             * <p>The effective limit.</p>
             * 
             * <strong>example:</strong>
             * <p>800</p>
             */
            public Builder limit(Long limit) {
                this.limit = limit;
                return this;
            }

            /**
             * <p>The scope to which the limit applies.</p>
             * 
             * <strong>example:</strong>
             * <p>GATEWAY</p>
             */
            public Builder limitScope(String limitScope) {
                this.limitScope = limitScope;
                return this;
            }

            /**
             * <p>The quota metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Route</p>
             */
            public Builder quotaKey(String quotaKey) {
                this.quotaKey = quotaKey;
                return this;
            }

            /**
             * <p>The current usage.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            /**
             * <p>The scope for usage statistics.</p>
             * 
             * <strong>example:</strong>
             * <p>GATEWAY</p>
             */
            public Builder usedScope(String usedScope) {
                this.usedScope = usedScope;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGatewayResourceQuotaUsageResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayResourceQuotaUsageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("observedAt")
        private String observedAt;

        private Data(Builder builder) {
            this.gatewayId = builder.gatewayId;
            this.items = builder.items;
            this.observedAt = builder.observedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return observedAt
         */
        public String getObservedAt() {
            return this.observedAt;
        }

        public static final class Builder {
            private String gatewayId; 
            private java.util.List<Items> items; 
            private String observedAt; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.gatewayId = model.gatewayId;
                this.items = model.items;
                this.observedAt = model.observedAt;
            } 

            /**
             * <p>The gateway ID.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-d5be0s9q5z6f1234567g</p>
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The resource quota items.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;quotaKey&quot;:&quot;Route&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:12,&quot;limit&quot;:800},{&quot;quotaKey&quot;:&quot;ConsumerAuthorizationRule&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:20,&quot;limit&quot;:1000},{&quot;quotaKey&quot;:&quot;McpServer&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:false},{&quot;quotaKey&quot;:&quot;Domain&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:2,&quot;limit&quot;:100},{&quot;quotaKey&quot;:&quot;Service&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:5,&quot;limit&quot;:800},{&quot;quotaKey&quot;:&quot;ConsumerQuotaRule&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:0,&quot;limit&quot;:1000},{&quot;quotaKey&quot;:&quot;K8sServiceSource&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:1,&quot;limit&quot;:3},{&quot;quotaKey&quot;:&quot;InstalledPlugin&quot;,&quot;usedScope&quot;:&quot;GATEWAY&quot;,&quot;limitScope&quot;:&quot;GATEWAY&quot;,&quot;applicable&quot;:true,&quot;used&quot;:2,&quot;limit&quot;:5},{&quot;quotaKey&quot;:&quot;CustomPlugin&quot;,&quot;usedScope&quot;:&quot;ACCOUNT_REGION&quot;,&quot;limitScope&quot;:&quot;ACCOUNT_GATEWAY_TYPE&quot;,&quot;applicable&quot;:false}]</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The time when the statistics collection was completed.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-17T08:00:00Z</p>
             */
            public Builder observedAt(String observedAt) {
                this.observedAt = observedAt;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
