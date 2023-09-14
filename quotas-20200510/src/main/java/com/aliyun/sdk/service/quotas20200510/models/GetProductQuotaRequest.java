// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProductQuotaRequest} extends {@link RequestModel}
 *
 * <p>GetProductQuotaRequest</p>
 */
public class GetProductQuotaRequest extends Request {
    @Body
    @NameInMap("Dimensions")
    private java.util.List < Dimensions> dimensions;

    @Body
    @NameInMap("ProductCode")
    @Validation(required = true)
    private String productCode;

    @Body
    @NameInMap("QuotaActionCode")
    @Validation(required = true)
    private String quotaActionCode;

    private GetProductQuotaRequest(Builder builder) {
        super(builder);
        this.dimensions = builder.dimensions;
        this.productCode = builder.productCode;
        this.quotaActionCode = builder.quotaActionCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProductQuotaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<GetProductQuotaRequest, Builder> {
        private java.util.List < Dimensions> dimensions; 
        private String productCode; 
        private String quotaActionCode; 

        private Builder() {
            super();
        } 

        private Builder(GetProductQuotaRequest request) {
            super(request);
            this.dimensions = request.dimensions;
            this.productCode = request.productCode;
            this.quotaActionCode = request.quotaActionCode;
        } 

        /**
         * The quota dimensions.
         */
        public Builder dimensions(java.util.List < Dimensions> dimensions) {
            this.putBodyParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * The abbreviation of the Alibaba Cloud service name.
         * <p>
         * 
         * > For more information, see [Alibaba Cloud services that support Quota Center](~~182368~~).
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * The ID of the quota.
         */
        public Builder quotaActionCode(String quotaActionCode) {
            this.putBodyParameter("QuotaActionCode", quotaActionCode);
            this.quotaActionCode = quotaActionCode;
            return this;
        }

        @Override
        public GetProductQuotaRequest build() {
            return new GetProductQuotaRequest(this);
        } 

    } 

    public static class Dimensions extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Dimensions(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dimensions create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of the dimension.
             * <p>
             * 
             * > 
             * 
             * *   The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service.
             * 
             * *   If you call the operation to query the details of a quota that belongs to a cloud service that supports dimensions, you must configure this parameter. You must configure the `Dimensions.N.Key` and `Dimensions.N.Value` parameters at the same time. The following cloud services support dimensions: ECS whose service code is ecs, Enterprise Distributed Application Service (EDAS) whose service code is edas, ECS Quotas by Instance Type whose service code is ecs-spec, and Auto Scaling (ESS) whose service code is ess.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the dimension.
             * <p>
             * 
             * > 
             * 
             * *   The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service.
             * 
             * *   If you call the operation to query the details of a quota that belongs to a cloud service that supports dimensions, you must configure this parameter. You must configure the `Dimensions.N.Key` and `Dimensions.N.Value` parameters at the same time. The following cloud services support dimensions: ECS whose service code is ecs, EDAS whose service code is edas, ECS Quotas by Instance Type whose service code is ecs-spec, and ESS whose service code is ess.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Dimensions build() {
                return new Dimensions(this);
            } 

        } 

    }
}
