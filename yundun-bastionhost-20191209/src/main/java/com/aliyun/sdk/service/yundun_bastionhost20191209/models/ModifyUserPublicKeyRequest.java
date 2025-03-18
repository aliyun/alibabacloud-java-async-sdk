// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link ModifyUserPublicKeyRequest} extends {@link RequestModel}
 *
 * <p>ModifyUserPublicKeyRequest</p>
 */
public class ModifyUserPublicKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublicKey")
    private String publicKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublicKeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String publicKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublicKeyName")
    private String publicKeyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ModifyUserPublicKeyRequest(Builder builder) {
        super(builder);
        this.comment = builder.comment;
        this.instanceId = builder.instanceId;
        this.publicKey = builder.publicKey;
        this.publicKeyId = builder.publicKeyId;
        this.publicKeyName = builder.publicKeyName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyUserPublicKeyRequest create() {
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
     * @return publicKeyId
     */
    public String getPublicKeyId() {
        return this.publicKeyId;
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

    public static final class Builder extends Request.Builder<ModifyUserPublicKeyRequest, Builder> {
        private String comment; 
        private String instanceId; 
        private String publicKey; 
        private String publicKeyId; 
        private String publicKeyName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyUserPublicKeyRequest request) {
            super(request);
            this.comment = request.comment;
            this.instanceId = request.instanceId;
            this.publicKey = request.publicKey;
            this.publicKeyId = request.publicKeyId;
            this.publicKeyName = request.publicKeyName;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The new description of the user group. The description can be up to 500 characters in length.</p>
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
         * <p>The ID of the bastion host on which you want to modify the public key of a user.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-nif236pmc1u</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The new public key.</p>
         * <blockquote>
         * <p> Specify a Base64-encoded string.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>c3NoLWVkMjU1MTkgQUFBQUMzTnphQzFsWkRJMU5URTVBQUFBSUhVcjY4UENFYWFzZjFYRVpNYTVsMlNBQytHV3FpeXVsRVpndkV4dmlPM28gcm9vdEA5NjBkMmNhOTcwYjU=</p>
         */
        public Builder publicKey(String publicKey) {
            this.putQueryParameter("PublicKey", publicKey);
            this.publicKey = publicKey;
            return this;
        }

        /**
         * <p>The ID of the public key that you want to modify.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/477555.html">ListUserPublicKeys</a> operation to query the public key ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder publicKeyId(String publicKeyId) {
            this.putQueryParameter("PublicKeyId", publicKeyId);
            this.publicKeyId = publicKeyId;
            return this;
        }

        /**
         * <p>The name of the public key that you want to modify. This name can be up to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        public Builder publicKeyName(String publicKeyName) {
            this.putQueryParameter("PublicKeyName", publicKeyName);
            this.publicKeyName = publicKeyName;
            return this;
        }

        /**
         * <p>The region ID of the bastion host that is used to modify the public key of the user.</p>
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

        @Override
        public ModifyUserPublicKeyRequest build() {
            return new ModifyUserPublicKeyRequest(this);
        } 

    } 

}
