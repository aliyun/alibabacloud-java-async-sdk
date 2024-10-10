// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListInstanceQuotasResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceQuotasResponseBody</p>
 */
public class ListInstanceQuotasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("Quotas")
    private java.util.List < Quotas> quotas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListInstanceQuotasResponseBody(Builder builder) {
        this.instanceId = builder.instanceId;
        this.quotas = builder.quotas;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceQuotasResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return quotas
     */
    public java.util.List < Quotas> getQuotas() {
        return this.quotas;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String instanceId; 
        private java.util.List < Quotas> quotas; 
        private String requestId; 
        private String status; 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Quotas.
         */
        public Builder quotas(java.util.List < Quotas> quotas) {
            this.quotas = quotas;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247B78</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public ListInstanceQuotasResponseBody build() {
            return new ListInstanceQuotasResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstanceQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceQuotasResponseBody</p>
     */
    public static class Quotas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QuotaName")
        private String quotaName;

        @com.aliyun.core.annotation.NameInMap("QuotaValue")
        private String quotaValue;

        @com.aliyun.core.annotation.NameInMap("QuotaValueType")
        private String quotaValueType;

        private Quotas(Builder builder) {
            this.quotaName = builder.quotaName;
            this.quotaValue = builder.quotaValue;
            this.quotaValueType = builder.quotaValueType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quotas create() {
            return builder().build();
        }

        /**
         * @return quotaName
         */
        public String getQuotaName() {
            return this.quotaName;
        }

        /**
         * @return quotaValue
         */
        public String getQuotaValue() {
            return this.quotaValue;
        }

        /**
         * @return quotaValueType
         */
        public String getQuotaValueType() {
            return this.quotaValueType;
        }

        public static final class Builder {
            private String quotaName; 
            private String quotaValue; 
            private String quotaValueType; 

            /**
             * QuotaName.
             */
            public Builder quotaName(String quotaName) {
                this.quotaName = quotaName;
                return this;
            }

            /**
             * QuotaValue.
             */
            public Builder quotaValue(String quotaValue) {
                this.quotaValue = quotaValue;
                return this;
            }

            /**
             * QuotaValueType.
             */
            public Builder quotaValueType(String quotaValueType) {
                this.quotaValueType = quotaValueType;
                return this;
            }

            public Quotas build() {
                return new Quotas(this);
            } 

        } 

    }
}
