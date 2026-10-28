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
 * {@link GetProductQuotaRequest} extends {@link RequestModel}
 *
 * <p>GetProductQuotaRequest</p>
 */
public class GetProductQuotaRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Dimensions")
    private java.util.List<Dimensions> dimensions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QuotaActionCode")
    @com.aliyun.core.annotation.Validation(required = true)
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

    public static final class Builder extends Request.Builder<GetProductQuotaRequest, Builder> {
        private java.util.List<Dimensions> dimensions; 
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
         * <p>The quota dimensions.
         * The properties of the quota item. The combination of dimensions and QuotaActionCode determines a unique quota item.</p>
         * <blockquote>
         * <p>Dimensions are required for some cloud services. You can call the <a href="~~ListProductQuotaDimensions~~">ListProductQuotaDimensions</a> operation to query the quota dimensions of a cloud service and check whether a dimension is required. The Requisite response parameter indicates whether the dimension is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;regionId\&quot;:\&quot;cn-beijing\&quot;}</p>
         */
        public Builder dimensions(java.util.List<Dimensions> dimensions) {
            this.putBodyParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * <p>The abbreviated name of the cloud service.</p>
         * <blockquote>
         * <p>For more information about how to obtain the abbreviated name of a cloud service, see the ProductCode parameter in <a href="https://help.aliyun.com/document_detail/440555.html">ListProducts</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The quota ID.</p>
         * <blockquote>
         * <p>For more information about how to obtain the quota ID of a specified cloud service, see the QuotaActionCode parameter in <a href="https://help.aliyun.com/document_detail/440554.html">ListProductQuotas</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>q_security-groups</p>
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

    /**
     * 
     * {@link GetProductQuotaRequest} extends {@link TeaModel}
     *
     * <p>GetProductQuotaRequest</p>
     */
    public static class Dimensions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Dimensions model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the quota dimension.</p>
             * <blockquote>
             * <p>You must specify both Dimensions.N.Key and Dimensions.N.Value. The value range of N depends on the number of dimensions supported by the cloud service. You can call the <a href="~~ListProductQuotaDimensions~~">ListProductQuotaDimensions</a> operation to query the quota dimensions supported by the cloud service. The length of the returned array is the maximum value of N.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>regionId</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the quota dimension.</p>
             * <blockquote>
             * <p>You must specify both Dimensions.N.Key and Dimensions.N.Value. The value range of N depends on the number of dimensions supported by the cloud service. You can call the <a href="~~ListProductQuotaDimensions~~">ListProductQuotaDimensions</a> operation to query the quota dimensions supported by the cloud service. The length of the returned array is the maximum value of N.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
