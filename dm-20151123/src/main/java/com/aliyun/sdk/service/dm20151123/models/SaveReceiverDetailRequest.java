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
 * {@link SaveReceiverDetailRequest} extends {@link RequestModel}
 *
 * <p>SaveReceiverDetailRequest</p>
 */
public class SaveReceiverDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomDetail")
    private String customDetail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Detail")
    private String detail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReceiverId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String receiverId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private SaveReceiverDetailRequest(Builder builder) {
        super(builder);
        this.customDetail = builder.customDetail;
        this.detail = builder.detail;
        this.ownerId = builder.ownerId;
        this.receiverId = builder.receiverId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveReceiverDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customDetail
     */
    public String getCustomDetail() {
        return this.customDetail;
    }

    /**
     * @return detail
     */
    public String getDetail() {
        return this.detail;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return receiverId
     */
    public String getReceiverId() {
        return this.receiverId;
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

    public static final class Builder extends Request.Builder<SaveReceiverDetailRequest, Builder> {
        private String customDetail; 
        private String detail; 
        private Long ownerId; 
        private String receiverId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(SaveReceiverDetailRequest request) {
            super(request);
            this.customDetail = request.customDetail;
            this.detail = request.detail;
            this.ownerId = request.ownerId;
            this.receiverId = request.receiverId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * CustomDetail.
         */
        public Builder customDetail(String customDetail) {
            this.putQueryParameter("CustomDetail", customDetail);
            this.customDetail = customDetail;
            return this;
        }

        /**
         * <p>Content, supports uploading multiple recipients at once, with a limit of 500 records per upload. Each record is separated by {} and commas, example:</p>
         * <p>[{ },{ },{ }...], the format within {} is as follows:</p>
         * <p>[{&quot;b&quot;:&quot;birthday&quot;,&quot;e&quot;:&quot;<a href="mailto:xxx@example.net">xxx@example.net</a>&quot;,&quot;g&quot;:&quot;gender&quot;,&quot;m&quot;:&quot;mobile&quot;,&quot;n&quot;:&quot;nickname&quot;,&quot;u&quot;:&quot;name&quot;}], when passing values, pass it as a string, not a list.</p>
         * <p>If a duplicate recipient address is inserted, it will return &quot;ErrorCount&quot;: 1</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;b&quot;:&quot;birthday&quot;,&quot;e&quot;:&quot;<a href="mailto:xxx@alibaba-inc.com">xxx@alibaba-inc.com</a>&quot;,&quot;g&quot;:&quot;gender&quot;,&quot;m&quot;:&quot;mobile&quot;,&quot;n&quot;:&quot;nickname&quot;,&quot;u&quot;:&quot;name&quot;}]</p>
         */
        public Builder detail(String detail) {
            this.putQueryParameter("Detail", detail);
            this.detail = detail;
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
         * <p>Recipient list ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>34642</p>
         */
        public Builder receiverId(String receiverId) {
            this.putQueryParameter("ReceiverId", receiverId);
            this.receiverId = receiverId;
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

        @Override
        public SaveReceiverDetailRequest build() {
            return new SaveReceiverDetailRequest(this);
        } 

    } 

}
