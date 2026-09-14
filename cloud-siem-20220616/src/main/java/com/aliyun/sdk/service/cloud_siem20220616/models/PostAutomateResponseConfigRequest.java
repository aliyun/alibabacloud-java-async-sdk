// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link PostAutomateResponseConfigRequest} extends {@link RequestModel}
 *
 * <p>PostAutomateResponseConfigRequest</p>
 */
public class PostAutomateResponseConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ActionConfig")
    private String actionConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ActionType")
    private String actionType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoResponseType")
    private String autoResponseType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExecutionCondition")
    private String executionCondition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private Integer roleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubUserId")
    private Long subUserId;

    private PostAutomateResponseConfigRequest(Builder builder) {
        super(builder);
        this.actionConfig = builder.actionConfig;
        this.actionType = builder.actionType;
        this.autoResponseType = builder.autoResponseType;
        this.executionCondition = builder.executionCondition;
        this.id = builder.id;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
        this.ruleName = builder.ruleName;
        this.subUserId = builder.subUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PostAutomateResponseConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionConfig
     */
    public String getActionConfig() {
        return this.actionConfig;
    }

    /**
     * @return actionType
     */
    public String getActionType() {
        return this.actionType;
    }

    /**
     * @return autoResponseType
     */
    public String getAutoResponseType() {
        return this.autoResponseType;
    }

    /**
     * @return executionCondition
     */
    public String getExecutionCondition() {
        return this.executionCondition;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return roleType
     */
    public Integer getRoleType() {
        return this.roleType;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return subUserId
     */
    public Long getSubUserId() {
        return this.subUserId;
    }

    public static final class Builder extends Request.Builder<PostAutomateResponseConfigRequest, Builder> {
        private String actionConfig; 
        private String actionType; 
        private String autoResponseType; 
        private String executionCondition; 
        private Long id; 
        private String regionId; 
        private Long roleFor; 
        private Integer roleType; 
        private String ruleName; 
        private Long subUserId; 

        private Builder() {
            super();
        } 

        private Builder(PostAutomateResponseConfigRequest request) {
            super(request);
            this.actionConfig = request.actionConfig;
            this.actionType = request.actionType;
            this.autoResponseType = request.autoResponseType;
            this.executionCondition = request.executionCondition;
            this.id = request.id;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
            this.ruleName = request.ruleName;
            this.subUserId = request.subUserId;
        } 

        /**
         * <p>The configuration of the action that is specified in the automated response rule. The value is a JSON array.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *       {
         *             &quot;actionType&quot;: &quot;doPlaybook&quot;,
         *             &quot;playbookName&quot;: &quot;WafBlockIP&quot;,
         *             &quot;playbookUuid&quot;: &quot;bdad6220-6584-41b2-9704-fc6584568758&quot;
         *       }
         * ]</p>
         */
        public Builder actionConfig(String actionConfig) {
            this.putBodyParameter("ActionConfig", actionConfig);
            this.actionConfig = actionConfig;
            return this;
        }

        /**
         * <p>The type of the action. Separate multiple values with commas. Valid values:</p>
         * <ul>
         * <li><p><strong>doPlaybook</strong>: runs a playbook</p>
         * </li>
         * <li><p><strong>changeEventStatus</strong>: changes the status of the event</p>
         * </li>
         * <li><p><strong>changeThreatLevel</strong>: changes the threat level of the event</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>doPlaybook,changeEventStatus</p>
         */
        public Builder actionType(String actionType) {
            this.putBodyParameter("ActionType", actionType);
            this.actionType = actionType;
            return this;
        }

        /**
         * <p>The type of the automated response. Valid values:</p>
         * <ul>
         * <li><p><strong>event</strong>: event</p>
         * </li>
         * <li><p><strong>alert</strong>: alert</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>event</p>
         */
        public Builder autoResponseType(String autoResponseType) {
            this.putBodyParameter("AutoResponseType", autoResponseType);
            this.autoResponseType = autoResponseType;
            return this;
        }

        /**
         * <p>The trigger condition of the automated response rule. The value is in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;left&quot;:{&quot;value&quot;:&quot;alert_name&quot;},&quot;operator&quot;:&quot;containsString&quot;,&quot;right&quot;:{&quot;value&quot;:&quot;webshell_online&quot;}}]</p>
         */
        public Builder executionCondition(String executionCondition) {
            this.putBodyParameter("ExecutionCondition", executionCondition);
            this.executionCondition = executionCondition;
            return this;
        }

        /**
         * <p>The ID of the automated response rule.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The region where the Data Management center of Threat Analysis is located. Select a region based on the location of your assets. Valid values:</p>
         * <ul>
         * <li><p><strong>cn-hangzhou</strong>: your assets are in the Chinese mainland or China (Hong Kong).</p>
         * </li>
         * <li><p><strong>ap-southeast-1</strong>: your assets are outside China.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the user that the administrator uses to switch the view. This parameter is used when an administrator switches to the perspective of a member.</p>
         * 
         * <strong>example:</strong>
         * <p>113091674488****</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * <p>The view type.</p>
         * <ul>
         * <li><p>0: the view of the current Alibaba Cloud account.</p>
         * </li>
         * <li><p>1: the view of all accounts that are managed by the administrator.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder roleType(Integer roleType) {
            this.putBodyParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        /**
         * <p>The name of the automated response rule.</p>
         * 
         * <strong>example:</strong>
         * <p>cfw kill quara book</p>
         */
        public Builder ruleName(String ruleName) {
            this.putBodyParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The ID of the user who created the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>17108579417****</p>
         */
        public Builder subUserId(Long subUserId) {
            this.putBodyParameter("SubUserId", subUserId);
            this.subUserId = subUserId;
            return this;
        }

        @Override
        public PostAutomateResponseConfigRequest build() {
            return new PostAutomateResponseConfigRequest(this);
        } 

    } 

}
