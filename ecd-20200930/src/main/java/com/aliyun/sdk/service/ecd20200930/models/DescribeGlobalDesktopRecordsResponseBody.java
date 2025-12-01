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
 * {@link DescribeGlobalDesktopRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGlobalDesktopRecordsResponseBody</p>
 */
public class DescribeGlobalDesktopRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Sessions")
    private java.util.List<Sessions> sessions;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeGlobalDesktopRecordsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sessions = builder.sessions;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGlobalDesktopRecordsResponseBody create() {
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

        private Builder(DescribeGlobalDesktopRecordsResponseBody model) {
            this.requestId = model.requestId;
            this.sessions = model.sessions;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The session details.</p>
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

        public DescribeGlobalDesktopRecordsResponseBody build() {
            return new DescribeGlobalDesktopRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGlobalDesktopRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGlobalDesktopRecordsResponseBody</p>
     */
    public static class ResourceGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
        private String resourceGroupName;

        private ResourceGroups(Builder builder) {
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceGroupName = builder.resourceGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceGroups create() {
            return builder().build();
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceGroupName
         */
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public static final class Builder {
            private String resourceGroupId; 
            private String resourceGroupName; 

            private Builder() {
            } 

            private Builder(ResourceGroups model) {
                this.resourceGroupId = model.resourceGroupId;
                this.resourceGroupName = model.resourceGroupName;
            } 

            /**
             * <p>The ID of the enterprise resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-f3s3dgt8dtb0vlqc8</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The queried resource group name.</p>
             * 
             * <strong>example:</strong>
             * <p>dms_test</p>
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            public ResourceGroups build() {
                return new ResourceGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGlobalDesktopRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGlobalDesktopRecordsResponseBody</p>
     */
    public static class SessionsSessions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("EstablishmentTime")
        private String establishmentTime;

        private SessionsSessions(Builder builder) {
            this.endUserId = builder.endUserId;
            this.establishmentTime = builder.establishmentTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SessionsSessions create() {
            return builder().build();
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return establishmentTime
         */
        public String getEstablishmentTime() {
            return this.establishmentTime;
        }

        public static final class Builder {
            private String endUserId; 
            private String establishmentTime; 

            private Builder() {
            } 

            private Builder(SessionsSessions model) {
                this.endUserId = model.endUserId;
                this.establishmentTime = model.establishmentTime;
            } 

            /**
             * <p>The end user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>TestUser</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>The time when the session was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-31T06:56:45Z</p>
             */
            public Builder establishmentTime(String establishmentTime) {
                this.establishmentTime = establishmentTime;
                return this;
            }

            public SessionsSessions build() {
                return new SessionsSessions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGlobalDesktopRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGlobalDesktopRecordsResponseBody</p>
     */
    public static class Sessions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionStatus")
        private String connectionStatus;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("DesktopGroupId")
        private String desktopGroupId;

        @com.aliyun.core.annotation.NameInMap("DesktopGroupName")
        private String desktopGroupName;

        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("DesktopName")
        private String desktopName;

        @com.aliyun.core.annotation.NameInMap("DesktopStatus")
        private String desktopStatus;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("EndUserIds")
        private java.util.List<String> endUserIds;

        @com.aliyun.core.annotation.NameInMap("GpuSpec")
        private String gpuSpec;

        @com.aliyun.core.annotation.NameInMap("LatestConnectionTime")
        private Long latestConnectionTime;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Long memory;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteName")
        private String officeSiteName;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteType")
        private String officeSiteType;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroups")
        private java.util.List<ResourceGroups> resourceGroups;

        @com.aliyun.core.annotation.NameInMap("SessionIdleTime")
        private Long sessionIdleTime;

        @com.aliyun.core.annotation.NameInMap("Sessions")
        private java.util.List<SessionsSessions> sessions;

        @com.aliyun.core.annotation.NameInMap("StatusChangeTime")
        private Long statusChangeTime;

        @com.aliyun.core.annotation.NameInMap("SubPayType")
        private String subPayType;

        @com.aliyun.core.annotation.NameInMap("TotalConnectionTime")
        private Long totalConnectionTime;

        @com.aliyun.core.annotation.NameInMap("UpTime")
        private Long upTime;

        private Sessions(Builder builder) {
            this.connectionStatus = builder.connectionStatus;
            this.cpu = builder.cpu;
            this.desktopGroupId = builder.desktopGroupId;
            this.desktopGroupName = builder.desktopGroupName;
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
            this.desktopStatus = builder.desktopStatus;
            this.endUserId = builder.endUserId;
            this.endUserIds = builder.endUserIds;
            this.gpuSpec = builder.gpuSpec;
            this.latestConnectionTime = builder.latestConnectionTime;
            this.memory = builder.memory;
            this.officeSiteId = builder.officeSiteId;
            this.officeSiteName = builder.officeSiteName;
            this.officeSiteType = builder.officeSiteType;
            this.osType = builder.osType;
            this.platform = builder.platform;
            this.protocolType = builder.protocolType;
            this.regionId = builder.regionId;
            this.resourceGroups = builder.resourceGroups;
            this.sessionIdleTime = builder.sessionIdleTime;
            this.sessions = builder.sessions;
            this.statusChangeTime = builder.statusChangeTime;
            this.subPayType = builder.subPayType;
            this.totalConnectionTime = builder.totalConnectionTime;
            this.upTime = builder.upTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sessions create() {
            return builder().build();
        }

        /**
         * @return connectionStatus
         */
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
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
         * @return desktopName
         */
        public String getDesktopName() {
            return this.desktopName;
        }

        /**
         * @return desktopStatus
         */
        public String getDesktopStatus() {
            return this.desktopStatus;
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
         * @return gpuSpec
         */
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        /**
         * @return latestConnectionTime
         */
        public Long getLatestConnectionTime() {
            return this.latestConnectionTime;
        }

        /**
         * @return memory
         */
        public Long getMemory() {
            return this.memory;
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
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroups
         */
        public java.util.List<ResourceGroups> getResourceGroups() {
            return this.resourceGroups;
        }

        /**
         * @return sessionIdleTime
         */
        public Long getSessionIdleTime() {
            return this.sessionIdleTime;
        }

        /**
         * @return sessions
         */
        public java.util.List<SessionsSessions> getSessions() {
            return this.sessions;
        }

        /**
         * @return statusChangeTime
         */
        public Long getStatusChangeTime() {
            return this.statusChangeTime;
        }

        /**
         * @return subPayType
         */
        public String getSubPayType() {
            return this.subPayType;
        }

        /**
         * @return totalConnectionTime
         */
        public Long getTotalConnectionTime() {
            return this.totalConnectionTime;
        }

        /**
         * @return upTime
         */
        public Long getUpTime() {
            return this.upTime;
        }

        public static final class Builder {
            private String connectionStatus; 
            private Integer cpu; 
            private String desktopGroupId; 
            private String desktopGroupName; 
            private String desktopId; 
            private String desktopName; 
            private String desktopStatus; 
            private String endUserId; 
            private java.util.List<String> endUserIds; 
            private String gpuSpec; 
            private Long latestConnectionTime; 
            private Long memory; 
            private String officeSiteId; 
            private String officeSiteName; 
            private String officeSiteType; 
            private String osType; 
            private String platform; 
            private String protocolType; 
            private String regionId; 
            private java.util.List<ResourceGroups> resourceGroups; 
            private Long sessionIdleTime; 
            private java.util.List<SessionsSessions> sessions; 
            private Long statusChangeTime; 
            private String subPayType; 
            private Long totalConnectionTime; 
            private Long upTime; 

            private Builder() {
            } 

            private Builder(Sessions model) {
                this.connectionStatus = model.connectionStatus;
                this.cpu = model.cpu;
                this.desktopGroupId = model.desktopGroupId;
                this.desktopGroupName = model.desktopGroupName;
                this.desktopId = model.desktopId;
                this.desktopName = model.desktopName;
                this.desktopStatus = model.desktopStatus;
                this.endUserId = model.endUserId;
                this.endUserIds = model.endUserIds;
                this.gpuSpec = model.gpuSpec;
                this.latestConnectionTime = model.latestConnectionTime;
                this.memory = model.memory;
                this.officeSiteId = model.officeSiteId;
                this.officeSiteName = model.officeSiteName;
                this.officeSiteType = model.officeSiteType;
                this.osType = model.osType;
                this.platform = model.platform;
                this.protocolType = model.protocolType;
                this.regionId = model.regionId;
                this.resourceGroups = model.resourceGroups;
                this.sessionIdleTime = model.sessionIdleTime;
                this.sessions = model.sessions;
                this.statusChangeTime = model.statusChangeTime;
                this.subPayType = model.subPayType;
                this.totalConnectionTime = model.totalConnectionTime;
                this.upTime = model.upTime;
            } 

            /**
             * <p>The connection status of the cloud desktop.</p>
             * 
             * <strong>example:</strong>
             * <p>Connected</p>
             */
            public Builder connectionStatus(String connectionStatus) {
                this.connectionStatus = connectionStatus;
                return this;
            }

            /**
             * <p>The number of vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The ID of the cloud computer share.</p>
             * 
             * <strong>example:</strong>
             * <p>dg-iaqu3bi2xtie****</p>
             */
            public Builder desktopGroupId(String desktopGroupId) {
                this.desktopGroupId = desktopGroupId;
                return this;
            }

            /**
             * <p>The name of the cloud computer share.</p>
             * 
             * <strong>example:</strong>
             * <p>DemoCCGroup</p>
             */
            public Builder desktopGroupName(String desktopGroupName) {
                this.desktopGroupName = desktopGroupName;
                return this;
            }

            /**
             * <p>The cloud computer IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-g6t1ukbaea****</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The cloud computer name.</p>
             * 
             * <strong>example:</strong>
             * <p>DemoComputer</p>
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * <p>桌面状态</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder desktopStatus(String desktopStatus) {
                this.desktopStatus = desktopStatus;
                return this;
            }

            /**
             * <p>The end user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>TestUser</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>The list of assigned terminal user IDs.</p>
             */
            public Builder endUserIds(java.util.List<String> endUserIds) {
                this.endUserIds = endUserIds;
                return this;
            }

            /**
             * <p>The size of the GPU memory.</p>
             * 
             * <strong>example:</strong>
             * <p>8GiB</p>
             */
            public Builder gpuSpec(String gpuSpec) {
                this.gpuSpec = gpuSpec;
                return this;
            }

            /**
             * <p>The duration of the last connection to the cloud computer. Unit: seconds</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder latestConnectionTime(Long latestConnectionTime) {
                this.latestConnectionTime = latestConnectionTime;
                return this;
            }

            /**
             * <p>The memory of the cloud computer. Unit: MiB.</p>
             * 
             * <strong>example:</strong>
             * <p>4096</p>
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The office network ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+dir-8904****</p>
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * <p>The office network name.</p>
             * 
             * <strong>example:</strong>
             * <p>TestOfficeSite</p>
             */
            public Builder officeSiteName(String officeSiteName) {
                this.officeSiteName = officeSiteName;
                return this;
            }

            /**
             * OfficeSiteType.
             */
            public Builder officeSiteType(String officeSiteType) {
                this.officeSiteType = officeSiteType;
                return this;
            }

            /**
             * <p>The OS type. Valid values:</p>
             * <ul>
             * <li>Windows</li>
             * <li>Linux</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Linux</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * <p>The specific model of the operating system.</p>
             * 
             * <strong>example:</strong>
             * <p>Windows 10</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>Protocol type.</p>
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
             * <p>The ID of the region where the instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The name of the enterprise resource group.</p>
             */
            public Builder resourceGroups(java.util.List<ResourceGroups> resourceGroups) {
                this.resourceGroups = resourceGroups;
                return this;
            }

            /**
             * <p>The idle duration of the session. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder sessionIdleTime(Long sessionIdleTime) {
                this.sessionIdleTime = sessionIdleTime;
                return this;
            }

            /**
             * <p>The session details.</p>
             */
            public Builder sessions(java.util.List<SessionsSessions> sessions) {
                this.sessions = sessions;
                return this;
            }

            /**
             * <p>The time when the status of the cloud computer was changed.</p>
             * 
             * <strong>example:</strong>
             * <p>1760583xxxx</p>
             */
            public Builder statusChangeTime(Long statusChangeTime) {
                this.statusChangeTime = statusChangeTime;
                return this;
            }

            /**
             * <p>The billing method of the cloud computer. Valid values:</p>
             * <ul>
             * <li>prePaid: The monthly purchase is unlimited.</li>
             * <li>postPaid: pay-as-you-go</li>
             * <li>monthPackage: monthly duration.</li>
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
             * <p>The total connection duration. Unit: seconds</p>
             * 
             * <strong>example:</strong>
             * <p>240</p>
             */
            public Builder totalConnectionTime(Long totalConnectionTime) {
                this.totalConnectionTime = totalConnectionTime;
                return this;
            }

            /**
             * <p>The startup duration of the cloud computer. Unit: seconds</p>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder upTime(Long upTime) {
                this.upTime = upTime;
                return this;
            }

            public Sessions build() {
                return new Sessions(this);
            } 

        } 

    }
}
