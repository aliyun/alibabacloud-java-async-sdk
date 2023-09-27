// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListChainInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ListChainInstanceResponseBody</p>
 */
public class ListChainInstanceResponseBody extends TeaModel {
    @NameInMap("ChainInstances")
    private java.util.List < ChainInstances> chainInstances;

    @NameInMap("Code")
    private String code;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListChainInstanceResponseBody(Builder builder) {
        this.chainInstances = builder.chainInstances;
        this.code = builder.code;
        this.instanceId = builder.instanceId;
        this.isSuccess = builder.isSuccess;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChainInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return chainInstances
     */
    public java.util.List < ChainInstances> getChainInstances() {
        return this.chainInstances;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
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
        private java.util.List < ChainInstances> chainInstances; 
        private String code; 
        private String instanceId; 
        private Boolean isSuccess; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The number of entries to return on each page.
         */
        public Builder chainInstances(java.util.List < ChainInstances> chainInstances) {
            this.chainInstances = chainInstances;
            return this;
        }

        /**
         * The version of the delivery chain.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The page number of the page to return.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The execution record of the delivery chain.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * 30
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * Indicates whether the operation is successful.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the Container Registry instance.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The name of the repository.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
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
             * The name of the namespace.
             */
            public Builder chainId(String chainId) {
                this.chainId = chainId;
                return this;
            }

            /**
             * The number of entries returned on each page.
             */
            public Builder chainName(String chainName) {
                this.chainName = chainName;
                return this;
            }

            /**
             * The ID of the request.
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
        @NameInMap("Chain")
        private Chain chain;

        @NameInMap("ChainInstanceId")
        private String chainInstanceId;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("RepoName")
        private String repoName;

        @NameInMap("RepoNamespaceName")
        private String repoNamespaceName;

        @NameInMap("Result")
        private String result;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        private ChainInstances(Builder builder) {
            this.chain = builder.chain;
            this.chainInstanceId = builder.chainInstanceId;
            this.endTime = builder.endTime;
            this.repoName = builder.repoName;
            this.repoNamespaceName = builder.repoNamespaceName;
            this.result = builder.result;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChainInstances create() {
            return builder().build();
        }

        /**
         * @return chain
         */
        public Chain getChain() {
            return this.chain;
        }

        /**
         * @return chainInstanceId
         */
        public String getChainInstanceId() {
            return this.chainInstanceId;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return repoName
         */
        public String getRepoName() {
            return this.repoName;
        }

        /**
         * @return repoNamespaceName
         */
        public String getRepoNamespaceName() {
            return this.repoNamespaceName;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Chain chain; 
            private String chainInstanceId; 
            private Long endTime; 
            private String repoName; 
            private String repoNamespaceName; 
            private String result; 
            private Long startTime; 
            private String status; 

            /**
             * The name of the namespace.
             */
            public Builder chain(Chain chain) {
                this.chain = chain;
                return this;
            }

            /**
             * 1
             */
            public Builder chainInstanceId(String chainInstanceId) {
                this.chainInstanceId = chainInstanceId;
                return this;
            }

            /**
             * The ID of the Container Registry instance.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The ID of the delivery chain.
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * The execution result of the delivery chain. Valid values:
             * <p>
             * 
             * *   `SUCCESS`
             * *   `FAILED`
             * *   `CANCELED`
             * *   `DENIED`
             */
            public Builder repoNamespaceName(String repoNamespaceName) {
                this.repoNamespaceName = repoNamespaceName;
                return this;
            }

            /**
             * The list of the execution records of delivery chains.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * test-repo
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The status of the delivery chain. Valid values:
             * <p>
             * 
             * *   `RUNNING`
             * *   `COMPLETE`
             * *   `CANCELING`
             * *   `CANCELED`
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ChainInstances build() {
                return new ChainInstances(this);
            } 

        } 

    }
}
