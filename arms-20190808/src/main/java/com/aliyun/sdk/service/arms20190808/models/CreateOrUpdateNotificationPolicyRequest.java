// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateNotificationPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateOrUpdateNotificationPolicyRequest</p>
 */
public class CreateOrUpdateNotificationPolicyRequest extends Request {
    @Body
    @NameInMap("EscalationPolicyId")
    private Long escalationPolicyId;

    @Body
    @NameInMap("GroupRule")
    private String groupRule;

    @Body
    @NameInMap("Id")
    private Long id;

    @Body
    @NameInMap("IntegrationId")
    private Long integrationId;

    @Body
    @NameInMap("MatchingRules")
    private String matchingRules;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("NotifyRule")
    @Validation(required = true)
    private String notifyRule;

    @Body
    @NameInMap("NotifyTemplate")
    private String notifyTemplate;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Repeat")
    private Boolean repeat;

    @Body
    @NameInMap("RepeatInterval")
    private Long repeatInterval;

    @Body
    @NameInMap("SendRecoverMessage")
    private Boolean sendRecoverMessage;

    private CreateOrUpdateNotificationPolicyRequest(Builder builder) {
        super(builder);
        this.escalationPolicyId = builder.escalationPolicyId;
        this.groupRule = builder.groupRule;
        this.id = builder.id;
        this.integrationId = builder.integrationId;
        this.matchingRules = builder.matchingRules;
        this.name = builder.name;
        this.notifyRule = builder.notifyRule;
        this.notifyTemplate = builder.notifyTemplate;
        this.regionId = builder.regionId;
        this.repeat = builder.repeat;
        this.repeatInterval = builder.repeatInterval;
        this.sendRecoverMessage = builder.sendRecoverMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateNotificationPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return escalationPolicyId
     */
    public Long getEscalationPolicyId() {
        return this.escalationPolicyId;
    }

    /**
     * @return groupRule
     */
    public String getGroupRule() {
        return this.groupRule;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return integrationId
     */
    public Long getIntegrationId() {
        return this.integrationId;
    }

    /**
     * @return matchingRules
     */
    public String getMatchingRules() {
        return this.matchingRules;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return notifyRule
     */
    public String getNotifyRule() {
        return this.notifyRule;
    }

    /**
     * @return notifyTemplate
     */
    public String getNotifyTemplate() {
        return this.notifyTemplate;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return repeat
     */
    public Boolean getRepeat() {
        return this.repeat;
    }

    /**
     * @return repeatInterval
     */
    public Long getRepeatInterval() {
        return this.repeatInterval;
    }

    /**
     * @return sendRecoverMessage
     */
    public Boolean getSendRecoverMessage() {
        return this.sendRecoverMessage;
    }

    public static final class Builder extends Request.Builder<CreateOrUpdateNotificationPolicyRequest, Builder> {
        private Long escalationPolicyId; 
        private String groupRule; 
        private Long id; 
        private Long integrationId; 
        private String matchingRules; 
        private String name; 
        private String notifyRule; 
        private String notifyTemplate; 
        private String regionId; 
        private Boolean repeat; 
        private Long repeatInterval; 
        private Boolean sendRecoverMessage; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrUpdateNotificationPolicyRequest request) {
            super(request);
            this.escalationPolicyId = request.escalationPolicyId;
            this.groupRule = request.groupRule;
            this.id = request.id;
            this.integrationId = request.integrationId;
            this.matchingRules = request.matchingRules;
            this.name = request.name;
            this.notifyRule = request.notifyRule;
            this.notifyTemplate = request.notifyTemplate;
            this.regionId = request.regionId;
            this.repeat = request.repeat;
            this.repeatInterval = request.repeatInterval;
            this.sendRecoverMessage = request.sendRecoverMessage;
        } 

        /**
         * 升级规则ID
         */
        public Builder escalationPolicyId(Long escalationPolicyId) {
            this.putBodyParameter("EscalationPolicyId", escalationPolicyId);
            this.escalationPolicyId = escalationPolicyId;
            return this;
        }

        /**
         * 分组规则
         */
        public Builder groupRule(String groupRule) {
            this.putBodyParameter("GroupRule", groupRule);
            this.groupRule = groupRule;
            return this;
        }

        /**
         * 通知策略ID
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * 集成ID
         */
        public Builder integrationId(Long integrationId) {
            this.putBodyParameter("IntegrationId", integrationId);
            this.integrationId = integrationId;
            return this;
        }

        /**
         * 事件匹配规则列表
         */
        public Builder matchingRules(String matchingRules) {
            this.putBodyParameter("MatchingRules", matchingRules);
            this.matchingRules = matchingRules;
            return this;
        }

        /**
         * 通知策略名称
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * 通知规则,通知对象，必填
         */
        public Builder notifyRule(String notifyRule) {
            this.putBodyParameter("NotifyRule", notifyRule);
            this.notifyRule = notifyRule;
            return this;
        }

        /**
         * 通知模板
         */
        public Builder notifyTemplate(String notifyTemplate) {
            this.putBodyParameter("NotifyTemplate", notifyTemplate);
            this.notifyTemplate = notifyTemplate;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 是否重复通知,不填默认为true，需要必填重复通知时间间隔；false，需要必填升级规则ID
         */
        public Builder repeat(Boolean repeat) {
            this.putBodyParameter("Repeat", repeat);
            this.repeat = repeat;
            return this;
        }

        /**
         * 重复通知时间间隔,单位：s
         */
        public Builder repeatInterval(Long repeatInterval) {
            this.putBodyParameter("RepeatInterval", repeatInterval);
            this.repeatInterval = repeatInterval;
            return this;
        }

        /**
         * 是否发送恢,不填默认为：true复通知
         */
        public Builder sendRecoverMessage(Boolean sendRecoverMessage) {
            this.putBodyParameter("SendRecoverMessage", sendRecoverMessage);
            this.sendRecoverMessage = sendRecoverMessage;
            return this;
        }

        @Override
        public CreateOrUpdateNotificationPolicyRequest build() {
            return new CreateOrUpdateNotificationPolicyRequest(this);
        } 

    } 

}
