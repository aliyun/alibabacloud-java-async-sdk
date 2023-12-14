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
    @NameInMap("CurrentPage")
    @Validation(required = true, minimum = 1)
    private Integer currentPage;

    @Body
    @NameInMap("EndTime")
    private Long endTime;

    @Body
    @NameInMap("Id")
    private String id;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @Body
    @NameInMap("RegionId")
    private String regionId;

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
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.id = builder.id;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
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
        private Integer currentPage; 
        private Long endTime; 
        private String id; 
        private Integer pageSize; 
        private String regionId; 
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
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.id = request.id;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
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
         * The ID of the rule.
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
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
