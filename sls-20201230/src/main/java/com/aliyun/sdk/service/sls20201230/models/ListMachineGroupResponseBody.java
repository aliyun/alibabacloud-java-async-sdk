// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link ListMachineGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListMachineGroupResponseBody</p>
 */
public class ListMachineGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("machinegroups")
    private java.util.List<String> machinegroups;

    @com.aliyun.core.annotation.NameInMap("total")
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
    public java.util.List<String> getMachinegroups() {
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
        private java.util.List<String> machinegroups; 
        private Integer total; 

        /**
         * <p>The number of machine groups that are returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The machine groups that meet the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>[ &quot;test-machine-group-1&quot;, &quot;test-machine-group-2&quot; ]</p>
         */
        public Builder machinegroups(java.util.List<String> machinegroups) {
            this.machinegroups = machinegroups;
            return this;
        }

        /**
         * <p>The total number of machine groups that meet the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
