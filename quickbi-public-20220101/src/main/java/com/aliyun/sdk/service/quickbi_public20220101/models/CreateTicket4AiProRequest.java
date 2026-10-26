// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link CreateTicket4AiProRequest} extends {@link RequestModel}
 *
 * <p>CreateTicket4AiProRequest</p>
 */
public class CreateTicket4AiProRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountType")
    private Integer accountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AiProId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aiProId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomParam")
    private String customParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private Integer expireTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuickBIUserId")
    private String quickBIUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemUid")
    private String systemUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TicketNum")
    private Integer ticketNum;

    private CreateTicket4AiProRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.accountType = builder.accountType;
        this.aiProId = builder.aiProId;
        this.customParam = builder.customParam;
        this.expireTime = builder.expireTime;
        this.quickBIUserId = builder.quickBIUserId;
        this.systemUid = builder.systemUid;
        this.ticketNum = builder.ticketNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTicket4AiProRequest create() {
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
     * @return accountType
     */
    public Integer getAccountType() {
        return this.accountType;
    }

    /**
     * @return aiProId
     */
    public String getAiProId() {
        return this.aiProId;
    }

    /**
     * @return customParam
     */
    public String getCustomParam() {
        return this.customParam;
    }

    /**
     * @return expireTime
     */
    public Integer getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return quickBIUserId
     */
    public String getQuickBIUserId() {
        return this.quickBIUserId;
    }

    /**
     * @return systemUid
     */
    public String getSystemUid() {
        return this.systemUid;
    }

    /**
     * @return ticketNum
     */
    public Integer getTicketNum() {
        return this.ticketNum;
    }

    public static final class Builder extends Request.Builder<CreateTicket4AiProRequest, Builder> {
        private String accountName; 
        private Integer accountType; 
        private String aiProId; 
        private String customParam; 
        private Integer expireTime; 
        private String quickBIUserId; 
        private String systemUid; 
        private Integer ticketNum; 

        private Builder() {
            super();
        } 

        private Builder(CreateTicket4AiProRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.accountType = request.accountType;
            this.aiProId = request.aiProId;
            this.customParam = request.customParam;
            this.expireTime = request.expireTime;
            this.quickBIUserId = request.quickBIUserId;
            this.systemUid = request.systemUid;
            this.ticketNum = request.ticketNum;
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
         * AccountType.
         */
        public Builder accountType(Integer accountType) {
            this.putQueryParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder aiProId(String aiProId) {
            this.putQueryParameter("AiProId", aiProId);
            this.aiProId = aiProId;
            return this;
        }

        /**
         * CustomParam.
         */
        public Builder customParam(String customParam) {
            this.putQueryParameter("CustomParam", customParam);
            this.customParam = customParam;
            return this;
        }

        /**
         * ExpireTime.
         */
        public Builder expireTime(Integer expireTime) {
            this.putQueryParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * QuickBIUserId.
         */
        public Builder quickBIUserId(String quickBIUserId) {
            this.putQueryParameter("QuickBIUserId", quickBIUserId);
            this.quickBIUserId = quickBIUserId;
            return this;
        }

        /**
         * SystemUid.
         */
        public Builder systemUid(String systemUid) {
            this.putQueryParameter("SystemUid", systemUid);
            this.systemUid = systemUid;
            return this;
        }

        /**
         * TicketNum.
         */
        public Builder ticketNum(Integer ticketNum) {
            this.putQueryParameter("TicketNum", ticketNum);
            this.ticketNum = ticketNum;
            return this;
        }

        @Override
        public CreateTicket4AiProRequest build() {
            return new CreateTicket4AiProRequest(this);
        } 

    } 

}
