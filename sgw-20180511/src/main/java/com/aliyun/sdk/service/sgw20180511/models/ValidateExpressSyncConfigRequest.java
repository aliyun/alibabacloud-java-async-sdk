// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateExpressSyncConfigRequest} extends {@link RequestModel}
 *
 * <p>ValidateExpressSyncConfigRequest</p>
 */
public class ValidateExpressSyncConfigRequest extends Request {
    @Query
    @NameInMap("BucketName")
    @Validation(required = true)
    private String bucketName;

    @Query
    @NameInMap("BucketPrefix")
    private String bucketPrefix;

    @Query
    @NameInMap("BucketRegion")
    @Validation(required = true)
    private String bucketRegion;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private ValidateExpressSyncConfigRequest(Builder builder) {
        super(builder);
        this.bucketName = builder.bucketName;
        this.bucketPrefix = builder.bucketPrefix;
        this.bucketRegion = builder.bucketRegion;
        this.name = builder.name;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateExpressSyncConfigRequest create() {
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
     * @return bucketPrefix
     */
    public String getBucketPrefix() {
        return this.bucketPrefix;
    }

    /**
     * @return bucketRegion
     */
    public String getBucketRegion() {
        return this.bucketRegion;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<ValidateExpressSyncConfigRequest, Builder> {
        private String bucketName; 
        private String bucketPrefix; 
        private String bucketRegion; 
        private String name; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(ValidateExpressSyncConfigRequest request) {
            super(request);
            this.bucketName = request.bucketName;
            this.bucketPrefix = request.bucketPrefix;
            this.bucketRegion = request.bucketRegion;
            this.name = request.name;
            this.securityToken = request.securityToken;
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
         * BucketPrefix.
         */
        public Builder bucketPrefix(String bucketPrefix) {
            this.putQueryParameter("BucketPrefix", bucketPrefix);
            this.bucketPrefix = bucketPrefix;
            return this;
        }

        /**
         * BucketRegion.
         */
        public Builder bucketRegion(String bucketRegion) {
            this.putQueryParameter("BucketRegion", bucketRegion);
            this.bucketRegion = bucketRegion;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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

        @Override
        public ValidateExpressSyncConfigRequest build() {
            return new ValidateExpressSyncConfigRequest(this);
        } 

    } 

}
