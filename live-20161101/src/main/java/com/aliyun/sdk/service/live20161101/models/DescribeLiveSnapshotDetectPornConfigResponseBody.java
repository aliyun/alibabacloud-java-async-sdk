// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveSnapshotDetectPornConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveSnapshotDetectPornConfigResponseBody</p>
 */
public class DescribeLiveSnapshotDetectPornConfigResponseBody extends TeaModel {
    @NameInMap("LiveSnapshotDetectPornConfigList")
    private LiveSnapshotDetectPornConfigList liveSnapshotDetectPornConfigList;

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

        /**
         * LiveSnapshotDetectPornConfigList.
         */
        public Builder liveSnapshotDetectPornConfigList(LiveSnapshotDetectPornConfigList liveSnapshotDetectPornConfigList) {
            this.liveSnapshotDetectPornConfigList = liveSnapshotDetectPornConfigList;
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

        public DescribeLiveSnapshotDetectPornConfigResponseBody build() {
            return new DescribeLiveSnapshotDetectPornConfigResponseBody(this);
        } 

    } 

    public static class Scenes extends TeaModel {
        @NameInMap("scene")
        private java.util.List < String > scene;

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
        public java.util.List < String > getScene() {
            return this.scene;
        }

        public static final class Builder {
            private java.util.List < String > scene; 

            /**
             * scene.
             */
            public Builder scene(java.util.List < String > scene) {
                this.scene = scene;
                return this;
            }

            public Scenes build() {
                return new Scenes(this);
            } 

        } 

    }
    public static class LiveSnapshotDetectPornConfig extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("Interval")
        private Integer interval;

        @NameInMap("OssBucket")
        private String ossBucket;

        @NameInMap("OssEndpoint")
        private String ossEndpoint;

        @NameInMap("OssObject")
        private String ossObject;

        @NameInMap("Scenes")
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

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
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
             * Interval.
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
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

            /**
             * Scenes.
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
    public static class LiveSnapshotDetectPornConfigList extends TeaModel {
        @NameInMap("LiveSnapshotDetectPornConfig")
        private java.util.List < LiveSnapshotDetectPornConfig> liveSnapshotDetectPornConfig;

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
        public java.util.List < LiveSnapshotDetectPornConfig> getLiveSnapshotDetectPornConfig() {
            return this.liveSnapshotDetectPornConfig;
        }

        public static final class Builder {
            private java.util.List < LiveSnapshotDetectPornConfig> liveSnapshotDetectPornConfig; 

            /**
             * LiveSnapshotDetectPornConfig.
             */
            public Builder liveSnapshotDetectPornConfig(java.util.List < LiveSnapshotDetectPornConfig> liveSnapshotDetectPornConfig) {
                this.liveSnapshotDetectPornConfig = liveSnapshotDetectPornConfig;
                return this;
            }

            public LiveSnapshotDetectPornConfigList build() {
                return new LiveSnapshotDetectPornConfigList(this);
            } 

        } 

    }
}
