// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tablestore20201209.models;

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
 * {@link ListVpcInfoByAgentStorageResponseBody} extends {@link TeaModel}
 *
 * <p>ListVpcInfoByAgentStorageResponseBody</p>
 */
public class ListVpcInfoByAgentStorageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgentStorageName")
    private String agentStorageName;

    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Long pageNum;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("VpcInfos")
    private java.util.List<VpcInfos> vpcInfos;

    private ListVpcInfoByAgentStorageResponseBody(Builder builder) {
        this.agentStorageName = builder.agentStorageName;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vpcInfos = builder.vpcInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpcInfoByAgentStorageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentStorageName
     */
    public String getAgentStorageName() {
        return this.agentStorageName;
    }

    /**
     * @return pageNum
     */
    public Long getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return vpcInfos
     */
    public java.util.List<VpcInfos> getVpcInfos() {
        return this.vpcInfos;
    }

    public static final class Builder {
        private String agentStorageName; 
        private Long pageNum; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 
        private java.util.List<VpcInfos> vpcInfos; 

        private Builder() {
        } 

        private Builder(ListVpcInfoByAgentStorageResponseBody model) {
            this.agentStorageName = model.agentStorageName;
            this.pageNum = model.pageNum;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.vpcInfos = model.vpcInfos;
        } 

        /**
         * AgentStorageName.
         */
        public Builder agentStorageName(String agentStorageName) {
            this.agentStorageName = agentStorageName;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * VpcInfos.
         */
        public Builder vpcInfos(java.util.List<VpcInfos> vpcInfos) {
            this.vpcInfos = vpcInfos;
            return this;
        }

        public ListVpcInfoByAgentStorageResponseBody build() {
            return new ListVpcInfoByAgentStorageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVpcInfoByAgentStorageResponseBody} extends {@link TeaModel}
     *
     * <p>ListVpcInfoByAgentStorageResponseBody</p>
     */
    public static class VpcInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentStorageVpcName")
        private String agentStorageVpcName;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private VpcInfos(Builder builder) {
            this.agentStorageVpcName = builder.agentStorageVpcName;
            this.domain = builder.domain;
            this.endpoint = builder.endpoint;
            this.regionNo = builder.regionNo;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcInfos create() {
            return builder().build();
        }

        /**
         * @return agentStorageVpcName
         */
        public String getAgentStorageVpcName() {
            return this.agentStorageVpcName;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String agentStorageVpcName; 
            private String domain; 
            private String endpoint; 
            private String regionNo; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(VpcInfos model) {
                this.agentStorageVpcName = model.agentStorageVpcName;
                this.domain = model.domain;
                this.endpoint = model.endpoint;
                this.regionNo = model.regionNo;
                this.vpcId = model.vpcId;
            } 

            /**
             * AgentStorageVpcName.
             */
            public Builder agentStorageVpcName(String agentStorageVpcName) {
                this.agentStorageVpcName = agentStorageVpcName;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * RegionNo.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * <p>VPC ID</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2z***********n7w3dl</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public VpcInfos build() {
                return new VpcInfos(this);
            } 

        } 

    }
}
