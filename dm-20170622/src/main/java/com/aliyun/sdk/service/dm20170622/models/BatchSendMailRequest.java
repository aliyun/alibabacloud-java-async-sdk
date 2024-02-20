// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchSendMailRequest} extends {@link RequestModel}
 *
 * <p>BatchSendMailRequest</p>
 */
public class BatchSendMailRequest extends Request {
    @Query
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Query
    @NameInMap("AddressType")
    @Validation(required = true, maximum = 1)
    private Integer addressType;

    @Query
    @NameInMap("ClickTrace")
    private String clickTrace;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ReceiversName")
    @Validation(required = true)
    private String receiversName;

    @Query
    @NameInMap("ReplyAddress")
    private String replyAddress;

    @Query
    @NameInMap("ReplyAddressAlias")
    private String replyAddressAlias;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TagName")
    private String tagName;

    @Query
    @NameInMap("TemplateName")
    @Validation(required = true)
    private String templateName;

    @Query
    @NameInMap("UnSubscribeFilterLevel")
    private String unSubscribeFilterLevel;

    @Query
    @NameInMap("UnSubscribeLinkType")
    private String unSubscribeLinkType;

    private BatchSendMailRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.addressType = builder.addressType;
        this.clickTrace = builder.clickTrace;
        this.ownerId = builder.ownerId;
        this.receiversName = builder.receiversName;
        this.replyAddress = builder.replyAddress;
        this.replyAddressAlias = builder.replyAddressAlias;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tagName = builder.tagName;
        this.templateName = builder.templateName;
        this.unSubscribeFilterLevel = builder.unSubscribeFilterLevel;
        this.unSubscribeLinkType = builder.unSubscribeLinkType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchSendMailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return addressType
     */
    public Integer getAddressType() {
        return this.addressType;
    }

    /**
     * @return clickTrace
     */
    public String getClickTrace() {
        return this.clickTrace;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return receiversName
     */
    public String getReceiversName() {
        return this.receiversName;
    }

    /**
     * @return replyAddress
     */
    public String getReplyAddress() {
        return this.replyAddress;
    }

    /**
     * @return replyAddressAlias
     */
    public String getReplyAddressAlias() {
        return this.replyAddressAlias;
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
     * @return tagName
     */
    public String getTagName() {
        return this.tagName;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return unSubscribeFilterLevel
     */
    public String getUnSubscribeFilterLevel() {
        return this.unSubscribeFilterLevel;
    }

    /**
     * @return unSubscribeLinkType
     */
    public String getUnSubscribeLinkType() {
        return this.unSubscribeLinkType;
    }

    public static final class Builder extends Request.Builder<BatchSendMailRequest, Builder> {
        private String accountName; 
        private Integer addressType; 
        private String clickTrace; 
        private Long ownerId; 
        private String receiversName; 
        private String replyAddress; 
        private String replyAddressAlias; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String tagName; 
        private String templateName; 
        private String unSubscribeFilterLevel; 
        private String unSubscribeLinkType; 

        private Builder() {
            super();
        } 

        private Builder(BatchSendMailRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.addressType = request.addressType;
            this.clickTrace = request.clickTrace;
            this.ownerId = request.ownerId;
            this.receiversName = request.receiversName;
            this.replyAddress = request.replyAddress;
            this.replyAddressAlias = request.replyAddressAlias;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tagName = request.tagName;
            this.templateName = request.templateName;
            this.unSubscribeFilterLevel = request.unSubscribeFilterLevel;
            this.unSubscribeLinkType = request.unSubscribeLinkType;
        } 

        /**
         * AccountName.
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * AddressType.
         */
        public Builder addressType(Integer addressType) {
            this.putQueryParameter("AddressType", addressType);
            this.addressType = addressType;
            return this;
        }

        /**
         * ClickTrace.
         */
        public Builder clickTrace(String clickTrace) {
            this.putQueryParameter("ClickTrace", clickTrace);
            this.clickTrace = clickTrace;
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
         * ReceiversName.
         */
        public Builder receiversName(String receiversName) {
            this.putQueryParameter("ReceiversName", receiversName);
            this.receiversName = receiversName;
            return this;
        }

        /**
         * ReplyAddress.
         */
        public Builder replyAddress(String replyAddress) {
            this.putQueryParameter("ReplyAddress", replyAddress);
            this.replyAddress = replyAddress;
            return this;
        }

        /**
         * ReplyAddressAlias.
         */
        public Builder replyAddressAlias(String replyAddressAlias) {
            this.putQueryParameter("ReplyAddressAlias", replyAddressAlias);
            this.replyAddressAlias = replyAddressAlias;
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
         * TagName.
         */
        public Builder tagName(String tagName) {
            this.putQueryParameter("TagName", tagName);
            this.tagName = tagName;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * UnSubscribeFilterLevel.
         */
        public Builder unSubscribeFilterLevel(String unSubscribeFilterLevel) {
            this.putQueryParameter("UnSubscribeFilterLevel", unSubscribeFilterLevel);
            this.unSubscribeFilterLevel = unSubscribeFilterLevel;
            return this;
        }

        /**
         * UnSubscribeLinkType.
         */
        public Builder unSubscribeLinkType(String unSubscribeLinkType) {
            this.putQueryParameter("UnSubscribeLinkType", unSubscribeLinkType);
            this.unSubscribeLinkType = unSubscribeLinkType;
            return this;
        }

        @Override
        public BatchSendMailRequest build() {
            return new BatchSendMailRequest(this);
        } 

    } 

}
