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
 * {@link ListChainResponseBody} extends {@link TeaModel}
 *
 * <p>ListChainResponseBody</p>
 */
public class ListChainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Chains")
    private java.util.List<Chains> chains;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chains
     */
    public java.util.List<Chains> getChains() {
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
        private java.util.List<Chains> chains; 
        private String code; 
        private Boolean isSuccess; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListChainResponseBody model) {
            this.chains = model.chains;
            this.code = model.code;
            this.isSuccess = model.isSuccess;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of delivery chains.</p>
         */
        public Builder chains(java.util.List<Chains> chains) {
            this.chains = chains;
            return this;
        }

        /**
         * <p>The return value.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>85A99B10-3926-5201-958E-C06FA47F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of delivery chains.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListChainResponseBody build() {
            return new ListChainResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListChainResponseBody} extends {@link TeaModel}
     *
     * <p>ListChainResponseBody</p>
     */
    public static class Chains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChainId")
        private String chainId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private Long modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ScopeExclude")
        private java.util.List<String> scopeExclude;

        @com.aliyun.core.annotation.NameInMap("ScopeId")
        private String scopeId;

        @com.aliyun.core.annotation.NameInMap("ScopeType")
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
        public java.util.List<String> getScopeExclude() {
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
            private java.util.List<String> scopeExclude; 
            private String scopeId; 
            private String scopeType; 

            private Builder() {
            } 

            private Builder(Chains model) {
                this.chainId = model.chainId;
                this.createTime = model.createTime;
                this.description = model.description;
                this.instanceId = model.instanceId;
                this.modifiedTime = model.modifiedTime;
                this.name = model.name;
                this.scopeExclude = model.scopeExclude;
                this.scopeId = model.scopeId;
                this.scopeType = model.scopeType;
            } 

            /**
             * <p>The ID of the delivery chain.</p>
             * 
             * <strong>example:</strong>
             * <p>chi-0ops0gsmw5x2****</p>
             */
            public Builder chainId(String chainId) {
                this.chainId = chainId;
                return this;
            }

            /**
             * <p>The time when the delivery chain was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1638255427000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the delivery chain.</p>
             * 
             * <strong>example:</strong>
             * <p>description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-4cdrlqmhn4gm****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The time when the delivery chain was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1638259914000</p>
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The name of the delivery chain.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Repositories to which the delivery chain does not apply.</p>
             */
            public Builder scopeExclude(java.util.List<String> scopeExclude) {
                this.scopeExclude = scopeExclude;
                return this;
            }

            /**
             * <p>The ID of the delivery chain scope.</p>
             * 
             * <strong>example:</strong>
             * <p>crr-nyrh2oko32xb****</p>
             */
            public Builder scopeId(String scopeId) {
                this.scopeId = scopeId;
                return this;
            }

            /**
             * <p>The type of the delivery chain scope.</p>
             * 
             * <strong>example:</strong>
             * <p>REPOSITORY</p>
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
