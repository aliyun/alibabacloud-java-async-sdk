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
 * {@link UpdateRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateRuleRequest</p>
 */
public class UpdateRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("consoleRuleId")
    private Long consoleRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCode")
    private String eventCode;

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
    @com.aliyun.core.annotation.NameInMap("ruleId")
    private String ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleStatus")
    private String ruleStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleType")
    private String ruleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleVersionId")
    private Long ruleVersionId;

    private UpdateRuleRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.consoleRuleId = builder.consoleRuleId;
        this.eventCode = builder.eventCode;
        this.logicExpression = builder.logicExpression;
        this.memo = builder.memo;
        this.regId = builder.regId;
        this.ruleActions = builder.ruleActions;
        this.ruleBody = builder.ruleBody;
        this.ruleExpressions = builder.ruleExpressions;
        this.ruleId = builder.ruleId;
        this.ruleName = builder.ruleName;
        this.ruleStatus = builder.ruleStatus;
        this.ruleType = builder.ruleType;
        this.ruleVersionId = builder.ruleVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRuleRequest create() {
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
     * @return eventCode
     */
    public String getEventCode() {
        return this.eventCode;
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
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
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

    /**
     * @return ruleVersionId
     */
    public Long getRuleVersionId() {
        return this.ruleVersionId;
    }

    public static final class Builder extends Request.Builder<UpdateRuleRequest, Builder> {
        private String lang; 
        private Long consoleRuleId; 
        private String eventCode; 
        private String logicExpression; 
        private String memo; 
        private String regId; 
        private String ruleActions; 
        private String ruleBody; 
        private String ruleExpressions; 
        private String ruleId; 
        private String ruleName; 
        private String ruleStatus; 
        private String ruleType; 
        private Long ruleVersionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRuleRequest request) {
            super(request);
            this.lang = request.lang;
            this.consoleRuleId = request.consoleRuleId;
            this.eventCode = request.eventCode;
            this.logicExpression = request.logicExpression;
            this.memo = request.memo;
            this.regId = request.regId;
            this.ruleActions = request.ruleActions;
            this.ruleBody = request.ruleBody;
            this.ruleExpressions = request.ruleExpressions;
            this.ruleId = request.ruleId;
            this.ruleName = request.ruleName;
            this.ruleStatus = request.ruleStatus;
            this.ruleType = request.ruleType;
            this.ruleVersionId = request.ruleVersionId;
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
         * <p>Primary key ID of the policy</p>
         * 
         * <strong>example:</strong>
         * <p>6843</p>
         */
        public Builder consoleRuleId(Long consoleRuleId) {
            this.putQueryParameter("consoleRuleId", consoleRuleId);
            this.consoleRuleId = consoleRuleId;
            return this;
        }

        /**
         * <p>Event code</p>
         * 
         * <strong>example:</strong>
         * <p>de_agdxgz0246</p>
         */
        public Builder eventCode(String eventCode) {
            this.putQueryParameter("eventCode", eventCode);
            this.eventCode = eventCode;
            return this;
        }

        /**
         * <p>Execution logic</p>
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
         * <p>Description</p>
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
         * <p>Output action</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;inputs&quot;:[&quot;rn0301&quot;],&quot;name&quot;:&quot;<strong>addDeTags</strong>&quot;,&quot;actionType&quot;:&quot;TAG&quot;,&quot;outputType&quot;:&quot;const&quot;}]</p>
         */
        public Builder ruleActions(String ruleActions) {
            this.putQueryParameter("ruleActions", ruleActions);
            this.ruleActions = ruleActions;
            return this;
        }

        /**
         * <p>DSL policy expression</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *         &quot;elseIfStatement&quot;: [
         *             {
         *                 &quot;condition&quot;: {
         *                     &quot;currentId&quot;: 0,
         *                     &quot;deepCount&quot;: 1,
         *                     &quot;list&quot;: [
         *                         {
         *                             &quot;currentId&quot;: 0,
         *                             &quot;deepCount&quot;: 1,
         *                             &quot;left&quot;: {
         *                                 &quot;code&quot;: &quot;getLbsRegion(longitude, latitude)?.prov&quot;,
         *                                 &quot;description&quot;: &quot;根据经纬度得到省份信息，比如经度：111.878062，纬度：22.585409，则经过运算，输出”广东省“&quot;,
         *                                 &quot;displayType&quot;: &quot;SELF_BIND&quot;,
         *                                 &quot;fieldType&quot;: &quot;STRING&quot;,
         *                                 &quot;functionCode&quot;: &quot;&quot;,
         *                                 &quot;functionName&quot;: &quot;&quot;,
         *                                 &quot;hasRightVariable&quot;: true,
         *                                 &quot;name&quot;: &quot;sl_S02sHLFT7818&quot;,
         *                                 &quot;outputThreshold&quot;: {</p>
         * <pre><code>                            },
         *                             &quot;sourceType&quot;: &quot;SAF&quot;,
         *                             &quot;title&quot;: &quot;经纬度自定义系统变量&quot;,
         *                             &quot;type&quot;: &quot;SELF_BIND&quot;
         *                         },
         *                         &quot;operatorCode&quot;: &quot;equals&quot;,
         *                         &quot;operatorName&quot;: &quot;等于&quot;,
         *                         &quot;parentId&quot;: 0,
         *                         &quot;right&quot;: {
         *                             &quot;name&quot;: &quot;v&quot;,
         *                             &quot;rightVariableType&quot;: &quot;constant&quot;
         *                         },
         *                         &quot;sequence&quot;: 2
         *                     },
         *                     {
         *                         &quot;currentId&quot;: 0,
         *                         &quot;deepCount&quot;: 1,
         *                         &quot;list&quot;: [
         *                             {
         *                                 &quot;currentId&quot;: 0,
         *                                 &quot;deepCount&quot;: 1,
         *                                 &quot;left&quot;: {
         *                                     &quot;code&quot;: &quot;deReadVelocity(userId,&quot;hK1DMAp1d97&quot;,1,&quot;H&quot;,0,true,&quot;COUNT&quot;)&quot;,
         *                                     &quot;description&quot;: &quot;测试系统变量累计&quot;,
         *                                     &quot;displayType&quot;: &quot;SELF_BIND&quot;,
         *                                     &quot;fieldType&quot;: &quot;DOUBLE&quot;,
         *                                     &quot;functionCode&quot;: &quot;&quot;,
         *                                     &quot;functionName&quot;: &quot;&quot;,
         *                                     &quot;hasRightVariable&quot;: true,
         *                                     &quot;name&quot;: &quot;hK1DMAp1d97&quot;,
         *                                     &quot;outputThreshold&quot;: {
         * 
         *                                     },
         *                                     &quot;sourceType&quot;: &quot;SAF_SELF&quot;,
         *                                     &quot;title&quot;: &quot;测试系统变量累计&quot;,
         *                                     &quot;type&quot;: &quot;SELF_BIND&quot;
         *                                 },
         *                                 &quot;operatorCode&quot;: &quot;equals&quot;,
         *                                 &quot;operatorName&quot;: &quot;等于&quot;,
         *                                 &quot;parentId&quot;: 0,
         *                                 &quot;right&quot;: {
         *                                     &quot;name&quot;: &quot;a&quot;,
         *                                     &quot;rightVariableType&quot;: &quot;constant&quot;
         *                                 },
         *                                 &quot;sequence&quot;: 3
         *                             }
         *                         ],
         *                         &quot;parentId&quot;: 0,
         *                         &quot;relationship&quot;: &quot;and&quot;
         *                     }
         *                 ],
         *                 &quot;parentId&quot;: 0,
         *                 &quot;relationship&quot;: &quot;and&quot;
         *             },
         *             &quot;then&quot;: [
         *                 {
         *                     &quot;inputs&quot;: [
         *                         &quot;123&quot;
         *                     ],
         *                     &quot;name&quot;: &quot;__addDeScore__&quot;,
         *                     &quot;actionType&quot;: &quot;SCORE&quot;,
         *                     &quot;outputType&quot;: &quot;const&quot;,
         *                     &quot;inputTitle&quot;: &quot;123&quot;
         *                 }
         *             ]
         *         }
         *     ],
         *     &quot;elseStatement&quot;: {
         * 
         *     },
         *     &quot;ifStatement&quot;: {
         *         &quot;condition&quot;: {
         *             &quot;currentId&quot;: 0,
         *             &quot;deepCount&quot;: 1,
         *             &quot;list&quot;: [
         *                 {
         *                     &quot;currentId&quot;: 0,
         *                     &quot;deepCount&quot;: 1,
         *                     &quot;left&quot;: {
         *                         &quot;code&quot;: &quot;deFunctionProcess(ip,&quot;isIp&quot;)&quot;,
         *                         &quot;description&quot;: &quot;判断是否符合IPv4标准&quot;,
         *                         &quot;displayType&quot;: &quot;SYSTEM_BIND&quot;,
         *                         &quot;fieldType&quot;: &quot;BOOLEAN&quot;,
         *                         &quot;functionCode&quot;: &quot;&quot;,
         *                         &quot;functionName&quot;: &quot;&quot;,
         *                         &quot;hasRightVariable&quot;: true,
         *                         &quot;name&quot;: &quot;__isIpAddressV4__&quot;,
         *                         &quot;outputThreshold&quot;: {
         * 
         *                         },
         *                         &quot;sourceType&quot;: &quot;SAF&quot;,
         *                         &quot;title&quot;: &quot;IP是否符合IPV4格式&quot;,
         *                         &quot;type&quot;: &quot;SYSTEM_BIND&quot;
         *                     },
         *                     &quot;operatorCode&quot;: &quot;equals&quot;,
         *                     &quot;operatorName&quot;: &quot;等于&quot;,
         *                     &quot;parentId&quot;: 0,
         *                     &quot;right&quot;: {
         *                         &quot;name&quot;: &quot;c
         * </code></pre>
         * <p>d
         * s&quot;,
         *                             &quot;rightVariableType&quot;: &quot;constant&quot;
         *                         },
         *                         &quot;sequence&quot;: 1
         *                     }
         *                 ],
         *                 &quot;parentId&quot;: 0,
         *                 &quot;relationship&quot;: &quot;and&quot;
         *             },
         *             &quot;then&quot;: [
         *                 {
         *                     &quot;inputs&quot;: [
         *                         &quot;22&quot;
         *                     ],
         *                     &quot;name&quot;: &quot;<strong>addDeTags</strong>&quot;,
         *                     &quot;actionType&quot;: &quot;TAG&quot;,
         *                     &quot;outputType&quot;: &quot;const&quot;
         *                 }
         *             ]
         *         }
         *     }</p>
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
         * <p>[{&quot;expressionName&quot;:&quot;手机号MD5命中人脸测试名单&quot;,&quot;itemId&quot;:1,&quot;left&quot;:{&quot;name&quot;:&quot;mobileMd5&quot;},&quot;operatorCode&quot;:&quot;deInNameList&quot;,&quot;operatorName&quot;:&quot;在名单中&quot;,&quot;right&quot;:{&quot;fieldValue&quot;:&quot;nl_5tolf69W138c&quot;}}]</p>
         */
        public Builder ruleExpressions(String ruleExpressions) {
            this.putQueryParameter("ruleExpressions", ruleExpressions);
            this.ruleExpressions = ruleExpressions;
            return this;
        }

        /**
         * <p>Policy ID</p>
         * 
         * <strong>example:</strong>
         * <p>102224</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("ruleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>Policy name</p>
         * 
         * <strong>example:</strong>
         * <p>分析中心事件测试_策略01</p>
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
         * <p>RUNNING</p>
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
         * <p>DEFAULT</p>
         */
        public Builder ruleType(String ruleType) {
            this.putQueryParameter("ruleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * <p>Primary key ID of the policy version</p>
         * 
         * <strong>example:</strong>
         * <p>11519</p>
         */
        public Builder ruleVersionId(Long ruleVersionId) {
            this.putQueryParameter("ruleVersionId", ruleVersionId);
            this.ruleVersionId = ruleVersionId;
            return this;
        }

        @Override
        public UpdateRuleRequest build() {
            return new UpdateRuleRequest(this);
        } 

    } 

}
