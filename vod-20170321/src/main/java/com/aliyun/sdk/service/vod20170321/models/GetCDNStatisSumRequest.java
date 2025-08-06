// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetCDNStatisSumRequest} extends {@link RequestModel}
 *
 * <p>GetCDNStatisSumRequest</p>
 */
public class GetCDNStatisSumRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndStatisTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endStatisTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Level")
    private String level;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private String resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartStatisTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startStatisTime;

    private GetCDNStatisSumRequest(Builder builder) {
        super(builder);
        this.endStatisTime = builder.endStatisTime;
        this.level = builder.level;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.startStatisTime = builder.startStatisTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCDNStatisSumRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endStatisTime
     */
    public String getEndStatisTime() {
        return this.endStatisTime;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
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
    public String getOwnerId() {
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
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return startStatisTime
     */
    public String getStartStatisTime() {
        return this.startStatisTime;
    }

    public static final class Builder extends Request.Builder<GetCDNStatisSumRequest, Builder> {
        private String endStatisTime; 
        private String level; 
        private String ownerAccount; 
        private String ownerId; 
        private String resourceOwnerAccount; 
        private String resourceOwnerId; 
        private String startStatisTime; 

        private Builder() {
            super();
        } 

        private Builder(GetCDNStatisSumRequest request) {
            super(request);
            this.endStatisTime = request.endStatisTime;
            this.level = request.level;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.startStatisTime = request.startStatisTime;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder endStatisTime(String endStatisTime) {
            this.putQueryParameter("EndStatisTime", endStatisTime);
            this.endStatisTime = endStatisTime;
            return this;
        }

        /**
         * Level.
         */
        public Builder level(String level) {
            this.putQueryParameter("Level", level);
            this.level = level;
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
        public Builder ownerId(String ownerId) {
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
        public Builder resourceOwnerId(String resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder startStatisTime(String startStatisTime) {
            this.putQueryParameter("StartStatisTime", startStatisTime);
            this.startStatisTime = startStatisTime;
            return this;
        }

        @Override
        public GetCDNStatisSumRequest build() {
            return new GetCDNStatisSumRequest(this);
        } 

    } 

}
