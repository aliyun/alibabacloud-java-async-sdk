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
 * {@link DeepCopyRuleRequest} extends {@link RequestModel}
 *
 * <p>DeepCopyRuleRequest</p>
 */
public class DeepCopyRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateType")
    private String createType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustInsertInfo")
    private String custInsertInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustWriteInfo")
    private String custWriteInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpressionVariableInfo")
    private String expressionVariableInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryExpressionVariableInfo")
    private String queryExpressionVariableInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceRuleId")
    private String sourceRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceRuleIds")
    private String sourceRuleIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetEventCode")
    private String targetEventCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetEventName")
    private String targetEventName;

    private DeepCopyRuleRequest(Builder builder) {
        super(builder);
        this.createType = builder.createType;
        this.custInsertInfo = builder.custInsertInfo;
        this.custWriteInfo = builder.custWriteInfo;
        this.expressionVariableInfo = builder.expressionVariableInfo;
        this.lang = builder.lang;
        this.queryExpressionVariableInfo = builder.queryExpressionVariableInfo;
        this.regId = builder.regId;
        this.sourceRuleId = builder.sourceRuleId;
        this.sourceRuleIds = builder.sourceRuleIds;
        this.targetEventCode = builder.targetEventCode;
        this.targetEventName = builder.targetEventName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeepCopyRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createType
     */
    public String getCreateType() {
        return this.createType;
    }

    /**
     * @return custInsertInfo
     */
    public String getCustInsertInfo() {
        return this.custInsertInfo;
    }

    /**
     * @return custWriteInfo
     */
    public String getCustWriteInfo() {
        return this.custWriteInfo;
    }

    /**
     * @return expressionVariableInfo
     */
    public String getExpressionVariableInfo() {
        return this.expressionVariableInfo;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return queryExpressionVariableInfo
     */
    public String getQueryExpressionVariableInfo() {
        return this.queryExpressionVariableInfo;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return sourceRuleId
     */
    public String getSourceRuleId() {
        return this.sourceRuleId;
    }

    /**
     * @return sourceRuleIds
     */
    public String getSourceRuleIds() {
        return this.sourceRuleIds;
    }

    /**
     * @return targetEventCode
     */
    public String getTargetEventCode() {
        return this.targetEventCode;
    }

    /**
     * @return targetEventName
     */
    public String getTargetEventName() {
        return this.targetEventName;
    }

    public static final class Builder extends Request.Builder<DeepCopyRuleRequest, Builder> {
        private String createType; 
        private String custInsertInfo; 
        private String custWriteInfo; 
        private String expressionVariableInfo; 
        private String lang; 
        private String queryExpressionVariableInfo; 
        private String regId; 
        private String sourceRuleId; 
        private String sourceRuleIds; 
        private String targetEventCode; 
        private String targetEventName; 

        private Builder() {
            super();
        } 

        private Builder(DeepCopyRuleRequest request) {
            super(request);
            this.createType = request.createType;
            this.custInsertInfo = request.custInsertInfo;
            this.custWriteInfo = request.custWriteInfo;
            this.expressionVariableInfo = request.expressionVariableInfo;
            this.lang = request.lang;
            this.queryExpressionVariableInfo = request.queryExpressionVariableInfo;
            this.regId = request.regId;
            this.sourceRuleId = request.sourceRuleId;
            this.sourceRuleIds = request.sourceRuleIds;
            this.targetEventCode = request.targetEventCode;
            this.targetEventName = request.targetEventName;
        } 

        /**
         * <p>Creation type</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder createType(String createType) {
            this.putQueryParameter("CreateType", createType);
            this.createType = createType;
            return this;
        }

        /**
         * <p>Newly added cumulative variable</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;id&quot;:&quot;1288&quot;,&quot;title&quot;:&quot;新标题&quot;}]</p>
         */
        public Builder custInsertInfo(String custInsertInfo) {
            this.putQueryParameter("CustInsertInfo", custInsertInfo);
            this.custInsertInfo = custInsertInfo;
            return this;
        }

        /**
         * <p>Read cumulative variable</p>
         * 
         * <strong>example:</strong>
         * <p>[1234，2345]</p>
         */
        public Builder custWriteInfo(String custWriteInfo) {
            this.putQueryParameter("CustWriteInfo", custWriteInfo);
            this.custWriteInfo = custWriteInfo;
            return this;
        }

        /**
         * <p>Custom variables to be added</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;id&quot;:&quot;ex_2wxZPcxg3a03&quot;,&quot;title&quot;:&quot;新标题&quot;}]</p>
         */
        public Builder expressionVariableInfo(String expressionVariableInfo) {
            this.putQueryParameter("ExpressionVariableInfo", expressionVariableInfo);
            this.expressionVariableInfo = expressionVariableInfo;
            return this;
        }

        /**
         * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values: </p>
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
         * <p>Custom query variables to be added</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;id&quot;:&quot;ex_2wxZPcxg3a03&quot;,&quot;title&quot;:&quot;新标题&quot;}]</p>
         */
        public Builder queryExpressionVariableInfo(String queryExpressionVariableInfo) {
            this.putQueryParameter("QueryExpressionVariableInfo", queryExpressionVariableInfo);
            this.queryExpressionVariableInfo = queryExpressionVariableInfo;
            return this;
        }

        /**
         * <p>Region code</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("RegId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * <p>Source policy ID</p>
         * 
         * <strong>example:</strong>
         * <p>102125</p>
         */
        public Builder sourceRuleId(String sourceRuleId) {
            this.putQueryParameter("SourceRuleId", sourceRuleId);
            this.sourceRuleId = sourceRuleId;
            return this;
        }

        /**
         * <p>Target policy ID</p>
         * 
         * <strong>example:</strong>
         * <p>102125,102129</p>
         */
        public Builder sourceRuleIds(String sourceRuleIds) {
            this.putQueryParameter("SourceRuleIds", sourceRuleIds);
            this.sourceRuleIds = sourceRuleIds;
            return this;
        }

        /**
         * <p>Target event</p>
         * 
         * <strong>example:</strong>
         * <p>de_ajtshf1581</p>
         */
        public Builder targetEventCode(String targetEventCode) {
            this.putQueryParameter("TargetEventCode", targetEventCode);
            this.targetEventCode = targetEventCode;
            return this;
        }

        /**
         * <p>Target event name</p>
         * 
         * <strong>example:</strong>
         * <p>目标事件名称</p>
         */
        public Builder targetEventName(String targetEventName) {
            this.putQueryParameter("TargetEventName", targetEventName);
            this.targetEventName = targetEventName;
            return this;
        }

        @Override
        public DeepCopyRuleRequest build() {
            return new DeepCopyRuleRequest(this);
        } 

    } 

}
