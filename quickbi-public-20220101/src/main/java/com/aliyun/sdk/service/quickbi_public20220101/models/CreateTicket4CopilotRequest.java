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
 * {@link CreateTicket4CopilotRequest} extends {@link RequestModel}
 *
 * <p>CreateTicket4CopilotRequest</p>
 */
public class CreateTicket4CopilotRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountType")
    private Integer accountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CopilotId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String copilotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private Integer expireTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TicketNum")
    private Integer ticketNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private CreateTicket4CopilotRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.accountType = builder.accountType;
        this.copilotId = builder.copilotId;
        this.expireTime = builder.expireTime;
        this.ticketNum = builder.ticketNum;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTicket4CopilotRequest create() {
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
     * @return copilotId
     */
    public String getCopilotId() {
        return this.copilotId;
    }

    /**
     * @return expireTime
     */
    public Integer getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return ticketNum
     */
    public Integer getTicketNum() {
        return this.ticketNum;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CreateTicket4CopilotRequest, Builder> {
        private String accountName; 
        private Integer accountType; 
        private String copilotId; 
        private Integer expireTime; 
        private Integer ticketNum; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTicket4CopilotRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.accountType = request.accountType;
            this.copilotId = request.copilotId;
            this.expireTime = request.expireTime;
            this.ticketNum = request.ticketNum;
            this.userId = request.userId;
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
         * <p>ccd3428c-dd23-460c-a608-26bae29dffee</p>
         */
        public Builder copilotId(String copilotId) {
            this.putQueryParameter("CopilotId", copilotId);
            this.copilotId = copilotId;
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
         * TicketNum.
         */
        public Builder ticketNum(Integer ticketNum) {
            this.putQueryParameter("TicketNum", ticketNum);
            this.ticketNum = ticketNum;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public CreateTicket4CopilotRequest build() {
            return new CreateTicket4CopilotRequest(this);
        } 

    } 

}
