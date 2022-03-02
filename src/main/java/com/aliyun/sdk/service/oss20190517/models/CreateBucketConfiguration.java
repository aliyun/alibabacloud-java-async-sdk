// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link CreateBucketConfiguration} extends {@link TeaModel}
 *
 * <p>CreateBucketConfiguration</p>
 */
public class CreateBucketConfiguration extends TeaModel {
    @NameInMap("DataRedundancyType")
    private String dataRedundancyType;

    @NameInMap("StorageClass")
    private String storageClass;

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
    public String getDataRedundancyType() {
        return this.dataRedundancyType;
    }

    /**
     * @return storageClass
     */
    public String getStorageClass() {
        return this.storageClass;
    }

    public static final class Builder {
        private String dataRedundancyType; 
        private String storageClass; 

        /**
         * DataRedundancyType.
         */
        public Builder dataRedundancyType(String dataRedundancyType) {
            this.dataRedundancyType = dataRedundancyType;
            return this;
        }

        /**
         * DataRedundancyType.
         */
        public Builder dataRedundancyType(DataRedundancyType dataRedundancyType) {
            this.dataRedundancyType = dataRedundancyType.getValue();
            return this;
        }

        /**
         * StorageClass.
         */
        public Builder storageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }

        /**
         * StorageClass.
         */
        public Builder storageClass(StorageClass storageClass) {
            this.storageClass = storageClass.getValue();
            return this;
        }

        public CreateBucketConfiguration build() {
            return new CreateBucketConfiguration(this);
        } 

    } 

}
