// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeExcludeSystemPathResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExcludeSystemPathResponseBody</p>
 */
public class DescribeExcludeSystemPathResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExcludePaths")
    private java.util.List<ExcludePaths> excludePaths;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeExcludeSystemPathResponseBody(Builder builder) {
        this.excludePaths = builder.excludePaths;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExcludeSystemPathResponseBody create() {
        return builder().build();
    }

    /**
     * @return excludePaths
     */
    public java.util.List<ExcludePaths> getExcludePaths() {
        return this.excludePaths;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ExcludePaths> excludePaths; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * <p>An array consisting of the directories that are excluded.</p>
         */
        public Builder excludePaths(java.util.List<ExcludePaths> excludePaths) {
            this.excludePaths = excludePaths;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>FBBEB173-1F43-505F-A876-C03ECDF6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeExcludeSystemPathResponseBody build() {
            return new DescribeExcludeSystemPathResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeExcludeSystemPathResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExcludeSystemPathResponseBody</p>
     */
    public static class ExcludePaths extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Os")
        private String os;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        private ExcludePaths(Builder builder) {
            this.os = builder.os;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExcludePaths create() {
            return builder().build();
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String os; 
            private String path; 

            /**
             * <p>The operating system of the server. Valid values:</p>
             * <ul>
             * <li><strong>linux</strong>: Linux</li>
             * <li><strong>windows</strong>: Windows</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>linux</p>
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * <p>The absolute path to the directory.</p>
             * 
             * <strong>example:</strong>
             * <p>/bin/</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public ExcludePaths build() {
                return new ExcludePaths(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeExcludeSystemPathResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExcludeSystemPathResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
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
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>55</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
