// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeviceChannelsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDeviceChannelsResponseBody</p>
 */
public class DescribeDeviceChannelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Channels")
    private java.util.List < Channels> channels;

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

    private DescribeDeviceChannelsResponseBody(Builder builder) {
        this.channels = builder.channels;
        this.pageCount = builder.pageCount;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeviceChannelsResponseBody create() {
        return builder().build();
    }

    /**
     * @return channels
     */
    public java.util.List < Channels> getChannels() {
        return this.channels;
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
        private java.util.List < Channels> channels; 
        private Long pageCount; 
        private Long pageNum; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Channels.
         */
        public Builder channels(java.util.List < Channels> channels) {
            this.channels = channels;
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

        public DescribeDeviceChannelsResponseBody build() {
            return new DescribeDeviceChannelsResponseBody(this);
        } 

    } 

    public static class Channels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private Long channelId;

        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("DeviceStatus")
        private String deviceStatus;

        @com.aliyun.core.annotation.NameInMap("GbId")
        private String gbId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Params")
        private String params;

        @com.aliyun.core.annotation.NameInMap("StreamId")
        private String streamId;

        @com.aliyun.core.annotation.NameInMap("StreamStatus")
        private String streamStatus;

        private Channels(Builder builder) {
            this.channelId = builder.channelId;
            this.deviceId = builder.deviceId;
            this.deviceStatus = builder.deviceStatus;
            this.gbId = builder.gbId;
            this.name = builder.name;
            this.params = builder.params;
            this.streamId = builder.streamId;
            this.streamStatus = builder.streamStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Channels create() {
            return builder().build();
        }

        /**
         * @return channelId
         */
        public Long getChannelId() {
            return this.channelId;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return deviceStatus
         */
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        /**
         * @return gbId
         */
        public String getGbId() {
            return this.gbId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return params
         */
        public String getParams() {
            return this.params;
        }

        /**
         * @return streamId
         */
        public String getStreamId() {
            return this.streamId;
        }

        /**
         * @return streamStatus
         */
        public String getStreamStatus() {
            return this.streamStatus;
        }

        public static final class Builder {
            private Long channelId; 
            private String deviceId; 
            private String deviceStatus; 
            private String gbId; 
            private String name; 
            private String params; 
            private String streamId; 
            private String streamStatus; 

            /**
             * ChannelId.
             */
            public Builder channelId(Long channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * DeviceStatus.
             */
            public Builder deviceStatus(String deviceStatus) {
                this.deviceStatus = deviceStatus;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Params.
             */
            public Builder params(String params) {
                this.params = params;
                return this;
            }

            /**
             * StreamId.
             */
            public Builder streamId(String streamId) {
                this.streamId = streamId;
                return this;
            }

            /**
             * StreamStatus.
             */
            public Builder streamStatus(String streamStatus) {
                this.streamStatus = streamStatus;
                return this;
            }

            public Channels build() {
                return new Channels(this);
            } 

        } 

    }
}
