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
 * {@link GetCardSmsDetailsRequest} extends {@link RequestModel}
 *
 * <p>GetCardSmsDetailsRequest</p>
 */
public class GetCardSmsDetailsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizCardId")
    private String bizCardId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizDigitId")
    private String bizDigitId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizSmsId")
    private String bizSmsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SendDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sendDate;

    private GetCardSmsDetailsRequest(Builder builder) {
        super(builder);
        this.bizCardId = builder.bizCardId;
        this.bizDigitId = builder.bizDigitId;
        this.bizSmsId = builder.bizSmsId;
        this.currentPage = builder.currentPage;
        this.ownerId = builder.ownerId;
        this.pageSize = builder.pageSize;
        this.phoneNumber = builder.phoneNumber;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sendDate = builder.sendDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCardSmsDetailsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizCardId
     */
    public String getBizCardId() {
        return this.bizCardId;
    }

    /**
     * @return bizDigitId
     */
    public String getBizDigitId() {
        return this.bizDigitId;
    }

    /**
     * @return bizSmsId
     */
    public String getBizSmsId() {
        return this.bizSmsId;
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
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
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
    public String getSendDate() {
        return this.sendDate;
    }

    public static final class Builder extends Request.Builder<GetCardSmsDetailsRequest, Builder> {
        private String bizCardId; 
        private String bizDigitId; 
        private String bizSmsId; 
        private Long currentPage; 
        private Long ownerId; 
        private Long pageSize; 
        private String phoneNumber; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String sendDate; 

        private Builder() {
            super();
        } 

        private Builder(GetCardSmsDetailsRequest request) {
            super(request);
            this.bizCardId = request.bizCardId;
            this.bizDigitId = request.bizDigitId;
            this.bizSmsId = request.bizSmsId;
            this.currentPage = request.currentPage;
            this.ownerId = request.ownerId;
            this.pageSize = request.pageSize;
            this.phoneNumber = request.phoneNumber;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sendDate = request.sendDate;
        } 

        /**
         * <p>Card SMS sending ID, which is the BizCardId field in the response when calling SendCardSms or SendBatchCardSms.</p>
         * 
         * <strong>example:</strong>
         * <p>123456^0</p>
         */
        public Builder bizCardId(String bizCardId) {
            this.putQueryParameter("BizCardId", bizCardId);
            this.bizCardId = bizCardId;
            return this;
        }

        /**
         * <p>Digital SMS sending ID, which is the BizDigitalId field in the response when calling SendCardSms or SendBatchCardSms.</p>
         * 
         * <strong>example:</strong>
         * <p>12346^0</p>
         */
        public Builder bizDigitId(String bizDigitId) {
            this.putQueryParameter("BizDigitId", bizDigitId);
            this.bizDigitId = bizDigitId;
            return this;
        }

        /**
         * <p>Text SMS sending ID, which is the BizSmsId field in the response when calling SendCardSms or SendBatchCardSms.</p>
         * 
         * <strong>example:</strong>
         * <p>1234576^0</p>
         */
        public Builder bizSmsId(String bizSmsId) {
            this.putQueryParameter("BizSmsId", bizSmsId);
            this.bizSmsId = bizSmsId;
            return this;
        }

        /**
         * <p>For paginated viewing of sending records, specify the current page number of the sending records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>For paginated viewing of sending records, specify the number of card SMS records to display per page.</p>
         * <p>The value range is 1~50.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Domestic phone number that received the SMS. Format: 11-digit phone number, for example, 1390000****.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1390000****</p>
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
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
         * <p>Card SMS sending date, supports querying records from the last 30 days.</p>
         * <p>Format: yyyyMMdd, for example, 20240112.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20240112</p>
         */
        public Builder sendDate(String sendDate) {
            this.putQueryParameter("SendDate", sendDate);
            this.sendDate = sendDate;
            return this;
        }

        @Override
        public GetCardSmsDetailsRequest build() {
            return new GetCardSmsDetailsRequest(this);
        } 

    } 

}
