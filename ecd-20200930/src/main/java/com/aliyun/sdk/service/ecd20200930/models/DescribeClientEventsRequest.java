// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClientEventsRequest} extends {@link RequestModel}
 *
 * <p>DescribeClientEventsRequest</p>
 */
public class DescribeClientEventsRequest extends Request {
    @Query
    @NameInMap("DesktopId")
    private String desktopId;

    @Query
    @NameInMap("DesktopIp")
    private String desktopIp;

    @Query
    @NameInMap("DesktopName")
    private String desktopName;

    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

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
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

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

    private DescribeClientEventsRequest(Builder builder) {
        super(builder);
        this.desktopId = builder.desktopId;
        this.desktopIp = builder.desktopIp;
        this.desktopName = builder.desktopName;
        this.directoryId = builder.directoryId;
        this.endTime = builder.endTime;
        this.endUserId = builder.endUserId;
        this.eventType = builder.eventType;
        this.eventTypes = builder.eventTypes;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.officeSiteId = builder.officeSiteId;
        this.officeSiteName = builder.officeSiteName;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClientEventsRequest create() {
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
     * @return desktopIp
     */
    public String getDesktopIp() {
        return this.desktopIp;
    }

    /**
     * @return desktopName
     */
    public String getDesktopName() {
        return this.desktopName;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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

    public static final class Builder extends Request.Builder<DescribeClientEventsRequest, Builder> {
        private String desktopId; 
        private String desktopIp; 
        private String desktopName; 
        private String directoryId; 
        private String endTime; 
        private String endUserId; 
        private String eventType; 
        private java.util.List < String > eventTypes; 
        private Integer maxResults; 
        private String nextToken; 
        private String officeSiteId; 
        private String officeSiteName; 
        private String regionId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClientEventsRequest request) {
            super(request);
            this.desktopId = request.desktopId;
            this.desktopIp = request.desktopIp;
            this.desktopName = request.desktopName;
            this.directoryId = request.directoryId;
            this.endTime = request.endTime;
            this.endUserId = request.endUserId;
            this.eventType = request.eventType;
            this.eventTypes = request.eventTypes;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.officeSiteId = request.officeSiteId;
            this.officeSiteName = request.officeSiteName;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
        } 

        /**
         * The ID of the cloud desktop. If you do not specify a value for this parameter, events of all cloud desktops in the specified region are queried.
         */
        public Builder desktopId(String desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * The IP address of the cloud desktop. If you do not specify a value for this parameter, events of all cloud desktops in the specified region are queried.
         */
        public Builder desktopIp(String desktopIp) {
            this.putQueryParameter("DesktopIp", desktopIp);
            this.desktopIp = desktopIp;
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
         * The ID of the directory to which the cloud desktop belongs.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The end of the time range to query. Specify the time in the [ISO 8601](~~25696~~) standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.
         * <p>
         * 
         * If you do not specify a value for this parameter, the current time is used.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The information about the regular user that connects to the cloud desktop from the EDS client. The information can be the RAM user ID or Active Directory (AD) username. If you do not specify a value for this parameter, events of all regular users in the specified region are queried.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * The type of event that you want to query. Valid values:
         * <p>
         * 
         * *   DESKTOP_CONNECT: The desktop session is established.
         * *   DESKTOP_DISCONNECT: The desktop session is disconnected.
         * *   DESKTOP_REBOOT: The cloud desktop is restarted.
         * *   CLIENT_AD_LOGIN: The AD user logs on to the client.
         * *   GET_CONNECTION_TICKET: The request to connect to the cloud desktop is sent.
         * *   DESKTOP_START: The cloud desktop is started.
         * *   DESKTOP_STOP: The cloud desktop is stopped.
         * 
         * If you do not specify a value for this parameter, events of all types are queried.
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * The types of event.
         */
        public Builder eventTypes(java.util.List < String > eventTypes) {
            this.putQueryParameter("EventTypes", eventTypes);
            this.eventTypes = eventTypes;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Default value: 100.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The query token. Set the value to the NextToken value that is returned from the last call to the DescribeClientEvents operation.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the workspace to which the cloud desktop belongs. If you do not specify a value for this parameter, events of all workspaces in the specified region are queried.
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
         * The ID of the region where the cloud desktop resides.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the [ISO 8601](~~25696~~) standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.
         * <p>
         * 
         * If you do not specify a value for this parameter, all events that occurred before the point in time that you specify for `EndTime` are queried.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeClientEventsRequest build() {
            return new DescribeClientEventsRequest(this);
        } 

    } 

}
