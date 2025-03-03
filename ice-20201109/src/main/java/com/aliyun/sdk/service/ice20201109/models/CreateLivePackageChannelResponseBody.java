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
 * {@link CreateLivePackageChannelResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLivePackageChannelResponseBody</p>
 */
public class CreateLivePackageChannelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LivePackageChannel")
    private LivePackageChannel livePackageChannel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateLivePackageChannelResponseBody(Builder builder) {
        this.livePackageChannel = builder.livePackageChannel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLivePackageChannelResponseBody create() {
        return builder().build();
    }

    /**
     * @return livePackageChannel
     */
    public LivePackageChannel getLivePackageChannel() {
        return this.livePackageChannel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LivePackageChannel livePackageChannel; 
        private String requestId; 

        /**
         * <p>The information about the live package channel.</p>
         */
        public Builder livePackageChannel(LivePackageChannel livePackageChannel) {
            this.livePackageChannel = livePackageChannel;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateLivePackageChannelResponseBody build() {
            return new CreateLivePackageChannelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateLivePackageChannelResponseBody} extends {@link TeaModel}
     *
     * <p>CreateLivePackageChannelResponseBody</p>
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
             * <p>2F9e******b569c8</p>
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
     * {@link CreateLivePackageChannelResponseBody} extends {@link TeaModel}
     *
     * <p>CreateLivePackageChannelResponseBody</p>
     */
    public static class LivePackageChannel extends TeaModel {
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

        private LivePackageChannel(Builder builder) {
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

        public static LivePackageChannel create() {
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

            /**
             * <p>The channel name.</p>
             * 
             * <strong>example:</strong>
             * <p>example-channel</p>
             */
            public Builder channelName(String channelName) {
                this.channelName = channelName;
                return this;
            }

            /**
             * <p>The time when the channel was created. It is in the yyyy-MM-ddTHH:mm:ssZ format and displayed in UTC.</p>
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
             * <p>The time when the channel was last modified. It is in the yyyy-MM-ddTHH:mm:ssZ format and displayed in UTC.</p>
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

            public LivePackageChannel build() {
                return new LivePackageChannel(this);
            } 

        } 

    }
}
