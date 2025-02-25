// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi_intl20170725.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchVerificationRequest} extends {@link RequestModel}
 *
 * <p>SearchVerificationRequest</p>
 */
public class SearchVerificationRequest extends Request {
    @Query
    @NameInMap("Code")
    private String code;

    @Query
    @NameInMap("CurrentPage")
    private Long currentPage;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SendDate")
    private Long sendDate;

    @Query
    @NameInMap("ServiceSid")
    private String serviceSid;

    @Query
    @NameInMap("To")
    private String to;

    @Query
    @NameInMap("VerificationId")
    private String verificationId;

    private SearchVerificationRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.currentPage = builder.currentPage;
        this.ownerId = builder.ownerId;
        this.pageSize = builder.pageSize;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sendDate = builder.sendDate;
        this.serviceSid = builder.serviceSid;
        this.to = builder.to;
        this.verificationId = builder.verificationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchVerificationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
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
     * @return sendDate
     */
    public Long getSendDate() {
        return this.sendDate;
    }

    /**
     * @return serviceSid
     */
    public String getServiceSid() {
        return this.serviceSid;
    }

    /**
     * @return to
     */
    public String getTo() {
        return this.to;
    }

    /**
     * @return verificationId
     */
    public String getVerificationId() {
        return this.verificationId;
    }

    public static final class Builder extends Request.Builder<SearchVerificationRequest, Builder> {
        private String code; 
        private Long currentPage; 
        private Long ownerId; 
        private Long pageSize; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long sendDate; 
        private String serviceSid; 
        private String to; 
        private String verificationId; 

        private Builder() {
            super();
        } 

        private Builder(SearchVerificationRequest request) {
            super(request);
            this.code = request.code;
            this.currentPage = request.currentPage;
            this.ownerId = request.ownerId;
            this.pageSize = request.pageSize;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sendDate = request.sendDate;
            this.serviceSid = request.serviceSid;
            this.to = request.to;
            this.verificationId = request.verificationId;
        } 

        /**
         * The verification code.
         */
        public Builder code(String code) {
            this.putQueryParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * The number of the page to return. Pages start from page 1.
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
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
         * The number of entries to return on each page.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
         * The time when a text message is sent, in milliseconds. You can query text messages that were sent within the last 30 days.
         * <p>
         * 
         * Example: 1677600000000.
         */
        public Builder sendDate(Long sendDate) {
            this.putQueryParameter("SendDate", sendDate);
            this.sendDate = sendDate;
            return this;
        }

        /**
         * The service ID that is displayed in the Phone Number Verification Service console.
         */
        public Builder serviceSid(String serviceSid) {
            this.putQueryParameter("ServiceSid", serviceSid);
            this.serviceSid = serviceSid;
            return this;
        }

        /**
         * The mobile phone number of the recipient. You must add the country code to the beginning of the mobile phone number. Example: 6212345\*\*\*\*01.
         */
        public Builder to(String to) {
            this.putQueryParameter("To", to);
            this.to = to;
            return this;
        }

        /**
         * The unique authentication ID that is returned by calling the StartVerification operation.
         */
        public Builder verificationId(String verificationId) {
            this.putQueryParameter("VerificationId", verificationId);
            this.verificationId = verificationId;
            return this;
        }

        @Override
        public SearchVerificationRequest build() {
            return new SearchVerificationRequest(this);
        } 

    } 

}
