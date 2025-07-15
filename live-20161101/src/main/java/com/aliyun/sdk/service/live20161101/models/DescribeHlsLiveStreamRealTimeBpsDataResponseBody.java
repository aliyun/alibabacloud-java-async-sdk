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
 * {@link DescribeHlsLiveStreamRealTimeBpsDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHlsLiveStreamRealTimeBpsDataResponseBody</p>
 */
public class DescribeHlsLiveStreamRealTimeBpsDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Time")
    private String time;

    @com.aliyun.core.annotation.NameInMap("UsageData")
    private java.util.List<UsageData> usageData;

    private DescribeHlsLiveStreamRealTimeBpsDataResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.time = builder.time;
        this.usageData = builder.usageData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHlsLiveStreamRealTimeBpsDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    /**
     * @return usageData
     */
    public java.util.List<UsageData> getUsageData() {
        return this.usageData;
    }

    public static final class Builder {
        private String requestId; 
        private String time; 
        private java.util.List<UsageData> usageData; 

        private Builder() {
        } 

        private Builder(DescribeHlsLiveStreamRealTimeBpsDataResponseBody model) {
            this.requestId = model.requestId;
            this.time = model.time;
            this.usageData = model.usageData;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>17C16B18-D3EA-4809-9CC3-8A2CBE14BC7B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The timestamp for which the data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-08-08T00:00:00Z</p>
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        /**
         * <p>The usage data.</p>
         */
        public Builder usageData(java.util.List<UsageData> usageData) {
            this.usageData = usageData;
            return this;
        }

        public DescribeHlsLiveStreamRealTimeBpsDataResponseBody build() {
            return new DescribeHlsLiveStreamRealTimeBpsDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHlsLiveStreamRealTimeBpsDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHlsLiveStreamRealTimeBpsDataResponseBody</p>
     */
    public static class Infos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DownFlow")
        private Float downFlow;

        @com.aliyun.core.annotation.NameInMap("Online")
        private Float online;

        @com.aliyun.core.annotation.NameInMap("Rate")
        private String rate;

        private Infos(Builder builder) {
            this.downFlow = builder.downFlow;
            this.online = builder.online;
            this.rate = builder.rate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Infos create() {
            return builder().build();
        }

        /**
         * @return downFlow
         */
        public Float getDownFlow() {
            return this.downFlow;
        }

        /**
         * @return online
         */
        public Float getOnline() {
            return this.online;
        }

        /**
         * @return rate
         */
        public String getRate() {
            return this.rate;
        }

        public static final class Builder {
            private Float downFlow; 
            private Float online; 
            private String rate; 

            private Builder() {
            } 

            private Builder(Infos model) {
                this.downFlow = model.downFlow;
                this.online = model.online;
                this.rate = model.rate;
            } 

            /**
             * <p>The bandwidth. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>11440.88</p>
             */
            public Builder downFlow(Float downFlow) {
                this.downFlow = downFlow;
                return this;
            }

            /**
             * <p>The number of online users.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder online(Float online) {
                this.online = online;
                return this;
            }

            /**
             * <p>The bitrate.</p>
             * 
             * <strong>example:</strong>
             * <p>1028</p>
             */
            public Builder rate(String rate) {
                this.rate = rate;
                return this;
            }

            public Infos build() {
                return new Infos(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHlsLiveStreamRealTimeBpsDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHlsLiveStreamRealTimeBpsDataResponseBody</p>
     */
    public static class StreamInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Infos")
        private java.util.List<Infos> infos;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        private StreamInfos(Builder builder) {
            this.infos = builder.infos;
            this.streamName = builder.streamName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamInfos create() {
            return builder().build();
        }

        /**
         * @return infos
         */
        public java.util.List<Infos> getInfos() {
            return this.infos;
        }

        /**
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        public static final class Builder {
            private java.util.List<Infos> infos; 
            private String streamName; 

            private Builder() {
            } 

            private Builder(StreamInfos model) {
                this.infos = model.infos;
                this.streamName = model.streamName;
            } 

            /**
             * <p>The statistics on the HLS stream.</p>
             */
            public Builder infos(java.util.List<Infos> infos) {
                this.infos = infos;
                return this;
            }

            /**
             * <p>The name of the stream.</p>
             * 
             * <strong>example:</strong>
             * <p>/live/sport.m3u8</p>
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            public StreamInfos build() {
                return new StreamInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHlsLiveStreamRealTimeBpsDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHlsLiveStreamRealTimeBpsDataResponseBody</p>
     */
    public static class UsageData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("StreamInfos")
        private java.util.List<StreamInfos> streamInfos;

        private UsageData(Builder builder) {
            this.domainName = builder.domainName;
            this.streamInfos = builder.streamInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageData create() {
            return builder().build();
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return streamInfos
         */
        public java.util.List<StreamInfos> getStreamInfos() {
            return this.streamInfos;
        }

        public static final class Builder {
            private String domainName; 
            private java.util.List<StreamInfos> streamInfos; 

            private Builder() {
            } 

            private Builder(UsageData model) {
                this.domainName = model.domainName;
                this.streamInfos = model.streamInfos;
            } 

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>Details about the statistics on each HLS stream under the domain name.</p>
             */
            public Builder streamInfos(java.util.List<StreamInfos> streamInfos) {
                this.streamInfos = streamInfos;
                return this;
            }

            public UsageData build() {
                return new UsageData(this);
            } 

        } 

    }
}
