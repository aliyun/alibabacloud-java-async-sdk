// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link IncidentForView} extends {@link TeaModel}
 *
 * <p>IncidentForView</p>
 */
public class IncidentForView extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("escalations")
    private java.util.List<IncidentEscalationPolicyForView> escalations;

    @com.aliyun.core.annotation.NameInMap("groupUuid")
    private String groupUuid;

    @com.aliyun.core.annotation.NameInMap("groupingKeys")
    private java.util.Map<String, String> groupingKeys;

    @com.aliyun.core.annotation.NameInMap("incidentId")
    private String incidentId;

    @com.aliyun.core.annotation.NameInMap("notifyStrategyName")
    private String notifyStrategyName;

    @com.aliyun.core.annotation.NameInMap("notifyStrategyUuid")
    private String notifyStrategyUuid;

    @com.aliyun.core.annotation.NameInMap("operator")
    private ContactForIncidentView operator;

    @com.aliyun.core.annotation.NameInMap("owners")
    private java.util.List<ContactForIncidentView> owners;

    @com.aliyun.core.annotation.NameInMap("participants")
    private java.util.List<ContactForIncidentView> participants;

    @com.aliyun.core.annotation.NameInMap("plan")
    private IncidentResponsePlanForView plan;

    @com.aliyun.core.annotation.NameInMap("relatedResources")
    private java.util.List<EventResourceForIncidentView> relatedResources;

    @com.aliyun.core.annotation.NameInMap("rootCauseCategory")
    private String rootCauseCategory;

    @com.aliyun.core.annotation.NameInMap("severity")
    private String severity;

    @com.aliyun.core.annotation.NameInMap("solution")
    private String solution;

    @com.aliyun.core.annotation.NameInMap("state")
    private String state;

    @com.aliyun.core.annotation.NameInMap("subscriptionName")
    private String subscriptionName;

    @com.aliyun.core.annotation.NameInMap("subscriptionUuid")
    private String subscriptionUuid;

    @com.aliyun.core.annotation.NameInMap("time")
    private Long time;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private IncidentForView(Builder builder) {
        this.content = builder.content;
        this.escalations = builder.escalations;
        this.groupUuid = builder.groupUuid;
        this.groupingKeys = builder.groupingKeys;
        this.incidentId = builder.incidentId;
        this.notifyStrategyName = builder.notifyStrategyName;
        this.notifyStrategyUuid = builder.notifyStrategyUuid;
        this.operator = builder.operator;
        this.owners = builder.owners;
        this.participants = builder.participants;
        this.plan = builder.plan;
        this.relatedResources = builder.relatedResources;
        this.rootCauseCategory = builder.rootCauseCategory;
        this.severity = builder.severity;
        this.solution = builder.solution;
        this.state = builder.state;
        this.subscriptionName = builder.subscriptionName;
        this.subscriptionUuid = builder.subscriptionUuid;
        this.time = builder.time;
        this.title = builder.title;
        this.userId = builder.userId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IncidentForView create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return escalations
     */
    public java.util.List<IncidentEscalationPolicyForView> getEscalations() {
        return this.escalations;
    }

    /**
     * @return groupUuid
     */
    public String getGroupUuid() {
        return this.groupUuid;
    }

    /**
     * @return groupingKeys
     */
    public java.util.Map<String, String> getGroupingKeys() {
        return this.groupingKeys;
    }

    /**
     * @return incidentId
     */
    public String getIncidentId() {
        return this.incidentId;
    }

    /**
     * @return notifyStrategyName
     */
    public String getNotifyStrategyName() {
        return this.notifyStrategyName;
    }

    /**
     * @return notifyStrategyUuid
     */
    public String getNotifyStrategyUuid() {
        return this.notifyStrategyUuid;
    }

    /**
     * @return operator
     */
    public ContactForIncidentView getOperator() {
        return this.operator;
    }

    /**
     * @return owners
     */
    public java.util.List<ContactForIncidentView> getOwners() {
        return this.owners;
    }

    /**
     * @return participants
     */
    public java.util.List<ContactForIncidentView> getParticipants() {
        return this.participants;
    }

    /**
     * @return plan
     */
    public IncidentResponsePlanForView getPlan() {
        return this.plan;
    }

    /**
     * @return relatedResources
     */
    public java.util.List<EventResourceForIncidentView> getRelatedResources() {
        return this.relatedResources;
    }

    /**
     * @return rootCauseCategory
     */
    public String getRootCauseCategory() {
        return this.rootCauseCategory;
    }

    /**
     * @return severity
     */
    public String getSeverity() {
        return this.severity;
    }

    /**
     * @return solution
     */
    public String getSolution() {
        return this.solution;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return subscriptionName
     */
    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    /**
     * @return subscriptionUuid
     */
    public String getSubscriptionUuid() {
        return this.subscriptionUuid;
    }

    /**
     * @return time
     */
    public Long getTime() {
        return this.time;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private String content; 
        private java.util.List<IncidentEscalationPolicyForView> escalations; 
        private String groupUuid; 
        private java.util.Map<String, String> groupingKeys; 
        private String incidentId; 
        private String notifyStrategyName; 
        private String notifyStrategyUuid; 
        private ContactForIncidentView operator; 
        private java.util.List<ContactForIncidentView> owners; 
        private java.util.List<ContactForIncidentView> participants; 
        private IncidentResponsePlanForView plan; 
        private java.util.List<EventResourceForIncidentView> relatedResources; 
        private String rootCauseCategory; 
        private String severity; 
        private String solution; 
        private String state; 
        private String subscriptionName; 
        private String subscriptionUuid; 
        private Long time; 
        private String title; 
        private String userId; 
        private String workspace; 

        private Builder() {
        } 

        private Builder(IncidentForView model) {
            this.content = model.content;
            this.escalations = model.escalations;
            this.groupUuid = model.groupUuid;
            this.groupingKeys = model.groupingKeys;
            this.incidentId = model.incidentId;
            this.notifyStrategyName = model.notifyStrategyName;
            this.notifyStrategyUuid = model.notifyStrategyUuid;
            this.operator = model.operator;
            this.owners = model.owners;
            this.participants = model.participants;
            this.plan = model.plan;
            this.relatedResources = model.relatedResources;
            this.rootCauseCategory = model.rootCauseCategory;
            this.severity = model.severity;
            this.solution = model.solution;
            this.state = model.state;
            this.subscriptionName = model.subscriptionName;
            this.subscriptionUuid = model.subscriptionUuid;
            this.time = model.time;
            this.title = model.title;
            this.userId = model.userId;
            this.workspace = model.workspace;
        } 

        /**
         * content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * escalations.
         */
        public Builder escalations(java.util.List<IncidentEscalationPolicyForView> escalations) {
            this.escalations = escalations;
            return this;
        }

        /**
         * groupUuid.
         */
        public Builder groupUuid(String groupUuid) {
            this.groupUuid = groupUuid;
            return this;
        }

        /**
         * groupingKeys.
         */
        public Builder groupingKeys(java.util.Map<String, String> groupingKeys) {
            this.groupingKeys = groupingKeys;
            return this;
        }

        /**
         * incidentId.
         */
        public Builder incidentId(String incidentId) {
            this.incidentId = incidentId;
            return this;
        }

        /**
         * notifyStrategyName.
         */
        public Builder notifyStrategyName(String notifyStrategyName) {
            this.notifyStrategyName = notifyStrategyName;
            return this;
        }

        /**
         * notifyStrategyUuid.
         */
        public Builder notifyStrategyUuid(String notifyStrategyUuid) {
            this.notifyStrategyUuid = notifyStrategyUuid;
            return this;
        }

        /**
         * operator.
         */
        public Builder operator(ContactForIncidentView operator) {
            this.operator = operator;
            return this;
        }

        /**
         * owners.
         */
        public Builder owners(java.util.List<ContactForIncidentView> owners) {
            this.owners = owners;
            return this;
        }

        /**
         * participants.
         */
        public Builder participants(java.util.List<ContactForIncidentView> participants) {
            this.participants = participants;
            return this;
        }

        /**
         * plan.
         */
        public Builder plan(IncidentResponsePlanForView plan) {
            this.plan = plan;
            return this;
        }

        /**
         * relatedResources.
         */
        public Builder relatedResources(java.util.List<EventResourceForIncidentView> relatedResources) {
            this.relatedResources = relatedResources;
            return this;
        }

        /**
         * rootCauseCategory.
         */
        public Builder rootCauseCategory(String rootCauseCategory) {
            this.rootCauseCategory = rootCauseCategory;
            return this;
        }

        /**
         * severity.
         */
        public Builder severity(String severity) {
            this.severity = severity;
            return this;
        }

        /**
         * solution.
         */
        public Builder solution(String solution) {
            this.solution = solution;
            return this;
        }

        /**
         * state.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * subscriptionName.
         */
        public Builder subscriptionName(String subscriptionName) {
            this.subscriptionName = subscriptionName;
            return this;
        }

        /**
         * subscriptionUuid.
         */
        public Builder subscriptionUuid(String subscriptionUuid) {
            this.subscriptionUuid = subscriptionUuid;
            return this;
        }

        /**
         * time.
         */
        public Builder time(Long time) {
            this.time = time;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public IncidentForView build() {
            return new IncidentForView(this);
        } 

    } 

}
