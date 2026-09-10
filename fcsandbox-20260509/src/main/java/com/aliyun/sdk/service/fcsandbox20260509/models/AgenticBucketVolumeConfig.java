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
 * {@link AgenticBucketVolumeConfig} extends {@link TeaModel}
 *
 * <p>AgenticBucketVolumeConfig</p>
 */
public class AgenticBucketVolumeConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agenticBucket")
    private String agenticBucket;

    @com.aliyun.core.annotation.NameInMap("bucketName")
    private String bucketName;

    @com.aliyun.core.annotation.NameInMap("bucketPath")
    private String bucketPath;

    @com.aliyun.core.annotation.NameInMap("endpoint")
    private String endpoint;

    @com.aliyun.core.annotation.NameInMap("readOnly")
    private Boolean readOnly;

    private AgenticBucketVolumeConfig(Builder builder) {
        this.agenticBucket = builder.agenticBucket;
        this.bucketName = builder.bucketName;
        this.bucketPath = builder.bucketPath;
        this.endpoint = builder.endpoint;
        this.readOnly = builder.readOnly;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgenticBucketVolumeConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agenticBucket
     */
    public String getAgenticBucket() {
        return this.agenticBucket;
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
        private String agenticBucket; 
        private String bucketName; 
        private String bucketPath; 
        private String endpoint; 
        private Boolean readOnly; 

        private Builder() {
        } 

        private Builder(AgenticBucketVolumeConfig model) {
            this.agenticBucket = model.agenticBucket;
            this.bucketName = model.bucketName;
            this.bucketPath = model.bucketPath;
            this.endpoint = model.endpoint;
            this.readOnly = model.readOnly;
        } 

        /**
         * agenticBucket.
         */
        public Builder agenticBucket(String agenticBucket) {
            this.agenticBucket = agenticBucket;
            return this;
        }

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
         * readOnly.
         */
        public Builder readOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public AgenticBucketVolumeConfig build() {
            return new AgenticBucketVolumeConfig(this);
        } 

    } 

}
