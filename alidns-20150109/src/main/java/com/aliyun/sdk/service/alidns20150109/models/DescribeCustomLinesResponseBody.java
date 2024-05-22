// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomLinesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomLinesResponseBody</p>
 */
public class DescribeCustomLinesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CustomLines")
    private java.util.List < CustomLines> customLines;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalItems")
    private Integer totalItems;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
    private Integer totalPages;

    private DescribeCustomLinesResponseBody(Builder builder) {
        this.customLines = builder.customLines;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalItems = builder.totalItems;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomLinesResponseBody create() {
        return builder().build();
    }

    /**
     * @return customLines
     */
    public java.util.List < CustomLines> getCustomLines() {
        return this.customLines;
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
     * @return totalItems
     */
    public Integer getTotalItems() {
        return this.totalItems;
    }

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static final class Builder {
        private java.util.List < CustomLines> customLines; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalItems; 
        private Integer totalPages; 

        /**
         * The custom lines.
         */
        public Builder customLines(java.util.List < CustomLines> customLines) {
            this.customLines = customLines;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of custom lines.
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * The total number of returned pages.
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public DescribeCustomLinesResponseBody build() {
            return new DescribeCustomLinesResponseBody(this);
        } 

    } 

    public static class CustomLines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private CustomLines(Builder builder) {
            this.code = builder.code;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomLines create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private Long id; 
            private String name; 

            /**
             * The code of the custom line.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The unique ID of the custom line.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the custom line.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public CustomLines build() {
                return new CustomLines(this);
            } 

        } 

    }
}
