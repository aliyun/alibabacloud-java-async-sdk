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
 * {@link UpdateResponseRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateResponseRuleRequest</p>
 */
public class UpdateResponseRuleRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ResponseRuleId")
    private String responseRuleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseRuleName")
    private String responseRuleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseRulePriority")
    private Integer responseRulePriority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseRuleRemark")
    private String responseRuleRemark;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseRuleStatus")
    private Integer responseRuleStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseTriggerType")
    private String responseTriggerType;

    private UpdateResponseRuleRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.responseActionConfig = builder.responseActionConfig;
        this.responseActionType = builder.responseActionType;
        this.responseExecutionCondition = builder.responseExecutionCondition;
        this.responseRuleId = builder.responseRuleId;
        this.responseRuleName = builder.responseRuleName;
        this.responseRulePriority = builder.responseRulePriority;
        this.responseRuleRemark = builder.responseRuleRemark;
        this.responseRuleStatus = builder.responseRuleStatus;
        this.responseTriggerType = builder.responseTriggerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResponseRuleRequest create() {
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
     * @return responseRuleId
     */
    public String getResponseRuleId() {
        return this.responseRuleId;
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
    public Integer getResponseRulePriority() {
        return this.responseRulePriority;
    }

    /**
     * @return responseRuleRemark
     */
    public String getResponseRuleRemark() {
        return this.responseRuleRemark;
    }

    /**
     * @return responseRuleStatus
     */
    public Integer getResponseRuleStatus() {
        return this.responseRuleStatus;
    }

    /**
     * @return responseTriggerType
     */
    public String getResponseTriggerType() {
        return this.responseTriggerType;
    }

    public static final class Builder extends Request.Builder<UpdateResponseRuleRequest, Builder> {
        private String lang; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String responseActionConfig; 
        private String responseActionType; 
        private String responseExecutionCondition; 
        private String responseRuleId; 
        private String responseRuleName; 
        private Integer responseRulePriority; 
        private String responseRuleRemark; 
        private Integer responseRuleStatus; 
        private String responseTriggerType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateResponseRuleRequest request) {
            super(request);
            this.lang = request.lang;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.responseActionConfig = request.responseActionConfig;
            this.responseActionType = request.responseActionType;
            this.responseExecutionCondition = request.responseExecutionCondition;
            this.responseRuleId = request.responseRuleId;
            this.responseRuleName = request.responseRuleName;
            this.responseRulePriority = request.responseRulePriority;
            this.responseRuleRemark = request.responseRuleRemark;
            this.responseRuleStatus = request.responseRuleStatus;
            this.responseTriggerType = request.responseTriggerType;
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
         * <p>The region where the data management center of Cloud Threat Detection and Response (CTDR) is located. Select the management center region based on the region where your assets reside. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Your assets reside in the Chinese mainland.</li>
         * <li>ap-southeast-1: Your assets reside outside China.</li>
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
         * <p>The action configuration of the automated response rule.</p>
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
         * <p>The action type of the automated response rule. Valid values:</p>
         * <ul>
         * <li>doPlaybook: runs a playbook.</li>
         * <li>changeEventStatus: updates the event status.</li>
         * <li>changeThreatLevel: updates the threat level of an event.</li>
         * <li>addEventTag: adds a label to an event.</li>
         * <li>deleteEventTag: deletes a label from an event.</li>
         * <li>alertWhitelist: adds an alert to the whitelist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>alertWhitelist</p>
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
         * <p>The ID of the automated response rule.</p>
         * 
         * <strong>example:</strong>
         * <p>440918</p>
         */
        public Builder responseRuleId(String responseRuleId) {
            this.putBodyParameter("ResponseRuleId", responseRuleId);
            this.responseRuleId = responseRuleId;
            return this;
        }

        /**
         * <p>The name of the automated response rule.</p>
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
         * <p>The execution priority of the automated response rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder responseRulePriority(Integer responseRulePriority) {
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
         * <p>The status of the automated response rule. Valid values:</p>
         * <ul>
         * <li>0: disabled.</li>
         * <li>100: enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder responseRuleStatus(Integer responseRuleStatus) {
            this.putBodyParameter("ResponseRuleStatus", responseRuleStatus);
            this.responseRuleStatus = responseRuleStatus;
            return this;
        }

        /**
         * <p>The trigger type of the automated response rule. Valid values:</p>
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

        @Override
        public UpdateResponseRuleRequest build() {
            return new UpdateResponseRuleRequest(this);
        } 

    } 

}
