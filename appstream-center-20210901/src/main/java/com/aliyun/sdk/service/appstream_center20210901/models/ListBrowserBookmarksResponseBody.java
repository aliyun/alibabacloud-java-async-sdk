// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListBrowserBookmarksResponseBody} extends {@link TeaModel}
 *
 * <p>ListBrowserBookmarksResponseBody</p>
 */
public class ListBrowserBookmarksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListBrowserBookmarksResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBrowserBookmarksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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

    public static final class Builder {
        private java.util.List<Data> data; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListBrowserBookmarksResponseBody model) {
            this.data = model.data;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of bookmarks on the current page.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID, which is used to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>01A0C2ED-95F2-1A37-9FC6-4A395179****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of bookmarks that meet the filtering conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListBrowserBookmarksResponseBody build() {
            return new ListBrowserBookmarksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBrowserBookmarksResponseBody} extends {@link TeaModel}
     *
     * <p>ListBrowserBookmarksResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BookmarkFolder")
        private String bookmarkFolder;

        @com.aliyun.core.annotation.NameInMap("BookmarkId")
        private String bookmarkId;

        @com.aliyun.core.annotation.NameInMap("BookmarkName")
        private String bookmarkName;

        @com.aliyun.core.annotation.NameInMap("BookmarkURL")
        private String bookmarkURL;

        private Data(Builder builder) {
            this.bookmarkFolder = builder.bookmarkFolder;
            this.bookmarkId = builder.bookmarkId;
            this.bookmarkName = builder.bookmarkName;
            this.bookmarkURL = builder.bookmarkURL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bookmarkFolder
         */
        public String getBookmarkFolder() {
            return this.bookmarkFolder;
        }

        /**
         * @return bookmarkId
         */
        public String getBookmarkId() {
            return this.bookmarkId;
        }

        /**
         * @return bookmarkName
         */
        public String getBookmarkName() {
            return this.bookmarkName;
        }

        /**
         * @return bookmarkURL
         */
        public String getBookmarkURL() {
            return this.bookmarkURL;
        }

        public static final class Builder {
            private String bookmarkFolder; 
            private String bookmarkId; 
            private String bookmarkName; 
            private String bookmarkURL; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bookmarkFolder = model.bookmarkFolder;
                this.bookmarkId = model.bookmarkId;
                this.bookmarkName = model.bookmarkName;
                this.bookmarkURL = model.bookmarkURL;
            } 

            /**
             * <p>The bookmark folder.</p>
             * 
             * <strong>example:</strong>
             * <p>Work</p>
             */
            public Builder bookmarkFolder(String bookmarkFolder) {
                this.bookmarkFolder = bookmarkFolder;
                return this;
            }

            /**
             * <p>The bookmark ID.</p>
             * 
             * <strong>example:</strong>
             * <p>bm-0c7loey7fzjq****</p>
             */
            public Builder bookmarkId(String bookmarkId) {
                this.bookmarkId = bookmarkId;
                return this;
            }

            /**
             * <p>The bookmark name.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba Cloud</p>
             */
            public Builder bookmarkName(String bookmarkName) {
                this.bookmarkName = bookmarkName;
                return this;
            }

            /**
             * <p>The bookmark URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
             */
            public Builder bookmarkURL(String bookmarkURL) {
                this.bookmarkURL = bookmarkURL;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
