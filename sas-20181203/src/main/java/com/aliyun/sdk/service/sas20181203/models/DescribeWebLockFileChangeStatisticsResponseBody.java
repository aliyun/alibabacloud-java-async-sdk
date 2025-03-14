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
 * {@link DescribeWebLockFileChangeStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebLockFileChangeStatisticsResponseBody</p>
 */
public class DescribeWebLockFileChangeStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List<List> list;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeWebLockFileChangeStatisticsResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.list = builder.list;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebLockFileChangeStatisticsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return list
     */
    public java.util.List<List> getList() {
        return this.list;
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
        private Integer currentPage; 
        private java.util.List<List> list; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeWebLockFileChangeStatisticsResponseBody model) {
            this.currentPage = model.currentPage;
            this.list = model.list;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
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
         * <p>An array consisting of the files that are changed.</p>
         */
        public Builder list(java.util.List<List> list) {
            this.list = list;
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
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>709A8C3D-A543-5B79-AB75-361B206F71D9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of files that are attempted to change.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeWebLockFileChangeStatisticsResponseBody build() {
            return new DescribeWebLockFileChangeStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWebLockFileChangeStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWebLockFileChangeStatisticsResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("File")
        private String file;

        private List(Builder builder) {
            this.count = builder.count;
            this.file = builder.file;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return file
         */
        public String getFile() {
            return this.file;
        }

        public static final class Builder {
            private Integer count; 
            private String file; 

            private Builder() {
            } 

            private Builder(List model) {
                this.count = model.count;
                this.file = model.file;
            } 

            /**
             * <p>The number of attempts.</p>
             * 
             * <strong>example:</strong>
             * <p>33</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The file path.</p>
             * 
             * <strong>example:</strong>
             * <p>/tmp</p>
             */
            public Builder file(String file) {
                this.file = file;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
