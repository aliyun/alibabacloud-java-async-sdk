// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListListsResponseBody} extends {@link TeaModel}
 *
 * <p>ListListsResponseBody</p>
 */
public class ListListsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Lists")
    private java.util.List<Lists> lists;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("Usage")
    private Long usage;

    private ListListsResponseBody(Builder builder) {
        this.lists = builder.lists;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListListsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lists
     */
    public java.util.List<Lists> getLists() {
        return this.lists;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return usage
     */
    public Long getUsage() {
        return this.usage;
    }

    public static final class Builder {
        private java.util.List<Lists> lists; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Long usage; 

        private Builder() {
        } 

        private Builder(ListListsResponseBody model) {
            this.lists = model.lists;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.usage = model.usage;
        } 

        /**
         * <p>The array that contains list information, including list data after paging.</p>
         */
        public Builder lists(java.util.List<Lists> lists) {
            this.lists = lists;
            return this;
        }

        /**
         * <p>The page number returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of filtered lists.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The number of created lists.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder usage(Long usage) {
            this.usage = usage;
            return this;
        }

        public ListListsResponseBody build() {
            return new ListListsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListListsResponseBody} extends {@link TeaModel}
     *
     * <p>ListListsResponseBody</p>
     */
    public static class Lists extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        @com.aliyun.core.annotation.Validation(maxLength = 1024)
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Kind")
        private String kind;

        @com.aliyun.core.annotation.NameInMap("Length")
        private Long length;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private Lists(Builder builder) {
            this.description = builder.description;
            this.id = builder.id;
            this.kind = builder.kind;
            this.length = builder.length;
            this.name = builder.name;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Lists create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
        }

        /**
         * @return length
         */
        public Long getLength() {
            return this.length;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String description; 
            private Long id; 
            private String kind; 
            private Long length; 
            private String name; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(Lists model) {
                this.description = model.description;
                this.id = model.id;
                this.kind = model.kind;
                this.length = model.length;
                this.name = model.name;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The list description.</p>
             * 
             * <strong>example:</strong>
             * <p>a custom list</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the custom list.<a href="~~2850217~~"></a></p>
             * 
             * <strong>example:</strong>
             * <p>40000001</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The list type.</p>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * <p>The length of the list information array, which indicates how many items the list contains.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder length(Long length) {
                this.length = length;
                return this;
            }

            /**
             * <p>The list name.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The time when the list was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-01T00:00:00Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Lists build() {
                return new Lists(this);
            } 

        } 

    }
}
