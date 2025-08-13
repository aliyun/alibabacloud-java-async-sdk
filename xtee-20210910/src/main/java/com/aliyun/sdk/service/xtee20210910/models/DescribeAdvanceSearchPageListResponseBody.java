// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link DescribeAdvanceSearchPageListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAdvanceSearchPageListResponseBody</p>
 */
public class DescribeAdvanceSearchPageListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private DescribeAdvanceSearchPageListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAdvanceSearchPageListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeAdvanceSearchPageListResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return object</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeAdvanceSearchPageListResponseBody build() {
            return new DescribeAdvanceSearchPageListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAdvanceSearchPageListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAdvanceSearchPageListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ResultObjectHeader model) {
                this.fieldName = model.fieldName;
                this.fieldTitle = model.fieldTitle;
                this.isDefault = model.isDefault;
            } 

            /**
             * <p>Field name</p>
             * 
             * <strong>example:</strong>
             * <p>age</p>
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * <p>Field title.</p>
             * 
             * <strong>example:</strong>
             * <p>年龄</p>
             */
            public Builder fieldTitle(String fieldTitle) {
                this.fieldTitle = fieldTitle;
                return this;
            }

            /**
             * <p>Whether it is a default display field (displayed in the response, not used as a parameter)</p>
             * <ul>
             * <li>true: Yes</li>
             * <li>false: No</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link DescribeAdvanceSearchPageListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAdvanceSearchPageListResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("currentPage")
        private Long currentPage;

        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List<java.util.Map<String, ?>> data;

        @com.aliyun.core.annotation.NameInMap("header")
        private java.util.List<ResultObjectHeader> header;

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
        public java.util.List<java.util.Map<String, ?>> getData() {
            return this.data;
        }

        /**
         * @return header
         */
        public java.util.List<ResultObjectHeader> getHeader() {
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
            private java.util.List<java.util.Map<String, ?>> data; 
            private java.util.List<ResultObjectHeader> header; 
            private Long pageSize; 
            private Long totalItem; 
            private Long totalPage; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.currentPage = model.currentPage;
                this.data = model.data;
                this.header = model.header;
                this.pageSize = model.pageSize;
                this.totalItem = model.totalItem;
                this.totalPage = model.totalPage;
            } 

            /**
             * <p>Current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Long currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>Returned data object</p>
             */
            public Builder data(java.util.List<java.util.Map<String, ?>> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>Table header</p>
             */
            public Builder header(java.util.List<ResultObjectHeader> header) {
                this.header = header;
                return this;
            }

            /**
             * <p>Number of items per page. Default value: 20, minimum value: 1, maximum value: 50.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Total number of items</p>
             * 
             * <strong>example:</strong>
             * <p>37</p>
             */
            public Builder totalItem(Long totalItem) {
                this.totalItem = totalItem;
                return this;
            }

            /**
             * <p>Total number of pages</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
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
