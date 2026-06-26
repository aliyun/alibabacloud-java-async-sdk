// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link ListPartitionsByNamesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPartitionsByNamesResponseBody</p>
 */
public class ListPartitionsByNamesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("partitions")
    private java.util.List<Partition> partitions;

    private ListPartitionsByNamesResponseBody(Builder builder) {
        this.partitions = builder.partitions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPartitionsByNamesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return partitions
     */
    public java.util.List<Partition> getPartitions() {
        return this.partitions;
    }

    public static final class Builder {
        private java.util.List<Partition> partitions; 

        private Builder() {
        } 

        private Builder(ListPartitionsByNamesResponseBody model) {
            this.partitions = model.partitions;
        } 

        /**
         * partitions.
         */
        public Builder partitions(java.util.List<Partition> partitions) {
            this.partitions = partitions;
            return this;
        }

        public ListPartitionsByNamesResponseBody build() {
            return new ListPartitionsByNamesResponseBody(this);
        } 

    } 

}
