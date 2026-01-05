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
 * {@link GetSmsTemplateListRequest} extends {@link RequestModel}
 *
 * <p>GetSmsTemplateListRequest</p>
 */
public class GetSmsTemplateListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditStatus")
    private Long auditStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageIndex")
    private Long pageIndex;

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
    @com.aliyun.core.annotation.NameInMap("SignName")
    private String signName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateCode")
    private String templateCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateTag")
    private String templateTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateType")
    private Long templateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsableStateList")
    private java.util.List<String> usableStateList;

    private GetSmsTemplateListRequest(Builder builder) {
        super(builder);
        this.auditStatus = builder.auditStatus;
        this.ownerId = builder.ownerId;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.signName = builder.signName;
        this.templateCode = builder.templateCode;
        this.templateName = builder.templateName;
        this.templateTag = builder.templateTag;
        this.templateType = builder.templateType;
        this.usableStateList = builder.usableStateList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSmsTemplateListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auditStatus
     */
    public Long getAuditStatus() {
        return this.auditStatus;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageIndex
     */
    public Long getPageIndex() {
        return this.pageIndex;
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
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return templateTag
     */
    public String getTemplateTag() {
        return this.templateTag;
    }

    /**
     * @return templateType
     */
    public Long getTemplateType() {
        return this.templateType;
    }

    /**
     * @return usableStateList
     */
    public java.util.List<String> getUsableStateList() {
        return this.usableStateList;
    }

    public static final class Builder extends Request.Builder<GetSmsTemplateListRequest, Builder> {
        private Long auditStatus; 
        private Long ownerId; 
        private Long pageIndex; 
        private Long pageSize; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String signName; 
        private String templateCode; 
        private String templateName; 
        private String templateTag; 
        private Long templateType; 
        private java.util.List<String> usableStateList; 

        private Builder() {
            super();
        } 

        private Builder(GetSmsTemplateListRequest request) {
            super(request);
            this.auditStatus = request.auditStatus;
            this.ownerId = request.ownerId;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.signName = request.signName;
            this.templateCode = request.templateCode;
            this.templateName = request.templateName;
            this.templateTag = request.templateTag;
            this.templateType = request.templateType;
            this.usableStateList = request.usableStateList;
        } 

        /**
         * <p>模板审核状态</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder auditStatus(Long auditStatus) {
            this.putQueryParameter("AuditStatus", auditStatus);
            this.auditStatus = auditStatus;
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
         * <p>页码, 默认1</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(Long pageIndex) {
            this.putQueryParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>每页数量，默认10</p>
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
         * <p>签名</p>
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
         * <p>模板code</p>
         * 
         * <strong>example:</strong>
         * <p>SMS_1688168</p>
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * <p>模板名称</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>模板标签</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder templateTag(String templateTag) {
            this.putQueryParameter("TemplateTag", templateTag);
            this.templateTag = templateTag;
            return this;
        }

        /**
         * <p>模板类型</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder templateType(Long templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        /**
         * <p>模板状态</p>
         */
        public Builder usableStateList(java.util.List<String> usableStateList) {
            String usableStateListShrink = shrink(usableStateList, "UsableStateList", "json");
            this.putQueryParameter("UsableStateList", usableStateListShrink);
            this.usableStateList = usableStateList;
            return this;
        }

        @Override
        public GetSmsTemplateListRequest build() {
            return new GetSmsTemplateListRequest(this);
        } 

    } 

}
