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
 * {@link DescribeGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGroupResponseBody</p>
 */
public class DescribeGroupResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Stats")
    private Stats stats;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeGroupResponseBody(Builder builder) {
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
        this.requestId = builder.requestId;
        this.stats = builder.stats;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String requestId; 
        private Stats stats; 
        private String status; 

        private Builder() {
        } 

        private Builder(DescribeGroupResponseBody model) {
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
            this.requestId = model.requestId;
            this.stats = model.stats;
            this.status = model.status;
        } 

        /**
         * <p>Alias for the space ID.</p>
         * 
         * <strong>example:</strong>
         * <p>337639*****24964-cn-qingdao</p>
         */
        public Builder aliasId(String aliasId) {
            this.aliasId = aliasId;
            return this;
        }

        /**
         * <p>The name of the application used by the group.</p>
         * 
         * <strong>example:</strong>
         * <p>live</p>
         */
        public Builder app(String app) {
            this.app = app;
            return this;
        }

        /**
         * <p>The callback URL that is used to receive device status updates in the group.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com/callback">http://example.com/callback</a></p>
         */
        public Builder callback(String callback) {
            this.callback = callback;
            return this;
        }

        /**
         * <p>The time when the group was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-28T17:00:17Z</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>A description of the group.</p>
         * 
         * <strong>example:</strong>
         * <p>上海高速监控</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Indicates whether the group is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The GB/T 28181 ID that is associated with the group.</p>
         * <blockquote>
         * <p>This parameter is returned only for groups that use the GB/T 28181 protocol for stream ingest.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3100000*****0000001</p>
         */
        public Builder gbId(String gbId) {
            this.gbId = gbId;
            return this;
        }

        /**
         * <p>The IP address of the GB/T 28181 signaling server that is associated with the group.</p>
         * <blockquote>
         * <p>This parameter is returned only for groups that use the GB/T 28181 protocol for stream ingest.</p>
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
         * <p>The port of the GB/T 28181 signaling server that is associated with the group.</p>
         * <blockquote>
         * <p>This parameter is returned only for groups that use the GB/T 28181 protocol for stream ingest.</p>
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
         * <p>The TCP ports of the GB/T 28181 signaling server that are provided by the group.</p>
         * <blockquote>
         * <p>This parameter is returned only for groups that use the GB/T 28181 protocol for stream ingest.</p>
         * </blockquote>
         */
        public Builder gbTcpPorts(java.util.List<String> gbTcpPorts) {
            this.gbTcpPorts = gbTcpPorts;
            return this;
        }

        /**
         * <p>The UDP ports of the GB/T 28181 signaling server that are provided by the group.</p>
         * <blockquote>
         * <p>This parameter is returned only for groups that use the GB/T 28181 protocol for stream ingest.</p>
         * </blockquote>
         */
        public Builder gbUdpPorts(java.util.List<String> gbUdpPorts) {
            this.gbUdpPorts = gbUdpPorts;
            return this;
        }

        /**
         * <p>The ID of the space.</p>
         * 
         * <strong>example:</strong>
         * <p>337639****224964-cn-qingdao</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The ingest protocol used by the group. Valid values:</p>
         * <ul>
         * <li><p>gb28181</p>
         * </li>
         * <li><p>rtmp</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>gb28181</p>
         */
        public Builder inProtocol(String inProtocol) {
            this.inProtocol = inProtocol;
            return this;
        }

        /**
         * <p>Indicates whether on-demand stream pulling is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder lazyPull(Boolean lazyPull) {
            this.lazyPull = lazyPull;
            return this;
        }

        /**
         * <p>The name of the space.</p>
         * 
         * <strong>example:</strong>
         * <p>上海高速监控</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The streaming protocol used by the group. Valid values:</p>
         * <ul>
         * <li><p>flv</p>
         * </li>
         * <li><p>hls</p>
         * </li>
         * <li><p>rtmp</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>You can specify multiple protocols. Separate them with commas (,).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>flv,hls,rtmp</p>
         */
        public Builder outProtocol(String outProtocol) {
            this.outProtocol = outProtocol;
            return this;
        }

        /**
         * <p>The streaming domain used by the group.</p>
         * 
         * <strong>example:</strong>
         * <p>example.aliyundoc.com</p>
         */
        public Builder playDomain(String playDomain) {
            this.playDomain = playDomain;
            return this;
        }

        /**
         * <p>The ingest domain used by the group.</p>
         * 
         * <strong>example:</strong>
         * <p>demo.aliyundoc.com</p>
         */
        public Builder pushDomain(String pushDomain) {
            this.pushDomain = pushDomain;
            return this;
        }

        /**
         * <p>The region where the space is located, which is the service center.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The statistics of devices in the group.</p>
         */
        public Builder stats(Stats stats) {
            this.stats = stats;
            return this;
        }

        /**
         * <p>The status of the group.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeGroupResponseBody build() {
            return new DescribeGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGroupResponseBody</p>
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
             * <p>The total number of devices in the group.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder deviceNum(Long deviceNum) {
                this.deviceNum = deviceNum;
                return this;
            }

            /**
             * <p>The number of intelligent electronic devices (IEDs) in the group.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder iedNum(Long iedNum) {
                this.iedNum = iedNum;
                return this;
            }

            /**
             * <p>The number of cameras in the group.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder ipcNum(Long ipcNum) {
                this.ipcNum = ipcNum;
                return this;
            }

            /**
             * <p>The number of platforms in the group.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
}
