// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchEventsRequest} extends {@link RequestModel}
 *
 * <p>SearchEventsRequest</p>
 */
public class SearchEventsRequest extends Request {
    @Query
    @NameInMap("AlertId")
    private Long alertId;

    @Query
    @NameInMap("AlertType")
    private Integer alertType;

    @Query
    @NameInMap("AppType")
    private String appType;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("IsTrigger")
    private Integer isTrigger;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Pid")
    private String pid;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    private SearchEventsRequest(Builder builder) {
        super(builder);
        this.alertId = builder.alertId;
        this.alertType = builder.alertType;
        this.appType = builder.appType;
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.isTrigger = builder.isTrigger;
        this.pageSize = builder.pageSize;
        this.pid = builder.pid;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchEventsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertId
     */
    public Long getAlertId() {
        return this.alertId;
    }

    /**
     * @return alertType
     */
    public Integer getAlertType() {
        return this.alertType;
    }

    /**
     * @return appType
     */
    public String getAppType() {
        return this.appType;
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
     * @return isTrigger
     */
    public Integer getIsTrigger() {
        return this.isTrigger;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pid
     */
    public String getPid() {
        return this.pid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<SearchEventsRequest, Builder> {
        private Long alertId; 
        private Integer alertType; 
        private String appType; 
        private Integer currentPage; 
        private Long endTime; 
        private Integer isTrigger; 
        private Integer pageSize; 
        private String pid; 
        private String regionId; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(SearchEventsRequest request) {
            super(request);
            this.alertId = request.alertId;
            this.alertType = request.alertType;
            this.appType = request.appType;
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.isTrigger = request.isTrigger;
            this.pageSize = request.pageSize;
            this.pid = request.pid;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
        } 

        /**
         * The ID of the region.
         */
        public Builder alertId(Long alertId) {
            this.putQueryParameter("AlertId", alertId);
            this.alertId = alertId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder alertType(Integer alertType) {
            this.putQueryParameter("AlertType", alertType);
            this.alertType = alertType;
            return this;
        }

        /**
         * The type of the alert rule. This parameter is not returned. Valid values:
         * <p>
         * 
         * *   `1`: custom alert rules to monitor drill-down data sets
         * *   `3`: custom alert rules to monitor tiled data sets
         * *   `4`: alert rules to monitor the frontend, including the default frontend alert rules
         * *   `5`: alert rules to monitor applications, including the default application alert rules
         * *   `6`: the default frontend alert rules
         * *   `7`: the default application alert rules
         * *   `8`: Tracing Analysis alert rules
         * *   `101`: Prometheus alert rules
         */
        public Builder appType(String appType) {
            this.putQueryParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * The ID of the alert rule. You can call the SearchAlertRules operation and view the `Id` parameter in the response. For more information, see [SearchAlertRules](~~175825~~).
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Specifies whether the alert event is triggered. If you do not set this parameter, all alert events are queried. Valid values:
         * <p>
         * 
         * *   `1`: The event is triggered.
         * *   `0`: The event is not triggered.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The timestamp when the event occurred.
         */
        public Builder isTrigger(Integer isTrigger) {
            this.putQueryParameter("IsTrigger", isTrigger);
            this.isTrigger = isTrigger;
            return this;
        }

        /**
         * The information about the alert events.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The type of the application that is associated with the alert rule. Valid values:
         * <p>
         * 
         * *   `TRACE`: application monitoring
         * *   `RETCODE`: frontend monitoring
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * Specifies whether the alert event is triggered. If you do not set this parameter, all alert events are queried. Valid values:
         * <p>
         * 
         * *   `1`: The event is triggered.
         * *   `0`: The event is not triggered.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public SearchEventsRequest build() {
            return new SearchEventsRequest(this);
        } 

    } 

}
