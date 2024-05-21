// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTicketRequest} extends {@link RequestModel}
 *
 * <p>CreateTicketRequest</p>
 */
public class CreateTicketRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountType")
    private Integer accountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CmptId")
    private String cmptId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private Integer expireTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GlobalParam")
    private String globalParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TicketNum")
    private Integer ticketNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WatermarkParam")
    private String watermarkParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorksId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String worksId;

    private CreateTicketRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.accountType = builder.accountType;
        this.cmptId = builder.cmptId;
        this.expireTime = builder.expireTime;
        this.globalParam = builder.globalParam;
        this.ticketNum = builder.ticketNum;
        this.userId = builder.userId;
        this.watermarkParam = builder.watermarkParam;
        this.worksId = builder.worksId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTicketRequest create() {
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
     * @return cmptId
     */
    public String getCmptId() {
        return this.cmptId;
    }

    /**
     * @return expireTime
     */
    public Integer getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return globalParam
     */
    public String getGlobalParam() {
        return this.globalParam;
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

    /**
     * @return watermarkParam
     */
    public String getWatermarkParam() {
        return this.watermarkParam;
    }

    /**
     * @return worksId
     */
    public String getWorksId() {
        return this.worksId;
    }

    public static final class Builder extends Request.Builder<CreateTicketRequest, Builder> {
        private String accountName; 
        private Integer accountType; 
        private String cmptId; 
        private Integer expireTime; 
        private String globalParam; 
        private Integer ticketNum; 
        private String userId; 
        private String watermarkParam; 
        private String worksId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTicketRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.accountType = request.accountType;
            this.cmptId = request.cmptId;
            this.expireTime = request.expireTime;
            this.globalParam = request.globalParam;
            this.ticketNum = request.ticketNum;
            this.userId = request.userId;
            this.watermarkParam = request.watermarkParam;
            this.worksId = request.worksId;
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
         * CmptId.
         */
        public Builder cmptId(String cmptId) {
            this.putQueryParameter("CmptId", cmptId);
            this.cmptId = cmptId;
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
         * GlobalParam.
         */
        public Builder globalParam(String globalParam) {
            this.putQueryParameter("GlobalParam", globalParam);
            this.globalParam = globalParam;
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

        /**
         * WatermarkParam.
         */
        public Builder watermarkParam(String watermarkParam) {
            this.putQueryParameter("WatermarkParam", watermarkParam);
            this.watermarkParam = watermarkParam;
            return this;
        }

        /**
         * WorksId.
         */
        public Builder worksId(String worksId) {
            this.putQueryParameter("WorksId", worksId);
            this.worksId = worksId;
            return this;
        }

        @Override
        public CreateTicketRequest build() {
            return new CreateTicketRequest(this);
        } 

    } 

}
