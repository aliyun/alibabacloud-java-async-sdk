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

        private Builder() {
        } 

        private Builder(WebOSSMountPoint model) {
            this.bucketName = model.bucketName;
            this.bucketPath = model.bucketPath;
            this.mountDir = model.mountDir;
            this.readOnly = model.readOnly;
        } 

        /**
         * <p>The name of the bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>gcx-pic-test</p>
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        /**
         * <p>The storage path in an OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>billing-2023-11-06_17:30:18-rn7wG8</p>
         */
        public Builder bucketPath(String bucketPath) {
            this.bucketPath = bucketPath;
            return this;
        }

        /**
         * <p>The local mount directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/k8s-prod/oms-api-yy-prod/log</p>
         */
        public Builder mountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }

        /**
         * <p>Specifies whether it is read-only.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
