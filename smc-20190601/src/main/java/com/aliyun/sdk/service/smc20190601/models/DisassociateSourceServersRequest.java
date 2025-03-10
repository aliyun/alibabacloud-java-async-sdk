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
 * {@link DisassociateSourceServersRequest} extends {@link RequestModel}
 *
 * <p>DisassociateSourceServersRequest</p>
 */
public class DisassociateSourceServersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> sourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkgroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workgroupId;

    private DisassociateSourceServersRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.sourceId = builder.sourceId;
        this.workgroupId = builder.workgroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisassociateSourceServersRequest create() {
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
     * @return sourceId
     */
    public java.util.List<String> getSourceId() {
        return this.sourceId;
    }

    /**
     * @return workgroupId
     */
    public String getWorkgroupId() {
        return this.workgroupId;
    }

    public static final class Builder extends Request.Builder<DisassociateSourceServersRequest, Builder> {
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private java.util.List<String> sourceId; 
        private String workgroupId; 

        private Builder() {
            super();
        } 

        private Builder(DisassociateSourceServersRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.sourceId = request.sourceId;
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
         * <p>The IDs of migration sources that you want to disassociate from the workgroup. You can specify up to 50 migration sources.</p>
         * <p>This parameter is required.</p>
         */
        public Builder sourceId(java.util.List<String> sourceId) {
            this.putQueryParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>The ID of the workgroup.</p>
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
        public DisassociateSourceServersRequest build() {
            return new DisassociateSourceServersRequest(this);
        } 

    } 

}
