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
 * {@link CreateRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateRuleRequest</p>
 */
public class CreateRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("consoleRuleId")
    private Long consoleRuleId;

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
    @com.aliyun.core.annotation.NameInMap("logicExpression")
    private String logicExpression;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("memo")
    private String memo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleActions")
    private String ruleActions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleBody")
    private String ruleBody;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleExpressions")
    private String ruleExpressions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleStatus")
    private String ruleStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleType")
    private String ruleType;

    private CreateRuleRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.consoleRuleId = builder.consoleRuleId;
        this.createType = builder.createType;
        this.eventCode = builder.eventCode;
        this.eventName = builder.eventName;
        this.logicExpression = builder.logicExpression;
        this.memo = builder.memo;
        this.regId = builder.regId;
        this.ruleActions = builder.ruleActions;
        this.ruleBody = builder.ruleBody;
        this.ruleExpressions = builder.ruleExpressions;
        this.ruleName = builder.ruleName;
        this.ruleStatus = builder.ruleStatus;
        this.ruleType = builder.ruleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRuleRequest create() {
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
     * @return consoleRuleId
     */
    public Long getConsoleRuleId() {
        return this.consoleRuleId;
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
     * @return logicExpression
     */
    public String getLogicExpression() {
        return this.logicExpression;
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
     * @return ruleActions
     */
    public String getRuleActions() {
        return this.ruleActions;
    }

    /**
     * @return ruleBody
     */
    public String getRuleBody() {
        return this.ruleBody;
    }

    /**
     * @return ruleExpressions
     */
    public String getRuleExpressions() {
        return this.ruleExpressions;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return ruleStatus
     */
    public String getRuleStatus() {
        return this.ruleStatus;
    }

    /**
     * @return ruleType
     */
    public String getRuleType() {
        return this.ruleType;
    }

    public static final class Builder extends Request.Builder<CreateRuleRequest, Builder> {
        private String lang; 
        private Long consoleRuleId; 
        private String createType; 
        private String eventCode; 
        private String eventName; 
        private String logicExpression; 
        private String memo; 
        private String regId; 
        private String ruleActions; 
        private String ruleBody; 
        private String ruleExpressions; 
        private String ruleName; 
        private String ruleStatus; 
        private String ruleType; 

        private Builder() {
            super();
        } 

        private Builder(CreateRuleRequest request) {
            super(request);
            this.lang = request.lang;
            this.consoleRuleId = request.consoleRuleId;
            this.createType = request.createType;
            this.eventCode = request.eventCode;
            this.eventName = request.eventName;
            this.logicExpression = request.logicExpression;
            this.memo = request.memo;
            this.regId = request.regId;
            this.ruleActions = request.ruleActions;
            this.ruleBody = request.ruleBody;
            this.ruleExpressions = request.ruleExpressions;
            this.ruleName = request.ruleName;
            this.ruleStatus = request.ruleStatus;
            this.ruleType = request.ruleType;
        } 

        /**
         * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values: </p>
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
         * <p>Rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5178</p>
         */
        public Builder consoleRuleId(Long consoleRuleId) {
            this.putQueryParameter("consoleRuleId", consoleRuleId);
            this.consoleRuleId = consoleRuleId;
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
         * <p>de_acytyt7036</p>
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
         * <p>登录事件</p>
         */
        public Builder eventName(String eventName) {
            this.putQueryParameter("eventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * <p>Policy expression execution logic</p>
         * 
         * <strong>example:</strong>
         * <p>1&amp;2</p>
         */
        public Builder logicExpression(String logicExpression) {
            this.putQueryParameter("logicExpression", logicExpression);
            this.logicExpression = logicExpression;
            return this;
        }

        /**
         * <p>Memo</p>
         * 
         * <strong>example:</strong>
         * <p>描述信息</p>
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
         * <p>Policy execution output action</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;inputs&quot;:[&quot;123&quot;],&quot;name&quot;:&quot;<strong>addDeTags</strong>&quot;,&quot;actionType&quot;:&quot;TAG&quot;,&quot;outputType&quot;:&quot;const&quot;},{&quot;inputs&quot;:[&quot;123&quot;],&quot;name&quot;:&quot;<strong>addDeScore</strong>&quot;,&quot;actionType&quot;:&quot;SCORE&quot;,&quot;outputType&quot;:&quot;const&quot;,&quot;inputTitle&quot;:&quot;123&quot;},{&quot;actionType&quot;:&quot;MIDDLE_VARIABLE&quot;,&quot;fieldValue&quot;:&quot;123&quot;,&quot;inputs&quot;:[&quot;mid1&quot;]},{&quot;actionType&quot;:&quot;VARIABLE&quot;,&quot;inputs&quot;:[&quot;gg&quot;],&quot;name&quot;:&quot;mid1&quot;}]</p>
         */
        public Builder ruleActions(String ruleActions) {
            this.putQueryParameter("ruleActions", ruleActions);
            this.ruleActions = ruleActions;
            return this;
        }

        /**
         * <p>DSL policy execution logic</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;elseIfStatement&quot;:[],&quot;elseStatement&quot;:{},&quot;ifStatement&quot;:{&quot;condition&quot;:{&quot;currentId&quot;:0,&quot;deepCount&quot;:1,&quot;list&quot;:[{&quot;currentId&quot;:0,&quot;deepCount&quot;:1,&quot;left&quot;:{&quot;code&quot;:&quot;deFunctionProcess(ip,&quot;isIp&quot;)&quot;,&quot;description&quot;:&quot;判断是否符合IPv4标准&quot;,&quot;displayType&quot;:&quot;SYSTEM_BIND&quot;,&quot;fieldType&quot;:&quot;BOOLEAN&quot;,&quot;functionCode&quot;:&quot;&quot;,&quot;functionName&quot;:&quot;&quot;,&quot;hasRightVariable&quot;:false,&quot;name&quot;:&quot;<strong>isIpAddressV4</strong>&quot;,&quot;outputThreshold&quot;:{},&quot;sourceType&quot;:&quot;SAF&quot;,&quot;title&quot;:&quot;IP是否符合IPV4格式&quot;,&quot;type&quot;:&quot;SYSTEM_BIND&quot;},&quot;operatorCode&quot;:&quot;boolIsFalse&quot;,&quot;operatorName&quot;:&quot;为false&quot;,&quot;parentId&quot;:0,&quot;sequence&quot;:1}],&quot;parentId&quot;:0,&quot;relationship&quot;:&quot;and&quot;},&quot;then&quot;:[{&quot;inputs&quot;:[&quot;123&quot;],&quot;name&quot;:&quot;<strong>addDeTags</strong>&quot;,&quot;actionType&quot;:&quot;TAG&quot;,&quot;outputType&quot;:&quot;const&quot;}]}}</p>
         */
        public Builder ruleBody(String ruleBody) {
            this.putQueryParameter("ruleBody", ruleBody);
            this.ruleBody = ruleBody;
            return this;
        }

        /**
         * <p>Policy expression</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;expressionName&quot;:&quot;cc&quot;,&quot;itemId&quot;:1,&quot;left&quot;:{&quot;name&quot;:&quot;<strong>ipLocationCityCode</strong>&quot;},&quot;operatorCode&quot;:&quot;equals&quot;,&quot;operatorName&quot;:&quot;等于&quot;,&quot;right&quot;:{&quot;fieldValue&quot;:&quot;a&quot;}}]</p>
         */
        public Builder ruleExpressions(String ruleExpressions) {
            this.putQueryParameter("ruleExpressions", ruleExpressions);
            this.ruleExpressions = ruleExpressions;
            return this;
        }

        /**
         * <p>Policy name</p>
         * 
         * <strong>example:</strong>
         * <p>注册手机号是11位数字</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("ruleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>Policy status</p>
         * 
         * <strong>example:</strong>
         * <p>DRAFT</p>
         */
        public Builder ruleStatus(String ruleStatus) {
            this.putQueryParameter("ruleStatus", ruleStatus);
            this.ruleStatus = ruleStatus;
            return this;
        }

        /**
         * <p>Policy type</p>
         * 
         * <strong>example:</strong>
         * <p>DRAFT</p>
         */
        public Builder ruleType(String ruleType) {
            this.putQueryParameter("ruleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        @Override
        public CreateRuleRequest build() {
            return new CreateRuleRequest(this);
        } 

    } 

}
