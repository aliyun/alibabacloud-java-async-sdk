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
 * {@link CreateAccessTokenRequest} extends {@link RequestModel}
 *
 * <p>CreateAccessTokenRequest</p>
 */
public class CreateAccessTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Count")
    private String count;

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
    @com.aliyun.core.annotation.NameInMap("TimeToLiveInDays")
    private String timeToLiveInDays;

    private CreateAccessTokenRequest(Builder builder) {
        super(builder);
        this.count = builder.count;
        this.description = builder.description;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.timeToLiveInDays = builder.timeToLiveInDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccessTokenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public String getCount() {
        return this.count;
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
     * @return timeToLiveInDays
     */
    public String getTimeToLiveInDays() {
        return this.timeToLiveInDays;
    }

    public static final class Builder extends Request.Builder<CreateAccessTokenRequest, Builder> {
        private String count; 
        private String description; 
        private String name; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private String timeToLiveInDays; 

        private Builder() {
            super();
        } 

        private Builder(CreateAccessTokenRequest request) {
            super(request);
            this.count = request.count;
            this.description = request.description;
            this.name = request.name;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.timeToLiveInDays = request.timeToLiveInDays;
        } 

        /**
         * <p>The maximum number of times that the activation code can be used to import the information of migration sources. Valid values: 1 to 1000.</p>
         * <p>Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder count(String count) {
            this.putQueryParameter("Count", count);
            this.count = count;
            return this;
        }

        /**
         * <p>The description of the activation code.</p>
         * 
         * <strong>example:</strong>
         * <p>The description of the activation code.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the activation code. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https://. It can contain digits, colons (:), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>test_name</p>
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
         * <p>The validity period of the activation code. The activation code can no longer be used to import the information of migration sources after the code expires. Unit: day. Valid values: 1 to 90.</p>
         * <p>Default value: 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder timeToLiveInDays(String timeToLiveInDays) {
            this.putQueryParameter("TimeToLiveInDays", timeToLiveInDays);
            this.timeToLiveInDays = timeToLiveInDays;
            return this;
        }

        @Override
        public CreateAccessTokenRequest build() {
            return new CreateAccessTokenRequest(this);
        } 

    } 

}
