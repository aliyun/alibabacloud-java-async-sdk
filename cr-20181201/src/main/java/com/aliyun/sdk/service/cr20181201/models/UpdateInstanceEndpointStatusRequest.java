// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateInstanceEndpointStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceEndpointStatusRequest</p>
 */
public class UpdateInstanceEndpointStatusRequest extends Request {
    @Query
    @NameInMap("Enable")
    @Validation(required = true)
    private Boolean enable;

    @Query
    @NameInMap("EndpointType")
    @Validation(required = true)
    private String endpointType;

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

    private UpdateInstanceEndpointStatusRequest(Builder builder) {
        super(builder);
        this.enable = builder.enable;
        this.endpointType = builder.endpointType;
        this.instanceId = builder.instanceId;
        this.moduleName = builder.moduleName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceEndpointStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return endpointType
     */
    public String getEndpointType() {
        return this.endpointType;
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

    public static final class Builder extends Request.Builder<UpdateInstanceEndpointStatusRequest, Builder> {
        private Boolean enable; 
        private String endpointType; 
        private String instanceId; 
        private String moduleName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceEndpointStatusRequest response) {
            super(response);
            this.enable = response.enable;
            this.endpointType = response.endpointType;
            this.instanceId = response.instanceId;
            this.moduleName = response.moduleName;
            this.regionId = response.regionId;
        } 

        /**
         * Enable.
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * EndpointType.
         */
        public Builder endpointType(String endpointType) {
            this.putQueryParameter("EndpointType", endpointType);
            this.endpointType = endpointType;
            return this;
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
        public UpdateInstanceEndpointStatusRequest build() {
            return new UpdateInstanceEndpointStatusRequest(this);
        } 

    } 

}
