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
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoBackup")
    private Boolean autoBackup;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("components")
    private java.util.List<Components> components;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("configuration")
    private String configuration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dbAdminPassword")
    private String dbAdminPassword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dbVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("encrypted")
    private Boolean encrypted;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ha")
    private Boolean ha;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("kmsKeyId")
    private String kmsKeyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("multiZoneMode")
    private String multiZoneMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("paymentDuration")
    private Integer paymentDuration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("paymentDurationUnit")
    private String paymentDurationUnit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("paymentType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String paymentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vSwitchIds")
    private java.util.List<VSwitchIds> vSwitchIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("zoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.autoBackup = builder.autoBackup;
        this.components = builder.components;
        this.configuration = builder.configuration;
        this.dbAdminPassword = builder.dbAdminPassword;
        this.dbVersion = builder.dbVersion;
        this.encrypted = builder.encrypted;
        this.ha = builder.ha;
        this.instanceName = builder.instanceName;
        this.kmsKeyId = builder.kmsKeyId;
        this.multiZoneMode = builder.multiZoneMode;
        this.paymentDuration = builder.paymentDuration;
        this.paymentDurationUnit = builder.paymentDurationUnit;
        this.paymentType = builder.paymentType;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
        this.vSwitchIds = builder.vSwitchIds;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return dbAdminPassword
     */
    public String getDbAdminPassword() {
        return this.dbAdminPassword;
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
     * @return ha
     */
    public Boolean getHa() {
        return this.ha;
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
     * @return paymentDuration
     */
    public Integer getPaymentDuration() {
        return this.paymentDuration;
    }

    /**
     * @return paymentDurationUnit
     */
    public String getPaymentDurationUnit() {
        return this.paymentDurationUnit;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private String regionId; 
        private Boolean autoBackup; 
        private java.util.List<Components> components; 
        private String configuration; 
        private String dbAdminPassword; 
        private String dbVersion; 
        private Boolean encrypted; 
        private Boolean ha; 
        private String instanceName; 
        private String kmsKeyId; 
        private String multiZoneMode; 
        private Integer paymentDuration; 
        private String paymentDurationUnit; 
        private String paymentType; 
        private String resourceGroupId; 
        private java.util.List<Tags> tags; 
        private java.util.List<VSwitchIds> vSwitchIds; 
        private String vpcId; 
        private String zoneId; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.autoBackup = request.autoBackup;
            this.components = request.components;
            this.configuration = request.configuration;
            this.dbAdminPassword = request.dbAdminPassword;
            this.dbVersion = request.dbVersion;
            this.encrypted = request.encrypted;
            this.ha = request.ha;
            this.instanceName = request.instanceName;
            this.kmsKeyId = request.kmsKeyId;
            this.multiZoneMode = request.multiZoneMode;
            this.paymentDuration = request.paymentDuration;
            this.paymentDurationUnit = request.paymentDurationUnit;
            this.paymentType = request.paymentType;
            this.resourceGroupId = request.resourceGroupId;
            this.tags = request.tags;
            this.vSwitchIds = request.vSwitchIds;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
            this.clientToken = request.clientToken;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * autoBackup.
         */
        public Builder autoBackup(Boolean autoBackup) {
            this.putBodyParameter("autoBackup", autoBackup);
            this.autoBackup = autoBackup;
            return this;
        }

        /**
         * components.
         */
        public Builder components(java.util.List<Components> components) {
            this.putBodyParameter("components", components);
            this.components = components;
            return this;
        }

        /**
         * configuration.
         */
        public Builder configuration(String configuration) {
            this.putBodyParameter("configuration", configuration);
            this.configuration = configuration;
            return this;
        }

        /**
         * dbAdminPassword.
         */
        public Builder dbAdminPassword(String dbAdminPassword) {
            this.putBodyParameter("dbAdminPassword", dbAdminPassword);
            this.dbAdminPassword = dbAdminPassword;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2.4</p>
         */
        public Builder dbVersion(String dbVersion) {
            this.putBodyParameter("dbVersion", dbVersion);
            this.dbVersion = dbVersion;
            return this;
        }

        /**
         * encrypted.
         */
        public Builder encrypted(Boolean encrypted) {
            this.putBodyParameter("encrypted", encrypted);
            this.encrypted = encrypted;
            return this;
        }

        /**
         * ha.
         */
        public Builder ha(Boolean ha) {
            this.putBodyParameter("ha", ha);
            this.ha = ha;
            return this;
        }

        /**
         * instanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("instanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * kmsKeyId.
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.putBodyParameter("kmsKeyId", kmsKeyId);
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * multiZoneMode.
         */
        public Builder multiZoneMode(String multiZoneMode) {
            this.putBodyParameter("multiZoneMode", multiZoneMode);
            this.multiZoneMode = multiZoneMode;
            return this;
        }

        /**
         * paymentDuration.
         */
        public Builder paymentDuration(Integer paymentDuration) {
            this.putBodyParameter("paymentDuration", paymentDuration);
            this.paymentDuration = paymentDuration;
            return this;
        }

        /**
         * paymentDurationUnit.
         */
        public Builder paymentDurationUnit(String paymentDurationUnit) {
            this.putBodyParameter("paymentDurationUnit", paymentDurationUnit);
            this.paymentDurationUnit = paymentDurationUnit;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PayAsYouGo</p>
         */
        public Builder paymentType(String paymentType) {
            this.putBodyParameter("paymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * resourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * tags.
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * vSwitchIds.
         */
        public Builder vSwitchIds(java.util.List<VSwitchIds> vSwitchIds) {
            this.putBodyParameter("vSwitchIds", vSwitchIds);
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-123xxx</p>
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("vpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-g</p>
         */
        public Builder zoneId(String zoneId) {
            this.putBodyParameter("zoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
     */
    public static class Components extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cuNum")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer cuNum;

        @com.aliyun.core.annotation.NameInMap("cuType")
        private String cuType;

        @com.aliyun.core.annotation.NameInMap("diskSizeType")
        private String diskSizeType;

        @com.aliyun.core.annotation.NameInMap("replica")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer replica;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder replica(Integer replica) {
                this.replica = replica;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>standalone</p>
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
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
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
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-g</p>
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
