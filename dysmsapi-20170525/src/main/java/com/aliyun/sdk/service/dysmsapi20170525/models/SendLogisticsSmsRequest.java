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
 * {@link SendLogisticsSmsRequest} extends {@link RequestModel}
 *
 * <p>SendLogisticsSmsRequest</p>
 */
public class SendLogisticsSmsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpressCompanyCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String expressCompanyCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MailNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mailNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutId")
    private String outId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlatformCompanyCode")
    private String platformCompanyCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String signName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateParam")
    private String templateParam;

    private SendLogisticsSmsRequest(Builder builder) {
        super(builder);
        this.expressCompanyCode = builder.expressCompanyCode;
        this.mailNo = builder.mailNo;
        this.outId = builder.outId;
        this.ownerId = builder.ownerId;
        this.platformCompanyCode = builder.platformCompanyCode;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.signName = builder.signName;
        this.templateCode = builder.templateCode;
        this.templateParam = builder.templateParam;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendLogisticsSmsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expressCompanyCode
     */
    public String getExpressCompanyCode() {
        return this.expressCompanyCode;
    }

    /**
     * @return mailNo
     */
    public String getMailNo() {
        return this.mailNo;
    }

    /**
     * @return outId
     */
    public String getOutId() {
        return this.outId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return platformCompanyCode
     */
    public String getPlatformCompanyCode() {
        return this.platformCompanyCode;
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
     * @return signName
     */
    public String getSignName() {
        return this.signName;
    }

    /**
     * @return templateCode
     */
    public String getTemplateCode() {
        return this.templateCode;
    }

    /**
     * @return templateParam
     */
    public String getTemplateParam() {
        return this.templateParam;
    }

    public static final class Builder extends Request.Builder<SendLogisticsSmsRequest, Builder> {
        private String expressCompanyCode; 
        private String mailNo; 
        private String outId; 
        private Long ownerId; 
        private String platformCompanyCode; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String signName; 
        private String templateCode; 
        private String templateParam; 

        private Builder() {
            super();
        } 

        private Builder(SendLogisticsSmsRequest request) {
            super(request);
            this.expressCompanyCode = request.expressCompanyCode;
            this.mailNo = request.mailNo;
            this.outId = request.outId;
            this.ownerId = request.ownerId;
            this.platformCompanyCode = request.platformCompanyCode;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.signName = request.signName;
            this.templateCode = request.templateCode;
            this.templateParam = request.templateParam;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder expressCompanyCode(String expressCompanyCode) {
            this.putQueryParameter("ExpressCompanyCode", expressCompanyCode);
            this.expressCompanyCode = expressCompanyCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder mailNo(String mailNo) {
            this.putQueryParameter("MailNo", mailNo);
            this.mailNo = mailNo;
            return this;
        }

        /**
         * OutId.
         */
        public Builder outId(String outId) {
            this.putQueryParameter("OutId", outId);
            this.outId = outId;
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
         * PlatformCompanyCode.
         */
        public Builder platformCompanyCode(String platformCompanyCode) {
            this.putQueryParameter("PlatformCompanyCode", platformCompanyCode);
            this.platformCompanyCode = platformCompanyCode;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder signName(String signName) {
            this.putQueryParameter("SignName", signName);
            this.signName = signName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * TemplateParam.
         */
        public Builder templateParam(String templateParam) {
            this.putQueryParameter("TemplateParam", templateParam);
            this.templateParam = templateParam;
            return this;
        }

        @Override
        public SendLogisticsSmsRequest build() {
            return new SendLogisticsSmsRequest(this);
        } 

    } 

}
