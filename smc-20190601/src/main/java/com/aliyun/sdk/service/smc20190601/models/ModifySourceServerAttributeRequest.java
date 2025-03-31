// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601.models;

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
 * {@link ModifySourceServerAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifySourceServerAttributeRequest</p>
 */
public class ModifySourceServerAttributeRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("SourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceId;

    private ModifySourceServerAttributeRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.sourceId = builder.sourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySourceServerAttributeRequest create() {
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
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    public static final class Builder extends Request.Builder<ModifySourceServerAttributeRequest, Builder> {
        private String description; 
        private String name; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private String sourceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifySourceServerAttributeRequest request) {
            super(request);
            this.description = request.description;
            this.name = request.name;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.sourceId = request.sourceId;
        } 

        /**
         * <p>The description of the migration source. The description can be up to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a source server.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the migration source. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>testSourceServerName</p>
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
         * <p>The migration source ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp17m1vi6x20c6g6****</p>
         */
        public Builder sourceId(String sourceId) {
            this.putQueryParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        @Override
        public ModifySourceServerAttributeRequest build() {
            return new ModifySourceServerAttributeRequest(this);
        } 

    } 

}
