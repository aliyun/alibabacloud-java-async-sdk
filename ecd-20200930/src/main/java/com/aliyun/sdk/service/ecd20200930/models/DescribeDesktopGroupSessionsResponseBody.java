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
 * {@link DescribeDesktopGroupSessionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDesktopGroupSessionsResponseBody</p>
 */
public class DescribeDesktopGroupSessionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Sessions")
    private java.util.List<Sessions> sessions;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
    public java.util.List<Sessions> getSessions() {
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
        private java.util.List<Sessions> sessions; 
        private Integer totalCount; 

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D0920845-7359-59FC-9899-B****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The sessions.</p>
         */
        public Builder sessions(java.util.List<Sessions> sessions) {
            this.sessions = sessions;
            return this;
        }

        /**
         * <p>The total number of sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDesktopGroupSessionsResponseBody build() {
            return new DescribeDesktopGroupSessionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDesktopGroupSessionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDesktopGroupSessionsResponseBody</p>
     */
    public static class Sessions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("ClientOS")
        private String clientOS;

        @com.aliyun.core.annotation.NameInMap("ClientVersion")
        private String clientVersion;

        @com.aliyun.core.annotation.NameInMap("DesktopGroupId")
        private String desktopGroupId;

        @com.aliyun.core.annotation.NameInMap("DesktopGroupName")
        private String desktopGroupName;

        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("EndUserApplyCoordinateTime")
        private Long endUserApplyCoordinateTime;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("LastSessionEndTime")
        private String lastSessionEndTime;

        @com.aliyun.core.annotation.NameInMap("LastSessionStartTime")
        private String lastSessionStartTime;

        @com.aliyun.core.annotation.NameInMap("LatestConnectionTime")
        private Long latestConnectionTime;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteName")
        private String officeSiteName;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("OwnType")
        private Integer ownType;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("SessionIdleTime")
        private Long sessionIdleTime;

        @com.aliyun.core.annotation.NameInMap("SessionStatus")
        private String sessionStatus;

        @com.aliyun.core.annotation.NameInMap("TotalConnectionDuration")
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
             * <p>The IP address of the client.</p>
             * 
             * <strong>example:</strong>
             * <p>172.21.XX.XX</p>
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * <p>The OS that the client runs.</p>
             * 
             * <strong>example:</strong>
             * <p>windows_&quot;Windows10Enterprise&quot;10.0(Build22000)</p>
             */
            public Builder clientOS(String clientOS) {
                this.clientOS = clientOS;
                return this;
            }

            /**
             * <p>The version of the client.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0.0-R-20221030.08****</p>
             */
            public Builder clientVersion(String clientVersion) {
                this.clientVersion = clientVersion;
                return this;
            }

            /**
             * <p>The ID of the desktop group.</p>
             * 
             * <strong>example:</strong>
             * <p>dg-iaqu3bi2xtie****</p>
             */
            public Builder desktopGroupId(String desktopGroupId) {
                this.desktopGroupId = desktopGroupId;
                return this;
            }

            /**
             * <p>The name of the desktop group.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder desktopGroupName(String desktopGroupName) {
                this.desktopGroupName = desktopGroupName;
                return this;
            }

            /**
             * <p>If the session is being established, the value of this parameter indicates the ID of the current cloud desktop. If the session is disconnected, the value of this parameter indicates the ID of the cloud desktop that was most recently connected.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-g6t1ukbaea****</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The point in time when the end user applies for administrator assistance.</p>
             * 
             * <strong>example:</strong>
             * <p>1678794261000</p>
             */
            public Builder endUserApplyCoordinateTime(Long endUserApplyCoordinateTime) {
                this.endUserApplyCoordinateTime = endUserApplyCoordinateTime;
                return this;
            }

            /**
             * <p>The ID of the end user.</p>
             * 
             * <strong>example:</strong>
             * <p>xianqiu</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>The end time of the most recent connection.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-31 06:56:45</p>
             */
            public Builder lastSessionEndTime(String lastSessionEndTime) {
                this.lastSessionEndTime = lastSessionEndTime;
                return this;
            }

            /**
             * <p>The start time of the most recent connection.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-31 06:56:45</p>
             */
            public Builder lastSessionStartTime(String lastSessionStartTime) {
                this.lastSessionStartTime = lastSessionStartTime;
                return this;
            }

            /**
             * <p>The duration of the most recent session.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder latestConnectionTime(Long latestConnectionTime) {
                this.latestConnectionTime = latestConnectionTime;
                return this;
            }

            /**
             * <p>The ID of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+dir-8904****</p>
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * <p>The name of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder officeSiteName(String officeSiteName) {
                this.officeSiteName = officeSiteName;
                return this;
            }

            /**
             * <p>The OS. Valid values:</p>
             * <ul>
             * <li>Windows</li>
             * <li>Linux</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Windows</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * <p>The type of the session.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>0: single-session</li>
             * <li>1: multi-session</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ownType(Integer ownType) {
                this.ownType = ownType;
                return this;
            }

            /**
             * <p>The type of the protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>ASP</p>
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * <p>The duration during which the cloud desktop stays in the Idle state.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder sessionIdleTime(Long sessionIdleTime) {
                this.sessionIdleTime = sessionIdleTime;
                return this;
            }

            /**
             * <p>The state of the session.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>Connected</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Disconnected</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Connected</p>
             */
            public Builder sessionStatus(String sessionStatus) {
                this.sessionStatus = sessionStatus;
                return this;
            }

            /**
             * <p>The total duration of the sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
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
