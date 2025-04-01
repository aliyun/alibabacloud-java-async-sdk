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
 * {@link DescribeAdvisorChecksFoPagesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAdvisorChecksFoPagesResponseBody</p>
 */
public class DescribeAdvisorChecksFoPagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeAdvisorChecksFoPagesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAdvisorChecksFoPagesResponseBody create() {
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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeAdvisorChecksFoPagesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
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
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>566331F9-5AB3-550F-B745-A730331F97A9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeAdvisorChecksFoPagesResponseBody build() {
            return new DescribeAdvisorChecksFoPagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAdvisorChecksFoPagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAdvisorChecksFoPagesResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("ConfigSupport")
        private String configSupport;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InspectionScope")
        private String inspectionScope;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OperateColumn")
        private String operateColumn;

        @com.aliyun.core.annotation.NameInMap("Product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubCategory")
        private java.util.List<Long> subCategory;

        @com.aliyun.core.annotation.NameInMap("Tips")
        private String tips;

        @com.aliyun.core.annotation.NameInMap("ViewColumn")
        private String viewColumn;

        private Result(Builder builder) {
            this.category = builder.category;
            this.code = builder.code;
            this.configSupport = builder.configSupport;
            this.description = builder.description;
            this.inspectionScope = builder.inspectionScope;
            this.name = builder.name;
            this.operateColumn = builder.operateColumn;
            this.product = builder.product;
            this.source = builder.source;
            this.status = builder.status;
            this.subCategory = builder.subCategory;
            this.tips = builder.tips;
            this.viewColumn = builder.viewColumn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
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
         * @return configSupport
         */
        public String getConfigSupport() {
            return this.configSupport;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return inspectionScope
         */
        public String getInspectionScope() {
            return this.inspectionScope;
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
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subCategory
         */
        public java.util.List<Long> getSubCategory() {
            return this.subCategory;
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
            private String configSupport; 
            private String description; 
            private String inspectionScope; 
            private String name; 
            private String operateColumn; 
            private String product; 
            private String source; 
            private String status; 
            private java.util.List<Long> subCategory; 
            private String tips; 
            private String viewColumn; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.category = model.category;
                this.code = model.code;
                this.configSupport = model.configSupport;
                this.description = model.description;
                this.inspectionScope = model.inspectionScope;
                this.name = model.name;
                this.operateColumn = model.operateColumn;
                this.product = model.product;
                this.source = model.source;
                this.status = model.status;
                this.subCategory = model.subCategory;
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
             * ConfigSupport.
             */
            public Builder configSupport(String configSupport) {
                this.configSupport = configSupport;
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
             * InspectionScope.
             */
            public Builder inspectionScope(String inspectionScope) {
                this.inspectionScope = inspectionScope;
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
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
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
             * SubCategory.
             */
            public Builder subCategory(java.util.List<Long> subCategory) {
                this.subCategory = subCategory;
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

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAdvisorChecksFoPagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAdvisorChecksFoPagesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<Result> result;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.result = builder.result;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return result
         */
        public java.util.List<Result> getResult() {
            return this.result;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer pageNo; 
            private Integer pageSize; 
            private java.util.List<Result> result; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.result = model.result;
                this.total = model.total;
            } 

            /**
             * PageNo.
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
