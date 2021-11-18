// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListChainInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ListChainInstanceResponseBody</p>
 */
public class ListChainInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Code")
    private String code;

    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("ChainInstances")
    private java.util.List < ChainInstances> chainInstances;


    private ListChainInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.code = builder.code;
        this.pageNo = builder.pageNo;
        this.isSuccess = builder.isSuccess;
        this.instanceId = builder.instanceId;
        this.pageSize = builder.pageSize;
        this.totalCount = builder.totalCount;
        this.chainInstances = builder.chainInstances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChainInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    /**
     * @return chainInstances
     */
    public java.util.List < ChainInstances> getChainInstances() {
        return this.chainInstances;
    }

    public static final class Builder {
        private String requestId; 
        private String code; 
        private Integer pageNo; 
        private Boolean isSuccess; 
        private String instanceId; 
        private Integer pageSize; 
        private Integer totalCount; 
        private java.util.List < ChainInstances> chainInstances; 

        /**
         * <p>Request ID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return value</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Page number</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>Successful</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>Instance ID</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Page size</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Total quantity</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>Delivery chain execution records</p>
         */
        public Builder chainInstances(java.util.List < ChainInstances> chainInstances) {
            this.chainInstances = chainInstances;
            return this;
        }

        public ListChainInstanceResponseBody build() {
            return new ListChainInstanceResponseBody(this);
        } 

    } 

    public static class Chain extends TeaModel {
        @NameInMap("ChainId")
        private String chainId;

        @NameInMap("ChainName")
        private String chainName;

        @NameInMap("Version")
        private Long version;


        private Chain(Builder builder) {
            this.chainId = builder.chainId;
            this.chainName = builder.chainName;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Chain create() {
            return builder().build();
        }

        /**
         * @return chainId
         */
        public String getChainId() {
            return this.chainId;
        }

        /**
         * @return chainName
         */
        public String getChainName() {
            return this.chainName;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String chainId; 
            private String chainName; 
            private Long version; 

            /**
             * <p>Delivery chain ID</p>
             */
            public Builder chainId(String chainId) {
                this.chainId = chainId;
                return this;
            }

            /**
             * <p>Delivery chain name</p>
             */
            public Builder chainName(String chainName) {
                this.chainName = chainName;
                return this;
            }

            /**
             * <p>Delivery chain version</p>
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            public Chain build() {
                return new Chain(this);
            } 

        } 

    }
    public static class ChainInstances extends TeaModel {
        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Result")
        private String result;

        @NameInMap("ChainInstanceId")
        private String chainInstanceId;

        @NameInMap("RepoNamespaceName")
        private String repoNamespaceName;

        @NameInMap("RepoName")
        private String repoName;

        @NameInMap("Chain")
        private Chain chain;


        private ChainInstances(Builder builder) {
            this.endTime = builder.endTime;
            this.status = builder.status;
            this.startTime = builder.startTime;
            this.result = builder.result;
            this.chainInstanceId = builder.chainInstanceId;
            this.repoNamespaceName = builder.repoNamespaceName;
            this.repoName = builder.repoName;
            this.chain = builder.chain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChainInstances create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return chainInstanceId
         */
        public String getChainInstanceId() {
            return this.chainInstanceId;
        }

        /**
         * @return repoNamespaceName
         */
        public String getRepoNamespaceName() {
            return this.repoNamespaceName;
        }

        /**
         * @return repoName
         */
        public String getRepoName() {
            return this.repoName;
        }

        /**
         * @return chain
         */
        public Chain getChain() {
            return this.chain;
        }

        public static final class Builder {
            private Long endTime; 
            private String status; 
            private Long startTime; 
            private String result; 
            private String chainInstanceId; 
            private String repoNamespaceName; 
            private String repoName; 
            private Chain chain; 

            /**
             * <p>Completion time</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The execution status of the delivery chain. Valid values:

-"RUNNING": Running
-"COMPLETE": Completed
-"CANCELING": Canceling
-"CANCELED": Canceled
</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Start time</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The delivery chain execution result. Valid values:

-"SUCCESS": Successful
-"FAILED": Failed
-"CANCELED": Cancel
-"DENIED": Block</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>Delivery chain instance ID</p>
             */
            public Builder chainInstanceId(String chainInstanceId) {
                this.chainInstanceId = chainInstanceId;
                return this;
            }

            /**
             * <p>Namespace</p>
             */
            public Builder repoNamespaceName(String repoNamespaceName) {
                this.repoNamespaceName = repoNamespaceName;
                return this;
            }

            /**
             * <p>Repository name</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * <p>Delivery chain execution records</p>
             */
            public Builder chain(Chain chain) {
                this.chain = chain;
                return this;
            }

            public ChainInstances build() {
                return new ChainInstances(this);
            } 

        } 

    }
}
