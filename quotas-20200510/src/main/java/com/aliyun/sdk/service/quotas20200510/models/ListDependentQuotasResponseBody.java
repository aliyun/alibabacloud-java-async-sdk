// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDependentQuotasResponseBody} extends {@link TeaModel}
 *
 * <p>ListDependentQuotasResponseBody</p>
 */
public class ListDependentQuotasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Quotas")
    private java.util.List < Quotas> quotas;

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

    public static final class Builder {
        private java.util.List < Quotas> quotas; 
        private String requestId; 

        /**
         * The quotas on which the specified quota depends.
         */
        public Builder quotas(java.util.List < Quotas> quotas) {
            this.quotas = quotas;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDependentQuotasResponseBody build() {
            return new ListDependentQuotasResponseBody(this);
        } 

    } 

    public static class Dimensions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DependentDimension")
        private java.util.List < String > dependentDimension;

        @com.aliyun.core.annotation.NameInMap("DimensionKey")
        private String dimensionKey;

        @com.aliyun.core.annotation.NameInMap("DimensionValues")
        private java.util.List < String > dimensionValues;

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
        public java.util.List < String > getDependentDimension() {
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
        public java.util.List < String > getDimensionValues() {
            return this.dimensionValues;
        }

        public static final class Builder {
            private java.util.List < String > dependentDimension; 
            private String dimensionKey; 
            private java.util.List < String > dimensionValues; 

            /**
             * The dimensions of the quotas on which the specified quota depends.
             */
            public Builder dependentDimension(java.util.List < String > dependentDimension) {
                this.dependentDimension = dependentDimension;
                return this;
            }

            /**
             * The key of the quota dimension.
             */
            public Builder dimensionKey(String dimensionKey) {
                this.dimensionKey = dimensionKey;
                return this;
            }

            /**
             * The dimension values.
             */
            public Builder dimensionValues(java.util.List < String > dimensionValues) {
                this.dimensionValues = dimensionValues;
                return this;
            }

            public Dimensions build() {
                return new Dimensions(this);
            } 

        } 

    }
    public static class Quotas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dimensions")
        private java.util.List < Dimensions> dimensions;

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
        public java.util.List < Dimensions> getDimensions() {
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
            private java.util.List < Dimensions> dimensions; 
            private String productCode; 
            private String quotaActionCode; 
            private Float scale; 

            /**
             * The dimensions of the quotas on which the specified quota depends.
             */
            public Builder dimensions(java.util.List < Dimensions> dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * The abbreviation of the Alibaba Cloud service name.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * The quota ID.
             */
            public Builder quotaActionCode(String quotaActionCode) {
                this.quotaActionCode = quotaActionCode;
                return this;
            }

            /**
             * The relationship percentage between the specified quota and the quotas on which the specified quota depends.
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
