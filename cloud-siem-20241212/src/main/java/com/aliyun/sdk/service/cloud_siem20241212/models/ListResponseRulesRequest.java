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
 * {@link ListResponseRulesRequest} extends {@link RequestModel}
 *
 * <p>ListResponseRulesRequest</p>
 */
public class ListResponseRulesRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseActionType")
    private String responseActionType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseRuleName")
    private String responseRuleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseRuleStatus")
    private Integer responseRuleStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseRuleType")
    private String responseRuleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseTriggerType")
    private String responseTriggerType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private Integer roleType;

    private ListResponseRulesRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.responseActionType = builder.responseActionType;
        this.responseRuleName = builder.responseRuleName;
        this.responseRuleStatus = builder.responseRuleStatus;
        this.responseRuleType = builder.responseRuleType;
        this.responseTriggerType = builder.responseTriggerType;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResponseRulesRequest create() {
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return responseActionType
     */
    public String getResponseActionType() {
        return this.responseActionType;
    }

    /**
     * @return responseRuleName
     */
    public String getResponseRuleName() {
        return this.responseRuleName;
    }

    /**
     * @return responseRuleStatus
     */
    public Integer getResponseRuleStatus() {
        return this.responseRuleStatus;
    }

    /**
     * @return responseRuleType
     */
    public String getResponseRuleType() {
        return this.responseRuleType;
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

    public static final class Builder extends Request.Builder<ListResponseRulesRequest, Builder> {
        private String lang; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String responseActionType; 
        private String responseRuleName; 
        private Integer responseRuleStatus; 
        private String responseRuleType; 
        private String responseTriggerType; 
        private Long roleFor; 
        private Integer roleType; 

        private Builder() {
            super();
        } 

        private Builder(ListResponseRulesRequest request) {
            super(request);
            this.lang = request.lang;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.responseActionType = request.responseActionType;
            this.responseRuleName = request.responseRuleName;
            this.responseRuleStatus = request.responseRuleStatus;
            this.responseRuleType = request.responseRuleType;
            this.responseTriggerType = request.responseTriggerType;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
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
         * <p>The pagination token that marks the current reading position. Leave this parameter empty to read from the beginning.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAASLVeIxed4466E0LVmGkzwS6hJKd9DGVGMDRM6Lu****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region where the threat analysis data management center resides. Select the management center based on the region of your assets. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Your assets belong to the Chinese mainland or Hong Kong (China).</li>
         * <li>ap-southeast-1: Your assets belong to regions outside China.</li>
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
         * <p>The action type of the automatic response rule. Valid values:</p>
         * <ul>
         * <li>doPlaybook: execute a playbook</li>
         * <li>changeEventStatus: update event status</li>
         * <li>changeThreatLevel: update event threat level</li>
         * <li>addEventTag: add an event label</li>
         * <li>deleteEventTag: delete an event label</li>
         * <li>alertWhitelist: add alert to whitelist</li>
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
         * <p>The status of the automatic response rule. Valid values:</p>
         * <ul>
         * <li>0: disabled</li>
         * <li>100: enabled</li>
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
         * <p>The type of the response rule. Valid values:</p>
         * <ul>
         * <li>preset: predefined</li>
         * <li>custom: custom</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder responseRuleType(String responseRuleType) {
            this.putBodyParameter("ResponseRuleType", responseRuleType);
            this.responseRuleType = responseRuleType;
            return this;
        }

        /**
         * <p>The trigger type of the automatic response rule. Valid values:</p>
         * <ul>
         * <li>event: event occurred</li>
         * <li>event_update: event updated</li>
         * <li>alert: alert occurred</li>
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
         * <p>The user ID that the administrator switches to when viewing from another member\&quot;s perspective.</p>
         * 
         * <strong>example:</strong>
         * <p>173326*******</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * <p>The view type. Valid values:</p>
         * <ul>
         * <li>0: the current Alibaba Cloud account view.</li>
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
        public ListResponseRulesRequest build() {
            return new ListResponseRulesRequest(this);
        } 

    } 

}
