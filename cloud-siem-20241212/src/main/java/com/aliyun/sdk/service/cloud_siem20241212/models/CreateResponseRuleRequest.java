// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link CreateResponseRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateResponseRuleRequest</p>
 */
public class CreateResponseRuleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseActionConfig")
    private String responseActionConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseActionType")
    private String responseActionType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseExecutionCondition")
    private String responseExecutionCondition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseRuleName")
    private String responseRuleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseRulePriority")
    private String responseRulePriority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseRuleRemark")
    private String responseRuleRemark;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseTriggerType")
    private String responseTriggerType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private Integer roleType;

    private CreateResponseRuleRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.responseActionConfig = builder.responseActionConfig;
        this.responseActionType = builder.responseActionType;
        this.responseExecutionCondition = builder.responseExecutionCondition;
        this.responseRuleName = builder.responseRuleName;
        this.responseRulePriority = builder.responseRulePriority;
        this.responseRuleRemark = builder.responseRuleRemark;
        this.responseTriggerType = builder.responseTriggerType;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResponseRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return responseActionConfig
     */
    public String getResponseActionConfig() {
        return this.responseActionConfig;
    }

    /**
     * @return responseActionType
     */
    public String getResponseActionType() {
        return this.responseActionType;
    }

    /**
     * @return responseExecutionCondition
     */
    public String getResponseExecutionCondition() {
        return this.responseExecutionCondition;
    }

    /**
     * @return responseRuleName
     */
    public String getResponseRuleName() {
        return this.responseRuleName;
    }

    /**
     * @return responseRulePriority
     */
    public String getResponseRulePriority() {
        return this.responseRulePriority;
    }

    /**
     * @return responseRuleRemark
     */
    public String getResponseRuleRemark() {
        return this.responseRuleRemark;
    }

    /**
     * @return responseTriggerType
     */
    public String getResponseTriggerType() {
        return this.responseTriggerType;
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

    public static final class Builder extends Request.Builder<CreateResponseRuleRequest, Builder> {
        private String lang; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String responseActionConfig; 
        private String responseActionType; 
        private String responseExecutionCondition; 
        private String responseRuleName; 
        private String responseRulePriority; 
        private String responseRuleRemark; 
        private String responseTriggerType; 
        private Long roleFor; 
        private Integer roleType; 

        private Builder() {
            super();
        } 

        private Builder(CreateResponseRuleRequest request) {
            super(request);
            this.lang = request.lang;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.responseActionConfig = request.responseActionConfig;
            this.responseActionType = request.responseActionType;
            this.responseExecutionCondition = request.responseExecutionCondition;
            this.responseRuleName = request.responseRuleName;
            this.responseRulePriority = request.responseRulePriority;
            this.responseRuleRemark = request.responseRuleRemark;
            this.responseTriggerType = request.responseTriggerType;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
        } 

        /**
         * <p>The language of the response messages. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The maximum number of data records to read in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that marks the start position of the current read. Leave this parameter empty to start from the beginning.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The region where the data management center for Cloud Threat Detection and Response (CTDR) is located. Select the management center region based on the region where your assets reside. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Assets are located in the Chinese mainland or Hong Kong (China).</li>
         * <li>ap-southeast-1: Assets are located in regions outside China.</li>
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
         * <p>The action configuration of the automatic response rule.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;actionType&quot;:&quot;doPlaybook&quot;,&quot;playbookName&quot;:&quot;block waf IP&quot;,&quot;playbookUuid&quot;:&quot;system_aliyun_waf_whole_process_book&quot;,&quot;disposeParam&quot;:{&quot;period&quot;:&quot;7d&quot;}}]</p>
         */
        public Builder responseActionConfig(String responseActionConfig) {
            this.putBodyParameter("ResponseActionConfig", responseActionConfig);
            this.responseActionConfig = responseActionConfig;
            return this;
        }

        /**
         * <p>The action type of the automatic response rule. Valid values:</p>
         * <ul>
         * <li>doPlaybook: runs a playbook.</li>
         * <li>changeEventStatus: updates the event status.</li>
         * <li>changeThreatLevel: updates the threat level of an event.</li>
         * <li>addEventTag: adds a tag to an event.</li>
         * <li>deleteEventTag: deletes a tag from an event.</li>
         * <li>alertWhitelist: adds an alert to the whitelist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>doPlaybook</p>
         */
        public Builder responseActionType(String responseActionType) {
            this.putBodyParameter("ResponseActionType", responseActionType);
            this.responseActionType = responseActionType;
            return this;
        }

        /**
         * <p>The trigger condition configuration of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;left&quot;:{&quot;value&quot;:&quot;threat_level&quot;},&quot;operator&quot;:&quot;equals&quot;,&quot;right&quot;:{&quot;value&quot;:&quot;suspicious&quot;}}]</p>
         */
        public Builder responseExecutionCondition(String responseExecutionCondition) {
            this.putBodyParameter("ResponseExecutionCondition", responseExecutionCondition);
            this.responseExecutionCondition = responseExecutionCondition;
            return this;
        }

        /**
         * <p>The name of the automatic response rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Send Notification When Generating Urgent Incident</p>
         */
        public Builder responseRuleName(String responseRuleName) {
            this.putBodyParameter("ResponseRuleName", responseRuleName);
            this.responseRuleName = responseRuleName;
            return this;
        }

        /**
         * <p>The execution priority of the automatic response rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder responseRulePriority(String responseRulePriority) {
            this.putBodyParameter("ResponseRulePriority", responseRulePriority);
            this.responseRulePriority = responseRulePriority;
            return this;
        }

        /**
         * <p>The remarks for the response rule.</p>
         */
        public Builder responseRuleRemark(String responseRuleRemark) {
            this.putBodyParameter("ResponseRuleRemark", responseRuleRemark);
            this.responseRuleRemark = responseRuleRemark;
            return this;
        }

        /**
         * <p>The trigger type of the automatic response rule. Valid values:</p>
         * <ul>
         * <li>event: an event occurs.</li>
         * <li>event_update: an event is updated.</li>
         * <li>alert: an alert occurs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>event</p>
         */
        public Builder responseTriggerType(String responseTriggerType) {
            this.putBodyParameter("ResponseTriggerType", responseTriggerType);
            this.responseTriggerType = responseTriggerType;
            return this;
        }

        /**
         * <p>The user ID that the administrator uses to switch to the view of another member account.</p>
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
         * <p>The view type. Valid values:</p>
         * <ul>
         * <li>0: the view of the current Alibaba Cloud account.</li>
         * <li>1: the view of all accounts in the enterprise.</li>
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

        @Override
        public CreateResponseRuleRequest build() {
            return new CreateResponseRuleRequest(this);
        } 

    } 

}
