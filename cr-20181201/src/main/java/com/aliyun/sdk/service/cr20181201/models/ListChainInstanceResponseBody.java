// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link ListChainInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ListChainInstanceResponseBody</p>
 */
public class ListChainInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChainInstances")
    private java.util.List<ChainInstances> chainInstances;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chainInstances
     */
    public java.util.List<ChainInstances> getChainInstances() {
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
        private java.util.List<ChainInstances> chainInstances; 
        private String code; 
        private String instanceId; 
        private Boolean isSuccess; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListChainInstanceResponseBody model) {
            this.chainInstances = model.chainInstances;
            this.code = model.code;
            this.instanceId = model.instanceId;
            this.isSuccess = model.isSuccess;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The number of entries to return on each page.</p>
         */
        public Builder chainInstances(java.util.List<ChainInstances> chainInstances) {
            this.chainInstances = chainInstances;
            return this;
        }

        /**
         * <p>The version of the delivery chain.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The page number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-kmsiwlxxdcva****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The execution record of the delivery chain.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>30</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>Indicates whether the operation is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the Container Registry instance.</p>
         * 
         * <strong>example:</strong>
         * <p>838D1602-6D8F-47FB-B60A-656645D2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The name of the repository.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListChainInstanceResponseBody build() {
            return new ListChainInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListChainInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ListChainInstanceResponseBody</p>
     */
    public static class Chain extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChainId")
        private String chainId;

        @com.aliyun.core.annotation.NameInMap("ChainName")
        private String chainName;

        @com.aliyun.core.annotation.NameInMap("Version")
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

            private Builder() {
            } 

            private Builder(Chain model) {
                this.chainId = model.chainId;
                this.chainName = model.chainName;
                this.version = model.version;
            } 

            /**
             * <p>The name of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>chi-m42gbku0****</p>
             */
            public Builder chainId(String chainId) {
                this.chainId = chainId;
                return this;
            }

            /**
             * <p>The number of entries returned on each page.</p>
             * 
             * <strong>example:</strong>
             * <p>test-chain</p>
             */
            public Builder chainName(String chainName) {
                this.chainName = chainName;
                return this;
            }

            /**
             * <p>The ID of the request.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link ListChainInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ListChainInstanceResponseBody</p>
     */
    public static class ChainInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Chain")
        private Chain chain;

        @com.aliyun.core.annotation.NameInMap("ChainInstanceId")
        private String chainInstanceId;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("RepoName")
        private String repoName;

        @com.aliyun.core.annotation.NameInMap("RepoNamespaceName")
        private String repoNamespaceName;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(ChainInstances model) {
                this.chain = model.chain;
                this.chainInstanceId = model.chainInstanceId;
                this.endTime = model.endTime;
                this.repoName = model.repoName;
                this.repoNamespaceName = model.repoNamespaceName;
                this.result = model.result;
                this.startTime = model.startTime;
                this.status = model.status;
            } 

            /**
             * <p>The name of the namespace.</p>
             */
            public Builder chain(Chain chain) {
                this.chain = chain;
                return this;
            }

            /**
             * <p>1</p>
             * 
             * <strong>example:</strong>
             * <p>F4CF4DDB-BEF2-5575-<strong><strong>-</strong></strong>***</p>
             */
            public Builder chainInstanceId(String chainInstanceId) {
                this.chainInstanceId = chainInstanceId;
                return this;
            }

            /**
             * <p>The ID of the Container Registry instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1636685856000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The ID of the delivery chain.</p>
             * 
             * <strong>example:</strong>
             * <p>test-repo</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * <p>The execution result of the delivery chain. Valid values:</p>
             * <ul>
             * <li><code>SUCCESS</code></li>
             * <li><code>FAILED</code></li>
             * <li><code>CANCELED</code></li>
             * <li><code>DENIED</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>test-ns</p>
             */
            public Builder repoNamespaceName(String repoNamespaceName) {
                this.repoNamespaceName = repoNamespaceName;
                return this;
            }

            /**
             * <p>The list of the execution records of delivery chains.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>test-repo</p>
             * 
             * <strong>example:</strong>
             * <p>1636685776000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the delivery chain. Valid values:</p>
             * <ul>
             * <li><code>RUNNING</code></li>
             * <li><code>COMPLETE</code></li>
             * <li><code>CANCELING</code></li>
             * <li><code>CANCELED</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>COMPLETE</p>
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
