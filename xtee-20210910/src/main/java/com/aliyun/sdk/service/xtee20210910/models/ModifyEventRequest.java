// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyEventRequest} extends {@link RequestModel}
 *
 * <p>ModifyEventRequest</p>
 */
public class ModifyEventRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("bizVersion")
    private Integer bizVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("createType")
    private String createType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCode")
    private String eventCode;

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
    @com.aliyun.core.annotation.NameInMap("templateType")
    private String templateType;

    private ModifyEventRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.bizVersion = builder.bizVersion;
        this.createType = builder.createType;
        this.eventCode = builder.eventCode;
        this.inputFieldsStr = builder.inputFieldsStr;
        this.memo = builder.memo;
        this.regId = builder.regId;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyEventRequest create() {
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
     * @return bizVersion
     */
    public Integer getBizVersion() {
        return this.bizVersion;
    }

    /**
     * @return createType
     */
    public String getCreateType() {
        return this.createType;
    }

    /**
     * @return eventCode
     */
    public String getEventCode() {
        return this.eventCode;
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
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<ModifyEventRequest, Builder> {
        private String lang; 
        private Integer bizVersion; 
        private String createType; 
        private String eventCode; 
        private String inputFieldsStr; 
        private String memo; 
        private String regId; 
        private String templateType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyEventRequest request) {
            super(request);
            this.lang = request.lang;
            this.bizVersion = request.bizVersion;
            this.createType = request.createType;
            this.eventCode = request.eventCode;
            this.inputFieldsStr = request.inputFieldsStr;
            this.memo = request.memo;
            this.regId = request.regId;
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
         * bizVersion.
         */
        public Builder bizVersion(Integer bizVersion) {
            this.putQueryParameter("bizVersion", bizVersion);
            this.bizVersion = bizVersion;
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
         * eventCode.
         */
        public Builder eventCode(String eventCode) {
            this.putQueryParameter("eventCode", eventCode);
            this.eventCode = eventCode;
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
         * templateType.
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("templateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public ModifyEventRequest build() {
            return new ModifyEventRequest(this);
        } 

    } 

}
