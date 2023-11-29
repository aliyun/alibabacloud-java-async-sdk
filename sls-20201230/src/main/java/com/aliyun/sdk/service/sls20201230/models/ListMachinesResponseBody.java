// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListMachinesResponseBody} extends {@link TeaModel}
 *
 * <p>ListMachinesResponseBody</p>
 */
public class ListMachinesResponseBody extends TeaModel {
    @NameInMap("count")
    private Integer count;

    @NameInMap("machines")
    private java.util.List < Machine > machines;

    @NameInMap("total")
    private Integer total;

    private ListMachinesResponseBody(Builder builder) {
        this.count = builder.count;
        this.machines = builder.machines;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMachinesResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return machines
     */
    public java.util.List < Machine > getMachines() {
        return this.machines;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List < Machine > machines; 
        private Integer total; 

        /**
         * The number of machines that are returned on the current page.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * The machines that are returned.
         */
        public Builder machines(java.util.List < Machine > machines) {
            this.machines = machines;
            return this;
        }

        /**
         * The total number of machines.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListMachinesResponseBody build() {
            return new ListMachinesResponseBody(this);
        } 

    } 

}
