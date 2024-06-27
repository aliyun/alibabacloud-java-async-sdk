// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTemplateStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyTemplateStatusRequest</p>
 */
public class ModifyTemplateStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("fromTemplateSatus")
    private String fromTemplateSatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("templateId")
    private Long templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("toTemplateSatus")
    private String toTemplateSatus;

    private ModifyTemplateStatusRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.fromTemplateSatus = builder.fromTemplateSatus;
        this.regId = builder.regId;
        this.templateId = builder.templateId;
        this.toTemplateSatus = builder.toTemplateSatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTemplateStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return fromTemplateSatus
     */
    public String getFromTemplateSatus() {
        return this.fromTemplateSatus;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    /**
     * @return toTemplateSatus
     */
    public String getToTemplateSatus() {
        return this.toTemplateSatus;
    }

    public static final class Builder extends Request.Builder<ModifyTemplateStatusRequest, Builder> {
        private String lang; 
        private String fromTemplateSatus; 
        private String regId; 
        private Long templateId; 
        private String toTemplateSatus; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTemplateStatusRequest request) {
            super(request);
            this.lang = request.lang;
            this.fromTemplateSatus = request.fromTemplateSatus;
            this.regId = request.regId;
            this.templateId = request.templateId;
            this.toTemplateSatus = request.toTemplateSatus;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * fromTemplateSatus.
         */
        public Builder fromTemplateSatus(String fromTemplateSatus) {
            this.putQueryParameter("fromTemplateSatus", fromTemplateSatus);
            this.fromTemplateSatus = fromTemplateSatus;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * templateId.
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("templateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * toTemplateSatus.
         */
        public Builder toTemplateSatus(String toTemplateSatus) {
            this.putQueryParameter("toTemplateSatus", toTemplateSatus);
            this.toTemplateSatus = toTemplateSatus;
            return this;
        }

        @Override
        public ModifyTemplateStatusRequest build() {
            return new ModifyTemplateStatusRequest(this);
        } 

    } 

}
