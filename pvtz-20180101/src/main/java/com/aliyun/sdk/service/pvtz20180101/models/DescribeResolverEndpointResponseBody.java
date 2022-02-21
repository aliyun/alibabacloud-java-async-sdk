// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResolverEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResolverEndpointResponseBody</p>
 */
public class DescribeResolverEndpointResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("CreateTimestamp")
    private Long createTimestamp;

    @NameInMap("Id")
    private String id;

    @NameInMap("IpConfigs")
    private java.util.List < IpConfigs> ipConfigs;

    @NameInMap("Name")
    private String name;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @NameInMap("Status")
    private String status;

    @NameInMap("UpdateTime")
    private String updateTime;

    @NameInMap("UpdateTimestamp")
    private Long updateTimestamp;

    @NameInMap("VpcId")
    private String vpcId;

    @NameInMap("VpcName")
    private String vpcName;

    @NameInMap("VpcRegionId")
    private String vpcRegionId;

    @NameInMap("VpcRegionName")
    private String vpcRegionName;

    private DescribeResolverEndpointResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.createTimestamp = builder.createTimestamp;
        this.id = builder.id;
        this.ipConfigs = builder.ipConfigs;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.securityGroupId = builder.securityGroupId;
        this.status = builder.status;
        this.updateTime = builder.updateTime;
        this.updateTimestamp = builder.updateTimestamp;
        this.vpcId = builder.vpcId;
        this.vpcName = builder.vpcName;
        this.vpcRegionId = builder.vpcRegionId;
        this.vpcRegionName = builder.vpcRegionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResolverEndpointResponseBody create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return createTimestamp
     */
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return ipConfigs
     */
    public java.util.List < IpConfigs> getIpConfigs() {
        return this.ipConfigs;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return updateTimestamp
     */
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vpcName
     */
    public String getVpcName() {
        return this.vpcName;
    }

    /**
     * @return vpcRegionId
     */
    public String getVpcRegionId() {
        return this.vpcRegionId;
    }

    /**
     * @return vpcRegionName
     */
    public String getVpcRegionName() {
        return this.vpcRegionName;
    }

    public static final class Builder {
        private String createTime; 
        private Long createTimestamp; 
        private String id; 
        private java.util.List < IpConfigs> ipConfigs; 
        private String name; 
        private String requestId; 
        private String securityGroupId; 
        private String status; 
        private String updateTime; 
        private Long updateTimestamp; 
        private String vpcId; 
        private String vpcName; 
        private String vpcRegionId; 
        private String vpcRegionName; 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * CreateTimestamp.
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * IpConfigs.
         */
        public Builder ipConfigs(java.util.List < IpConfigs> ipConfigs) {
            this.ipConfigs = ipConfigs;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
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
         * SecurityGroupId.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * UpdateTimestamp.
         */
        public Builder updateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * VpcName.
         */
        public Builder vpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }

        /**
         * VpcRegionId.
         */
        public Builder vpcRegionId(String vpcRegionId) {
            this.vpcRegionId = vpcRegionId;
            return this;
        }

        /**
         * VpcRegionName.
         */
        public Builder vpcRegionName(String vpcRegionName) {
            this.vpcRegionName = vpcRegionName;
            return this;
        }

        public DescribeResolverEndpointResponseBody build() {
            return new DescribeResolverEndpointResponseBody(this);
        } 

    } 

    public static class IpConfigs extends TeaModel {
        @NameInMap("AzId")
        private String azId;

        @NameInMap("CidrBlock")
        private String cidrBlock;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        private IpConfigs(Builder builder) {
            this.azId = builder.azId;
            this.cidrBlock = builder.cidrBlock;
            this.ip = builder.ip;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpConfigs create() {
            return builder().build();
        }

        /**
         * @return azId
         */
        public String getAzId() {
            return this.azId;
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private String azId; 
            private String cidrBlock; 
            private String ip; 
            private String vSwitchId; 

            /**
             * AzId.
             */
            public Builder azId(String azId) {
                this.azId = azId;
                return this;
            }

            /**
             * CidrBlock.
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public IpConfigs build() {
                return new IpConfigs(this);
            } 

        } 

    }
}
