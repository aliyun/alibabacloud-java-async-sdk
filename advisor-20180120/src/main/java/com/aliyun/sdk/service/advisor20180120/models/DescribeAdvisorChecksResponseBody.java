// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120.models;

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
 * {@link DescribeAdvisorChecksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAdvisorChecksResponseBody</p>
 */
public class DescribeAdvisorChecksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAdvisorChecksResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAdvisorChecksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAdvisorChecksResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAdvisorChecksResponseBody build() {
            return new DescribeAdvisorChecksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAdvisorChecksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAdvisorChecksResponseBody</p>
     */
    public static class AdvisorCheck extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OperateColumn")
        private String operateColumn;

        @com.aliyun.core.annotation.NameInMap("Product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tips")
        private String tips;

        @com.aliyun.core.annotation.NameInMap("ViewColumn")
        private String viewColumn;

        private AdvisorCheck(Builder builder) {
            this.category = builder.category;
            this.code = builder.code;
            this.description = builder.description;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.name = builder.name;
            this.operateColumn = builder.operateColumn;
            this.product = builder.product;
            this.status = builder.status;
            this.tips = builder.tips;
            this.viewColumn = builder.viewColumn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvisorCheck create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return operateColumn
         */
        public String getOperateColumn() {
            return this.operateColumn;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tips
         */
        public String getTips() {
            return this.tips;
        }

        /**
         * @return viewColumn
         */
        public String getViewColumn() {
            return this.viewColumn;
        }

        public static final class Builder {
            private String category; 
            private String code; 
            private String description; 
            private String gmtCreated; 
            private String gmtModified; 
            private String name; 
            private String operateColumn; 
            private String product; 
            private String status; 
            private String tips; 
            private String viewColumn; 

            private Builder() {
            } 

            private Builder(AdvisorCheck model) {
                this.category = model.category;
                this.code = model.code;
                this.description = model.description;
                this.gmtCreated = model.gmtCreated;
                this.gmtModified = model.gmtModified;
                this.name = model.name;
                this.operateColumn = model.operateColumn;
                this.product = model.product;
                this.status = model.status;
                this.tips = model.tips;
                this.viewColumn = model.viewColumn;
            } 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
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
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OperateColumn.
             */
            public Builder operateColumn(String operateColumn) {
                this.operateColumn = operateColumn;
                return this;
            }

            /**
             * Product.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Tips.
             */
            public Builder tips(String tips) {
                this.tips = tips;
                return this;
            }

            /**
             * ViewColumn.
             */
            public Builder viewColumn(String viewColumn) {
                this.viewColumn = viewColumn;
                return this;
            }

            public AdvisorCheck build() {
                return new AdvisorCheck(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAdvisorChecksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAdvisorChecksResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdvisorCheck")
        private java.util.List<AdvisorCheck> advisorCheck;

        private Data(Builder builder) {
            this.advisorCheck = builder.advisorCheck;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return advisorCheck
         */
        public java.util.List<AdvisorCheck> getAdvisorCheck() {
            return this.advisorCheck;
        }

        public static final class Builder {
            private java.util.List<AdvisorCheck> advisorCheck; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.advisorCheck = model.advisorCheck;
            } 

            /**
             * AdvisorCheck.
             */
            public Builder advisorCheck(java.util.List<AdvisorCheck> advisorCheck) {
                this.advisorCheck = advisorCheck;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
