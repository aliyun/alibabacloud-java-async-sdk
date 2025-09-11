// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

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
 * {@link GetInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceResponseBody</p>
 */
public class GetInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instance")
    private Instance instance;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetInstanceResponseBody(Builder builder) {
        this.instance = builder.instance;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instance
     */
    public Instance getInstance() {
        return this.instance;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Instance instance; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetInstanceResponseBody model) {
            this.instance = model.instance;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the HSM.</p>
         */
        public Builder instance(Instance instance) {
            this.instance = instance;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4C467B38-3910-447D-87BC-AC049166F216</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceResponseBody build() {
            return new GetInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DeviceType")
        private String deviceType;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("IsTrial")
        private Boolean isTrial;

        @com.aliyun.core.annotation.NameInMap("Master")
        private Boolean master;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("PqcEnabled")
        private Integer pqcEnabled;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TenantIsolationType")
        private String tenantIsolationType;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private String vendor;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("Whitelist")
        private String whitelist;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Instance(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.createTime = builder.createTime;
            this.deviceType = builder.deviceType;
            this.expireTime = builder.expireTime;
            this.instanceId = builder.instanceId;
            this.ip = builder.ip;
            this.isTrial = builder.isTrial;
            this.master = builder.master;
            this.orderId = builder.orderId;
            this.pqcEnabled = builder.pqcEnabled;
            this.regionId = builder.regionId;
            this.remark = builder.remark;
            this.status = builder.status;
            this.tenantIsolationType = builder.tenantIsolationType;
            this.vSwitchId = builder.vSwitchId;
            this.vendor = builder.vendor;
            this.vpcId = builder.vpcId;
            this.whitelist = builder.whitelist;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return isTrial
         */
        public Boolean getIsTrial() {
            return this.isTrial;
        }

        /**
         * @return master
         */
        public Boolean getMaster() {
            return this.master;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return pqcEnabled
         */
        public Integer getPqcEnabled() {
            return this.pqcEnabled;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tenantIsolationType
         */
        public String getTenantIsolationType() {
            return this.tenantIsolationType;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return whitelist
         */
        public String getWhitelist() {
            return this.whitelist;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String clusterId; 
            private String clusterName; 
            private Long createTime; 
            private String deviceType; 
            private Long expireTime; 
            private String instanceId; 
            private String ip; 
            private Boolean isTrial; 
            private Boolean master; 
            private String orderId; 
            private Integer pqcEnabled; 
            private String regionId; 
            private String remark; 
            private String status; 
            private String tenantIsolationType; 
            private String vSwitchId; 
            private String vendor; 
            private String vpcId; 
            private String whitelist; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(Instance model) {
                this.clusterId = model.clusterId;
                this.clusterName = model.clusterName;
                this.createTime = model.createTime;
                this.deviceType = model.deviceType;
                this.expireTime = model.expireTime;
                this.instanceId = model.instanceId;
                this.ip = model.ip;
                this.isTrial = model.isTrial;
                this.master = model.master;
                this.orderId = model.orderId;
                this.pqcEnabled = model.pqcEnabled;
                this.regionId = model.regionId;
                this.remark = model.remark;
                this.status = model.status;
                this.tenantIsolationType = model.tenantIsolationType;
                this.vSwitchId = model.vSwitchId;
                this.vendor = model.vendor;
                this.vpcId = model.vpcId;
                this.whitelist = model.whitelist;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The ID of the cluster to which the HSM belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cluster-w3G9vOJI2****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cluster_online</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The time when the HSM was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1699515963000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The type of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>jnta.SJJ1528-G</p>
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * <p>The time when the HSM expired.</p>
             * 
             * <strong>example:</strong>
             * <p>1699496389720</p>
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The ID of the HSM.</p>
             * 
             * <strong>example:</strong>
             * <p>hsm-cn-g4t3jwsc****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The IP address of the HSM in the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>10.192.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>Indicates whether the HSM is for trial use. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isTrial(Boolean isTrial) {
                this.isTrial = isTrial;
                return this;
            }

            /**
             * <p>Indicates whether the HSM is a master HSM. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder master(Boolean master) {
                this.master = master;
                return this;
            }

            /**
             * <p>The ID of the order.</p>
             * 
             * <strong>example:</strong>
             * <p>23576634952****</p>
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * PqcEnabled.
             */
            public Builder pqcEnabled(Integer pqcEnabled) {
                this.pqcEnabled = pqcEnabled;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The description of the HSM.</p>
             * 
             * <strong>example:</strong>
             * <p>hsmOnline</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The status of the HSM. Valid values:</p>
             * <ul>
             * <li>PENDING: The HSM is disabled.</li>
             * <li>ACTIVE: The HSM is enabled.</li>
             * <li>EXPIRED: The HSM expired.</li>
             * <li>INVALID: The HSM is invalid.</li>
             * <li>FAILURE: The HSM failed to be created.</li>
             * <li>RESET: The HSM is being reset.</li>
             * <li>PAUSED: The HSM is paused.</li>
             * <li>MODIFYING: The HSM is being modified.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EXPIRED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of HSMs that is classified based on resource isolation. Valid values: </p>
             * <ul>
             * <li>vsm: Virtual security modules (VSMs)</li>
             * <li>hostedHsm: Dedicated HSMs.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>vsm</p>
             */
            public Builder tenantIsolationType(String tenantIsolationType) {
                this.tenantIsolationType = tenantIsolationType;
                return this;
            }

            /**
             * <p>The ID of the vSwitch that is configured for the HSM.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1mvfs31ltt0wyhf****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The information about the vendor.</p>
             * 
             * <strong>example:</strong>
             * <p>jnta</p>
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC) to which the HSM belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-uf69i66j9kmoko52p****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The IP addresses in the whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>18.68.XX.XX</p>
             */
            public Builder whitelist(String whitelist) {
                this.whitelist = whitelist;
                return this;
            }

            /**
             * <p>The ID of the zone.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-b</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
}
