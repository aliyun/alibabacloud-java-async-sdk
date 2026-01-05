// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

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
 * {@link UpdateProvisionedProductRequest} extends {@link RequestModel}
 *
 * <p>UpdateProvisionedProductRequest</p>
 */
public class UpdateProvisionedProductRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.List<Parameters> parameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PortfolioId")
    private String portfolioId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductVersionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productVersionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProvisionedProductId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String provisionedProductId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    private UpdateProvisionedProductRequest(Builder builder) {
        super(builder);
        this.parameters = builder.parameters;
        this.portfolioId = builder.portfolioId;
        this.productId = builder.productId;
        this.productVersionId = builder.productVersionId;
        this.provisionedProductId = builder.provisionedProductId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProvisionedProductRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return parameters
     */
    public java.util.List<Parameters> getParameters() {
        return this.parameters;
    }

    /**
     * @return portfolioId
     */
    public String getPortfolioId() {
        return this.portfolioId;
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return productVersionId
     */
    public String getProductVersionId() {
        return this.productVersionId;
    }

    /**
     * @return provisionedProductId
     */
    public String getProvisionedProductId() {
        return this.provisionedProductId;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<UpdateProvisionedProductRequest, Builder> {
        private java.util.List<Parameters> parameters; 
        private String portfolioId; 
        private String productId; 
        private String productVersionId; 
        private String provisionedProductId; 
        private java.util.List<Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProvisionedProductRequest request) {
            super(request);
            this.parameters = request.parameters;
            this.portfolioId = request.portfolioId;
            this.productId = request.productId;
            this.productVersionId = request.productVersionId;
            this.provisionedProductId = request.provisionedProductId;
            this.tags = request.tags;
        } 

        /**
         * <p>The input parameters of the template.</p>
         * <p>You can specify up to 200 parameters.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is optional. If you specify the Parameters parameter, you must specify the ParameterKey and ParameterValue parameters.</li>
         * <li>If the values of the ProductVersionId and Parameters parameters are not changed, you are not allowed to update the information about the product instance.</li>
         * </ul>
         * </blockquote>
         */
        public Builder parameters(java.util.List<Parameters> parameters) {
            this.putBodyParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The ID of the product portfolio.</p>
         * <blockquote>
         * <p>The PortfolioId parameter is not required if the default launch option exists. The PortfolioId parameter is required if the default launch option does not exist. For more information about how to obtain the value of the PortfolioId parameter, see <a href="~~ListLaunchOptions~~">ListLaunchOptions</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>port-bp1yt7582g****</p>
         */
        public Builder portfolioId(String portfolioId) {
            this.putBodyParameter("PortfolioId", portfolioId);
            this.portfolioId = portfolioId;
            return this;
        }

        /**
         * <p>The ID of the product.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>prod-bp18r7q127****</p>
         */
        public Builder productId(String productId) {
            this.putBodyParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * <p>The ID of the product version.</p>
         * <blockquote>
         * <p>If the values of the ProductVersionId and Parameters parameters are not changed, the information about the product instance cannot be updated.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pv-bp15e79d26****</p>
         */
        public Builder productVersionId(String productVersionId) {
            this.putBodyParameter("ProductVersionId", productVersionId);
            this.productVersionId = productVersionId;
            return this;
        }

        /**
         * <p>The ID of the product instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pp-bp1ddg1n2a****</p>
         */
        public Builder provisionedProductId(String provisionedProductId) {
            this.putBodyParameter("ProvisionedProductId", provisionedProductId);
            this.provisionedProductId = provisionedProductId;
            return this;
        }

        /**
         * <p>The input custom tags.</p>
         * <p>Maximum value of N: 20.</p>
         * <blockquote>
         * <ul>
         * <li>The Tags parameter is optional. If you need to specify the Tags parameter, you must specify the Tags.N.Key and Tags.N.Value parameters.</li>
         * <li>The tag is propagated to each stack resource that supports the tag feature.</li>
         * </ul>
         * </blockquote>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putBodyParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public UpdateProvisionedProductRequest build() {
            return new UpdateProvisionedProductRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateProvisionedProductRequest} extends {@link TeaModel}
     *
     * <p>UpdateProvisionedProductRequest</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParameterKey")
        private String parameterKey;

        @com.aliyun.core.annotation.NameInMap("ParameterValue")
        private String parameterValue;

        private Parameters(Builder builder) {
            this.parameterKey = builder.parameterKey;
            this.parameterValue = builder.parameterValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return parameterKey
         */
        public String getParameterKey() {
            return this.parameterKey;
        }

        /**
         * @return parameterValue
         */
        public String getParameterValue() {
            return this.parameterValue;
        }

        public static final class Builder {
            private String parameterKey; 
            private String parameterValue; 

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.parameterKey = model.parameterKey;
                this.parameterValue = model.parameterValue;
            } 

            /**
             * <p>The name of the input parameter for the template.</p>
             * 
             * <strong>example:</strong>
             * <p>instance_type</p>
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * <p>The value of the input parameter for the template.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.s6-c1m1.small</p>
             */
            public Builder parameterValue(String parameterValue) {
                this.parameterValue = parameterValue;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateProvisionedProductRequest} extends {@link TeaModel}
     *
     * <p>UpdateProvisionedProductRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the custom tag.</p>
             * <p>The tag key must be 1 to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the custom tag.</p>
             * <p>The tag value can be up to 128 characters in length and cannot start with <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
