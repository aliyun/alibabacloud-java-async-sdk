// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LaunchProductRequest} extends {@link RequestModel}
 *
 * <p>LaunchProductRequest</p>
 */
public class LaunchProductRequest extends Request {
    @Body
    @NameInMap("Parameters")
    private java.util.List < Parameters> parameters;

    @Body
    @NameInMap("PortfolioId")
    private String portfolioId;

    @Body
    @NameInMap("ProductId")
    @Validation(required = true)
    private String productId;

    @Body
    @NameInMap("ProductVersionId")
    @Validation(required = true)
    private String productVersionId;

    @Body
    @NameInMap("ProvisionedProductName")
    @Validation(required = true, maxLength = 100, minLength = 1)
    private String provisionedProductName;

    @Body
    @NameInMap("StackRegionId")
    @Validation(required = true)
    private String stackRegionId;

    @Body
    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    private LaunchProductRequest(Builder builder) {
        super(builder);
        this.parameters = builder.parameters;
        this.portfolioId = builder.portfolioId;
        this.productId = builder.productId;
        this.productVersionId = builder.productVersionId;
        this.provisionedProductName = builder.provisionedProductName;
        this.stackRegionId = builder.stackRegionId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LaunchProductRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return parameters
     */
    public java.util.List < Parameters> getParameters() {
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
     * @return provisionedProductName
     */
    public String getProvisionedProductName() {
        return this.provisionedProductName;
    }

    /**
     * @return stackRegionId
     */
    public String getStackRegionId() {
        return this.stackRegionId;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<LaunchProductRequest, Builder> {
        private java.util.List < Parameters> parameters; 
        private String portfolioId; 
        private String productId; 
        private String productVersionId; 
        private String provisionedProductName; 
        private String stackRegionId; 
        private java.util.List < Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(LaunchProductRequest request) {
            super(request);
            this.parameters = request.parameters;
            this.portfolioId = request.portfolioId;
            this.productId = request.productId;
            this.productVersionId = request.productVersionId;
            this.provisionedProductName = request.provisionedProductName;
            this.stackRegionId = request.stackRegionId;
            this.tags = request.tags;
        } 

        /**
         * The input parameters of the template.
         * <p>
         * 
         * You can specify up to 200 parameters.
         * 
         * > This parameter is optional. If you specify the Parameters parameter, you must specify the ParameterKey and ParameterValue parameters.
         */
        public Builder parameters(java.util.List < Parameters> parameters) {
            this.putBodyParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * The ID of the product portfolio.
         * <p>
         * 
         * > If the PortfolioId parameter is not required, you do not need to specify the PortfolioId parameter. If the PortfolioId parameter is required, you must specify the PortfolioId parameter. For more information about how to obtain the value of the PortfolioId parameter, see [ListLaunchOptions](~~ListLaunchOptions~~).
         */
        public Builder portfolioId(String portfolioId) {
            this.putBodyParameter("PortfolioId", portfolioId);
            this.portfolioId = portfolioId;
            return this;
        }

        /**
         * The ID of the product.
         */
        public Builder productId(String productId) {
            this.putBodyParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * The ID of the product version.
         */
        public Builder productVersionId(String productVersionId) {
            this.putBodyParameter("ProductVersionId", productVersionId);
            this.productVersionId = productVersionId;
            return this;
        }

        /**
         * The name of the product instance.
         * <p>
         * 
         * The value must be 1 to 128 characters in length.
         */
        public Builder provisionedProductName(String provisionedProductName) {
            this.putBodyParameter("ProvisionedProductName", provisionedProductName);
            this.provisionedProductName = provisionedProductName;
            return this;
        }

        /**
         * The ID of the region to which the Resource Orchestration Service (ROS) stack belongs.
         * <p>
         * 
         * For more information about how to obtain the regions that are supported by ROS, see [DescribeRegions](~~131035~~).
         */
        public Builder stackRegionId(String stackRegionId) {
            this.putBodyParameter("StackRegionId", stackRegionId);
            this.stackRegionId = stackRegionId;
            return this;
        }

        /**
         * The custom tags that are specified by the end user.
         * <p>
         * 
         * Maximum value of N: 20.
         * 
         * > 
         * 
         * *   The Tags parameter is optional. If you specify the Tags parameter, you must specify the Tags.N.Key and Tags.N.Value parameters.
         * 
         * *   The tag is propagated to each stack resource that supports the tag feature.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putBodyParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public LaunchProductRequest build() {
            return new LaunchProductRequest(this);
        } 

    } 

    public static class Parameters extends TeaModel {
        @NameInMap("ParameterKey")
        private String parameterKey;

        @NameInMap("ParameterValue")
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

            /**
             * The name of the input parameter for the template.
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * The value of the input parameter for the template.
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
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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

            /**
             * The tag key of the custom tag.
             * <p>
             * 
             * The tag key must be 1 to 128 characters in length and cannot contain `http://` or `https://`. It cannot start with `acs:` or `aliyun`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the custom tag.
             * <p>
             * 
             * The tag value can be up to 128 characters in length and cannot start with `acs:`. It cannot contain `http://` or `https://`.
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
