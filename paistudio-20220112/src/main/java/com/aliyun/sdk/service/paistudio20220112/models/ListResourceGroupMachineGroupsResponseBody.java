// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
    private java.util.List < MachineGroup > machineGroups;

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

    /**
     * @return machineGroups
     */
    public java.util.List < MachineGroup > getMachineGroups() {
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
        private java.util.List < MachineGroup > machineGroups; 
        private String requestId; 
        private String totalCount; 

        /**
         * MachineGroups.
         */
        public Builder machineGroups(java.util.List < MachineGroup > machineGroups) {
            this.machineGroups = machineGroups;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
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
