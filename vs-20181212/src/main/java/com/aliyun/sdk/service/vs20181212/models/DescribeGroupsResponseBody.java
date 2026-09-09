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
         * <p>List of groups.</p>
         */
        public Builder groups(java.util.List<Groups> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * <p>Total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        /**
         * <p>Page number.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder pageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>Number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of groups.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
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
             * <p>Total number of devices in the group.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder deviceNum(Long deviceNum) {
                this.deviceNum = deviceNum;
                return this;
            }

            /**
             * <p>Number of intelligent devices in the group.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder iedNum(Long iedNum) {
                this.iedNum = iedNum;
                return this;
            }

            /**
             * <p>Number of cameras in the group.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder ipcNum(Long ipcNum) {
                this.ipcNum = ipcNum;
                return this;
            }

            /**
             * <p>Number of platforms in the group.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
             * <p>Alias for the group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>337639*****24964-cn-qingdao</p>
             */
            public Builder aliasId(String aliasId) {
                this.aliasId = aliasId;
                return this;
            }

            /**
             * <p>Application name used by the group.</p>
             * 
             * <strong>example:</strong>
             * <p>live</p>
             */
            public Builder app(String app) {
                this.app = app;
                return this;
            }

            /**
             * <p>Callback URL for device status updates in the group.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.com/callback">http://example.com/callback</a></p>
             */
            public Builder callback(String callback) {
                this.callback = callback;
                return this;
            }

            /**
             * <p>Time when the group was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-02-28T17:00:17Z</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>Group description.</p>
             * 
             * <strong>example:</strong>
             * <p>测试视图计算</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Whether the group is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>GB ID provided by the group.</p>
             * <blockquote>
             * <p>This applies only to groups that use the GB protocol.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>31000000000000000001</p>
             */
            public Builder gbId(String gbId) {
                this.gbId = gbId;
                return this;
            }

            /**
             * <p>GB signaling server IP address provided by the group.</p>
             * <blockquote>
             * <p>This applies only to groups that use the GB protocol.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10.10.10.10</p>
             */
            public Builder gbIp(String gbIp) {
                this.gbIp = gbIp;
                return this;
            }

            /**
             * <p>GB signaling server port associated with the group.</p>
             * <blockquote>
             * <p>This applies only to groups that use the GB protocol.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>5060</p>
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
             * <p>Group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>33763950877224964-cn-qingdao</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Ingest protocol used by the group.</p>
             * 
             * <strong>example:</strong>
             * <p>gb28181</p>
             */
            public Builder inProtocol(String inProtocol) {
                this.inProtocol = inProtocol;
                return this;
            }

            /**
             * <p>Whether on-demand stream pulling is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder lazyPull(Boolean lazyPull) {
                this.lazyPull = lazyPull;
                return this;
            }

            /**
             * <p>Group name.</p>
             * 
             * <strong>example:</strong>
             * <p>我的空间</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Playback protocol used by the group.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp,flv,hls</p>
             */
            public Builder outProtocol(String outProtocol) {
                this.outProtocol = outProtocol;
                return this;
            }

            /**
             * <p>Streaming domain used by the group.</p>
             * 
             * <strong>example:</strong>
             * <p>demo.aliyundoc.com</p>
             */
            public Builder playDomain(String playDomain) {
                this.playDomain = playDomain;
                return this;
            }

            /**
             * <p>Ingest domain used by the group.</p>
             * 
             * <strong>example:</strong>
             * <p>example.aliyundoc.com</p>
             */
            public Builder pushDomain(String pushDomain) {
                this.pushDomain = pushDomain;
                return this;
            }

            /**
             * <p>The region where the space is located. This region serves as the service center.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-qingdao</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>Device statistics for the group.</p>
             */
            public Builder stats(Stats stats) {
                this.stats = stats;
                return this;
            }

            /**
             * <p>Group status. Valid values:</p>
             * <ul>
             * <li><p>on (enabled)</p>
             * </li>
             * <li><p>off (disabled)</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
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
