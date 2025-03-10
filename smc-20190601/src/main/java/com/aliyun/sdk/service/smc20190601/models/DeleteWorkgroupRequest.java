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
 * {@link DeleteWorkgroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteWorkgroupRequest</p>
 */
public class DeleteWorkgroupRequest extends Request {
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

    private DeleteWorkgroupRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.workgroupId = builder.workgroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWorkgroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DeleteWorkgroupRequest, Builder> {
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private String workgroupId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWorkgroupRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.workgroupId = request.workgroupId;
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
        public DeleteWorkgroupRequest build() {
            return new DeleteWorkgroupRequest(this);
        } 

    } 

}
