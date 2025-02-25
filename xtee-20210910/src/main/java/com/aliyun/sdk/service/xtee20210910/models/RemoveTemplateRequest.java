// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveTemplateRequest} extends {@link RequestModel}
 *
 * <p>RemoveTemplateRequest</p>
 */
public class RemoveTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCode")
    private String eventCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("templateId")
    private Long templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("version")
    private Integer version;

    private RemoveTemplateRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.eventCode = builder.eventCode;
        this.regId = builder.regId;
        this.templateId = builder.templateId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveTemplateRequest create() {
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
     * @return eventCode
     */
    public String getEventCode() {
        return this.eventCode;
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
     * @return version
     */
    public Integer getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<RemoveTemplateRequest, Builder> {
        private String lang; 
        private String eventCode; 
        private String regId; 
        private Long templateId; 
        private Integer version; 

        private Builder() {
            super();
        } 

        private Builder(RemoveTemplateRequest request) {
            super(request);
            this.lang = request.lang;
            this.eventCode = request.eventCode;
            this.regId = request.regId;
            this.templateId = request.templateId;
            this.version = request.version;
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
         * eventCode.
         */
        public Builder eventCode(String eventCode) {
            this.putQueryParameter("eventCode", eventCode);
            this.eventCode = eventCode;
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
         * version.
         */
        public Builder version(Integer version) {
            this.putQueryParameter("version", version);
            this.version = version;
            return this;
        }

        @Override
        public RemoveTemplateRequest build() {
            return new RemoveTemplateRequest(this);
        } 

    } 

}
