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
         * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
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
         * <p>Event name.</p>
         * 
         * <strong>example:</strong>
         * <p>登录事件</p>
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
         * <p>[{&quot;fieldCode&quot;:&quot;accountId&quot;,&quot;description&quot;:&quot;用户的账户ID，唯一标识一个账户的id&quot;,&quot;fieldRank&quot;:1,&quot;title&quot;:&quot;账户ID&quot;,&quot;fieldType&quot;:&quot;STRING&quot;,&quot;fieldSource&quot;:&quot;DEFAULT&quot;},{&quot;fieldCode&quot;:&quot;hitRules&quot;,&quot;fieldRank&quot;:2,&quot;title&quot;:&quot;命中策略&quot;,&quot;fieldType&quot;:&quot;STRING&quot;,&quot;fieldSource&quot;:&quot;DEFAULT&quot;},{&quot;fieldCode&quot;:&quot;age&quot;,&quot;description&quot;:&quot;&quot;,&quot;fieldRank&quot;:3,&quot;title&quot;:&quot;年龄&quot;,&quot;fieldType&quot;:&quot;INT&quot;,&quot;fieldSource&quot;:&quot;DEFAULT&quot;},{&quot;fieldCode&quot;:&quot;ip&quot;,&quot;description&quot;:&quot;IP地址&quot;,&quot;fieldRank&quot;:4,&quot;title&quot;:&quot;IP地址&quot;,&quot;fieldType&quot;:&quot;STRING&quot;,&quot;fieldSource&quot;:&quot;DEFAULT&quot;},{&quot;fieldCode&quot;:&quot;tags&quot;,&quot;fieldRank&quot;:5,&quot;title&quot;:&quot;风险标签&quot;,&quot;fieldType&quot;:&quot;STRING&quot;,&quot;fieldSource&quot;:&quot;DEFAULT&quot;},{&quot;fieldCode&quot;:&quot;score&quot;,&quot;fieldRank&quot;:6,&quot;title&quot;:&quot;风险分值&quot;,&quot;fieldType&quot;:&quot;DOUBLE&quot;,&quot;fieldSource&quot;:&quot;DEFAULT&quot;},{&quot;fieldCode&quot;:&quot;hitList&quot;,&quot;fieldRank&quot;:7}]</p>
         */
        public Builder inputFieldsStr(String inputFieldsStr) {
            this.putQueryParameter("inputFieldsStr", inputFieldsStr);
            this.inputFieldsStr = inputFieldsStr;
            return this;
        }

        /**
         * <p>Memo information</p>
         * 
         * <strong>example:</strong>
         * <p>登录事件描述</p>
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
         * <p>Input field template type</p>
         * 
         * <strong>example:</strong>
         * <p>register</p>
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("templateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * <p>Published template name.</p>
         * 
         * <strong>example:</strong>
         * <p>注册事件模版</p>
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("templateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>Template type.</p>
         * 
         * <strong>example:</strong>
         * <p>TASK</p>
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
