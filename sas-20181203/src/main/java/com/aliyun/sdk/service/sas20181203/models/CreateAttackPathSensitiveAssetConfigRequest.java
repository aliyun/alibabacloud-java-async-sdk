// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link CreateAttackPathSensitiveAssetConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateAttackPathSensitiveAssetConfigRequest</p>
 */
public class CreateAttackPathSensitiveAssetConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttackPathAssetList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<AttackPathAssetList> attackPathAssetList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configType;

    private CreateAttackPathSensitiveAssetConfigRequest(Builder builder) {
        super(builder);
        this.attackPathAssetList = builder.attackPathAssetList;
        this.configType = builder.configType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAttackPathSensitiveAssetConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attackPathAssetList
     */
    public java.util.List<AttackPathAssetList> getAttackPathAssetList() {
        return this.attackPathAssetList;
    }

    /**
     * @return configType
     */
    public String getConfigType() {
        return this.configType;
    }

    public static final class Builder extends Request.Builder<CreateAttackPathSensitiveAssetConfigRequest, Builder> {
        private java.util.List<AttackPathAssetList> attackPathAssetList; 
        private String configType; 

        private Builder() {
            super();
        } 

        private Builder(CreateAttackPathSensitiveAssetConfigRequest request) {
            super(request);
            this.attackPathAssetList = request.attackPathAssetList;
            this.configType = request.configType;
        } 

        /**
         * <p>List of cloud product assets.</p>
         * <p>This parameter is required.</p>
         */
        public Builder attackPathAssetList(java.util.List<AttackPathAssetList> attackPathAssetList) {
            this.putQueryParameter("AttackPathAssetList", attackPathAssetList);
            this.attackPathAssetList = attackPathAssetList;
            return this;
        }

        /**
         * <p>Configuration type. Possible values:</p>
         * <ul>
         * <li>asset_instance: Asset.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asset_instance</p>
         */
        public Builder configType(String configType) {
            this.putQueryParameter("ConfigType", configType);
            this.configType = configType;
            return this;
        }

        @Override
        public CreateAttackPathSensitiveAssetConfigRequest build() {
            return new CreateAttackPathSensitiveAssetConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAttackPathSensitiveAssetConfigRequest} extends {@link TeaModel}
     *
     * <p>CreateAttackPathSensitiveAssetConfigRequest</p>
     */
    public static class AttackPathAssetList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetSubType")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer assetSubType;

        @com.aliyun.core.annotation.NameInMap("AssetType")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer assetType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer vendor;

        private AttackPathAssetList(Builder builder) {
            this.assetSubType = builder.assetSubType;
            this.assetType = builder.assetType;
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttackPathAssetList create() {
            return builder().build();
        }

        /**
         * @return assetSubType
         */
        public Integer getAssetSubType() {
            return this.assetSubType;
        }

        /**
         * @return assetType
         */
        public Integer getAssetType() {
            return this.assetType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return vendor
         */
        public Integer getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private Integer assetSubType; 
            private Integer assetType; 
            private String instanceId; 
            private String regionId; 
            private Integer vendor; 

            private Builder() {
            } 

            private Builder(AttackPathAssetList model) {
                this.assetSubType = model.assetSubType;
                this.assetType = model.assetType;
                this.instanceId = model.instanceId;
                this.regionId = model.regionId;
                this.vendor = model.vendor;
            } 

            /**
             * <p>Subtype of the cloud product asset.</p>
             * <blockquote>
             * <p>You can call <a href="~~ListCloudAssetInstances~~">ListCloudAssetInstances</a> to query the subtype of the cloud product asset.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder assetSubType(Integer assetSubType) {
                this.assetSubType = assetSubType;
                return this;
            }

            /**
             * <p>Type of the cloud product asset.</p>
             * <blockquote>
             * <p>You can call <a href="~~ListCloudAssetInstances~~">ListCloudAssetInstances</a> to query the type of the cloud product asset.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>17</p>
             */
            public Builder assetType(Integer assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * <p>Cloud product asset instance ID.</p>
             * <blockquote>
             * <p>You can call <a href="~~ListCloudAssetInstances~~">ListCloudAssetInstances</a> to query the cloud product asset instance ID.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>i-8vb0e8qdaj0yyxjo****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Region ID of the cloud product asset instance.</p>
             * <blockquote>
             * <p>You can call <a href="~~ListCloudAssetInstances~~">ListCloudAssetInstances</a> to query the region ID of the cloud product asset instance.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Cloud product asset vendor.</p>
             * <blockquote>
             * <p>You can call <a href="~~ListCloudAssetInstances~~">ListCloudAssetInstances</a> to query the cloud product asset vendor.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder vendor(Integer vendor) {
                this.vendor = vendor;
                return this;
            }

            public AttackPathAssetList build() {
                return new AttackPathAssetList(this);
            } 

        } 

    }
}
