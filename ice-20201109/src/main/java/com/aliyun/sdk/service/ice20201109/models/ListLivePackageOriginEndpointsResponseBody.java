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
 * {@link ListLivePackageOriginEndpointsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLivePackageOriginEndpointsResponseBody</p>
 */
public class ListLivePackageOriginEndpointsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LivePackageOriginEndpoints")
    private java.util.List<LivePackageOriginEndpoints> livePackageOriginEndpoints;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListLivePackageOriginEndpointsResponseBody(Builder builder) {
        this.livePackageOriginEndpoints = builder.livePackageOriginEndpoints;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.sortBy = builder.sortBy;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLivePackageOriginEndpointsResponseBody create() {
        return builder().build();
    }

    /**
     * @return livePackageOriginEndpoints
     */
    public java.util.List<LivePackageOriginEndpoints> getLivePackageOriginEndpoints() {
        return this.livePackageOriginEndpoints;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
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
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<LivePackageOriginEndpoints> livePackageOriginEndpoints; 
        private Long pageNo; 
        private Long pageSize; 
        private String requestId; 
        private String sortBy; 
        private Long totalCount; 

        /**
         * <p>The origin endpoints returned.</p>
         */
        public Builder livePackageOriginEndpoints(java.util.List<LivePackageOriginEndpoints> livePackageOriginEndpoints) {
            this.livePackageOriginEndpoints = livePackageOriginEndpoints;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b9f90a7ac8904db28dc18e0c2a72c75d</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The sort order. Valid values: <code>asc</code> and <code>desc</code> (default).</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder sortBy(String sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListLivePackageOriginEndpointsResponseBody build() {
            return new ListLivePackageOriginEndpointsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLivePackageOriginEndpointsResponseBody} extends {@link TeaModel}
     *
     * <p>ListLivePackageOriginEndpointsResponseBody</p>
     */
    public static class LivePackageOriginEndpoints extends TeaModel {
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

        private LivePackageOriginEndpoints(Builder builder) {
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

        public static LivePackageOriginEndpoints create() {
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
             * <p>The authorization code.</p>
             * 
             * <strong>example:</strong>
             * <p>Abc123Def456</p>
             */
            public Builder authorizationCode(String authorizationCode) {
                this.authorizationCode = authorizationCode;
                return this;
            }

            /**
             * <p>The channel name.</p>
             * 
             * <strong>example:</strong>
             * <p>channel-1</p>
             */
            public Builder channelName(String channelName) {
                this.channelName = channelName;
                return this;
            }

            /**
             * <p>The time when the endpoint was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-01T12:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The endpoint description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The endpoint name.</p>
             * 
             * <strong>example:</strong>
             * <p>endpoint-1</p>
             */
            public Builder endpointName(String endpointName) {
                this.endpointName = endpointName;
                return this;
            }

            /**
             * <p>The endpoint URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxx.packagepull-abcxxx.ap-southeast-1.aliyuncsiceintl.com/v1/group01/1/ch01/manifest.m3u8">https://xxx.packagepull-abcxxx.ap-southeast-1.aliyuncsiceintl.com/v1/group01/1/ch01/manifest.m3u8</a></p>
             */
            public Builder endpointUrl(String endpointUrl) {
                this.endpointUrl = endpointUrl;
                return this;
            }

            /**
             * <p>The channel group name.</p>
             * 
             * <strong>example:</strong>
             * <p>channel-group-1</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The IP address blacklist.</p>
             * 
             * <strong>example:</strong>
             * <p>10.21.222.1/32,192.168.100.0/24</p>
             */
            public Builder ipBlacklist(String ipBlacklist) {
                this.ipBlacklist = ipBlacklist;
                return this;
            }

            /**
             * <p>The IP address whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.0/24,10.0.0.1/24</p>
             */
            public Builder ipWhitelist(String ipWhitelist) {
                this.ipWhitelist = ipWhitelist;
                return this;
            }

            /**
             * <p>The time when the endpoint was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-01T12:00:00Z</p>
             */
            public Builder lastModified(String lastModified) {
                this.lastModified = lastModified;
                return this;
            }

            /**
             * <p>The playlist name.</p>
             * 
             * <strong>example:</strong>
             * <p>manifest</p>
             */
            public Builder manifestName(String manifestName) {
                this.manifestName = manifestName;
                return this;
            }

            /**
             * <p>The distribution protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>HLS</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The number of days that time-shifted content is available.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder timeshiftVision(Integer timeshiftVision) {
                this.timeshiftVision = timeshiftVision;
                return this;
            }

            public LivePackageOriginEndpoints build() {
                return new LivePackageOriginEndpoints(this);
            } 

        } 

    }
}
