// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteUserPublicKeyRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserPublicKeyRequest</p>
 */
public class DeleteUserPublicKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublicKeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String publicKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteUserPublicKeyRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.publicKeyId = builder.publicKeyId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserPublicKeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return publicKeyId
     */
    public String getPublicKeyId() {
        return this.publicKeyId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteUserPublicKeyRequest, Builder> {
        private String instanceId; 
        private String publicKeyId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUserPublicKeyRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.publicKeyId = request.publicKeyId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the Bastionhost instance to which the users to be queried belong.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the ID of the Bastionhost instance.</p>
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
         * <p>The public key ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/477555.html">ListUserPublicKeys</a> operation to query the public key ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder publicKeyId(String publicKeyId) {
            this.putQueryParameter("PublicKeyId", publicKeyId);
            this.publicKeyId = publicKeyId;
            return this;
        }

        /**
         * <p>The region ID of the bastion host. For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
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
        public DeleteUserPublicKeyRequest build() {
            return new DeleteUserPublicKeyRequest(this);
        } 

    } 

}
