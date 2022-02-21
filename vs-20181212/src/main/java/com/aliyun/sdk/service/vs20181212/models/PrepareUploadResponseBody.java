// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PrepareUploadResponseBody} extends {@link TeaModel}
 *
 * <p>PrepareUploadResponseBody</p>
 */
public class PrepareUploadResponseBody extends TeaModel {
    @NameInMap("BucketName")
    private String bucketName;

    @NameInMap("Endpoint")
    private String endpoint;

    @NameInMap("RequestId")
    private String requestId;

    private PrepareUploadResponseBody(Builder builder) {
        this.bucketName = builder.bucketName;
        this.endpoint = builder.endpoint;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PrepareUploadResponseBody create() {
        return builder().build();
    }

    /**
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String bucketName; 
        private String endpoint; 
        private String requestId; 

        /**
         * BucketName.
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        /**
         * Endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PrepareUploadResponseBody build() {
            return new PrepareUploadResponseBody(this);
        } 

    } 

}
