// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCloudSiemCustomizeRulesRequest} extends {@link RequestModel}
 *
 * <p>ListCloudSiemCustomizeRulesRequest</p>
 */
public class ListCloudSiemCustomizeRulesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertType")
    private String alertType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderField")
    private String orderField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

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
    @com.aliyun.core.annotation.NameInMap("RuleType")
    private String ruleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ThreatLevel")
    private java.util.List < String > threatLevel;

    private ListCloudSiemCustomizeRulesRequest(Builder builder) {
        super(builder);
        this.alertType = builder.alertType;
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.id = builder.id;
        this.order = builder.order;
        this.orderField = builder.orderField;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
        this.ruleName = builder.ruleName;
        this.ruleType = builder.ruleType;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.threatLevel = builder.threatLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudSiemCustomizeRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertType
     */
    public String getAlertType() {
        return this.alertType;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return orderField
     */
    public String getOrderField() {
        return this.orderField;
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
     * @return ruleType
     */
    public String getRuleType() {
        return this.ruleType;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return threatLevel
     */
    public java.util.List < String > getThreatLevel() {
        return this.threatLevel;
    }

    public static final class Builder extends Request.Builder<ListCloudSiemCustomizeRulesRequest, Builder> {
        private String alertType; 
        private Integer currentPage; 
        private Long endTime; 
        private String id; 
        private String order; 
        private String orderField; 
        private Integer pageSize; 
        private String regionId; 
        private Long roleFor; 
        private Integer roleType; 
        private String ruleName; 
        private String ruleType; 
        private Long startTime; 
        private Integer status; 
        private java.util.List < String > threatLevel; 

        private Builder() {
            super();
        } 

        private Builder(ListCloudSiemCustomizeRulesRequest request) {
            super(request);
            this.alertType = request.alertType;
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.id = request.id;
            this.order = request.order;
            this.orderField = request.orderField;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
            this.ruleName = request.ruleName;
            this.ruleType = request.ruleType;
            this.startTime = request.startTime;
            this.status = request.status;
            this.threatLevel = request.threatLevel;
        } 

        /**
         * The alert type.
         */
        public Builder alertType(String alertType) {
            this.putBodyParameter("AlertType", alertType);
            this.alertType = alertType;
            return this;
        }

        /**
         * The page number. Pages start from page 1.
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The end of the time range to query. Unit: milliseconds.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The ID of the custom rule.
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The sort method. Valid values:
         * <p>
         * 
         * *   desc: descending order.
         * *   asc: ascending order.
         */
        public Builder order(String order) {
            this.putBodyParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * The field that is used to sort the rules. Valid values:
         * <p>
         * 
         * *   GmtModified: The rules are sorted based on the modification time.
         * *   Id (default): The rules are sorted based on the rule ID.
         */
        public Builder orderField(String orderField) {
            this.putBodyParameter("OrderField", orderField);
            this.orderField = orderField;
            return this;
        }

        /**
         * The number of entries per page. The value can be up to 100.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The data management center of the threat analysis feature. Specify this parameter based on the regions in which your assets reside. Valid values:
         * <p>
         * 
         * *   **cn-hangzhou**: Your assets reside in regions in China.
         * *   **ap-southeast-1**: Your assets reside in regions outside China.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the destination account to which you switch the view from the management account.
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * The type of the view. Valid values:
         * <p>
         * 
         * *   0: view of the current Alibaba Cloud account.
         * *   1: view of all accounts for the enterprise.
         */
        public Builder roleType(Integer roleType) {
            this.putBodyParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        /**
         * The name of the rule. The name can contain letters, digits, underscores (\_), and periods (.).
         */
        public Builder ruleName(String ruleName) {
            this.putBodyParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * The type of the rule. Valid values:
         * <p>
         * 
         * *   **predefine**
         * *   **customize**
         */
        public Builder ruleType(String ruleType) {
            this.putBodyParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * The beginning of the time range to query. Unit: milliseconds.
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The status of the rule. Valid values:
         * <p>
         * 
         * *   **0**: The rule is in the initial state.
         * *   **10**: The simulation data is tested.
         * *   **15**: The business data is being tested.
         * *   **20**: The business data test is complete.
         * *   **100**: The rule is in effect.
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The threat level. The value must be a JSON array. Valid values:
         * <p>
         * 
         * *   **serious**: high-risk.
         * *   **suspicious**: medium-risk.
         * *   **remind**: low-risk.
         */
        public Builder threatLevel(java.util.List < String > threatLevel) {
            this.putBodyParameter("ThreatLevel", threatLevel);
            this.threatLevel = threatLevel;
            return this;
        }

        @Override
        public ListCloudSiemCustomizeRulesRequest build() {
            return new ListCloudSiemCustomizeRulesRequest(this);
        } 

    } 

}
