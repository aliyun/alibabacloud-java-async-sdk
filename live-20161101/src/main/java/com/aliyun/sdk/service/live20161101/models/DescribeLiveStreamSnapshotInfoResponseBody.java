// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveStreamSnapshotInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamSnapshotInfoResponseBody</p>
 */
public class DescribeLiveStreamSnapshotInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LiveStreamSnapshotInfoList")
    private LiveStreamSnapshotInfoList liveStreamSnapshotInfoList;

    @com.aliyun.core.annotation.NameInMap("NextStartTime")
    private String nextStartTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeLiveStreamSnapshotInfoResponseBody model) {
            this.liveStreamSnapshotInfoList = model.liveStreamSnapshotInfoList;
            this.nextStartTime = model.nextStartTime;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The snapshots.</p>
         */
        public Builder liveStreamSnapshotInfoList(LiveStreamSnapshotInfoList liveStreamSnapshotInfoList) {
            this.liveStreamSnapshotInfoList = liveStreamSnapshotInfoList;
            return this;
        }

        /**
         * <p>The time when the next call occurred. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * <blockquote>
         * <p> If the number of snapshots that were captured within the specified time period exceeds the value of the Limit parameter, this parameter is returned. It indicates the time when the DescribeLiveStreamSnapshotInfo operation was called again. If this parameter is not returned, the number of snapshots that are captured within the specified time period does not exceed the specified limit.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2015-12-01T17:36:00Z</p>
         */
        public Builder nextStartTime(String nextStartTime) {
            this.nextStartTime = nextStartTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>62136AE6-7793-45ED-B14A-60D19A9486D3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveStreamSnapshotInfoResponseBody build() {
            return new DescribeLiveStreamSnapshotInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveStreamSnapshotInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamSnapshotInfoResponseBody</p>
     */
    public static class LiveStreamSnapshotInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("IsOverlay")
        private Boolean isOverlay;

        @com.aliyun.core.annotation.NameInMap("OssBucket")
        private String ossBucket;

        @com.aliyun.core.annotation.NameInMap("OssEndpoint")
        private String ossEndpoint;

        @com.aliyun.core.annotation.NameInMap("OssObject")
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

            private Builder() {
            } 

            private Builder(LiveStreamSnapshotInfo model) {
                this.createTime = model.createTime;
                this.createTimestamp = model.createTimestamp;
                this.isOverlay = model.isOverlay;
                this.ossBucket = model.ossBucket;
                this.ossEndpoint = model.ossEndpoint;
                this.ossObject = model.ossObject;
            } 

            /**
             * <p>The time when the snapshot was captured. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-12-01T17:36:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The timestamp when the snapshot file was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1653641526637</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>The snapshot mode. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: overwrite mode, which means that a new snapshot overwrites the previous snapshot.</li>
             * <li><strong>false</strong>: sequence mode, which means that a new snapshot does not overwrite the previous snapshot.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isOverlay(Boolean isOverlay) {
                this.isOverlay = isOverlay;
                return this;
            }

            /**
             * <p>The name of the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>liveBucket****</p>
             */
            public Builder ossBucket(String ossBucket) {
                this.ossBucket = ossBucket;
                return this;
            }

            /**
             * <p>The endpoint of the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-oss-****.aliyuncs.com</p>
             */
            public Builder ossEndpoint(String ossEndpoint) {
                this.ossEndpoint = ossEndpoint;
                return this;
            }

            /**
             * <p>The name of the snapshot stored in Object Storage Service (OSS).</p>
             * 
             * <strong>example:</strong>
             * <p>{liveApp****}/{liveStream****}.jpg</p>
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
    /**
     * 
     * {@link DescribeLiveStreamSnapshotInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamSnapshotInfoResponseBody</p>
     */
    public static class LiveStreamSnapshotInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LiveStreamSnapshotInfo")
        private java.util.List<LiveStreamSnapshotInfo> liveStreamSnapshotInfo;

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
        public java.util.List<LiveStreamSnapshotInfo> getLiveStreamSnapshotInfo() {
            return this.liveStreamSnapshotInfo;
        }

        public static final class Builder {
            private java.util.List<LiveStreamSnapshotInfo> liveStreamSnapshotInfo; 

            private Builder() {
            } 

            private Builder(LiveStreamSnapshotInfoList model) {
                this.liveStreamSnapshotInfo = model.liveStreamSnapshotInfo;
            } 

            /**
             * LiveStreamSnapshotInfo.
             */
            public Builder liveStreamSnapshotInfo(java.util.List<LiveStreamSnapshotInfo> liveStreamSnapshotInfo) {
                this.liveStreamSnapshotInfo = liveStreamSnapshotInfo;
                return this;
            }

            public LiveStreamSnapshotInfoList build() {
                return new LiveStreamSnapshotInfoList(this);
            } 

        } 

    }
}
