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
         * <p>The details of the incident.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{&quot;description&quot;:&quot;ECS实例CPU过高&quot;,&quot;impact&quot;:&quot;支付服务延迟&quot;}&quot;</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The list of escalation policies.</p>
         */
        public Builder escalations(java.util.List<IncidentEscalationPolicyForView> escalations) {
            this.escalations = escalations;
            return this;
        }

        /**
         * <p>The group identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;group-123456&quot;</p>
         */
        public Builder groupUuid(String groupUuid) {
            this.groupUuid = groupUuid;
            return this;
        }

        /**
         * <p>The key-value pairs for grouping.</p>
         */
        public Builder groupingKeys(java.util.Map<String, String> groupingKeys) {
            this.groupingKeys = groupingKeys;
            return this;
        }

        /**
         * <p>The unique identifier of the incident.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;incident-abc123&quot;</p>
         */
        public Builder incidentId(String incidentId) {
            this.incidentId = incidentId;
            return this;
        }

        /**
         * <p>The name of the notification policy.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;contactId&quot;: &quot;contact-123&quot;, &quot;name&quot;: &quot;张三&quot; }</p>
         */
        public Builder notifyStrategyName(String notifyStrategyName) {
            this.notifyStrategyName = notifyStrategyName;
            return this;
        }

        /**
         * <p>The UUID of the associated notification policy, which is used to trigger notifications.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;notify-strategy-789&quot;</p>
         */
        public Builder notifyStrategyUuid(String notifyStrategyUuid) {
            this.notifyStrategyUuid = notifyStrategyUuid;
            return this;
        }

        /**
         * <p>The information about the operator.</p>
         */
        public Builder operator(ContactForIncidentView operator) {
            this.operator = operator;
            return this;
        }

        /**
         * <p>The list of owners.</p>
         */
        public Builder owners(java.util.List<ContactForIncidentView> owners) {
            this.owners = owners;
            return this;
        }

        /**
         * <p>The list of participants.</p>
         */
        public Builder participants(java.util.List<ContactForIncidentView> participants) {
            this.participants = participants;
            return this;
        }

        /**
         * <p>The response plan.</p>
         */
        public Builder plan(IncidentResponsePlanForView plan) {
            this.plan = plan;
            return this;
        }

        /**
         * <p>The list of associated resources.</p>
         */
        public Builder relatedResources(java.util.List<EventResourceForIncidentView> relatedResources) {
            this.relatedResources = relatedResources;
            return this;
        }

        /**
         * <p>The root cause category.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;Network&quot;</p>
         */
        public Builder rootCauseCategory(String rootCauseCategory) {
            this.rootCauseCategory = rootCauseCategory;
            return this;
        }

        /**
         * <p>The severity level of the incident.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;Critical&quot;</p>
         */
        public Builder severity(String severity) {
            this.severity = severity;
            return this;
        }

        /**
         * <p>The description of the solution.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;重启ECS实例后恢复正常&quot;</p>
         */
        public Builder solution(String solution) {
            this.solution = solution;
            return this;
        }

        /**
         * <p>The current state of the incident.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;Open&quot;</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * <p>The name of the subscription policy.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;P1-Alert-Notification&quot;</p>
         */
        public Builder subscriptionName(String subscriptionName) {
            this.subscriptionName = subscriptionName;
            return this;
        }

        /**
         * <p>The UUID of the subscription policy.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;subscription-abc&quot;</p>
         */
        public Builder subscriptionUuid(String subscriptionUuid) {
            this.subscriptionUuid = subscriptionUuid;
            return this;
        }

        /**
         * <p>The timestamp when the incident was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1743876000000</p>
         */
        public Builder time(Long time) {
            this.time = time;
            return this;
        }

        /**
         * <p>The title of the incident.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;支付服务不可用&quot;</p>
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * <p>The ID of the user who created the incident.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;user-abc123&quot;</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>The name of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;ws-xyz789&quot;</p>
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
