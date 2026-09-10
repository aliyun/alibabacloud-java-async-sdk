// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeGatewayAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGatewayAttributeResponseBody</p>
 */
public class DescribeGatewayAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClassCode")
    private String classCode;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CurrentVersion")
    private String currentVersion;

    @com.aliyun.core.annotation.NameInMap("DbType")
    private String dbType;

    @com.aliyun.core.annotation.NameInMap("Endpoints")
    private java.util.List<Endpoints> endpoints;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("Expired")
    private Boolean expired;

    @com.aliyun.core.annotation.NameInMap("GwClusterId")
    private String gwClusterId;

    @com.aliyun.core.annotation.NameInMap("GwDescription")
    private String gwDescription;

    @com.aliyun.core.annotation.NameInMap("LatestVersion")
    private String latestVersion;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private String modifyTime;

    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RunningVersion")
    private String runningVersion;

    @com.aliyun.core.annotation.NameInMap("SecurityIPArrays")
    private java.util.List<SecurityIPArrays> securityIPArrays;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private DescribeGatewayAttributeResponseBody(Builder builder) {
        this.classCode = builder.classCode;
        this.createTime = builder.createTime;
        this.currentVersion = builder.currentVersion;
        this.dbType = builder.dbType;
        this.endpoints = builder.endpoints;
        this.expireTime = builder.expireTime;
        this.expired = builder.expired;
        this.gwClusterId = builder.gwClusterId;
        this.gwDescription = builder.gwDescription;
        this.latestVersion = builder.latestVersion;
        this.modifyTime = builder.modifyTime;
        this.payType = builder.payType;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.runningVersion = builder.runningVersion;
        this.securityIPArrays = builder.securityIPArrays;
        this.status = builder.status;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewayAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return classCode
     */
    public String getClassCode() {
        return this.classCode;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return currentVersion
     */
    public String getCurrentVersion() {
        return this.currentVersion;
    }

    /**
     * @return dbType
     */
    public String getDbType() {
        return this.dbType;
    }

    /**
     * @return endpoints
     */
    public java.util.List<Endpoints> getEndpoints() {
        return this.endpoints;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return expired
     */
    public Boolean getExpired() {
        return this.expired;
    }

    /**
     * @return gwClusterId
     */
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    /**
     * @return gwDescription
     */
    public String getGwDescription() {
        return this.gwDescription;
    }

    /**
     * @return latestVersion
     */
    public String getLatestVersion() {
        return this.latestVersion;
    }

    /**
     * @return modifyTime
     */
    public String getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return runningVersion
     */
    public String getRunningVersion() {
        return this.runningVersion;
    }

    /**
     * @return securityIPArrays
     */
    public java.util.List<SecurityIPArrays> getSecurityIPArrays() {
        return this.securityIPArrays;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder {
        private String classCode; 
        private String createTime; 
        private String currentVersion; 
        private String dbType; 
        private java.util.List<Endpoints> endpoints; 
        private String expireTime; 
        private Boolean expired; 
        private String gwClusterId; 
        private String gwDescription; 
        private String latestVersion; 
        private String modifyTime; 
        private String payType; 
        private String regionId; 
        private String requestId; 
        private String runningVersion; 
        private java.util.List<SecurityIPArrays> securityIPArrays; 
        private String status; 
        private String vSwitchId; 
        private String vpcId; 

        private Builder() {
        } 

        private Builder(DescribeGatewayAttributeResponseBody model) {
            this.classCode = model.classCode;
            this.createTime = model.createTime;
            this.currentVersion = model.currentVersion;
            this.dbType = model.dbType;
            this.endpoints = model.endpoints;
            this.expireTime = model.expireTime;
            this.expired = model.expired;
            this.gwClusterId = model.gwClusterId;
            this.gwDescription = model.gwDescription;
            this.latestVersion = model.latestVersion;
            this.modifyTime = model.modifyTime;
            this.payType = model.payType;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.runningVersion = model.runningVersion;
            this.securityIPArrays = model.securityIPArrays;
            this.status = model.status;
            this.vSwitchId = model.vSwitchId;
            this.vpcId = model.vpcId;
        } 

        /**
         * <p>The specification code for the gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>polar.app.g2.medium</p>
         */
        public Builder classCode(String classCode) {
            this.classCode = classCode;
            return this;
        }

        /**
         * <p>The time when the gateway instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-02-24T11:57:54Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * CurrentVersion.
         */
        public Builder currentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }

        /**
         * <p>The database type.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder dbType(String dbType) {
            this.dbType = dbType;
            return this;
        }

        /**
         * <p>A list of endpoints for the gateway instance.</p>
         */
        public Builder endpoints(java.util.List<Endpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        /**
         * <p>The time when the subscription for the gateway instance expires.</p>
         * <p>This parameter is empty for pay-as-you-go instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2027-04-22T16:00:00Z</p>
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>Indicates whether the subscription for the gateway instance has expired. Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * </li>
         * <li><p>false</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder expired(Boolean expired) {
            this.expired = expired;
            return this;
        }

        /**
         * <p>The ID of the gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-xxxxxxx</p>
         */
        public Builder gwClusterId(String gwClusterId) {
            this.gwClusterId = gwClusterId;
            return this;
        }

        /**
         * <p>The description of the gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder gwDescription(String gwDescription) {
            this.gwDescription = gwDescription;
            return this;
        }

        /**
         * LatestVersion.
         */
        public Builder latestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }

        /**
         * <p>The time when the gateway instance was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-07T02:19:55Z</p>
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * <p>The billing method of the gateway instance. Valid values:</p>
         * <ul>
         * <li><p><strong>Postpaid</strong>: pay-as-you-go.</p>
         * </li>
         * <li><p><strong>Prepaid</strong>: subscription.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3E5CD764-FCCA-5C9C-838E-20E0DE84B2AF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RunningVersion.
         */
        public Builder runningVersion(String runningVersion) {
            this.runningVersion = runningVersion;
            return this;
        }

        /**
         * <p>A list of IP whitelists for the gateway instance.</p>
         */
        public Builder securityIPArrays(java.util.List<SecurityIPArrays> securityIPArrays) {
            this.securityIPArrays = securityIPArrays;
            return this;
        }

        /**
         * <p>The status of the gateway instance. Valid values:</p>
         * <ul>
         * <li><p><strong>CREATE</strong>: The gateway instance is being created.</p>
         * </li>
         * <li><p><strong>ACTIVATION</strong>: The gateway instance is running.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVATION</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the VSwitch where the gateway instance is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-*********************</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the VPC where the gateway instance is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-*************</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public DescribeGatewayAttributeResponseBody build() {
            return new DescribeGatewayAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGatewayAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGatewayAttributeResponseBody</p>
     */
    public static class Endpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("EndpointId")
        private String endpointId;

        @com.aliyun.core.annotation.NameInMap("GwClusterId")
        private String gwClusterId;

        @com.aliyun.core.annotation.NameInMap("NetType")
        private String netType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("TunnelId")
        private String tunnelId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private Endpoints(Builder builder) {
            this.address = builder.address;
            this.endpointId = builder.endpointId;
            this.gwClusterId = builder.gwClusterId;
            this.netType = builder.netType;
            this.port = builder.port;
            this.tunnelId = builder.tunnelId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return endpointId
         */
        public String getEndpointId() {
            return this.endpointId;
        }

        /**
         * @return gwClusterId
         */
        public String getGwClusterId() {
            return this.gwClusterId;
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return tunnelId
         */
        public String getTunnelId() {
            return this.tunnelId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String address; 
            private String endpointId; 
            private String gwClusterId; 
            private String netType; 
            private String port; 
            private String tunnelId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(Endpoints model) {
                this.address = model.address;
                this.endpointId = model.endpointId;
                this.gwClusterId = model.gwClusterId;
                this.netType = model.netType;
                this.port = model.port;
                this.tunnelId = model.tunnelId;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The endpoint address.</p>
             * 
             * <strong>example:</strong>
             * <p>pg-xxxxx.polardbaigateway.pre.rds.aliyuncs.com</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>The ID of the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * <p>The ID of the gateway instance.</p>
             * 
             * <strong>example:</strong>
             * <p>pg-xxxxxxx</p>
             */
            public Builder gwClusterId(String gwClusterId) {
                this.gwClusterId = gwClusterId;
                return this;
            }

            /**
             * <p>The network type of the endpoint. Valid values:</p>
             * <ul>
             * <li><p><strong>Private</strong>: VPC endpoint.</p>
             * </li>
             * <li><p><strong>Public</strong>: public endpoint.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Public</p>
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * <p>The port number.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The tunnel ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1874631</p>
             */
            public Builder tunnelId(String tunnelId) {
                this.tunnelId = tunnelId;
                return this;
            }

            /**
             * <p>The ID of the VPC to which the endpoint belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-*************</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGatewayAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGatewayAttributeResponseBody</p>
     */
    public static class SecurityIPArrays extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityIPArrayName")
        private String securityIPArrayName;

        @com.aliyun.core.annotation.NameInMap("SecurityIPArrayTag")
        private String securityIPArrayTag;

        @com.aliyun.core.annotation.NameInMap("SecurityIPList")
        private String securityIPList;

        private SecurityIPArrays(Builder builder) {
            this.securityIPArrayName = builder.securityIPArrayName;
            this.securityIPArrayTag = builder.securityIPArrayTag;
            this.securityIPList = builder.securityIPList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityIPArrays create() {
            return builder().build();
        }

        /**
         * @return securityIPArrayName
         */
        public String getSecurityIPArrayName() {
            return this.securityIPArrayName;
        }

        /**
         * @return securityIPArrayTag
         */
        public String getSecurityIPArrayTag() {
            return this.securityIPArrayTag;
        }

        /**
         * @return securityIPList
         */
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public static final class Builder {
            private String securityIPArrayName; 
            private String securityIPArrayTag; 
            private String securityIPList; 

            private Builder() {
            } 

            private Builder(SecurityIPArrays model) {
                this.securityIPArrayName = model.securityIPArrayName;
                this.securityIPArrayTag = model.securityIPArrayTag;
                this.securityIPList = model.securityIPList;
            } 

            /**
             * <p>The name of the IP whitelist. The default value is <code>default</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder securityIPArrayName(String securityIPArrayName) {
                this.securityIPArrayName = securityIPArrayName;
                return this;
            }

            /**
             * <p>The tag of the IP whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>mytag</p>
             */
            public Builder securityIPArrayTag(String securityIPArrayTag) {
                this.securityIPArrayTag = securityIPArrayTag;
                return this;
            }

            /**
             * <p>A comma-separated list of IP addresses in the IP whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>127.0.0.1</p>
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            public SecurityIPArrays build() {
                return new SecurityIPArrays(this);
            } 

        } 

    }
}
