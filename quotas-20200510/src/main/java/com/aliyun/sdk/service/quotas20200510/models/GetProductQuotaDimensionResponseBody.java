// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

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
 * {@link GetProductQuotaDimensionResponseBody} extends {@link TeaModel}
 *
 * <p>GetProductQuotaDimensionResponseBody</p>
 */
public class GetProductQuotaDimensionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("QuotaDimension")
    private QuotaDimension quotaDimension;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetProductQuotaDimensionResponseBody(Builder builder) {
        this.quotaDimension = builder.quotaDimension;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProductQuotaDimensionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return quotaDimension
     */
    public QuotaDimension getQuotaDimension() {
        return this.quotaDimension;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private QuotaDimension quotaDimension; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetProductQuotaDimensionResponseBody model) {
            this.quotaDimension = model.quotaDimension;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the quota dimension.</p>
         */
        public Builder quotaDimension(QuotaDimension quotaDimension) {
            this.quotaDimension = quotaDimension;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1FA5F0E2-368E-4BA4-A8D0-6060FC6BB8F3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetProductQuotaDimensionResponseBody build() {
            return new GetProductQuotaDimensionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetProductQuotaDimensionResponseBody} extends {@link TeaModel}
     *
     * <p>GetProductQuotaDimensionResponseBody</p>
     */
    public static class DimensionValueDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private DimensionValueDetail(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DimensionValueDetail create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(DimensionValueDetail model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The name of the quota dimension value.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-b</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the quota dimension.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-b</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DimensionValueDetail build() {
                return new DimensionValueDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProductQuotaDimensionResponseBody} extends {@link TeaModel}
     *
     * <p>GetProductQuotaDimensionResponseBody</p>
     */
    public static class QuotaDimension extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DependentDimensions")
        private java.util.List<String> dependentDimensions;

        @com.aliyun.core.annotation.NameInMap("DimensionKey")
        private String dimensionKey;

        @com.aliyun.core.annotation.NameInMap("DimensionValueDetail")
        private java.util.List<DimensionValueDetail> dimensionValueDetail;

        @com.aliyun.core.annotation.NameInMap("DimensionValues")
        private java.util.List<String> dimensionValues;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private QuotaDimension(Builder builder) {
            this.dependentDimensions = builder.dependentDimensions;
            this.dimensionKey = builder.dimensionKey;
            this.dimensionValueDetail = builder.dimensionValueDetail;
            this.dimensionValues = builder.dimensionValues;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuotaDimension create() {
            return builder().build();
        }

        /**
         * @return dependentDimensions
         */
        public java.util.List<String> getDependentDimensions() {
            return this.dependentDimensions;
        }

        /**
         * @return dimensionKey
         */
        public String getDimensionKey() {
            return this.dimensionKey;
        }

        /**
         * @return dimensionValueDetail
         */
        public java.util.List<DimensionValueDetail> getDimensionValueDetail() {
            return this.dimensionValueDetail;
        }

        /**
         * @return dimensionValues
         */
        public java.util.List<String> getDimensionValues() {
            return this.dimensionValues;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<String> dependentDimensions; 
            private String dimensionKey; 
            private java.util.List<DimensionValueDetail> dimensionValueDetail; 
            private java.util.List<String> dimensionValues; 
            private String name; 

            private Builder() {
            } 

            private Builder(QuotaDimension model) {
                this.dependentDimensions = model.dependentDimensions;
                this.dimensionKey = model.dimensionKey;
                this.dimensionValueDetail = model.dimensionValueDetail;
                this.dimensionValues = model.dimensionValues;
                this.name = model.name;
            } 

            /**
             * <p>The quota dimensions of the cloud service on which the target quota depends.</p>
             */
            public Builder dependentDimensions(java.util.List<String> dependentDimensions) {
                this.dependentDimensions = dependentDimensions;
                return this;
            }

            /**
             * <p>The key of the quota dimension. Valid values:</p>
             * <ul>
             * <li><p>regionId: region</p>
             * </li>
             * <li><p>zoneId: zone</p>
             * </li>
             * <li><p>chargeType: billing method</p>
             * </li>
             * <li><p>networkType: network type</p>
             * </li>
             * <li><p>resourceType: resource type</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>zoneId</p>
             */
            public Builder dimensionKey(String dimensionKey) {
                this.dimensionKey = dimensionKey;
                return this;
            }

            /**
             * <p>The details of the quota dimension value.</p>
             */
            public Builder dimensionValueDetail(java.util.List<DimensionValueDetail> dimensionValueDetail) {
                this.dimensionValueDetail = dimensionValueDetail;
                return this;
            }

            /**
             * <p>The list of quota dimension values.</p>
             */
            public Builder dimensionValues(java.util.List<String> dimensionValues) {
                this.dimensionValues = dimensionValues;
                return this;
            }

            /**
             * <p>The name of the quota dimension.</p>
             * 
             * <strong>example:</strong>
             * <p>Zone</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public QuotaDimension build() {
                return new QuotaDimension(this);
            } 

        } 

    }
}
