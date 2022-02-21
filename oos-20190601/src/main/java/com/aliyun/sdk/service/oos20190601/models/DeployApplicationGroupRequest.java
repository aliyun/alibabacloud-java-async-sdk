// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeployApplicationGroupRequest} extends {@link RequestModel}
 *
 * <p>DeployApplicationGroupRequest</p>
 */
public class DeployApplicationGroupRequest extends Request {
    @Query
    @NameInMap("ApplicationName")
    @Validation(required = true)
    private String applicationName;

    @Query
    @NameInMap("DeployParameters")
    @Validation(required = true)
    private String deployParameters;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("RegionId")
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

        private Builder(DeployApplicationGroupRequest response) {
            super(response);
            this.applicationName = response.applicationName;
            this.deployParameters = response.deployParameters;
            this.name = response.name;
            this.regionId = response.regionId;
        } 

        /**
         * ApplicationName.
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("ApplicationName", applicationName);
            this.applicationName = applicationName;
            return this;
        }

        /**
         * DeployParameters.
         */
        public Builder deployParameters(String deployParameters) {
            this.putQueryParameter("DeployParameters", deployParameters);
            this.deployParameters = deployParameters;
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
         * RegionId.
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
