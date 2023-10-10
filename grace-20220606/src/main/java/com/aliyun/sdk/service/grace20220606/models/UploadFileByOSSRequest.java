// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.grace20220606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadFileByOSSRequest} extends {@link RequestModel}
 *
 * <p>UploadFileByOSSRequest</p>
 */
public class UploadFileByOSSRequest extends Request {
    @Query
    @NameInMap("bucketName")
    @Validation(required = true)
    private String bucketName;

    @Query
    @NameInMap("displayName")
    private String displayName;

    @Query
    @NameInMap("endpoint")
    @Validation(required = true)
    private String endpoint;

    @Query
    @NameInMap("objectName")
    @Validation(required = true)
    private String objectName;

    @Query
    @NameInMap("type")
    @Validation(required = true)
    private String type;

    private UploadFileByOSSRequest(Builder builder) {
        super(builder);
        this.bucketName = builder.bucketName;
        this.displayName = builder.displayName;
        this.endpoint = builder.endpoint;
        this.objectName = builder.objectName;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadFileByOSSRequest create() {
        return builder().build();
    }

    @Override
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
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return objectName
     */
    public String getObjectName() {
        return this.objectName;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<UploadFileByOSSRequest, Builder> {
        private String bucketName; 
        private String displayName; 
        private String endpoint; 
        private String objectName; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UploadFileByOSSRequest request) {
            super(request);
            this.bucketName = request.bucketName;
            this.displayName = request.displayName;
            this.endpoint = request.endpoint;
            this.objectName = request.objectName;
            this.type = request.type;
        } 

        /**
         * bucketName.
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("bucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * displayName.
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * oss endpoint
         */
        public Builder endpoint(String endpoint) {
            this.putQueryParameter("endpoint", endpoint);
            this.endpoint = endpoint;
            return this;
        }

        /**
         * objectName.
         */
        public Builder objectName(String objectName) {
            this.putQueryParameter("objectName", objectName);
            this.objectName = objectName;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public UploadFileByOSSRequest build() {
            return new UploadFileByOSSRequest(this);
        } 

    } 

}
