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
 * {@link DescribeRuleSnapshotResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRuleSnapshotResponseBody</p>
 */
public class DescribeRuleSnapshotResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private DescribeRuleSnapshotResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRuleSnapshotResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private ResultObject resultObject; 

        private Builder() {
        } 

        private Builder(DescribeRuleSnapshotResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned object</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeRuleSnapshotResponseBody build() {
            return new DescribeRuleSnapshotResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRuleSnapshotResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRuleSnapshotResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bizVersion")
        private String bizVersion;

        @com.aliyun.core.annotation.NameInMap("eventCode")
        private String eventCode;

        @com.aliyun.core.annotation.NameInMap("eventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("logicExpression")
        private String logicExpression;

        @com.aliyun.core.annotation.NameInMap("memo")
        private String memo;

        @com.aliyun.core.annotation.NameInMap("ruleActions")
        private String ruleActions;

        @com.aliyun.core.annotation.NameInMap("ruleBody")
        private String ruleBody;

        @com.aliyun.core.annotation.NameInMap("ruleExpressions")
        private String ruleExpressions;

        @com.aliyun.core.annotation.NameInMap("ruleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("ruleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("ruleStatus")
        private String ruleStatus;

        @com.aliyun.core.annotation.NameInMap("ruleType")
        private String ruleType;

        private ResultObject(Builder builder) {
            this.bizVersion = builder.bizVersion;
            this.eventCode = builder.eventCode;
            this.eventName = builder.eventName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.logicExpression = builder.logicExpression;
            this.memo = builder.memo;
            this.ruleActions = builder.ruleActions;
            this.ruleBody = builder.ruleBody;
            this.ruleExpressions = builder.ruleExpressions;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.ruleStatus = builder.ruleStatus;
            this.ruleType = builder.ruleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return bizVersion
         */
        public String getBizVersion() {
            return this.bizVersion;
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
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
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

        public static final class Builder {
            private String bizVersion; 
            private String eventCode; 
            private String eventName; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String logicExpression; 
            private String memo; 
            private String ruleActions; 
            private String ruleBody; 
            private String ruleExpressions; 
            private String ruleId; 
            private String ruleName; 
            private String ruleStatus; 
            private String ruleType; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.bizVersion = model.bizVersion;
                this.eventCode = model.eventCode;
                this.eventName = model.eventName;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.logicExpression = model.logicExpression;
                this.memo = model.memo;
                this.ruleActions = model.ruleActions;
                this.ruleBody = model.ruleBody;
                this.ruleExpressions = model.ruleExpressions;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.ruleStatus = model.ruleStatus;
                this.ruleType = model.ruleType;
            } 

            /**
             * <p>Business version.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bizVersion(String bizVersion) {
                this.bizVersion = bizVersion;
                return this;
            }

            /**
             * <p>Event code</p>
             * 
             * <strong>example:</strong>
             * <p>de_aszbjb7236</p>
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * <p>Event name.</p>
             * 
             * <strong>example:</strong>
             * <p>注册风险</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>Creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1621578648000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>1565701886000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Expression for analysis results.</p>
             * 
             * <strong>example:</strong>
             * <p>1&amp;2</p>
             */
            public Builder logicExpression(String logicExpression) {
                this.logicExpression = logicExpression;
                return this;
            }

            /**
             * <p>Memo.</p>
             * 
             * <strong>example:</strong>
             * <p>备注</p>
             */
            public Builder memo(String memo) {
                this.memo = memo;
                return this;
            }

            /**
             * <p>Rule actions.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;inputs&quot;:[&quot;LdShop&quot;],&quot;name&quot;:&quot;<strong>addDeTags</strong>&quot;,&quot;actionType&quot;:&quot;TAG&quot;,&quot;outputType&quot;:&quot;const&quot;}]</p>
             */
            public Builder ruleActions(String ruleActions) {
                this.ruleActions = ruleActions;
                return this;
            }

            /**
             * <p>DSL rule expression. This field is required when ruleType is DSL.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;elseIfStatement&quot;:[{&quot;condition&quot;:{&quot;currentId&quot;:0,&quot;deepCount&quot;:1,&quot;list&quot;:[{&quot;currentId&quot;:0,&quot;deepCount&quot;:1,&quot;left&quot;:{&quot;code&quot;:&quot;getLbsRegion(longitude, latitude)?.prov&quot;,&quot;description&quot;:&quot;根据经纬度得到省份信息，比如经度：111.878062，纬度：22.585409，则经过运算，输出”广东省“&quot;,&quot;displayType&quot;:&quot;SELF_BIND&quot;,&quot;fieldType&quot;:&quot;STRING&quot;,&quot;functionCode&quot;:&quot;&quot;,&quot;functionName&quot;:&quot;&quot;,&quot;hasRightVariable&quot;:true,&quot;name&quot;:&quot;sl_S02sHLFT7818&quot;,&quot;outputThreshold&quot;:{},&quot;sourceType&quot;:&quot;SAF&quot;,&quot;title&quot;:&quot;经纬度自定义系统变量&quot;,&quot;type&quot;:&quot;SELF_BIND&quot;},&quot;operatorCode&quot;:&quot;equals&quot;,&quot;operatorName&quot;:&quot;等于&quot;,&quot;parentId&quot;:0,&quot;right&quot;:{&quot;name&quot;:&quot;cc&quot;,&quot;rightVariableType&quot;:&quot;constant&quot;},&quot;sequence&quot;:5}],&quot;parentId&quot;:0,&quot;relationship&quot;:&quot;and&quot;},&quot;then&quot;:[{&quot;actionType&quot;:&quot;TAG&quot;,&quot;code&quot;:&quot;addDeTags&quot;,&quot;description&quot;:&quot;打标签&quot;,&quot;displayType&quot;:&quot;ACTION&quot;,&quot;fieldType&quot;:&quot;STRING&quot;,&quot;inputs&quot;:[&quot;332&quot;],&quot;name&quot;:&quot;<strong>addDeTags</strong>&quot;,&quot;outputType&quot;:&quot;const&quot;,&quot;sourceType&quot;:&quot;SAF&quot;,&quot;title&quot;:&quot;打标签&quot;,&quot;type&quot;:&quot;ACTION&quot;}]}],&quot;elseStatement&quot;:{&quot;then&quot;:[{&quot;actionType&quot;:&quot;TAG&quot;,&quot;code&quot;:&quot;addDeTags&quot;,&quot;description&quot;:&quot;打标签&quot;,&quot;displayType&quot;:&quot;ACTION&quot;,&quot;fieldType&quot;:&quot;STRING&quot;,&quot;inputs&quot;:[&quot;321&quot;],&quot;name&quot;:&quot;<strong>addDeTags</strong>&quot;,&quot;outputType&quot;:&quot;const&quot;,&quot;sourceType&quot;:&quot;SAF&quot;,&quot;title&quot;:&quot;打标签&quot;,&quot;type&quot;:&quot;ACTION&quot;}]},&quot;ifStatement&quot;:{&quot;condition&quot;:{&quot;currentId&quot;:0,&quot;deepCount&quot;:1,&quot;list&quot;:[{&quot;currentId&quot;:0,&quot;deepCount&quot;:1,&quot;left&quot;:{&quot;code&quot;:&quot;queryPhoneSimulatorInfo(deviceToken)?.brand&quot;,&quot;description&quot;:&quot;设备信息-终端品牌&quot;,&quot;displayType&quot;:&quot;DEVICE&quot;,&quot;fieldType&quot;:&quot;STRING&quot;,&quot;functionCode&quot;:&quot;&quot;,&quot;functionName&quot;:&quot;&quot;,&quot;hasRightVariable&quot;:true,&quot;name&quot;:&quot;<strong>device_brand</strong>&quot;,&quot;sourceType&quot;:&quot;SAF&quot;,&quot;title&quot;:&quot;设备信息-终端品牌-brand&quot;,&quot;type&quot;:&quot;DEVICE&quot;},&quot;operatorCode&quot;:&quot;deInNameList&quot;,&quot;operatorName&quot;:&quot;在名单中&quot;,&quot;parentId&quot;:0,&quot;right&quot;:{&quot;code&quot;:&quot;nl_UN8otElLb490&quot;,&quot;description&quot;:&quot;描述11&quot;,&quot;displayType&quot;:&quot;NAME_LIST&quot;,&quot;name&quot;:&quot;nl_UN8otElLb490&quot;,&quot;rightVariableType&quot;:&quot;constant&quot;,&quot;sourceType&quot;:&quot;SAF&quot;,&quot;title&quot;:&quot;wtz_名单新建测试02&quot;,&quot;type&quot;:&quot;NAME_LIST&quot;},&quot;sequence&quot;:1},{&quot;currentId&quot;:0,&quot;deepCount&quot;:1,&quot;left&quot;:{&quot;code&quot;:&quot;deFunctionProcess(ip,\&quot;isIp\&quot;)&quot;,&quot;description&quot;:&quot;判断是否符合IPv4标准&quot;,&quot;displayType&quot;:&quot;SYSTEM_BIND&quot;,&quot;fieldType&quot;:&quot;BOOLEAN&quot;,&quot;functionCode&quot;:&quot;&quot;,&quot;functionName&quot;:&quot;&quot;,&quot;hasRightVariable&quot;:false,&quot;name&quot;:&quot;<strong>isIpAddressV4</strong>&quot;,&quot;outputThreshold&quot;:{},&quot;sourceType&quot;:&quot;SAF&quot;,&quot;title&quot;:&quot;IP是否符合IPV4格式&quot;,&quot;type&quot;:&quot;SYSTEM_BIND&quot;},&quot;operatorCode&quot;:&quot;boolIsTrue&quot;,&quot;operatorName&quot;:&quot;为true&quot;,&quot;parentId&quot;:0,&quot;right&quot;:{&quot;name&quot;:&quot;&quot;,&quot;rightVariableType&quot;:&quot;constant&quot;},&quot;sequence&quot;:2},{&quot;currentId&quot;:0,&quot;deepCount&quot;:1,&quot;list&quot;:[{&quot;currentId&quot;:0,&quot;deepCount&quot;:1,&quot;left&quot;:{&quot;code&quot;:&quot;parseIpV2(ip)?.cityId&quot;,&quot;description&quot;:&quot;通过IP地址库解析IP所在的城市Code，例如，输入“42.120.74.211”，经过该变量运算，输出“330100”。&quot;,&quot;displayType&quot;:&quot;SYSTEM_BIND&quot;,&quot;fieldType&quot;:&quot;STRING&quot;,&quot;functionCode&quot;:&quot;&quot;,&quot;functionName&quot;:&quot;&quot;,&quot;hasRightVariable&quot;:true,&quot;name&quot;:&quot;<strong>ipLocationCityCode</strong>&quot;,&quot;outputThreshold&quot;:{},&quot;sourceType&quot;:&quot;SAF&quot;,&quot;title&quot;:&quot;IP所在地_城市Code&quot;,&quot;type&quot;:&quot;SYSTEM_BIND&quot;},&quot;operatorCode&quot;:&quot;equals&quot;,&quot;operatorName&quot;:&quot;等于&quot;,&quot;parentId&quot;:0,&quot;right&quot;:{&quot;code&quot;:&quot;deFunctionProcess(ip,\&quot;getCountry\&quot;)&quot;,&quot;description&quot;:&quot;通过IP地址库解析IP所在的城市名称，例如，输入“42.120.74.211”，经过该变量运算，输出“CN”。&quot;,&quot;displayType&quot;:&quot;SYSTEM_BIND&quot;,&quot;fieldType&quot;:&quot;STRING&quot;,&quot;functionCode&quot;:&quot;&quot;,&quot;functionName&quot;:&quot;&quot;,&quot;name&quot;:&quot;<strong>ipLocationCountryId</strong>&quot;,&quot;outputThreshold&quot;:{},&quot;rightVariableType&quot;:&quot;variable&quot;,&quot;sourceType&quot;:&quot;SAF&quot;,&quot;title&quot;:&quot;IP所在地_国家Code&quot;,&quot;type&quot;:&quot;SYSTEM_BIND&quot;},&quot;sequence&quot;:3},{&quot;currentId&quot;:0,&quot;deepCount&quot;:1,&quot;list&quot;:[{&quot;currentId&quot;:0,&quot;deepCount&quot;:1,&quot;left&quot;:{&quot;code&quot;:&quot;parseIpV2(ip)?.cityId&quot;,&quot;description&quot;:&quot;通过IP地址库解析IP所在的城市Code，例如，输入“42.120.74.211”，经过该变量运算，输出“330100”。&quot;,&quot;displayType&quot;:&quot;SYSTEM_BIND&quot;,&quot;fieldType&quot;:&quot;STRING&quot;,&quot;functionCode&quot;:&quot;&quot;,&quot;functionName&quot;:&quot;&quot;,&quot;hasRightVariable&quot;:true,&quot;name&quot;:&quot;<strong>ipLocationCityCode</strong>&quot;,&quot;outputThreshold&quot;:{&quot;$ref&quot;:&quot;$.ifStatement.condition.list[2].list[0].left.outputThreshold&quot;},&quot;sourceType&quot;:&quot;SAF&quot;,&quot;title&quot;:&quot;IP所在地_城市Code&quot;,&quot;type&quot;:&quot;SYSTEM_BIND&quot;},&quot;operatorCode&quot;:&quot;deInNameList&quot;,&quot;operatorName&quot;:&quot;在名单中&quot;,&quot;parentId&quot;:0,&quot;right&quot;:{&quot;code&quot;:&quot;nl_NsVwBD2s11e0&quot;,&quot;displayType&quot;:&quot;NAME_LIST&quot;,&quot;name&quot;:&quot;nl_NsVwBD2s11e0&quot;,&quot;rightVariableType&quot;:&quot;constant&quot;,&quot;sourceType&quot;:&quot;SAF&quot;,&quot;title&quot;:&quot;device_block_list&quot;,&quot;type&quot;:&quot;NAME_LIST&quot;},&quot;sequence&quot;:4}],&quot;parentId&quot;:0,&quot;relationship&quot;:&quot;and&quot;}],&quot;parentId&quot;:0,&quot;relationship&quot;:&quot;and&quot;}],&quot;parentId&quot;:0,&quot;relationship&quot;:&quot;and&quot;},&quot;then&quot;:[{&quot;actionType&quot;:&quot;TAG&quot;,&quot;code&quot;:&quot;addDeTags&quot;,&quot;description&quot;:&quot;打标签&quot;,&quot;displayType&quot;:&quot;ACTION&quot;,&quot;fieldType&quot;:&quot;STRING&quot;,&quot;inputs&quot;:[&quot;123&quot;],&quot;name&quot;:&quot;<strong>addDeTags</strong>&quot;,&quot;outputType&quot;:&quot;const&quot;,&quot;sourceType&quot;:&quot;SAF&quot;,&quot;title&quot;:&quot;打标签&quot;,&quot;type&quot;:&quot;ACTION&quot;}]}}</p>
             */
            public Builder ruleBody(String ruleBody) {
                this.ruleBody = ruleBody;
                return this;
            }

            /**
             * <p>Expression.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;expressionName&quot;:&quot;代下单_记录日志&quot;,&quot;itemId&quot;:1,&quot;left&quot;:{&quot;name&quot;:&quot;dhcfX2v7670&quot;},&quot;operatorCode&quot;:&quot;gte&quot;,&quot;operatorName&quot;:&quot;大于等于&quot;,&quot;right&quot;:{&quot;fieldValue&quot;:&quot;2&quot;}}]</p>
             */
            public Builder ruleExpressions(String ruleExpressions) {
                this.ruleExpressions = ruleExpressions;
                return this;
            }

            /**
             * <p>Policy ID</p>
             * 
             * <strong>example:</strong>
             * <p>101804</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>Policy name</p>
             * 
             * <strong>example:</strong>
             * <p>营销风险识别</p>
             */
            public Builder ruleName(String ruleName) {
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
                this.ruleStatus = ruleStatus;
                return this;
            }

            /**
             * <p>Rule type.</p>
             * 
             * <strong>example:</strong>
             * <p>DSL</p>
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
