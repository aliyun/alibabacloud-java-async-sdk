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
 * {@link ListResourceGroupMachineGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceGroupMachineGroupsResponseBody</p>
 */
public class ListResourceGroupMachineGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MachineGroups")
    private java.util.List<MachineGroup> machineGroups;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListResourceGroupMachineGroupsResponseBody(Builder builder) {
        this.machineGroups = builder.machineGroups;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceGroupMachineGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return machineGroups
     */
    public java.util.List<MachineGroup> getMachineGroups() {
        return this.machineGroups;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<MachineGroup> machineGroups; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(ListResourceGroupMachineGroupsResponseBody model) {
            this.machineGroups = model.machineGroups;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>A list of machine groups.</p>
         */
        public Builder machineGroups(java.util.List<MachineGroup> machineGroups) {
            this.machineGroups = machineGroups;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E7C42CC7-2E85-508A-84F4-923B605FD10F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of machine groups.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListResourceGroupMachineGroupsResponseBody build() {
            return new ListResourceGroupMachineGroupsResponseBody(this);
        } 

    } 

}
