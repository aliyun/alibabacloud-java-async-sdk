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
 * {@link ListBrowserRestrictedURLsResponseBody} extends {@link TeaModel}
 *
 * <p>ListBrowserRestrictedURLsResponseBody</p>
 */
public class ListBrowserRestrictedURLsResponseBody extends TeaModel {
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

    private ListBrowserRestrictedURLsResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBrowserRestrictedURLsResponseBody create() {
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

        private Builder(ListBrowserRestrictedURLsResponseBody model) {
            this.data = model.data;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of restricted URLs on the current page. Each record contains a restricted URL and its unique identifier. If no restricted URLs are configured under the specified conditions, an empty array is returned.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The actual page number used in this query. This is the echoed value of the PageNumber request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The actual number of entries returned per page in this query. This is the echoed value of the PageSize request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request. You can use the ID to locate call records and troubleshoot issues. The example value is partially masked.</p>
         * 
         * <strong>example:</strong>
         * <p>D4A13D91-****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of restricted URL records that meet the filter conditions. This value is independent of the number of records returned on the current page and can be used with PageSize to calculate the total number of pages. If no records meet the conditions, 0 is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListBrowserRestrictedURLsResponseBody build() {
            return new ListBrowserRestrictedURLsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBrowserRestrictedURLsResponseBody} extends {@link TeaModel}
     *
     * <p>ListBrowserRestrictedURLsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RestrictedURLId")
        private String restrictedURLId;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Data(Builder builder) {
            this.restrictedURLId = builder.restrictedURLId;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return restrictedURLId
         */
        public String getRestrictedURLId() {
            return this.restrictedURLId;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String restrictedURLId; 
            private String url; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.restrictedURLId = model.restrictedURLId;
                this.url = model.url;
            } 

            /**
             * <p>The unique identifier of the restricted URL record.</p>
             * 
             * <strong>example:</strong>
             * <p>ru-3jm9d0abc00example</p>
             */
            public Builder restrictedURLId(String restrictedURLId) {
                this.restrictedURLId = restrictedURLId;
                return this;
            }

            /**
             * <p>The URL address that is restricted from access.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.example.com">https://www.example.com</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
