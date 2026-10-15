// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link ListAccelerationOfWorkspaceResponseBody} extends {@link TeaModel}
 *
 * <p>ListAccelerationOfWorkspaceResponseBody</p>
 */
public class ListAccelerationOfWorkspaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListAccelerationOfWorkspaceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccelerationOfWorkspaceResponseBody create() {
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListAccelerationOfWorkspaceResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D787E****************05DF8D885</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The acceleration task information model.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListAccelerationOfWorkspaceResponseBody build() {
            return new ListAccelerationOfWorkspaceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAccelerationOfWorkspaceResponseBody} extends {@link TeaModel}
     *
     * <p>ListAccelerationOfWorkspaceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("CubeId")
        private String cubeId;

        @com.aliyun.core.annotation.NameInMap("CubeName")
        private String cubeName;

        @com.aliyun.core.annotation.NameInMap("EnableQuickindexTime")
        private String enableQuickindexTime;

        @com.aliyun.core.annotation.NameInMap("JobHistoryId")
        private String jobHistoryId;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobStatus")
        private Integer jobStatus;

        @com.aliyun.core.annotation.NameInMap("LastModifyTime")
        private String lastModifyTime;

        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

        private Data(Builder builder) {
            this.creatorName = builder.creatorName;
            this.cubeId = builder.cubeId;
            this.cubeName = builder.cubeName;
            this.enableQuickindexTime = builder.enableQuickindexTime;
            this.jobHistoryId = builder.jobHistoryId;
            this.jobId = builder.jobId;
            this.jobStatus = builder.jobStatus;
            this.lastModifyTime = builder.lastModifyTime;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return cubeId
         */
        public String getCubeId() {
            return this.cubeId;
        }

        /**
         * @return cubeName
         */
        public String getCubeName() {
            return this.cubeName;
        }

        /**
         * @return enableQuickindexTime
         */
        public String getEnableQuickindexTime() {
            return this.enableQuickindexTime;
        }

        /**
         * @return jobHistoryId
         */
        public String getJobHistoryId() {
            return this.jobHistoryId;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobStatus
         */
        public Integer getJobStatus() {
            return this.jobStatus;
        }

        /**
         * @return lastModifyTime
         */
        public String getLastModifyTime() {
            return this.lastModifyTime;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        public static final class Builder {
            private String creatorName; 
            private String cubeId; 
            private String cubeName; 
            private String enableQuickindexTime; 
            private String jobHistoryId; 
            private String jobId; 
            private Integer jobStatus; 
            private String lastModifyTime; 
            private String size; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.creatorName = model.creatorName;
                this.cubeId = model.cubeId;
                this.cubeName = model.cubeName;
                this.enableQuickindexTime = model.enableQuickindexTime;
                this.jobHistoryId = model.jobHistoryId;
                this.jobId = model.jobId;
                this.jobStatus = model.jobStatus;
                this.lastModifyTime = model.lastModifyTime;
                this.size = model.size;
            } 

            /**
             * <p>The name of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>system</p>
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * <p>The dataset ID.</p>
             * 
             * <strong>example:</strong>
             * <p>d14e*********fef8de29fd</p>
             */
            public Builder cubeId(String cubeId) {
                this.cubeId = cubeId;
                return this;
            }

            /**
             * <p>The dataset name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder cubeName(String cubeName) {
                this.cubeName = cubeName;
                return this;
            }

            /**
             * <p>The time when acceleration was enabled, in the format of YYYYMMDD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>20250911 00:00:00</p>
             */
            public Builder enableQuickindexTime(String enableQuickindexTime) {
                this.enableQuickindexTime = enableQuickindexTime;
                return this;
            }

            /**
             * <p>The task history ID.</p>
             * 
             * <strong>example:</strong>
             * <p>QWDAASG*******8SAD</p>
             */
            public Builder jobHistoryId(String jobHistoryId) {
                this.jobHistoryId = jobHistoryId;
                return this;
            }

            /**
             * <p>The acceleration task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>b30b74**********b3b</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The status. Valid values:</p>
             * <ul>
             * <li>0: pending</li>
             * <li>1: running</li>
             * <li>2: completed</li>
             * <li>3: failed</li>
             * <li>4: canceled</li>
             * <li>5: warning</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder jobStatus(Integer jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * <p>The last modification time, in the format of YYYYMMDD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>20250911 00:00:00</p>
             */
            public Builder lastModifyTime(String lastModifyTime) {
                this.lastModifyTime = lastModifyTime;
                return this;
            }

            /**
             * <p>The size.</p>
             * 
             * <strong>example:</strong>
             * <p>47045632</p>
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAccelerationOfWorkspaceResponseBody} extends {@link TeaModel}
     *
     * <p>ListAccelerationOfWorkspaceResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("Next")
        private Integer next;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Pre")
        private Integer pre;

        @com.aliyun.core.annotation.NameInMap("TotalNum")
        private Integer totalNum;

        @com.aliyun.core.annotation.NameInMap("TotalPages")
        private Integer totalPages;

        private Result(Builder builder) {
            this.data = builder.data;
            this.next = builder.next;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.pre = builder.pre;
            this.totalNum = builder.totalNum;
            this.totalPages = builder.totalPages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return next
         */
        public Integer getNext() {
            return this.next;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return pre
         */
        public Integer getPre() {
            return this.pre;
        }

        /**
         * @return totalNum
         */
        public Integer getTotalNum() {
            return this.totalNum;
        }

        /**
         * @return totalPages
         */
        public Integer getTotalPages() {
            return this.totalPages;
        }

        public static final class Builder {
            private java.util.List<Data> data; 
            private Integer next; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer pre; 
            private Integer totalNum; 
            private Integer totalPages; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.data = model.data;
                this.next = model.next;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.pre = model.pre;
                this.totalNum = model.totalNum;
                this.totalPages = model.totalPages;
            } 

            /**
             * <p>The array of acceleration task information.</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The next page number. A value of NULL or 0 indicates that there is no next page.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder next(Integer next) {
                this.next = next;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>The number of rows per page specified in the request.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The previous page number. A value of NULL or 0 indicates that there is no previous page.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder pre(Integer pre) {
                this.pre = pre;
                return this;
            }

            /**
             * <p>The total number of rows.</p>
             * 
             * <strong>example:</strong>
             * <p>18</p>
             */
            public Builder totalNum(Integer totalNum) {
                this.totalNum = totalNum;
                return this;
            }

            /**
             * <p>The total number of pages.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalPages(Integer totalPages) {
                this.totalPages = totalPages;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
