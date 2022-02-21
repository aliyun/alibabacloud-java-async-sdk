// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveRecordVodConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveRecordVodConfigsResponseBody</p>
 */
public class DescribeLiveRecordVodConfigsResponseBody extends TeaModel {
    @NameInMap("LiveRecordVodConfigs")
    private LiveRecordVodConfigs liveRecordVodConfigs;

    @NameInMap("PageNum")
    private Integer pageNum;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private String total;

    private DescribeLiveRecordVodConfigsResponseBody(Builder builder) {
        this.liveRecordVodConfigs = builder.liveRecordVodConfigs;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveRecordVodConfigsResponseBody create() {
        return builder().build();
    }

    /**
     * @return liveRecordVodConfigs
     */
    public LiveRecordVodConfigs getLiveRecordVodConfigs() {
        return this.liveRecordVodConfigs;
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
     * @return total
     */
    public String getTotal() {
        return this.total;
    }

    public static final class Builder {
        private LiveRecordVodConfigs liveRecordVodConfigs; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String requestId; 
        private String total; 

        /**
         * LiveRecordVodConfigs.
         */
        public Builder liveRecordVodConfigs(LiveRecordVodConfigs liveRecordVodConfigs) {
            this.liveRecordVodConfigs = liveRecordVodConfigs;
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
         * Total.
         */
        public Builder total(String total) {
            this.total = total;
            return this;
        }

        public DescribeLiveRecordVodConfigsResponseBody build() {
            return new DescribeLiveRecordVodConfigsResponseBody(this);
        } 

    } 

    public static class LiveRecordVodConfig extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("AutoCompose")
        private String autoCompose;

        @NameInMap("ComposeVodTranscodeGroupId")
        private String composeVodTranscodeGroupId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CycleDuration")
        private Integer cycleDuration;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("StreamName")
        private String streamName;

        @NameInMap("VodTranscodeGroupId")
        private String vodTranscodeGroupId;

        private LiveRecordVodConfig(Builder builder) {
            this.appName = builder.appName;
            this.autoCompose = builder.autoCompose;
            this.composeVodTranscodeGroupId = builder.composeVodTranscodeGroupId;
            this.createTime = builder.createTime;
            this.cycleDuration = builder.cycleDuration;
            this.domainName = builder.domainName;
            this.streamName = builder.streamName;
            this.vodTranscodeGroupId = builder.vodTranscodeGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveRecordVodConfig create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return autoCompose
         */
        public String getAutoCompose() {
            return this.autoCompose;
        }

        /**
         * @return composeVodTranscodeGroupId
         */
        public String getComposeVodTranscodeGroupId() {
            return this.composeVodTranscodeGroupId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return cycleDuration
         */
        public Integer getCycleDuration() {
            return this.cycleDuration;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        /**
         * @return vodTranscodeGroupId
         */
        public String getVodTranscodeGroupId() {
            return this.vodTranscodeGroupId;
        }

        public static final class Builder {
            private String appName; 
            private String autoCompose; 
            private String composeVodTranscodeGroupId; 
            private String createTime; 
            private Integer cycleDuration; 
            private String domainName; 
            private String streamName; 
            private String vodTranscodeGroupId; 

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * AutoCompose.
             */
            public Builder autoCompose(String autoCompose) {
                this.autoCompose = autoCompose;
                return this;
            }

            /**
             * ComposeVodTranscodeGroupId.
             */
            public Builder composeVodTranscodeGroupId(String composeVodTranscodeGroupId) {
                this.composeVodTranscodeGroupId = composeVodTranscodeGroupId;
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
             * CycleDuration.
             */
            public Builder cycleDuration(Integer cycleDuration) {
                this.cycleDuration = cycleDuration;
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
             * StreamName.
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            /**
             * VodTranscodeGroupId.
             */
            public Builder vodTranscodeGroupId(String vodTranscodeGroupId) {
                this.vodTranscodeGroupId = vodTranscodeGroupId;
                return this;
            }

            public LiveRecordVodConfig build() {
                return new LiveRecordVodConfig(this);
            } 

        } 

    }
    public static class LiveRecordVodConfigs extends TeaModel {
        @NameInMap("LiveRecordVodConfig")
        private java.util.List < LiveRecordVodConfig> liveRecordVodConfig;

        private LiveRecordVodConfigs(Builder builder) {
            this.liveRecordVodConfig = builder.liveRecordVodConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveRecordVodConfigs create() {
            return builder().build();
        }

        /**
         * @return liveRecordVodConfig
         */
        public java.util.List < LiveRecordVodConfig> getLiveRecordVodConfig() {
            return this.liveRecordVodConfig;
        }

        public static final class Builder {
            private java.util.List < LiveRecordVodConfig> liveRecordVodConfig; 

            /**
             * LiveRecordVodConfig.
             */
            public Builder liveRecordVodConfig(java.util.List < LiveRecordVodConfig> liveRecordVodConfig) {
                this.liveRecordVodConfig = liveRecordVodConfig;
                return this;
            }

            public LiveRecordVodConfigs build() {
                return new LiveRecordVodConfigs(this);
            } 

        } 

    }
}
