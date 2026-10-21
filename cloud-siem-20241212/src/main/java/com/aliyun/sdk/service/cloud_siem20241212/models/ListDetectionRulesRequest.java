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
 * {@link ListDetectionRulesRequest} extends {@link RequestModel}
 *
 * <p>ListDetectionRulesRequest</p>
 */
public class ListDetectionRulesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertAttCk")
    private String alertAttCk;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertLevel")
    private String alertLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertTacticId")
    private String alertTacticId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertType")
    private String alertType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DetectionExpressionType")
    private String detectionExpressionType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DetectionRuleId")
    private String detectionRuleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DetectionRuleIds")
    private java.util.List<String> detectionRuleIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DetectionRuleName")
    private String detectionRuleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DetectionRuleStatus")
    private String detectionRuleStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DetectionRuleType")
    private String detectionRuleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncidentAggregationType")
    private String incidentAggregationType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogCategoryId")
    private String logCategoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogSchemaId")
    private String logSchemaId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderDirection")
    private String orderDirection;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderFieldName")
    private String orderFieldName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    private ListDetectionRulesRequest(Builder builder) {
        super(builder);
        this.alertAttCk = builder.alertAttCk;
        this.alertLevel = builder.alertLevel;
        this.alertTacticId = builder.alertTacticId;
        this.alertType = builder.alertType;
        this.detectionExpressionType = builder.detectionExpressionType;
        this.detectionRuleId = builder.detectionRuleId;
        this.detectionRuleIds = builder.detectionRuleIds;
        this.detectionRuleName = builder.detectionRuleName;
        this.detectionRuleStatus = builder.detectionRuleStatus;
        this.detectionRuleType = builder.detectionRuleType;
        this.incidentAggregationType = builder.incidentAggregationType;
        this.lang = builder.lang;
        this.logCategoryId = builder.logCategoryId;
        this.logSchemaId = builder.logSchemaId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orderDirection = builder.orderDirection;
        this.orderFieldName = builder.orderFieldName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDetectionRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertAttCk
     */
    public String getAlertAttCk() {
        return this.alertAttCk;
    }

    /**
     * @return alertLevel
     */
    public String getAlertLevel() {
        return this.alertLevel;
    }

    /**
     * @return alertTacticId
     */
    public String getAlertTacticId() {
        return this.alertTacticId;
    }

    /**
     * @return alertType
     */
    public String getAlertType() {
        return this.alertType;
    }

    /**
     * @return detectionExpressionType
     */
    public String getDetectionExpressionType() {
        return this.detectionExpressionType;
    }

    /**
     * @return detectionRuleId
     */
    public String getDetectionRuleId() {
        return this.detectionRuleId;
    }

    /**
     * @return detectionRuleIds
     */
    public java.util.List<String> getDetectionRuleIds() {
        return this.detectionRuleIds;
    }

    /**
     * @return detectionRuleName
     */
    public String getDetectionRuleName() {
        return this.detectionRuleName;
    }

    /**
     * @return detectionRuleStatus
     */
    public String getDetectionRuleStatus() {
        return this.detectionRuleStatus;
    }

    /**
     * @return detectionRuleType
     */
    public String getDetectionRuleType() {
        return this.detectionRuleType;
    }

    /**
     * @return incidentAggregationType
     */
    public String getIncidentAggregationType() {
        return this.incidentAggregationType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return logCategoryId
     */
    public String getLogCategoryId() {
        return this.logCategoryId;
    }

    /**
     * @return logSchemaId
     */
    public String getLogSchemaId() {
        return this.logSchemaId;
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
     * @return orderDirection
     */
    public String getOrderDirection() {
        return this.orderDirection;
    }

    /**
     * @return orderFieldName
     */
    public String getOrderFieldName() {
        return this.orderFieldName;
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
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    public static final class Builder extends Request.Builder<ListDetectionRulesRequest, Builder> {
        private String alertAttCk; 
        private String alertLevel; 
        private String alertTacticId; 
        private String alertType; 
        private String detectionExpressionType; 
        private String detectionRuleId; 
        private java.util.List<String> detectionRuleIds; 
        private String detectionRuleName; 
        private String detectionRuleStatus; 
        private String detectionRuleType; 
        private String incidentAggregationType; 
        private String lang; 
        private String logCategoryId; 
        private String logSchemaId; 
        private Integer maxResults; 
        private String nextToken; 
        private String orderDirection; 
        private String orderFieldName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private Long roleFor; 

        private Builder() {
            super();
        } 

        private Builder(ListDetectionRulesRequest request) {
            super(request);
            this.alertAttCk = request.alertAttCk;
            this.alertLevel = request.alertLevel;
            this.alertTacticId = request.alertTacticId;
            this.alertType = request.alertType;
            this.detectionExpressionType = request.detectionExpressionType;
            this.detectionRuleId = request.detectionRuleId;
            this.detectionRuleIds = request.detectionRuleIds;
            this.detectionRuleName = request.detectionRuleName;
            this.detectionRuleStatus = request.detectionRuleStatus;
            this.detectionRuleType = request.detectionRuleType;
            this.incidentAggregationType = request.incidentAggregationType;
            this.lang = request.lang;
            this.logCategoryId = request.logCategoryId;
            this.logSchemaId = request.logSchemaId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orderDirection = request.orderDirection;
            this.orderFieldName = request.orderFieldName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
        } 

        /**
         * <p>The alert ATT&amp;CK technique.</p>
         * 
         * <strong>example:</strong>
         * <p>Discovery</p>
         */
        public Builder alertAttCk(String alertAttCk) {
            this.putBodyParameter("AlertAttCk", alertAttCk);
            this.alertAttCk = alertAttCk;
            return this;
        }

        /**
         * <p>The threat level of the alert. Valid values:</p>
         * <ul>
         * <li>5: Critical.</li>
         * <li>4: High.</li>
         * <li>3: Medium.</li>
         * <li>2: Low.</li>
         * <li>1: Informational.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder alertLevel(String alertLevel) {
            this.putBodyParameter("AlertLevel", alertLevel);
            this.alertLevel = alertLevel;
            return this;
        }

        /**
         * <p>The alert tactic phase.</p>
         * 
         * <strong>example:</strong>
         * <p>TA0042</p>
         */
        public Builder alertTacticId(String alertTacticId) {
            this.putBodyParameter("AlertTacticId", alertTacticId);
            this.alertTacticId = alertTacticId;
            return this;
        }

        /**
         * <p>The Alarm Metric of the alerting rule.</p>
         * 
         * <strong>example:</strong>
         * <p>siem_rule_type_alert_storm</p>
         */
        public Builder alertType(String alertType) {
            this.putBodyParameter("AlertType", alertType);
            this.alertType = alertType;
            return this;
        }

        /**
         * <p>The expression content of the detection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>playbook</p>
         */
        public Builder detectionExpressionType(String detectionExpressionType) {
            this.putBodyParameter("DetectionExpressionType", detectionExpressionType);
            this.detectionExpressionType = detectionExpressionType;
            return this;
        }

        /**
         * <p>The ID of the detection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>dr-ppa85gfw69tgwkys****</p>
         */
        public Builder detectionRuleId(String detectionRuleId) {
            this.putBodyParameter("DetectionRuleId", detectionRuleId);
            this.detectionRuleId = detectionRuleId;
            return this;
        }

        /**
         * <p>The list of detection rule IDs.</p>
         */
        public Builder detectionRuleIds(java.util.List<String> detectionRuleIds) {
            String detectionRuleIdsShrink = shrink(detectionRuleIds, "DetectionRuleIds", "simple");
            this.putBodyParameter("DetectionRuleIds", detectionRuleIdsShrink);
            this.detectionRuleIds = detectionRuleIds;
            return this;
        }

        /**
         * <p>The name of the detection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Detect Discovery Behavior for Local Systems Groups</p>
         */
        public Builder detectionRuleName(String detectionRuleName) {
            this.putBodyParameter("DetectionRuleName", detectionRuleName);
            this.detectionRuleName = detectionRuleName;
            return this;
        }

        /**
         * <p>The status of the detection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        public Builder detectionRuleStatus(String detectionRuleStatus) {
            this.putBodyParameter("DetectionRuleStatus", detectionRuleStatus);
            this.detectionRuleStatus = detectionRuleStatus;
            return this;
        }

        /**
         * <p>The type of the detection rule. Valid values:</p>
         * <ul>
         * <li>preset: preset detection rule.</li>
         * <li>custom: custom detection rule.</li>
         * <li>custom_template: rule template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>preset</p>
         */
        public Builder detectionRuleType(String detectionRuleType) {
            this.putBodyParameter("DetectionRuleType", detectionRuleType);
            this.detectionRuleType = detectionRuleType;
            return this;
        }

        /**
         * <p>The event summaries type. Valid values:</p>
         * <ul>
         * <li>none: No event is generated.</li>
         * <li>graph_compute: Graph computing (supported by predefined rules).</li>
         * <li>expert: Expert rule.</li>
         * <li>passthrough: Alerting pass-through (one-to-one).</li>
         * <li>window: Same-type aggregation (window).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>graph_compute</p>
         */
        public Builder incidentAggregationType(String incidentAggregationType) {
            this.putBodyParameter("IncidentAggregationType", incidentAggregationType);
            this.incidentAggregationType = incidentAggregationType;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * <p>Note: This parameter is required. If you do not specify this parameter, the service returns a 400 error: &quot;The specified Lang can not be empty.&quot; Explicitly pass a language code.</p>
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
         * <p>The ID of the log normalization category.</p>
         * 
         * <strong>example:</strong>
         * <p>NETWORK_CATEGORY</p>
         */
        public Builder logCategoryId(String logCategoryId) {
            this.putBodyParameter("LogCategoryId", logCategoryId);
            this.logCategoryId = logCategoryId;
            return this;
        }

        /**
         * <p>The ID of the log normalization schema.</p>
         * 
         * <strong>example:</strong>
         * <p>API_RISK_ACTIVITY</p>
         */
        public Builder logSchemaId(String logSchemaId) {
            this.putBodyParameter("LogSchemaId", logSchemaId);
            this.logSchemaId = logSchemaId;
            return this;
        }

        /**
         * <p>The maximum number of entries to return in this request.</p>
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
         * <p>The token for the next query.</p>
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
         * <p>The sort order. Valid values:</p>
         * <ul>
         * <li><strong>asc</strong>: Ascending order. This is the default value.</li>
         * <li><strong>desc</strong>: Descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>asc</p>
         */
        public Builder orderDirection(String orderDirection) {
            this.putBodyParameter("OrderDirection", orderDirection);
            this.orderDirection = orderDirection;
            return this;
        }

        /**
         * <p>The field used for sorting. Valid values:</p>
         * <ul>
         * <li>GmtCreate: creation time.</li>
         * <li>GmtModified: update time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GmtModified</p>
         */
        public Builder orderFieldName(String orderFieldName) {
            this.putBodyParameter("OrderFieldName", orderFieldName);
            this.orderFieldName = orderFieldName;
            return this;
        }

        /**
         * <p>The page number of the current page.</p>
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
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region where the threat analysis data management center is located. Specify the management center based on the region of your assets. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: The assets are located in the Chinese mainland.</li>
         * <li>ap-southeast-1: The assets are located outside China.</li>
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
         * <p>The ID of the member to which the administrator switches the view.</p>
         * 
         * <strong>example:</strong>
         * <p>113091674488****</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        @Override
        public ListDetectionRulesRequest build() {
            return new ListDetectionRulesRequest(this);
        } 

    } 

}
