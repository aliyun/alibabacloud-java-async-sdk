// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

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
    @NameInMap("EndpointType")
    @Validation(required = true)
    private String endpointType;

    @Query
    @NameInMap("Entry")
    @Validation(required = true)
    private String entry;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ModuleName")
    private String moduleName;

    private DeleteInstanceEndpointAclPolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.endpointType = builder.endpointType;
        this.entry = builder.entry;
        this.instanceId = builder.instanceId;
        this.moduleName = builder.moduleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInstanceEndpointAclPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<DeleteInstanceEndpointAclPolicyRequest, Builder> {
        private String regionId; 
        private String endpointType; 
        private String entry; 
        private String instanceId; 
        private String moduleName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteInstanceEndpointAclPolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.endpointType = request.endpointType;
            this.entry = request.entry;
            this.instanceId = request.instanceId;
            this.moduleName = request.moduleName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The type of the endpoint. Set the value to Internet.
         */
        public Builder endpointType(String endpointType) {
            this.putQueryParameter("EndpointType", endpointType);
            this.endpointType = endpointType;
            return this;
        }

        /**
         * The CIDR block.
         */
        public Builder entry(String entry) {
            this.putQueryParameter("Entry", entry);
            this.entry = entry;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the module that you want to access. Valid values:
         * <p>
         * 
         * *   `Registry`: the image repository.
         * *   `Chart`: a Helm chart.
         */
        public Builder moduleName(String moduleName) {
            this.putQueryParameter("ModuleName", moduleName);
            this.moduleName = moduleName;
            return this;
        }

        @Override
        public DeleteInstanceEndpointAclPolicyRequest build() {
            return new DeleteInstanceEndpointAclPolicyRequest(this);
        } 

    } 

}
