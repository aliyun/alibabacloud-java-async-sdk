// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListPagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPagesResponseBody</p>
 */
public class ListPagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("Pages")
    private java.util.List < Pages> pages;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("Usage")
    private Long usage;

    private ListPagesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.pages = builder.pages;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPagesResponseBody create() {
        return builder().build();
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
     * @return pages
     */
    public java.util.List < Pages> getPages() {
        return this.pages;
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
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List < Pages> pages; 
        private String requestId; 
        private Integer totalCount; 
        private Long usage; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * Pages.
         */
        public Builder pages(java.util.List < Pages> pages) {
            this.pages = pages;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Usage.
         */
        public Builder usage(Long usage) {
            this.usage = usage;
            return this;
        }

        public ListPagesResponseBody build() {
            return new ListPagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPagesResponseBody</p>
     */
    public static class Pages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        @com.aliyun.core.annotation.Validation(required = true)
        private String content;

        @com.aliyun.core.annotation.NameInMap("ContentType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("Description")
        @com.aliyun.core.annotation.Validation(maxLength = 1024)
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Kind")
        private String kind;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private Pages(Builder builder) {
            this.content = builder.content;
            this.contentType = builder.contentType;
            this.description = builder.description;
            this.id = builder.id;
            this.kind = builder.kind;
            this.name = builder.name;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pages create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
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
            private String content; 
            private String contentType; 
            private String description; 
            private Long id; 
            private String kind; 
            private String name; 
            private String updateTime; 

            /**
             * <p>自定义响应页面内容BASE64编码</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PGh0bWw+aGVsbG8gcGFnZTwvaHRtbD4=</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>自定义响应页面内容类型</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>text/html</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>自定义响应页面描述</p>
             * 
             * <strong>example:</strong>
             * <p>a custom deny page</p>
             */
            public Builder description(String description) {
                this.description = description;
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
             * Kind.
             */
            public Builder kind(String kind) {
                this.kind = kind;
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
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Pages build() {
                return new Pages(this);
            } 

        } 

    }
}
