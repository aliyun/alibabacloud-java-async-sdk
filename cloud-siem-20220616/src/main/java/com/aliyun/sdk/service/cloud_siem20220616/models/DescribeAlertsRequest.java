// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAlertsRequest</p>
 */
public class DescribeAlertsRequest extends Request {
    @Body
    @NameInMap("AlertTitle")
    private String alertTitle;

    @Body
    @NameInMap("AlertUuid")
    private String alertUuid;

    @Body
    @NameInMap("CurrentPage")
    @Validation(required = true, minimum = 1)
    private Integer currentPage;

    @Body
    @NameInMap("EndTime")
    private Long endTime;

    @Body
    @NameInMap("IsDefend")
    private String isDefend;

    @Body
    @NameInMap("Level")
    private java.util.List < String > level;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Source")
    private String source;

    @Body
    @NameInMap("StartTime")
    private Long startTime;

    @Body
    @NameInMap("SubUserId")
    private String subUserId;

    private DescribeAlertsRequest(Builder builder) {
        super(builder);
        this.alertTitle = builder.alertTitle;
        this.alertUuid = builder.alertUuid;
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.isDefend = builder.isDefend;
        this.level = builder.level;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.source = builder.source;
        this.startTime = builder.startTime;
        this.subUserId = builder.subUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertsRequest create() {
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
     * @return alertUuid
     */
    public String getAlertUuid() {
        return this.alertUuid;
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
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return subUserId
     */
    public String getSubUserId() {
        return this.subUserId;
    }

    public static final class Builder extends Request.Builder<DescribeAlertsRequest, Builder> {
        private String alertTitle; 
        private String alertUuid; 
        private Integer currentPage; 
        private Long endTime; 
        private String isDefend; 
        private java.util.List < String > level; 
        private Integer pageSize; 
        private String regionId; 
        private String source; 
        private Long startTime; 
        private String subUserId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAlertsRequest request) {
            super(request);
            this.alertTitle = request.alertTitle;
            this.alertUuid = request.alertUuid;
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.isDefend = request.isDefend;
            this.level = request.level;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.source = request.source;
            this.startTime = request.startTime;
            this.subUserId = request.subUserId;
        } 

        /**
         * AlertTitle.
         */
        public Builder alertTitle(String alertTitle) {
            this.putBodyParameter("AlertTitle", alertTitle);
            this.alertTitle = alertTitle;
            return this;
        }

        /**
         * AlertUuid.
         */
        public Builder alertUuid(String alertUuid) {
            this.putBodyParameter("AlertUuid", alertUuid);
            this.alertUuid = alertUuid;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * IsDefend.
         */
        public Builder isDefend(String isDefend) {
            this.putBodyParameter("IsDefend", isDefend);
            this.isDefend = isDefend;
            return this;
        }

        /**
         * Level.
         */
        public Builder level(java.util.List < String > level) {
            this.putBodyParameter("Level", level);
            this.level = level;
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
         * Source.
         */
        public Builder source(String source) {
            this.putBodyParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * SubUserId.
         */
        public Builder subUserId(String subUserId) {
            this.putBodyParameter("SubUserId", subUserId);
            this.subUserId = subUserId;
            return this;
        }

        @Override
        public DescribeAlertsRequest build() {
            return new DescribeAlertsRequest(this);
        } 

    } 

}
