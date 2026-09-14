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
 * {@link UpdateColumnBusinessMetadataRequest} extends {@link RequestModel}
 *
 * <p>UpdateColumnBusinessMetadataRequest</p>
 */
public class UpdateColumnBusinessMetadataRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomAttributes")
    private java.util.Map<String, java.util.List<String>> customAttributes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    private UpdateColumnBusinessMetadataRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.customAttributes = builder.customAttributes;
        this.description = builder.description;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateColumnBusinessMetadataRequest create() {
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
     * @return customAttributes
     */
    public java.util.Map<String, java.util.List<String>> getCustomAttributes() {
        return this.customAttributes;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<UpdateColumnBusinessMetadataRequest, Builder> {
        private String regionId; 
        private java.util.Map<String, java.util.List<String>> customAttributes; 
        private String description; 
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(UpdateColumnBusinessMetadataRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.customAttributes = request.customAttributes;
            this.description = request.description;
            this.id = request.id;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The custom attributes of the column, specified as key-value pairs. The key is the attribute identifier, and the value is an array that can contain at most one element. An empty array deletes the attribute\&quot;s value. To avoid overwriting the column\&quot;s business description, omit the <code>Description</code> parameter from the request. An empty object (<code>{}</code>) indicates that no custom attributes are updated.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;biz_owner&quot;:[&quot;张三&quot;]}</p>
         */
        public Builder customAttributes(java.util.Map<String, java.util.List<String>> customAttributes) {
            String customAttributesShrink = shrink(customAttributes, "CustomAttributes", "json");
            this.putBodyParameter("CustomAttributes", customAttributesShrink);
            this.customAttributes = customAttributes;
            return this;
        }

        /**
         * <p>The business description of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>test description</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the column. You can obtain this ID from the response of the <code>ListColumns</code> operation. For more information, see <a href="https://help.aliyun.com/document_detail/2880092.html">Metadata Entity Concepts</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute-column:::project_name:[schema_name]:table_name:column_name</p>
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public UpdateColumnBusinessMetadataRequest build() {
            return new UpdateColumnBusinessMetadataRequest(this);
        } 

    } 

}
