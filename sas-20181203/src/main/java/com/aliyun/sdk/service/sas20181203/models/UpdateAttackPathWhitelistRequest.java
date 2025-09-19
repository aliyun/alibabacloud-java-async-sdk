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
 * {@link UpdateAttackPathWhitelistRequest} extends {@link RequestModel}
 *
 * <p>UpdateAttackPathWhitelistRequest</p>
 */
public class UpdateAttackPathWhitelistRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttackPathAssetList")
    private java.util.List<AttackPathAssetList> attackPathAssetList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttackPathWhitelistId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String attackPathWhitelistId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PathName")
    private String pathName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PathType")
    private String pathType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WhitelistName")
    private String whitelistName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WhitelistType")
    private String whitelistType;

    private UpdateAttackPathWhitelistRequest(Builder builder) {
        super(builder);
        this.attackPathAssetList = builder.attackPathAssetList;
        this.attackPathWhitelistId = builder.attackPathWhitelistId;
        this.pathName = builder.pathName;
        this.pathType = builder.pathType;
        this.remark = builder.remark;
        this.whitelistName = builder.whitelistName;
        this.whitelistType = builder.whitelistType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAttackPathWhitelistRequest create() {
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
     * @return attackPathWhitelistId
     */
    public String getAttackPathWhitelistId() {
        return this.attackPathWhitelistId;
    }

    /**
     * @return pathName
     */
    public String getPathName() {
        return this.pathName;
    }

    /**
     * @return pathType
     */
    public String getPathType() {
        return this.pathType;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return whitelistName
     */
    public String getWhitelistName() {
        return this.whitelistName;
    }

    /**
     * @return whitelistType
     */
    public String getWhitelistType() {
        return this.whitelistType;
    }

    public static final class Builder extends Request.Builder<UpdateAttackPathWhitelistRequest, Builder> {
        private java.util.List<AttackPathAssetList> attackPathAssetList; 
        private String attackPathWhitelistId; 
        private String pathName; 
        private String pathType; 
        private String remark; 
        private String whitelistName; 
        private String whitelistType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAttackPathWhitelistRequest request) {
            super(request);
            this.attackPathAssetList = request.attackPathAssetList;
            this.attackPathWhitelistId = request.attackPathWhitelistId;
            this.pathName = request.pathName;
            this.pathType = request.pathType;
            this.remark = request.remark;
            this.whitelistName = request.whitelistName;
            this.whitelistType = request.whitelistType;
        } 

        /**
         * <p>List of cloud product assets in the attack path.</p>
         */
        public Builder attackPathAssetList(java.util.List<AttackPathAssetList> attackPathAssetList) {
            this.putQueryParameter("AttackPathAssetList", attackPathAssetList);
            this.attackPathAssetList = attackPathAssetList;
            return this;
        }

        /**
         * <p>Attack path whitelist ID.</p>
         * <blockquote>
         * <p>You can call <a href="~~ListAttackPathWhitelist~~">ListAttackPathWhitelist</a> to query the attack path whitelist ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>apwl-b33dec0acf9b42aabde032d656c0****</p>
         */
        public Builder attackPathWhitelistId(String attackPathWhitelistId) {
            this.putQueryParameter("AttackPathWhitelistId", attackPathWhitelistId);
            this.attackPathWhitelistId = attackPathWhitelistId;
            return this;
        }

        /**
         * <p>Path name.</p>
         * <blockquote>
         * <p>You can call <a href="~~ListAvailableAttackPath~~">ListAvailableAttackPath</a> to query the path name.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ecs_get_credential_by_create_login_profile</p>
         */
        public Builder pathName(String pathName) {
            this.putQueryParameter("PathName", pathName);
            this.pathName = pathName;
            return this;
        }

        /**
         * <p>Path type.</p>
         * <blockquote>
         * <p>You can call <a href="~~ListAvailableAttackPath~~">ListAvailableAttackPath</a> to query the path type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>role_escalation</p>
         */
        public Builder pathType(String pathType) {
            this.putQueryParameter("PathType", pathType);
            this.pathType = pathType;
            return this;
        }

        /**
         * <p>Remark information.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>Whitelist name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder whitelistName(String whitelistName) {
            this.putQueryParameter("WhitelistName", whitelistName);
            this.whitelistName = whitelistName;
            return this;
        }

        /**
         * <p>Whitelist type. Values:</p>
         * <ul>
         * <li><strong>ALL_ASSET</strong>: All assets</li>
         * <li><strong>PART_ASSET</strong>: Partial assets</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL_ASSET</p>
         */
        public Builder whitelistType(String whitelistType) {
            this.putQueryParameter("WhitelistType", whitelistType);
            this.whitelistType = whitelistType;
            return this;
        }

        @Override
        public UpdateAttackPathWhitelistRequest build() {
            return new UpdateAttackPathWhitelistRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateAttackPathWhitelistRequest} extends {@link TeaModel}
     *
     * <p>UpdateAttackPathWhitelistRequest</p>
     */
    public static class AttackPathAssetList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetSubType")
        private Integer assetSubType;

        @com.aliyun.core.annotation.NameInMap("AssetType")
        private Integer assetType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private Integer vendor;

        private AttackPathAssetList(Builder builder) {
            this.assetSubType = builder.assetSubType;
            this.assetType = builder.assetType;
            this.instanceId = builder.instanceId;
            this.nodeType = builder.nodeType;
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
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
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
            private String nodeType; 
            private String regionId; 
            private Integer vendor; 

            private Builder() {
            } 

            private Builder(AttackPathAssetList model) {
                this.assetSubType = model.assetSubType;
                this.assetType = model.assetType;
                this.instanceId = model.instanceId;
                this.nodeType = model.nodeType;
                this.regionId = model.regionId;
                this.vendor = model.vendor;
            } 

            /**
             * <p>Subtype of the cloud product asset.</p>
             * <blockquote>
             * <p>You can call <a href="~~ListCloudAssetInstances~~">ListCloudAssetInstances</a> to query the subtype of the cloud product asset.</p>
             * </blockquote>
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
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
             * 
             * <strong>example:</strong>
             * <p>i-8vb0e8qdaj0yyxjo****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Node type, with values:</p>
             * <ul>
             * <li><strong>start</strong>: Start point.</li>
             * <li><strong>end</strong>: End point.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>start</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>Region ID of the cloud product asset instance.</p>
             * <blockquote>
             * <p>You can call <a href="~~ListCloudAssetInstances~~">ListCloudAssetInstances</a> to query the region ID of the cloud product asset instance.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
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
