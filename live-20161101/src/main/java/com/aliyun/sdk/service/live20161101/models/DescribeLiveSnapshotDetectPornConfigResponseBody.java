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
 * {@link DescribeLiveSnapshotDetectPornConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveSnapshotDetectPornConfigResponseBody</p>
 */
public class DescribeLiveSnapshotDetectPornConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LiveSnapshotDetectPornConfigList")
    private LiveSnapshotDetectPornConfigList liveSnapshotDetectPornConfigList;

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

    private DescribeLiveSnapshotDetectPornConfigResponseBody(Builder builder) {
        this.liveSnapshotDetectPornConfigList = builder.liveSnapshotDetectPornConfigList;
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

    public static DescribeLiveSnapshotDetectPornConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return liveSnapshotDetectPornConfigList
     */
    public LiveSnapshotDetectPornConfigList getLiveSnapshotDetectPornConfigList() {
        return this.liveSnapshotDetectPornConfigList;
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
        private LiveSnapshotDetectPornConfigList liveSnapshotDetectPornConfigList; 
        private String order; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalNum; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(DescribeLiveSnapshotDetectPornConfigResponseBody model) {
            this.liveSnapshotDetectPornConfigList = model.liveSnapshotDetectPornConfigList;
            this.order = model.order;
            this.pageNum = model.pageNum;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>The list of video moderation configurations.</p>
         */
        public Builder liveSnapshotDetectPornConfigList(LiveSnapshotDetectPornConfigList liveSnapshotDetectPornConfigList) {
            this.liveSnapshotDetectPornConfigList = liveSnapshotDetectPornConfigList;
            return this;
        }

        /**
         * <p>The sort order.</p>
         * 
         * <strong>example:</strong>
         * <p>Asc</p>
         */
        public Builder order(String order) {
            this.order = order;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
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
         * <p>11</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeLiveSnapshotDetectPornConfigResponseBody build() {
            return new DescribeLiveSnapshotDetectPornConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveSnapshotDetectPornConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveSnapshotDetectPornConfigResponseBody</p>
     */
    public static class Scenes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("scene")
        private java.util.List<String> scene;

        private Scenes(Builder builder) {
            this.scene = builder.scene;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scenes create() {
            return builder().build();
        }

        /**
         * @return scene
         */
        public java.util.List<String> getScene() {
            return this.scene;
        }

        public static final class Builder {
            private java.util.List<String> scene; 

            private Builder() {
            } 

            private Builder(Scenes model) {
                this.scene = model.scene;
            } 

            /**
             * scene.
             */
            public Builder scene(java.util.List<String> scene) {
                this.scene = scene;
                return this;
            }

            public Scenes build() {
                return new Scenes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveSnapshotDetectPornConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveSnapshotDetectPornConfigResponseBody</p>
     */
    public static class LiveSnapshotDetectPornConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("OssBucket")
        private String ossBucket;

        @com.aliyun.core.annotation.NameInMap("OssEndpoint")
        private String ossEndpoint;

        @com.aliyun.core.annotation.NameInMap("OssObject")
        private String ossObject;

        @com.aliyun.core.annotation.NameInMap("Scenes")
        private Scenes scenes;

        private LiveSnapshotDetectPornConfig(Builder builder) {
            this.appName = builder.appName;
            this.domainName = builder.domainName;
            this.interval = builder.interval;
            this.ossBucket = builder.ossBucket;
            this.ossEndpoint = builder.ossEndpoint;
            this.ossObject = builder.ossObject;
            this.scenes = builder.scenes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveSnapshotDetectPornConfig create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
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

        /**
         * @return scenes
         */
        public Scenes getScenes() {
            return this.scenes;
        }

        public static final class Builder {
            private String appName; 
            private String domainName; 
            private Integer interval; 
            private String ossBucket; 
            private String ossEndpoint; 
            private String ossObject; 
            private Scenes scenes; 

            private Builder() {
            } 

            private Builder(LiveSnapshotDetectPornConfig model) {
                this.appName = model.appName;
                this.domainName = model.domainName;
                this.interval = model.interval;
                this.ossBucket = model.ossBucket;
                this.ossEndpoint = model.ossEndpoint;
                this.ossObject = model.ossObject;
                this.scenes = model.scenes;
            } 

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>liveApp****</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
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
             * <p>The interval at which snapshots are captured from the live stream. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
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
             * <p>The name of the storage file in Object Storage Service (OSS).</p>
             * 
             * <strong>example:</strong>
             * <p>{liveApp****}/{liveStream****}/{Date}/{Hour}/{Minute}_{Second}.jpg</p>
             */
            public Builder ossObject(String ossObject) {
                this.ossObject = ossObject;
                return this;
            }

            /**
             * <p>The moderation scenario array.</p>
             */
            public Builder scenes(Scenes scenes) {
                this.scenes = scenes;
                return this;
            }

            public LiveSnapshotDetectPornConfig build() {
                return new LiveSnapshotDetectPornConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveSnapshotDetectPornConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveSnapshotDetectPornConfigResponseBody</p>
     */
    public static class LiveSnapshotDetectPornConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LiveSnapshotDetectPornConfig")
        private java.util.List<LiveSnapshotDetectPornConfig> liveSnapshotDetectPornConfig;

        private LiveSnapshotDetectPornConfigList(Builder builder) {
            this.liveSnapshotDetectPornConfig = builder.liveSnapshotDetectPornConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveSnapshotDetectPornConfigList create() {
            return builder().build();
        }

        /**
         * @return liveSnapshotDetectPornConfig
         */
        public java.util.List<LiveSnapshotDetectPornConfig> getLiveSnapshotDetectPornConfig() {
            return this.liveSnapshotDetectPornConfig;
        }

        public static final class Builder {
            private java.util.List<LiveSnapshotDetectPornConfig> liveSnapshotDetectPornConfig; 

            private Builder() {
            } 

            private Builder(LiveSnapshotDetectPornConfigList model) {
                this.liveSnapshotDetectPornConfig = model.liveSnapshotDetectPornConfig;
            } 

            /**
             * LiveSnapshotDetectPornConfig.
             */
            public Builder liveSnapshotDetectPornConfig(java.util.List<LiveSnapshotDetectPornConfig> liveSnapshotDetectPornConfig) {
                this.liveSnapshotDetectPornConfig = liveSnapshotDetectPornConfig;
                return this;
            }

            public LiveSnapshotDetectPornConfigList build() {
                return new LiveSnapshotDetectPornConfigList(this);
            } 

        } 

    }
}
