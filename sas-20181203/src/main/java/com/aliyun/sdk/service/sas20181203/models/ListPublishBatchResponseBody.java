// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
    private java.util.List < BatchList> batchList;

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
    public java.util.List < BatchList> getBatchList() {
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
        private java.util.List < BatchList> batchList; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * BatchList.
         */
        public Builder batchList(java.util.List < BatchList> batchList) {
            this.batchList = batchList;
            return this;
        }

        /**
         * PageInfo.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * RequestId.
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
             * BatchId.
             */
            public Builder batchId(Long batchId) {
                this.batchId = batchId;
                return this;
            }

            /**
             * BatchInterval.
             */
            public Builder batchInterval(Integer batchInterval) {
                this.batchInterval = batchInterval;
                return this;
            }

            /**
             * BatchName.
             */
            public Builder batchName(String batchName) {
                this.batchName = batchName;
                return this;
            }

            /**
             * BatchNo.
             */
            public Builder batchNo(Integer batchNo) {
                this.batchNo = batchNo;
                return this;
            }

            /**
             * BatchProcess.
             */
            public Builder batchProcess(Integer batchProcess) {
                this.batchProcess = batchProcess;
                return this;
            }

            /**
             * BatchTotal.
             */
            public Builder batchTotal(Integer batchTotal) {
                this.batchTotal = batchTotal;
                return this;
            }

            /**
             * OperationBase.
             */
            public Builder operationBase(Integer operationBase) {
                this.operationBase = operationBase;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Version.
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
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
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
             * TotalCount.
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
