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
 * {@link CreateHostShareKeyRequest} extends {@link RequestModel}
 *
 * <p>CreateHostShareKeyRequest</p>
 */
public class CreateHostShareKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostShareKeyName")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.Validation(required = true)
    private String privateKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private CreateHostShareKeyRequest(Builder builder) {
        super(builder);
        this.hostShareKeyName = builder.hostShareKeyName;
        this.instanceId = builder.instanceId;
        this.passPhrase = builder.passPhrase;
        this.privateKey = builder.privateKey;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHostShareKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateHostShareKeyRequest, Builder> {
        private String hostShareKeyName; 
        private String instanceId; 
        private String passPhrase; 
        private String privateKey; 
        private Long projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateHostShareKeyRequest request) {
            super(request);
            this.hostShareKeyName = request.hostShareKeyName;
            this.instanceId = request.instanceId;
            this.passPhrase = request.passPhrase;
            this.privateKey = request.privateKey;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The name of the host shared key to create. Maximum length: 128 characters.</p>
         * <p>This parameter is required.</p>
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
         * <p>The instance ID of the bastion host. </p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the instance ID.</p>
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
         * <p>The passphrase of the private key (Base64-encoded string).</p>
         * 
         * <strong>example:</strong>
         * <p>MTIzN******</p>
         */
        public Builder passPhrase(String passPhrase) {
            this.putQueryParameter("PassPhrase", passPhrase);
            this.passPhrase = passPhrase;
            return this;
        }

        /**
         * <p>The private key (Base64-encoded string).</p>
         * <blockquote>
         * <p>RSA keys and Ed25519 keys generated by using the ssh-keygen command are supported.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LBYTnpR3Jmd2hMbmNBMGRmdWV2RW5oVXpCUmp3VkM0dGoKa0J2QlNRSHU2bytrMFBudlZvdlMzdGlBbXo5NkRzdUJDcDFFZVFJREFRQUJBb0lCQUNPZGNjK0lGUnNJd3VkYQpjT3VOSm5SK1BxWnlNZGVIaWFOcDc4SUxFd2NLZDNMZmlUWlYxc0d2Q21uTW0vQ3ZiS2NrZ0U1VjZxQVExRGZQCnI******</p>
         */
        public Builder privateKey(String privateKey) {
            this.putQueryParameter("PrivateKey", privateKey);
            this.privateKey = privateKey;
            return this;
        }

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The region ID of the bastion host. </p>
         * <blockquote>
         * <p>For the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
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
        public CreateHostShareKeyRequest build() {
            return new CreateHostShareKeyRequest(this);
        } 

    } 

}
