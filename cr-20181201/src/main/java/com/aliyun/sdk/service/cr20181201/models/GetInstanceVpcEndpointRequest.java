// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceVpcEndpointRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceVpcEndpointRequest</p>
 */
public class GetInstanceVpcEndpointRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ModuleName")
    private String moduleName;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetInstanceVpcEndpointRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.moduleName = builder.moduleName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceVpcEndpointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return moduleName
     */
    public String getModuleName() {
        return this.moduleName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetInstanceVpcEndpointRequest, Builder> {
        private String instanceId; 
        private String moduleName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceVpcEndpointRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.moduleName = response.moduleName;
            this.regionId = response.regionId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ModuleName.
         */
        public Builder moduleName(String moduleName) {
            this.putQueryParameter("ModuleName", moduleName);
            this.moduleName = moduleName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetInstanceVpcEndpointRequest build() {
            return new GetInstanceVpcEndpointRequest(this);
        } 

    } 

}
