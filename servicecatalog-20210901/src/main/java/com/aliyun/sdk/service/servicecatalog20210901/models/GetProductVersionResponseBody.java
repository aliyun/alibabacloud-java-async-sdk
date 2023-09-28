// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProductVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetProductVersionResponseBody</p>
 */
public class GetProductVersionResponseBody extends TeaModel {
    @NameInMap("ProductVersionDetail")
    private ProductVersionDetail productVersionDetail;

    @NameInMap("RequestId")
    private String requestId;

    private GetProductVersionResponseBody(Builder builder) {
        this.productVersionDetail = builder.productVersionDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProductVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return productVersionDetail
     */
    public ProductVersionDetail getProductVersionDetail() {
        return this.productVersionDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ProductVersionDetail productVersionDetail; 
        private String requestId; 

        /**
         * ProductVersionDetail.
         */
        public Builder productVersionDetail(ProductVersionDetail productVersionDetail) {
            this.productVersionDetail = productVersionDetail;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetProductVersionResponseBody build() {
            return new GetProductVersionResponseBody(this);
        } 

    } 

    public static class ProductVersionDetail extends TeaModel {
        @NameInMap("Active")
        private Boolean active;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Guidance")
        private String guidance;

        @NameInMap("ProductId")
        private String productId;

        @NameInMap("ProductVersionId")
        private String productVersionId;

        @NameInMap("ProductVersionName")
        private String productVersionName;

        @NameInMap("TemplateType")
        private String templateType;

        @NameInMap("TemplateUrl")
        private String templateUrl;

        private ProductVersionDetail(Builder builder) {
            this.active = builder.active;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.guidance = builder.guidance;
            this.productId = builder.productId;
            this.productVersionId = builder.productVersionId;
            this.productVersionName = builder.productVersionName;
            this.templateType = builder.templateType;
            this.templateUrl = builder.templateUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductVersionDetail create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Boolean getActive() {
            return this.active;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return guidance
         */
        public String getGuidance() {
            return this.guidance;
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
         * @return productVersionName
         */
        public String getProductVersionName() {
            return this.productVersionName;
        }

        /**
         * @return templateType
         */
        public String getTemplateType() {
            return this.templateType;
        }

        /**
         * @return templateUrl
         */
        public String getTemplateUrl() {
            return this.templateUrl;
        }

        public static final class Builder {
            private Boolean active; 
            private String createTime; 
            private String description; 
            private String guidance; 
            private String productId; 
            private String productVersionId; 
            private String productVersionName; 
            private String templateType; 
            private String templateUrl; 

            /**
             * Active.
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Guidance.
             */
            public Builder guidance(String guidance) {
                this.guidance = guidance;
                return this;
            }

            /**
             * ProductId.
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * ProductVersionId.
             */
            public Builder productVersionId(String productVersionId) {
                this.productVersionId = productVersionId;
                return this;
            }

            /**
             * ProductVersionName.
             */
            public Builder productVersionName(String productVersionName) {
                this.productVersionName = productVersionName;
                return this;
            }

            /**
             * TemplateType.
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * TemplateUrl.
             */
            public Builder templateUrl(String templateUrl) {
                this.templateUrl = templateUrl;
                return this;
            }

            public ProductVersionDetail build() {
                return new ProductVersionDetail(this);
            } 

        } 

    }
}
