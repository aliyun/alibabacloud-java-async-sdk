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
 * {@link CompareCopyRuleVariableRequest} extends {@link RequestModel}
 *
 * <p>CompareCopyRuleVariableRequest</p>
 */
public class CompareCopyRuleVariableRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateType")
    private String createType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

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

    private CompareCopyRuleVariableRequest(Builder builder) {
        super(builder);
        this.createType = builder.createType;
        this.lang = builder.lang;
        this.regId = builder.regId;
        this.sourceRuleId = builder.sourceRuleId;
        this.sourceRuleIds = builder.sourceRuleIds;
        this.targetEventCode = builder.targetEventCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompareCopyRuleVariableRequest create() {
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
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

    public static final class Builder extends Request.Builder<CompareCopyRuleVariableRequest, Builder> {
        private String createType; 
        private String lang; 
        private String regId; 
        private String sourceRuleId; 
        private String sourceRuleIds; 
        private String targetEventCode; 

        private Builder() {
            super();
        } 

        private Builder(CompareCopyRuleVariableRequest request) {
            super(request);
            this.createType = request.createType;
            this.lang = request.lang;
            this.regId = request.regId;
            this.sourceRuleId = request.sourceRuleId;
            this.sourceRuleIds = request.sourceRuleIds;
            this.targetEventCode = request.targetEventCode;
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
         * <p>Region code.</p>
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
         * <p>Original policy ruleId.</p>
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
         * <p>Original policy ruleIds.</p>
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
         * <p>Target event eventCode.</p>
         * 
         * <strong>example:</strong>
         * <p>de_ajtshf1581</p>
         */
        public Builder targetEventCode(String targetEventCode) {
            this.putQueryParameter("TargetEventCode", targetEventCode);
            this.targetEventCode = targetEventCode;
            return this;
        }

        @Override
        public CompareCopyRuleVariableRequest build() {
            return new CompareCopyRuleVariableRequest(this);
        } 

    } 

}
