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
 * {@link DescribeLiveDomainStreamTranscodeDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainStreamTranscodeDataResponseBody</p>
 */
public class DescribeLiveDomainStreamTranscodeDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TranscodeDataList")
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
     * @return transcodeDataList
     */
    public TranscodeDataList getTranscodeDataList() {
        return this.transcodeDataList;
    }

    public static final class Builder {
        private String requestId; 
        private TranscodeDataList transcodeDataList; 

        private Builder() {
        } 

        private Builder(DescribeLiveDomainStreamTranscodeDataResponseBody model) {
            this.requestId = model.requestId;
            this.transcodeDataList = model.transcodeDataList;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3C6CCEC4-6B88-4D4A-93E4-D47B3D92CF8F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The transcoding usage data returned at each interval.</p>
         */
        public Builder transcodeDataList(TranscodeDataList transcodeDataList) {
            this.transcodeDataList = transcodeDataList;
            return this;
        }

        public DescribeLiveDomainStreamTranscodeDataResponseBody build() {
            return new DescribeLiveDomainStreamTranscodeDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveDomainStreamTranscodeDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainStreamTranscodeDataResponseBody</p>
     */
    public static class TranscodeData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("Fps")
        private String fps;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Resolution")
        private String resolution;

        @com.aliyun.core.annotation.NameInMap("TanscodeType")
        private String tanscodeType;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
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

            private Builder() {
            } 

            private Builder(TranscodeData model) {
                this.domain = model.domain;
                this.duration = model.duration;
                this.fps = model.fps;
                this.region = model.region;
                this.resolution = model.resolution;
                this.tanscodeType = model.tanscodeType;
                this.timeStamp = model.timeStamp;
            } 

            /**
             * <p>The main streaming domain. This parameter is returned only when you add the domain key to the value of the Split parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The transcoding length. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The frame rate of the transcoded stream. This parameter is returned only when you add the fps key to the value of the Split parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>The region in which the domain name resides. Valid values:</p>
             * <blockquote>
             * <p> This parameter takes effect only when you set Split to region.</p>
             * </blockquote>
             * <ul>
             * <li><strong>cn-beijing</strong>: China (Beijing)</li>
             * <li><strong>cn-shanghai</strong>: China (Shanghai)</li>
             * <li><strong>cn-qingdao</strong>: China (Qingdao)</li>
             * <li><strong>cn-shenzhen</strong>: China (Shenzhen)</li>
             * <li><strong>ap-northeast-1</strong>: Japan (Tokyo)</li>
             * <li><strong>ap-southeast-1</strong>: Singapore</li>
             * <li><strong>ap-southeast-5</strong>: Indonesia (Jakarta)</li>
             * <li><strong>eu-central-1</strong>: Germany (Frankfurt)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The resolution of the transcoded stream. This parameter is returned only when you add the resolution key to the value of the Split parameter. Valid values:</p>
             * <ul>
             * <li><strong>2K</strong></li>
             * <li><strong>4K</strong></li>
             * <li><strong>LD</strong>: low definition</li>
             * <li><strong>SD</strong>: standard definition</li>
             * <li><strong>HD</strong>: high definition</li>
             * <li><strong>def</strong>: audio</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HD</p>
             */
            public Builder resolution(String resolution) {
                this.resolution = resolution;
                return this;
            }

            /**
             * <p>The transcoding type. Valid values:</p>
             * <blockquote>
             * <p> This parameter takes effect only if the request parameter Split is set to transcode_type.</p>
             * </blockquote>
             * <ul>
             * <li><strong>H264NBHD</strong>: Narrowband HD™ transcoding based on H.264</li>
             * <li><strong>H265NBHD</strong>: Narrowband HD™ transcoding based on H.265</li>
             * <li><strong>AUDIO</strong>: audio transcoding</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>H264STD</p>
             */
            public Builder tanscodeType(String tanscodeType) {
                this.tanscodeType = tanscodeType;
                return this;
            }

            /**
             * <p>The timestamp of the data entry.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-10T20:00:00Z</p>
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
    /**
     * 
     * {@link DescribeLiveDomainStreamTranscodeDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainStreamTranscodeDataResponseBody</p>
     */
    public static class TranscodeDataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TranscodeData")
        private java.util.List<TranscodeData> transcodeData;

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
        public java.util.List<TranscodeData> getTranscodeData() {
            return this.transcodeData;
        }

        public static final class Builder {
            private java.util.List<TranscodeData> transcodeData; 

            private Builder() {
            } 

            private Builder(TranscodeDataList model) {
                this.transcodeData = model.transcodeData;
            } 

            /**
             * TranscodeData.
             */
            public Builder transcodeData(java.util.List<TranscodeData> transcodeData) {
                this.transcodeData = transcodeData;
                return this;
            }

            public TranscodeDataList build() {
                return new TranscodeDataList(this);
            } 

        } 

    }
}
