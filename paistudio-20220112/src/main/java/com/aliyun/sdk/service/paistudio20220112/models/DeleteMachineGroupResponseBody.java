// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteMachineGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteMachineGroupResponseBody</p>
 */
public class DeleteMachineGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MachineGroupID")
    private String machineGroupID;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteMachineGroupResponseBody(Builder builder) {
        this.machineGroupID = builder.machineGroupID;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMachineGroupResponseBody create() {
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

        public DeleteMachineGroupResponseBody build() {
            return new DeleteMachineGroupResponseBody(this);
        } 

    } 

}
