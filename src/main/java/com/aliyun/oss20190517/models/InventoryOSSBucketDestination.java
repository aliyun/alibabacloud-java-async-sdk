// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link InventoryOSSBucketDestination} extends {@link TeaModel}
 *
 * <p>InventoryOSSBucketDestination</p>
 */
public class InventoryOSSBucketDestination extends TeaModel {
    @NameInMap("Format")
    private InventoryFormat format;

    @NameInMap("AccountId")
    private String accountId;

    @NameInMap("RoleArn")
    private String roleArn;

    @NameInMap("Bucket")
    private String bucket;

    @NameInMap("Prefix")
    private String prefix;


    private InventoryOSSBucketDestination(Builder builder) {
        this.format = builder.format;
        this.accountId = builder.accountId;
        this.roleArn = builder.roleArn;
        this.bucket = builder.bucket;
        this.prefix = builder.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InventoryOSSBucketDestination create() {
        return builder().build();
    }

    /**
     * @return format
     */
    public InventoryFormat format() {
        return this.format;
    }

    /**
     * @return accountId
     */
    public String accountId() {
        return this.accountId;
    }

    /**
     * @return roleArn
     */
    public String roleArn() {
        return this.roleArn;
    }

    /**
     * @return bucket
     */
    public String bucket() {
        return this.bucket;
    }

    /**
     * @return prefix
     */
    public String prefix() {
        return this.prefix;
    }

    public static final class Builder {
        private InventoryFormat format; 
        private String accountId; 
        private String roleArn; 
        private String bucket; 
        private String prefix; 

        /**
         * <p>Format.</p>
         */
        public Builder format(InventoryFormat format) {
            this.format = format;
            return this;
        }

        /**
         * <p>The account ID granted by the bucket owner</p>
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>The name of the role to which the bucket owner grants permissions</p>
         */
        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * <p>The bucket that stores the exported inventory list</p>
         */
        public Builder bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>The path of the exported inventory list</p>
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        public InventoryOSSBucketDestination build() {
            return new InventoryOSSBucketDestination(this);
        } 

    } 

}
