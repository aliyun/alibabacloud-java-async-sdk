// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateResourceGroupRequest</p>
 */
public class CreateResourceGroupRequest extends Request {
    @Body
    @NameInMap("ComputingResourceProvider")
    private String computingResourceProvider;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("ResourceType")
    private String resourceType;

    @Body
    @NameInMap("UserVpc")
    private UserVpc userVpc;

    private CreateResourceGroupRequest(Builder builder) {
        super(builder);
        this.computingResourceProvider = builder.computingResourceProvider;
        this.description = builder.description;
        this.name = builder.name;
        this.resourceType = builder.resourceType;
        this.userVpc = builder.userVpc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return computingResourceProvider
     */
    public String getComputingResourceProvider() {
        return this.computingResourceProvider;
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
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return userVpc
     */
    public UserVpc getUserVpc() {
        return this.userVpc;
    }

    public static final class Builder extends Request.Builder<CreateResourceGroupRequest, Builder> {
        private String computingResourceProvider; 
        private String description; 
        private String name; 
        private String resourceType; 
        private UserVpc userVpc; 

        private Builder() {
            super();
        } 

        private Builder(CreateResourceGroupRequest request) {
            super(request);
            this.computingResourceProvider = request.computingResourceProvider;
            this.description = request.description;
            this.name = request.name;
            this.resourceType = request.resourceType;
            this.userVpc = request.userVpc;
        } 

        /**
         * ComputingResourceProvider.
         */
        public Builder computingResourceProvider(String computingResourceProvider) {
            this.putBodyParameter("ComputingResourceProvider", computingResourceProvider);
            this.computingResourceProvider = computingResourceProvider;
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
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * UserVpc.
         */
        public Builder userVpc(UserVpc userVpc) {
            this.putBodyParameter("UserVpc", userVpc);
            this.userVpc = userVpc;
            return this;
        }

        @Override
        public CreateResourceGroupRequest build() {
            return new CreateResourceGroupRequest(this);
        } 

    } 

}
