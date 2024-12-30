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
 * {@link DeleteResourceGroupMachineGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteResourceGroupMachineGroupResponseBody</p>
 */
public class DeleteResourceGroupMachineGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MachineGroupID")
    private String machineGroupID;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteResourceGroupMachineGroupResponseBody(Builder builder) {
        this.machineGroupID = builder.machineGroupID;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteResourceGroupMachineGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return machineGroupID
     */
    public String getMachineGroupID() {
        return this.machineGroupID;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String machineGroupID; 
        private String requestId; 

        /**
         * MachineGroupID.
         */
        public Builder machineGroupID(String machineGroupID) {
            this.machineGroupID = machineGroupID;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteResourceGroupMachineGroupResponseBody build() {
            return new DeleteResourceGroupMachineGroupResponseBody(this);
        } 

    } 

}
