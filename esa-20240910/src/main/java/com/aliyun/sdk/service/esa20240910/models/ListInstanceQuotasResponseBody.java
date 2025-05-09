// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListInstanceQuotasResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceQuotasResponseBody</p>
 */
public class ListInstanceQuotasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("Quotas")
    private java.util.List<Quotas> quotas;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Quotas> getQuotas() {
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
        private java.util.List<Quotas> quotas; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(ListInstanceQuotasResponseBody model) {
            this.instanceId = model.instanceId;
            this.quotas = model.quotas;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>The plan ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-xcdn-96wblslz****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The quotas in the plan.</p>
         */
        public Builder quotas(java.util.List<Quotas> quotas) {
            this.quotas = quotas;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247B78</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The plan status. Valid values:</p>
         * <ul>
         * <li>online: The plan is in service.</li>
         * <li>offline: The plan has expired within an allowable period. In this state, the plan is unavailable.</li>
         * <li>disable: The plan is released.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
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

            private Builder() {
            } 

            private Builder(Quotas model) {
                this.quotaName = model.quotaName;
                this.quotaValue = model.quotaValue;
                this.quotaValueType = model.quotaValueType;
            } 

            /**
             * <p>The quota name.</p>
             * 
             * <strong>example:</strong>
             * <p>customHttpCert</p>
             */
            public Builder quotaName(String quotaName) {
                this.quotaName = quotaName;
                return this;
            }

            /**
             * <p>The quota value.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder quotaValue(String quotaValue) {
                this.quotaValue = quotaValue;
                return this;
            }

            /**
             * <p>The threshold type of the quota. Valid values:</p>
             * <ul>
             * <li>value: enumerates the values of the quota.</li>
             * <li>bool: specifies whether the quota is available.</li>
             * <li>num: the upper limit of the quota.</li>
             * <li>range: the value range for the quota.</li>
             * <li>custom: other types than the preceding four quota threshold types.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>bool</p>
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
