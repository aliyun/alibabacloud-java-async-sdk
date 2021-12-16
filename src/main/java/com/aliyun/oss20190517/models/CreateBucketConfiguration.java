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
    @NameInMap("DataRedundancyType")
    private DataRedundancyType dataRedundancyType;

    @NameInMap("StorageClass")
    private StorageClass storageClass;


    private CreateBucketConfiguration(Builder builder) {
        this.dataRedundancyType = builder.dataRedundancyType;
        this.storageClass = builder.storageClass;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBucketConfiguration create() {
        return builder().build();
    }

    /**
     * @return dataRedundancyType
     */
    public DataRedundancyType getDataRedundancyType() {
        return this.dataRedundancyType;
    }

    /**
     * @return storageClass
     */
    public StorageClass getStorageClass() {
        return this.storageClass;
    }

    public static final class Builder {
        private DataRedundancyType dataRedundancyType; 
        private StorageClass storageClass; 

        /**
         * <p>DataRedundancyType.</p>
         */
        public Builder dataRedundancyType(DataRedundancyType dataRedundancyType) {
            this.dataRedundancyType = dataRedundancyType;
            return this;
        }

        /**
         * <p>StorageClass.</p>
         */
        public Builder storageClass(StorageClass storageClass) {
            this.storageClass = storageClass;
            return this;
        }

        public CreateBucketConfiguration build() {
            return new CreateBucketConfiguration(this);
        } 

    } 

}
