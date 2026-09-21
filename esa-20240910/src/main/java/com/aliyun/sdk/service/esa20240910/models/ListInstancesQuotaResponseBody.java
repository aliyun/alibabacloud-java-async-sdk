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
 * {@link ListInstancesQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancesQuotaResponseBody</p>
 */
public class ListInstancesQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("QuotaName")
    private String quotaName;

    @com.aliyun.core.annotation.NameInMap("QuotaValueType")
    private String quotaValueType;

    @com.aliyun.core.annotation.NameInMap("QuotaValues")
    private java.util.List<QuotaValues> quotaValues;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListInstancesQuotaResponseBody(Builder builder) {
        this.quotaName = builder.quotaName;
        this.quotaValueType = builder.quotaValueType;
        this.quotaValues = builder.quotaValues;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesQuotaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return quotaName
     */
    public String getQuotaName() {
        return this.quotaName;
    }

    /**
     * @return quotaValueType
     */
    public String getQuotaValueType() {
        return this.quotaValueType;
    }

    /**
     * @return quotaValues
     */
    public java.util.List<QuotaValues> getQuotaValues() {
        return this.quotaValues;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String quotaName; 
        private String quotaValueType; 
        private java.util.List<QuotaValues> quotaValues; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListInstancesQuotaResponseBody model) {
            this.quotaName = model.quotaName;
            this.quotaValueType = model.quotaValueType;
            this.quotaValues = model.quotaValues;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The quota name.</p>
         * 
         * <strong>example:</strong>
         * <p>siteCount</p>
         */
        public Builder quotaName(String quotaName) {
            this.quotaName = quotaName;
            return this;
        }

        /**
         * <p>The threshold type of the quota. Valid values:</p>
         * <ul>
         * <li><strong>value</strong>: Enumeration type. The enumeration range of quota values.</li>
         * <li><strong>bool</strong>: Boolean type. Indicates whether the quota is available.</li>
         * <li><strong>num</strong>: Numeric type. The upper limit of the quota usage.</li>
         * <li><strong>range</strong>: Range type. The value range of the quota.</li>
         * <li><strong>custom</strong>: Custom type. Other types beyond the four threshold types above.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>bool</p>
         */
        public Builder quotaValueType(String quotaValueType) {
            this.quotaValueType = quotaValueType;
            return this;
        }

        /**
         * <p>The list of quota values.</p>
         */
        public Builder quotaValues(java.util.List<QuotaValues> quotaValues) {
            this.quotaValues = quotaValues;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>156A6B-677B1A-4297B7-9187B7-2B44792</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInstancesQuotaResponseBody build() {
            return new ListInstancesQuotaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstancesQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesQuotaResponseBody</p>
     */
    public static class QuotaValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("QuotaValue")
        private String quotaValue;

        private QuotaValues(Builder builder) {
            this.instanceId = builder.instanceId;
            this.quotaValue = builder.quotaValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuotaValues create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return quotaValue
         */
        public String getQuotaValue() {
            return this.quotaValue;
        }

        public static final class Builder {
            private String instanceId; 
            private String quotaValue; 

            private Builder() {
            } 

            private Builder(QuotaValues model) {
                this.instanceId = model.instanceId;
                this.quotaValue = model.quotaValue;
            } 

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>esa-site-blea5hv7m0ow</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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

            public QuotaValues build() {
                return new QuotaValues(this);
            } 

        } 

    }
}
