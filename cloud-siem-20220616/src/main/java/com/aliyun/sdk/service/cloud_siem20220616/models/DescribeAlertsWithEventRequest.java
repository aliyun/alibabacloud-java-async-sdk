// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertsWithEventRequest} extends {@link RequestModel}
 *
 * <p>DescribeAlertsWithEventRequest</p>
 */
public class DescribeAlertsWithEventRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertTitle")
    private String alertTitle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncidentUuid")
    private String incidentUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsDefend")
    private String isDefend;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Level")
    private java.util.List < String > level;

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
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubUserId")
    private Long subUserId;

    private DescribeAlertsWithEventRequest(Builder builder) {
        super(builder);
        this.alertTitle = builder.alertTitle;
        this.currentPage = builder.currentPage;
        this.incidentUuid = builder.incidentUuid;
        this.isDefend = builder.isDefend;
        this.level = builder.level;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
        this.source = builder.source;
        this.subUserId = builder.subUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertsWithEventRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertTitle
     */
    public String getAlertTitle() {
        return this.alertTitle;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return incidentUuid
     */
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    /**
     * @return isDefend
     */
    public String getIsDefend() {
        return this.isDefend;
    }

    /**
     * @return level
     */
    public java.util.List < String > getLevel() {
        return this.level;
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
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return subUserId
     */
    public Long getSubUserId() {
        return this.subUserId;
    }

    public static final class Builder extends Request.Builder<DescribeAlertsWithEventRequest, Builder> {
        private String alertTitle; 
        private Integer currentPage; 
        private String incidentUuid; 
        private String isDefend; 
        private java.util.List < String > level; 
        private Integer pageSize; 
        private String regionId; 
        private Long roleFor; 
        private Integer roleType; 
        private String source; 
        private Long subUserId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAlertsWithEventRequest request) {
            super(request);
            this.alertTitle = request.alertTitle;
            this.currentPage = request.currentPage;
            this.incidentUuid = request.incidentUuid;
            this.isDefend = request.isDefend;
            this.level = request.level;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
            this.source = request.source;
            this.subUserId = request.subUserId;
        } 

        /**
         * The title of the alert.
         */
        public Builder alertTitle(String alertTitle) {
            this.putBodyParameter("AlertTitle", alertTitle);
            this.alertTitle = alertTitle;
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
         * The ID of the event.
         */
        public Builder incidentUuid(String incidentUuid) {
            this.putBodyParameter("IncidentUuid", incidentUuid);
            this.incidentUuid = incidentUuid;
            return this;
        }

        /**
         * Specifies whether an attack is defended. Valid values:
         * <p>
         * 
         * *   0: detected
         * *   1: blocked
         */
        public Builder isDefend(String isDefend) {
            this.putBodyParameter("IsDefend", isDefend);
            this.isDefend = isDefend;
            return this;
        }

        /**
         * The risk levels. The value is a JSON array. Valid values:
         * <p>
         * 
         * *   serious: high
         * *   suspicious: medium
         * *   remind: low
         */
        public Builder level(java.util.List < String > level) {
            this.putBodyParameter("Level", level);
            this.level = level;
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
         * The ID of the member in the resource directory.
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * The type of the view.
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
         * The data source of the alert.
         */
        public Builder source(String source) {
            this.putBodyParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * The ID of the account within which the alert is generated.
         */
        public Builder subUserId(Long subUserId) {
            this.putBodyParameter("SubUserId", subUserId);
            this.subUserId = subUserId;
            return this;
        }

        @Override
        public DescribeAlertsWithEventRequest build() {
            return new DescribeAlertsWithEventRequest(this);
        } 

    } 

}
