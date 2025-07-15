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
 * {@link DescribeLivePackageConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLivePackageConfigResponseBody</p>
 */
public class DescribeLivePackageConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LivePackageConfigList")
    private LivePackageConfigList livePackageConfigList;

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

    private DescribeLivePackageConfigResponseBody(Builder builder) {
        this.livePackageConfigList = builder.livePackageConfigList;
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

    public static DescribeLivePackageConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return livePackageConfigList
     */
    public LivePackageConfigList getLivePackageConfigList() {
        return this.livePackageConfigList;
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
        private LivePackageConfigList livePackageConfigList; 
        private String order; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalNum; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(DescribeLivePackageConfigResponseBody model) {
            this.livePackageConfigList = model.livePackageConfigList;
            this.order = model.order;
            this.pageNum = model.pageNum;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>The live stream encapsulation configurations.</p>
         */
        public Builder livePackageConfigList(LivePackageConfigList livePackageConfigList) {
            this.livePackageConfigList = livePackageConfigList;
            return this;
        }

        /**
         * <p>The sorting order. Valid values:</p>
         * <ul>
         * <li><strong>asc</strong> (default): ascending order</li>
         * <li><strong>desc</strong>: descending order</li>
         * </ul>
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
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1FEDCFD8-4C5D-5CB3-A5A1-0B59E5AE57B0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of live stream encapsulation configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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

        public DescribeLivePackageConfigResponseBody build() {
            return new DescribeLivePackageConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLivePackageConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLivePackageConfigResponseBody</p>
     */
    public static class LivePackageConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("IgnoreTranscode")
        private Boolean ignoreTranscode;

        @com.aliyun.core.annotation.NameInMap("PartDuration")
        private Integer partDuration;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("SegmentDuration")
        private Integer segmentDuration;

        @com.aliyun.core.annotation.NameInMap("SegmentNum")
        private Integer segmentNum;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        private LivePackageConfig(Builder builder) {
            this.appName = builder.appName;
            this.domainName = builder.domainName;
            this.ignoreTranscode = builder.ignoreTranscode;
            this.partDuration = builder.partDuration;
            this.protocol = builder.protocol;
            this.segmentDuration = builder.segmentDuration;
            this.segmentNum = builder.segmentNum;
            this.streamName = builder.streamName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LivePackageConfig create() {
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
         * @return ignoreTranscode
         */
        public Boolean getIgnoreTranscode() {
            return this.ignoreTranscode;
        }

        /**
         * @return partDuration
         */
        public Integer getPartDuration() {
            return this.partDuration;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return segmentDuration
         */
        public Integer getSegmentDuration() {
            return this.segmentDuration;
        }

        /**
         * @return segmentNum
         */
        public Integer getSegmentNum() {
            return this.segmentNum;
        }

        /**
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        public static final class Builder {
            private String appName; 
            private String domainName; 
            private Boolean ignoreTranscode; 
            private Integer partDuration; 
            private String protocol; 
            private Integer segmentDuration; 
            private Integer segmentNum; 
            private String streamName; 

            private Builder() {
            } 

            private Builder(LivePackageConfig model) {
                this.appName = model.appName;
                this.domainName = model.domainName;
                this.ignoreTranscode = model.ignoreTranscode;
                this.partDuration = model.partDuration;
                this.protocol = model.protocol;
                this.segmentDuration = model.segmentDuration;
                this.segmentNum = model.segmentNum;
                this.streamName = model.streamName;
            } 

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>AppName</p>
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
             * <p>Indicates whether the transcoded stream is ignored. Valid values:</p>
             * <ul>
             * <li><strong>true</strong> (default)</li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ignoreTranscode(Boolean ignoreTranscode) {
                this.ignoreTranscode = ignoreTranscode;
                return this;
            }

            /**
             * <p>The part length. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder partDuration(Integer partDuration) {
                this.partDuration = partDuration;
                return this;
            }

            /**
             * <p>The streaming protocol and encapsulation format.</p>
             * 
             * <strong>example:</strong>
             * <p>HLS_CMAF</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The segment length. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder segmentDuration(Integer segmentDuration) {
                this.segmentDuration = segmentDuration;
                return this;
            }

            /**
             * <p>The number of segments.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder segmentNum(Integer segmentNum) {
                this.segmentNum = segmentNum;
                return this;
            }

            /**
             * <p>The stream name.</p>
             * 
             * <strong>example:</strong>
             * <p>StreamName</p>
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            public LivePackageConfig build() {
                return new LivePackageConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLivePackageConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLivePackageConfigResponseBody</p>
     */
    public static class LivePackageConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LivePackageConfig")
        private java.util.List<LivePackageConfig> livePackageConfig;

        private LivePackageConfigList(Builder builder) {
            this.livePackageConfig = builder.livePackageConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LivePackageConfigList create() {
            return builder().build();
        }

        /**
         * @return livePackageConfig
         */
        public java.util.List<LivePackageConfig> getLivePackageConfig() {
            return this.livePackageConfig;
        }

        public static final class Builder {
            private java.util.List<LivePackageConfig> livePackageConfig; 

            private Builder() {
            } 

            private Builder(LivePackageConfigList model) {
                this.livePackageConfig = model.livePackageConfig;
            } 

            /**
             * LivePackageConfig.
             */
            public Builder livePackageConfig(java.util.List<LivePackageConfig> livePackageConfig) {
                this.livePackageConfig = livePackageConfig;
                return this;
            }

            public LivePackageConfigList build() {
                return new LivePackageConfigList(this);
            } 

        } 

    }
}
