// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryMediaCensorJobDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMediaCensorJobDetailResponseBody</p>
 */
public class QueryMediaCensorJobDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MediaCensorJobDetail")
    private MediaCensorJobDetail mediaCensorJobDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryMediaCensorJobDetailResponseBody(Builder builder) {
        this.mediaCensorJobDetail = builder.mediaCensorJobDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMediaCensorJobDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return mediaCensorJobDetail
     */
    public MediaCensorJobDetail getMediaCensorJobDetail() {
        return this.mediaCensorJobDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MediaCensorJobDetail mediaCensorJobDetail; 
        private String requestId; 

        /**
         * <p>The results of the content moderation job.</p>
         */
        public Builder mediaCensorJobDetail(MediaCensorJobDetail mediaCensorJobDetail) {
            this.mediaCensorJobDetail = mediaCensorJobDetail;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B42299E6-F71F-465F-8FE9-4FC2E3D3C2CA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryMediaCensorJobDetailResponseBody build() {
            return new QueryMediaCensorJobDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMediaCensorJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobDetailResponseBody</p>
     */
    public static class AudioDetailResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Integer endTime;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Integer startTime;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private AudioDetailResult(Builder builder) {
            this.endTime = builder.endTime;
            this.label = builder.label;
            this.startTime = builder.startTime;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioDetailResult create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Integer getEndTime() {
            return this.endTime;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return startTime
         */
        public Integer getStartTime() {
            return this.startTime;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private Integer endTime; 
            private String label; 
            private Integer startTime; 
            private String text; 

            /**
             * EndTime.
             */
            public Builder endTime(Integer endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Integer startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public AudioDetailResult build() {
                return new AudioDetailResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaCensorJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobDetailResponseBody</p>
     */
    public static class AudioDetailResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioDetailResult")
        private java.util.List < AudioDetailResult> audioDetailResult;

        private AudioDetailResultList(Builder builder) {
            this.audioDetailResult = builder.audioDetailResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioDetailResultList create() {
            return builder().build();
        }

        /**
         * @return audioDetailResult
         */
        public java.util.List < AudioDetailResult> getAudioDetailResult() {
            return this.audioDetailResult;
        }

        public static final class Builder {
            private java.util.List < AudioDetailResult> audioDetailResult; 

            /**
             * AudioDetailResult.
             */
            public Builder audioDetailResult(java.util.List < AudioDetailResult> audioDetailResult) {
                this.audioDetailResult = audioDetailResult;
                return this;
            }

            public AudioDetailResultList build() {
                return new AudioDetailResultList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaCensorJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobDetailResponseBody</p>
     */
    public static class AudioCensorResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioDetailResultList")
        private AudioDetailResultList audioDetailResultList;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        private AudioCensorResult(Builder builder) {
            this.audioDetailResultList = builder.audioDetailResultList;
            this.label = builder.label;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioCensorResult create() {
            return builder().build();
        }

        /**
         * @return audioDetailResultList
         */
        public AudioDetailResultList getAudioDetailResultList() {
            return this.audioDetailResultList;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        public static final class Builder {
            private AudioDetailResultList audioDetailResultList; 
            private String label; 
            private String suggestion; 

            /**
             * AudioDetailResultList.
             */
            public Builder audioDetailResultList(AudioDetailResultList audioDetailResultList) {
                this.audioDetailResultList = audioDetailResultList;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Suggestion.
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public AudioCensorResult build() {
                return new AudioCensorResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaCensorJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobDetailResponseBody</p>
     */
    public static class BarrageCensorResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Rate")
        private String rate;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        private BarrageCensorResult(Builder builder) {
            this.label = builder.label;
            this.rate = builder.rate;
            this.scene = builder.scene;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BarrageCensorResult create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return rate
         */
        public String getRate() {
            return this.rate;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        public static final class Builder {
            private String label; 
            private String rate; 
            private String scene; 
            private String suggestion; 

            /**
             * <p>The labels of the moderation result. Multiple labels are separated with commas (,). Valid values:</p>
             * <ul>
             * <li><strong>spam</strong>: spam</li>
             * <li><strong>ad</strong>: ads</li>
             * <li><strong>abuse</strong>: abuse</li>
             * <li><strong>flood</strong>: excessive junk content</li>
             * <li><strong>contraband</strong>: prohibited content</li>
             * <li><strong>meaningless</strong>: meaningless content</li>
             * <li><strong>normal</strong>: normal content</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The score.</p>
             * 
             * <strong>example:</strong>
             * <p>99.91</p>
             */
            public Builder rate(String rate) {
                this.rate = rate;
                return this;
            }

            /**
             * <p>The moderation scenario. Valid values: The value is <strong>antispam</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>antispam</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The recommended subsequent operation. Valid values:</p>
             * <ul>
             * <li><strong>pass</strong>: The content passes the moderation.</li>
             * <li><strong>review</strong>: The content needs to be manually reviewed again.</li>
             * <li><strong>block</strong>: The content needs to be blocked.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pass</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public BarrageCensorResult build() {
                return new BarrageCensorResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaCensorJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobDetailResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Rate")
        private String rate;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        private Result(Builder builder) {
            this.label = builder.label;
            this.rate = builder.rate;
            this.scene = builder.scene;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return rate
         */
        public String getRate() {
            return this.rate;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        public static final class Builder {
            private String label; 
            private String rate; 
            private String scene; 
            private String suggestion; 

            /**
             * <p>The labels of the moderation result. Multiple labels are separated with commas (,).</p>
             * <ul>
             * <li><p>Valid values in the pornographic content moderation scenario:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content</li>
             * <li><strong>sexy</strong>: sexy content</li>
             * <li><strong>porn</strong>: pornographic content</li>
             * </ul>
             * </li>
             * <li><p>Valid values in the terrorist content moderation scenario:</p>
             * <ul>
             * <li><strong>narmal</strong>: normal content</li>
             * <li><strong>bloody</strong>: bloody content</li>
             * <li><strong>explosion</strong>: explosion and smoke</li>
             * <li><strong>outfit</strong>: special costume</li>
             * <li><strong>logo</strong>: special logo</li>
             * <li><strong>weapon</strong>: weapon</li>
             * <li><strong>politics</strong>: political content</li>
             * <li><strong>violence</strong>: violence</li>
             * <li><strong>crowd</strong>: crowd</li>
             * <li><strong>parade</strong>: parade</li>
             * <li><strong>carcrash</strong>: car accident</li>
             * <li><strong>flag</strong>: flag</li>
             * <li><strong>location</strong>: landmark</li>
             * <li><strong>others</strong>: other content</li>
             * </ul>
             * </li>
             * <li><p>Valid values in the ad moderation scenario:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content</li>
             * <li><strong>ad</strong>: other ads</li>
             * <li><strong>politics</strong>: political content in text</li>
             * <li><strong>porn</strong>: pornographic content in text</li>
             * <li><strong>abuse</strong>: abuse in text</li>
             * <li><strong>terrorism</strong>: terrorist content in text</li>
             * <li><strong>contraband</strong>: prohibited content in text</li>
             * <li><strong>spam</strong>: spam in text</li>
             * <li><strong>npx</strong>: illegal ads</li>
             * <li><strong>qrcode</strong>: QR code</li>
             * <li><strong>programCode</strong>: mini program code</li>
             * </ul>
             * </li>
             * <li><p>Valid values in the live moderation scenario:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content</li>
             * <li><strong>meaningless</strong>: meaningless content, such as a black or white screen</li>
             * <li><strong>PIP</strong>: picture-in-picture</li>
             * <li><strong>smoking</strong>: smoking</li>
             * <li><strong>drivelive</strong>: live broadcasting in a running vehicle</li>
             * </ul>
             * </li>
             * <li><p>Valid values in the logo moderation scenario:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content</li>
             * <li><strong>TV</strong>: controlled TV station logo</li>
             * <li><strong>trademark</strong>: trademark</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The score. Valid values: <strong>0 to 100</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder rate(String rate) {
                this.rate = rate;
                return this;
            }

            /**
             * <p>The moderation scenario. Valid values:</p>
             * <ul>
             * <li><strong>porn</strong>: pornographic content moderation</li>
             * <li><strong>terrorism</strong>: terrorist content moderation</li>
             * <li><strong>ad</strong>: ad violation moderation</li>
             * <li><strong>live</strong>: undesirable scene moderation</li>
             * <li><strong>logo</strong>: logo moderation</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>porn</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The recommended subsequent operation. Valid values:</p>
             * <ul>
             * <li><strong>pass</strong>: The content passes the moderation.</li>
             * <li><strong>review</strong>: The content needs to be manually reviewed again.</li>
             * <li><strong>block</strong>: The content needs to be blocked.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pass</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaCensorJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobDetailResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List < Result> result;

        private Results(Builder builder) {
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public java.util.List < Result> getResult() {
            return this.result;
        }

        public static final class Builder {
            private java.util.List < Result> result; 

            /**
             * Result.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaCensorJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobDetailResponseBody</p>
     */
    public static class CoverImageCensorResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("Object")
        private String object;

        @com.aliyun.core.annotation.NameInMap("Results")
        private Results results;

        private CoverImageCensorResult(Builder builder) {
            this.bucket = builder.bucket;
            this.location = builder.location;
            this.object = builder.object;
            this.results = builder.results;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CoverImageCensorResult create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return object
         */
        public String getObject() {
            return this.object;
        }

        /**
         * @return results
         */
        public Results getResults() {
            return this.results;
        }

        public static final class Builder {
            private String bucket; 
            private String location; 
            private String object; 
            private Results results; 

            /**
             * <p>The OSS bucket that stores the video thumbnail.</p>
             * 
             * <strong>example:</strong>
             * <p>bucket-out-test-****</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The OSS region in which the video thumbnail resides.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-shanghai</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The Object Storage Service (OSS) object that is used as the video thumbnail.</p>
             * 
             * <strong>example:</strong>
             * <p>test/ai/censor/v2/vme-****.jpg</p>
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * <p>The moderation results.</p>
             */
            public Builder results(Results results) {
                this.results = results;
                return this;
            }

            public CoverImageCensorResult build() {
                return new CoverImageCensorResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaCensorJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobDetailResponseBody</p>
     */
    public static class CoverImageCensorResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CoverImageCensorResult")
        private java.util.List < CoverImageCensorResult> coverImageCensorResult;

        private CoverImageCensorResults(Builder builder) {
            this.coverImageCensorResult = builder.coverImageCensorResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CoverImageCensorResults create() {
            return builder().build();
        }

        /**
         * @return coverImageCensorResult
         */
        public java.util.List < CoverImageCensorResult> getCoverImageCensorResult() {
            return this.coverImageCensorResult;
        }

        public static final class Builder {
            private java.util.List < CoverImageCensorResult> coverImageCensorResult; 

            /**
             * CoverImageCensorResult.
             */
            public Builder coverImageCensorResult(java.util.List < CoverImageCensorResult> coverImageCensorResult) {
                this.coverImageCensorResult = coverImageCensorResult;
                return this;
            }

            public CoverImageCensorResults build() {
                return new CoverImageCensorResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaCensorJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobDetailResponseBody</p>
     */
    public static class DescCensorResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Rate")
        private String rate;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        private DescCensorResult(Builder builder) {
            this.label = builder.label;
            this.rate = builder.rate;
            this.scene = builder.scene;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescCensorResult create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return rate
         */
        public String getRate() {
            return this.rate;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        public static final class Builder {
            private String label; 
            private String rate; 
            private String scene; 
            private String suggestion; 

            /**
             * <p>The labels of the moderation result. Valid values:</p>
             * <ul>
             * <li><strong>spam</strong>: spam</li>
             * <li><strong>ad</strong>: ads</li>
             * <li><strong>abuse</strong>: abuse</li>
             * <li><strong>flood</strong>: excessive junk content</li>
             * <li><strong>contraband</strong>: prohibited content</li>
             * <li><strong>meaningless</strong>: meaningless content</li>
             * <li><strong>normal</strong>: normal content</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The score.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder rate(String rate) {
                this.rate = rate;
                return this;
            }

            /**
             * <p>The moderation scenario. Valid values: The value is <strong>antispam</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>antispam</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The recommended subsequent operation. Valid values:</p>
             * <ul>
             * <li><strong>pass</strong>: The content passes the moderation.</li>
             * <li><strong>review</strong>: The content needs to be manually reviewed again.</li>
             * <li><strong>block</strong>: The content needs to be blocked.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>review</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public DescCensorResult build() {
                return new DescCensorResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaCensorJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobDetailResponseBody</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("Object")
        private String object;

        private Input(Builder builder) {
            this.bucket = builder.bucket;
            this.location = builder.location;
            this.object = builder.object;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return object
         */
        public String getObject() {
            return this.object;
        }

        public static final class Builder {
            private String bucket; 
            private String location; 
            private String object; 

            /**
             * <p>The name of the OSS bucket in which the input media file is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>bucket-test-in-****</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The OSS region in which the input media file resides.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-shanghai</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The name of the OSS object that is used as the input media file.</p>
             * 
             * <strong>example:</strong>
             * <p>test/ai/censor/test-****.mp4</p>
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaCensorJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobDetailResponseBody</p>
     */
    public static class TitleCensorResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Rate")
        private String rate;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        private TitleCensorResult(Builder builder) {
            this.label = builder.label;
            this.rate = builder.rate;
            this.scene = builder.scene;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TitleCensorResult create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return rate
         */
        public String getRate() {
            return this.rate;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        public static final class Builder {
            private String label; 
            private String rate; 
            private String scene; 
            private String suggestion; 

            /**
             * <p>The labels of the moderation result. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content</li>
             * <li><strong>spam</strong>: spam</li>
             * <li><strong>ad</strong>: ads</li>
             * <li><strong>abuse</strong>: abuse</li>
             * <li><strong>flood</strong>: excessive junk content</li>
             * <li><strong>contraband</strong>: prohibited content</li>
             * <li><strong>meaningless</strong>: meaningless content</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>meaningless</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The score.</p>
             * 
             * <strong>example:</strong>
             * <p>99.91</p>
             */
            public Builder rate(String rate) {
                this.rate = rate;
                return this;
            }

            /**
             * <p>The moderation scenario. Valid values: The value is <strong>antispam</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>antispam</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The recommended subsequent operation. Valid values:</p>
             * <ul>
             * <li><strong>pass</strong>: The content passes the moderation.</li>
             * <li><strong>review</strong>: The content needs to be manually reviewed again.</li>
             * <li><strong>block</strong>: The content needs to be blocked.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>block</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public TitleCensorResult build() {
                return new TitleCensorResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaCensorJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobDetailResponseBody</p>
     */
    public static class CensorResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Rate")
        private String rate;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        private CensorResult(Builder builder) {
            this.label = builder.label;
            this.rate = builder.rate;
            this.scene = builder.scene;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CensorResult create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return rate
         */
        public String getRate() {
            return this.rate;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        public static final class Builder {
            private String label; 
            private String rate; 
            private String scene; 
            private String suggestion; 

            /**
             * <p>The labels of the moderation result. Multiple labels are separated with commas (,). Valid values:</p>
             * <ul>
             * <li><p>Valid values in the pornographic content moderation scenario:</p>
             * <ul>
             * <li><strong>porn</strong>: pornographic content</li>
             * <li><strong>sexy</strong>: sexy content</li>
             * <li><strong>normal</strong>: normal content</li>
             * </ul>
             * </li>
             * <li><p>Valid values in the terrorist content moderation scenario:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content</li>
             * <li><strong>bloody</strong>: bloody content</li>
             * <li><strong>explosion</strong>: explosion and smoke</li>
             * <li><strong>outfit</strong>: special costume</li>
             * <li><strong>logo</strong>: special logo</li>
             * <li><strong>weapon</strong>: weapon</li>
             * <li><strong>politics</strong>: political content</li>
             * <li><strong>violence</strong>: violence</li>
             * <li><strong>crowd</strong>: crowd</li>
             * <li><strong>parade</strong>: parade</li>
             * <li><strong>carcrash</strong>: car accident</li>
             * <li><strong>flag</strong>: flag</li>
             * <li><strong>location</strong>: landmark</li>
             * <li><strong>others</strong>: other content</li>
             * </ul>
             * </li>
             * <li><p>Valid values in the ad moderation scenario:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content</li>
             * <li><strong>ad</strong>: other ads</li>
             * <li><strong>politics</strong>: political content in text</li>
             * <li><strong>porn</strong>: pornographic content in text</li>
             * <li><strong>abuse</strong>: abuse in text</li>
             * <li><strong>terrorism</strong>: terrorist content in text</li>
             * <li><strong>contraband</strong>: prohibited content in text</li>
             * <li><strong>spam</strong>: spam in text</li>
             * <li><strong>npx</strong>: illegal ads</li>
             * <li><strong>qrcode</strong>: QR code</li>
             * <li><strong>programCode</strong>: mini program code</li>
             * </ul>
             * </li>
             * <li><p>Valid values in the live moderation scenario:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content</li>
             * <li><strong>meaningless</strong>: meaningless content, such as a black or white screen</li>
             * <li><strong>PIP</strong>: picture-in-picture</li>
             * <li><strong>smoking</strong>: smoking</li>
             * <li><strong>drivelive</strong>: live broadcasting in a running vehicle</li>
             * </ul>
             * </li>
             * <li><p>Valid values in the logo moderation scenario:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content</li>
             * <li><strong>TV</strong>: controlled TV station logo</li>
             * <li><strong>trademark</strong>: trademark</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>meaningless</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The score.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder rate(String rate) {
                this.rate = rate;
                return this;
            }

            /**
             * <p>The moderation scenario. Valid values:</p>
             * <ul>
             * <li><strong>porn</strong>: pornographic content moderation</li>
             * <li><strong>terrorism</strong>: terrorist content moderation</li>
             * <li><strong>ad</strong>: ad violation moderation</li>
             * <li><strong>live</strong>: undesirable scene moderation</li>
             * <li><strong>logo</strong>: logo moderation</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>terrorism</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The recommended subsequent operation. Valid values:</p>
             * <ul>
             * <li><strong>pass</strong>: The content passes the moderation.</li>
             * <li><strong>review</strong>: The content needs to be manually reviewed again.</li>
             * <li><strong>block</strong>: The content needs to be blocked.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>review</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public CensorResult build() {
                return new CensorResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaCensorJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobDetailResponseBody</p>
     */
    public static class CensorResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CensorResult")
        private java.util.List < CensorResult> censorResult;

        private CensorResults(Builder builder) {
            this.censorResult = builder.censorResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CensorResults create() {
            return builder().build();
        }

        /**
         * @return censorResult
         */
        public java.util.List < CensorResult> getCensorResult() {
            return this.censorResult;
        }

        public static final class Builder {
            private java.util.List < CensorResult> censorResult; 

            /**
             * CensorResult.
             */
            public Builder censorResult(java.util.List < CensorResult> censorResult) {
                this.censorResult = censorResult;
                return this;
            }

            public CensorResults build() {
                return new CensorResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaCensorJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobDetailResponseBody</p>
     */
    public static class CensorResultsCensorResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Rate")
        private String rate;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        private CensorResultsCensorResult(Builder builder) {
            this.label = builder.label;
            this.rate = builder.rate;
            this.scene = builder.scene;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CensorResultsCensorResult create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return rate
         */
        public String getRate() {
            return this.rate;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        public static final class Builder {
            private String label; 
            private String rate; 
            private String scene; 
            private String suggestion; 

            /**
             * <p>The labels of the moderation result. Multiple labels are separated with commas (,). Valid values:</p>
             * <ul>
             * <li><p>Valid values in the pornographic content moderation scenario:</p>
             * <ul>
             * <li><strong>porn</strong>: pornographic content</li>
             * <li><strong>sexy</strong>: sexy content</li>
             * <li><strong>normal</strong>: normal content</li>
             * </ul>
             * </li>
             * <li><p>Valid values in the terrorist content moderation scenario:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content</li>
             * <li><strong>bloody</strong>: bloody content</li>
             * <li><strong>explosion</strong>: explosion and smoke</li>
             * <li><strong>outfit</strong>: special costume</li>
             * <li><strong>logo</strong>: special logo</li>
             * <li><strong>weapon</strong>: weapon</li>
             * <li><strong>politics</strong>: political content</li>
             * <li><strong>violence</strong>: violence</li>
             * <li><strong>crowd</strong>: crowd</li>
             * <li><strong>parade</strong>: parade</li>
             * <li><strong>carcrash</strong>: car accident</li>
             * <li><strong>flag</strong>: flag</li>
             * <li><strong>location</strong>: landmark</li>
             * <li><strong>others</strong>: other content</li>
             * </ul>
             * </li>
             * <li><p>Valid values in the ad moderation scenario:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content</li>
             * <li><strong>ad</strong>: other ads</li>
             * <li><strong>politics</strong>: political content in text</li>
             * <li><strong>porn</strong>: pornographic content in text</li>
             * <li><strong>abuse</strong>: abuse in text</li>
             * <li><strong>terrorism</strong>: terrorist content in text</li>
             * <li><strong>contraband</strong>: prohibited content in text</li>
             * <li><strong>spam</strong>: spam in text</li>
             * <li><strong>npx</strong>: illegal ads</li>
             * <li><strong>qrcode</strong>: QR code</li>
             * <li><strong>programCode</strong>: mini program code</li>
             * </ul>
             * </li>
             * <li><p>Valid values in the live moderation scenario:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content</li>
             * <li><strong>meaningless</strong>: meaningless content, such as a black or white screen</li>
             * <li><strong>PIP</strong>: picture-in-picture</li>
             * <li><strong>smoking</strong>: smoking</li>
             * <li><strong>drivelive</strong>: live broadcasting in a running vehicle</li>
             * </ul>
             * </li>
             * <li><p>Valid values in the logo moderation scenario:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content</li>
             * <li><strong>TV</strong>: controlled TV station logo</li>
             * <li><strong>trademark</strong>: trademark</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>porn,ad</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The score.</p>
             * 
             * <strong>example:</strong>
             * <p>99.99</p>
             */
            public Builder rate(String rate) {
                this.rate = rate;
                return this;
            }

            /**
             * <p>The moderation scenario. Valid values:</p>
             * <ul>
             * <li><strong>porn</strong>: pornographic content moderation</li>
             * <li><strong>terrorism</strong>: terrorist content moderation</li>
             * <li><strong>ad</strong>: ad violation moderation</li>
             * <li><strong>live</strong>: undesirable scene moderation</li>
             * <li><strong>logo</strong>: logo moderation</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>porn</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The recommended subsequent operation. Valid values:</p>
             * <ul>
             * <li><strong>pass</strong>: The content passes the moderation.</li>
             * <li><strong>review</strong>: The content needs to be manually reviewed again.</li>
             * <li><strong>block</strong>: The content needs to be blocked.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>block</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public CensorResultsCensorResult build() {
                return new CensorResultsCensorResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaCensorJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobDetailResponseBody</p>
     */
    public static class VideoTimelineCensorResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CensorResult")
        private java.util.List < CensorResultsCensorResult> censorResult;

        private VideoTimelineCensorResults(Builder builder) {
            this.censorResult = builder.censorResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoTimelineCensorResults create() {
            return builder().build();
        }

        /**
         * @return censorResult
         */
        public java.util.List < CensorResultsCensorResult> getCensorResult() {
            return this.censorResult;
        }

        public static final class Builder {
            private java.util.List < CensorResultsCensorResult> censorResult; 

            /**
             * CensorResult.
             */
            public Builder censorResult(java.util.List < CensorResultsCensorResult> censorResult) {
                this.censorResult = censorResult;
                return this;
            }

            public VideoTimelineCensorResults build() {
                return new VideoTimelineCensorResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaCensorJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobDetailResponseBody</p>
     */
    public static class VideoTimeline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CensorResults")
        private VideoTimelineCensorResults censorResults;

        @com.aliyun.core.annotation.NameInMap("Object")
        private String object;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        private VideoTimeline(Builder builder) {
            this.censorResults = builder.censorResults;
            this.object = builder.object;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoTimeline create() {
            return builder().build();
        }

        /**
         * @return censorResults
         */
        public VideoTimelineCensorResults getCensorResults() {
            return this.censorResults;
        }

        /**
         * @return object
         */
        public String getObject() {
            return this.object;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private VideoTimelineCensorResults censorResults; 
            private String object; 
            private String timestamp; 

            /**
             * <p>The moderation results that include information such as labels and scores.</p>
             */
            public Builder censorResults(VideoTimelineCensorResults censorResults) {
                this.censorResults = censorResults;
                return this;
            }

            /**
             * <p>The one or more OSS objects that are generated as the output snapshots.</p>
             * <blockquote>
             * <p>In the example, {Count} is a placeholder. The OSS objects that are generated as output snapshots are named <code>output00001-****.jpg</code>, <code>output00002-****.jpg</code>, and so on.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>output{Count}.jpg</p>
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * <p>The position in the video. Format: <code>hh:mm:ss[.SSS]</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>00:02:59.999</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public VideoTimeline build() {
                return new VideoTimeline(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaCensorJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobDetailResponseBody</p>
     */
    public static class VideoTimelines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VideoTimeline")
        private java.util.List < VideoTimeline> videoTimeline;

        private VideoTimelines(Builder builder) {
            this.videoTimeline = builder.videoTimeline;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoTimelines create() {
            return builder().build();
        }

        /**
         * @return videoTimeline
         */
        public java.util.List < VideoTimeline> getVideoTimeline() {
            return this.videoTimeline;
        }

        public static final class Builder {
            private java.util.List < VideoTimeline> videoTimeline; 

            /**
             * VideoTimeline.
             */
            public Builder videoTimeline(java.util.List < VideoTimeline> videoTimeline) {
                this.videoTimeline = videoTimeline;
                return this;
            }

            public VideoTimelines build() {
                return new VideoTimelines(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaCensorJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobDetailResponseBody</p>
     */
    public static class VensorCensorResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CensorResults")
        private CensorResults censorResults;

        @com.aliyun.core.annotation.NameInMap("NextPageToken")
        private String nextPageToken;

        @com.aliyun.core.annotation.NameInMap("VideoTimelines")
        private VideoTimelines videoTimelines;

        private VensorCensorResult(Builder builder) {
            this.censorResults = builder.censorResults;
            this.nextPageToken = builder.nextPageToken;
            this.videoTimelines = builder.videoTimelines;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VensorCensorResult create() {
            return builder().build();
        }

        /**
         * @return censorResults
         */
        public CensorResults getCensorResults() {
            return this.censorResults;
        }

        /**
         * @return nextPageToken
         */
        public String getNextPageToken() {
            return this.nextPageToken;
        }

        /**
         * @return videoTimelines
         */
        public VideoTimelines getVideoTimelines() {
            return this.videoTimelines;
        }

        public static final class Builder {
            private CensorResults censorResults; 
            private String nextPageToken; 
            private VideoTimelines videoTimelines; 

            /**
             * <p>A collection of the moderation results. The information includes the summary of various scenarios such as pornographic content and terrorist content.</p>
             */
            public Builder censorResults(CensorResults censorResults) {
                this.censorResults = censorResults;
                return this;
            }

            /**
             * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results.</p>
             * 
             * <strong>example:</strong>
             * <p>ea04afcca7cd4e80b9ece8fbb251****</p>
             */
            public Builder nextPageToken(String nextPageToken) {
                this.nextPageToken = nextPageToken;
                return this;
            }

            /**
             * <p>The moderation results that are sorted in ascending order by time.</p>
             */
            public Builder videoTimelines(VideoTimelines videoTimelines) {
                this.videoTimelines = videoTimelines;
                return this;
            }

            public VensorCensorResult build() {
                return new VensorCensorResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaCensorJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobDetailResponseBody</p>
     */
    public static class OutputFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("Object")
        private String object;

        private OutputFile(Builder builder) {
            this.bucket = builder.bucket;
            this.location = builder.location;
            this.object = builder.object;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputFile create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return object
         */
        public String getObject() {
            return this.object;
        }

        public static final class Builder {
            private String bucket; 
            private String location; 
            private String object; 

            /**
             * <p>The OSS bucket that stores the output snapshots.</p>
             * 
             * <strong>example:</strong>
             * <p>test-bucket-****</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The region in which the OSS bucket that stores the output snapshot resides.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-shanghai</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The one or more OSS objects that are generated as the output snapshots.</p>
             * <blockquote>
             * <p>In the example, {Count} is a placeholder. The OSS objects that are generated as output snapshots are named <code>output00001-****.jpg</code>, <code>output00002-****.jpg</code>, and so on.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>output{Count}.jpg</p>
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            public OutputFile build() {
                return new OutputFile(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaCensorJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobDetailResponseBody</p>
     */
    public static class VideoCensorConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("OutputFile")
        private OutputFile outputFile;

        @com.aliyun.core.annotation.NameInMap("VideoCensor")
        private String videoCensor;

        private VideoCensorConfig(Builder builder) {
            this.bizType = builder.bizType;
            this.outputFile = builder.outputFile;
            this.videoCensor = builder.videoCensor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoCensorConfig create() {
            return builder().build();
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return outputFile
         */
        public OutputFile getOutputFile() {
            return this.outputFile;
        }

        /**
         * @return videoCensor
         */
        public String getVideoCensor() {
            return this.videoCensor;
        }

        public static final class Builder {
            private String bizType; 
            private OutputFile outputFile; 
            private String videoCensor; 

            /**
             * <p>The custom business type. Default value: common.</p>
             * 
             * <strong>example:</strong>
             * <p>common</p>
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * <p>The information about output snapshots.</p>
             */
            public Builder outputFile(OutputFile outputFile) {
                this.outputFile = outputFile;
                return this;
            }

            /**
             * <p>Indicates whether the video content needs to be moderated. Default value: <strong>true</strong> Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The video content needs to be moderated.</li>
             * <li><strong>false</strong>: The video content does not need to be moderated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder videoCensor(String videoCensor) {
                this.videoCensor = videoCensor;
                return this;
            }

            public VideoCensorConfig build() {
                return new VideoCensorConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaCensorJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobDetailResponseBody</p>
     */
    public static class MediaCensorJobDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioCensorResult")
        private AudioCensorResult audioCensorResult;

        @com.aliyun.core.annotation.NameInMap("BarrageCensorResult")
        private BarrageCensorResult barrageCensorResult;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CoverImageCensorResults")
        private CoverImageCensorResults coverImageCensorResults;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DescCensorResult")
        private DescCensorResult descCensorResult;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("Input")
        private Input input;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("PipelineId")
        private String pipelineId;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("TitleCensorResult")
        private TitleCensorResult titleCensorResult;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        @com.aliyun.core.annotation.NameInMap("VensorCensorResult")
        private VensorCensorResult vensorCensorResult;

        @com.aliyun.core.annotation.NameInMap("VideoCensorConfig")
        private VideoCensorConfig videoCensorConfig;

        private MediaCensorJobDetail(Builder builder) {
            this.audioCensorResult = builder.audioCensorResult;
            this.barrageCensorResult = builder.barrageCensorResult;
            this.code = builder.code;
            this.coverImageCensorResults = builder.coverImageCensorResults;
            this.creationTime = builder.creationTime;
            this.descCensorResult = builder.descCensorResult;
            this.finishTime = builder.finishTime;
            this.input = builder.input;
            this.jobId = builder.jobId;
            this.message = builder.message;
            this.pipelineId = builder.pipelineId;
            this.state = builder.state;
            this.suggestion = builder.suggestion;
            this.titleCensorResult = builder.titleCensorResult;
            this.userData = builder.userData;
            this.vensorCensorResult = builder.vensorCensorResult;
            this.videoCensorConfig = builder.videoCensorConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaCensorJobDetail create() {
            return builder().build();
        }

        /**
         * @return audioCensorResult
         */
        public AudioCensorResult getAudioCensorResult() {
            return this.audioCensorResult;
        }

        /**
         * @return barrageCensorResult
         */
        public BarrageCensorResult getBarrageCensorResult() {
            return this.barrageCensorResult;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return coverImageCensorResults
         */
        public CoverImageCensorResults getCoverImageCensorResults() {
            return this.coverImageCensorResults;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return descCensorResult
         */
        public DescCensorResult getDescCensorResult() {
            return this.descCensorResult;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return input
         */
        public Input getInput() {
            return this.input;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return pipelineId
         */
        public String getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        /**
         * @return titleCensorResult
         */
        public TitleCensorResult getTitleCensorResult() {
            return this.titleCensorResult;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        /**
         * @return vensorCensorResult
         */
        public VensorCensorResult getVensorCensorResult() {
            return this.vensorCensorResult;
        }

        /**
         * @return videoCensorConfig
         */
        public VideoCensorConfig getVideoCensorConfig() {
            return this.videoCensorConfig;
        }

        public static final class Builder {
            private AudioCensorResult audioCensorResult; 
            private BarrageCensorResult barrageCensorResult; 
            private String code; 
            private CoverImageCensorResults coverImageCensorResults; 
            private String creationTime; 
            private DescCensorResult descCensorResult; 
            private String finishTime; 
            private Input input; 
            private String jobId; 
            private String message; 
            private String pipelineId; 
            private String state; 
            private String suggestion; 
            private TitleCensorResult titleCensorResult; 
            private String userData; 
            private VensorCensorResult vensorCensorResult; 
            private VideoCensorConfig videoCensorConfig; 

            /**
             * AudioCensorResult.
             */
            public Builder audioCensorResult(AudioCensorResult audioCensorResult) {
                this.audioCensorResult = audioCensorResult;
                return this;
            }

            /**
             * <p>The moderation result of live comments.</p>
             */
            public Builder barrageCensorResult(BarrageCensorResult barrageCensorResult) {
                this.barrageCensorResult = barrageCensorResult;
                return this;
            }

            /**
             * <p>The error code returned if the job fails. This parameter is not returned if the job is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>InvalidParameter.ResourceNotFound</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The moderation results of thumbnails.</p>
             */
            public Builder coverImageCensorResults(CoverImageCensorResults coverImageCensorResults) {
                this.coverImageCensorResults = coverImageCensorResults;
                return this;
            }

            /**
             * <p>The time when the job was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-09-13T16:32:24Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The moderation result of the description.</p>
             */
            public Builder descCensorResult(DescCensorResult descCensorResult) {
                this.descCensorResult = descCensorResult;
                return this;
            }

            /**
             * <p>The time when the job was complete.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-09-21</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The information about the job input.</p>
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            /**
             * <p>The ID of the content moderation job.</p>
             * 
             * <strong>example:</strong>
             * <p>f8f166eea7a44e9bb0a4aecf9543****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The error message returned if the job fails. This parameter is not returned if the job is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>The resource operated cannot be found</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The ID of the ApsaraVideo Media Processing (MPS) queue to which the content moderation job is submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>c5b30b7c0d0e4a0abde1d5f9e751****</p>
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * <p>The status of the job. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The overall result of the job. Valid values:</p>
             * <ul>
             * <li><strong>pass</strong>: The content passes the moderation.</li>
             * <li><strong>review</strong>: The content needs to be manually reviewed again.</li>
             * <li><strong>block</strong>: The content needs to be blocked.</li>
             * </ul>
             * <p>If the moderation result of one type of the moderated content is review, the overall result is review. If the moderation result of one type of the moderated content is block, the overall result is block.</p>
             * 
             * <strong>example:</strong>
             * <p>block</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * <p>The moderation result of the title.</p>
             */
            public Builder titleCensorResult(TitleCensorResult titleCensorResult) {
                this.titleCensorResult = titleCensorResult;
                return this;
            }

            /**
             * <p>The custom data.</p>
             * 
             * <strong>example:</strong>
             * <p>example userdata ****</p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * <p>The moderation results of the video.</p>
             */
            public Builder vensorCensorResult(VensorCensorResult vensorCensorResult) {
                this.vensorCensorResult = vensorCensorResult;
                return this;
            }

            /**
             * <p>The video moderation configurations.</p>
             */
            public Builder videoCensorConfig(VideoCensorConfig videoCensorConfig) {
                this.videoCensorConfig = videoCensorConfig;
                return this;
            }

            public MediaCensorJobDetail build() {
                return new MediaCensorJobDetail(this);
            } 

        } 

    }
}
