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
 * {@link UpdateMetaEntityRequest} extends {@link RequestModel}
 *
 * <p>UpdateMetaEntityRequest</p>
 */
public class UpdateMetaEntityRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Attributes")
    private java.util.Map<String, String> attributes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomAttributes")
    private java.util.Map<String, java.util.List<String>> customAttributes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    private UpdateMetaEntityRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.attributes = builder.attributes;
        this.comment = builder.comment;
        this.customAttributes = builder.customAttributes;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMetaEntityRequest create() {
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
     * @return attributes
     */
    public java.util.Map<String, String> getAttributes() {
        return this.attributes;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return customAttributes
     */
    public java.util.Map<String, java.util.List<String>> getCustomAttributes() {
        return this.customAttributes;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<UpdateMetaEntityRequest, Builder> {
        private String regionId; 
        private java.util.Map<String, String> attributes; 
        private String comment; 
        private java.util.Map<String, java.util.List<String>> customAttributes; 
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMetaEntityRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.attributes = request.attributes;
            this.comment = request.comment;
            this.customAttributes = request.customAttributes;
            this.id = request.id;
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
         * Attributes.
         */
        public Builder attributes(java.util.Map<String, String> attributes) {
            String attributesShrink = shrink(attributes, "Attributes", "json");
            this.putBodyParameter("Attributes", attributesShrink);
            this.attributes = attributes;
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
         * CustomAttributes.
         */
        public Builder customAttributes(java.util.Map<String, java.util.List<String>> customAttributes) {
            String customAttributesShrink = shrink(customAttributes, "CustomAttributes", "json");
            this.putBodyParameter("CustomAttributes", customAttributesShrink);
            this.customAttributes = customAttributes;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>custom_entity-customer_api:api_001</p>
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public UpdateMetaEntityRequest build() {
            return new UpdateMetaEntityRequest(this);
        } 

    } 

}
