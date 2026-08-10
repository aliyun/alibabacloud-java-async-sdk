// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link GetEntitiyStatRequest} extends {@link RequestModel}
 *
 * <p>GetEntitiyStatRequest</p>
 */
public class GetEntitiyStatRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AssetName")
    private String assetName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AssetUuid")
    private String assetUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityName")
    private String entityName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityType")
    private String entityType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityUuid")
    private String entityUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityUuids")
    private String entityUuids;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncidentUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String incidentUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsAsset")
    private String isAsset;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsMalwareEntity")
    private String isMalwareEntity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private Integer roleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    private GetEntitiyStatRequest(Builder builder) {
        super(builder);
        this.assetName = builder.assetName;
        this.assetUuid = builder.assetUuid;
        this.entityName = builder.entityName;
        this.entityType = builder.entityType;
        this.entityUuid = builder.entityUuid;
        this.entityUuids = builder.entityUuids;
        this.incidentUuid = builder.incidentUuid;
        this.isAsset = builder.isAsset;
        this.isMalwareEntity = builder.isMalwareEntity;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEntitiyStatRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetName
     */
    public String getAssetName() {
        return this.assetName;
    }

    /**
     * @return assetUuid
     */
    public String getAssetUuid() {
        return this.assetUuid;
    }

    /**
     * @return entityName
     */
    public String getEntityName() {
        return this.entityName;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return entityUuid
     */
    public String getEntityUuid() {
        return this.entityUuid;
    }

    /**
     * @return entityUuids
     */
    public String getEntityUuids() {
        return this.entityUuids;
    }

    /**
     * @return incidentUuid
     */
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    /**
     * @return isAsset
     */
    public String getIsAsset() {
        return this.isAsset;
    }

    /**
     * @return isMalwareEntity
     */
    public String getIsMalwareEntity() {
        return this.isMalwareEntity;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return roleType
     */
    public Integer getRoleType() {
        return this.roleType;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<GetEntitiyStatRequest, Builder> {
        private String assetName; 
        private String assetUuid; 
        private String entityName; 
        private String entityType; 
        private String entityUuid; 
        private String entityUuids; 
        private String incidentUuid; 
        private String isAsset; 
        private String isMalwareEntity; 
        private String regionId; 
        private Long roleFor; 
        private Integer roleType; 
        private String tags; 

        private Builder() {
            super();
        } 

        private Builder(GetEntitiyStatRequest request) {
            super(request);
            this.assetName = request.assetName;
            this.assetUuid = request.assetUuid;
            this.entityName = request.entityName;
            this.entityType = request.entityType;
            this.entityUuid = request.entityUuid;
            this.entityUuids = request.entityUuids;
            this.incidentUuid = request.incidentUuid;
            this.isAsset = request.isAsset;
            this.isMalwareEntity = request.isMalwareEntity;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
            this.tags = request.tags;
        } 

        /**
         * AssetName.
         */
        public Builder assetName(String assetName) {
            this.putBodyParameter("AssetName", assetName);
            this.assetName = assetName;
            return this;
        }

        /**
         * AssetUuid.
         */
        public Builder assetUuid(String assetUuid) {
            this.putBodyParameter("AssetUuid", assetUuid);
            this.assetUuid = assetUuid;
            return this;
        }

        /**
         * EntityName.
         */
        public Builder entityName(String entityName) {
            this.putBodyParameter("EntityName", entityName);
            this.entityName = entityName;
            return this;
        }

        /**
         * EntityType.
         */
        public Builder entityType(String entityType) {
            this.putBodyParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        /**
         * EntityUuid.
         */
        public Builder entityUuid(String entityUuid) {
            this.putBodyParameter("EntityUuid", entityUuid);
            this.entityUuid = entityUuid;
            return this;
        }

        /**
         * EntityUuids.
         */
        public Builder entityUuids(String entityUuids) {
            this.putBodyParameter("EntityUuids", entityUuids);
            this.entityUuids = entityUuids;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>85ea4241-798f-4684-a876-65d4f0c3****</p>
         */
        public Builder incidentUuid(String incidentUuid) {
            this.putBodyParameter("IncidentUuid", incidentUuid);
            this.incidentUuid = incidentUuid;
            return this;
        }

        /**
         * IsAsset.
         */
        public Builder isAsset(String isAsset) {
            this.putBodyParameter("IsAsset", isAsset);
            this.isAsset = isAsset;
            return this;
        }

        /**
         * IsMalwareEntity.
         */
        public Builder isMalwareEntity(String isMalwareEntity) {
            this.putBodyParameter("IsMalwareEntity", isMalwareEntity);
            this.isMalwareEntity = isMalwareEntity;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RoleFor.
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * RoleType.
         */
        public Builder roleType(Integer roleType) {
            this.putBodyParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(String tags) {
            this.putBodyParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public GetEntitiyStatRequest build() {
            return new GetEntitiyStatRequest(this);
        } 

    } 

}
