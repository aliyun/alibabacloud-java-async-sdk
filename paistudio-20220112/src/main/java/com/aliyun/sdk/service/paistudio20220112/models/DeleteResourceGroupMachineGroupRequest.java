// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteResourceGroupMachineGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteResourceGroupMachineGroupRequest</p>
 */
public class DeleteResourceGroupMachineGroupRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("MachineGroupID")
    private String machineGroupID;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ResourceGroupID")
    private String resourceGroupID;

    private DeleteResourceGroupMachineGroupRequest(Builder builder) {
        super(builder);
        this.machineGroupID = builder.machineGroupID;
        this.resourceGroupID = builder.resourceGroupID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteResourceGroupMachineGroupRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteResourceGroupMachineGroupRequest, Builder> {
        private String machineGroupID; 
        private String resourceGroupID; 

        private Builder() {
            super();
        } 

        private Builder(DeleteResourceGroupMachineGroupRequest request) {
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
        public DeleteResourceGroupMachineGroupRequest build() {
            return new DeleteResourceGroupMachineGroupRequest(this);
        } 

    } 

}
