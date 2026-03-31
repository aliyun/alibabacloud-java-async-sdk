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
 * {@link UpdateChatConfigurationRequest} extends {@link RequestModel}
 *
 * <p>UpdateChatConfigurationRequest</p>
 */
public class UpdateChatConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Configuration")
    private String configuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RamRole")
    private String ramRole;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private UpdateChatConfigurationRequest(Builder builder) {
        super(builder);
        this.configuration = builder.configuration;
        this.name = builder.name;
        this.ramRole = builder.ramRole;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateChatConfigurationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configuration
     */
    public String getConfiguration() {
        return this.configuration;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ramRole
     */
    public String getRamRole() {
        return this.ramRole;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<UpdateChatConfigurationRequest, Builder> {
        private String configuration; 
        private String name; 
        private String ramRole; 
        private String regionId; 
        private String resourceGroupId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UpdateChatConfigurationRequest request) {
            super(request);
            this.configuration = request.configuration;
            this.name = request.name;
            this.ramRole = request.ramRole;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.type = request.type;
        } 

        /**
         * Configuration.
         */
        public Builder configuration(String configuration) {
            this.putQueryParameter("Configuration", configuration);
            this.configuration = configuration;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * RamRole.
         */
        public Builder ramRole(String ramRole) {
            this.putQueryParameter("RamRole", ramRole);
            this.ramRole = ramRole;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public UpdateChatConfigurationRequest build() {
            return new UpdateChatConfigurationRequest(this);
        } 

    } 

}
