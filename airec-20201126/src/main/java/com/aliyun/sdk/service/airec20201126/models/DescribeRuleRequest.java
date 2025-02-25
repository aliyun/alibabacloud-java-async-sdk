// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRuleRequest} extends {@link RequestModel}
 *
 * <p>DescribeRuleRequest</p>
 */
public class DescribeRuleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ruleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sceneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneId;

    private DescribeRuleRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.ruleId = builder.ruleId;
        this.ruleType = builder.ruleType;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
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

    public static final class Builder extends Request.Builder<DescribeRuleRequest, Builder> {
        private String instanceId; 
        private String ruleId; 
        private String ruleType; 
        private String sceneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRuleRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.ruleId = request.ruleId;
            this.ruleType = request.ruleType;
            this.sceneId = request.sceneId;
        } 

        /**
         * <p>The ID of the rule.</p>
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
         * <p>The ID of the scene.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder ruleId(String ruleId) {
            this.putPathParameter("ruleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The returned result.</p>
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
         * <p>The type of the rule.</p>
         * <p>Valid values: selection and operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("sceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public DescribeRuleRequest build() {
            return new DescribeRuleRequest(this);
        } 

    } 

}
