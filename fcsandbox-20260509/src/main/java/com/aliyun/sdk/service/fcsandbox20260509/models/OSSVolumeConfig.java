// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link OSSVolumeConfig} extends {@link TeaModel}
 *
 * <p>OSSVolumeConfig</p>
 */
public class OSSVolumeConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("bucketName")
    private String bucketName;

    @com.aliyun.core.annotation.NameInMap("bucketPath")
    private String bucketPath;

    @com.aliyun.core.annotation.NameInMap("endpoint")
    private String endpoint;

    @com.aliyun.core.annotation.NameInMap("readOnly")
    private Boolean readOnly;

    private OSSVolumeConfig(Builder builder) {
        this.bucketName = builder.bucketName;
        this.bucketPath = builder.bucketPath;
        this.endpoint = builder.endpoint;
        this.readOnly = builder.readOnly;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OSSVolumeConfig create() {
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
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
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
        private Boolean readOnly; 

        private Builder() {
        } 

        private Builder(OSSVolumeConfig model) {
            this.bucketName = model.bucketName;
            this.bucketPath = model.bucketPath;
            this.endpoint = model.endpoint;
            this.readOnly = model.readOnly;
        } 

        /**
         * <p>The name of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>example-bucket</p>
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        /**
         * <p>The path to mount within the bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>/agent-workspace</p>
         */
        public Builder bucketPath(String bucketPath) {
            this.bucketPath = bucketPath;
            return this;
        }

        /**
         * <p>The OSS access endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oss-cn-hangzhou.aliyuncs.com">https://oss-cn-hangzhou.aliyuncs.com</a></p>
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * <p>Specifies whether to mount the volume in read-only mode.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder readOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public OSSVolumeConfig build() {
            return new OSSVolumeConfig(this);
        } 

    } 

}
