// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ots20160620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpcInfoByInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ListVpcInfoByInstanceResponseBody</p>
 */
public class ListVpcInfoByInstanceResponseBody extends TeaModel {
    @NameInMap("InstanceName")
    private String instanceName;

    @NameInMap("PageNum")
    private Long pageNum;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    @NameInMap("VpcInfos")
    private VpcInfos vpcInfos;

    private ListVpcInfoByInstanceResponseBody(Builder builder) {
        this.instanceName = builder.instanceName;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vpcInfos = builder.vpcInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpcInfoByInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
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
    public VpcInfos getVpcInfos() {
        return this.vpcInfos;
    }

    public static final class Builder {
        private String instanceName; 
        private Long pageNum; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 
        private VpcInfos vpcInfos; 

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
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
        public Builder vpcInfos(VpcInfos vpcInfos) {
            this.vpcInfos = vpcInfos;
            return this;
        }

        public ListVpcInfoByInstanceResponseBody build() {
            return new ListVpcInfoByInstanceResponseBody(this);
        } 

    } 

    public static class VpcInfo extends TeaModel {
        @NameInMap("Domain")
        private String domain;

        @NameInMap("Endpoint")
        private String endpoint;

        @NameInMap("InstanceVpcName")
        private String instanceVpcName;

        @NameInMap("RegionNo")
        private String regionNo;

        @NameInMap("VpcId")
        private String vpcId;

        private VpcInfo(Builder builder) {
            this.domain = builder.domain;
            this.endpoint = builder.endpoint;
            this.instanceVpcName = builder.instanceVpcName;
            this.regionNo = builder.regionNo;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcInfo create() {
            return builder().build();
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
         * @return instanceVpcName
         */
        public String getInstanceVpcName() {
            return this.instanceVpcName;
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
            private String domain; 
            private String endpoint; 
            private String instanceVpcName; 
            private String regionNo; 
            private String vpcId; 

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
             * InstanceVpcName.
             */
            public Builder instanceVpcName(String instanceVpcName) {
                this.instanceVpcName = instanceVpcName;
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
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public VpcInfo build() {
                return new VpcInfo(this);
            } 

        } 

    }
    public static class VpcInfos extends TeaModel {
        @NameInMap("VpcInfo")
        private java.util.List < VpcInfo> vpcInfo;

        private VpcInfos(Builder builder) {
            this.vpcInfo = builder.vpcInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcInfos create() {
            return builder().build();
        }

        /**
         * @return vpcInfo
         */
        public java.util.List < VpcInfo> getVpcInfo() {
            return this.vpcInfo;
        }

        public static final class Builder {
            private java.util.List < VpcInfo> vpcInfo; 

            /**
             * VpcInfo.
             */
            public Builder vpcInfo(java.util.List < VpcInfo> vpcInfo) {
                this.vpcInfo = vpcInfo;
                return this;
            }

            public VpcInfos build() {
                return new VpcInfos(this);
            } 

        } 

    }
}
