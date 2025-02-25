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
 * {@link GetAppliedMachineGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>GetAppliedMachineGroupsResponseBody</p>
 */
public class GetAppliedMachineGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("machinegroups")
    private java.util.List<String> machinegroups;

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
    public java.util.List<String> getMachinegroups() {
        return this.machinegroups;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List<String> machinegroups; 

        /**
         * <p>The number of returned machine groups.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The names of the returned machine groups.</p>
         * 
         * <strong>example:</strong>
         * <p>[ &quot;sample-group1&quot;,&quot;sample-group2&quot; ]</p>
         */
        public Builder machinegroups(java.util.List<String> machinegroups) {
            this.machinegroups = machinegroups;
            return this;
        }

        public GetAppliedMachineGroupsResponseBody build() {
            return new GetAppliedMachineGroupsResponseBody(this);
        } 

    } 

}
