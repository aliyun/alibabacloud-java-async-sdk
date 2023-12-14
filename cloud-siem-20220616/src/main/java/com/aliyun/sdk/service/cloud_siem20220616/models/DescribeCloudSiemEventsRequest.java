// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudSiemEventsRequest} extends {@link RequestModel}
 *
 * <p>DescribeCloudSiemEventsRequest</p>
 */
public class DescribeCloudSiemEventsRequest extends Request {
    @Body
    @NameInMap("AssetId")
    private String assetId;

    @Body
    @NameInMap("CurrentPage")
    @Validation(required = true, minimum = 1)
    private Integer currentPage;

    @Body
    @NameInMap("EndTime")
    private Long endTime;

    @Body
    @NameInMap("EventName")
    private String eventName;

    @Body
    @NameInMap("IncidentUuid")
    private String incidentUuid;

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
    @NameInMap("StartTime")
    private Long startTime;

    @Body
    @NameInMap("Status")
    private Integer status;

    @Body
    @NameInMap("ThreadLevel")
    private java.util.List < String > threadLevel;

    private DescribeCloudSiemEventsRequest(Builder builder) {
        super(builder);
        this.assetId = builder.assetId;
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.eventName = builder.eventName;
        this.incidentUuid = builder.incidentUuid;
        this.order = builder.order;
        this.orderField = builder.orderField;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.threadLevel = builder.threadLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudSiemEventsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetId
     */
    public String getAssetId() {
        return this.assetId;
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
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * @return incidentUuid
     */
    public String getIncidentUuid() {
        return this.incidentUuid;
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
     * @return threadLevel
     */
    public java.util.List < String > getThreadLevel() {
        return this.threadLevel;
    }

    public static final class Builder extends Request.Builder<DescribeCloudSiemEventsRequest, Builder> {
        private String assetId; 
        private Integer currentPage; 
        private Long endTime; 
        private String eventName; 
        private String incidentUuid; 
        private String order; 
        private String orderField; 
        private Integer pageSize; 
        private String regionId; 
        private Long startTime; 
        private Integer status; 
        private java.util.List < String > threadLevel; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCloudSiemEventsRequest request) {
            super(request);
            this.assetId = request.assetId;
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.eventName = request.eventName;
            this.incidentUuid = request.incidentUuid;
            this.order = request.order;
            this.orderField = request.orderField;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
            this.status = request.status;
            this.threadLevel = request.threadLevel;
        } 

        /**
         * The ID of the asset that is associated with the event.
         */
        public Builder assetId(String assetId) {
            this.putBodyParameter("AssetId", assetId);
            this.assetId = assetId;
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
         * The name of the event.
         */
        public Builder eventName(String eventName) {
            this.putBodyParameter("EventName", eventName);
            this.eventName = eventName;
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
         * The sort order. Valid values:
         * <p>
         * 
         * *   desc: descending order
         * *   asc: ascending order
         */
        public Builder order(String order) {
            this.putBodyParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * The sort field. Valid values:
         * <p>
         * 
         * *   GmtModified: sorts the events by creation time. This is the default value.
         * *   ThreatScore: sorts the events by risk score.
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
         * The beginning of the time range to query. Unit: milliseconds.
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The status of the event. Valid values:
         * <p>
         * 
         * *   0: unhandled
         * *   1: handling
         * *   5: handling failed
         * *   10: handled
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The risk levels of the events. The value is a JSON array. Valid values:
         * <p>
         * 
         * *   serious: high
         * *   suspicious: medium
         * *   remind: low
         */
        public Builder threadLevel(java.util.List < String > threadLevel) {
            this.putBodyParameter("ThreadLevel", threadLevel);
            this.threadLevel = threadLevel;
            return this;
        }

        @Override
        public DescribeCloudSiemEventsRequest build() {
            return new DescribeCloudSiemEventsRequest(this);
        } 

    } 

}
