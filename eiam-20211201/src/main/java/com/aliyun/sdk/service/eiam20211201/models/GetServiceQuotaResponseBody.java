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
 * {@link GetServiceQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceQuotaResponseBody</p>
 */
public class GetServiceQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceQuota")
    private ServiceQuota serviceQuota;

    private GetServiceQuotaResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serviceQuota = builder.serviceQuota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceQuotaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceQuota
     */
    public ServiceQuota getServiceQuota() {
        return this.serviceQuota;
    }

    public static final class Builder {
        private String requestId; 
        private ServiceQuota serviceQuota; 

        private Builder() {
        } 

        private Builder(GetServiceQuotaResponseBody model) {
            this.requestId = model.requestId;
            this.serviceQuota = model.serviceQuota;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServiceQuota.
         */
        public Builder serviceQuota(ServiceQuota serviceQuota) {
            this.serviceQuota = serviceQuota;
            return this;
        }

        public GetServiceQuotaResponseBody build() {
            return new GetServiceQuotaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceQuotaResponseBody</p>
     */
    public static class ServiceQuota extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QuotaType")
        private String quotaType;

        @com.aliyun.core.annotation.NameInMap("QuotaValue")
        private Long quotaValue;

        @com.aliyun.core.annotation.NameInMap("UsedQuotaValue")
        private Long usedQuotaValue;

        private ServiceQuota(Builder builder) {
            this.quotaType = builder.quotaType;
            this.quotaValue = builder.quotaValue;
            this.usedQuotaValue = builder.usedQuotaValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceQuota create() {
            return builder().build();
        }

        /**
         * @return quotaType
         */
        public String getQuotaType() {
            return this.quotaType;
        }

        /**
         * @return quotaValue
         */
        public Long getQuotaValue() {
            return this.quotaValue;
        }

        /**
         * @return usedQuotaValue
         */
        public Long getUsedQuotaValue() {
            return this.usedQuotaValue;
        }

        public static final class Builder {
            private String quotaType; 
            private Long quotaValue; 
            private Long usedQuotaValue; 

            private Builder() {
            } 

            private Builder(ServiceQuota model) {
                this.quotaType = model.quotaType;
                this.quotaValue = model.quotaValue;
                this.usedQuotaValue = model.usedQuotaValue;
            } 

            /**
             * <p>Quota 配额的唯一标识。</p>
             * 
             * <strong>example:</strong>
             * <p>instanceTrialNumber</p>
             */
            public Builder quotaType(String quotaType) {
                this.quotaType = quotaType;
                return this;
            }

            /**
             * <p>Quota 配额的值。</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder quotaValue(Long quotaValue) {
                this.quotaValue = quotaValue;
                return this;
            }

            /**
             * <p>Quota 配额的当前用量。</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder usedQuotaValue(Long usedQuotaValue) {
                this.usedQuotaValue = usedQuotaValue;
                return this;
            }

            public ServiceQuota build() {
                return new ServiceQuota(this);
            } 

        } 

    }
}
