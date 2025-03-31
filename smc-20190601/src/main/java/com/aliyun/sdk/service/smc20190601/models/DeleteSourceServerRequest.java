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
 * {@link DeleteSourceServerRequest} extends {@link RequestModel}
 *
 * <p>DeleteSourceServerRequest</p>
 */
public class DeleteSourceServerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Force")
    private Boolean force;

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

    private DeleteSourceServerRequest(Builder builder) {
        super(builder);
        this.force = builder.force;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.sourceId = builder.sourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSourceServerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
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

    public static final class Builder extends Request.Builder<DeleteSourceServerRequest, Builder> {
        private Boolean force; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private String sourceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSourceServerRequest request) {
            super(request);
            this.force = request.force;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.sourceId = request.sourceId;
        } 

        /**
         * <p>Specifies whether to forcibly delete the migration source. Valid values:</p>
         * <ul>
         * <li>true: forcibly deletes the migration source and the migration job created for the migration source, and releases the intermediate resources of the migration job.</li>
         * <li>false: does not delete the migration source if a migration job is created for the migration source.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
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
        public DeleteSourceServerRequest build() {
            return new DeleteSourceServerRequest(this);
        } 

    } 

}
