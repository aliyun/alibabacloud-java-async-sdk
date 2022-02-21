// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProductQuotaDimensionResponseBody} extends {@link TeaModel}
 *
 * <p>GetProductQuotaDimensionResponseBody</p>
 */
public class GetProductQuotaDimensionResponseBody extends TeaModel {
    @NameInMap("QuotaDimension")
    private QuotaDimension quotaDimension;

    @NameInMap("RequestId")
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

        /**
         * QuotaDimension.
         */
        public Builder quotaDimension(QuotaDimension quotaDimension) {
            this.quotaDimension = quotaDimension;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetProductQuotaDimensionResponseBody build() {
            return new GetProductQuotaDimensionResponseBody(this);
        } 

    } 

    public static class DimensionValueDetail extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
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

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
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
    public static class QuotaDimension extends TeaModel {
        @NameInMap("DependentDimensions")
        private java.util.List < String > dependentDimensions;

        @NameInMap("DimensionKey")
        private String dimensionKey;

        @NameInMap("DimensionValueDetail")
        private java.util.List < DimensionValueDetail> dimensionValueDetail;

        @NameInMap("DimensionValues")
        private java.util.List < String > dimensionValues;

        @NameInMap("Name")
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
        public java.util.List < String > getDependentDimensions() {
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
        public java.util.List < DimensionValueDetail> getDimensionValueDetail() {
            return this.dimensionValueDetail;
        }

        /**
         * @return dimensionValues
         */
        public java.util.List < String > getDimensionValues() {
            return this.dimensionValues;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List < String > dependentDimensions; 
            private String dimensionKey; 
            private java.util.List < DimensionValueDetail> dimensionValueDetail; 
            private java.util.List < String > dimensionValues; 
            private String name; 

            /**
             * DependentDimensions.
             */
            public Builder dependentDimensions(java.util.List < String > dependentDimensions) {
                this.dependentDimensions = dependentDimensions;
                return this;
            }

            /**
             * DimensionKey.
             */
            public Builder dimensionKey(String dimensionKey) {
                this.dimensionKey = dimensionKey;
                return this;
            }

            /**
             * DimensionValueDetail.
             */
            public Builder dimensionValueDetail(java.util.List < DimensionValueDetail> dimensionValueDetail) {
                this.dimensionValueDetail = dimensionValueDetail;
                return this;
            }

            /**
             * DimensionValues.
             */
            public Builder dimensionValues(java.util.List < String > dimensionValues) {
                this.dimensionValues = dimensionValues;
                return this;
            }

            /**
             * Name.
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
