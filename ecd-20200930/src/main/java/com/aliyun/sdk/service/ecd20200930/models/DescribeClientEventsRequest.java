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
    @com.aliyun.core.annotation.NameInMap("EndUserIds")
    private java.util.List<String> endUserIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventType")
    private String eventType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventTypes")
    private java.util.List<String> eventTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FillHardwareInfo")
    private Boolean fillHardwareInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

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
        this.endUserIds = builder.endUserIds;
        this.eventType = builder.eventType;
        this.eventTypes = builder.eventTypes;
        this.fillHardwareInfo = builder.fillHardwareInfo;
        this.language = builder.language;
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
     * @return endUserIds
     */
    public java.util.List<String> getEndUserIds() {
        return this.endUserIds;
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
     * @return fillHardwareInfo
     */
    public Boolean getFillHardwareInfo() {
        return this.fillHardwareInfo;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
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
        private java.util.List<String> endUserIds; 
        private String eventType; 
        private java.util.List<String> eventTypes; 
        private Boolean fillHardwareInfo; 
        private String language; 
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
            this.endUserIds = request.endUserIds;
            this.eventType = request.eventType;
            this.eventTypes = request.eventTypes;
            this.fillHardwareInfo = request.fillHardwareInfo;
            this.language = request.language;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.officeSiteId = request.officeSiteId;
            this.officeSiteName = request.officeSiteName;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The cloud computer ID. If this parameter is not specified, all cloud computers in the region are queried.</p>
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
         * <p>The IP address of the cloud computer. If this parameter is not specified, events of all cloud computers in the region are queried.</p>
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
         * <p>The name of the cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>Finance cloud computer</p>
         */
        public Builder desktopName(String desktopName) {
            this.putQueryParameter("DesktopName", desktopName);
            this.desktopName = desktopName;
            return this;
        }

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>To be hidden.</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The end time. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC+0. If this parameter is not specified, the current time is used.</p>
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
         * <p>The logon user information, which is a Resource Access Management (RAM) user ID or AD username. If this parameter is not specified, events of all users in the region are queried.</p>
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
         * <p>The list of end user IDs.</p>
         */
        public Builder endUserIds(java.util.List<String> endUserIds) {
            this.putQueryParameter("EndUserIds", endUserIds);
            this.endUserIds = endUserIds;
            return this;
        }

        /**
         * <p>The event type to query. If EventTypes is not empty, the EventTypes combination is used as the query filter condition. If both EventTypes and EventType are empty, all events are queried.</p>
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
         * <p>The combination of event types to query. You can specify multiple event types. The query results include all events of the specified types.</p>
         */
        public Builder eventTypes(java.util.List<String> eventTypes) {
            this.putQueryParameter("EventTypes", eventTypes);
            this.eventTypes = eventTypes;
            return this;
        }

        /**
         * <p>Specifies whether to include terminal information in the response.</p>
         */
        public Builder fillHardwareInfo(Boolean fillHardwareInfo) {
            this.putQueryParameter("FillHardwareInfo", fillHardwareInfo);
            this.fillHardwareInfo = fillHardwareInfo;
            return this;
        }

        /**
         * <p>The language type of the returned information.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The number of entries per page for a paged query. Default value: 100.</p>
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
         * <p>The pagination token. Set this parameter to the NextToken value returned in the previous API call.</p>
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
         * <p>The ID of the office network to which the cloud computer belongs. If this parameter is not specified, user events in all office networks in the region are queried.</p>
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
         * <p>The name of the office network.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D office network</p>
         */
        public Builder officeSiteName(String officeSiteName) {
            this.putQueryParameter("OfficeSiteName", officeSiteName);
            this.officeSiteName = officeSiteName;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
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
         * <p>The start time. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC+0. If this parameter is not specified, events are queried backward from the time specified by <code>EndTime</code>.</p>
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
