// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateExpressSyncRequest} extends {@link RequestModel}
 *
 * <p>CreateExpressSyncRequest</p>
 */
public class CreateExpressSyncRequest extends Request {
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
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private CreateExpressSyncRequest(Builder builder) {
        super(builder);
        this.bucketName = builder.bucketName;
        this.bucketPrefix = builder.bucketPrefix;
        this.bucketRegion = builder.bucketRegion;
        this.description = builder.description;
        this.name = builder.name;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExpressSyncRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
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

    public static final class Builder extends Request.Builder<CreateExpressSyncRequest, Builder> {
        private String bucketName; 
        private String bucketPrefix; 
        private String bucketRegion; 
        private String description; 
        private String name; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateExpressSyncRequest request) {
            super(request);
            this.bucketName = request.bucketName;
            this.bucketPrefix = request.bucketPrefix;
            this.bucketRegion = request.bucketRegion;
            this.description = request.description;
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
        public CreateExpressSyncRequest build() {
            return new CreateExpressSyncRequest(this);
        } 

    } 

}
