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
         * ClassCode.
         */
        public Builder classCode(String classCode) {
            this.classCode = classCode;
            return this;
        }

        /**
         * CreateTime.
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
         * DbType.
         */
        public Builder dbType(String dbType) {
            this.dbType = dbType;
            return this;
        }

        /**
         * Endpoints.
         */
        public Builder endpoints(java.util.List<Endpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        /**
         * ExpireTime.
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * Expired.
         */
        public Builder expired(Boolean expired) {
            this.expired = expired;
            return this;
        }

        /**
         * GwClusterId.
         */
        public Builder gwClusterId(String gwClusterId) {
            this.gwClusterId = gwClusterId;
            return this;
        }

        /**
         * GwDescription.
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
         * ModifyTime.
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * PayType.
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Id of the request</p>
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
         * SecurityIPArrays.
         */
        public Builder securityIPArrays(java.util.List<SecurityIPArrays> securityIPArrays) {
            this.securityIPArrays = securityIPArrays;
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
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * VpcId.
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
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * EndpointId.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * GwClusterId.
             */
            public Builder gwClusterId(String gwClusterId) {
                this.gwClusterId = gwClusterId;
                return this;
            }

            /**
             * NetType.
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * TunnelId.
             */
            public Builder tunnelId(String tunnelId) {
                this.tunnelId = tunnelId;
                return this;
            }

            /**
             * VpcId.
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
             * SecurityIPArrayName.
             */
            public Builder securityIPArrayName(String securityIPArrayName) {
                this.securityIPArrayName = securityIPArrayName;
                return this;
            }

            /**
             * SecurityIPArrayTag.
             */
            public Builder securityIPArrayTag(String securityIPArrayTag) {
                this.securityIPArrayTag = securityIPArrayTag;
                return this;
            }

            /**
             * SecurityIPList.
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
