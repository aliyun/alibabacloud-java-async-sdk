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
 * {@link ListMachinesResponseBody} extends {@link TeaModel}
 *
 * <p>ListMachinesResponseBody</p>
 */
public class ListMachinesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("machines")
    private java.util.List<Machine> machines;

    @com.aliyun.core.annotation.NameInMap("total")
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
    public java.util.List<Machine> getMachines() {
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
        private java.util.List<Machine> machines; 
        private Integer total; 

        /**
         * <p>The number of machines that are returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The machines that are returned.</p>
         */
        public Builder machines(java.util.List<Machine> machines) {
            this.machines = machines;
            return this;
        }

        /**
         * <p>The total number of machines.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
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
