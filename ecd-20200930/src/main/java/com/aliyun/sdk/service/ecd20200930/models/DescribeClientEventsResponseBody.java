// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClientEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClientEventsResponseBody</p>
 */
public class DescribeClientEventsResponseBody extends TeaModel {
    @NameInMap("Events")
    private java.util.List < Events> events;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeClientEventsResponseBody(Builder builder) {
        this.events = builder.events;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClientEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return events
     */
    public java.util.List < Events> getEvents() {
        return this.events;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Events> events; 
        private String nextToken; 
        private String requestId; 

        /**
         * Details about the events.
         */
        public Builder events(java.util.List < Events> events) {
            this.events = events;
            return this;
        }

        /**
         * The query token that is returned in this call.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClientEventsResponseBody build() {
            return new DescribeClientEventsResponseBody(this);
        } 

    } 

    public static class Events extends TeaModel {
        @NameInMap("AliUid")
        private String aliUid;

        @NameInMap("BytesReceived")
        private String bytesReceived;

        @NameInMap("BytesSend")
        private String bytesSend;

        @NameInMap("ClientIp")
        private String clientIp;

        @NameInMap("ClientOS")
        private String clientOS;

        @NameInMap("ClientVersion")
        private String clientVersion;

        @NameInMap("DesktopGroupId")
        private String desktopGroupId;

        @NameInMap("DesktopGroupName")
        private String desktopGroupName;

        @NameInMap("DesktopId")
        private String desktopId;

        @NameInMap("DesktopIp")
        private String desktopIp;

        @NameInMap("DesktopName")
        private String desktopName;

        @NameInMap("DirectoryId")
        private String directoryId;

        @NameInMap("DirectoryType")
        private String directoryType;

        @NameInMap("EndUserId")
        private String endUserId;

        @NameInMap("EventId")
        private String eventId;

        @NameInMap("EventTime")
        private String eventTime;

        @NameInMap("EventType")
        private String eventType;

        @NameInMap("OfficeSiteId")
        private String officeSiteId;

        @NameInMap("OfficeSiteName")
        private String officeSiteName;

        @NameInMap("OfficeSiteType")
        private String officeSiteType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        private Events(Builder builder) {
            this.aliUid = builder.aliUid;
            this.bytesReceived = builder.bytesReceived;
            this.bytesSend = builder.bytesSend;
            this.clientIp = builder.clientIp;
            this.clientOS = builder.clientOS;
            this.clientVersion = builder.clientVersion;
            this.desktopGroupId = builder.desktopGroupId;
            this.desktopGroupName = builder.desktopGroupName;
            this.desktopId = builder.desktopId;
            this.desktopIp = builder.desktopIp;
            this.desktopName = builder.desktopName;
            this.directoryId = builder.directoryId;
            this.directoryType = builder.directoryType;
            this.endUserId = builder.endUserId;
            this.eventId = builder.eventId;
            this.eventTime = builder.eventTime;
            this.eventType = builder.eventType;
            this.officeSiteId = builder.officeSiteId;
            this.officeSiteName = builder.officeSiteName;
            this.officeSiteType = builder.officeSiteType;
            this.regionId = builder.regionId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Events create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public String getAliUid() {
            return this.aliUid;
        }

        /**
         * @return bytesReceived
         */
        public String getBytesReceived() {
            return this.bytesReceived;
        }

        /**
         * @return bytesSend
         */
        public String getBytesSend() {
            return this.bytesSend;
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return clientOS
         */
        public String getClientOS() {
            return this.clientOS;
        }

        /**
         * @return clientVersion
         */
        public String getClientVersion() {
            return this.clientVersion;
        }

        /**
         * @return desktopGroupId
         */
        public String getDesktopGroupId() {
            return this.desktopGroupId;
        }

        /**
         * @return desktopGroupName
         */
        public String getDesktopGroupName() {
            return this.desktopGroupName;
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
         * @return directoryType
         */
        public String getDirectoryType() {
            return this.directoryType;
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return eventTime
         */
        public String getEventTime() {
            return this.eventTime;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
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
         * @return officeSiteType
         */
        public String getOfficeSiteType() {
            return this.officeSiteType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String aliUid; 
            private String bytesReceived; 
            private String bytesSend; 
            private String clientIp; 
            private String clientOS; 
            private String clientVersion; 
            private String desktopGroupId; 
            private String desktopGroupName; 
            private String desktopId; 
            private String desktopIp; 
            private String desktopName; 
            private String directoryId; 
            private String directoryType; 
            private String endUserId; 
            private String eventId; 
            private String eventTime; 
            private String eventType; 
            private String officeSiteId; 
            private String officeSiteName; 
            private String officeSiteType; 
            private String regionId; 
            private String status; 

            /**
             * The ID of the Alibaba Cloud account with which the event is associated.
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * The number of bytes that are received.
             */
            public Builder bytesReceived(String bytesReceived) {
                this.bytesReceived = bytesReceived;
                return this;
            }

            /**
             * The number of bytes that are sent.
             */
            public Builder bytesSend(String bytesSend) {
                this.bytesSend = bytesSend;
                return this;
            }

            /**
             * The IP address of the client.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * The OS that the client runs.
             */
            public Builder clientOS(String clientOS) {
                this.clientOS = clientOS;
                return this;
            }

            /**
             * The version of the client.
             */
            public Builder clientVersion(String clientVersion) {
                this.clientVersion = clientVersion;
                return this;
            }

            /**
             * The ID of the desktop group.
             */
            public Builder desktopGroupId(String desktopGroupId) {
                this.desktopGroupId = desktopGroupId;
                return this;
            }

            /**
             * The name of the desktop group.
             */
            public Builder desktopGroupName(String desktopGroupName) {
                this.desktopGroupName = desktopGroupName;
                return this;
            }

            /**
             * The ID of the cloud desktop.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * The IP address of the cloud desktop.
             */
            public Builder desktopIp(String desktopIp) {
                this.desktopIp = desktopIp;
                return this;
            }

            /**
             * The name of the cloud desktop.
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * The ID of the directory to which the cloud desktop belongs.
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * The type of the directory.
             */
            public Builder directoryType(String directoryType) {
                this.directoryType = directoryType;
                return this;
            }

            /**
             * The information about the regular user that connects to the cloud desktop from the EDS client. The information can be the RAM user ID or AD username.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * The ID of the event.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * The time when the event occurred.
             */
            public Builder eventTime(String eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * The type of the event.
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * The ID of the workspace to which the cloud desktop belongs.
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * The name of the workspace.
             */
            public Builder officeSiteName(String officeSiteName) {
                this.officeSiteName = officeSiteName;
                return this;
            }

            /**
             * The account type of the workspace. Valid values:
             * <p>
             * 
             * *   SIMPLE: convenience account
             * *   AD_CONNECTOR: enterprise AD account
             */
            public Builder officeSiteType(String officeSiteType) {
                this.officeSiteType = officeSiteType;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The status of the event. This parameter is returned if you set the EventType parameter to DESKTOP_DISCONNECT or GET_CONNECTION_TICKET. Valid values:
             * <p>
             * 
             * *   200\. The value indicates that the request is successful.
             * *   An error message. The value indicates that the request failed. Example: FailedToGetConnectionTicket.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Events build() {
                return new Events(this);
            } 

        } 

    }
}
