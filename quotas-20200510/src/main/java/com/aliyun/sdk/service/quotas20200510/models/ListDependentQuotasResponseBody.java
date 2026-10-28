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
 * {@link ListDependentQuotasResponseBody} extends {@link TeaModel}
 *
 * <p>ListDependentQuotasResponseBody</p>
 */
public class ListDependentQuotasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Quotas")
    private java.util.List<Quotas> quotas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDependentQuotasResponseBody(Builder builder) {
        this.quotas = builder.quotas;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDependentQuotasResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder {
        private java.util.List<Quotas> quotas; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListDependentQuotasResponseBody model) {
            this.quotas = model.quotas;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of quotas on which the target quota depends.</p>
         */
        public Builder quotas(java.util.List<Quotas> quotas) {
            this.quotas = quotas;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>920D8A47-26BB-49FA-A09F-F98D7DAA55F3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDependentQuotasResponseBody build() {
            return new ListDependentQuotasResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDependentQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>ListDependentQuotasResponseBody</p>
     */
    public static class Dimensions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DependentDimension")
        private java.util.List<String> dependentDimension;

        @com.aliyun.core.annotation.NameInMap("DimensionKey")
        private String dimensionKey;

        @com.aliyun.core.annotation.NameInMap("DimensionValues")
        private java.util.List<String> dimensionValues;

        private Dimensions(Builder builder) {
            this.dependentDimension = builder.dependentDimension;
            this.dimensionKey = builder.dimensionKey;
            this.dimensionValues = builder.dimensionValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dimensions create() {
            return builder().build();
        }

        /**
         * @return dependentDimension
         */
        public java.util.List<String> getDependentDimension() {
            return this.dependentDimension;
        }

        /**
         * @return dimensionKey
         */
        public String getDimensionKey() {
            return this.dimensionKey;
        }

        /**
         * @return dimensionValues
         */
        public java.util.List<String> getDimensionValues() {
            return this.dimensionValues;
        }

        public static final class Builder {
            private java.util.List<String> dependentDimension; 
            private String dimensionKey; 
            private java.util.List<String> dimensionValues; 

            private Builder() {
            } 

            private Builder(Dimensions model) {
                this.dependentDimension = model.dependentDimension;
                this.dimensionKey = model.dimensionKey;
                this.dimensionValues = model.dimensionValues;
            } 

            /**
             * <p>The quota dimension on which the dependent dimension of the target quota depends.</p>
             */
            public Builder dependentDimension(java.util.List<String> dependentDimension) {
                this.dependentDimension = dependentDimension;
                return this;
            }

            /**
             * <p>The key of the quota dimension on which the target quota depends.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder dimensionKey(String dimensionKey) {
                this.dimensionKey = dimensionKey;
                return this;
            }

            /**
             * <p>The value of the quota dimension on which the dependent dimension of the target quota depends.</p>
             */
            public Builder dimensionValues(java.util.List<String> dimensionValues) {
                this.dimensionValues = dimensionValues;
                return this;
            }

            public Dimensions build() {
                return new Dimensions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDependentQuotasResponseBody} extends {@link TeaModel}
     *
     * <p>ListDependentQuotasResponseBody</p>
     */
    public static class Quotas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dimensions")
        private java.util.List<Dimensions> dimensions;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("QuotaActionCode")
        private String quotaActionCode;

        @com.aliyun.core.annotation.NameInMap("Scale")
        private Float scale;

        private Quotas(Builder builder) {
            this.dimensions = builder.dimensions;
            this.productCode = builder.productCode;
            this.quotaActionCode = builder.quotaActionCode;
            this.scale = builder.scale;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quotas create() {
            return builder().build();
        }

        /**
         * @return dimensions
         */
        public java.util.List<Dimensions> getDimensions() {
            return this.dimensions;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return quotaActionCode
         */
        public String getQuotaActionCode() {
            return this.quotaActionCode;
        }

        /**
         * @return scale
         */
        public Float getScale() {
            return this.scale;
        }

        public static final class Builder {
            private java.util.List<Dimensions> dimensions; 
            private String productCode; 
            private String quotaActionCode; 
            private Float scale; 

            private Builder() {
            } 

            private Builder(Quotas model) {
                this.dimensions = model.dimensions;
                this.productCode = model.productCode;
                this.quotaActionCode = model.quotaActionCode;
                this.scale = model.scale;
            } 

            /**
             * <p>The quota dimensions on which the target quota depends.</p>
             */
            public Builder dimensions(java.util.List<Dimensions> dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * <p>The abbreviated name of the cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>ram</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The ID of the quota on which the target quota depends.</p>
             * 
             * <strong>example:</strong>
             * <p>q_laxtn4</p>
             */
            public Builder quotaActionCode(String quotaActionCode) {
                this.quotaActionCode = quotaActionCode;
                return this;
            }

            /**
             * <p>The ratio between the target quota and the dependent quota.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder scale(Float scale) {
                this.scale = scale;
                return this;
            }

            public Quotas build() {
                return new Quotas(this);
            } 

        } 

    }
}
