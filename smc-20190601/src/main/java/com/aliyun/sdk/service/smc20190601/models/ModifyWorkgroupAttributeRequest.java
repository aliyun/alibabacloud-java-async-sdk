// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyWorkgroupAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyWorkgroupAttributeRequest</p>
 */
public class ModifyWorkgroupAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkgroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workgroupId;

    private ModifyWorkgroupAttributeRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.workgroupId = builder.workgroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWorkgroupAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return workgroupId
     */
    public String getWorkgroupId() {
        return this.workgroupId;
    }

    public static final class Builder extends Request.Builder<ModifyWorkgroupAttributeRequest, Builder> {
        private String description; 
        private String name; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private String workgroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyWorkgroupAttributeRequest request) {
            super(request);
            this.description = request.description;
            this.name = request.name;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.workgroupId = request.workgroupId;
        } 

        /**
         * <p>The new description of the workgroup.</p>
         * <p>The description must be 2 to 128 characters in length. It must start with a letter but cannot start with <code>http://</code> or <code>https://</code>. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The new name of the workgroup. The name must be 2 to 128 characters in length. It must start with a letter but cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>testMigrationTaskName</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * <p>The workgroup ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>w-***</p>
         */
        public Builder workgroupId(String workgroupId) {
            this.putQueryParameter("WorkgroupId", workgroupId);
            this.workgroupId = workgroupId;
            return this;
        }

        @Override
        public ModifyWorkgroupAttributeRequest build() {
            return new ModifyWorkgroupAttributeRequest(this);
        } 

    } 

}
