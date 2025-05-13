// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20230516.models;

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
 * {@link SmsTemplatePageListRequest} extends {@link RequestModel}
 *
 * <p>SmsTemplatePageListRequest</p>
 */
public class SmsTemplatePageListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sign")
    private String sign;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmsType")
    private Long smsType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Long status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private Long templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateType")
    private Long templateType;

    private SmsTemplatePageListRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sign = builder.sign;
        this.smsType = builder.smsType;
        this.status = builder.status;
        this.templateId = builder.templateId;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SmsTemplatePageListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
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
     * @return sign
     */
    public String getSign() {
        return this.sign;
    }

    /**
     * @return smsType
     */
    public Long getSmsType() {
        return this.smsType;
    }

    /**
     * @return status
     */
    public Long getStatus() {
        return this.status;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateType
     */
    public Long getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<SmsTemplatePageListRequest, Builder> {
        private Long ownerId; 
        private Long pageNo; 
        private Long pageSize; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String sign; 
        private Long smsType; 
        private Long status; 
        private Long templateId; 
        private Long templateType; 

        private Builder() {
            super();
        } 

        private Builder(SmsTemplatePageListRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sign = request.sign;
            this.smsType = request.smsType;
            this.status = request.status;
            this.templateId = request.templateId;
            this.templateType = request.templateType;
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
         * <p>页码</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>每页条数</p>
         * 
         * <strong>example:</strong>
         * <p>97</p>
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
         * <p>短信签名</p>
         * 
         * <strong>example:</strong>
         * <p>114ah23m</p>
         */
        public Builder sign(String sign) {
            this.putQueryParameter("Sign", sign);
            this.sign = sign;
            return this;
        }

        /**
         * <p>短信类型</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        public Builder smsType(Long smsType) {
            this.putQueryParameter("SmsType", smsType);
            this.smsType = smsType;
            return this;
        }

        /**
         * <p>模板状态</p>
         * 
         * <strong>example:</strong>
         * <p>92</p>
         */
        public Builder status(Long status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>模板ID</p>
         * 
         * <strong>example:</strong>
         * <p>83</p>
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>模板类型</p>
         * 
         * <strong>example:</strong>
         * <p>19</p>
         */
        public Builder templateType(Long templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public SmsTemplatePageListRequest build() {
            return new SmsTemplatePageListRequest(this);
        } 

    } 

}
