// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeClientEventsRequest} extends {@link RequestModel}
 *
 * <p>DescribeClientEventsRequest</p>
 */
public class DescribeClientEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    private String desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopIp")
    private String desktopIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopName")
    private String desktopName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventType")
    private String eventType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventTypes")
    private java.util.List<String> eventTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteName")
    private String officeSiteName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
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
    public java.util.List<String> getEventTypes() {
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
        private java.util.List<String> eventTypes; 
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
         * <p>The cloud desktop ID. If you do not specify a value for this parameter, events of all cloud desktops in the specified region are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-8fupvkhg0aayu****</p>
         */
        public Builder desktopId(String desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * <p>The IP address of the cloud desktop. If you do not specify a value for this parameter, the events of all cloud desktops in the specified region are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>10.10.<em>.</em></p>
         */
        public Builder desktopIp(String desktopIp) {
            this.putQueryParameter("DesktopIp", desktopIp);
            this.desktopIp = desktopIp;
            return this;
        }

        /**
         * <p>The cloud desktop name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder desktopName(String desktopName) {
            this.putQueryParameter("DesktopName", desktopName);
            this.desktopName = desktopName;
            return this;
        }

        /**
         * <p>This parameter is not available to the public.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-bh77qa8nmjot4****</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The end of the time range to query. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.<br>If you do not specify a value for this parameter, the current time is used.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-31T06:32:31Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The information about the end user that connects to the cloud desktop from the Elastic Desktop Service (EDS) client. The information can be a Resource Access Management (RAM) user ID or an Active Directory (AD) username. If you do not specify a value for this parameter, the events of all end users in the specified region are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>28961708130834****</p>
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The type of the events that you want to query. If you specify multiple values for the EventTypes parameter, the events of all specified types are returned. If you do not specify values for the EventTypes and EventType parameters, all events of end users in the specified region are returned.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>DESKTOP_STOP: End users stop the cloud desktop.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>GET_LITE_CONNECTION_TICKET: End users obtain the credential for reconnecting to the cloud desktop upon disconnection.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>DESKTOP_DISCONNECT: End users disconnect desktop sessions.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>GET_CONNECTION_TICKET: End users request to connect to the cloud desktop.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>CLIENT_LOGIN: End users log on to the cloud desktop.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>DESKTOP_REBOOT: End users restart the cloud desktop.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>DESKTOP_CONNECT: End users establish desktop sessions.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>DESKTOP_START: End users start the cloud desktop.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DESKTOP_DISCONNECT</p>
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * <p>The array of event types that you want to query. You can specify multiple event types. The response contains all or specified types of events.</p>
         */
        public Builder eventTypes(java.util.List<String> eventTypes) {
            this.putQueryParameter("EventTypes", eventTypes);
            this.eventTypes = eventTypes;
            return this;
        }

        /**
         * <p>The number of entries per page.<br>Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nmB7qrRFJ8vmttjxPL****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the workspace to which the cloud desktop belongs. If you do not specify a value for this parameter, the events of all workspaces in the specified region are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-bh77qa8nmjot4****</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>The workspace name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder officeSiteName(String officeSiteName) {
            this.putQueryParameter("OfficeSiteName", officeSiteName);
            this.officeSiteName = officeSiteName;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.<br>If you do not specify a value for this parameter, all events that occurred before the point in time that you specify for <code>EndTime</code> are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-30T06:32:31Z</p>
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
