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
 * {@link UpdateAttackPathSensitiveAssetConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateAttackPathSensitiveAssetConfigRequest</p>
 */
public class UpdateAttackPathSensitiveAssetConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttackPathAssetList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<AttackPathAssetList> attackPathAssetList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttackPathSensitiveAssetConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String attackPathSensitiveAssetConfigId;

    private UpdateAttackPathSensitiveAssetConfigRequest(Builder builder) {
        super(builder);
        this.attackPathAssetList = builder.attackPathAssetList;
        this.attackPathSensitiveAssetConfigId = builder.attackPathSensitiveAssetConfigId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAttackPathSensitiveAssetConfigRequest create() {
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
     * @return attackPathSensitiveAssetConfigId
     */
    public String getAttackPathSensitiveAssetConfigId() {
        return this.attackPathSensitiveAssetConfigId;
    }

    public static final class Builder extends Request.Builder<UpdateAttackPathSensitiveAssetConfigRequest, Builder> {
        private java.util.List<AttackPathAssetList> attackPathAssetList; 
        private String attackPathSensitiveAssetConfigId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAttackPathSensitiveAssetConfigRequest request) {
            super(request);
            this.attackPathAssetList = request.attackPathAssetList;
            this.attackPathSensitiveAssetConfigId = request.attackPathSensitiveAssetConfigId;
        } 

        /**
         * <p>List of cloud product assets in the attack path.</p>
         * <p>This parameter is required.</p>
         */
        public Builder attackPathAssetList(java.util.List<AttackPathAssetList> attackPathAssetList) {
            this.putQueryParameter("AttackPathAssetList", attackPathAssetList);
            this.attackPathAssetList = attackPathAssetList;
            return this;
        }

        /**
         * <p>ID of the sensitive asset setting for the attack path.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>apsac-123</p>
         */
        public Builder attackPathSensitiveAssetConfigId(String attackPathSensitiveAssetConfigId) {
            this.putQueryParameter("AttackPathSensitiveAssetConfigId", attackPathSensitiveAssetConfigId);
            this.attackPathSensitiveAssetConfigId = attackPathSensitiveAssetConfigId;
            return this;
        }

        @Override
        public UpdateAttackPathSensitiveAssetConfigRequest build() {
            return new UpdateAttackPathSensitiveAssetConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateAttackPathSensitiveAssetConfigRequest} extends {@link TeaModel}
     *
     * <p>UpdateAttackPathSensitiveAssetConfigRequest</p>
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
             * <p>4</p>
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
             * <p>18</p>
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
             * <p>i-2ze357b4mrkwi7tq****</p>
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
             * <p>Vendor of the cloud product asset.</p>
             * <blockquote>
             * <p>You can call <a href="~~ListCloudAssetInstances~~">ListCloudAssetInstances</a> to query the vendor of the cloud product asset.</p>
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
