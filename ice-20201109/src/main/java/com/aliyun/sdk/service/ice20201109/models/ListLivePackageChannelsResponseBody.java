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
 * {@link ListLivePackageChannelsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLivePackageChannelsResponseBody</p>
 */
public class ListLivePackageChannelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LivePackageChannels")
    private java.util.List<LivePackageChannels> livePackageChannels;

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

    private ListLivePackageChannelsResponseBody(Builder builder) {
        this.livePackageChannels = builder.livePackageChannels;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.sortBy = builder.sortBy;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLivePackageChannelsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return livePackageChannels
     */
    public java.util.List<LivePackageChannels> getLivePackageChannels() {
        return this.livePackageChannels;
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
        private java.util.List<LivePackageChannels> livePackageChannels; 
        private Long pageNo; 
        private Long pageSize; 
        private String requestId; 
        private String sortBy; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListLivePackageChannelsResponseBody model) {
            this.livePackageChannels = model.livePackageChannels;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.sortBy = model.sortBy;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The live package channels.</p>
         */
        public Builder livePackageChannels(java.util.List<LivePackageChannels> livePackageChannels) {
            this.livePackageChannels = livePackageChannels;
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
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
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
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The sort order. Valid values: asc and desc (default).</p>
         * 
         * <strong>example:</strong>
         * <p>asc/desc</p>
         */
        public Builder sortBy(String sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListLivePackageChannelsResponseBody build() {
            return new ListLivePackageChannelsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLivePackageChannelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListLivePackageChannelsResponseBody</p>
     */
    public static class IngestEndpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private IngestEndpoints(Builder builder) {
            this.id = builder.id;
            this.password = builder.password;
            this.url = builder.url;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IngestEndpoints create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String id; 
            private String password; 
            private String url; 
            private String username; 

            private Builder() {
            } 

            private Builder(IngestEndpoints model) {
                this.id = model.id;
                this.password = model.password;
                this.url = model.url;
                this.username = model.username;
            } 

            /**
             * <p>The ingest endpoint ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ingest1</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The password.</p>
             * 
             * <strong>example:</strong>
             * <p>2F9e9******18b569c8</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The ingest endpoint URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxx-1.packagepush-abcxxx.ap-southeast-1.aliyuncsiceintl.com/v1/group01/1/ch01/manifest">http://xxx-1.packagepush-abcxxx.ap-southeast-1.aliyuncsiceintl.com/v1/group01/1/ch01/manifest</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>us12******das</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public IngestEndpoints build() {
                return new IngestEndpoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListLivePackageChannelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListLivePackageChannelsResponseBody</p>
     */
    public static class LivePackageChannels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelName")
        private String channelName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("IngestEndpoints")
        private java.util.List<IngestEndpoints> ingestEndpoints;

        @com.aliyun.core.annotation.NameInMap("LastModified")
        private String lastModified;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("SegmentCount")
        private Integer segmentCount;

        @com.aliyun.core.annotation.NameInMap("SegmentDuration")
        private Integer segmentDuration;

        private LivePackageChannels(Builder builder) {
            this.channelName = builder.channelName;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.groupName = builder.groupName;
            this.ingestEndpoints = builder.ingestEndpoints;
            this.lastModified = builder.lastModified;
            this.protocol = builder.protocol;
            this.segmentCount = builder.segmentCount;
            this.segmentDuration = builder.segmentDuration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LivePackageChannels create() {
            return builder().build();
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
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return ingestEndpoints
         */
        public java.util.List<IngestEndpoints> getIngestEndpoints() {
            return this.ingestEndpoints;
        }

        /**
         * @return lastModified
         */
        public String getLastModified() {
            return this.lastModified;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return segmentCount
         */
        public Integer getSegmentCount() {
            return this.segmentCount;
        }

        /**
         * @return segmentDuration
         */
        public Integer getSegmentDuration() {
            return this.segmentDuration;
        }

        public static final class Builder {
            private String channelName; 
            private String createTime; 
            private String description; 
            private String groupName; 
            private java.util.List<IngestEndpoints> ingestEndpoints; 
            private String lastModified; 
            private String protocol; 
            private Integer segmentCount; 
            private Integer segmentDuration; 

            private Builder() {
            } 

            private Builder(LivePackageChannels model) {
                this.channelName = model.channelName;
                this.createTime = model.createTime;
                this.description = model.description;
                this.groupName = model.groupName;
                this.ingestEndpoints = model.ingestEndpoints;
                this.lastModified = model.lastModified;
                this.protocol = model.protocol;
                this.segmentCount = model.segmentCount;
                this.segmentDuration = model.segmentDuration;
            } 

            /**
             * <p>The channel name.</p>
             * 
             * <strong>example:</strong>
             * <p>ch3</p>
             */
            public Builder channelName(String channelName) {
                this.channelName = channelName;
                return this;
            }

            /**
             * <p>The time when the channel was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-01T12:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The channel description.</p>
             */
            public Builder description(String description) {
                this.description = description;
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
             * <p>The ingest endpoints.</p>
             */
            public Builder ingestEndpoints(java.util.List<IngestEndpoints> ingestEndpoints) {
                this.ingestEndpoints = ingestEndpoints;
                return this;
            }

            /**
             * <p>The time when the channel was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-01T12:00:00Z</p>
             */
            public Builder lastModified(String lastModified) {
                this.lastModified = lastModified;
                return this;
            }

            /**
             * <p>The ingest protocol. Only HLS is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>HLS</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The number of M3U8 segments.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder segmentCount(Integer segmentCount) {
                this.segmentCount = segmentCount;
                return this;
            }

            /**
             * <p>The segment duration.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder segmentDuration(Integer segmentDuration) {
                this.segmentDuration = segmentDuration;
                return this;
            }

            public LivePackageChannels build() {
                return new LivePackageChannels(this);
            } 

        } 

    }
}
