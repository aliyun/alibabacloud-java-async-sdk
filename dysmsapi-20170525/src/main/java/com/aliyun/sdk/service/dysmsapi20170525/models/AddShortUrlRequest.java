// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddShortUrlRequest} extends {@link RequestModel}
 *
 * <p>AddShortUrlRequest</p>
 */
public class AddShortUrlRequest extends Request {
    @Body
    @NameInMap("EffectiveDays")
    @Validation(required = true)
    private String effectiveDays;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Body
    @NameInMap("ShortUrlName")
    @Validation(required = true)
    private String shortUrlName;

    @Body
    @NameInMap("SourceUrl")
    @Validation(required = true)
    private String sourceUrl;

    private AddShortUrlRequest(Builder builder) {
        super(builder);
        this.effectiveDays = builder.effectiveDays;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.shortUrlName = builder.shortUrlName;
        this.sourceUrl = builder.sourceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddShortUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return effectiveDays
     */
    public String getEffectiveDays() {
        return this.effectiveDays;
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
     * @return shortUrlName
     */
    public String getShortUrlName() {
        return this.shortUrlName;
    }

    /**
     * @return sourceUrl
     */
    public String getSourceUrl() {
        return this.sourceUrl;
    }

    public static final class Builder extends Request.Builder<AddShortUrlRequest, Builder> {
        private String effectiveDays; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String shortUrlName; 
        private String sourceUrl; 

        private Builder() {
            super();
        } 

        private Builder(AddShortUrlRequest response) {
            super(response);
            this.effectiveDays = response.effectiveDays;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.shortUrlName = response.shortUrlName;
            this.sourceUrl = response.sourceUrl;
        } 

        /**
         * EffectiveDays.
         */
        public Builder effectiveDays(String effectiveDays) {
            this.putBodyParameter("EffectiveDays", effectiveDays);
            this.effectiveDays = effectiveDays;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * ShortUrlName.
         */
        public Builder shortUrlName(String shortUrlName) {
            this.putBodyParameter("ShortUrlName", shortUrlName);
            this.shortUrlName = shortUrlName;
            return this;
        }

        /**
         * SourceUrl.
         */
        public Builder sourceUrl(String sourceUrl) {
            this.putBodyParameter("SourceUrl", sourceUrl);
            this.sourceUrl = sourceUrl;
            return this;
        }

        @Override
        public AddShortUrlRequest build() {
            return new AddShortUrlRequest(this);
        } 

    } 

}
