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
 * {@link UpdateCustomAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateCustomAttributeRequest</p>
 */
public class UpdateCustomAttributeRequest extends Request {
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
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityTypes")
    private java.util.List<String> entityTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SearchFilterEnabled")
    private Boolean searchFilterEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ValueEnums")
    private java.util.List<String> valueEnums;

    private UpdateCustomAttributeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.comment = builder.comment;
        this.displayEnabled = builder.displayEnabled;
        this.displayName = builder.displayName;
        this.entityTypes = builder.entityTypes;
        this.id = builder.id;
        this.searchFilterEnabled = builder.searchFilterEnabled;
        this.valueEnums = builder.valueEnums;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCustomAttributeRequest create() {
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
     * @return valueEnums
     */
    public java.util.List<String> getValueEnums() {
        return this.valueEnums;
    }

    public static final class Builder extends Request.Builder<UpdateCustomAttributeRequest, Builder> {
        private String regionId; 
        private String comment; 
        private Boolean displayEnabled; 
        private String displayName; 
        private java.util.List<String> entityTypes; 
        private String id; 
        private Boolean searchFilterEnabled; 
        private java.util.List<String> valueEnums; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCustomAttributeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.comment = request.comment;
            this.displayEnabled = request.displayEnabled;
            this.displayName = request.displayName;
            this.entityTypes = request.entityTypes;
            this.id = request.id;
            this.searchFilterEnabled = request.searchFilterEnabled;
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
         * <p>The new description for the custom attribute. It must be 256 characters or less.</p>
         * 
         * <strong>example:</strong>
         * <p>test comment</p>
         */
        public Builder comment(String comment) {
            this.putBodyParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>Whether to display the custom attribute in the UI.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder displayEnabled(Boolean displayEnabled) {
            this.putBodyParameter("DisplayEnabled", displayEnabled);
            this.displayEnabled = displayEnabled;
            return this;
        }

        /**
         * <p>The new display name for the custom attribute. It must be 128 characters or less.</p>
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
         * <p>The applicable entity types. This parameter supports specific types and wildcard formats, such as <code>*-table</code> and <code>*-column</code>. For example:</p>
         * <ul>
         * <li><p><code>dataworks-project</code>: A DataWorks workspace</p>
         * </li>
         * <li><p><code>dataworks-dataset</code>: A DataWorks dataset</p>
         * </li>
         * <li><p><code>maxcompute-table</code>: A MaxCompute table</p>
         * </li>
         * <li><p><code>*-column</code>: All column types</p>
         * </li>
         * </ul>
         */
        public Builder entityTypes(java.util.List<String> entityTypes) {
            String entityTypesShrink = shrink(entityTypes, "EntityTypes", "simple");
            this.putBodyParameter("EntityTypes", entityTypesShrink);
            this.entityTypes = entityTypes;
            return this;
        }

        /**
         * <p>The custom attribute ID.</p>
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
         * <p>Whether the custom attribute can be used as a filter condition.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder searchFilterEnabled(Boolean searchFilterEnabled) {
            this.putBodyParameter("SearchFilterEnabled", searchFilterEnabled);
            this.searchFilterEnabled = searchFilterEnabled;
            return this;
        }

        /**
         * <p>The enumerated values. This applies only to custom attributes of the <code>enum</code> type. You can only append new values during an update.</p>
         */
        public Builder valueEnums(java.util.List<String> valueEnums) {
            String valueEnumsShrink = shrink(valueEnums, "ValueEnums", "simple");
            this.putBodyParameter("ValueEnums", valueEnumsShrink);
            this.valueEnums = valueEnums;
            return this;
        }

        @Override
        public UpdateCustomAttributeRequest build() {
            return new UpdateCustomAttributeRequest(this);
        } 

    } 

}
