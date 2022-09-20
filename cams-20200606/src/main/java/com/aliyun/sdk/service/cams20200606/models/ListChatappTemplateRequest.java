// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListChatappTemplateRequest} extends {@link RequestModel}
 *
 * <p>ListChatappTemplateRequest</p>
 */
public class ListChatappTemplateRequest extends Request {
    @Query
    @NameInMap("AuditStatus")
    private String auditStatus;

    @Query
    @NameInMap("CustWabaId")
    private String custWabaId;

    @Query
    @NameInMap("IsvCode")
    private String isvCode;

    @Query
    @NameInMap("Language")
    private String language;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Page")
    private Page page;

    private ListChatappTemplateRequest(Builder builder) {
        super(builder);
        this.auditStatus = builder.auditStatus;
        this.custWabaId = builder.custWabaId;
        this.isvCode = builder.isvCode;
        this.language = builder.language;
        this.name = builder.name;
        this.page = builder.page;
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

    public static final class Builder extends Request.Builder<ListChatappTemplateRequest, Builder> {
        private String auditStatus; 
        private String custWabaId; 
        private String isvCode; 
        private String language; 
        private String name; 
        private Page page; 

        private Builder() {
            super();
        } 

        private Builder(ListChatappTemplateRequest request) {
            super(request);
            this.auditStatus = request.auditStatus;
            this.custWabaId = request.custWabaId;
            this.isvCode = request.isvCode;
            this.language = request.language;
            this.name = request.name;
            this.page = request.page;
        } 

        /**
         * 审核状态
         */
        public Builder auditStatus(String auditStatus) {
            this.putQueryParameter("AuditStatus", auditStatus);
            this.auditStatus = auditStatus;
            return this;
        }

        /**
         * ISV客户WabaId
         */
        public Builder custWabaId(String custWabaId) {
            this.putQueryParameter("CustWabaId", custWabaId);
            this.custWabaId = custWabaId;
            return this;
        }

        /**
         * Isv校验码，用于校验子帐号是否由ISV授权
         */
        public Builder isvCode(String isvCode) {
            this.putQueryParameter("IsvCode", isvCode);
            this.isvCode = isvCode;
            return this;
        }

        /**
         * 语言
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * 模板名称
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Page page) {
            String pageShrink = shrink(page, "Page", "json");
            this.putQueryParameter("Page", pageShrink);
            this.page = page;
            return this;
        }

        @Override
        public ListChatappTemplateRequest build() {
            return new ListChatappTemplateRequest(this);
        } 

    } 

    public static class Page extends TeaModel {
        @NameInMap("Index")
        @Validation(required = true)
        private Integer index;

        @NameInMap("Size")
        @Validation(required = true)
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
             * 查询开始数
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * 每次查询返回的条数
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
