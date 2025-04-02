// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link InitMultipartFileUploadResponseBody} extends {@link TeaModel}
 *
 * <p>InitMultipartFileUploadResponseBody</p>
 */
public class InitMultipartFileUploadResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("storageDriver")
    private String storageDriver;

    @com.aliyun.core.annotation.NameInMap("uploadKey")
    private String uploadKey;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private InitMultipartFileUploadResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.storageDriver = builder.storageDriver;
        this.uploadKey = builder.uploadKey;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitMultipartFileUploadResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return storageDriver
     */
    public String getStorageDriver() {
        return this.storageDriver;
    }

    /**
     * @return uploadKey
     */
    public String getUploadKey() {
        return this.uploadKey;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private String requestId; 
        private String storageDriver; 
        private String uploadKey; 
        private String vendorRequestId; 
        private String vendorType; 

        private Builder() {
        } 

        private Builder(InitMultipartFileUploadResponseBody model) {
            this.requestId = model.requestId;
            this.storageDriver = model.storageDriver;
            this.uploadKey = model.uploadKey;
            this.vendorRequestId = model.vendorRequestId;
            this.vendorType = model.vendorType;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * storageDriver.
         */
        public Builder storageDriver(String storageDriver) {
            this.storageDriver = storageDriver;
            return this;
        }

        /**
         * uploadKey.
         */
        public Builder uploadKey(String uploadKey) {
            this.uploadKey = uploadKey;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public InitMultipartFileUploadResponseBody build() {
            return new InitMultipartFileUploadResponseBody(this);
        } 

    } 

}
