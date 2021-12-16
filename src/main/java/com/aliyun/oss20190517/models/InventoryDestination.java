// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link InventoryDestination} extends {@link TeaModel}
 *
 * <p>InventoryDestination</p>
 */
public class InventoryDestination extends TeaModel {
    @NameInMap("OSSBucketDestination")
    private InventoryOSSBucketDestination OSSBucketDestination;


    private InventoryDestination(Builder builder) {
        this.OSSBucketDestination = builder.OSSBucketDestination;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InventoryDestination create() {
        return builder().build();
    }

    /**
     * @return OSSBucketDestination
     */
    public InventoryOSSBucketDestination getOSSBucketDestination() {
        return this.OSSBucketDestination;
    }

    public static final class Builder {
        private InventoryOSSBucketDestination OSSBucketDestination; 

        /**
         * <p>The information about the bucket that stores the exported inventory list</p>
         */
        public Builder OSSBucketDestination(InventoryOSSBucketDestination OSSBucketDestination) {
            this.OSSBucketDestination = OSSBucketDestination;
            return this;
        }

        public InventoryDestination build() {
            return new InventoryDestination(this);
        } 

    } 

}
