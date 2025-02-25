// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link StartPredictiveCallRequest} extends {@link RequestModel}
 *
 * <p>StartPredictiveCallRequest</p>
 */
public class StartPredictiveCallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Callee")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callee;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Caller")
    @com.aliyun.core.annotation.Validation(required = true)
    private String caller;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactFlowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactFlowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactFlowVariables")
    private String contactFlowVariables;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaskedCallee")
    private String maskedCallee;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillGroupId")
    private String skillGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeoutSeconds")
    @com.aliyun.core.annotation.Validation(maximum = 3600)
    private Integer timeoutSeconds;

    private StartPredictiveCallRequest(Builder builder) {
        super(builder);
        this.callee = builder.callee;
        this.caller = builder.caller;
        this.contactFlowId = builder.contactFlowId;
        this.contactFlowVariables = builder.contactFlowVariables;
        this.instanceId = builder.instanceId;
        this.maskedCallee = builder.maskedCallee;
        this.skillGroupId = builder.skillGroupId;
        this.tags = builder.tags;
        this.timeoutSeconds = builder.timeoutSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartPredictiveCallRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callee
     */
    public String getCallee() {
        return this.callee;
    }

    /**
     * @return caller
     */
    public String getCaller() {
        return this.caller;
    }

    /**
     * @return contactFlowId
     */
    public String getContactFlowId() {
        return this.contactFlowId;
    }

    /**
     * @return contactFlowVariables
     */
    public String getContactFlowVariables() {
        return this.contactFlowVariables;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return maskedCallee
     */
    public String getMaskedCallee() {
        return this.maskedCallee;
    }

    /**
     * @return skillGroupId
     */
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return timeoutSeconds
     */
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public static final class Builder extends Request.Builder<StartPredictiveCallRequest, Builder> {
        private String callee; 
        private String caller; 
        private String contactFlowId; 
        private String contactFlowVariables; 
        private String instanceId; 
        private String maskedCallee; 
        private String skillGroupId; 
        private String tags; 
        private Integer timeoutSeconds; 

        private Builder() {
            super();
        } 

        private Builder(StartPredictiveCallRequest request) {
            super(request);
            this.callee = request.callee;
            this.caller = request.caller;
            this.contactFlowId = request.contactFlowId;
            this.contactFlowVariables = request.contactFlowVariables;
            this.instanceId = request.instanceId;
            this.maskedCallee = request.maskedCallee;
            this.skillGroupId = request.skillGroupId;
            this.tags = request.tags;
            this.timeoutSeconds = request.timeoutSeconds;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1312353****</p>
         */
        public Builder callee(String callee) {
            this.putQueryParameter("Callee", callee);
            this.callee = callee;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0109810****</p>
         */
        public Builder caller(String caller) {
            this.putQueryParameter("Caller", caller);
            this.caller = caller;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9774c36c-12fe-4e37-adce-89bc77ce****</p>
         */
        public Builder contactFlowId(String contactFlowId) {
            this.putQueryParameter("ContactFlowId", contactFlowId);
            this.contactFlowId = contactFlowId;
            return this;
        }

        /**
         * ContactFlowVariables.
         */
        public Builder contactFlowVariables(String contactFlowVariables) {
            this.putQueryParameter("ContactFlowVariables", contactFlowVariables);
            this.contactFlowVariables = contactFlowVariables;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MaskedCallee.
         */
        public Builder maskedCallee(String maskedCallee) {
            this.putQueryParameter("MaskedCallee", maskedCallee);
            this.maskedCallee = maskedCallee;
            return this;
        }

        /**
         * SkillGroupId.
         */
        public Builder skillGroupId(String skillGroupId) {
            this.putQueryParameter("SkillGroupId", skillGroupId);
            this.skillGroupId = skillGroupId;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * TimeoutSeconds.
         */
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            this.putQueryParameter("TimeoutSeconds", timeoutSeconds);
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        @Override
        public StartPredictiveCallRequest build() {
            return new StartPredictiveCallRequest(this);
        } 

    } 

}
