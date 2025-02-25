// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckBlockVolumeNameRequest} extends {@link RequestModel}
 *
 * <p>CheckBlockVolumeNameRequest</p>
 */
public class CheckBlockVolumeNameRequest extends Request {
    @Query
    @NameInMap("BucketEndpoint")
    @Validation(required = true)
    private String bucketEndpoint;

    @Query
    @NameInMap("BucketName")
    @Validation(required = true)
    private String bucketName;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("VolumeName")
    @Validation(required = true)
    private String volumeName;

    private CheckBlockVolumeNameRequest(Builder builder) {
        super(builder);
        this.bucketEndpoint = builder.bucketEndpoint;
        this.bucketName = builder.bucketName;
        this.securityToken = builder.securityToken;
        this.volumeName = builder.volumeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckBlockVolumeNameRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucketEndpoint
     */
    public String getBucketEndpoint() {
        return this.bucketEndpoint;
    }

    /**
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return volumeName
     */
    public String getVolumeName() {
        return this.volumeName;
    }

    public static final class Builder extends Request.Builder<CheckBlockVolumeNameRequest, Builder> {
        private String bucketEndpoint; 
        private String bucketName; 
        private String securityToken; 
        private String volumeName; 

        private Builder() {
            super();
        } 

        private Builder(CheckBlockVolumeNameRequest request) {
            super(request);
            this.bucketEndpoint = request.bucketEndpoint;
            this.bucketName = request.bucketName;
            this.securityToken = request.securityToken;
            this.volumeName = request.volumeName;
        } 

        /**
         * Bucket Endpoint。
         */
        public Builder bucketEndpoint(String bucketEndpoint) {
            this.putQueryParameter("BucketEndpoint", bucketEndpoint);
            this.bucketEndpoint = bucketEndpoint;
            return this;
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * VolumeName.
         */
        public Builder volumeName(String volumeName) {
            this.putQueryParameter("VolumeName", volumeName);
            this.volumeName = volumeName;
            return this;
        }

        @Override
        public CheckBlockVolumeNameRequest build() {
            return new CheckBlockVolumeNameRequest(this);
        } 

    } 

}
