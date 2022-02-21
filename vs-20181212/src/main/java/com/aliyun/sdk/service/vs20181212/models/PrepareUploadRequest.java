// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PrepareUploadRequest} extends {@link RequestModel}
 *
 * <p>PrepareUploadRequest</p>
 */
public class PrepareUploadRequest extends Request {
    @Query
    @NameInMap("BucketName")
    @Validation(required = true)
    private String bucketName;

    @Query
    @NameInMap("ClientIp")
    private String clientIp;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private PrepareUploadRequest(Builder builder) {
        super(builder);
        this.bucketName = builder.bucketName;
        this.clientIp = builder.clientIp;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PrepareUploadRequest create() {
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
     * @return clientIp
     */
    public String getClientIp() {
        return this.clientIp;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<PrepareUploadRequest, Builder> {
        private String bucketName; 
        private String clientIp; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(PrepareUploadRequest response) {
            super(response);
            this.bucketName = response.bucketName;
            this.clientIp = response.clientIp;
            this.ownerId = response.ownerId;
        } 

        /**
         * BucketName.
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * ClientIp.
         */
        public Builder clientIp(String clientIp) {
            this.putQueryParameter("ClientIp", clientIp);
            this.clientIp = clientIp;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public PrepareUploadRequest build() {
            return new PrepareUploadRequest(this);
        } 

    } 

}
