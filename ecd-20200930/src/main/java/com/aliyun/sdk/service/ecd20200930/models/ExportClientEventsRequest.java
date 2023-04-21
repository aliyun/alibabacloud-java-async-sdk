// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportClientEventsRequest} extends {@link RequestModel}
 *
 * <p>ExportClientEventsRequest</p>
 */
public class ExportClientEventsRequest extends Request {
    @Query
    @NameInMap("DesktopId")
    private String desktopId;

    @Query
    @NameInMap("DesktopName")
    private String desktopName;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("EndUserId")
    private String endUserId;

    @Query
    @NameInMap("EventType")
    private String eventType;

    @Query
    @NameInMap("EventTypes")
    private java.util.List < String > eventTypes;

    @Query
    @NameInMap("LangType")
    private String langType;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("OfficeSiteId")
    private String officeSiteId;

    @Query
    @NameInMap("OfficeSiteName")
    private String officeSiteName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    private ExportClientEventsRequest(Builder builder) {
        super(builder);
        this.desktopId = builder.desktopId;
        this.desktopName = builder.desktopName;
        this.endTime = builder.endTime;
        this.endUserId = builder.endUserId;
        this.eventType = builder.eventType;
        this.eventTypes = builder.eventTypes;
        this.langType = builder.langType;
        this.maxResults = builder.maxResults;
        this.officeSiteId = builder.officeSiteId;
        this.officeSiteName = builder.officeSiteName;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportClientEventsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopId
     */
    public String getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return desktopName
     */
    public String getDesktopName() {
        return this.desktopName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * @return eventTypes
     */
    public java.util.List < String > getEventTypes() {
        return this.eventTypes;
    }

    /**
     * @return langType
     */
    public String getLangType() {
        return this.langType;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return officeSiteName
     */
    public String getOfficeSiteName() {
        return this.officeSiteName;
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
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ExportClientEventsRequest, Builder> {
        private String desktopId; 
        private String desktopName; 
        private String endTime; 
        private String endUserId; 
        private String eventType; 
        private java.util.List < String > eventTypes; 
        private String langType; 
        private Integer maxResults; 
        private String officeSiteId; 
        private String officeSiteName; 
        private String regionId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(ExportClientEventsRequest request) {
            super(request);
            this.desktopId = request.desktopId;
            this.desktopName = request.desktopName;
            this.endTime = request.endTime;
            this.endUserId = request.endUserId;
            this.eventType = request.eventType;
            this.eventTypes = request.eventTypes;
            this.langType = request.langType;
            this.maxResults = request.maxResults;
            this.officeSiteId = request.officeSiteId;
            this.officeSiteName = request.officeSiteName;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
        } 

        /**
         * The ID of the cloud desktop.
         */
        public Builder desktopId(String desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * The name of the cloud desktop.
         */
        public Builder desktopName(String desktopName) {
            this.putQueryParameter("DesktopName", desktopName);
            this.desktopName = desktopName;
            return this;
        }

        /**
         * The end of the time range to query. Specify the time in the [ISO 8601](~~25696~~) standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.\
         * <p>
         * If you leave this parameter empty, the current time is used.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The ID of the end user.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * The type of the event that you want to query. If you specify a value for the EventTypes parameter, the combination of event types that you want to query is considered the filter condition for the query. If you do not specify a value for the EventTypes parameter and the EventType parameter is left empty, all events are queried.
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * The combination of event types that you want to query. You can combine multiple event types. The query result contains all the combined events.
         */
        public Builder eventTypes(java.util.List < String > eventTypes) {
            this.putQueryParameter("EventTypes", eventTypes);
            this.eventTypes = eventTypes;
            return this;
        }

        /**
         * LangType.
         */
        public Builder langType(String langType) {
            this.putQueryParameter("LangType", langType);
            this.langType = langType;
            return this;
        }

        /**
         * The number of records that you want to export. Maximum Value: 5000 Default value: 5000
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The ID of the workspace.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * The name of the workspace.
         */
        public Builder officeSiteName(String officeSiteName) {
            this.putQueryParameter("OfficeSiteName", officeSiteName);
            this.officeSiteName = officeSiteName;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the [ISO 8601](~~25696~~) standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.\
         * <p>
         * If you leave this parameter empty, all events that occurred before the point in time that you specify for `EndTime` are queried.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ExportClientEventsRequest build() {
            return new ExportClientEventsRequest(this);
        } 

    } 

}
