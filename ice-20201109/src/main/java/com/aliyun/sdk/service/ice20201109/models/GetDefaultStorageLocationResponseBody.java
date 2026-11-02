// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetDefaultStorageLocationResponseBody} extends {@link TeaModel}
 *
 * <p>GetDefaultStorageLocationResponseBody</p>
 */
public class GetDefaultStorageLocationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Bucket")
    private String bucket;

    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    private GetDefaultStorageLocationResponseBody(Builder builder) {
        this.bucket = builder.bucket;
        this.path = builder.path;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.storageType = builder.storageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDefaultStorageLocationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    public static final class Builder {
        private String bucket; 
        private String path; 
        private String requestId; 
        private String status; 
        private String storageType; 

        private Builder() {
        } 

        private Builder(GetDefaultStorageLocationResponseBody model) {
            this.bucket = model.bucket;
            this.path = model.path;
            this.requestId = model.requestId;
            this.status = model.status;
            this.storageType = model.storageType;
        } 

        /**
         * <p>OSS bucket name</p>
         * 
         * <strong>example:</strong>
         * <p>oss-test-bucket</p>
         */
        public Builder bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>Path</p>
         * 
         * <strong>example:</strong>
         * <p>ice/dir</p>
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Bucket status:</p>
         * <ul>
         * <li><p>Normal: The bucket is in normal status.</p>
         * </li>
         * <li><p>notExist: The bucket does not exist.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Storage class</p>
         * 
         * <strong>example:</strong>
         * <p>user_oss_bucket</p>
         */
        public Builder storageType(String storageType) {
            this.storageType = storageType;
            return this;
        }

        public GetDefaultStorageLocationResponseBody build() {
            return new GetDefaultStorageLocationResponseBody(this);
        } 

    } 

}
