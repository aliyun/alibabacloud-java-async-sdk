// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateBucketConfiguration} extends {@link TeaModel}
 *
 * <p>CreateBucketConfiguration</p>
 */
public class CreateBucketConfiguration extends TeaModel {
    @NameInMap("StorageClass")
    private StorageClass storageClass;

    @NameInMap("DataRedundancyType")
    private DataRedundancyType dataRedundancyType;


    private CreateBucketConfiguration(Builder builder) {
        this.storageClass = builder.storageClass;
        this.dataRedundancyType = builder.dataRedundancyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBucketConfiguration create() {
        return builder().build();
    }

    /**
     * @return storageClass
     */
    public StorageClass storageClass() {
        return this.storageClass;
    }

    /**
     * @return dataRedundancyType
     */
    public DataRedundancyType dataRedundancyType() {
        return this.dataRedundancyType;
    }

    public static final class Builder {
        private StorageClass storageClass; 
        private DataRedundancyType dataRedundancyType; 

        /**
         * <p>StorageClass.</p>
         */
        public Builder storageClass(StorageClass storageClass) {
            this.storageClass = storageClass;
            return this;
        }

        /**
         * <p>DataRedundancyType.</p>
         */
        public Builder dataRedundancyType(DataRedundancyType dataRedundancyType) {
            this.dataRedundancyType = dataRedundancyType;
            return this;
        }

        public CreateBucketConfiguration build() {
            return new CreateBucketConfiguration(this);
        } 

    } 

}
