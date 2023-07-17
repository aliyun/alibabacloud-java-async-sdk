// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceGroupMachineGroupRequest} extends {@link RequestModel}
 *
 * <p>GetResourceGroupMachineGroupRequest</p>
 */
public class GetResourceGroupMachineGroupRequest extends Request {
    @Path
    @NameInMap("MachineGroupID")
    @Validation(required = true)
    private String machineGroupID;

    @Path
    @NameInMap("ResourceGroupID")
    @Validation(required = true)
    private String resourceGroupID;

    private GetResourceGroupMachineGroupRequest(Builder builder) {
        super(builder);
        this.machineGroupID = builder.machineGroupID;
        this.resourceGroupID = builder.resourceGroupID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceGroupMachineGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return machineGroupID
     */
    public String getMachineGroupID() {
        return this.machineGroupID;
    }

    /**
     * @return resourceGroupID
     */
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    public static final class Builder extends Request.Builder<GetResourceGroupMachineGroupRequest, Builder> {
        private String machineGroupID; 
        private String resourceGroupID; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceGroupMachineGroupRequest request) {
            super(request);
            this.machineGroupID = request.machineGroupID;
            this.resourceGroupID = request.resourceGroupID;
        } 

        /**
         * MachineGroupID.
         */
        public Builder machineGroupID(String machineGroupID) {
            this.putPathParameter("MachineGroupID", machineGroupID);
            this.machineGroupID = machineGroupID;
            return this;
        }

        /**
         * ResourceGroupID.
         */
        public Builder resourceGroupID(String resourceGroupID) {
            this.putPathParameter("ResourceGroupID", resourceGroupID);
            this.resourceGroupID = resourceGroupID;
            return this;
        }

        @Override
        public GetResourceGroupMachineGroupRequest build() {
            return new GetResourceGroupMachineGroupRequest(this);
        } 

    } 

}
