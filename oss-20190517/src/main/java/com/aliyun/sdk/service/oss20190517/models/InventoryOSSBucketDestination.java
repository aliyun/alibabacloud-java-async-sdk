// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link InventoryOSSBucketDestination} extends {@link TeaModel}
 *
 * <p>InventoryOSSBucketDestination</p>
 */
public class InventoryOSSBucketDestination extends TeaModel {
    @NameInMap("AccountId")
    private String accountId;

    @NameInMap("Bucket")
    private String bucket;

    @NameInMap("Encryption")
    private InventoryEncryption encryption;

    @NameInMap("Format")
    private String format;

    @NameInMap("Prefix")
    private String prefix;

    @NameInMap("RoleArn")
    private String roleArn;

    private InventoryOSSBucketDestination(Builder builder) {
        this.accountId = builder.accountId;
        this.bucket = builder.bucket;
        this.encryption = builder.encryption;
        this.format = builder.format;
        this.prefix = builder.prefix;
        this.roleArn = builder.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InventoryOSSBucketDestination create() {
        return builder().build();
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return encryption
     */
    public InventoryEncryption getEncryption() {
        return this.encryption;
    }

    /**
     * @return format
     */
    public String getFormat() {
        return this.format;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    public static final class Builder {
        private String accountId; 
        private String bucket; 
        private InventoryEncryption encryption; 
        private String format; 
        private String prefix; 
        private String roleArn; 

        /**
         * The account ID granted by the bucket owner
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * The bucket that stores the exported inventory list
         */
        public Builder bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * Encryption.
         */
        public Builder encryption(InventoryEncryption encryption) {
            this.encryption = encryption;
            return this;
        }

        /**
         * Format.
         */
        public Builder format(String format) {
            this.format = format;
            return this;
        }

        /**
         * Format.
         */
        public Builder format(InventoryFormat format) {
            this.format = format.getValue();
            return this;
        }

        /**
         * The path of the exported inventory list
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * The name of the role to which the bucket owner grants permissions
         */
        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public InventoryOSSBucketDestination build() {
            return new InventoryOSSBucketDestination(this);
        } 

    } 

}
