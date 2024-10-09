// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ReInitDiskRequest} extends {@link RequestModel}
 *
 * <p>ReInitDiskRequest</p>
 */
public class ReInitDiskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoStartInstance")
    private Boolean autoStartInstance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String diskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    private String keyPairName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityEnhancementStrategy")
    private String securityEnhancementStrategy;

    private ReInitDiskRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.autoStartInstance = builder.autoStartInstance;
        this.diskId = builder.diskId;
        this.keyPairName = builder.keyPairName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.password = builder.password;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityEnhancementStrategy = builder.securityEnhancementStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReInitDiskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return autoStartInstance
     */
    public Boolean getAutoStartInstance() {
        return this.autoStartInstance;
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return securityEnhancementStrategy
     */
    public String getSecurityEnhancementStrategy() {
        return this.securityEnhancementStrategy;
    }

    public static final class Builder extends Request.Builder<ReInitDiskRequest, Builder> {
        private String sourceRegionId; 
        private Boolean autoStartInstance; 
        private String diskId; 
        private String keyPairName; 
        private String ownerAccount; 
        private Long ownerId; 
        private String password; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityEnhancementStrategy; 

        private Builder() {
            super();
        } 

        private Builder(ReInitDiskRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.autoStartInstance = request.autoStartInstance;
            this.diskId = request.diskId;
            this.keyPairName = request.keyPairName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.password = request.password;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityEnhancementStrategy = request.securityEnhancementStrategy;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * <p>Specifies whether to automatically start the instance after the disk is re-initialized.</p>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoStartInstance(Boolean autoStartInstance) {
            this.putQueryParameter("AutoStartInstance", autoStartInstance);
            this.autoStartInstance = autoStartInstance;
            return this;
        }

        /**
         * <p>The ID of the disk.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d-bp67acfmxazb4ph****</p>
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * <p>The name of the key pair. This parameter is empty by default.</p>
         * <blockquote>
         * <p>The parameter is applicable only to Linux instances. You can bind an SSH key pair to an instance as the logon credential when you re-initialize the system disk of the instance. After the SSH key pair is bound, the username and password-based logon method is disabled for the instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testKeyPairName</p>
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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

        /**
         * <p>Specifies whether to reset the password of the instance when you re-initialize its system disk. The password must be 8 to 30 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include:</p>
         * <pre><code>()`~!@#$%^&amp;*-_+=|{}[]:;\&quot;&lt;&gt;,.?/
         * </code></pre>
         * <p>For Windows instances, passwords cannot start with a forward slash (/).</p>
         * <blockquote>
         * <p>If the <code>Password</code> parameter is specified, we recommend that you send requests over HTTPS to prevent password leaks.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>EcsV587!</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>Specifies whether to use Security Center free of charge after the system disk is re-initialized. Valid values:</p>
         * <ul>
         * <li>Active: uses Security Center free of charge after the system disk is re-initialized. This value is applicable to only public images.</li>
         * <li>Deactive: does not use Security Center free of charge after the system disk is re-initialized. This value is applicable to all images.</li>
         * </ul>
         * <p>Default value: Deactive.</p>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder securityEnhancementStrategy(String securityEnhancementStrategy) {
            this.putQueryParameter("SecurityEnhancementStrategy", securityEnhancementStrategy);
            this.securityEnhancementStrategy = securityEnhancementStrategy;
            return this;
        }

        @Override
        public ReInitDiskRequest build() {
            return new ReInitDiskRequest(this);
        } 

    } 

}
