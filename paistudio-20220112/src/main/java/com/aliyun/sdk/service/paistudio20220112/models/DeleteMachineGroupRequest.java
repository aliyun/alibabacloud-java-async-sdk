// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMachineGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteMachineGroupRequest</p>
 */
public class DeleteMachineGroupRequest extends Request {
    @Path
    @NameInMap("MachineGroupID")
    private String machineGroupID;

    private DeleteMachineGroupRequest(Builder builder) {
        super(builder);
        this.machineGroupID = builder.machineGroupID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMachineGroupRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteMachineGroupRequest, Builder> {
        private String machineGroupID; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMachineGroupRequest request) {
            super(request);
            this.machineGroupID = request.machineGroupID;
        } 

        /**
         * MachineGroupID.
         */
        public Builder machineGroupID(String machineGroupID) {
            this.putPathParameter("MachineGroupID", machineGroupID);
            this.machineGroupID = machineGroupID;
            return this;
        }

        @Override
        public DeleteMachineGroupRequest build() {
            return new DeleteMachineGroupRequest(this);
        } 

    } 

}
