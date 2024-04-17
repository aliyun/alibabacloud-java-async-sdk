// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCloudSiemPredefinedRulesRequest} extends {@link RequestModel}
 *
 * <p>ListCloudSiemPredefinedRulesRequest</p>
 */
public class ListCloudSiemPredefinedRulesRequest extends Request {
    @Body
    @NameInMap("AlertType")
    private String alertType;

    @Body
    @NameInMap("AttCk")
    private String attCk;

    @Body
    @NameInMap("CurrentPage")
    @Validation(required = true, minimum = 1)
    private Integer currentPage;

    @Body
    @NameInMap("EndTime")
    private Long endTime;

    @Body
    @NameInMap("EventTransferType")
    private String eventTransferType;

    @Body
    @NameInMap("Id")
    private String id;

    @Body
    @NameInMap("LogSource")
    private String logSource;

    @Body
    @NameInMap("Order")
    private String order;

    @Body
    @NameInMap("OrderField")
    private String orderField;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("RoleFor")
    private Long roleFor;

    @Body
    @NameInMap("RoleType")
    private Integer roleType;

    @Body
    @NameInMap("RuleName")
    private String ruleName;

    @Body
    @NameInMap("RuleType")
    private String ruleType;

    @Body
    @NameInMap("StartTime")
    private Long startTime;

    @Body
    @NameInMap("Status")
    private Integer status;

    @Body
    @NameInMap("ThreatLevel")
    private java.util.List < String > threatLevel;

    private ListCloudSiemPredefinedRulesRequest(Builder builder) {
        super(builder);
        this.alertType = builder.alertType;
        this.attCk = builder.attCk;
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.eventTransferType = builder.eventTransferType;
        this.id = builder.id;
        this.logSource = builder.logSource;
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

    public static ListCloudSiemPredefinedRulesRequest create() {
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
     * @return attCk
     */
    public String getAttCk() {
        return this.attCk;
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
     * @return eventTransferType
     */
    public String getEventTransferType() {
        return this.eventTransferType;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return logSource
     */
    public String getLogSource() {
        return this.logSource;
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

    public static final class Builder extends Request.Builder<ListCloudSiemPredefinedRulesRequest, Builder> {
        private String alertType; 
        private String attCk; 
        private Integer currentPage; 
        private Long endTime; 
        private String eventTransferType; 
        private String id; 
        private String logSource; 
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

        private Builder(ListCloudSiemPredefinedRulesRequest request) {
            super(request);
            this.alertType = request.alertType;
            this.attCk = request.attCk;
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.eventTransferType = request.eventTransferType;
            this.id = request.id;
            this.logSource = request.logSource;
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
         * AttCk.
         */
        public Builder attCk(String attCk) {
            this.putBodyParameter("AttCk", attCk);
            this.attCk = attCk;
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
         * EventTransferType.
         */
        public Builder eventTransferType(String eventTransferType) {
            this.putBodyParameter("EventTransferType", eventTransferType);
            this.eventTransferType = eventTransferType;
            return this;
        }

        /**
         * The ID of the rule.
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * LogSource.
         */
        public Builder logSource(String logSource) {
            this.putBodyParameter("LogSource", logSource);
            this.logSource = logSource;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putBodyParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * OrderField.
         */
        public Builder orderField(String orderField) {
            this.putBodyParameter("OrderField", orderField);
            this.orderField = orderField;
            return this;
        }

        /**
         * The number of entries per page. Maximum value: 100.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:
         * <p>
         * 
         * *   cn-hangzhou: Your assets reside in regions in China.
         * *   ap-southeast-1: Your assets reside in regions outside China.
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

        /**
         * RoleType.
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
         * *   predefine
         * *   customize
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
         * *   0: The rule is in the initial state.
         * *   10: The simulation data is tested.
         * *   15: The business data is being tested.
         * *   20: The business data test ends.
         * *   100: The rule takes effect.
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The risk level. The value is a JSON array. Valid values:
         * <p>
         * 
         * *   serious: high
         * *   suspicious: medium
         * *   remind: low
         */
        public Builder threatLevel(java.util.List < String > threatLevel) {
            this.putBodyParameter("ThreatLevel", threatLevel);
            this.threatLevel = threatLevel;
            return this;
        }

        @Override
        public ListCloudSiemPredefinedRulesRequest build() {
            return new ListCloudSiemPredefinedRulesRequest(this);
        } 

    } 

}
