// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link UpdateParameterRequest} extends {@link RequestModel}
 *
 * <p>UpdateParameterRequest</p>
 */
public class UpdateParameterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Value")
    @com.aliyun.core.annotation.Validation(required = true)
    private String value;

    private UpdateParameterRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateParameterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<UpdateParameterRequest, Builder> {
        private String description; 
        private String name; 
        private String regionId; 
        private String resourceGroupId; 
        private String tags; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(UpdateParameterRequest request) {
            super(request);
            this.description = request.description;
            this.name = request.name;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.tags = request.tags;
            this.value = request.value;
        } 

        /**
         * <p>The description of the common parameter. The description must be 1 to 200 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>update</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the common parameter. The name must be 1 to 200 characters in length, and can contain letters, digits, hyphens (-), and underscores (_). It cannot start with ALIYUN, ACS, ALIBABA, ALICLOUD, or OOS.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyParameter</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxsn4m4******</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The tags to be added to common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;k1&quot;: &quot;v1&quot;, &quot;k2&quot;: &quot;v2&quot;}</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The value of the common parameter. The value must be 1 to 4,096 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>update</p>
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public UpdateParameterRequest build() {
            return new UpdateParameterRequest(this);
        } 

    } 

}
