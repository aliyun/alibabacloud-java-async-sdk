// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveSnapshotConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveSnapshotConfigResponseBody</p>
 */
public class DescribeLiveSnapshotConfigResponseBody extends TeaModel {
    @NameInMap("LiveStreamSnapshotConfigList")
    private LiveStreamSnapshotConfigList liveStreamSnapshotConfigList;

    @NameInMap("Order")
    private String order;

    @NameInMap("PageNum")
    private Integer pageNum;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalNum")
    private Integer totalNum;

    @NameInMap("TotalPage")
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

        /**
         * LiveStreamSnapshotConfigList.
         */
        public Builder liveStreamSnapshotConfigList(LiveStreamSnapshotConfigList liveStreamSnapshotConfigList) {
            this.liveStreamSnapshotConfigList = liveStreamSnapshotConfigList;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.order = order;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
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
         * TotalNum.
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        /**
         * TotalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeLiveSnapshotConfigResponseBody build() {
            return new DescribeLiveSnapshotConfigResponseBody(this);
        } 

    } 

    public static class LiveStreamSnapshotConfig extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("Callback")
        private String callback;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("OssBucket")
        private String ossBucket;

        @NameInMap("OssEndpoint")
        private String ossEndpoint;

        @NameInMap("OverwriteOssObject")
        private String overwriteOssObject;

        @NameInMap("SequenceOssObject")
        private String sequenceOssObject;

        @NameInMap("TimeInterval")
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

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * Callback.
             */
            public Builder callback(String callback) {
                this.callback = callback;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
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
             * OverwriteOssObject.
             */
            public Builder overwriteOssObject(String overwriteOssObject) {
                this.overwriteOssObject = overwriteOssObject;
                return this;
            }

            /**
             * SequenceOssObject.
             */
            public Builder sequenceOssObject(String sequenceOssObject) {
                this.sequenceOssObject = sequenceOssObject;
                return this;
            }

            /**
             * TimeInterval.
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
    public static class LiveStreamSnapshotConfigList extends TeaModel {
        @NameInMap("LiveStreamSnapshotConfig")
        private java.util.List < LiveStreamSnapshotConfig> liveStreamSnapshotConfig;

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
        public java.util.List < LiveStreamSnapshotConfig> getLiveStreamSnapshotConfig() {
            return this.liveStreamSnapshotConfig;
        }

        public static final class Builder {
            private java.util.List < LiveStreamSnapshotConfig> liveStreamSnapshotConfig; 

            /**
             * LiveStreamSnapshotConfig.
             */
            public Builder liveStreamSnapshotConfig(java.util.List < LiveStreamSnapshotConfig> liveStreamSnapshotConfig) {
                this.liveStreamSnapshotConfig = liveStreamSnapshotConfig;
                return this;
            }

            public LiveStreamSnapshotConfigList build() {
                return new LiveStreamSnapshotConfigList(this);
            } 

        } 

    }
}
