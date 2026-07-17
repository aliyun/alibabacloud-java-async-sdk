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
         * QuotaName.
         */
        public Builder quotaName(String quotaName) {
            this.quotaName = quotaName;
            return this;
        }

        /**
         * QuotaValueType.
         */
        public Builder quotaValueType(String quotaValueType) {
            this.quotaValueType = quotaValueType;
            return this;
        }

        /**
         * QuotaValues.
         */
        public Builder quotaValues(java.util.List<QuotaValues> quotaValues) {
            this.quotaValues = quotaValues;
            return this;
        }

        /**
         * RequestId.
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
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * QuotaValue.
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
