// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDesktopSessionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDesktopSessionsResponseBody</p>
 */
public class DescribeDesktopSessionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Sessions")
    private java.util.List < Sessions> sessions;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDesktopSessionsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sessions = builder.sessions;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDesktopSessionsResponseBody create() {
        return builder().build();
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
        private String requestId; 
        private java.util.List < Sessions> sessions; 
        private Integer totalCount; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Details of the session.
         */
        public Builder sessions(java.util.List < Sessions> sessions) {
            this.sessions = sessions;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDesktopSessionsResponseBody build() {
            return new DescribeDesktopSessionsResponseBody(this);
        } 

    } 

    public static class Sessions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("ClientOS")
        private String clientOS;

        @com.aliyun.core.annotation.NameInMap("ClientVersion")
        private String clientVersion;

        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("DesktopName")
        private String desktopName;

        @com.aliyun.core.annotation.NameInMap("EndUserApplyCoordinateTime")
        private Long endUserApplyCoordinateTime;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("LatestConnectionTime")
        private Long latestConnectionTime;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteName")
        private String officeSiteName;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("SessionEndTime")
        private String sessionEndTime;

        @com.aliyun.core.annotation.NameInMap("SessionIdleTime")
        private Long sessionIdleTime;

        @com.aliyun.core.annotation.NameInMap("SessionStartTime")
        private String sessionStartTime;

        @com.aliyun.core.annotation.NameInMap("SessionStatus")
        private String sessionStatus;

        @com.aliyun.core.annotation.NameInMap("TotalConnectionTime")
        private Long totalConnectionTime;

        private Sessions(Builder builder) {
            this.clientIp = builder.clientIp;
            this.clientOS = builder.clientOS;
            this.clientVersion = builder.clientVersion;
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
            this.endUserApplyCoordinateTime = builder.endUserApplyCoordinateTime;
            this.endUserId = builder.endUserId;
            this.latestConnectionTime = builder.latestConnectionTime;
            this.officeSiteId = builder.officeSiteId;
            this.officeSiteName = builder.officeSiteName;
            this.osType = builder.osType;
            this.protocolType = builder.protocolType;
            this.sessionEndTime = builder.sessionEndTime;
            this.sessionIdleTime = builder.sessionIdleTime;
            this.sessionStartTime = builder.sessionStartTime;
            this.sessionStatus = builder.sessionStatus;
            this.totalConnectionTime = builder.totalConnectionTime;
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
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return sessionEndTime
         */
        public String getSessionEndTime() {
            return this.sessionEndTime;
        }

        /**
         * @return sessionIdleTime
         */
        public Long getSessionIdleTime() {
            return this.sessionIdleTime;
        }

        /**
         * @return sessionStartTime
         */
        public String getSessionStartTime() {
            return this.sessionStartTime;
        }

        /**
         * @return sessionStatus
         */
        public String getSessionStatus() {
            return this.sessionStatus;
        }

        /**
         * @return totalConnectionTime
         */
        public Long getTotalConnectionTime() {
            return this.totalConnectionTime;
        }

        public static final class Builder {
            private String clientIp; 
            private String clientOS; 
            private String clientVersion; 
            private String desktopId; 
            private String desktopName; 
            private Long endUserApplyCoordinateTime; 
            private String endUserId; 
            private Long latestConnectionTime; 
            private String officeSiteId; 
            private String officeSiteName; 
            private String osType; 
            private String protocolType; 
            private String sessionEndTime; 
            private Long sessionIdleTime; 
            private String sessionStartTime; 
            private String sessionStatus; 
            private Long totalConnectionTime; 

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
             * The client version.
             */
            public Builder clientVersion(String clientVersion) {
                this.clientVersion = clientVersion;
                return this;
            }

            /**
             * The cloud desktop ID.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * The cloud desktop name.
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * The duration of the remote assistance. Unit: seconds.
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
             * The duration of the latest session. Unit: seconds.
             */
            public Builder latestConnectionTime(Long latestConnectionTime) {
                this.latestConnectionTime = latestConnectionTime;
                return this;
            }

            /**
             * The workspace ID.
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * The workspace name.
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
             * The protocol type that is supported by the cloud desktop. Valid values:
             * <p>
             * 
             * *   HDX
             * *   ASP
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * The end time of the session.
             */
            public Builder sessionEndTime(String sessionEndTime) {
                this.sessionEndTime = sessionEndTime;
                return this;
            }

            /**
             * The idle duration of the session. Unit: seconds.
             */
            public Builder sessionIdleTime(Long sessionIdleTime) {
                this.sessionIdleTime = sessionIdleTime;
                return this;
            }

            /**
             * The start time of the session.
             */
            public Builder sessionStartTime(String sessionStartTime) {
                this.sessionStartTime = sessionStartTime;
                return this;
            }

            /**
             * The session status. Valid values:
             * <p>
             * 
             * *   Connected
             * *   Disconnected
             */
            public Builder sessionStatus(String sessionStatus) {
                this.sessionStatus = sessionStatus;
                return this;
            }

            /**
             * The total session duration. Unit: seconds.
             */
            public Builder totalConnectionTime(Long totalConnectionTime) {
                this.totalConnectionTime = totalConnectionTime;
                return this;
            }

            public Sessions build() {
                return new Sessions(this);
            } 

        } 

    }
}
