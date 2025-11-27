// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link OssConfiguration} extends {@link TeaModel}
 *
 * <p>OssConfiguration</p>
 */
public class OssConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("bucketName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bucketName;

    @com.aliyun.core.annotation.NameInMap("mountPoint")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mountPoint;

    @com.aliyun.core.annotation.NameInMap("permission")
    private String permission;

    @com.aliyun.core.annotation.NameInMap("prefix")
    @com.aliyun.core.annotation.Validation(required = true)
    private String prefix;

    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    private OssConfiguration(Builder builder) {
        this.bucketName = builder.bucketName;
        this.mountPoint = builder.mountPoint;
        this.permission = builder.permission;
        this.prefix = builder.prefix;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OssConfiguration create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * @return mountPoint
     */
    public String getMountPoint() {
        return this.mountPoint;
    }

    /**
     * @return permission
     */
    public String getPermission() {
        return this.permission;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder {
        private String bucketName; 
        private String mountPoint; 
        private String permission; 
        private String prefix; 
        private String region; 

        private Builder() {
        } 

        private Builder(OssConfiguration model) {
            this.bucketName = model.bucketName;
            this.mountPoint = model.mountPoint;
            this.permission = model.permission;
            this.prefix = model.prefix;
            this.region = model.region;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder mountPoint(String mountPoint) {
            this.mountPoint = mountPoint;
            return this;
        }

        /**
         * permission.
         */
        public Builder permission(String permission) {
            this.permission = permission;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * region.
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        public OssConfiguration build() {
            return new OssConfiguration(this);
        } 

    } 

}
