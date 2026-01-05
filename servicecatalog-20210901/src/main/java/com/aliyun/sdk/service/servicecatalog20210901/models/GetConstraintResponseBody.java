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
 * {@link GetConstraintResponseBody} extends {@link TeaModel}
 *
 * <p>GetConstraintResponseBody</p>
 */
public class GetConstraintResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConstraintDetail")
    private ConstraintDetail constraintDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetConstraintResponseBody model) {
            this.constraintDetail = model.constraintDetail;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the constraint.</p>
         */
        public Builder constraintDetail(ConstraintDetail constraintDetail) {
            this.constraintDetail = constraintDetail;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0FEEF92D-4052-5202-87D0-3D8EC16F81BF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetConstraintResponseBody build() {
            return new GetConstraintResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetConstraintResponseBody} extends {@link TeaModel}
     *
     * <p>GetConstraintResponseBody</p>
     */
    public static class ConstraintDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("ConstraintId")
        private String constraintId;

        @com.aliyun.core.annotation.NameInMap("ConstraintType")
        private String constraintType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("PortfolioId")
        private String portfolioId;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("ProductName")
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

            private Builder() {
            } 

            private Builder(ConstraintDetail model) {
                this.config = model.config;
                this.constraintId = model.constraintId;
                this.constraintType = model.constraintType;
                this.createTime = model.createTime;
                this.description = model.description;
                this.portfolioId = model.portfolioId;
                this.productId = model.productId;
                this.productName = model.productName;
            } 

            /**
             * <p>The configuration of the constraint.</p>
             * <p>Format: { &quot;LocalRoleName&quot;: &quot;&lt;role_name&gt;&quot; }.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;LocalRoleName&quot;: &quot;TestRole&quot; }</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The ID of the constraint.</p>
             * 
             * <strong>example:</strong>
             * <p>cons-bp1yx7x42v****</p>
             */
            public Builder constraintId(String constraintId) {
                this.constraintId = constraintId;
                return this;
            }

            /**
             * <p>The type of the constraint.</p>
             * <p>The value is fixed as Launch, which indicates the launch constraint.</p>
             * 
             * <strong>example:</strong>
             * <p>Launch</p>
             */
            public Builder constraintType(String constraintType) {
                this.constraintType = constraintType;
                return this;
            }

            /**
             * <p>The time when the constraint was created.</p>
             * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-12T06:11:26Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the constraint.</p>
             * 
             * <strong>example:</strong>
             * <p>Launch as local role TestRole</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the product portfolio to which the constraint belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>port-bp1yt7582g****</p>
             */
            public Builder portfolioId(String portfolioId) {
                this.portfolioId = portfolioId;
                return this;
            }

            /**
             * <p>The ID of the product for which the constraint is created.</p>
             * 
             * <strong>example:</strong>
             * <p>prod-bp18r7q127****</p>
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * <p>The name of the product.</p>
             * 
             * <strong>example:</strong>
             * <p>DEMO-Create an ECS instance.</p>
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
