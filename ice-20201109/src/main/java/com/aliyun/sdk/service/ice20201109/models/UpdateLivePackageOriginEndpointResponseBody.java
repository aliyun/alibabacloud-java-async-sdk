// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link UpdateLivePackageOriginEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateLivePackageOriginEndpointResponseBody</p>
 */
public class UpdateLivePackageOriginEndpointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LivePackageOriginEndpoint")
    private LivePackageOriginEndpoint livePackageOriginEndpoint;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateLivePackageOriginEndpointResponseBody(Builder builder) {
        this.livePackageOriginEndpoint = builder.livePackageOriginEndpoint;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLivePackageOriginEndpointResponseBody create() {
        return builder().build();
    }

    /**
     * @return livePackageOriginEndpoint
     */
    public LivePackageOriginEndpoint getLivePackageOriginEndpoint() {
        return this.livePackageOriginEndpoint;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LivePackageOriginEndpoint livePackageOriginEndpoint; 
        private String requestId; 

        /**
         * LivePackageOriginEndpoint.
         */
        public Builder livePackageOriginEndpoint(LivePackageOriginEndpoint livePackageOriginEndpoint) {
            this.livePackageOriginEndpoint = livePackageOriginEndpoint;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateLivePackageOriginEndpointResponseBody build() {
            return new UpdateLivePackageOriginEndpointResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateLivePackageOriginEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateLivePackageOriginEndpointResponseBody</p>
     */
    public static class LivePackageOriginEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizationCode")
        private String authorizationCode;

        @com.aliyun.core.annotation.NameInMap("ChannelName")
        private String channelName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EndpointName")
        private String endpointName;

        @com.aliyun.core.annotation.NameInMap("EndpointUrl")
        private String endpointUrl;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("IpBlacklist")
        private String ipBlacklist;

        @com.aliyun.core.annotation.NameInMap("IpWhitelist")
        private String ipWhitelist;

        @com.aliyun.core.annotation.NameInMap("LastModified")
        private String lastModified;

        @com.aliyun.core.annotation.NameInMap("ManifestName")
        private String manifestName;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("TimeshiftVision")
        private Integer timeshiftVision;

        private LivePackageOriginEndpoint(Builder builder) {
            this.authorizationCode = builder.authorizationCode;
            this.channelName = builder.channelName;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.endpointName = builder.endpointName;
            this.endpointUrl = builder.endpointUrl;
            this.groupName = builder.groupName;
            this.ipBlacklist = builder.ipBlacklist;
            this.ipWhitelist = builder.ipWhitelist;
            this.lastModified = builder.lastModified;
            this.manifestName = builder.manifestName;
            this.protocol = builder.protocol;
            this.timeshiftVision = builder.timeshiftVision;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LivePackageOriginEndpoint create() {
            return builder().build();
        }

        /**
         * @return authorizationCode
         */
        public String getAuthorizationCode() {
            return this.authorizationCode;
        }

        /**
         * @return channelName
         */
        public String getChannelName() {
            return this.channelName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endpointName
         */
        public String getEndpointName() {
            return this.endpointName;
        }

        /**
         * @return endpointUrl
         */
        public String getEndpointUrl() {
            return this.endpointUrl;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return ipBlacklist
         */
        public String getIpBlacklist() {
            return this.ipBlacklist;
        }

        /**
         * @return ipWhitelist
         */
        public String getIpWhitelist() {
            return this.ipWhitelist;
        }

        /**
         * @return lastModified
         */
        public String getLastModified() {
            return this.lastModified;
        }

        /**
         * @return manifestName
         */
        public String getManifestName() {
            return this.manifestName;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return timeshiftVision
         */
        public Integer getTimeshiftVision() {
            return this.timeshiftVision;
        }

        public static final class Builder {
            private String authorizationCode; 
            private String channelName; 
            private String createTime; 
            private String description; 
            private String endpointName; 
            private String endpointUrl; 
            private String groupName; 
            private String ipBlacklist; 
            private String ipWhitelist; 
            private String lastModified; 
            private String manifestName; 
            private String protocol; 
            private Integer timeshiftVision; 

            /**
             * <p>回源授权码，与IpWhitelist必选其一</p>
             * 
             * <strong>example:</strong>
             * <p>Abc123Def456</p>
             */
            public Builder authorizationCode(String authorizationCode) {
                this.authorizationCode = authorizationCode;
                return this;
            }

            /**
             * <p>频道名称</p>
             * 
             * <strong>example:</strong>
             * <p>channel-1</p>
             */
            public Builder channelName(String channelName) {
                this.channelName = channelName;
                return this;
            }

            /**
             * <p>创建时间</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-01T12:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>端点描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>端点名称</p>
             * 
             * <strong>example:</strong>
             * <p>endpoint-1</p>
             */
            public Builder endpointName(String endpointName) {
                this.endpointName = endpointName;
                return this;
            }

            /**
             * <p>源站端点回源播放地址</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxx.packagepull-abcxxx.ap-southeast-1.aliyuncsiceintl.com/v1/group01/1/ch01/manifest">https://xxx.packagepull-abcxxx.ap-southeast-1.aliyuncsiceintl.com/v1/group01/1/ch01/manifest</a></p>
             */
            public Builder endpointUrl(String endpointUrl) {
                this.endpointUrl = endpointUrl;
                return this;
            }

            /**
             * <p>频道组名称</p>
             * 
             * <strong>example:</strong>
             * <p>channel-group-1</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>IP黑名单，支持无类别域间路由（CIDR），逗号分隔</p>
             * 
             * <strong>example:</strong>
             * <p>10.21.222.1/32,192.168.100.0/24</p>
             */
            public Builder ipBlacklist(String ipBlacklist) {
                this.ipBlacklist = ipBlacklist;
                return this;
            }

            /**
             * <p>IP白名单，支持无类别域间路由（CIDR），逗号分隔，与AuthorizationCode必选其一</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.0/24,10.0.0.1/24</p>
             */
            public Builder ipWhitelist(String ipWhitelist) {
                this.ipWhitelist = ipWhitelist;
                return this;
            }

            /**
             * <p>最后修改时间</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-01T12:00:00Z</p>
             */
            public Builder lastModified(String lastModified) {
                this.lastModified = lastModified;
                return this;
            }

            /**
             * <p>播放列表名</p>
             * 
             * <strong>example:</strong>
             * <p>manifest</p>
             */
            public Builder manifestName(String manifestName) {
                this.manifestName = manifestName;
                return this;
            }

            /**
             * <p>端点分发协议，暂只支持HLS</p>
             * 
             * <strong>example:</strong>
             * <p>HLS</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>时移天数，最大30天，0表示不支持时移</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder timeshiftVision(Integer timeshiftVision) {
                this.timeshiftVision = timeshiftVision;
                return this;
            }

            public LivePackageOriginEndpoint build() {
                return new LivePackageOriginEndpoint(this);
            } 

        } 

    }
}
