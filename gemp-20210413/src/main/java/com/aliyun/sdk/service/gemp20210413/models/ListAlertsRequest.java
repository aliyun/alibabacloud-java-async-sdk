// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlertsRequest} extends {@link RequestModel}
 *
 * <p>ListAlertsRequest</p>
 */
public class ListAlertsRequest extends Request {
    @Body
    @NameInMap("alertLevel")
    private String alertLevel;

    @Body
    @NameInMap("alertName")
    private String alertName;

    @Body
    @NameInMap("alertSourceName")
    private String alertSourceName;

    @Body
    @NameInMap("endTime")
    private String endTime;

    @Body
    @NameInMap("monitorSourceId")
    private String monitorSourceId;

    @Body
    @NameInMap("pageNumber")
    private Long pageNumber;

    @Body
    @NameInMap("pageSize")
    private Long pageSize;

    @Body
    @NameInMap("relatedServiceId")
    private Long relatedServiceId;

    @Body
    @NameInMap("ruleName")
    private String ruleName;

    @Body
    @NameInMap("startTime")
    private String startTime;

    private ListAlertsRequest(Builder builder) {
        super(builder);
        this.alertLevel = builder.alertLevel;
        this.alertName = builder.alertName;
        this.alertSourceName = builder.alertSourceName;
        this.endTime = builder.endTime;
        this.monitorSourceId = builder.monitorSourceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.relatedServiceId = builder.relatedServiceId;
        this.ruleName = builder.ruleName;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlertsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertLevel
     */
    public String getAlertLevel() {
        return this.alertLevel;
    }

    /**
     * @return alertName
     */
    public String getAlertName() {
        return this.alertName;
    }

    /**
     * @return alertSourceName
     */
    public String getAlertSourceName() {
        return this.alertSourceName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return monitorSourceId
     */
    public String getMonitorSourceId() {
        return this.monitorSourceId;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return relatedServiceId
     */
    public Long getRelatedServiceId() {
        return this.relatedServiceId;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListAlertsRequest, Builder> {
        private String alertLevel; 
        private String alertName; 
        private String alertSourceName; 
        private String endTime; 
        private String monitorSourceId; 
        private Long pageNumber; 
        private Long pageSize; 
        private Long relatedServiceId; 
        private String ruleName; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListAlertsRequest request) {
            super(request);
            this.alertLevel = request.alertLevel;
            this.alertName = request.alertName;
            this.alertSourceName = request.alertSourceName;
            this.endTime = request.endTime;
            this.monitorSourceId = request.monitorSourceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.relatedServiceId = request.relatedServiceId;
            this.ruleName = request.ruleName;
            this.startTime = request.startTime;
        } 

        /**
         * alertLevel.
         */
        public Builder alertLevel(String alertLevel) {
            this.putBodyParameter("alertLevel", alertLevel);
            this.alertLevel = alertLevel;
            return this;
        }

        /**
         * alertName.
         */
        public Builder alertName(String alertName) {
            this.putBodyParameter("alertName", alertName);
            this.alertName = alertName;
            return this;
        }

        /**
         * alertSourceName.
         */
        public Builder alertSourceName(String alertSourceName) {
            this.putBodyParameter("alertSourceName", alertSourceName);
            this.alertSourceName = alertSourceName;
            return this;
        }

        /**
         * 2020-09-10 21:00:00
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * monitorSourceId.
         */
        public Builder monitorSourceId(String monitorSourceId) {
            this.putBodyParameter("monitorSourceId", monitorSourceId);
            this.monitorSourceId = monitorSourceId;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putBodyParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * relatedServiceId.
         */
        public Builder relatedServiceId(Long relatedServiceId) {
            this.putBodyParameter("relatedServiceId", relatedServiceId);
            this.relatedServiceId = relatedServiceId;
            return this;
        }

        /**
         * ruleName.
         */
        public Builder ruleName(String ruleName) {
            this.putBodyParameter("ruleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * 2020-09-10 13:00:00
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListAlertsRequest build() {
            return new ListAlertsRequest(this);
        } 

    } 

}
