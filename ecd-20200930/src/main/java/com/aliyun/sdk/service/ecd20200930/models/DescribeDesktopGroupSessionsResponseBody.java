// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDesktopGroupSessionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDesktopGroupSessionsResponseBody</p>
 */
public class DescribeDesktopGroupSessionsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Sessions")
    private java.util.List < Sessions> sessions;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDesktopGroupSessionsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.sessions = builder.sessions;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDesktopGroupSessionsResponseBody create() {
        return builder().build();
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

    /**
     * @return sessions
     */
    public java.util.List < Sessions> getSessions() {
        return this.sessions;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List < Sessions> sessions; 
        private Integer totalCount; 

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The sessions.
         */
        public Builder sessions(java.util.List < Sessions> sessions) {
            this.sessions = sessions;
            return this;
        }

        /**
         * The total number of sessions.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDesktopGroupSessionsResponseBody build() {
            return new DescribeDesktopGroupSessionsResponseBody(this);
        } 

    } 

    public static class Sessions extends TeaModel {
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

        @NameInMap("EndUserApplyCoordinateTime")
        private Long endUserApplyCoordinateTime;

        @NameInMap("EndUserId")
        private String endUserId;

        @NameInMap("LastSessionEndTime")
        private String lastSessionEndTime;

        @NameInMap("LastSessionStartTime")
        private String lastSessionStartTime;

        @NameInMap("LatestConnectionTime")
        private Long latestConnectionTime;

        @NameInMap("OfficeSiteId")
        private String officeSiteId;

        @NameInMap("OfficeSiteName")
        private String officeSiteName;

        @NameInMap("OsType")
        private String osType;

        @NameInMap("OwnType")
        private Integer ownType;

        @NameInMap("ProtocolType")
        private String protocolType;

        @NameInMap("SessionIdleTime")
        private Long sessionIdleTime;

        @NameInMap("SessionStatus")
        private String sessionStatus;

        @NameInMap("TotalConnectionDuration")
        private Long totalConnectionDuration;

        private Sessions(Builder builder) {
            this.clientIp = builder.clientIp;
            this.clientOS = builder.clientOS;
            this.clientVersion = builder.clientVersion;
            this.desktopGroupId = builder.desktopGroupId;
            this.desktopGroupName = builder.desktopGroupName;
            this.desktopId = builder.desktopId;
            this.endUserApplyCoordinateTime = builder.endUserApplyCoordinateTime;
            this.endUserId = builder.endUserId;
            this.lastSessionEndTime = builder.lastSessionEndTime;
            this.lastSessionStartTime = builder.lastSessionStartTime;
            this.latestConnectionTime = builder.latestConnectionTime;
            this.officeSiteId = builder.officeSiteId;
            this.officeSiteName = builder.officeSiteName;
            this.osType = builder.osType;
            this.ownType = builder.ownType;
            this.protocolType = builder.protocolType;
            this.sessionIdleTime = builder.sessionIdleTime;
            this.sessionStatus = builder.sessionStatus;
            this.totalConnectionDuration = builder.totalConnectionDuration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sessions create() {
            return builder().build();
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
         * @return endUserApplyCoordinateTime
         */
        public Long getEndUserApplyCoordinateTime() {
            return this.endUserApplyCoordinateTime;
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return lastSessionEndTime
         */
        public String getLastSessionEndTime() {
            return this.lastSessionEndTime;
        }

        /**
         * @return lastSessionStartTime
         */
        public String getLastSessionStartTime() {
            return this.lastSessionStartTime;
        }

        /**
         * @return latestConnectionTime
         */
        public Long getLatestConnectionTime() {
            return this.latestConnectionTime;
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
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return ownType
         */
        public Integer getOwnType() {
            return this.ownType;
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return sessionIdleTime
         */
        public Long getSessionIdleTime() {
            return this.sessionIdleTime;
        }

        /**
         * @return sessionStatus
         */
        public String getSessionStatus() {
            return this.sessionStatus;
        }

        /**
         * @return totalConnectionDuration
         */
        public Long getTotalConnectionDuration() {
            return this.totalConnectionDuration;
        }

        public static final class Builder {
            private String clientIp; 
            private String clientOS; 
            private String clientVersion; 
            private String desktopGroupId; 
            private String desktopGroupName; 
            private String desktopId; 
            private Long endUserApplyCoordinateTime; 
            private String endUserId; 
            private String lastSessionEndTime; 
            private String lastSessionStartTime; 
            private Long latestConnectionTime; 
            private String officeSiteId; 
            private String officeSiteName; 
            private String osType; 
            private Integer ownType; 
            private String protocolType; 
            private Long sessionIdleTime; 
            private String sessionStatus; 
            private Long totalConnectionDuration; 

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
             * If the session is being established, the value of this parameter indicates the ID of the current cloud desktop. If the session is disconnected, the value of this parameter indicates the ID of the cloud desktop that was most recently connected.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * The point in time when the end user applies for administrator assistance.
             */
            public Builder endUserApplyCoordinateTime(Long endUserApplyCoordinateTime) {
                this.endUserApplyCoordinateTime = endUserApplyCoordinateTime;
                return this;
            }

            /**
             * The ID of the end user.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * The end time of the most recent connection.
             */
            public Builder lastSessionEndTime(String lastSessionEndTime) {
                this.lastSessionEndTime = lastSessionEndTime;
                return this;
            }

            /**
             * The start time of the most recent connection.
             */
            public Builder lastSessionStartTime(String lastSessionStartTime) {
                this.lastSessionStartTime = lastSessionStartTime;
                return this;
            }

            /**
             * The duration of the most recent session.
             */
            public Builder latestConnectionTime(Long latestConnectionTime) {
                this.latestConnectionTime = latestConnectionTime;
                return this;
            }

            /**
             * The ID of the workspace.
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
             * The OS. Valid values:
             * <p>
             * 
             * *   Windows
             * *   Linux
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * The type of the session.
             * <p>
             * 
             * Valid values:
             * 
             * *   0
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     single-session
             * 
             *     <!-- -->
             * 
             * *   1
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     multi-session
             * 
             *     <!-- -->
             */
            public Builder ownType(Integer ownType) {
                this.ownType = ownType;
                return this;
            }

            /**
             * The type of the protocol.
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * The duration during which the cloud desktop stays in the Idle state.
             */
            public Builder sessionIdleTime(Long sessionIdleTime) {
                this.sessionIdleTime = sessionIdleTime;
                return this;
            }

            /**
             * The state of the session.
             * <p>
             * 
             * Valid values:
             * 
             * *   Connected
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Disconnected
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder sessionStatus(String sessionStatus) {
                this.sessionStatus = sessionStatus;
                return this;
            }

            /**
             * The total duration of the sessions.
             */
            public Builder totalConnectionDuration(Long totalConnectionDuration) {
                this.totalConnectionDuration = totalConnectionDuration;
                return this;
            }

            public Sessions build() {
                return new Sessions(this);
            } 

        } 

    }
}
