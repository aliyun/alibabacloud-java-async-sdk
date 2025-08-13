// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
    @com.aliyun.core.annotation.NameInMap("templateType")
    private String templateType;

    private ModifyEventRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.bizVersion = builder.bizVersion;
        this.createType = builder.createType;
        this.eventCode = builder.eventCode;
        this.eventName = builder.eventName;
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
        private String eventName; 
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
            this.eventName = request.eventName;
            this.inputFieldsStr = request.inputFieldsStr;
            this.memo = request.memo;
            this.regId = request.regId;
            this.templateType = request.templateType;
        } 

        /**
         * <p>Set the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Version number (latest).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder bizVersion(Integer bizVersion) {
            this.putQueryParameter("bizVersion", bizVersion);
            this.bizVersion = bizVersion;
            return this;
        }

        /**
         * <p>Creation type</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder createType(String createType) {
            this.putQueryParameter("createType", createType);
            this.createType = createType;
            return this;
        }

        /**
         * <p>Event code</p>
         * 
         * <strong>example:</strong>
         * <p>de_ambiby3420</p>
         */
        public Builder eventCode(String eventCode) {
            this.putQueryParameter("eventCode", eventCode);
            this.eventCode = eventCode;
            return this;
        }

        /**
         * <p>Event name.</p>
         * 
         * <strong>example:</strong>
         * <p>注册事件</p>
         */
        public Builder eventName(String eventName) {
            this.putQueryParameter("eventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * <p>Input parameters, JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;fieldCode&quot;:&quot;sessionId&quot;,&quot;description&quot;:&quot;会话ID&quot;,&quot;fieldRank&quot;:0,&quot;title&quot;:&quot;会话ID&quot;,&quot;fieldType&quot;:&quot;STRING&quot;,&quot;fieldSource&quot;:&quot;DEFAULT&quot;},{&quot;fieldCode&quot;:&quot;tags&quot;,&quot;fieldRank&quot;:1,&quot;title&quot;:&quot;风险标签&quot;,&quot;fieldType&quot;:&quot;STRING&quot;,&quot;fieldSource&quot;:&quot;DEFAULT&quot;},{&quot;fieldCode&quot;:&quot;score&quot;,&quot;fieldRank&quot;:2,&quot;title&quot;:&quot;风险分值&quot;,&quot;fieldType&quot;:&quot;DOUBLE&quot;,&quot;fieldSource&quot;:&quot;DEFAULT&quot;},{&quot;fieldCode&quot;:&quot;hitRules&quot;,&quot;fieldRank&quot;:3,&quot;title&quot;:&quot;命中策略&quot;,&quot;fieldType&quot;:&quot;STRING&quot;,&quot;fieldSource&quot;:&quot;DEFAULT&quot;}]</p>
         */
        public Builder inputFieldsStr(String inputFieldsStr) {
            this.putQueryParameter("inputFieldsStr", inputFieldsStr);
            this.inputFieldsStr = inputFieldsStr;
            return this;
        }

        /**
         * <p>Memo.</p>
         * 
         * <strong>example:</strong>
         * <p>备注</p>
         */
        public Builder memo(String memo) {
            this.putQueryParameter("memo", memo);
            this.memo = memo;
            return this;
        }

        /**
         * <p>Region code</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * <p>Template type</p>
         * 
         * <strong>example:</strong>
         * <p>暂无</p>
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
