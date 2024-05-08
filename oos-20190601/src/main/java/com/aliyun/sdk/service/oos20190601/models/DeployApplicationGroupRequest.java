// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeployApplicationGroupRequest} extends {@link RequestModel}
 *
 * <p>DeployApplicationGroupRequest</p>
 */
public class DeployApplicationGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeployParameters")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deployParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeployApplicationGroupRequest(Builder builder) {
        super(builder);
        this.applicationName = builder.applicationName;
        this.deployParameters = builder.deployParameters;
        this.name = builder.name;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeployApplicationGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return deployParameters
     */
    public String getDeployParameters() {
        return this.deployParameters;
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

    public static final class Builder extends Request.Builder<DeployApplicationGroupRequest, Builder> {
        private String applicationName; 
        private String deployParameters; 
        private String name; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeployApplicationGroupRequest request) {
            super(request);
            this.applicationName = request.applicationName;
            this.deployParameters = request.deployParameters;
            this.name = request.name;
            this.regionId = request.regionId;
        } 

        /**
         * The name of the application.
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("ApplicationName", applicationName);
            this.applicationName = applicationName;
            return this;
        }

        /**
         * The deployment information about the application group.
         */
        public Builder deployParameters(String deployParameters) {
            this.putQueryParameter("DeployParameters", deployParameters);
            this.deployParameters = deployParameters;
            return this;
        }

        /**
         * The name of the application group.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The ID of the region in which you want to deploy the application group.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeployApplicationGroupRequest build() {
            return new DeployApplicationGroupRequest(this);
        } 

    } 

}
