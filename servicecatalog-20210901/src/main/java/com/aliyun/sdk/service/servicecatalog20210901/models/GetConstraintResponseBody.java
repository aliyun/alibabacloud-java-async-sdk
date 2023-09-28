// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConstraintResponseBody} extends {@link TeaModel}
 *
 * <p>GetConstraintResponseBody</p>
 */
public class GetConstraintResponseBody extends TeaModel {
    @NameInMap("ConstraintDetail")
    private ConstraintDetail constraintDetail;

    @NameInMap("RequestId")
    private String requestId;

    private GetConstraintResponseBody(Builder builder) {
        this.constraintDetail = builder.constraintDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConstraintResponseBody create() {
        return builder().build();
    }

    /**
     * @return constraintDetail
     */
    public ConstraintDetail getConstraintDetail() {
        return this.constraintDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ConstraintDetail constraintDetail; 
        private String requestId; 

        /**
         * The details of the constraint.
         */
        public Builder constraintDetail(ConstraintDetail constraintDetail) {
            this.constraintDetail = constraintDetail;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetConstraintResponseBody build() {
            return new GetConstraintResponseBody(this);
        } 

    } 

    public static class ConstraintDetail extends TeaModel {
        @NameInMap("Config")
        private String config;

        @NameInMap("ConstraintId")
        private String constraintId;

        @NameInMap("ConstraintType")
        private String constraintType;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("PortfolioId")
        private String portfolioId;

        @NameInMap("ProductId")
        private String productId;

        @NameInMap("ProductName")
        private String productName;

        private ConstraintDetail(Builder builder) {
            this.config = builder.config;
            this.constraintId = builder.constraintId;
            this.constraintType = builder.constraintType;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.portfolioId = builder.portfolioId;
            this.productId = builder.productId;
            this.productName = builder.productName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConstraintDetail create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return constraintId
         */
        public String getConstraintId() {
            return this.constraintId;
        }

        /**
         * @return constraintType
         */
        public String getConstraintType() {
            return this.constraintType;
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
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        public static final class Builder {
            private String config; 
            private String constraintId; 
            private String constraintType; 
            private String createTime; 
            private String description; 
            private String portfolioId; 
            private String productId; 
            private String productName; 

            /**
             * The configuration of the constraint.
             * <p>
             * 
             * Format: { "LocalRoleName": "\<role_name>" }.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * The ID of the constraint.
             */
            public Builder constraintId(String constraintId) {
                this.constraintId = constraintId;
                return this;
            }

            /**
             * The type of the constraint.
             * <p>
             * 
             * The value is fixed as Launch, which indicates the launch constraint.
             */
            public Builder constraintType(String constraintType) {
                this.constraintType = constraintType;
                return this;
            }

            /**
             * The time when the constraint was created.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the constraint.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the product portfolio to which the constraint belongs.
             */
            public Builder portfolioId(String portfolioId) {
                this.portfolioId = portfolioId;
                return this;
            }

            /**
             * The ID of the product for which the constraint is created.
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * The name of the product.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            public ConstraintDetail build() {
                return new ConstraintDetail(this);
            } 

        } 

    }
}
