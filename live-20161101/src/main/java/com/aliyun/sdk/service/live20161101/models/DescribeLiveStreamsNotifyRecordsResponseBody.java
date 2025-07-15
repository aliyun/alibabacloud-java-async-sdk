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
 * {@link DescribeLiveStreamsNotifyRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamsNotifyRecordsResponseBody</p>
 */
public class DescribeLiveStreamsNotifyRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NotifyRecordsInfo")
    private NotifyRecordsInfo notifyRecordsInfo;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeLiveStreamsNotifyRecordsResponseBody model) {
            this.notifyRecordsInfo = model.notifyRecordsInfo;
            this.pageNum = model.pageNum;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>The stream ingest callback records.</p>
         */
        public Builder notifyRecordsInfo(NotifyRecordsInfo notifyRecordsInfo) {
            this.notifyRecordsInfo = notifyRecordsInfo;
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
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F675E4B4-125D-1533-901B-11A724644285</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries that meet the specified conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeLiveStreamsNotifyRecordsResponseBody build() {
            return new DescribeLiveStreamsNotifyRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveStreamsNotifyRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamsNotifyRecordsResponseBody</p>
     */
    public static class LiveStreamNotifyRecordsInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("NotifyContent")
        private String notifyContent;

        @com.aliyun.core.annotation.NameInMap("NotifyResult")
        private String notifyResult;

        @com.aliyun.core.annotation.NameInMap("NotifyTime")
        private String notifyTime;

        @com.aliyun.core.annotation.NameInMap("NotifyType")
        private String notifyType;

        @com.aliyun.core.annotation.NameInMap("NotifyUrl")
        private String notifyUrl;

        @com.aliyun.core.annotation.NameInMap("StreamName")
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

            private Builder() {
            } 

            private Builder(LiveStreamNotifyRecordsInfo model) {
                this.appName = model.appName;
                this.description = model.description;
                this.domainName = model.domainName;
                this.notifyContent = model.notifyContent;
                this.notifyResult = model.notifyResult;
                this.notifyTime = model.notifyTime;
                this.notifyType = model.notifyType;
                this.notifyUrl = model.notifyUrl;
                this.streamName = model.streamName;
            } 

            /**
             * <p>The name of the application to which the live stream belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>app</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The result of the request. If success is returned, the request is successful. If an error message is returned, the request failed.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ingest domain.</p>
             * 
             * <strong>example:</strong>
             * <p>push.example1.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The callback content.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;action&quot;:&quot;publish_done&quot;,&quot;app&quot;:&quot;push.example1.com&quot;}</p>
             */
            public Builder notifyContent(String notifyContent) {
                this.notifyContent = notifyContent;
                return this;
            }

            /**
             * <p>The callback result. Valid values:</p>
             * <ul>
             * <li>success</li>
             * <li>failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder notifyResult(String notifyResult) {
                this.notifyResult = notifyResult;
                return this;
            }

            /**
             * <p>The time when the callback was invoked. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-19T19:09:28Z</p>
             */
            public Builder notifyTime(String notifyTime) {
                this.notifyTime = notifyTime;
                return this;
            }

            /**
             * <p>The event. Valid values:</p>
             * <ul>
             * <li>publish: The stream ingest starts.</li>
             * <li>publish_done: The stream ingest is interrupted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>publish_done</p>
             */
            public Builder notifyType(String notifyType) {
                this.notifyType = notifyType;
                return this;
            }

            /**
             * <p>The callback URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xx.xx.xx.xx/callbacks">http://xx.xx.xx.xx/callbacks</a></p>
             */
            public Builder notifyUrl(String notifyUrl) {
                this.notifyUrl = notifyUrl;
                return this;
            }

            /**
             * <p>The name of the live stream.</p>
             * 
             * <strong>example:</strong>
             * <p>stream</p>
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
    /**
     * 
     * {@link DescribeLiveStreamsNotifyRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamsNotifyRecordsResponseBody</p>
     */
    public static class NotifyRecordsInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LiveStreamNotifyRecordsInfo")
        private java.util.List<LiveStreamNotifyRecordsInfo> liveStreamNotifyRecordsInfo;

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
        public java.util.List<LiveStreamNotifyRecordsInfo> getLiveStreamNotifyRecordsInfo() {
            return this.liveStreamNotifyRecordsInfo;
        }

        public static final class Builder {
            private java.util.List<LiveStreamNotifyRecordsInfo> liveStreamNotifyRecordsInfo; 

            private Builder() {
            } 

            private Builder(NotifyRecordsInfo model) {
                this.liveStreamNotifyRecordsInfo = model.liveStreamNotifyRecordsInfo;
            } 

            /**
             * LiveStreamNotifyRecordsInfo.
             */
            public Builder liveStreamNotifyRecordsInfo(java.util.List<LiveStreamNotifyRecordsInfo> liveStreamNotifyRecordsInfo) {
                this.liveStreamNotifyRecordsInfo = liveStreamNotifyRecordsInfo;
                return this;
            }

            public NotifyRecordsInfo build() {
                return new NotifyRecordsInfo(this);
            } 

        } 

    }
}
