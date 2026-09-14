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
 * {@link UpdateTableBusinessMetadataRequest} extends {@link RequestModel}
 *
 * <p>UpdateTableBusinessMetadataRequest</p>
 */
public class UpdateTableBusinessMetadataRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomAttributes")
    private java.util.Map<String, java.util.List<String>> customAttributes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Readme")
    private String readme;

    private UpdateTableBusinessMetadataRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.customAttributes = builder.customAttributes;
        this.id = builder.id;
        this.readme = builder.readme;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTableBusinessMetadataRequest create() {
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
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return readme
     */
    public String getReadme() {
        return this.readme;
    }

    public static final class Builder extends Request.Builder<UpdateTableBusinessMetadataRequest, Builder> {
        private String regionId; 
        private java.util.Map<String, java.util.List<String>> customAttributes; 
        private String id; 
        private String readme; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTableBusinessMetadataRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.customAttributes = request.customAttributes;
            this.id = request.id;
            this.readme = request.readme;
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
         * <p>The custom attribute values. The key is the custom attribute identifier, and the value contains at most one element. An empty list indicates that the attribute value is deleted. Passing this parameter without Readme prevents the usage description from being cleared. An empty object indicates that custom attributes are not updated.</p>
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
         * <p>The ID of the table. For the format, refer to the response of the ListTables operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute-table:::project_name:[schema_name]:table_name</p>
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The usage description. Rich text format is supported.</p>
         * 
         * <strong>example:</strong>
         * <h2>introduction</h2>
         */
        public Builder readme(String readme) {
            this.putBodyParameter("Readme", readme);
            this.readme = readme;
            return this;
        }

        @Override
        public UpdateTableBusinessMetadataRequest build() {
            return new UpdateTableBusinessMetadataRequest(this);
        } 

    } 

}
