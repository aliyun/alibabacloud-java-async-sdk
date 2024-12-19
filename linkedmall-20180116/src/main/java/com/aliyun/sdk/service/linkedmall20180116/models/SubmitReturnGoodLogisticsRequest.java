// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link SubmitReturnGoodLogisticsRequest} extends {@link RequestModel}
 *
 * <p>SubmitReturnGoodLogisticsRequest</p>
 */
public class SubmitReturnGoodLogisticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountType")
    private String accountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cpCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisputeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long disputeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogisticsNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logisticsNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubLmOrderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subLmOrderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThirdPartyUserId")
    private String thirdPartyUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseAnonymousTbAccount")
    private Boolean useAnonymousTbAccount;

    private SubmitReturnGoodLogisticsRequest(Builder builder) {
        super(builder);
        this.accountType = builder.accountType;
        this.bizId = builder.bizId;
        this.bizUid = builder.bizUid;
        this.cpCode = builder.cpCode;
        this.disputeId = builder.disputeId;
        this.logisticsNo = builder.logisticsNo;
        this.subLmOrderId = builder.subLmOrderId;
        this.thirdPartyUserId = builder.thirdPartyUserId;
        this.useAnonymousTbAccount = builder.useAnonymousTbAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitReturnGoodLogisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountType
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return bizUid
     */
    public String getBizUid() {
        return this.bizUid;
    }

    /**
     * @return cpCode
     */
    public String getCpCode() {
        return this.cpCode;
    }

    /**
     * @return disputeId
     */
    public Long getDisputeId() {
        return this.disputeId;
    }

    /**
     * @return logisticsNo
     */
    public String getLogisticsNo() {
        return this.logisticsNo;
    }

    /**
     * @return subLmOrderId
     */
    public String getSubLmOrderId() {
        return this.subLmOrderId;
    }

    /**
     * @return thirdPartyUserId
     */
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    /**
     * @return useAnonymousTbAccount
     */
    public Boolean getUseAnonymousTbAccount() {
        return this.useAnonymousTbAccount;
    }

    public static final class Builder extends Request.Builder<SubmitReturnGoodLogisticsRequest, Builder> {
        private String accountType; 
        private String bizId; 
        private String bizUid; 
        private String cpCode; 
        private Long disputeId; 
        private String logisticsNo; 
        private String subLmOrderId; 
        private String thirdPartyUserId; 
        private Boolean useAnonymousTbAccount; 

        private Builder() {
            super();
        } 

        private Builder(SubmitReturnGoodLogisticsRequest request) {
            super(request);
            this.accountType = request.accountType;
            this.bizId = request.bizId;
            this.bizUid = request.bizUid;
            this.cpCode = request.cpCode;
            this.disputeId = request.disputeId;
            this.logisticsNo = request.logisticsNo;
            this.subLmOrderId = request.subLmOrderId;
            this.thirdPartyUserId = request.thirdPartyUserId;
            this.useAnonymousTbAccount = request.useAnonymousTbAccount;
        } 

        /**
         * AccountType.
         */
        public Builder accountType(String accountType) {
            this.putQueryParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LMALL20****80001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>250014030308185405</p>
         */
        public Builder bizUid(String bizUid) {
            this.putQueryParameter("BizUid", bizUid);
            this.bizUid = bizUid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SF</p>
         */
        public Builder cpCode(String cpCode) {
            this.putQueryParameter("CpCode", cpCode);
            this.cpCode = cpCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>96281042016947370</p>
         */
        public Builder disputeId(Long disputeId) {
            this.putQueryParameter("DisputeId", disputeId);
            this.disputeId = disputeId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SF131*****7061</p>
         */
        public Builder logisticsNo(String logisticsNo) {
            this.putQueryParameter("LogisticsNo", logisticsNo);
            this.logisticsNo = logisticsNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>368925182</p>
         */
        public Builder subLmOrderId(String subLmOrderId) {
            this.putQueryParameter("SubLmOrderId", subLmOrderId);
            this.subLmOrderId = subLmOrderId;
            return this;
        }

        /**
         * ThirdPartyUserId.
         */
        public Builder thirdPartyUserId(String thirdPartyUserId) {
            this.putQueryParameter("ThirdPartyUserId", thirdPartyUserId);
            this.thirdPartyUserId = thirdPartyUserId;
            return this;
        }

        /**
         * UseAnonymousTbAccount.
         */
        public Builder useAnonymousTbAccount(Boolean useAnonymousTbAccount) {
            this.putQueryParameter("UseAnonymousTbAccount", useAnonymousTbAccount);
            this.useAnonymousTbAccount = useAnonymousTbAccount;
            return this;
        }

        @Override
        public SubmitReturnGoodLogisticsRequest build() {
            return new SubmitReturnGoodLogisticsRequest(this);
        } 

    } 

}
