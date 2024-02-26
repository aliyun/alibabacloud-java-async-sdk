// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAdvicesFlatPageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAdvicesFlatPageResponseBody</p>
 */
public class DescribeAdvicesFlatPageResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAdvicesFlatPageResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAdvicesFlatPageResponseBody create() {
        return builder().build();
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
        private Data data; 
        private String requestId; 

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

        public DescribeAdvicesFlatPageResponseBody build() {
            return new DescribeAdvicesFlatPageResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("AliyunId")
        private Long aliyunId;

        @NameInMap("CheckId")
        private String checkId;

        @NameInMap("CheckName")
        private String checkName;

        @NameInMap("Content")
        private String content;

        @NameInMap("Description")
        private String description;

        @NameInMap("GmtCreated")
        private String gmtCreated;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("IsExpired")
        private Boolean isExpired;

        @NameInMap("Product")
        private String product;

        @NameInMap("Resource")
        private String resource;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("Severity")
        private Long severity;

        private Result(Builder builder) {
            this.aliyunId = builder.aliyunId;
            this.checkId = builder.checkId;
            this.checkName = builder.checkName;
            this.content = builder.content;
            this.description = builder.description;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.isExpired = builder.isExpired;
            this.product = builder.product;
            this.resource = builder.resource;
            this.resourceId = builder.resourceId;
            this.severity = builder.severity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return aliyunId
         */
        public Long getAliyunId() {
            return this.aliyunId;
        }

        /**
         * @return checkId
         */
        public String getCheckId() {
            return this.checkId;
        }

        /**
         * @return checkName
         */
        public String getCheckName() {
            return this.checkName;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
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
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isExpired
         */
        public Boolean getIsExpired() {
            return this.isExpired;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return severity
         */
        public Long getSeverity() {
            return this.severity;
        }

        public static final class Builder {
            private Long aliyunId; 
            private String checkId; 
            private String checkName; 
            private String content; 
            private String description; 
            private String gmtCreated; 
            private String gmtModified; 
            private Long id; 
            private Boolean isExpired; 
            private String product; 
            private String resource; 
            private String resourceId; 
            private Long severity; 

            /**
             * AliyunId.
             */
            public Builder aliyunId(Long aliyunId) {
                this.aliyunId = aliyunId;
                return this;
            }

            /**
             * CheckId.
             */
            public Builder checkId(String checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * CheckName.
             */
            public Builder checkName(String checkName) {
                this.checkName = checkName;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
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
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IsExpired.
             */
            public Builder isExpired(Boolean isExpired) {
                this.isExpired = isExpired;
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
             * Resource.
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * Severity.
             */
            public Builder severity(Long severity) {
                this.severity = severity;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageNo")
        private Long pageNo;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("Result")
        private java.util.List < Result> result;

        @NameInMap("Total")
        private Long total;

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
        public Long getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return result
         */
        public java.util.List < Result> getResult() {
            return this.result;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long pageNo; 
            private Long pageSize; 
            private java.util.List < Result> result; 
            private Long total; 

            /**
             * PageNo.
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
