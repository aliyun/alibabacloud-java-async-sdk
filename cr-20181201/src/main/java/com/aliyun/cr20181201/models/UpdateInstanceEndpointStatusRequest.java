// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link UpdateInstanceEndpointStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceEndpointStatusRequest</p>
 */
public class UpdateInstanceEndpointStatusRequest extends Request {
    @Query
    @NameInMap("EndpointType")
    private String endpointType;

    @Query
    @NameInMap("ModuleName")
    private String moduleName;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Enable")
    private Boolean enable;

    @Host
    @NameInMap("RegionId")
    private String regionId;


    private UpdateInstanceEndpointStatusRequest(Builder builder) {
        super(builder);
        this.endpointType = builder.endpointType;
        this.moduleName = builder.moduleName;
        this.instanceId = builder.instanceId;
        this.enable = builder.enable;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceEndpointStatusRequest create() {
        return builder().build();
    }

    /**
     * @return endpointType
     */
    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * @return moduleName
     */
    public String getModuleName() {
        return this.moduleName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder {
        private String endpointType; 
        private String moduleName; 
        private String instanceId; 
        private Boolean enable; 
        private String regionId; 

        /**
         * <p>The type of the endpoint. Valid values: Internet.</p>
         */
        public Builder endpointType(String endpointType) {
            this.putQueryParameter("EndpointType", endpointType);
            this.endpointType = endpointType;
            return this;
        }

        /**
         * <p>The module to be accessed. Valid values:

-"Registration": Access the image repository

-"Chart": access Helm Chart</p>
         */
        public Builder moduleName(String moduleName) {
            this.putQueryParameter("ModuleName", moduleName);
            this.moduleName = moduleName;
            return this;
        }

        /**
         * <p>Instance ID</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Enable</p>
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>Region</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        public UpdateInstanceEndpointStatusRequest build() {
            return new UpdateInstanceEndpointStatusRequest(this);
        } 

    } 

}
