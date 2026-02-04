// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GetInstanceQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceQuotaResponseBody</p>
 */
public class GetInstanceQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Quota")
    private Quota quota;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetInstanceQuotaResponseBody(Builder builder) {
        this.quota = builder.quota;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceQuotaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return quota
     */
    public Quota getQuota() {
        return this.quota;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Quota quota; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetInstanceQuotaResponseBody model) {
            this.quota = model.quota;
            this.requestId = model.requestId;
        } 

        /**
         * Quota.
         */
        public Builder quota(Quota quota) {
            this.quota = quota;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceQuotaResponseBody build() {
            return new GetInstanceQuotaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceQuotaResponseBody</p>
     */
    public static class Quota extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QuotaKey")
        private String quotaKey;

        @com.aliyun.core.annotation.NameInMap("QuotaValue")
        private Integer quotaValue;

        private Quota(Builder builder) {
            this.quotaKey = builder.quotaKey;
            this.quotaValue = builder.quotaValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quota create() {
            return builder().build();
        }

        /**
         * @return quotaKey
         */
        public String getQuotaKey() {
            return this.quotaKey;
        }

        /**
         * @return quotaValue
         */
        public Integer getQuotaValue() {
            return this.quotaValue;
        }

        public static final class Builder {
            private String quotaKey; 
            private Integer quotaValue; 

            private Builder() {
            } 

            private Builder(Quota model) {
                this.quotaKey = model.quotaKey;
                this.quotaValue = model.quotaValue;
            } 

            /**
             * <p>Quota 配额的Key，同请求参数</p>
             * 
             * <strong>example:</strong>
             * <p>userMaxNumber</p>
             */
            public Builder quotaKey(String quotaKey) {
                this.quotaKey = quotaKey;
                return this;
            }

            /**
             * <p>Quota 配额的值。</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder quotaValue(Integer quotaValue) {
                this.quotaValue = quotaValue;
                return this;
            }

            public Quota build() {
                return new Quota(this);
            } 

        } 

    }
}
