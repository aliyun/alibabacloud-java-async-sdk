// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link CreateSceneRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateSceneRuleRequest</p>
 */
public class CreateSceneRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleContent")
    private String ruleContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleDescription")
    private String ruleDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    private CreateSceneRuleRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.ruleContent = builder.ruleContent;
        this.ruleDescription = builder.ruleDescription;
        this.ruleName = builder.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSceneRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return ruleContent
     */
    public String getRuleContent() {
        return this.ruleContent;
    }

    /**
     * @return ruleDescription
     */
    public String getRuleDescription() {
        return this.ruleDescription;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    public static final class Builder extends Request.Builder<CreateSceneRuleRequest, Builder> {
        private String iotInstanceId; 
        private String ruleContent; 
        private String ruleDescription; 
        private String ruleName; 

        private Builder() {
            super();
        } 

        private Builder(CreateSceneRuleRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.ruleContent = request.ruleContent;
            this.ruleDescription = request.ruleDescription;
            this.ruleName = request.ruleName;
        } 

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * RuleContent.
         */
        public Builder ruleContent(String ruleContent) {
            this.putQueryParameter("RuleContent", ruleContent);
            this.ruleContent = ruleContent;
            return this;
        }

        /**
         * RuleDescription.
         */
        public Builder ruleDescription(String ruleDescription) {
            this.putQueryParameter("RuleDescription", ruleDescription);
            this.ruleDescription = ruleDescription;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        @Override
        public CreateSceneRuleRequest build() {
            return new CreateSceneRuleRequest(this);
        } 

    } 

}
