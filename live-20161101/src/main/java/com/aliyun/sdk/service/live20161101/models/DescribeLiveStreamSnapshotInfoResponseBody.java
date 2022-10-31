// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamSnapshotInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamSnapshotInfoResponseBody</p>
 */
public class DescribeLiveStreamSnapshotInfoResponseBody extends TeaModel {
    @NameInMap("LiveStreamSnapshotInfoList")
    private LiveStreamSnapshotInfoList liveStreamSnapshotInfoList;

    @NameInMap("NextStartTime")
    private String nextStartTime;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLiveStreamSnapshotInfoResponseBody(Builder builder) {
        this.liveStreamSnapshotInfoList = builder.liveStreamSnapshotInfoList;
        this.nextStartTime = builder.nextStartTime;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamSnapshotInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return liveStreamSnapshotInfoList
     */
    public LiveStreamSnapshotInfoList getLiveStreamSnapshotInfoList() {
        return this.liveStreamSnapshotInfoList;
    }

    /**
     * @return nextStartTime
     */
    public String getNextStartTime() {
        return this.nextStartTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LiveStreamSnapshotInfoList liveStreamSnapshotInfoList; 
        private String nextStartTime; 
        private String requestId; 

        /**
         * LiveStreamSnapshotInfoList.
         */
        public Builder liveStreamSnapshotInfoList(LiveStreamSnapshotInfoList liveStreamSnapshotInfoList) {
            this.liveStreamSnapshotInfoList = liveStreamSnapshotInfoList;
            return this;
        }

        /**
         * NextStartTime.
         */
        public Builder nextStartTime(String nextStartTime) {
            this.nextStartTime = nextStartTime;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveStreamSnapshotInfoResponseBody build() {
            return new DescribeLiveStreamSnapshotInfoResponseBody(this);
        } 

    } 

    public static class LiveStreamSnapshotInfo extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @NameInMap("IsOverlay")
        private Boolean isOverlay;

        @NameInMap("OssBucket")
        private String ossBucket;

        @NameInMap("OssEndpoint")
        private String ossEndpoint;

        @NameInMap("OssObject")
        private String ossObject;

        private LiveStreamSnapshotInfo(Builder builder) {
            this.createTime = builder.createTime;
            this.createTimestamp = builder.createTimestamp;
            this.isOverlay = builder.isOverlay;
            this.ossBucket = builder.ossBucket;
            this.ossEndpoint = builder.ossEndpoint;
            this.ossObject = builder.ossObject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveStreamSnapshotInfo create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return isOverlay
         */
        public Boolean getIsOverlay() {
            return this.isOverlay;
        }

        /**
         * @return ossBucket
         */
        public String getOssBucket() {
            return this.ossBucket;
        }

        /**
         * @return ossEndpoint
         */
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        /**
         * @return ossObject
         */
        public String getOssObject() {
            return this.ossObject;
        }

        public static final class Builder {
            private String createTime; 
            private Long createTimestamp; 
            private Boolean isOverlay; 
            private String ossBucket; 
            private String ossEndpoint; 
            private String ossObject; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateTimestamp.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * IsOverlay.
             */
            public Builder isOverlay(Boolean isOverlay) {
                this.isOverlay = isOverlay;
                return this;
            }

            /**
             * OssBucket.
             */
            public Builder ossBucket(String ossBucket) {
                this.ossBucket = ossBucket;
                return this;
            }

            /**
             * OssEndpoint.
             */
            public Builder ossEndpoint(String ossEndpoint) {
                this.ossEndpoint = ossEndpoint;
                return this;
            }

            /**
             * OssObject.
             */
            public Builder ossObject(String ossObject) {
                this.ossObject = ossObject;
                return this;
            }

            public LiveStreamSnapshotInfo build() {
                return new LiveStreamSnapshotInfo(this);
            } 

        } 

    }
    public static class LiveStreamSnapshotInfoList extends TeaModel {
        @NameInMap("LiveStreamSnapshotInfo")
        private java.util.List < LiveStreamSnapshotInfo> liveStreamSnapshotInfo;

        private LiveStreamSnapshotInfoList(Builder builder) {
            this.liveStreamSnapshotInfo = builder.liveStreamSnapshotInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveStreamSnapshotInfoList create() {
            return builder().build();
        }

        /**
         * @return liveStreamSnapshotInfo
         */
        public java.util.List < LiveStreamSnapshotInfo> getLiveStreamSnapshotInfo() {
            return this.liveStreamSnapshotInfo;
        }

        public static final class Builder {
            private java.util.List < LiveStreamSnapshotInfo> liveStreamSnapshotInfo; 

            /**
             * LiveStreamSnapshotInfo.
             */
            public Builder liveStreamSnapshotInfo(java.util.List < LiveStreamSnapshotInfo> liveStreamSnapshotInfo) {
                this.liveStreamSnapshotInfo = liveStreamSnapshotInfo;
                return this;
            }

            public LiveStreamSnapshotInfoList build() {
                return new LiveStreamSnapshotInfoList(this);
            } 

        } 

    }
}
