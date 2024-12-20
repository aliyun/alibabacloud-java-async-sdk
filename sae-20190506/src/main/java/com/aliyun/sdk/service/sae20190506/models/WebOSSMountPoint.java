// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link WebOSSMountPoint} extends {@link TeaModel}
 *
 * <p>WebOSSMountPoint</p>
 */
public class WebOSSMountPoint extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BucketName")
    @com.aliyun.core.annotation.Validation(maxLength = 64, minLength = 3)
    private String bucketName;

    @com.aliyun.core.annotation.NameInMap("BucketPath")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String bucketPath;

    @com.aliyun.core.annotation.NameInMap("MountDir")
    @com.aliyun.core.annotation.Validation(maxLength = 64, minLength = 2)
    private String mountDir;

    @com.aliyun.core.annotation.NameInMap("ReadOnly")
    private Boolean readOnly;

    private WebOSSMountPoint(Builder builder) {
        this.bucketName = builder.bucketName;
        this.bucketPath = builder.bucketPath;
        this.mountDir = builder.mountDir;
        this.readOnly = builder.readOnly;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebOSSMountPoint create() {
        return builder().build();
    }

    /**
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * @return bucketPath
     */
    public String getBucketPath() {
        return this.bucketPath;
    }

    /**
     * @return mountDir
     */
    public String getMountDir() {
        return this.mountDir;
    }

    /**
     * @return readOnly
     */
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public static final class Builder {
        private String bucketName; 
        private String bucketPath; 
        private String mountDir; 
        private Boolean readOnly; 

        /**
         * BucketName.
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        /**
         * BucketPath.
         */
        public Builder bucketPath(String bucketPath) {
            this.bucketPath = bucketPath;
            return this;
        }

        /**
         * MountDir.
         */
        public Builder mountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }

        /**
         * ReadOnly.
         */
        public Builder readOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public WebOSSMountPoint build() {
            return new WebOSSMountPoint(this);
        } 

    } 

}
