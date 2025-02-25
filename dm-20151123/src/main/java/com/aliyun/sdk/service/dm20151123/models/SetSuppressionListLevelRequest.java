// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link SetSuppressionListLevelRequest} extends {@link RequestModel}
 *
 * <p>SetSuppressionListLevelRequest</p>
 */
public class SetSuppressionListLevelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SuppressionListLevel")
    private String suppressionListLevel;

    private SetSuppressionListLevelRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.suppressionListLevel = builder.suppressionListLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetSuppressionListLevelRequest create() {
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return suppressionListLevel
     */
    public String getSuppressionListLevel() {
        return this.suppressionListLevel;
    }

    public static final class Builder extends Request.Builder<SetSuppressionListLevelRequest, Builder> {
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String suppressionListLevel; 

        private Builder() {
            super();
        } 

        private Builder(SetSuppressionListLevelRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.suppressionListLevel = request.suppressionListLevel;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * SuppressionListLevel.
         */
        public Builder suppressionListLevel(String suppressionListLevel) {
            this.putQueryParameter("SuppressionListLevel", suppressionListLevel);
            this.suppressionListLevel = suppressionListLevel;
            return this;
        }

        @Override
        public SetSuppressionListLevelRequest build() {
            return new SetSuppressionListLevelRequest(this);
        } 

    } 

}
