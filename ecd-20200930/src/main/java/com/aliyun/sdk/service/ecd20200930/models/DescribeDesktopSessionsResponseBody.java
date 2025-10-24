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
 * {@link DescribeDesktopSessionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDesktopSessionsResponseBody</p>
 */
public class DescribeDesktopSessionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Sessions")
    private java.util.List<Sessions> sessions;

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

    public Builder toBuilder() {
        return new Builder(this);
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
        private String requestId; 
        private java.util.List<Sessions> sessions; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeDesktopSessionsResponseBody model) {
            this.requestId = model.requestId;
            this.sessions = model.sessions;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3EC4A6DB-EC8D-55B0-9038-543DE671****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Details of sessions.</p>
         */
        public Builder sessions(java.util.List<Sessions> sessions) {
            this.sessions = sessions;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDesktopSessionsResponseBody build() {
            return new DescribeDesktopSessionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDesktopSessionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDesktopSessionsResponseBody</p>
     */
    public static class ResourceGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private ResourceGroups(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceGroups create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(ResourceGroups model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ResourceGroups build() {
                return new ResourceGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDesktopSessionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDesktopSessionsResponseBody</p>
     */
    public static class TerminalInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("SerialNumber")
        private String serialNumber;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private TerminalInfo(Builder builder) {
            this.model = builder.model;
            this.productName = builder.productName;
            this.serialNumber = builder.serialNumber;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TerminalInfo create() {
            return builder().build();
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String model; 
            private String productName; 
            private String serialNumber; 
            private String uuid; 

            private Builder() {
            } 

            private Builder(TerminalInfo model) {
                this.model = model.model;
                this.productName = model.productName;
                this.serialNumber = model.serialNumber;
                this.uuid = model.uuid;
            } 

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * ProductName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * SerialNumber.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public TerminalInfo build() {
                return new TerminalInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDesktopSessionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDesktopSessionsResponseBody</p>
     */
    public static class Sessions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountType")
        private String accountType;

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

        @com.aliyun.core.annotation.NameInMap("DirectoryType")
        private String directoryType;

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

        @com.aliyun.core.annotation.NameInMap("OsSessionStatus")
        private String osSessionStatus;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("ResourceGroups")
        private java.util.List<ResourceGroups> resourceGroups;

        @com.aliyun.core.annotation.NameInMap("SessionEndTime")
        private String sessionEndTime;

        @com.aliyun.core.annotation.NameInMap("SessionIdleTime")
        private Long sessionIdleTime;

        @com.aliyun.core.annotation.NameInMap("SessionStartTime")
        private String sessionStartTime;

        @com.aliyun.core.annotation.NameInMap("SessionStatus")
        private String sessionStatus;

        @com.aliyun.core.annotation.NameInMap("SubPayType")
        private String subPayType;

        @com.aliyun.core.annotation.NameInMap("TerminalInfo")
        private TerminalInfo terminalInfo;

        @com.aliyun.core.annotation.NameInMap("TotalConnectionTime")
        private Long totalConnectionTime;

        private Sessions(Builder builder) {
            this.accountType = builder.accountType;
            this.clientIp = builder.clientIp;
            this.clientOS = builder.clientOS;
            this.clientVersion = builder.clientVersion;
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
            this.directoryType = builder.directoryType;
            this.endUserApplyCoordinateTime = builder.endUserApplyCoordinateTime;
            this.endUserId = builder.endUserId;
            this.latestConnectionTime = builder.latestConnectionTime;
            this.officeSiteId = builder.officeSiteId;
            this.officeSiteName = builder.officeSiteName;
            this.osSessionStatus = builder.osSessionStatus;
            this.osType = builder.osType;
            this.protocolType = builder.protocolType;
            this.resourceGroups = builder.resourceGroups;
            this.sessionEndTime = builder.sessionEndTime;
            this.sessionIdleTime = builder.sessionIdleTime;
            this.sessionStartTime = builder.sessionStartTime;
            this.sessionStatus = builder.sessionStatus;
            this.subPayType = builder.subPayType;
            this.terminalInfo = builder.terminalInfo;
            this.totalConnectionTime = builder.totalConnectionTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sessions create() {
            return builder().build();
        }

        /**
         * @return accountType
         */
        public String getAccountType() {
            return this.accountType;
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
         * @return directoryType
         */
        public String getDirectoryType() {
            return this.directoryType;
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
         * @return osSessionStatus
         */
        public String getOsSessionStatus() {
            return this.osSessionStatus;
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
         * @return resourceGroups
         */
        public java.util.List<ResourceGroups> getResourceGroups() {
            return this.resourceGroups;
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
         * @return subPayType
         */
        public String getSubPayType() {
            return this.subPayType;
        }

        /**
         * @return terminalInfo
         */
        public TerminalInfo getTerminalInfo() {
            return this.terminalInfo;
        }

        /**
         * @return totalConnectionTime
         */
        public Long getTotalConnectionTime() {
            return this.totalConnectionTime;
        }

        public static final class Builder {
            private String accountType; 
            private String clientIp; 
            private String clientOS; 
            private String clientVersion; 
            private String desktopId; 
            private String desktopName; 
            private String directoryType; 
            private Long endUserApplyCoordinateTime; 
            private String endUserId; 
            private Long latestConnectionTime; 
            private String officeSiteId; 
            private String officeSiteName; 
            private String osSessionStatus; 
            private String osType; 
            private String protocolType; 
            private java.util.List<ResourceGroups> resourceGroups; 
            private String sessionEndTime; 
            private Long sessionIdleTime; 
            private String sessionStartTime; 
            private String sessionStatus; 
            private String subPayType; 
            private TerminalInfo terminalInfo; 
            private Long totalConnectionTime; 

            private Builder() {
            } 

            private Builder(Sessions model) {
                this.accountType = model.accountType;
                this.clientIp = model.clientIp;
                this.clientOS = model.clientOS;
                this.clientVersion = model.clientVersion;
                this.desktopId = model.desktopId;
                this.desktopName = model.desktopName;
                this.directoryType = model.directoryType;
                this.endUserApplyCoordinateTime = model.endUserApplyCoordinateTime;
                this.endUserId = model.endUserId;
                this.latestConnectionTime = model.latestConnectionTime;
                this.officeSiteId = model.officeSiteId;
                this.officeSiteName = model.officeSiteName;
                this.osSessionStatus = model.osSessionStatus;
                this.osType = model.osType;
                this.protocolType = model.protocolType;
                this.resourceGroups = model.resourceGroups;
                this.sessionEndTime = model.sessionEndTime;
                this.sessionIdleTime = model.sessionIdleTime;
                this.sessionStartTime = model.sessionStartTime;
                this.sessionStatus = model.sessionStatus;
                this.subPayType = model.subPayType;
                this.terminalInfo = model.terminalInfo;
                this.totalConnectionTime = model.totalConnectionTime;
            } 

            /**
             * AccountType.
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

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
             * <p>The client OS.</p>
             * 
             * <strong>example:</strong>
             * <p>windows_&quot;Windows10Enterprise&quot;10.0(Build22000)</p>
             */
            public Builder clientOS(String clientOS) {
                this.clientOS = clientOS;
                return this;
            }

            /**
             * <p>The client version.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0.0-R-20221030.08****</p>
             */
            public Builder clientVersion(String clientVersion) {
                this.clientVersion = clientVersion;
                return this;
            }

            /**
             * <p>The ID of the cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-g6t1ukbaea****</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The name of the cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>testDesktop</p>
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * DirectoryType.
             */
            public Builder directoryType(String directoryType) {
                this.directoryType = directoryType;
                return this;
            }

            /**
             * <p>The duration of the remote assistance. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder endUserApplyCoordinateTime(Long endUserApplyCoordinateTime) {
                this.endUserApplyCoordinateTime = endUserApplyCoordinateTime;
                return this;
            }

            /**
             * <p>The ID of the end user.</p>
             * 
             * <strong>example:</strong>
             * <p>testUser</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>The duration of the last connection to the cloud computer. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder latestConnectionTime(Long latestConnectionTime) {
                this.latestConnectionTime = latestConnectionTime;
                return this;
            }

            /**
             * <p>The ID of the office network.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+dir-8904****</p>
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * <p>The name of the office network.</p>
             * 
             * <strong>example:</strong>
             * <p>DemoOfficeSite</p>
             */
            public Builder officeSiteName(String officeSiteName) {
                this.officeSiteName = officeSiteName;
                return this;
            }

            /**
             * <p>Indicates whether the switch to check session status of cloud computers is turned on.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder osSessionStatus(String osSessionStatus) {
                this.osSessionStatus = osSessionStatus;
                return this;
            }

            /**
             * <p>The OS.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Linux</li>
             * <li>Windows</li>
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
             * <p>The protocol type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>HDX</li>
             * <li>ASP</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ASP</p>
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * ResourceGroups.
             */
            public Builder resourceGroups(java.util.List<ResourceGroups> resourceGroups) {
                this.resourceGroups = resourceGroups;
                return this;
            }

            /**
             * <p>The end time of the session.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-28T02:31:43Z</p>
             */
            public Builder sessionEndTime(String sessionEndTime) {
                this.sessionEndTime = sessionEndTime;
                return this;
            }

            /**
             * <p>The idle duration of the session. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder sessionIdleTime(Long sessionIdleTime) {
                this.sessionIdleTime = sessionIdleTime;
                return this;
            }

            /**
             * <p>The start time of the session.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-28T02:31:43Z</p>
             */
            public Builder sessionStartTime(String sessionStartTime) {
                this.sessionStartTime = sessionStartTime;
                return this;
            }

            /**
             * <p>The state of the session.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Connected</li>
             * <li>Disconnected</li>
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
             * <p>The billing method of cloud computers.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>duration: hourly plan (available for users in the whitelist)</li>
             * <li>postPaid: pay-as-you-go</li>
             * <li>monthPackage: monthly subscription (120-hour computing plan and 250-hour computing plan)</li>
             * <li>prePaid: monthly subscription (Unlimited computing plan)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>monthPackage</p>
             */
            public Builder subPayType(String subPayType) {
                this.subPayType = subPayType;
                return this;
            }

            /**
             * TerminalInfo.
             */
            public Builder terminalInfo(TerminalInfo terminalInfo) {
                this.terminalInfo = terminalInfo;
                return this;
            }

            /**
             * <p>The total connection duration. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>240</p>
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
