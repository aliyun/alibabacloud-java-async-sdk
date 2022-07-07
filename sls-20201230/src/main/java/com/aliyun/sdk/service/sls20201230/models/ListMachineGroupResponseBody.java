// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListMachineGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListMachineGroupResponseBody</p>
 */
public class ListMachineGroupResponseBody extends TeaModel {
    @NameInMap("count")
    private Integer count;

    @NameInMap("machinegroups")
    private java.util.List < String > machinegroups;

    @NameInMap("total")
    private Integer total;

    private ListMachineGroupResponseBody(Builder builder) {
        this.count = builder.count;
        this.machinegroups = builder.machinegroups;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMachineGroupResponseBody create() {
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

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List < String > machinegroups; 
        private Integer total; 

        /**
         * 当前页返回的机器组数量。
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * 机器组名称列表。
         */
        public Builder machinegroups(java.util.List < String > machinegroups) {
            this.machinegroups = machinegroups;
            return this;
        }

        /**
         * 机器组总数量。
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListMachineGroupResponseBody build() {
            return new ListMachineGroupResponseBody(this);
        } 

    } 

}
