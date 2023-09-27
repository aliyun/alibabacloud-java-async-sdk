// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListChainResponseBody} extends {@link TeaModel}
 *
 * <p>ListChainResponseBody</p>
 */
public class ListChainResponseBody extends TeaModel {
    @NameInMap("Chains")
    private java.util.List < Chains> chains;

    @NameInMap("Code")
    private String code;

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

    private ListChainResponseBody(Builder builder) {
        this.chains = builder.chains;
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChainResponseBody create() {
        return builder().build();
    }

    /**
     * @return chains
     */
    public java.util.List < Chains> getChains() {
        return this.chains;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
        private java.util.List < Chains> chains; 
        private String code; 
        private Boolean isSuccess; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The list of delivery chains.
         */
        public Builder chains(java.util.List < Chains> chains) {
            this.chains = chains;
            return this;
        }

        /**
         * The return value.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of delivery chains.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListChainResponseBody build() {
            return new ListChainResponseBody(this);
        } 

    } 

    public static class Chains extends TeaModel {
        @NameInMap("ChainId")
        private String chainId;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("ModifiedTime")
        private Long modifiedTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("ScopeExclude")
        private java.util.List < String > scopeExclude;

        @NameInMap("ScopeId")
        private String scopeId;

        @NameInMap("ScopeType")
        private String scopeType;

        private Chains(Builder builder) {
            this.chainId = builder.chainId;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.instanceId = builder.instanceId;
            this.modifiedTime = builder.modifiedTime;
            this.name = builder.name;
            this.scopeExclude = builder.scopeExclude;
            this.scopeId = builder.scopeId;
            this.scopeType = builder.scopeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Chains create() {
            return builder().build();
        }

        /**
         * @return chainId
         */
        public String getChainId() {
            return this.chainId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return scopeExclude
         */
        public java.util.List < String > getScopeExclude() {
            return this.scopeExclude;
        }

        /**
         * @return scopeId
         */
        public String getScopeId() {
            return this.scopeId;
        }

        /**
         * @return scopeType
         */
        public String getScopeType() {
            return this.scopeType;
        }

        public static final class Builder {
            private String chainId; 
            private Long createTime; 
            private String description; 
            private String instanceId; 
            private Long modifiedTime; 
            private String name; 
            private java.util.List < String > scopeExclude; 
            private String scopeId; 
            private String scopeType; 

            /**
             * The ID of the delivery chain.
             */
            public Builder chainId(String chainId) {
                this.chainId = chainId;
                return this;
            }

            /**
             * The time when the delivery chain was created.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the delivery chain.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The time when the delivery chain was last modified.
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * The name of the delivery chain.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Repositories to which the delivery chain does not apply.
             */
            public Builder scopeExclude(java.util.List < String > scopeExclude) {
                this.scopeExclude = scopeExclude;
                return this;
            }

            /**
             * The ID of the delivery chain scope.
             */
            public Builder scopeId(String scopeId) {
                this.scopeId = scopeId;
                return this;
            }

            /**
             * The type of the delivery chain scope.
             */
            public Builder scopeType(String scopeType) {
                this.scopeType = scopeType;
                return this;
            }

            public Chains build() {
                return new Chains(this);
            } 

        } 

    }
}
