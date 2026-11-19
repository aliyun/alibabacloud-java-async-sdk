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
         * <p>The account of the access user to bind. Use this parameter together with AccountType when QuickBIUserId is not specified.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>The account type of the user. Valid values:</p>
         * <ul>
         * <li>1: Alibaba Cloud account.</li>
         * <li>3: Quick BI custom account.</li>
         * <li>4: DingTalk.</li>
         * <li>5: RAM user.</li>
         * <li>9: WeCom.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder accountType(Integer accountType) {
            this.putQueryParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * <p>The ID of the AIPro embedding configuration. The configuration must exist, belong to the current organization, and have a status of 1.</p>
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
         * <p>The custom pass-through parameter. If specified, it must be a valid JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder customParam(String customParam) {
            this.putQueryParameter("CustomParam", customParam);
            this.customParam = customParam;
            return this;
        }

        /**
         * <p>The validity period of the ticket, in minutes. Default value: 240. The value must be greater than 0.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        public Builder expireTime(Integer expireTime) {
            this.putQueryParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>The QuickBI user ID of the access user to bind. Specify either this parameter or the combination of AccountName and AccountType.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder quickBIUserId(String quickBIUserId) {
            this.putQueryParameter("QuickBIUserId", quickBIUserId);
            this.quickBIUserId = quickBIUserId;
            return this;
        }

        /**
         * <p>The custom system identifier. The length must be less than 150 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder systemUid(String systemUid) {
            this.putQueryParameter("SystemUid", systemUid);
            this.systemUid = systemUid;
            return this;
        }

        /**
         * <p>The number of times the ticket can be used. Default value: 1. Valid values: 1 to 99999.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
