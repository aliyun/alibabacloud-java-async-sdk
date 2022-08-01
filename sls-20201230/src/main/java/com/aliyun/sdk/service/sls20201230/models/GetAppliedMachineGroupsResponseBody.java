// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetAppliedMachineGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>GetAppliedMachineGroupsResponseBody</p>
 */
public class GetAppliedMachineGroupsResponseBody extends TeaModel {
    @NameInMap("count")
    private Integer count;

    @NameInMap("machinegroups")
    private java.util.List < String > machinegroups;

    private GetAppliedMachineGroupsResponseBody(Builder builder) {
        this.count = builder.count;
        this.machinegroups = builder.machinegroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppliedMachineGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return machinegroups
     */
    public java.util.List < String > getMachinegroups() {
        return this.machinegroups;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List < String > machinegroups; 

        /**
         * 返回的机器组数量。
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * 返回的机器组名称列表。
         */
        public Builder machinegroups(java.util.List < String > machinegroups) {
            this.machinegroups = machinegroups;
            return this;
        }

        public GetAppliedMachineGroupsResponseBody build() {
            return new GetAppliedMachineGroupsResponseBody(this);
        } 

    } 

}
