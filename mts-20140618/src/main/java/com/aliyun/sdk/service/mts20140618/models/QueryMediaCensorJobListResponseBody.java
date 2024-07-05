// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMediaCensorJobListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMediaCensorJobListResponseBody</p>
 */
public class QueryMediaCensorJobListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MediaCensorJobList")
    private MediaCensorJobList mediaCensorJobList;

    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.NameInMap("NonExistIds")
    private NonExistIds nonExistIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryMediaCensorJobListResponseBody(Builder builder) {
        this.mediaCensorJobList = builder.mediaCensorJobList;
        this.nextPageToken = builder.nextPageToken;
        this.nonExistIds = builder.nonExistIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMediaCensorJobListResponseBody create() {
        return builder().build();
    }

    /**
     * @return mediaCensorJobList
     */
    public MediaCensorJobList getMediaCensorJobList() {
        return this.mediaCensorJobList;
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return nonExistIds
     */
    public NonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MediaCensorJobList mediaCensorJobList; 
        private String nextPageToken; 
        private NonExistIds nonExistIds; 
        private String requestId; 

        /**
         * The content moderation jobs.
         */
        public Builder mediaCensorJobList(MediaCensorJobList mediaCensorJobList) {
            this.mediaCensorJobList = mediaCensorJobList;
            return this;
        }

        /**
         * The token that is used to retrieve the next page of the query results. The value is a UUID that contains 32 characters. If the returned query results cannot be displayed within one page, this parameter is returned. The value of this parameter is updated for each query.
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * The IDs of the jobs that do not exist. This parameter is not returned if all specified jobs are found.
         */
        public Builder nonExistIds(NonExistIds nonExistIds) {
            this.nonExistIds = nonExistIds;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryMediaCensorJobListResponseBody build() {
            return new QueryMediaCensorJobListResponseBody(this);
        } 

    } 

    public static class AudioCensorResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        private AudioCensorResult(Builder builder) {
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
            private String label; 
            private String suggestion; 

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
             * The labels of the moderation result. Separate multiple labels with commas (,). Valid values:
             * <p>
             * 
             * *   **spam**: spam
             * *   **ad**: ads
             * *   **abuse**: abuse
             * *   **flood**: excessive junk content
             * *   **contraband**: prohibited content
             * *   **meaningless**: meaningless content
             * *   **normal**: normal content
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The score.
             */
            public Builder rate(String rate) {
                this.rate = rate;
                return this;
            }

            /**
             * The moderation scenario. The value is **antispam**.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * The recommended subsequent operation. Valid values:
             * <p>
             * 
             * *   **pass**: The content passes the moderation.
             * *   **review**: The content needs to be manually reviewed again.
             * *   **block**: The content needs to be blocked.
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
             * The labels of the moderation result. Separate multiple labels with commas (,).
             * <p>
             * 
             * *   Valid values in the pornographic content moderation scenario:
             * 
             *     *   **normal**: normal content
             *     *   **sexy**: sexy content
             *     *   **porn**: pornographic content
             * 
             * *   Valid values in the terrorist content moderation scenario:
             * 
             *     *   **normal**: normal content
             *     *   **bloody**: bloody content
             *     *   **explosion**: explosion and smoke
             *     *   **outfit**: special costume
             *     *   **logo**: special logo
             *     *   **weapon**: weapon
             *     *   **politics**: political content
             *     *   **violence**: violence
             *     *   **crowd**: crowd
             *     *   **parade**: parade
             *     *   **carcrash**: car accident
             *     *   **flag**: flag
             *     *   **location**: landmark
             *     *   **others**: other content
             * 
             * *   Valid values in the ad moderation scenario:
             * 
             *     *   **normal**: normal content
             *     *   **ad**: other ads
             *     *   **politics**: political content in text
             *     *   **porn**: pornographic content in text
             *     *   **abuse**: abuse in text
             *     *   **terrorism**: terrorist content in text
             *     *   **contraband**: prohibited content in text
             *     *   **spam**: spam in text
             *     *   **npx**: illegal ads
             *     *   **qrcode**: QR code
             *     *   **programCode**: mini program code
             * 
             * *   Valid values in the live moderation scenario:
             * 
             *     *   **normal**: normal content
             *     *   **meaningless**: meaningless content, such as a black or white screen
             *     *   **PIP**: picture-in-picture
             *     *   **smoking**: smoking
             *     *   **drivelive**: live broadcasting in a running vehicle
             * 
             * *   Valid values in the logo moderation scenario:
             * 
             *     *   **normal**: normal content
             *     *   **TV**: controlled TV station logo
             *     *   **trademark**: trademark
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The score. Valid values: 0 to 100.
             */
            public Builder rate(String rate) {
                this.rate = rate;
                return this;
            }

            /**
             * The moderation scenario. Valid values:
             * <p>
             * 
             * *   **porn**: pornographic content moderation
             * *   **terrorism**: terrorist content moderation
             * *   **ad**: ad violation moderation
             * *   **live**: undesirable scene moderation
             * *   **logo**: special logo moderation
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * The overall result of the job. Valid values:
             * <p>
             * 
             * *   **pass**: The content passes the moderation.
             * *   **review**: The content needs to be manually reviewed again.
             * *   **block**: The content needs to be blocked.
             * 
             * > If the moderation result of any type of the moderated content is review, the overall result is review. If the moderation result of any type of the moderated content is block, the overall result is block.
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
             * The OSS bucket that stores the video thumbnail.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * The OSS region in which the video thumbnail resides.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The Object Storage Service (OSS) object that is used as the video thumbnail.
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * The moderation results of the content moderation jobs.
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
             * The labels of the moderation result. Separate multiple labels with commas (,). Valid values:
             * <p>
             * 
             * *   **spam**: spam
             * *   **ad**: ads
             * *   **abuse**: abuse
             * *   **flood**: excessive junk content
             * *   **contraband**: prohibited content
             * *   **meaningless**: meaningless content
             * *   **normal**: normal content
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The score.
             */
            public Builder rate(String rate) {
                this.rate = rate;
                return this;
            }

            /**
             * The moderation scenario. The value is **antispam**.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * The recommended subsequent operation. Valid values:
             * <p>
             * 
             * *   **pass**: The content passes the moderation.
             * *   **review**: The content needs to be manually reviewed again.
             * *   **block**: The content needs to be blocked.
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
             * The name of the OSS bucket in which the input file is stored.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * The OSS region in which the input file resides.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The name of the OSS object that is used as the input file.
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
             * The labels of the moderation result. Separate multiple labels with commas (,).
             * <p>
             * 
             * *   **normal**: normal content
             * *   **spam**: spam
             * *   **ad**: ads
             * *   **abuse**: abuse content
             * *   **flood**: excessive junk content
             * *   **contraband**: prohibited content
             * *   **meaningless**: meaningless content
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The score.
             */
            public Builder rate(String rate) {
                this.rate = rate;
                return this;
            }

            /**
             * The moderation scenario. The value is **antispam**.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * The recommended subsequent operation. Valid values:
             * <p>
             * 
             * *   **pass**: The content passes the moderation.
             * *   **review**: The content needs to be manually reviewed again.
             * *   **block**: The content needs to be blocked.
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
             * The labels of the moderation result. Separate multiple labels with commas (,).
             * <p>
             * 
             * *   Valid values in the pornographic content moderation scenario:
             * 
             *     *   **porn**: pornographic content
             *     *   **sexy**: sexy content
             *     *   **normal**: normal content
             * 
             * *   Valid values in the terrorist content moderation scenario:
             * 
             *     *   **normal**: normal content
             *     *   **bloody**: bloody content
             *     *   **explosion**: explosion and smoke
             *     *   **outfit**: special costume
             *     *   **logo**: special logo
             *     *   **weapon**: weapon
             *     *   **politics**: political content
             *     *   **violence**: violence
             *     *   **crowd**: crowd
             *     *   **parade**: parade
             *     *   **carcrash**: car accident
             *     *   **flag**: flag
             *     *   **location**: landmark
             *     *   **others**: other content
             * 
             * *   Valid values in the ad moderation scenario:
             * 
             *     *   **normal**: normal content
             *     *   **ad**: other ads
             *     *   **politics**: political content in text
             *     *   **porn**: pornographic content in text
             *     *   **abuse**: abuse in text
             *     *   **terrorism**: terrorist content in text
             *     *   **contraband**: prohibited content in text
             *     *   **spam**: spam in text
             *     *   **npx**: illegal ads
             *     *   **qrcode**: QR code
             *     *   **programCode**: mini program code
             * 
             * *   Valid values in the live moderation scenario:
             * 
             *     *   **normal**: normal content
             *     *   **meaningless**: meaningless content, such as a black or white screen
             *     *   **PIP**: picture-in-picture
             *     *   **smoking**: smoking
             *     *   **drivelive**: live broadcasting in a running vehicle
             * 
             * *   Valid values in the logo moderation scenario:
             * 
             *     *   **normal**: normal content
             *     *   **TV**: controlled TV station logo
             *     *   **trademark**: trademark
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The score.
             */
            public Builder rate(String rate) {
                this.rate = rate;
                return this;
            }

            /**
             * The moderation scenario. Valid values:
             * <p>
             * 
             * *   **porn**: pornographic content moderation
             * *   **terrorism**: terrorist content moderation
             * *   **ad**: ad violation moderation
             * *   **live**: undesirable scene moderation
             * *   **logo**: special logo moderation
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * The recommended subsequent operation. Valid values:
             * <p>
             * 
             * *   **pass**: The content passes the moderation.
             * *   **review**: The content needs to be manually reviewed again.
             * *   **block**: The content needs to be blocked.
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
             * The labels of the moderation result. Separate multiple labels with commas (,). Valid values:
             * <p>
             * 
             * *   Valid values in the pornographic content moderation scenario:
             * 
             *     *   **porn**: pornographic content
             *     *   **sexy**: sexy content
             *     *   **normal**: normal content
             * 
             * *   Valid values in the terrorist content moderation scenario:
             * 
             *     *   **normal**: normal content
             *     *   **bloody**: bloody content
             *     *   **explosion**: explosion and smoke
             *     *   **outfit**: special costume
             *     *   **logo**: special logo
             *     *   **weapon**: weapon
             *     *   **politics**: political content
             *     *   **violence**: violence
             *     *   **crowd**: crowd
             *     *   **parade**: parade
             *     *   **carcrash**: car accident
             *     *   **flag**: flag
             *     *   **location**: landmark
             *     *   **others**: other content
             * 
             * *   Valid values in the ad moderation scenario:
             * 
             *     *   **normal**: normal content
             *     *   **ad**: other ads
             *     *   **politics**: political content in text
             *     *   **porn**: pornographic content in text
             *     *   **abuse**: abuse in text
             *     *   **terrorism**: terrorist content in text
             *     *   **contraband**: prohibited content in text
             *     *   **spam**: spam in text
             *     *   **npx**: illegal ads
             *     *   **qrcode**: QR code
             *     *   **programCode**: mini program code
             * 
             * *   Valid values in the live moderation scenario:
             * 
             *     *   **normal**: normal content
             *     *   **meaningless**: meaningless content, such as a black or white screen
             *     *   **PIP**: picture-in-picture
             *     *   **smoking**: smoking
             *     *   **drivelive**: live broadcasting in a running vehicle
             * 
             * *   Valid values in the logo moderation scenario:
             * 
             *     *   **normal**: normal content
             *     *   **TV**: controlled TV station logo
             *     *   **trademark**: trademark
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The score.
             */
            public Builder rate(String rate) {
                this.rate = rate;
                return this;
            }

            /**
             * The moderation scenario. Valid values:
             * <p>
             * 
             * *   **porn**: pornographic content moderation
             * *   **terrorism**: terrorist content moderation
             * *   **ad**: ad violation moderation
             * *   **live**: undesirable scene moderation
             * *   **logo**: special logo moderation
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * The recommended subsequent operation. Valid values:
             * <p>
             * 
             * *   **pass**: The content passes the moderation.
             * *   **review**: The content needs to be manually reviewed again.
             * *   **block**: The content needs to be blocked.
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
             * The moderation results that include information such as labels and scores.
             */
            public Builder censorResults(VideoTimelineCensorResults censorResults) {
                this.censorResults = censorResults;
                return this;
            }

            /**
             * The OSS object that is generated as the output snapshot.
             * <p>
             * 
             * > In the example, {Count} is a placeholder. The OSS objects that are generated as output snapshots are named `output00001-****.jpg, output00002-****.jpg`, and so on.
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * The position in the video. Format: `hh:mm:ss[.SSS]`.
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
             * A collection of the moderation results. The information includes the summary about various scenarios such as pornographic content and terrorist content.
             */
            public Builder censorResults(CensorResults censorResults) {
                this.censorResults = censorResults;
                return this;
            }

            /**
             * The pagination token that is used in the next request to retrieve a new page of results.
             */
            public Builder nextPageToken(String nextPageToken) {
                this.nextPageToken = nextPageToken;
                return this;
            }

            /**
             * The moderation results that are sorted in ascending order by time.
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
             * The OSS bucket that stores the output snapshot.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * The OSS region in which the OSS bucket for storing the output snapshot resides.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The one or more OSS objects that are generated as the output snapshots.
             * <p>
             * 
             * > In the example, {Count} is a placeholder. The OSS objects that are generated as output snapshots are named `output00001-****.jpg, output00002-****.jpg`, and so on.
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
             * The moderation template. Default value: common. The default value indicates that the default template is used.
             * <p>
             * 
             * > If the moderation template is not specified, the default value common is returned. If a custom moderation template that is created by submitting a ticket is specified, a user ID is returned.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * The information about output snapshots.
             */
            public Builder outputFile(OutputFile outputFile) {
                this.outputFile = outputFile;
                return this;
            }

            /**
             * Indicates whether the video content needs to be moderated. Default value: true. Valid values:
             * <p>
             * 
             * *   **true**: The video content needs to be moderated.
             * *   **false**: The video content does not need to be moderated.
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
    public static class MediaCensorJob extends TeaModel {
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

        private MediaCensorJob(Builder builder) {
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

        public static MediaCensorJob create() {
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
             * The moderation result of live comments.
             */
            public Builder barrageCensorResult(BarrageCensorResult barrageCensorResult) {
                this.barrageCensorResult = barrageCensorResult;
                return this;
            }

            /**
             * The error code returned if the job fails. This parameter is not returned if the job is successful.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The moderation results of thumbnails.
             */
            public Builder coverImageCensorResults(CoverImageCensorResults coverImageCensorResults) {
                this.coverImageCensorResults = coverImageCensorResults;
                return this;
            }

            /**
             * The time when the job was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The moderation result of the description.
             */
            public Builder descCensorResult(DescCensorResult descCensorResult) {
                this.descCensorResult = descCensorResult;
                return this;
            }

            /**
             * The time when the job was completed.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * The information about the job input.
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            /**
             * The ID of the content moderation job.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * The error message returned if the job fails. This parameter is not returned if the job is successful.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The ID of the MPS queue that is used to run the job.
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * The status of the job.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The recommended subsequent operation. Valid values:
             * <p>
             * 
             * *   **pass**: The content passes the moderation.
             * *   **review**: The content needs to be manually reviewed again.
             * *   **block**: The content needs to be blocked.
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * The moderation result of the title.
             */
            public Builder titleCensorResult(TitleCensorResult titleCensorResult) {
                this.titleCensorResult = titleCensorResult;
                return this;
            }

            /**
             * The custom data.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * The moderation results of the video.
             */
            public Builder vensorCensorResult(VensorCensorResult vensorCensorResult) {
                this.vensorCensorResult = vensorCensorResult;
                return this;
            }

            /**
             * The video moderation configurations.
             */
            public Builder videoCensorConfig(VideoCensorConfig videoCensorConfig) {
                this.videoCensorConfig = videoCensorConfig;
                return this;
            }

            public MediaCensorJob build() {
                return new MediaCensorJob(this);
            } 

        } 

    }
    public static class MediaCensorJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MediaCensorJob")
        private java.util.List < MediaCensorJob> mediaCensorJob;

        private MediaCensorJobList(Builder builder) {
            this.mediaCensorJob = builder.mediaCensorJob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaCensorJobList create() {
            return builder().build();
        }

        /**
         * @return mediaCensorJob
         */
        public java.util.List < MediaCensorJob> getMediaCensorJob() {
            return this.mediaCensorJob;
        }

        public static final class Builder {
            private java.util.List < MediaCensorJob> mediaCensorJob; 

            /**
             * MediaCensorJob.
             */
            public Builder mediaCensorJob(java.util.List < MediaCensorJob> mediaCensorJob) {
                this.mediaCensorJob = mediaCensorJob;
                return this;
            }

            public MediaCensorJobList build() {
                return new MediaCensorJobList(this);
            } 

        } 

    }
    public static class NonExistIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("String")
        private java.util.List < String > string;

        private NonExistIds(Builder builder) {
            this.string = builder.string;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NonExistIds create() {
            return builder().build();
        }

        /**
         * @return string
         */
        public java.util.List < String > getString() {
            return this.string;
        }

        public static final class Builder {
            private java.util.List < String > string; 

            /**
             * String.
             */
            public Builder string(java.util.List < String > string) {
                this.string = string;
                return this;
            }

            public NonExistIds build() {
                return new NonExistIds(this);
            } 

        } 

    }
}
