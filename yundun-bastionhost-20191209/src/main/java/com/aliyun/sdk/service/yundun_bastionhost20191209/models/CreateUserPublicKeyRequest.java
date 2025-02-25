// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateUserPublicKeyRequest} extends {@link RequestModel}
 *
 * <p>CreateUserPublicKeyRequest</p>
 */
public class CreateUserPublicKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublicKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String publicKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublicKeyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String publicKeyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private CreateUserPublicKeyRequest(Builder builder) {
        super(builder);
        this.comment = builder.comment;
        this.instanceId = builder.instanceId;
        this.publicKey = builder.publicKey;
        this.publicKeyName = builder.publicKeyName;
        this.regionId = builder.regionId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserPublicKeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return publicKey
     */
    public String getPublicKey() {
        return this.publicKey;
    }

    /**
     * @return publicKeyName
     */
    public String getPublicKeyName() {
        return this.publicKeyName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CreateUserPublicKeyRequest, Builder> {
        private String comment; 
        private String instanceId; 
        private String publicKey; 
        private String publicKeyName; 
        private String regionId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserPublicKeyRequest request) {
            super(request);
            this.comment = request.comment;
            this.instanceId = request.instanceId;
            this.publicKey = request.publicKey;
            this.publicKeyName = request.publicKeyName;
            this.regionId = request.regionId;
            this.userId = request.userId;
        } 

        /**
         * <p>The description of the public key. The description can be up to 500 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>The ID of the bastion host on which you want to create a public key for the user.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/204522.html">listinstances</a> operation to query the ID of the bastion host.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-st220aw****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The public key. Encode the value by using the Base64 algorithm.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c3NoLWVkMjU1MTkgQUFBQUMzTnphQzFsWkRJMU5URTVBQUFBSUxGQnQxUUpyT3IxK2hTTGRkbERMZUx4WGRIZ3hBalBxWHJIbWNFNWxqSk8gbm93Y29kZXJAbm93Y29kZXJkZU1hY0Jvb2stUHJvLmxvY2Fs</p>
         */
        public Builder publicKey(String publicKey) {
            this.putQueryParameter("PublicKey", publicKey);
            this.publicKey = publicKey;
            return this;
        }

        /**
         * <p>The name of the public key.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Public key of a user</p>
         */
        public Builder publicKeyName(String publicKeyName) {
            this.putQueryParameter("PublicKeyName", publicKeyName);
            this.publicKeyName = publicKeyName;
            return this;
        }

        /**
         * <p>Specifies the region ID of the bastion host on which you want to create a public key for the user.</p>
         * <blockquote>
         * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the user for whom you want to create a public key.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/204522.html">ListUsers</a> operation to query the user ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public CreateUserPublicKeyRequest build() {
            return new CreateUserPublicKeyRequest(this);
        } 

    } 

}
