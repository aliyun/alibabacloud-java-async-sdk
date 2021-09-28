// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ReplicationDestination} extends {@link TeaModel}
 *
 * <p>ReplicationDestination</p>
 */
public class ReplicationDestination extends TeaModel {
    @NameInMap("Bucket")
    private String bucket;

    @NameInMap("Location")
    private String location;

    @NameInMap("TransferType")
    private String transferType;


    private ReplicationDestination(Builder builder) {
        this.bucket = builder.bucket;
        this.location = builder.location;
        this.transferType = builder.transferType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplicationDestination create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String bucket() {
        return this.bucket;
    }

    /**
     * @return location
     */
    public String location() {
        return this.location;
    }

    /**
     * @return transferType
     */
    public String transferType() {
        return this.transferType;
    }

    public static final class Builder {
        private String bucket; 
        private String location; 
        private String transferType; 

        /**
         * <p>The destination bucket to which the data is replicated</p>
         */
        public Builder bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>The region in which the destination bucket is located</p>
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * <p>The link used to transfer data in CRR</p>
         */
        public Builder transferType(String transferType) {
            this.transferType = transferType;
            return this;
        }

        public ReplicationDestination build() {
            return new ReplicationDestination(this);
        } 

    } 

}
