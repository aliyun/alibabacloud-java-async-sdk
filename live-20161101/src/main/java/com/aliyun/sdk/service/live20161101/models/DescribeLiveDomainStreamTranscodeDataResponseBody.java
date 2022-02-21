// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveDomainStreamTranscodeDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainStreamTranscodeDataResponseBody</p>
 */
public class DescribeLiveDomainStreamTranscodeDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TranscodeDataList")
    private TranscodeDataList transcodeDataList;

    private DescribeLiveDomainStreamTranscodeDataResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.transcodeDataList = builder.transcodeDataList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainStreamTranscodeDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return transcodeDataList
     */
    public TranscodeDataList getTranscodeDataList() {
        return this.transcodeDataList;
    }

    public static final class Builder {
        private String requestId; 
        private TranscodeDataList transcodeDataList; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TranscodeDataList.
         */
        public Builder transcodeDataList(TranscodeDataList transcodeDataList) {
            this.transcodeDataList = transcodeDataList;
            return this;
        }

        public DescribeLiveDomainStreamTranscodeDataResponseBody build() {
            return new DescribeLiveDomainStreamTranscodeDataResponseBody(this);
        } 

    } 

    public static class TranscodeData extends TeaModel {
        @NameInMap("Domain")
        private String domain;

        @NameInMap("Duration")
        private Integer duration;

        @NameInMap("Fps")
        private String fps;

        @NameInMap("Region")
        private String region;

        @NameInMap("Resolution")
        private String resolution;

        @NameInMap("TanscodeType")
        private String tanscodeType;

        @NameInMap("TimeStamp")
        private String timeStamp;

        private TranscodeData(Builder builder) {
            this.domain = builder.domain;
            this.duration = builder.duration;
            this.fps = builder.fps;
            this.region = builder.region;
            this.resolution = builder.resolution;
            this.tanscodeType = builder.tanscodeType;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeData create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return fps
         */
        public String getFps() {
            return this.fps;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return resolution
         */
        public String getResolution() {
            return this.resolution;
        }

        /**
         * @return tanscodeType
         */
        public String getTanscodeType() {
            return this.tanscodeType;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private String domain; 
            private Integer duration; 
            private String fps; 
            private String region; 
            private String resolution; 
            private String tanscodeType; 
            private String timeStamp; 

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Fps.
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Resolution.
             */
            public Builder resolution(String resolution) {
                this.resolution = resolution;
                return this;
            }

            /**
             * TanscodeType.
             */
            public Builder tanscodeType(String tanscodeType) {
                this.tanscodeType = tanscodeType;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public TranscodeData build() {
                return new TranscodeData(this);
            } 

        } 

    }
    public static class TranscodeDataList extends TeaModel {
        @NameInMap("TranscodeData")
        private java.util.List < TranscodeData> transcodeData;

        private TranscodeDataList(Builder builder) {
            this.transcodeData = builder.transcodeData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeDataList create() {
            return builder().build();
        }

        /**
         * @return transcodeData
         */
        public java.util.List < TranscodeData> getTranscodeData() {
            return this.transcodeData;
        }

        public static final class Builder {
            private java.util.List < TranscodeData> transcodeData; 

            /**
             * TranscodeData.
             */
            public Builder transcodeData(java.util.List < TranscodeData> transcodeData) {
                this.transcodeData = transcodeData;
                return this;
            }

            public TranscodeDataList build() {
                return new TranscodeDataList(this);
            } 

        } 

    }
}
