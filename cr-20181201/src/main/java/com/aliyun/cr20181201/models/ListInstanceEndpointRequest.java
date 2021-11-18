// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListInstanceEndpointRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceEndpointRequest</p>
 */
public class ListInstanceEndpointRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ModuleName")
    private String moduleName;


    private ListInstanceEndpointRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.moduleName = builder.moduleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceEndpointRequest create() {
        return builder().build();
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return moduleName
     */
    public String getModuleName() {
        return this.moduleName;
    }

    public static final class Builder extends Request.Builder {
        private String instanceId; 
        private String regionId; 
        private String moduleName; 

        /**
         * <p>Warehouse instance ID</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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

        public ListInstanceEndpointRequest build() {
            return new ListInstanceEndpointRequest(this);
        } 

    } 

}
