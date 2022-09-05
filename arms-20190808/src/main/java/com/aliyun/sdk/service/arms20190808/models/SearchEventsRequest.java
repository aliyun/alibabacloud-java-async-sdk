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
         * AlertId.
         */
        public Builder alertId(Long alertId) {
            this.putQueryParameter("AlertId", alertId);
            this.alertId = alertId;
            return this;
        }

        /**
         * AlertType.
         */
        public Builder alertType(Integer alertType) {
            this.putQueryParameter("AlertType", alertType);
            this.alertType = alertType;
            return this;
        }

        /**
         * AppType.
         */
        public Builder appType(String appType) {
            this.putQueryParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * IsTrigger.
         */
        public Builder isTrigger(Integer isTrigger) {
            this.putQueryParameter("IsTrigger", isTrigger);
            this.isTrigger = isTrigger;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Pid.
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * StartTime.
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
