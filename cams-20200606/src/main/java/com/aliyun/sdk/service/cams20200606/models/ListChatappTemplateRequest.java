// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListChatappTemplateRequest} extends {@link RequestModel}
 *
 * <p>ListChatappTemplateRequest</p>
 */
public class ListChatappTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditStatus")
    private String auditStatus;

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
    @com.aliyun.core.annotation.NameInMap("Page")
    private Page page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateType")
    private String templateType;

    private ListChatappTemplateRequest(Builder builder) {
        super(builder);
        this.auditStatus = builder.auditStatus;
        this.code = builder.code;
        this.custSpaceId = builder.custSpaceId;
        this.custWabaId = builder.custWabaId;
        this.isvCode = builder.isvCode;
        this.language = builder.language;
        this.name = builder.name;
        this.page = builder.page;
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
     * @return page
     */
    public Page getPage() {
        return this.page;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<ListChatappTemplateRequest, Builder> {
        private String auditStatus; 
        private String code; 
        private String custSpaceId; 
        private String custWabaId; 
        private String isvCode; 
        private String language; 
        private String name; 
        private Page page; 
        private String templateType; 

        private Builder() {
            super();
        } 

        private Builder(ListChatappTemplateRequest request) {
            super(request);
            this.auditStatus = request.auditStatus;
            this.code = request.code;
            this.custSpaceId = request.custSpaceId;
            this.custWabaId = request.custWabaId;
            this.isvCode = request.isvCode;
            this.language = request.language;
            this.name = request.name;
            this.page = request.page;
            this.templateType = request.templateType;
        } 

        /**
         * The review status of the message template. Valid values:
         * <p>
         * 
         * *   **pass**: The message template is approved.
         * *   **fail**: The message template is rejected.
         * *   **auditing**: The message template is being reviewed.
         * *   **unaudit**: The review is suspended.
         */
        public Builder auditStatus(String auditStatus) {
            this.putQueryParameter("AuditStatus", auditStatus);
            this.auditStatus = auditStatus;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.putQueryParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * The space ID of the user under the ISV account.
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * The WhatsApp Business account (WABA) ID of the user within the independent software vendor (ISV) account.
         * <p>
         * 
         * >  CustWabaId is an obsolete parameter. Use CustSpaceId instead.
         */
        public Builder custWabaId(String custWabaId) {
            this.putQueryParameter("CustWabaId", custWabaId);
            this.custWabaId = custWabaId;
            return this;
        }

        /**
         * The independent software vendor (ISV) verification code, which is used to verify whether the user is authorized by the ISV account.
         */
        public Builder isvCode(String isvCode) {
            this.putQueryParameter("IsvCode", isvCode);
            this.isvCode = isvCode;
            return this;
        }

        /**
         * The language that is used in the message template. For more information, see [Language codes](~~463420~~).
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * The name of the message template.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The pagination settings.
         */
        public Builder page(Page page) {
            String pageShrink = shrink(page, "Page", "json");
            this.putQueryParameter("Page", pageShrink);
            this.page = page;
            return this;
        }

        /**
         * The type of the message template.
         * <p>
         * 
         * *   **WHATSAPP**
         * *   **VIBER**
         * *   LINE: the Line message template. This type of message template will be released later.
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

            /**
             * The page number. Default value: 1.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * The number of entries per page. Default value: 10.
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
