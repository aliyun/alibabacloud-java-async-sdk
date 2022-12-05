// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamsNotifyRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamsNotifyRecordsResponseBody</p>
 */
public class DescribeLiveStreamsNotifyRecordsResponseBody extends TeaModel {
    @NameInMap("NotifyRecordsInfo")
    private NotifyRecordsInfo notifyRecordsInfo;

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

    private DescribeLiveStreamsNotifyRecordsResponseBody(Builder builder) {
        this.notifyRecordsInfo = builder.notifyRecordsInfo;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamsNotifyRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return notifyRecordsInfo
     */
    public NotifyRecordsInfo getNotifyRecordsInfo() {
        return this.notifyRecordsInfo;
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
        private NotifyRecordsInfo notifyRecordsInfo; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalNum; 
        private Integer totalPage; 

        /**
         * NotifyRecordsInfo.
         */
        public Builder notifyRecordsInfo(NotifyRecordsInfo notifyRecordsInfo) {
            this.notifyRecordsInfo = notifyRecordsInfo;
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

        public DescribeLiveStreamsNotifyRecordsResponseBody build() {
            return new DescribeLiveStreamsNotifyRecordsResponseBody(this);
        } 

    } 

    public static class LiveStreamNotifyRecordsInfo extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("Description")
        private String description;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("NotifyContent")
        private String notifyContent;

        @NameInMap("NotifyResult")
        private String notifyResult;

        @NameInMap("NotifyTime")
        private String notifyTime;

        @NameInMap("NotifyType")
        private String notifyType;

        @NameInMap("NotifyUrl")
        private String notifyUrl;

        @NameInMap("StreamName")
        private String streamName;

        private LiveStreamNotifyRecordsInfo(Builder builder) {
            this.appName = builder.appName;
            this.description = builder.description;
            this.domainName = builder.domainName;
            this.notifyContent = builder.notifyContent;
            this.notifyResult = builder.notifyResult;
            this.notifyTime = builder.notifyTime;
            this.notifyType = builder.notifyType;
            this.notifyUrl = builder.notifyUrl;
            this.streamName = builder.streamName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveStreamNotifyRecordsInfo create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return notifyContent
         */
        public String getNotifyContent() {
            return this.notifyContent;
        }

        /**
         * @return notifyResult
         */
        public String getNotifyResult() {
            return this.notifyResult;
        }

        /**
         * @return notifyTime
         */
        public String getNotifyTime() {
            return this.notifyTime;
        }

        /**
         * @return notifyType
         */
        public String getNotifyType() {
            return this.notifyType;
        }

        /**
         * @return notifyUrl
         */
        public String getNotifyUrl() {
            return this.notifyUrl;
        }

        /**
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        public static final class Builder {
            private String appName; 
            private String description; 
            private String domainName; 
            private String notifyContent; 
            private String notifyResult; 
            private String notifyTime; 
            private String notifyType; 
            private String notifyUrl; 
            private String streamName; 

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * NotifyContent.
             */
            public Builder notifyContent(String notifyContent) {
                this.notifyContent = notifyContent;
                return this;
            }

            /**
             * NotifyResult.
             */
            public Builder notifyResult(String notifyResult) {
                this.notifyResult = notifyResult;
                return this;
            }

            /**
             * NotifyTime.
             */
            public Builder notifyTime(String notifyTime) {
                this.notifyTime = notifyTime;
                return this;
            }

            /**
             * NotifyType.
             */
            public Builder notifyType(String notifyType) {
                this.notifyType = notifyType;
                return this;
            }

            /**
             * NotifyUrl.
             */
            public Builder notifyUrl(String notifyUrl) {
                this.notifyUrl = notifyUrl;
                return this;
            }

            /**
             * StreamName.
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            public LiveStreamNotifyRecordsInfo build() {
                return new LiveStreamNotifyRecordsInfo(this);
            } 

        } 

    }
    public static class NotifyRecordsInfo extends TeaModel {
        @NameInMap("LiveStreamNotifyRecordsInfo")
        private java.util.List < LiveStreamNotifyRecordsInfo> liveStreamNotifyRecordsInfo;

        private NotifyRecordsInfo(Builder builder) {
            this.liveStreamNotifyRecordsInfo = builder.liveStreamNotifyRecordsInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotifyRecordsInfo create() {
            return builder().build();
        }

        /**
         * @return liveStreamNotifyRecordsInfo
         */
        public java.util.List < LiveStreamNotifyRecordsInfo> getLiveStreamNotifyRecordsInfo() {
            return this.liveStreamNotifyRecordsInfo;
        }

        public static final class Builder {
            private java.util.List < LiveStreamNotifyRecordsInfo> liveStreamNotifyRecordsInfo; 

            /**
             * LiveStreamNotifyRecordsInfo.
             */
            public Builder liveStreamNotifyRecordsInfo(java.util.List < LiveStreamNotifyRecordsInfo> liveStreamNotifyRecordsInfo) {
                this.liveStreamNotifyRecordsInfo = liveStreamNotifyRecordsInfo;
                return this;
            }

            public NotifyRecordsInfo build() {
                return new NotifyRecordsInfo(this);
            } 

        } 

    }
}
