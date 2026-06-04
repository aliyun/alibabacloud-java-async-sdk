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
 * {@link CreateCustomAttributeRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomAttributeRequest</p>
 */
public class CreateCustomAttributeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisplayEnabled")
    private Boolean displayEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityTypes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> entityTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SearchFilterEnabled")
    private Boolean searchFilterEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ValueEnums")
    private java.util.List<String> valueEnums;

    private CreateCustomAttributeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.comment = builder.comment;
        this.displayEnabled = builder.displayEnabled;
        this.displayName = builder.displayName;
        this.entityTypes = builder.entityTypes;
        this.id = builder.id;
        this.searchFilterEnabled = builder.searchFilterEnabled;
        this.type = builder.type;
        this.valueEnums = builder.valueEnums;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomAttributeRequest create() {
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
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return displayEnabled
     */
    public Boolean getDisplayEnabled() {
        return this.displayEnabled;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return entityTypes
     */
    public java.util.List<String> getEntityTypes() {
        return this.entityTypes;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return searchFilterEnabled
     */
    public Boolean getSearchFilterEnabled() {
        return this.searchFilterEnabled;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return valueEnums
     */
    public java.util.List<String> getValueEnums() {
        return this.valueEnums;
    }

    public static final class Builder extends Request.Builder<CreateCustomAttributeRequest, Builder> {
        private String regionId; 
        private String comment; 
        private Boolean displayEnabled; 
        private String displayName; 
        private java.util.List<String> entityTypes; 
        private String id; 
        private Boolean searchFilterEnabled; 
        private String type; 
        private java.util.List<String> valueEnums; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomAttributeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.comment = request.comment;
            this.displayEnabled = request.displayEnabled;
            this.displayName = request.displayName;
            this.entityTypes = request.entityTypes;
            this.id = request.id;
            this.searchFilterEnabled = request.searchFilterEnabled;
            this.type = request.type;
            this.valueEnums = request.valueEnums;
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
         * Comment.
         */
        public Builder comment(String comment) {
            this.putBodyParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * DisplayEnabled.
         */
        public Builder displayEnabled(Boolean displayEnabled) {
            this.putBodyParameter("DisplayEnabled", displayEnabled);
            this.displayEnabled = displayEnabled;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>业务负责人</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder entityTypes(java.util.List<String> entityTypes) {
            String entityTypesShrink = shrink(entityTypes, "EntityTypes", "simple");
            this.putBodyParameter("EntityTypes", entityTypesShrink);
            this.entityTypes = entityTypes;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>custom-attribute:biz_owner</p>
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * SearchFilterEnabled.
         */
        public Builder searchFilterEnabled(Boolean searchFilterEnabled) {
            this.putBodyParameter("SearchFilterEnabled", searchFilterEnabled);
            this.searchFilterEnabled = searchFilterEnabled;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TEXT</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * ValueEnums.
         */
        public Builder valueEnums(java.util.List<String> valueEnums) {
            String valueEnumsShrink = shrink(valueEnums, "ValueEnums", "simple");
            this.putBodyParameter("ValueEnums", valueEnumsShrink);
            this.valueEnums = valueEnums;
            return this;
        }

        @Override
        public CreateCustomAttributeRequest build() {
            return new CreateCustomAttributeRequest(this);
        } 

    } 

}
