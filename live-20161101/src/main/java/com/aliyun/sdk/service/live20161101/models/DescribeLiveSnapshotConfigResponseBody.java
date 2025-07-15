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
 * {@link DescribeLiveSnapshotConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveSnapshotConfigResponseBody</p>
 */
public class DescribeLiveSnapshotConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LiveStreamSnapshotConfigList")
    private LiveStreamSnapshotConfigList liveStreamSnapshotConfigList;

    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Integer totalNum;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private DescribeLiveSnapshotConfigResponseBody(Builder builder) {
        this.liveStreamSnapshotConfigList = builder.liveStreamSnapshotConfigList;
        this.order = builder.order;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveSnapshotConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return liveStreamSnapshotConfigList
     */
    public LiveStreamSnapshotConfigList getLiveStreamSnapshotConfigList() {
        return this.liveStreamSnapshotConfigList;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalNum
     */
    public Integer getTotalNum() {
        return this.totalNum;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private LiveStreamSnapshotConfigList liveStreamSnapshotConfigList; 
        private String order; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalNum; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(DescribeLiveSnapshotConfigResponseBody model) {
            this.liveStreamSnapshotConfigList = model.liveStreamSnapshotConfigList;
            this.order = model.order;
            this.pageNum = model.pageNum;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>The snapshot configurations.</p>
         */
        public Builder liveStreamSnapshotConfigList(LiveStreamSnapshotConfigList liveStreamSnapshotConfigList) {
            this.liveStreamSnapshotConfigList = liveStreamSnapshotConfigList;
            return this;
        }

        /**
         * <p>The sort order.</p>
         * 
         * <strong>example:</strong>
         * <p>asc</p>
         */
        public Builder order(String order) {
            this.order = order;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A3136B58-5876-4168-83CA-B562781981A0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries that meet the specified conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeLiveSnapshotConfigResponseBody build() {
            return new DescribeLiveSnapshotConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveSnapshotConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveSnapshotConfigResponseBody</p>
     */
    public static class LiveStreamSnapshotConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("Callback")
        private String callback;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("OssBucket")
        private String ossBucket;

        @com.aliyun.core.annotation.NameInMap("OssEndpoint")
        private String ossEndpoint;

        @com.aliyun.core.annotation.NameInMap("OverwriteOssObject")
        private String overwriteOssObject;

        @com.aliyun.core.annotation.NameInMap("SequenceOssObject")
        private String sequenceOssObject;

        @com.aliyun.core.annotation.NameInMap("TimeInterval")
        private Integer timeInterval;

        private LiveStreamSnapshotConfig(Builder builder) {
            this.appName = builder.appName;
            this.callback = builder.callback;
            this.createTime = builder.createTime;
            this.domainName = builder.domainName;
            this.ossBucket = builder.ossBucket;
            this.ossEndpoint = builder.ossEndpoint;
            this.overwriteOssObject = builder.overwriteOssObject;
            this.sequenceOssObject = builder.sequenceOssObject;
            this.timeInterval = builder.timeInterval;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveStreamSnapshotConfig create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return callback
         */
        public String getCallback() {
            return this.callback;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
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
         * @return overwriteOssObject
         */
        public String getOverwriteOssObject() {
            return this.overwriteOssObject;
        }

        /**
         * @return sequenceOssObject
         */
        public String getSequenceOssObject() {
            return this.sequenceOssObject;
        }

        /**
         * @return timeInterval
         */
        public Integer getTimeInterval() {
            return this.timeInterval;
        }

        public static final class Builder {
            private String appName; 
            private String callback; 
            private String createTime; 
            private String domainName; 
            private String ossBucket; 
            private String ossEndpoint; 
            private String overwriteOssObject; 
            private String sequenceOssObject; 
            private Integer timeInterval; 

            private Builder() {
            } 

            private Builder(LiveStreamSnapshotConfig model) {
                this.appName = model.appName;
                this.callback = model.callback;
                this.createTime = model.createTime;
                this.domainName = model.domainName;
                this.ossBucket = model.ossBucket;
                this.ossEndpoint = model.ossEndpoint;
                this.overwriteOssObject = model.overwriteOssObject;
                this.sequenceOssObject = model.sequenceOssObject;
                this.timeInterval = model.timeInterval;
            } 

            /**
             * <p>The name of the application to which the live stream belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>liveApp****</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The callback URL that is used to receive notifications about snapshot capture.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://learn.aliyundoc.com">https://learn.aliyundoc.com</a></p>
             */
            public Builder callback(String callback) {
                this.callback = callback;
                return this;
            }

            /**
             * <p>The time when the configuration was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-05-20T01:33:38Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The main streaming domain.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The name of the Object Storage Service (OSS) bucket.</p>
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
             * <p>The naming format of snapshots that are stored in the overwrite mode, which means that a new snapshot overwrites the previous snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>{liveApp****}/{liveStream****}.jpg</p>
             */
            public Builder overwriteOssObject(String overwriteOssObject) {
                this.overwriteOssObject = overwriteOssObject;
                return this;
            }

            /**
             * <p>The naming format of snapshots that are stored in sequence, which means that a new snapshot does not overwrite the previous snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>snapshot/{liveApp****}/{liveStream****}/{UnixTimestamp}.jpg</p>
             */
            public Builder sequenceOssObject(String sequenceOssObject) {
                this.sequenceOssObject = sequenceOssObject;
                return this;
            }

            /**
             * <p>The interval at which snapshots are captured. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder timeInterval(Integer timeInterval) {
                this.timeInterval = timeInterval;
                return this;
            }

            public LiveStreamSnapshotConfig build() {
                return new LiveStreamSnapshotConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveSnapshotConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveSnapshotConfigResponseBody</p>
     */
    public static class LiveStreamSnapshotConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LiveStreamSnapshotConfig")
        private java.util.List<LiveStreamSnapshotConfig> liveStreamSnapshotConfig;

        private LiveStreamSnapshotConfigList(Builder builder) {
            this.liveStreamSnapshotConfig = builder.liveStreamSnapshotConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveStreamSnapshotConfigList create() {
            return builder().build();
        }

        /**
         * @return liveStreamSnapshotConfig
         */
        public java.util.List<LiveStreamSnapshotConfig> getLiveStreamSnapshotConfig() {
            return this.liveStreamSnapshotConfig;
        }

        public static final class Builder {
            private java.util.List<LiveStreamSnapshotConfig> liveStreamSnapshotConfig; 

            private Builder() {
            } 

            private Builder(LiveStreamSnapshotConfigList model) {
                this.liveStreamSnapshotConfig = model.liveStreamSnapshotConfig;
            } 

            /**
             * LiveStreamSnapshotConfig.
             */
            public Builder liveStreamSnapshotConfig(java.util.List<LiveStreamSnapshotConfig> liveStreamSnapshotConfig) {
                this.liveStreamSnapshotConfig = liveStreamSnapshotConfig;
                return this;
            }

            public LiveStreamSnapshotConfigList build() {
                return new LiveStreamSnapshotConfigList(this);
            } 

        } 

    }
}
