// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHlsLiveStreamRealTimeBpsDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHlsLiveStreamRealTimeBpsDataResponseBody</p>
 */
public class DescribeHlsLiveStreamRealTimeBpsDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Time")
    private String time;

    @NameInMap("UsageData")
    private java.util.List < UsageData> usageData;

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
    public java.util.List < UsageData> getUsageData() {
        return this.usageData;
    }

    public static final class Builder {
        private String requestId; 
        private String time; 
        private java.util.List < UsageData> usageData; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Time.
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        /**
         * UsageData.
         */
        public Builder usageData(java.util.List < UsageData> usageData) {
            this.usageData = usageData;
            return this;
        }

        public DescribeHlsLiveStreamRealTimeBpsDataResponseBody build() {
            return new DescribeHlsLiveStreamRealTimeBpsDataResponseBody(this);
        } 

    } 

    public static class Infos extends TeaModel {
        @NameInMap("DownFlow")
        private Float downFlow;

        @NameInMap("Online")
        private Float online;

        @NameInMap("Rate")
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

            /**
             * DownFlow.
             */
            public Builder downFlow(Float downFlow) {
                this.downFlow = downFlow;
                return this;
            }

            /**
             * Online.
             */
            public Builder online(Float online) {
                this.online = online;
                return this;
            }

            /**
             * Rate.
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
    public static class StreamInfos extends TeaModel {
        @NameInMap("Infos")
        private java.util.List < Infos> infos;

        @NameInMap("StreamName")
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
        public java.util.List < Infos> getInfos() {
            return this.infos;
        }

        /**
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        public static final class Builder {
            private java.util.List < Infos> infos; 
            private String streamName; 

            /**
             * Infos.
             */
            public Builder infos(java.util.List < Infos> infos) {
                this.infos = infos;
                return this;
            }

            /**
             * StreamName.
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
    public static class UsageData extends TeaModel {
        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("StreamInfos")
        private java.util.List < StreamInfos> streamInfos;

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
        public java.util.List < StreamInfos> getStreamInfos() {
            return this.streamInfos;
        }

        public static final class Builder {
            private String domainName; 
            private java.util.List < StreamInfos> streamInfos; 

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * StreamInfos.
             */
            public Builder streamInfos(java.util.List < StreamInfos> streamInfos) {
                this.streamInfos = streamInfos;
                return this;
            }

            public UsageData build() {
                return new UsageData(this);
            } 

        } 

    }
}
