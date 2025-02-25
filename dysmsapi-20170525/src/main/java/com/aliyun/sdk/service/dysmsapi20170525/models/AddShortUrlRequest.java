// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link AddShortUrlRequest} extends {@link RequestModel}
 *
 * <p>AddShortUrlRequest</p>
 */
public class AddShortUrlRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EffectiveDays")
    @com.aliyun.core.annotation.Validation(required = true)
    private String effectiveDays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShortUrlName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shortUrlName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceUrl")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(AddShortUrlRequest request) {
            super(request);
            this.effectiveDays = request.effectiveDays;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.shortUrlName = request.shortUrlName;
            this.sourceUrl = request.sourceUrl;
        } 

        /**
         * <p>The validity period of the short URL. Unit: days. The maximum validity period is 90 days.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
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
         * <p>The service name of the short URL. The name cannot exceed 13 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>The Alibaba Cloud Short Link service.</p>
         */
        public Builder shortUrlName(String shortUrlName) {
            this.putBodyParameter("ShortUrlName", shortUrlName);
            this.shortUrlName = shortUrlName;
            return this;
        }

        /**
         * <p>The source URL. The URL cannot exceed 1,000 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.****.com/product/sms">https://www.****.com/product/sms</a></p>
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
