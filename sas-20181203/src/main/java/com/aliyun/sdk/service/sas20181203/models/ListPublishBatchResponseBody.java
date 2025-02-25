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
 * {@link ListPublishBatchResponseBody} extends {@link TeaModel}
 *
 * <p>ListPublishBatchResponseBody</p>
 */
public class ListPublishBatchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BatchList")
    private java.util.List<BatchList> batchList;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPublishBatchResponseBody(Builder builder) {
        this.batchList = builder.batchList;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPublishBatchResponseBody create() {
        return builder().build();
    }

    /**
     * @return batchList
     */
    public java.util.List<BatchList> getBatchList() {
        return this.batchList;
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
        private java.util.List<BatchList> batchList; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * <p>The information about the release batches.</p>
         */
        public Builder batchList(java.util.List<BatchList> batchList) {
            this.batchList = batchList;
            return this;
        }

        /**
         * <p>The page information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7532B7EE-7CE7-5F4D-BF04-B12447DDCAE1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPublishBatchResponseBody build() {
            return new ListPublishBatchResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPublishBatchResponseBody} extends {@link TeaModel}
     *
     * <p>ListPublishBatchResponseBody</p>
     */
    public static class BatchList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BatchId")
        private Long batchId;

        @com.aliyun.core.annotation.NameInMap("BatchInterval")
        private Integer batchInterval;

        @com.aliyun.core.annotation.NameInMap("BatchName")
        private String batchName;

        @com.aliyun.core.annotation.NameInMap("BatchNo")
        private Integer batchNo;

        @com.aliyun.core.annotation.NameInMap("BatchProcess")
        private Integer batchProcess;

        @com.aliyun.core.annotation.NameInMap("BatchTotal")
        private Integer batchTotal;

        @com.aliyun.core.annotation.NameInMap("OperationBase")
        private Integer operationBase;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private BatchList(Builder builder) {
            this.batchId = builder.batchId;
            this.batchInterval = builder.batchInterval;
            this.batchName = builder.batchName;
            this.batchNo = builder.batchNo;
            this.batchProcess = builder.batchProcess;
            this.batchTotal = builder.batchTotal;
            this.operationBase = builder.operationBase;
            this.status = builder.status;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BatchList create() {
            return builder().build();
        }

        /**
         * @return batchId
         */
        public Long getBatchId() {
            return this.batchId;
        }

        /**
         * @return batchInterval
         */
        public Integer getBatchInterval() {
            return this.batchInterval;
        }

        /**
         * @return batchName
         */
        public String getBatchName() {
            return this.batchName;
        }

        /**
         * @return batchNo
         */
        public Integer getBatchNo() {
            return this.batchNo;
        }

        /**
         * @return batchProcess
         */
        public Integer getBatchProcess() {
            return this.batchProcess;
        }

        /**
         * @return batchTotal
         */
        public Integer getBatchTotal() {
            return this.batchTotal;
        }

        /**
         * @return operationBase
         */
        public Integer getOperationBase() {
            return this.operationBase;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Long batchId; 
            private Integer batchInterval; 
            private String batchName; 
            private Integer batchNo; 
            private Integer batchProcess; 
            private Integer batchTotal; 
            private Integer operationBase; 
            private Integer status; 
            private String version; 

            /**
             * <p>The ID of the release batch.</p>
             * 
             * <strong>example:</strong>
             * <p>1371</p>
             */
            public Builder batchId(Long batchId) {
                this.batchId = batchId;
                return this;
            }

            /**
             * <p>The interval between two release batches. Unit: hours.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder batchInterval(Integer batchInterval) {
                this.batchInterval = batchInterval;
                return this;
            }

            /**
             * <p>The name of the release batch.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder batchName(String batchName) {
                this.batchName = batchName;
                return this;
            }

            /**
             * <p>The current batch number during a batch release.</p>
             * 
             * <strong>example:</strong>
             * <p>2147483647</p>
             */
            public Builder batchNo(Integer batchNo) {
                this.batchNo = batchNo;
                return this;
            }

            /**
             * <p>The progress of the release batch. This parameter indicates the number of servers that are upgraded in the release batch.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder batchProcess(Integer batchProcess) {
                this.batchProcess = batchProcess;
                return this;
            }

            /**
             * <p>The total number of batches.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder batchTotal(Integer batchTotal) {
                this.batchTotal = batchTotal;
                return this;
            }

            /**
             * <p>The asset selection dimension. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: instance.</li>
             * <li><strong>1</strong>: machine group.</li>
             * <li><strong>2</strong>: Virtual Private Cloud (VPC) ID.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder operationBase(Integer operationBase) {
                this.operationBase = operationBase;
                return this;
            }

            /**
             * <p>The publish status of the Security Center agent. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: not started.</li>
             * <li><strong>1</strong>: publishing.</li>
             * <li><strong>2</strong>: published.</li>
             * <li><strong>3</strong>: publish suspended.</li>
             * <li><strong>4</strong>: forcibly upgrading.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The destination version of the Security Center agent.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.9</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public BatchList build() {
                return new BatchList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPublishBatchResponseBody} extends {@link TeaModel}
     *
     * <p>ListPublishBatchResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
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
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
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
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
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
