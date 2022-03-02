// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

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
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return transferType
     */
    public String getTransferType() {
        return this.transferType;
    }

    public static final class Builder {
        private String bucket; 
        private String location; 
        private String transferType; 

        /**
         * The destination bucket to which the data is replicated
         */
        public Builder bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * The region in which the destination bucket is located
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * The link used to transfer data in CRR
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
