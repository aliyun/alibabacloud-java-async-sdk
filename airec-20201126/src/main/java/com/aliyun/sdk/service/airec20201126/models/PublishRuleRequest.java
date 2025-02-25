// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PublishRuleRequest} extends {@link RequestModel}
 *
 * <p>PublishRuleRequest</p>
 */
public class PublishRuleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ruleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sceneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneId;

    private PublishRuleRequest(Builder builder) {
        super(builder);
        this.ruleId = builder.ruleId;
        this.instanceId = builder.instanceId;
        this.ruleType = builder.ruleType;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ruleType
     */
    public String getRuleType() {
        return this.ruleType;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<PublishRuleRequest, Builder> {
        private String ruleId; 
        private String instanceId; 
        private String ruleType; 
        private String sceneId; 

        private Builder() {
            super();
        } 

        private Builder(PublishRuleRequest request) {
            super(request);
            this.ruleId = request.ruleId;
            this.instanceId = request.instanceId;
            this.ruleType = request.ruleType;
            this.sceneId = request.sceneId;
        } 

        /**
         * <p>The rule ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>98493A14-D619-4E88-9F8D-108939817F9F</p>
         */
        public Builder ruleId(String ruleId) {
            this.putPathParameter("ruleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-cn-o400whm78004</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The type of the rule. Example: selection and operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>selection</p>
         */
        public Builder ruleType(String ruleType) {
            this.putQueryParameter("ruleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * <p>The scene ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("sceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public PublishRuleRequest build() {
            return new PublishRuleRequest(this);
        } 

    } 

}
