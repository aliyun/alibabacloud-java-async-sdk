// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTableListByTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTableListByTypeResponseBody</p>
 */
public class DescribeTableListByTypeResponseBody extends TeaModel {
    @NameInMap("List")
    private java.util.List < List> list;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
    private Integer total;

    private DescribeTableListByTypeResponseBody(Builder builder) {
        this.list = builder.list;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTableListByTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return list
     */
    public java.util.List < List> getList() {
        return this.list;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < List> list; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        /**
         * Indicates the information about tables.
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
            return this;
        }

        /**
         * Indicates the page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * Indicates the number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Indicates the unique ID of the request. If the request fails, provide this ID for technical support to troubleshoot the failure.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Indicates the total number of returned tables.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeTableListByTypeResponseBody build() {
            return new DescribeTableListByTypeResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("Property")
        private String property;

        @NameInMap("TableName")
        private String tableName;

        private List(Builder builder) {
            this.property = builder.property;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return property
         */
        public String getProperty() {
            return this.property;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String property; 
            private String tableName; 

            /**
             * Indicates the property of a table.
             */
            public Builder property(String property) {
                this.property = property;
                return this;
            }

            /**
             * Indicates the name of the table.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
