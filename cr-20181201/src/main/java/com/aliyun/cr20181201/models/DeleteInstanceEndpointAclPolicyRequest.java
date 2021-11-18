// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteInstanceEndpointAclPolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteInstanceEndpointAclPolicyRequest</p>
 */
public class DeleteInstanceEndpointAclPolicyRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("ModuleName")
    private String moduleName;

    @Query
    @NameInMap("EndpointType")
    private String endpointType;

    @Query
    @NameInMap("Entry")
    private String entry;


    private DeleteInstanceEndpointAclPolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.moduleName = builder.moduleName;
        this.endpointType = builder.endpointType;
        this.entry = builder.entry;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInstanceEndpointAclPolicyRequest create() {
        return builder().build();
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return endpointType
     */
    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * @return entry
     */
    public String getEntry() {
        return this.entry;
    }

    public static final class Builder extends Request.Builder {
        private String regionId; 
        private String instanceId; 
        private String moduleName; 
        private String endpointType; 
        private String entry; 

        /**
         * <p>Region</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * <p>The module for configuring access policies. Valid values:

-"Registration": Access the image repository

-"Chart": access Helm Chart</p>
         */
        public Builder moduleName(String moduleName) {
            this.putQueryParameter("ModuleName", moduleName);
            this.moduleName = moduleName;
            return this;
        }

        /**
         * <p>The type of the endpoint. Valid values: Internet.</p>
         */
        public Builder endpointType(String endpointType) {
            this.putQueryParameter("EndpointType", endpointType);
            this.endpointType = endpointType;
            return this;
        }

        /**
         * <p>CIDR block</p>
         */
        public Builder entry(String entry) {
            this.putQueryParameter("Entry", entry);
            this.entry = entry;
            return this;
        }

        public DeleteInstanceEndpointAclPolicyRequest build() {
            return new DeleteInstanceEndpointAclPolicyRequest(this);
        } 

    } 

}
