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
 * {@link CreateMetaEntityDefRequest} extends {@link RequestModel}
 *
 * <p>CreateMetaEntityDefRequest</p>
 */
public class CreateMetaEntityDefRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AttributeDefs")
    private java.util.List<MetaEntityAttributeDef> attributeDefs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Extend")
    private String extend;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private CreateMetaEntityDefRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.attributeDefs = builder.attributeDefs;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.extend = builder.extend;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMetaEntityDefRequest create() {
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
     * @return attributeDefs
     */
    public java.util.List<MetaEntityAttributeDef> getAttributeDefs() {
        return this.attributeDefs;
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
     * @return extend
     */
    public String getExtend() {
        return this.extend;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<CreateMetaEntityDefRequest, Builder> {
        private String regionId; 
        private java.util.List<MetaEntityAttributeDef> attributeDefs; 
        private String description; 
        private String displayName; 
        private String extend; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreateMetaEntityDefRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.attributeDefs = request.attributeDefs;
            this.description = request.description;
            this.displayName = request.displayName;
            this.extend = request.extend;
            this.name = request.name;
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
         * <p>The attribute definition list for custom entities. This parameter cannot be specified when extend is set to TABLE.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder attributeDefs(java.util.List<MetaEntityAttributeDef> attributeDefs) {
            String attributeDefsShrink = shrink(attributeDefs, "AttributeDefs", "json");
            this.putBodyParameter("AttributeDefs", attributeDefsShrink);
            this.attributeDefs = attributeDefs;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The display name, up to 32 characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Business API</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The extension mode. Valid values:</p>
         * <ul>
         * <li>NONE: default value. Indicates a custom entity with freely defined attributes.</li>
         * <li>TABLE: indicates an extended table type. This type integrates in the same way as existing table types in DataWorks Data Map. You do not need to provide attribute definitions and can create corresponding Database/Table objects.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        public Builder extend(String extend) {
            this.putBodyParameter("Extend", extend);
            this.extend = extend;
            return this;
        }

        /**
         * <p>The name of the type definition. Custom types must match <code>^[a-z0-9][a-z0-9_]*$</code>. Extended table types must match <code>^[a-z0-9][a-z0-9_]*-table$</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>biz_api</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public CreateMetaEntityDefRequest build() {
            return new CreateMetaEntityDefRequest(this);
        } 

    } 

}
