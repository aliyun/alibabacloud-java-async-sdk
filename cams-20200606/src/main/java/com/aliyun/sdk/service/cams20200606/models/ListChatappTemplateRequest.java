// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link ListChatappTemplateRequest} extends {@link RequestModel}
 *
 * <p>ListChatappTemplateRequest</p>
 */
public class ListChatappTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditStatus")
    private String auditStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    private String custSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustWabaId")
    @Deprecated
    private String custWabaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsvCode")
    private String isvCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    private Page page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateType")
    private String templateType;

    private ListChatappTemplateRequest(Builder builder) {
        super(builder);
        this.auditStatus = builder.auditStatus;
        this.category = builder.category;
        this.code = builder.code;
        this.custSpaceId = builder.custSpaceId;
        this.custWabaId = builder.custWabaId;
        this.isvCode = builder.isvCode;
        this.language = builder.language;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.page = builder.page;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChatappTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auditStatus
     */
    public String getAuditStatus() {
        return this.auditStatus;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return custWabaId
     */
    public String getCustWabaId() {
        return this.custWabaId;
    }

    /**
     * @return isvCode
     */
    public String getIsvCode() {
        return this.isvCode;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return page
     */
    public Page getPage() {
        return this.page;
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
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<ListChatappTemplateRequest, Builder> {
        private String auditStatus; 
        private String category; 
        private String code; 
        private String custSpaceId; 
        private String custWabaId; 
        private String isvCode; 
        private String language; 
        private String name; 
        private Long ownerId; 
        private Page page; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String templateType; 

        private Builder() {
            super();
        } 

        private Builder(ListChatappTemplateRequest request) {
            super(request);
            this.auditStatus = request.auditStatus;
            this.category = request.category;
            this.code = request.code;
            this.custSpaceId = request.custSpaceId;
            this.custWabaId = request.custWabaId;
            this.isvCode = request.isvCode;
            this.language = request.language;
            this.name = request.name;
            this.ownerId = request.ownerId;
            this.page = request.page;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.templateType = request.templateType;
        } 

        /**
         * <p>The review status of the message template. Valid values:</p>
         * <ul>
         * <li><strong>pass</strong>: The message template is approved.</li>
         * <li><strong>fail</strong>: The message template is rejected.</li>
         * <li><strong>auditing</strong>: The message template is being reviewed.</li>
         * <li><strong>unaudit</strong>: The review is suspended.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        public Builder auditStatus(String auditStatus) {
            this.putQueryParameter("AuditStatus", auditStatus);
            this.auditStatus = auditStatus;
            return this;
        }

        /**
         * Category.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>Template encoding.</p>
         * 
         * <strong>example:</strong>
         * <p>838888822*****</p>
         */
        public Builder code(String code) {
            this.putQueryParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * <p>The space ID of the user under the ISV account.</p>
         * 
         * <strong>example:</strong>
         * <p>28251486512358****</p>
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * <p>The WhatsApp Business account (WABA) ID of the user within the independent software vendor (ISV) account.</p>
         * <blockquote>
         * <p> CustWabaId is an obsolete parameter. Use CustSpaceId instead.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>65921621816****</p>
         */
        public Builder custWabaId(String custWabaId) {
            this.putQueryParameter("CustWabaId", custWabaId);
            this.custWabaId = custWabaId;
            return this;
        }

        /**
         * <p>The independent software vendor (ISV) verification code, which is used to verify whether the user is authorized by the ISV account.</p>
         * 
         * <strong>example:</strong>
         * <p>skdi3kksloslikdkkdk</p>
         */
        public Builder isvCode(String isvCode) {
            this.putQueryParameter("IsvCode", isvCode);
            this.isvCode = isvCode;
            return this;
        }

        /**
         * <p>The language that is used in the message template. For more information, see <a href="https://help.aliyun.com/document_detail/463420.html">Language codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The name of the message template.</p>
         * 
         * <strong>example:</strong>
         * <p>hello_whatsapp</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * <p>The pagination settings.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;page&quot;: &quot;{&quot;index&quot;: 1,&quot;size&quot;: 20}</p>
         */
        public Builder page(Page page) {
            String pageShrink = shrink(page, "Page", "json");
            this.putQueryParameter("Page", pageShrink);
            this.page = page;
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
         * <p>The type of the message template.</p>
         * <ul>
         * <li><strong>WHATSAPP</strong></li>
         * <li><strong>VIBER</strong></li>
         * <li>LINE: the Line message template. This type of message template will be released later.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WHATSAPP</p>
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public ListChatappTemplateRequest build() {
            return new ListChatappTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListChatappTemplateRequest} extends {@link TeaModel}
     *
     * <p>ListChatappTemplateRequest</p>
     */
    public static class Page extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Index")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("Size")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer size;

        private Page(Builder builder) {
            this.index = builder.index;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Page create() {
            return builder().build();
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        public static final class Builder {
            private Integer index; 
            private Integer size; 

            private Builder() {
            } 

            private Builder(Page model) {
                this.index = model.index;
                this.size = model.size;
            } 

            /**
             * <p>The page number. Default value: 1.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The number of entries per page. Default value: 10.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            public Page build() {
                return new Page(this);
            } 

        } 

    }
}
