// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link ModifyFeatureConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyFeatureConfigRequest</p>
 */
public class ModifyFeatureConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Field")
    private String field;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    private String serviceCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ModifyFeatureConfigRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.description = builder.description;
        this.field = builder.field;
        this.regionId = builder.regionId;
        this.resourceType = builder.resourceType;
        this.serviceCode = builder.serviceCode;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyFeatureConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return field
     */
    public String getField() {
        return this.field;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ModifyFeatureConfigRequest, Builder> {
        private String config; 
        private String description; 
        private String field; 
        private String regionId; 
        private String resourceType; 
        private String serviceCode; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ModifyFeatureConfigRequest request) {
            super(request);
            this.config = request.config;
            this.description = request.description;
            this.field = request.field;
            this.regionId = request.regionId;
            this.resourceType = request.resourceType;
            this.serviceCode = request.serviceCode;
            this.type = request.type;
        } 

        /**
         * <p>Configuration, in JSON format</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder config(String config) {
            this.putBodyParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>Label meaning</p>
         * 
         * <strong>example:</strong>
         * <p>标签2</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Label value, customer-defined</p>
         * 
         * <strong>example:</strong>
         * <p><strong>config</strong></p>
         */
        public Builder field(String field) {
            this.putBodyParameter("Field", field);
            this.field = field;
            return this;
        }

        /**
         * <p>Region</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>Service code.</p>
         * 
         * <strong>example:</strong>
         * <p>llm_query_moderation</p>
         */
        public Builder serviceCode(String serviceCode) {
            this.putBodyParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * <p>Type</p>
         * 
         * <strong>example:</strong>
         * <p>custom_llm_template</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ModifyFeatureConfigRequest build() {
            return new ModifyFeatureConfigRequest(this);
        } 

    } 

}
