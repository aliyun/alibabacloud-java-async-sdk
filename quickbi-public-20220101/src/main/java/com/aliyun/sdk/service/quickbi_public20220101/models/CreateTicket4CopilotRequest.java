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
         * <p>User&quot;s account name.
         * <notice>Note: Only one of userId and accountName needs to be filled in. If neither is provided, it will default to the report owner, and the report will be accessed with that user&quot;s identity.</notice></p>
         * 
         * <strong>example:</strong>
         * <p>Test user</p>
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>User&quot;s account type:</p>
         * <ul>
         * <li><p>1: Alibaba Cloud Primary Account</p>
         * </li>
         * <li><p>3: Quick BI Self-built Account</p>
         * </li>
         * <li><p>4: DingTalk</p>
         * </li>
         * <li><p>5: Alibaba Cloud RAM Account</p>
         * </li>
         * <li><p>6: Third-party Account (SAML, OAuth, etc.)</p>
         * </li>
         * <li><p>9: WeCom</p>
         * </li>
         * <li><p>10: Feishu</p>
         * </li>
         * </ul>
         * <p><notice>Note: If accountName is not empty, then accountType must also be provided.</notice></p>
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
         * <p>ID of the Smart Q module to be embedded.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccd3*********ae29dffee</p>
         */
        public Builder copilotId(String copilotId) {
            this.putQueryParameter("CopilotId", copilotId);
            this.copilotId = copilotId;
            return this;
        }

        /**
         * <p>Expiration time.</p>
         * <ul>
         * <li><p>Unit: minutes, maximum 240 (4 hours).</p>
         * </li>
         * <li><p>Default: 240.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder expireTime(Integer expireTime) {
            this.putQueryParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>Range of ticket quantity:</p>
         * <ul>
         * <li><p>Default value is 1.</p>
         * </li>
         * <li><p>Recommended value is 1.</p>
         * </li>
         * <li><p>Maximum value is 99999.</p>
         * </li>
         * </ul>
         * <p>Each time a ticket is used, the ticket count decreases by 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ticketNum(Integer ticketNum) {
            this.putQueryParameter("TicketNum", ticketNum);
            this.ticketNum = ticketNum;
            return this;
        }

        /**
         * <p>Quick BI&quot;s UserId.</p>
         * <ul>
         * <li>You can obtain this by calling [3.1.7 Get User Details Based on Third-Party Account] or other relevant APIs.</li>
         * </ul>
         * <p><notice>Note: Only one of userId and accountName needs to be filled in. If neither is provided, it will default to the report owner, and the report will be accessed with that user&quot;s identity.</notice></p>
         * 
         * <strong>example:</strong>
         * <p>9c-asd*****asd-asdasd</p>
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
