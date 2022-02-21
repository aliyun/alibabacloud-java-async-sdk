// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PartitionSpec} extends {@link TeaModel}
 *
 * <p>PartitionSpec</p>
 */
public class PartitionSpec extends TeaModel {
    @NameInMap("SharedSDPartitions")
    private java.util.List < Partition > sharedSDPartitions;

    @NameInMap("SharedStorageDescriptor")
    private SharedStorageDescriptor sharedStorageDescriptor;

    private PartitionSpec(Builder builder) {
        this.sharedSDPartitions = builder.sharedSDPartitions;
        this.sharedStorageDescriptor = builder.sharedStorageDescriptor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PartitionSpec create() {
        return builder().build();
    }

    /**
     * @return sharedSDPartitions
     */
    public java.util.List < Partition > getSharedSDPartitions() {
        return this.sharedSDPartitions;
    }

    /**
     * @return sharedStorageDescriptor
     */
    public SharedStorageDescriptor getSharedStorageDescriptor() {
        return this.sharedStorageDescriptor;
    }

    public static final class Builder {
        private java.util.List < Partition > sharedSDPartitions; 
        private SharedStorageDescriptor sharedStorageDescriptor; 

        /**
         * SharedSDPartitions
         */
        public Builder sharedSDPartitions(java.util.List < Partition > sharedSDPartitions) {
            this.sharedSDPartitions = sharedSDPartitions;
            return this;
        }

        /**
         * SharedStorageDescriptor
         */
        public Builder sharedStorageDescriptor(SharedStorageDescriptor sharedStorageDescriptor) {
            this.sharedStorageDescriptor = sharedStorageDescriptor;
            return this;
        }

        public PartitionSpec build() {
            return new PartitionSpec(this);
        } 

    } 

    public static class SharedStorageDescriptor extends TeaModel {
        @NameInMap("Cols")
        private java.util.List < FieldSchema > cols;

        @NameInMap("Location")
        private String location;

        private SharedStorageDescriptor(Builder builder) {
            this.cols = builder.cols;
            this.location = builder.location;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SharedStorageDescriptor create() {
            return builder().build();
        }

        /**
         * @return cols
         */
        public java.util.List < FieldSchema > getCols() {
            return this.cols;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        public static final class Builder {
            private java.util.List < FieldSchema > cols; 
            private String location; 

            /**
             * Cols
             */
            public Builder cols(java.util.List < FieldSchema > cols) {
                this.cols = cols;
                return this;
            }

            /**
             * Location
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            public SharedStorageDescriptor build() {
                return new SharedStorageDescriptor(this);
            } 

        } 

    }
}
