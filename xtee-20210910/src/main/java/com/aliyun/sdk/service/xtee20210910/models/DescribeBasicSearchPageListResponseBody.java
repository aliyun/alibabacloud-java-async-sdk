// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBasicSearchPageListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBasicSearchPageListResponseBody</p>
 */
public class DescribeBasicSearchPageListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private DescribeBasicSearchPageListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBasicSearchPageListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private ResultObject resultObject; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resultObject.
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeBasicSearchPageListResponseBody build() {
            return new DescribeBasicSearchPageListResponseBody(this);
        } 

    } 

    public static class ResultObjectHeader extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fieldName")
        private String fieldName;

        @com.aliyun.core.annotation.NameInMap("fieldTitle")
        private String fieldTitle;

        @com.aliyun.core.annotation.NameInMap("isDefault")
        private Boolean isDefault;

        private ResultObjectHeader(Builder builder) {
            this.fieldName = builder.fieldName;
            this.fieldTitle = builder.fieldTitle;
            this.isDefault = builder.isDefault;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObjectHeader create() {
            return builder().build();
        }

        /**
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
        }

        /**
         * @return fieldTitle
         */
        public String getFieldTitle() {
            return this.fieldTitle;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public static final class Builder {
            private String fieldName; 
            private String fieldTitle; 
            private Boolean isDefault; 

            /**
             * fieldName.
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * fieldTitle.
             */
            public Builder fieldTitle(String fieldTitle) {
                this.fieldTitle = fieldTitle;
                return this;
            }

            /**
             * isDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            public ResultObjectHeader build() {
                return new ResultObjectHeader(this);
            } 

        } 

    }
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("currentPage")
        private Long currentPage;

        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List < java.util.Map<String, ?>> data;

        @com.aliyun.core.annotation.NameInMap("header")
        private java.util.List < ResultObjectHeader> header;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("totalItem")
        private Long totalItem;

        @com.aliyun.core.annotation.NameInMap("totalPage")
        private Long totalPage;

        private ResultObject(Builder builder) {
            this.currentPage = builder.currentPage;
            this.data = builder.data;
            this.header = builder.header;
            this.pageSize = builder.pageSize;
            this.totalItem = builder.totalItem;
            this.totalPage = builder.totalPage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Long getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return data
         */
        public java.util.List < java.util.Map<String, ?>> getData() {
            return this.data;
        }

        /**
         * @return header
         */
        public java.util.List < ResultObjectHeader> getHeader() {
            return this.header;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalItem
         */
        public Long getTotalItem() {
            return this.totalItem;
        }

        /**
         * @return totalPage
         */
        public Long getTotalPage() {
            return this.totalPage;
        }

        public static final class Builder {
            private Long currentPage; 
            private java.util.List < java.util.Map<String, ?>> data; 
            private java.util.List < ResultObjectHeader> header; 
            private Long pageSize; 
            private Long totalItem; 
            private Long totalPage; 

            /**
             * currentPage.
             */
            public Builder currentPage(Long currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * data.
             */
            public Builder data(java.util.List < java.util.Map<String, ?>> data) {
                this.data = data;
                return this;
            }

            /**
             * header.
             */
            public Builder header(java.util.List < ResultObjectHeader> header) {
                this.header = header;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * totalItem.
             */
            public Builder totalItem(Long totalItem) {
                this.totalItem = totalItem;
                return this;
            }

            /**
             * totalPage.
             */
            public Builder totalPage(Long totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
