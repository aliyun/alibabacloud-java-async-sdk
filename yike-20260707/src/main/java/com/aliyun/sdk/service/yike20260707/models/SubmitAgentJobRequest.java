// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link SubmitAgentJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitAgentJobRequest</p>
 */
public class SubmitAgentJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotifyUrl")
    private String notifyUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Prompt")
    @com.aliyun.core.annotation.Validation(required = true)
    private String prompt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Skill")
    private String skill;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private SubmitAgentJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.model = builder.model;
        this.notifyUrl = builder.notifyUrl;
        this.prompt = builder.prompt;
        this.skill = builder.skill;
        this.userData = builder.userData;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAgentJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return notifyUrl
     */
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return skill
     */
    public String getSkill() {
        return this.skill;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<SubmitAgentJobRequest, Builder> {
        private String regionId; 
        private String model; 
        private String notifyUrl; 
        private String prompt; 
        private String skill; 
        private String userData; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitAgentJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.model = request.model;
            this.notifyUrl = request.notifyUrl;
            this.prompt = request.prompt;
            this.skill = request.skill;
            this.userData = request.userData;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The large language model (LLM) used to execute the agent task.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3.7-plus</p>
         */
        public Builder model(String model) {
            this.putQueryParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>The callback URL. Currently, only HTTP and HTTPS addresses are supported.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://api.ai-x.vip/callback">https://api.ai-x.vip/callback</a></p>
         */
        public Builder notifyUrl(String notifyUrl) {
            this.putQueryParameter("NotifyUrl", notifyUrl);
            this.notifyUrl = notifyUrl;
            return this;
        }

        /**
         * <p>The prompt. Defined by the business as needed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Compare the battle records of Yue Jin and Guan Yu in real history to determine who was stronger</p>
         */
        public Builder prompt(String prompt) {
            this.putQueryParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * <p>The skill identifier, provided by the skill provider.</p>
         * 
         * <strong>example:</strong>
         * <p>wf://xxx</p>
         */
        public Builder skill(String skill) {
            this.putQueryParameter("Skill", skill);
            this.skill = skill;
            return this;
        }

        /**
         * <p>The custom user data. This value is returned as-is in the callback.</p>
         * 
         * <strong>example:</strong>
         * <p>{“x”: 1}</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws_1151222932383236</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public SubmitAgentJobRequest build() {
            return new SubmitAgentJobRequest(this);
        } 

    } 

}
