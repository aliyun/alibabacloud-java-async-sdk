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
 * {@link DescribeClientEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClientEventsResponseBody</p>
 */
public class DescribeClientEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Events")
    private java.util.List<Events> events;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return events
     */
    public java.util.List<Events> getEvents() {
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
        private java.util.List<Events> events; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeClientEventsResponseBody model) {
            this.events = model.events;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the events of an end user.</p>
         */
        public Builder events(java.util.List<Events> events) {
            this.events = events;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nmB7qrRFJ8vmttjxPL****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>28A40F12-F340-442B-A35F-46EF6A03227B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClientEventsResponseBody build() {
            return new DescribeClientEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClientEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClientEventsResponseBody</p>
     */
    public static class Events extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private String aliUid;

        @com.aliyun.core.annotation.NameInMap("BytesReceived")
        private String bytesReceived;

        @com.aliyun.core.annotation.NameInMap("BytesSend")
        private String bytesSend;

        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("ClientOS")
        private String clientOS;

        @com.aliyun.core.annotation.NameInMap("ClientVersion")
        private String clientVersion;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DesktopGroupId")
        private String desktopGroupId;

        @com.aliyun.core.annotation.NameInMap("DesktopGroupName")
        private String desktopGroupName;

        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("DesktopIp")
        private String desktopIp;

        @com.aliyun.core.annotation.NameInMap("DesktopName")
        private String desktopName;

        @com.aliyun.core.annotation.NameInMap("DirectoryId")
        private String directoryId;

        @com.aliyun.core.annotation.NameInMap("DirectoryType")
        private String directoryType;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("EventTime")
        private String eventTime;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteName")
        private String officeSiteName;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteType")
        private String officeSiteType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Events(Builder builder) {
            this.aliUid = builder.aliUid;
            this.bytesReceived = builder.bytesReceived;
            this.bytesSend = builder.bytesSend;
            this.clientIp = builder.clientIp;
            this.clientOS = builder.clientOS;
            this.clientVersion = builder.clientVersion;
            this.description = builder.description;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
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
            private String description; 
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

            private Builder() {
            } 

            private Builder(Events model) {
                this.aliUid = model.aliUid;
                this.bytesReceived = model.bytesReceived;
                this.bytesSend = model.bytesSend;
                this.clientIp = model.clientIp;
                this.clientOS = model.clientOS;
                this.clientVersion = model.clientVersion;
                this.description = model.description;
                this.desktopGroupId = model.desktopGroupId;
                this.desktopGroupName = model.desktopGroupName;
                this.desktopId = model.desktopId;
                this.desktopIp = model.desktopIp;
                this.desktopName = model.desktopName;
                this.directoryId = model.directoryId;
                this.directoryType = model.directoryType;
                this.endUserId = model.endUserId;
                this.eventId = model.eventId;
                this.eventTime = model.eventTime;
                this.eventType = model.eventType;
                this.officeSiteId = model.officeSiteId;
                this.officeSiteName = model.officeSiteName;
                this.officeSiteType = model.officeSiteType;
                this.regionId = model.regionId;
                this.status = model.status;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account with which the event is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>112259558861****</p>
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The number of bytes that are received.</p>
             * 
             * <strong>example:</strong>
             * <p>8665</p>
             */
            public Builder bytesReceived(String bytesReceived) {
                this.bytesReceived = bytesReceived;
                return this;
            }

            /**
             * <p>The number of bytes that are sent.</p>
             * 
             * <strong>example:</strong>
             * <p>2345</p>
             */
            public Builder bytesSend(String bytesSend) {
                this.bytesSend = bytesSend;
                return this;
            }

            /**
             * <p>The IP address of the client.</p>
             * 
             * <strong>example:</strong>
             * <p>100.68.<em>.</em></p>
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * <p>The OS that the client runs.</p>
             * 
             * <strong>example:</strong>
             * <p>Darwin 17.7.0 x64</p>
             */
            public Builder clientOS(String clientOS) {
                this.clientOS = clientOS;
                return this;
            }

            /**
             * <p>The client version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.4 202012021700</p>
             */
            public Builder clientVersion(String clientVersion) {
                this.clientVersion = clientVersion;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The desktop group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dg-kadkdfaf****</p>
             */
            public Builder desktopGroupId(String desktopGroupId) {
                this.desktopGroupId = desktopGroupId;
                return this;
            }

            /**
             * <p>The desktop group name.</p>
             * 
             * <strong>example:</strong>
             * <p>testName</p>
             */
            public Builder desktopGroupName(String desktopGroupName) {
                this.desktopGroupName = desktopGroupName;
                return this;
            }

            /**
             * <p>The cloud desktop ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-8fupvkhg0aayu****</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The IP address of the cloud desktop.</p>
             * 
             * <strong>example:</strong>
             * <p>10.10.<em>.</em></p>
             */
            public Builder desktopIp(String desktopIp) {
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
                this.desktopName = desktopName;
                return this;
            }

            /**
             * <p>The ID of the directory to which the cloud desktop belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+dir-bh77qa8nmjot4****</p>
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * <p>The directory type.</p>
             * 
             * <strong>example:</strong>
             * <p>RAM</p>
             */
            public Builder directoryType(String directoryType) {
                this.directoryType = directoryType;
                return this;
            }

            /**
             * <p>The information about the end user that connects to the cloud desktop from the EDS client. The information can be a RAM user ID or an AD username.</p>
             * 
             * <strong>example:</strong>
             * <p>28961708130834****</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>The event ID.</p>
             * 
             * <strong>example:</strong>
             * <p>5651188b-3070-d1cc-5311-75753d59****</p>
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The time when the event occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-30T06:32:31Z</p>
             */
            public Builder eventTime(String eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * <p>The event type. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>DESKTOP_DISCONNECT</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>The ID of the workspace to which the cloud desktop belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+dir-bh77qa8nmjot4****</p>
             */
            public Builder officeSiteId(String officeSiteId) {
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
                this.officeSiteName = officeSiteName;
                return this;
            }

            /**
             * <p>The account type of the workspace.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>SIMPLE: convenience account</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>AD_CONNECTOR: enterprise AD account</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SIMPLE</p>
             */
            public Builder officeSiteType(String officeSiteType) {
                this.officeSiteType = officeSiteType;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The status of the event. If you set the EventType parameter to <code>DESKTOP_DISCONNECT</code> or <code>GET_CONNECTION_TICKET</code>, this parameter is returned. Valid values:</p>
             * <ul>
             * <li>200. The value indicates that the request is successful.</li>
             * <li>An error message. The value indicates that the request failed. Example: FailedToGetConnectionTicket.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>200</p>
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
