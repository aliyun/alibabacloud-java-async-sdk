// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link OSSMountPoint} extends {@link TeaModel}
 *
 * <p>OSSMountPoint</p>
 */
public class OSSMountPoint extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("bucketName")
    @com.aliyun.core.annotation.Validation(maxLength = 64, minLength = 3)
    private String bucketName;

    @com.aliyun.core.annotation.NameInMap("bucketPath")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String bucketPath;

    @com.aliyun.core.annotation.NameInMap("endpoint")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String endpoint;

    @com.aliyun.core.annotation.NameInMap("mountDir")
    @com.aliyun.core.annotation.Validation(maxLength = 64, minLength = 2)
    private String mountDir;

    @com.aliyun.core.annotation.NameInMap("readOnly")
    private Boolean readOnly;

    private OSSMountPoint(Builder builder) {
        this.bucketName = builder.bucketName;
        this.bucketPath = builder.bucketPath;
        this.endpoint = builder.endpoint;
        this.mountDir = builder.mountDir;
        this.readOnly = builder.readOnly;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OSSMountPoint create() {
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
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
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
        private String endpoint; 
        private String mountDir; 
        private Boolean readOnly; 

        /**
         * bucketName.
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        /**
         * bucketPath.
         */
        public Builder bucketPath(String bucketPath) {
            this.bucketPath = bucketPath;
            return this;
        }

        /**
         * endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * mountDir.
         */
        public Builder mountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }

        /**
         * readOnly.
         */
        public Builder readOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public OSSMountPoint build() {
            return new OSSMountPoint(this);
        } 

    } 

}
