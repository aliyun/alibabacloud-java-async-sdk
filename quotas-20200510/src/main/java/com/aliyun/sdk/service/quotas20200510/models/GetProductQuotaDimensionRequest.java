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
 * {@link GetProductQuotaDimensionRequest} extends {@link RequestModel}
 *
 * <p>GetProductQuotaDimensionRequest</p>
 */
public class GetProductQuotaDimensionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DependentDimensions")
    private java.util.List<DependentDimensions> dependentDimensions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DimensionKey")
    private String dimensionKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    private GetProductQuotaDimensionRequest(Builder builder) {
        super(builder);
        this.dependentDimensions = builder.dependentDimensions;
        this.dimensionKey = builder.dimensionKey;
        this.productCode = builder.productCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProductQuotaDimensionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dependentDimensions
     */
    public java.util.List<DependentDimensions> getDependentDimensions() {
        return this.dependentDimensions;
    }

    /**
     * @return dimensionKey
     */
    public String getDimensionKey() {
        return this.dimensionKey;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    public static final class Builder extends Request.Builder<GetProductQuotaDimensionRequest, Builder> {
        private java.util.List<DependentDimensions> dependentDimensions; 
        private String dimensionKey; 
        private String productCode; 

        private Builder() {
            super();
        } 

        private Builder(GetProductQuotaDimensionRequest request) {
            super(request);
            this.dependentDimensions = request.dependentDimensions;
            this.dimensionKey = request.dimensionKey;
            this.productCode = request.productCode;
        } 

        /**
         * <p>The quota dimensions on which the target quota dimension depends.</p>
         */
        public Builder dependentDimensions(java.util.List<DependentDimensions> dependentDimensions) {
            this.putBodyParameter("DependentDimensions", dependentDimensions);
            this.dependentDimensions = dependentDimensions;
            return this;
        }

        /**
         * <p>The key of the target quota dimension.</p>
         * <blockquote>
         * <p>If the target quota dimension has dependent quota dimensions, you must specify the keys and values of the dependent quota dimensions at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>zoneId</p>
         */
        public Builder dimensionKey(String dimensionKey) {
            this.putBodyParameter("DimensionKey", dimensionKey);
            this.dimensionKey = dimensionKey;
            return this;
        }

        /**
         * <p>The abbreviation of the cloud service.</p>
         * <blockquote>
         * <p>For more information about how to obtain the abbreviation of a cloud service, see the ProductCode parameter in <a href="https://help.aliyun.com/document_detail/440555.html">ListProducts</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>disk</p>
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        @Override
        public GetProductQuotaDimensionRequest build() {
            return new GetProductQuotaDimensionRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetProductQuotaDimensionRequest} extends {@link TeaModel}
     *
     * <p>GetProductQuotaDimensionRequest</p>
     */
    public static class DependentDimensions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private DependentDimensions(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DependentDimensions create() {
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

            private Builder(DependentDimensions model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the quota dimension on which the target quota dimension depends.</p>
             * <blockquote>
             * <ul>
             * <li>The value of N depends on the number of quota dimensions on which the target quota dimension depends.</li>
             * <li>You must specify the key and value of a dependent quota dimension at the same time.</li>
             * </ul>
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
             * <p>The value of the quota dimension on which the target quota dimension depends.</p>
             * <blockquote>
             * <ul>
             * <li>The value of N depends on the number of quota dimensions on which the target quota dimension depends.</li>
             * <li>You must specify the key and value of a dependent quota dimension at the same time.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DependentDimensions build() {
                return new DependentDimensions(this);
            } 

        } 

    }
}
