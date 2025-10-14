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
         * AlertAttCk.
         */
        public Builder alertAttCk(String alertAttCk) {
            this.putBodyParameter("AlertAttCk", alertAttCk);
            this.alertAttCk = alertAttCk;
            return this;
        }

        /**
         * AlertLevel.
         */
        public Builder alertLevel(String alertLevel) {
            this.putBodyParameter("AlertLevel", alertLevel);
            this.alertLevel = alertLevel;
            return this;
        }

        /**
         * AlertTacticId.
         */
        public Builder alertTacticId(String alertTacticId) {
            this.putBodyParameter("AlertTacticId", alertTacticId);
            this.alertTacticId = alertTacticId;
            return this;
        }

        /**
         * AlertType.
         */
        public Builder alertType(String alertType) {
            this.putBodyParameter("AlertType", alertType);
            this.alertType = alertType;
            return this;
        }

        /**
         * DetectionExpressionType.
         */
        public Builder detectionExpressionType(String detectionExpressionType) {
            this.putBodyParameter("DetectionExpressionType", detectionExpressionType);
            this.detectionExpressionType = detectionExpressionType;
            return this;
        }

        /**
         * DetectionRuleId.
         */
        public Builder detectionRuleId(String detectionRuleId) {
            this.putBodyParameter("DetectionRuleId", detectionRuleId);
            this.detectionRuleId = detectionRuleId;
            return this;
        }

        /**
         * DetectionRuleIds.
         */
        public Builder detectionRuleIds(java.util.List<String> detectionRuleIds) {
            String detectionRuleIdsShrink = shrink(detectionRuleIds, "DetectionRuleIds", "simple");
            this.putBodyParameter("DetectionRuleIds", detectionRuleIdsShrink);
            this.detectionRuleIds = detectionRuleIds;
            return this;
        }

        /**
         * DetectionRuleName.
         */
        public Builder detectionRuleName(String detectionRuleName) {
            this.putBodyParameter("DetectionRuleName", detectionRuleName);
            this.detectionRuleName = detectionRuleName;
            return this;
        }

        /**
         * DetectionRuleStatus.
         */
        public Builder detectionRuleStatus(String detectionRuleStatus) {
            this.putBodyParameter("DetectionRuleStatus", detectionRuleStatus);
            this.detectionRuleStatus = detectionRuleStatus;
            return this;
        }

        /**
         * DetectionRuleType.
         */
        public Builder detectionRuleType(String detectionRuleType) {
            this.putBodyParameter("DetectionRuleType", detectionRuleType);
            this.detectionRuleType = detectionRuleType;
            return this;
        }

        /**
         * IncidentAggregationType.
         */
        public Builder incidentAggregationType(String incidentAggregationType) {
            this.putBodyParameter("IncidentAggregationType", incidentAggregationType);
            this.incidentAggregationType = incidentAggregationType;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * LogCategoryId.
         */
        public Builder logCategoryId(String logCategoryId) {
            this.putBodyParameter("LogCategoryId", logCategoryId);
            this.logCategoryId = logCategoryId;
            return this;
        }

        /**
         * LogSchemaId.
         */
        public Builder logSchemaId(String logSchemaId) {
            this.putBodyParameter("LogSchemaId", logSchemaId);
            this.logSchemaId = logSchemaId;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * OrderDirection.
         */
        public Builder orderDirection(String orderDirection) {
            this.putBodyParameter("OrderDirection", orderDirection);
            this.orderDirection = orderDirection;
            return this;
        }

        /**
         * OrderFieldName.
         */
        public Builder orderFieldName(String orderFieldName) {
            this.putBodyParameter("OrderFieldName", orderFieldName);
            this.orderFieldName = orderFieldName;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
         * RoleFor.
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
