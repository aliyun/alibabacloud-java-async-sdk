// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEventRequest} extends {@link RequestModel}
 *
 * <p>CreateEventRequest</p>
 */
public class CreateEventRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("createType")
    private String createType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventName")
    private String eventName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("inputFieldsStr")
    private String inputFieldsStr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("memo")
    private String memo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("templateCode")
    private String templateCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("templateName")
    private String templateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("templateType")
    private String templateType;

    private CreateEventRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.createType = builder.createType;
        this.eventName = builder.eventName;
        this.inputFieldsStr = builder.inputFieldsStr;
        this.memo = builder.memo;
        this.regId = builder.regId;
        this.templateCode = builder.templateCode;
        this.templateName = builder.templateName;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEventRequest create() {
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
     * @return createType
     */
    public String getCreateType() {
        return this.createType;
    }

    /**
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * @return inputFieldsStr
     */
    public String getInputFieldsStr() {
        return this.inputFieldsStr;
    }

    /**
     * @return memo
     */
    public String getMemo() {
        return this.memo;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
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
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<CreateEventRequest, Builder> {
        private String lang; 
        private String createType; 
        private String eventName; 
        private String inputFieldsStr; 
        private String memo; 
        private String regId; 
        private String templateCode; 
        private String templateName; 
        private String templateType; 

        private Builder() {
            super();
        } 

        private Builder(CreateEventRequest request) {
            super(request);
            this.lang = request.lang;
            this.createType = request.createType;
            this.eventName = request.eventName;
            this.inputFieldsStr = request.inputFieldsStr;
            this.memo = request.memo;
            this.regId = request.regId;
            this.templateCode = request.templateCode;
            this.templateName = request.templateName;
            this.templateType = request.templateType;
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
         * createType.
         */
        public Builder createType(String createType) {
            this.putQueryParameter("createType", createType);
            this.createType = createType;
            return this;
        }

        /**
         * eventName.
         */
        public Builder eventName(String eventName) {
            this.putQueryParameter("eventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * inputFieldsStr.
         */
        public Builder inputFieldsStr(String inputFieldsStr) {
            this.putQueryParameter("inputFieldsStr", inputFieldsStr);
            this.inputFieldsStr = inputFieldsStr;
            return this;
        }

        /**
         * memo.
         */
        public Builder memo(String memo) {
            this.putQueryParameter("memo", memo);
            this.memo = memo;
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
         * templateCode.
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("templateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * templateName.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("templateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * templateType.
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("templateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public CreateEventRequest build() {
            return new CreateEventRequest(this);
        } 

    } 

}
