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
 * {@link DescribeLiveCenterTransferResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveCenterTransferResponseBody</p>
 */
public class DescribeLiveCenterTransferResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LiveCenterTransferInfoList")
    private LiveCenterTransferInfoList liveCenterTransferInfoList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLiveCenterTransferResponseBody(Builder builder) {
        this.liveCenterTransferInfoList = builder.liveCenterTransferInfoList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveCenterTransferResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return liveCenterTransferInfoList
     */
    public LiveCenterTransferInfoList getLiveCenterTransferInfoList() {
        return this.liveCenterTransferInfoList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LiveCenterTransferInfoList liveCenterTransferInfoList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLiveCenterTransferResponseBody model) {
            this.liveCenterTransferInfoList = model.liveCenterTransferInfoList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The stream relay information.</p>
         */
        public Builder liveCenterTransferInfoList(LiveCenterTransferInfoList liveCenterTransferInfoList) {
            this.liveCenterTransferInfoList = liveCenterTransferInfoList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C4865B85-664B-19D3-BB16-C62FB83C8226</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveCenterTransferResponseBody build() {
            return new DescribeLiveCenterTransferResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveCenterTransferResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveCenterTransferResponseBody</p>
     */
    public static class LiveCenterTransferInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("DstUrl")
        private String dstUrl;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        @com.aliyun.core.annotation.NameInMap("TransferArgs")
        private String transferArgs;

        private LiveCenterTransferInfo(Builder builder) {
            this.appName = builder.appName;
            this.domainName = builder.domainName;
            this.dstUrl = builder.dstUrl;
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
            this.streamName = builder.streamName;
            this.transferArgs = builder.transferArgs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveCenterTransferInfo create() {
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
         * @return dstUrl
         */
        public String getDstUrl() {
            return this.dstUrl;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        /**
         * @return transferArgs
         */
        public String getTransferArgs() {
            return this.transferArgs;
        }

        public static final class Builder {
            private String appName; 
            private String domainName; 
            private String dstUrl; 
            private String endTime; 
            private String startTime; 
            private String streamName; 
            private String transferArgs; 

            private Builder() {
            } 

            private Builder(LiveCenterTransferInfo model) {
                this.appName = model.appName;
                this.domainName = model.domainName;
                this.dstUrl = model.dstUrl;
                this.endTime = model.endTime;
                this.startTime = model.startTime;
                this.streamName = model.streamName;
                this.transferArgs = model.transferArgs;
            } 

            /**
             * <p>The name of the application to which the live stream belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>teststream</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The streaming domain.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The third-party URL to which the live stream is relayed.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://push.example2.aliyunlive.com/testapp1/teststream2</p>
             */
            public Builder dstUrl(String dstUrl) {
                this.dstUrl = dstUrl;
                return this;
            }

            /**
             * <p>The end time of stream relay.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-29T15:16:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The start time of stream relay.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-28T15:16:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The name of the live stream.</p>
             * 
             * <strong>example:</strong>
             * <p>teststream</p>
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            /**
             * <p>The validity period of stream relay. Valid values:</p>
             * <ul>
             * <li><strong>always</strong>: The stream can always be relayed.</li>
             * <li><strong>time</strong>: The stream can be relayed in a specified time period.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>time</p>
             */
            public Builder transferArgs(String transferArgs) {
                this.transferArgs = transferArgs;
                return this;
            }

            public LiveCenterTransferInfo build() {
                return new LiveCenterTransferInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveCenterTransferResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveCenterTransferResponseBody</p>
     */
    public static class LiveCenterTransferInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LiveCenterTransferInfo")
        private java.util.List<LiveCenterTransferInfo> liveCenterTransferInfo;

        private LiveCenterTransferInfoList(Builder builder) {
            this.liveCenterTransferInfo = builder.liveCenterTransferInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveCenterTransferInfoList create() {
            return builder().build();
        }

        /**
         * @return liveCenterTransferInfo
         */
        public java.util.List<LiveCenterTransferInfo> getLiveCenterTransferInfo() {
            return this.liveCenterTransferInfo;
        }

        public static final class Builder {
            private java.util.List<LiveCenterTransferInfo> liveCenterTransferInfo; 

            private Builder() {
            } 

            private Builder(LiveCenterTransferInfoList model) {
                this.liveCenterTransferInfo = model.liveCenterTransferInfo;
            } 

            /**
             * LiveCenterTransferInfo.
             */
            public Builder liveCenterTransferInfo(java.util.List<LiveCenterTransferInfo> liveCenterTransferInfo) {
                this.liveCenterTransferInfo = liveCenterTransferInfo;
                return this;
            }

            public LiveCenterTransferInfoList build() {
                return new LiveCenterTransferInfoList(this);
            } 

        } 

    }
}
