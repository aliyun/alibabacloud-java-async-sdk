// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetMachineGroupRequest} extends {@link RequestModel}
 *
 * <p>GetMachineGroupRequest</p>
 */
public class GetMachineGroupRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("MachineGroupID")
    @com.aliyun.core.annotation.Validation(required = true)
    private String machineGroupID;

    private GetMachineGroupRequest(Builder builder) {
        super(builder);
        this.machineGroupID = builder.machineGroupID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMachineGroupRequest create() {
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

    public static final class Builder extends Request.Builder<GetMachineGroupRequest, Builder> {
        private String machineGroupID; 

        private Builder() {
            super();
        } 

        private Builder(GetMachineGroupRequest request) {
            super(request);
            this.machineGroupID = request.machineGroupID;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder machineGroupID(String machineGroupID) {
            this.putPathParameter("MachineGroupID", machineGroupID);
            this.machineGroupID = machineGroupID;
            return this;
        }

        @Override
        public GetMachineGroupRequest build() {
            return new GetMachineGroupRequest(this);
        } 

    } 

}
