// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link UpdateMetaEntityDefRequest} extends {@link RequestModel}
 *
 * <p>UpdateMetaEntityDefRequest</p>
 */
public class UpdateMetaEntityDefRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String entityType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NewAttributeDefs")
    private java.util.List<MetaEntityAttributeDef> newAttributeDefs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpdateAttributeDefs")
    private java.util.List<MetaEntityAttributeDef> updateAttributeDefs;

    private UpdateMetaEntityDefRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.entityType = builder.entityType;
        this.newAttributeDefs = builder.newAttributeDefs;
        this.updateAttributeDefs = builder.updateAttributeDefs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMetaEntityDefRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return newAttributeDefs
     */
    public java.util.List<MetaEntityAttributeDef> getNewAttributeDefs() {
        return this.newAttributeDefs;
    }

    /**
     * @return updateAttributeDefs
     */
    public java.util.List<MetaEntityAttributeDef> getUpdateAttributeDefs() {
        return this.updateAttributeDefs;
    }

    public static final class Builder extends Request.Builder<UpdateMetaEntityDefRequest, Builder> {
        private String regionId; 
        private String description; 
        private String displayName; 
        private String entityType; 
        private java.util.List<MetaEntityAttributeDef> newAttributeDefs; 
        private java.util.List<MetaEntityAttributeDef> updateAttributeDefs; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMetaEntityDefRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.displayName = request.displayName;
            this.entityType = request.entityType;
            this.newAttributeDefs = request.newAttributeDefs;
            this.updateAttributeDefs = request.updateAttributeDefs;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>custom_entity-customer_api</p>
         */
        public Builder entityType(String entityType) {
            this.putBodyParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        /**
         * NewAttributeDefs.
         */
        public Builder newAttributeDefs(java.util.List<MetaEntityAttributeDef> newAttributeDefs) {
            String newAttributeDefsShrink = shrink(newAttributeDefs, "NewAttributeDefs", "json");
            this.putBodyParameter("NewAttributeDefs", newAttributeDefsShrink);
            this.newAttributeDefs = newAttributeDefs;
            return this;
        }

        /**
         * UpdateAttributeDefs.
         */
        public Builder updateAttributeDefs(java.util.List<MetaEntityAttributeDef> updateAttributeDefs) {
            String updateAttributeDefsShrink = shrink(updateAttributeDefs, "UpdateAttributeDefs", "json");
            this.putBodyParameter("UpdateAttributeDefs", updateAttributeDefsShrink);
            this.updateAttributeDefs = updateAttributeDefs;
            return this;
        }

        @Override
        public UpdateMetaEntityDefRequest build() {
            return new UpdateMetaEntityDefRequest(this);
        } 

    } 

}
