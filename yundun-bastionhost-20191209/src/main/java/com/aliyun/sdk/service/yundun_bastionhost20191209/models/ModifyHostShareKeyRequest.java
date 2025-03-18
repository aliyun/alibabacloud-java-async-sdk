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
 * {@link ModifyHostShareKeyRequest} extends {@link RequestModel}
 *
 * <p>ModifyHostShareKeyRequest</p>
 */
public class ModifyHostShareKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostShareKeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hostShareKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostShareKeyName")
    private String hostShareKeyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PassPhrase")
    private String passPhrase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateKey")
    private String privateKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ModifyHostShareKeyRequest(Builder builder) {
        super(builder);
        this.hostShareKeyId = builder.hostShareKeyId;
        this.hostShareKeyName = builder.hostShareKeyName;
        this.instanceId = builder.instanceId;
        this.passPhrase = builder.passPhrase;
        this.privateKey = builder.privateKey;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyHostShareKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostShareKeyId
     */
    public String getHostShareKeyId() {
        return this.hostShareKeyId;
    }

    /**
     * @return hostShareKeyName
     */
    public String getHostShareKeyName() {
        return this.hostShareKeyName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return passPhrase
     */
    public String getPassPhrase() {
        return this.passPhrase;
    }

    /**
     * @return privateKey
     */
    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyHostShareKeyRequest, Builder> {
        private String hostShareKeyId; 
        private String hostShareKeyName; 
        private String instanceId; 
        private String passPhrase; 
        private String privateKey; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyHostShareKeyRequest request) {
            super(request);
            this.hostShareKeyId = request.hostShareKeyId;
            this.hostShareKeyName = request.hostShareKeyName;
            this.instanceId = request.instanceId;
            this.passPhrase = request.passPhrase;
            this.privateKey = request.privateKey;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the shared key whose information you want to modify.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10247</p>
         */
        public Builder hostShareKeyId(String hostShareKeyId) {
            this.putQueryParameter("HostShareKeyId", hostShareKeyId);
            this.hostShareKeyId = hostShareKeyId;
            return this;
        }

        /**
         * <p>The name of the shared key.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        public Builder hostShareKeyName(String hostShareKeyName) {
            this.putQueryParameter("HostShareKeyName", hostShareKeyName);
            this.hostShareKeyName = hostShareKeyName;
            return this;
        }

        /**
         * <p>The bastion host ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
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
         * <p>The password of the private key. Specify a Base64-encoded string.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder passPhrase(String passPhrase) {
            this.putQueryParameter("PassPhrase", passPhrase);
            this.passPhrase = passPhrase;
            return this;
        }

        /**
         * <p>The private key. Specify a Base64-encoded string.</p>
         * <blockquote>
         * <p> Only Rivest-Shamir-Adleman (RSA) keys that are generated by using the ssh-keygen command and keys that are generated by using the Ed25519 algorithm are supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder privateKey(String privateKey) {
            this.putQueryParameter("PrivateKey", privateKey);
            this.privateKey = privateKey;
            return this;
        }

        /**
         * <p>The region ID of the bastion host.</p>
         * <blockquote>
         * <p> For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
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
        public ModifyHostShareKeyRequest build() {
            return new ModifyHostShareKeyRequest(this);
        } 

    } 

}
