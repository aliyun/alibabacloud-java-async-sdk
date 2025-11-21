// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.milvus20231012.models;

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
 * {@link InstanceDetail} extends {@link TeaModel}
 *
 * <p>InstanceDetail</p>
 */
public class InstanceDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("autoBackup")
    private Boolean autoBackup;

    @com.aliyun.core.annotation.NameInMap("components")
    private java.util.List<Components> components;

    @com.aliyun.core.annotation.NameInMap("configuration")
    private String configuration;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("dbVersion")
    private String dbVersion;

    @com.aliyun.core.annotation.NameInMap("encrypted")
    private Boolean encrypted;

    @com.aliyun.core.annotation.NameInMap("expireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("ha")
    private Boolean ha;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("instanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("kmsKeyId")
    private String kmsKeyId;

    @com.aliyun.core.annotation.NameInMap("multiZoneMode")
    private String multiZoneMode;

    @com.aliyun.core.annotation.NameInMap("orderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("paymentType")
    private String paymentType;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("runningTime")
    private Long runningTime;

    @com.aliyun.core.annotation.NameInMap("securityGroupIds")
    private java.util.List<String> securityGroupIds;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.NameInMap("vSwitchIds")
    private java.util.List<VSwitchIds> vSwitchIds;

    @com.aliyun.core.annotation.NameInMap("vpcId")
    private String vpcId;

    @com.aliyun.core.annotation.NameInMap("zoneId")
    private String zoneId;

    private InstanceDetail(Builder builder) {
        this.autoBackup = builder.autoBackup;
        this.components = builder.components;
        this.configuration = builder.configuration;
        this.createTime = builder.createTime;
        this.dbVersion = builder.dbVersion;
        this.encrypted = builder.encrypted;
        this.expireTime = builder.expireTime;
        this.ha = builder.ha;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.kmsKeyId = builder.kmsKeyId;
        this.multiZoneMode = builder.multiZoneMode;
        this.orderId = builder.orderId;
        this.paymentType = builder.paymentType;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.runningTime = builder.runningTime;
        this.securityGroupIds = builder.securityGroupIds;
        this.status = builder.status;
        this.tags = builder.tags;
        this.vSwitchIds = builder.vSwitchIds;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstanceDetail create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoBackup
     */
    public Boolean getAutoBackup() {
        return this.autoBackup;
    }

    /**
     * @return components
     */
    public java.util.List<Components> getComponents() {
        return this.components;
    }

    /**
     * @return configuration
     */
    public String getConfiguration() {
        return this.configuration;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return dbVersion
     */
    public String getDbVersion() {
        return this.dbVersion;
    }

    /**
     * @return encrypted
     */
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return ha
     */
    public Boolean getHa() {
        return this.ha;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return kmsKeyId
     */
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * @return multiZoneMode
     */
    public String getMultiZoneMode() {
        return this.multiZoneMode;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return runningTime
     */
    public Long getRunningTime() {
        return this.runningTime;
    }

    /**
     * @return securityGroupIds
     */
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return vSwitchIds
     */
    public java.util.List<VSwitchIds> getVSwitchIds() {
        return this.vSwitchIds;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private Boolean autoBackup; 
        private java.util.List<Components> components; 
        private String configuration; 
        private String createTime; 
        private String dbVersion; 
        private Boolean encrypted; 
        private String expireTime; 
        private Boolean ha; 
        private String instanceId; 
        private String instanceName; 
        private String kmsKeyId; 
        private String multiZoneMode; 
        private String orderId; 
        private String paymentType; 
        private String regionId; 
        private String resourceGroupId; 
        private Long runningTime; 
        private java.util.List<String> securityGroupIds; 
        private String status; 
        private java.util.List<Tags> tags; 
        private java.util.List<VSwitchIds> vSwitchIds; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
        } 

        private Builder(InstanceDetail model) {
            this.autoBackup = model.autoBackup;
            this.components = model.components;
            this.configuration = model.configuration;
            this.createTime = model.createTime;
            this.dbVersion = model.dbVersion;
            this.encrypted = model.encrypted;
            this.expireTime = model.expireTime;
            this.ha = model.ha;
            this.instanceId = model.instanceId;
            this.instanceName = model.instanceName;
            this.kmsKeyId = model.kmsKeyId;
            this.multiZoneMode = model.multiZoneMode;
            this.orderId = model.orderId;
            this.paymentType = model.paymentType;
            this.regionId = model.regionId;
            this.resourceGroupId = model.resourceGroupId;
            this.runningTime = model.runningTime;
            this.securityGroupIds = model.securityGroupIds;
            this.status = model.status;
            this.tags = model.tags;
            this.vSwitchIds = model.vSwitchIds;
            this.vpcId = model.vpcId;
            this.zoneId = model.zoneId;
        } 

        /**
         * autoBackup.
         */
        public Builder autoBackup(Boolean autoBackup) {
            this.autoBackup = autoBackup;
            return this;
        }

        /**
         * components.
         */
        public Builder components(java.util.List<Components> components) {
            this.components = components;
            return this;
        }

        /**
         * configuration.
         */
        public Builder configuration(String configuration) {
            this.configuration = configuration;
            return this;
        }

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * dbVersion.
         */
        public Builder dbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            return this;
        }

        /**
         * encrypted.
         */
        public Builder encrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * ha.
         */
        public Builder ha(Boolean ha) {
            this.ha = ha;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * instanceName.
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * kmsKeyId.
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * multiZoneMode.
         */
        public Builder multiZoneMode(String multiZoneMode) {
            this.multiZoneMode = multiZoneMode;
            return this;
        }

        /**
         * orderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * paymentType.
         */
        public Builder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * resourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * runningTime.
         */
        public Builder runningTime(Long runningTime) {
            this.runningTime = runningTime;
            return this;
        }

        /**
         * securityGroupIds.
         */
        public Builder securityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * tags.
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * vSwitchIds.
         */
        public Builder vSwitchIds(java.util.List<VSwitchIds> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        /**
         * vpcId.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * zoneId.
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public InstanceDetail build() {
            return new InstanceDetail(this);
        } 

    } 

    /**
     * 
     * {@link InstanceDetail} extends {@link TeaModel}
     *
     * <p>InstanceDetail</p>
     */
    public static class Components extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cuNum")
        private Integer cuNum;

        @com.aliyun.core.annotation.NameInMap("cuType")
        private String cuType;

        @com.aliyun.core.annotation.NameInMap("diskSizeType")
        private String diskSizeType;

        @com.aliyun.core.annotation.NameInMap("replica")
        private Integer replica;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Components(Builder builder) {
            this.cuNum = builder.cuNum;
            this.cuType = builder.cuType;
            this.diskSizeType = builder.diskSizeType;
            this.replica = builder.replica;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Components create() {
            return builder().build();
        }

        /**
         * @return cuNum
         */
        public Integer getCuNum() {
            return this.cuNum;
        }

        /**
         * @return cuType
         */
        public String getCuType() {
            return this.cuType;
        }

        /**
         * @return diskSizeType
         */
        public String getDiskSizeType() {
            return this.diskSizeType;
        }

        /**
         * @return replica
         */
        public Integer getReplica() {
            return this.replica;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer cuNum; 
            private String cuType; 
            private String diskSizeType; 
            private Integer replica; 
            private String type; 

            private Builder() {
            } 

            private Builder(Components model) {
                this.cuNum = model.cuNum;
                this.cuType = model.cuType;
                this.diskSizeType = model.diskSizeType;
                this.replica = model.replica;
                this.type = model.type;
            } 

            /**
             * cuNum.
             */
            public Builder cuNum(Integer cuNum) {
                this.cuNum = cuNum;
                return this;
            }

            /**
             * cuType.
             */
            public Builder cuType(String cuType) {
                this.cuType = cuType;
                return this;
            }

            /**
             * diskSizeType.
             */
            public Builder diskSizeType(String diskSizeType) {
                this.diskSizeType = diskSizeType;
                return this;
            }

            /**
             * replica.
             */
            public Builder replica(Integer replica) {
                this.replica = replica;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Components build() {
                return new Components(this);
            } 

        } 

    }
    /**
     * 
     * {@link InstanceDetail} extends {@link TeaModel}
     *
     * <p>InstanceDetail</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link InstanceDetail} extends {@link TeaModel}
     *
     * <p>InstanceDetail</p>
     */
    public static class VSwitchIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("vswId")
        private String vswId;

        @com.aliyun.core.annotation.NameInMap("zoneId")
        private String zoneId;

        private VSwitchIds(Builder builder) {
            this.vswId = builder.vswId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitchIds create() {
            return builder().build();
        }

        /**
         * @return vswId
         */
        public String getVswId() {
            return this.vswId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String vswId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(VSwitchIds model) {
                this.vswId = model.vswId;
                this.zoneId = model.zoneId;
            } 

            /**
             * vswId.
             */
            public Builder vswId(String vswId) {
                this.vswId = vswId;
                return this;
            }

            /**
             * zoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public VSwitchIds build() {
                return new VSwitchIds(this);
            } 

        } 

    }
}
