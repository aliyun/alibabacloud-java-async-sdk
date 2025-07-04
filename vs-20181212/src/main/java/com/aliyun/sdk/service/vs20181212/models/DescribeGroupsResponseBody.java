// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DescribeGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGroupsResponseBody</p>
 */
public class DescribeGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Groups")
    private java.util.List<Groups> groups;

    @com.aliyun.core.annotation.NameInMap("PageCount")
    private Long pageCount;

    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Long pageNum;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeGroupsResponseBody(Builder builder) {
        this.groups = builder.groups;
        this.pageCount = builder.pageCount;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groups
     */
    public java.util.List<Groups> getGroups() {
        return this.groups;
    }

    /**
     * @return pageCount
     */
    public Long getPageCount() {
        return this.pageCount;
    }

    /**
     * @return pageNum
     */
    public Long getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Groups> groups; 
        private Long pageCount; 
        private Long pageNum; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeGroupsResponseBody model) {
            this.groups = model.groups;
            this.pageCount = model.pageCount;
            this.pageNum = model.pageNum;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Groups.
         */
        public Builder groups(java.util.List<Groups> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * PageCount.
         */
        public Builder pageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeGroupsResponseBody build() {
            return new DescribeGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGroupsResponseBody</p>
     */
    public static class Stats extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceNum")
        private Long deviceNum;

        @com.aliyun.core.annotation.NameInMap("IedNum")
        private Long iedNum;

        @com.aliyun.core.annotation.NameInMap("IpcNum")
        private Long ipcNum;

        @com.aliyun.core.annotation.NameInMap("PlatformNum")
        private Long platformNum;

        private Stats(Builder builder) {
            this.deviceNum = builder.deviceNum;
            this.iedNum = builder.iedNum;
            this.ipcNum = builder.ipcNum;
            this.platformNum = builder.platformNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Stats create() {
            return builder().build();
        }

        /**
         * @return deviceNum
         */
        public Long getDeviceNum() {
            return this.deviceNum;
        }

        /**
         * @return iedNum
         */
        public Long getIedNum() {
            return this.iedNum;
        }

        /**
         * @return ipcNum
         */
        public Long getIpcNum() {
            return this.ipcNum;
        }

        /**
         * @return platformNum
         */
        public Long getPlatformNum() {
            return this.platformNum;
        }

        public static final class Builder {
            private Long deviceNum; 
            private Long iedNum; 
            private Long ipcNum; 
            private Long platformNum; 

            private Builder() {
            } 

            private Builder(Stats model) {
                this.deviceNum = model.deviceNum;
                this.iedNum = model.iedNum;
                this.ipcNum = model.ipcNum;
                this.platformNum = model.platformNum;
            } 

            /**
             * DeviceNum.
             */
            public Builder deviceNum(Long deviceNum) {
                this.deviceNum = deviceNum;
                return this;
            }

            /**
             * IedNum.
             */
            public Builder iedNum(Long iedNum) {
                this.iedNum = iedNum;
                return this;
            }

            /**
             * IpcNum.
             */
            public Builder ipcNum(Long ipcNum) {
                this.ipcNum = ipcNum;
                return this;
            }

            /**
             * PlatformNum.
             */
            public Builder platformNum(Long platformNum) {
                this.platformNum = platformNum;
                return this;
            }

            public Stats build() {
                return new Stats(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGroupsResponseBody</p>
     */
    public static class Groups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliasId")
        private String aliasId;

        @com.aliyun.core.annotation.NameInMap("App")
        private String app;

        @com.aliyun.core.annotation.NameInMap("Callback")
        private String callback;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("GbId")
        private String gbId;

        @com.aliyun.core.annotation.NameInMap("GbIp")
        private String gbIp;

        @com.aliyun.core.annotation.NameInMap("GbPort")
        private Long gbPort;

        @com.aliyun.core.annotation.NameInMap("GbTcpPorts")
        private java.util.List<String> gbTcpPorts;

        @com.aliyun.core.annotation.NameInMap("GbUdpPorts")
        private java.util.List<String> gbUdpPorts;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("InProtocol")
        private String inProtocol;

        @com.aliyun.core.annotation.NameInMap("LazyPull")
        private Boolean lazyPull;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OutProtocol")
        private String outProtocol;

        @com.aliyun.core.annotation.NameInMap("PlayDomain")
        private String playDomain;

        @com.aliyun.core.annotation.NameInMap("PushDomain")
        private String pushDomain;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Stats")
        private Stats stats;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Groups(Builder builder) {
            this.aliasId = builder.aliasId;
            this.app = builder.app;
            this.callback = builder.callback;
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.enabled = builder.enabled;
            this.gbId = builder.gbId;
            this.gbIp = builder.gbIp;
            this.gbPort = builder.gbPort;
            this.gbTcpPorts = builder.gbTcpPorts;
            this.gbUdpPorts = builder.gbUdpPorts;
            this.id = builder.id;
            this.inProtocol = builder.inProtocol;
            this.lazyPull = builder.lazyPull;
            this.name = builder.name;
            this.outProtocol = builder.outProtocol;
            this.playDomain = builder.playDomain;
            this.pushDomain = builder.pushDomain;
            this.region = builder.region;
            this.stats = builder.stats;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Groups create() {
            return builder().build();
        }

        /**
         * @return aliasId
         */
        public String getAliasId() {
            return this.aliasId;
        }

        /**
         * @return app
         */
        public String getApp() {
            return this.app;
        }

        /**
         * @return callback
         */
        public String getCallback() {
            return this.callback;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return gbId
         */
        public String getGbId() {
            return this.gbId;
        }

        /**
         * @return gbIp
         */
        public String getGbIp() {
            return this.gbIp;
        }

        /**
         * @return gbPort
         */
        public Long getGbPort() {
            return this.gbPort;
        }

        /**
         * @return gbTcpPorts
         */
        public java.util.List<String> getGbTcpPorts() {
            return this.gbTcpPorts;
        }

        /**
         * @return gbUdpPorts
         */
        public java.util.List<String> getGbUdpPorts() {
            return this.gbUdpPorts;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return inProtocol
         */
        public String getInProtocol() {
            return this.inProtocol;
        }

        /**
         * @return lazyPull
         */
        public Boolean getLazyPull() {
            return this.lazyPull;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outProtocol
         */
        public String getOutProtocol() {
            return this.outProtocol;
        }

        /**
         * @return playDomain
         */
        public String getPlayDomain() {
            return this.playDomain;
        }

        /**
         * @return pushDomain
         */
        public String getPushDomain() {
            return this.pushDomain;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return stats
         */
        public Stats getStats() {
            return this.stats;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String aliasId; 
            private String app; 
            private String callback; 
            private String createdTime; 
            private String description; 
            private Boolean enabled; 
            private String gbId; 
            private String gbIp; 
            private Long gbPort; 
            private java.util.List<String> gbTcpPorts; 
            private java.util.List<String> gbUdpPorts; 
            private String id; 
            private String inProtocol; 
            private Boolean lazyPull; 
            private String name; 
            private String outProtocol; 
            private String playDomain; 
            private String pushDomain; 
            private String region; 
            private Stats stats; 
            private String status; 

            private Builder() {
            } 

            private Builder(Groups model) {
                this.aliasId = model.aliasId;
                this.app = model.app;
                this.callback = model.callback;
                this.createdTime = model.createdTime;
                this.description = model.description;
                this.enabled = model.enabled;
                this.gbId = model.gbId;
                this.gbIp = model.gbIp;
                this.gbPort = model.gbPort;
                this.gbTcpPorts = model.gbTcpPorts;
                this.gbUdpPorts = model.gbUdpPorts;
                this.id = model.id;
                this.inProtocol = model.inProtocol;
                this.lazyPull = model.lazyPull;
                this.name = model.name;
                this.outProtocol = model.outProtocol;
                this.playDomain = model.playDomain;
                this.pushDomain = model.pushDomain;
                this.region = model.region;
                this.stats = model.stats;
                this.status = model.status;
            } 

            /**
             * AliasId.
             */
            public Builder aliasId(String aliasId) {
                this.aliasId = aliasId;
                return this;
            }

            /**
             * App.
             */
            public Builder app(String app) {
                this.app = app;
                return this;
            }

            /**
             * Callback.
             */
            public Builder callback(String callback) {
                this.callback = callback;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * GbId.
             */
            public Builder gbId(String gbId) {
                this.gbId = gbId;
                return this;
            }

            /**
             * GbIp.
             */
            public Builder gbIp(String gbIp) {
                this.gbIp = gbIp;
                return this;
            }

            /**
             * GbPort.
             */
            public Builder gbPort(Long gbPort) {
                this.gbPort = gbPort;
                return this;
            }

            /**
             * GbTcpPorts.
             */
            public Builder gbTcpPorts(java.util.List<String> gbTcpPorts) {
                this.gbTcpPorts = gbTcpPorts;
                return this;
            }

            /**
             * GbUdpPorts.
             */
            public Builder gbUdpPorts(java.util.List<String> gbUdpPorts) {
                this.gbUdpPorts = gbUdpPorts;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * InProtocol.
             */
            public Builder inProtocol(String inProtocol) {
                this.inProtocol = inProtocol;
                return this;
            }

            /**
             * LazyPull.
             */
            public Builder lazyPull(Boolean lazyPull) {
                this.lazyPull = lazyPull;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OutProtocol.
             */
            public Builder outProtocol(String outProtocol) {
                this.outProtocol = outProtocol;
                return this;
            }

            /**
             * PlayDomain.
             */
            public Builder playDomain(String playDomain) {
                this.playDomain = playDomain;
                return this;
            }

            /**
             * PushDomain.
             */
            public Builder pushDomain(String pushDomain) {
                this.pushDomain = pushDomain;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Stats.
             */
            public Builder stats(Stats stats) {
                this.stats = stats;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Groups build() {
                return new Groups(this);
            } 

        } 

    }
}
