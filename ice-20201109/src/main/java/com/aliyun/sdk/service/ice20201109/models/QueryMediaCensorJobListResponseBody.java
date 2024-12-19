// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
         * <p>The queried content moderation jobs.</p>
         */
        public Builder mediaCensorJobList(MediaCensorJobList mediaCensorJobList) {
            this.mediaCensorJobList = mediaCensorJobList;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. The value is 32-character UUID. If the returned query results cannot be displayed within one page, this parameter is returned. The value of this parameter is updated for each query.</p>
         * 
         * <strong>example:</strong>
         * <p>9b1a42bc6e8d46e6a1383b7e7f01****</p>
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * <p>The IDs of the jobs that do not exist. This parameter is not returned if all the specified jobs are found.</p>
         */
        public Builder nonExistIds(NonExistIds nonExistIds) {
            this.nonExistIds = nonExistIds;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D1D5C080-8E2F-5030-8AB4-13092F17631B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryMediaCensorJobListResponseBody build() {
            return new QueryMediaCensorJobListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMediaCensorJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobListResponseBody</p>
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
             * <p>The label of the moderation result. Separate multiple labels with commas (,). Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content.</li>
             * <li><strong>spam</strong>: spam.</li>
             * <li><strong>ad</strong>: ads.</li>
             * <li><strong>abuse</strong>: abuse content.</li>
             * <li><strong>flood</strong>: excessive junk content.</li>
             * <li><strong>contraband</strong>: prohibited content.</li>
             * <li><strong>meaningless</strong>: meaningless content.</li>
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
             * <p>The score. Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>99.91</p>
             */
            public Builder rate(String rate) {
                this.rate = rate;
                return this;
            }

            /**
             * <p>The moderation scenario. The value is <strong>antispam</strong>.</p>
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
             * <li><strong>review</strong>: The content needs to be manually reviewed.</li>
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
     * {@link QueryMediaCensorJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobListResponseBody</p>
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
             * <p>The label of the moderation result. Separate multiple labels with commas (,).</p>
             * <ul>
             * <li><p>Valid values in the pornographic content moderation scenario:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content.</li>
             * <li><strong>sexy</strong>: sexy content.</li>
             * <li><strong>porn</strong>: pornographic content.</li>
             * </ul>
             * </li>
             * <li><p>Valid values in the terrorist content moderation scenario:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content.</li>
             * <li><strong>bloody</strong>: bloody content.</li>
             * <li><strong>explosion</strong>: explosion and smoke.</li>
             * <li><strong>outfit</strong>: special costume.</li>
             * <li><strong>logo</strong>: special logo.</li>
             * <li><strong>weapon</strong>: weapon.</li>
             * <li><strong>politics</strong>: political content.</li>
             * <li><strong>violence</strong>: violence.</li>
             * <li><strong>crowd</strong>: crowd.</li>
             * <li><strong>parade</strong>: parade.</li>
             * <li><strong>carcrash</strong>: car accident.</li>
             * <li><strong>flag</strong>: flag.</li>
             * <li><strong>location</strong>: landmark.</li>
             * <li><strong>others</strong>: other content.</li>
             * </ul>
             * </li>
             * <li><p>Valid values in the ad moderation scenario:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content.</li>
             * <li><strong>ad</strong>: other ads.</li>
             * <li><strong>politics</strong>: political content in text.</li>
             * <li><strong>porn</strong>: pornographic content in text.</li>
             * <li><strong>abuse</strong>: abuse in text.</li>
             * <li><strong>terrorism</strong>: terrorist content in text.</li>
             * <li><strong>contraband</strong>: prohibited content in text.</li>
             * <li><strong>spam</strong>: spam in text.</li>
             * <li><strong>npx</strong>: illegal ad.</li>
             * <li><strong>qrcode</strong>: QR code.</li>
             * <li><strong>programCode</strong>: mini program code.</li>
             * </ul>
             * </li>
             * <li><p>Valid values in the undesirable scene moderation scenario:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content.</li>
             * <li><strong>meaningless</strong>: meaningless content, such as a black or white screen.</li>
             * <li><strong>PIP</strong>: picture-in-picture.</li>
             * <li><strong>smoking</strong>: smoking.</li>
             * <li><strong>drivelive</strong>: live streaming in a running vehicle.</li>
             * </ul>
             * </li>
             * <li><p>Valid values in the logo moderation scenario:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content.</li>
             * <li><strong>TV</strong>: controlled logo.</li>
             * <li><strong>trademark</strong>: trademark.</li>
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
             * <p>The score. Valid values: 0 to 100.</p>
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
             * <li><strong>porn</strong>: pornographic content moderation.</li>
             * <li><strong>terrorism</strong>: terrorist content moderation.</li>
             * <li><strong>ad</strong>: ad moderation.</li>
             * <li><strong>live</strong>: undesirable scene moderation.</li>
             * <li><strong>logo</strong>: logo moderation.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>live</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The overall result of the moderation job. Valid values:</p>
             * <ul>
             * <li><strong>pass</strong>: The content passes the moderation.</li>
             * <li><strong>review</strong>: The content needs to be manually reviewed.</li>
             * <li><strong>block</strong>: The content needs to be blocked.</li>
             * </ul>
             * <blockquote>
             * <p> If the moderation result of any type of content is review, the overall result is review. If the moderation result of any type of content is block, the overall result is block.</p>
             * </blockquote>
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
     * {@link QueryMediaCensorJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobListResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<Result> result;

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
        public java.util.List<Result> getResult() {
            return this.result;
        }

        public static final class Builder {
            private java.util.List<Result> result; 

            /**
             * Result.
             */
            public Builder result(java.util.List<Result> result) {
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
     * {@link QueryMediaCensorJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobListResponseBody</p>
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
             * <p>The OSS bucket in which the thumbnail is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>example-Bucket-****</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The OSS region in which the thumbnail resides.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-shanghai</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The Object Storage Service (OSS) object that is used as the thumbnail.</p>
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
     * {@link QueryMediaCensorJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobListResponseBody</p>
     */
    public static class CoverImageCensorResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CoverImageCensorResult")
        private java.util.List<CoverImageCensorResult> coverImageCensorResult;

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
        public java.util.List<CoverImageCensorResult> getCoverImageCensorResult() {
            return this.coverImageCensorResult;
        }

        public static final class Builder {
            private java.util.List<CoverImageCensorResult> coverImageCensorResult; 

            /**
             * CoverImageCensorResult.
             */
            public Builder coverImageCensorResult(java.util.List<CoverImageCensorResult> coverImageCensorResult) {
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
     * {@link QueryMediaCensorJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobListResponseBody</p>
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
             * <p>The label of the moderation result. Separate multiple labels with commas (,). Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content.</li>
             * <li><strong>spam</strong>: spam.</li>
             * <li><strong>ad</strong>: ads.</li>
             * <li><strong>abuse</strong>: abuse content.</li>
             * <li><strong>flood</strong>: excessive junk content.</li>
             * <li><strong>contraband</strong>: prohibited content.</li>
             * <li><strong>meaningless</strong>: meaningless content.</li>
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
             * <p>The score. Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder rate(String rate) {
                this.rate = rate;
                return this;
            }

            /**
             * <p>The moderation scenario. The value is <strong>antispam</strong>.</p>
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
             * <li><strong>review</strong>: The content needs to be manually reviewed.</li>
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

            public DescCensorResult build() {
                return new DescCensorResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaCensorJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobListResponseBody</p>
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
             * <p>The name of the OSS bucket in which the input file is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>bucket-test-in-****</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The OSS region in which the input file resides.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-shanghai</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The name of the OSS object that is used as the input file.</p>
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
     * {@link QueryMediaCensorJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobListResponseBody</p>
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
             * <p>The label of the moderation result. Separate multiple labels with commas (,). Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content.</li>
             * <li><strong>spam</strong>: spam.</li>
             * <li><strong>ad</strong>: ads.</li>
             * <li><strong>abuse</strong>: abuse content.</li>
             * <li><strong>flood</strong>: excessive junk content.</li>
             * <li><strong>contraband</strong>: prohibited content.</li>
             * <li><strong>meaningless</strong>: meaningless content.</li>
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
             * <p>The score. Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder rate(String rate) {
                this.rate = rate;
                return this;
            }

            /**
             * <p>The moderation scenario. The value is <strong>antispam</strong>.</p>
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
             * <li><strong>review</strong>: The content needs to be manually reviewed.</li>
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
     * {@link QueryMediaCensorJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobListResponseBody</p>
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
             * <p>The label of the moderation result. Separate multiple labels with commas (,).</p>
             * <ul>
             * <li><p>Valid values in the pornographic content moderation scenario:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content.</li>
             * <li><strong>sexy</strong>: sexy content.</li>
             * <li><strong>porn</strong>: pornographic content.</li>
             * </ul>
             * </li>
             * <li><p>Valid values in the terrorist content moderation scenario:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content.</li>
             * <li><strong>bloody</strong>: bloody content.</li>
             * <li><strong>explosion</strong>: explosion and smoke.</li>
             * <li><strong>outfit</strong>: special costume.</li>
             * <li><strong>logo</strong>: special logo.</li>
             * <li><strong>weapon</strong>: weapon.</li>
             * <li><strong>politics</strong>: political content.</li>
             * <li><strong>violence</strong>: violence.</li>
             * <li><strong>crowd</strong>: crowd.</li>
             * <li><strong>parade</strong>: parade.</li>
             * <li><strong>carcrash</strong>: car accident.</li>
             * <li><strong>flag</strong>: flag.</li>
             * <li><strong>location</strong>: landmark.</li>
             * <li><strong>others</strong>: other content.</li>
             * </ul>
             * </li>
             * <li><p>Valid values in the ad moderation scenario:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content.</li>
             * <li><strong>ad</strong>: other ads.</li>
             * <li><strong>politics</strong>: political content in text.</li>
             * <li><strong>porn</strong>: pornographic content in text.</li>
             * <li><strong>abuse</strong>: abuse in text.</li>
             * <li><strong>terrorism</strong>: terrorist content in text.</li>
             * <li><strong>contraband</strong>: prohibited content in text.</li>
             * <li><strong>spam</strong>: spam in text.</li>
             * <li><strong>npx</strong>: illegal ad.</li>
             * <li><strong>qrcode</strong>: QR code.</li>
             * <li><strong>programCode</strong>: mini program code.</li>
             * </ul>
             * </li>
             * <li><p>Valid values in the undesirable scene moderation scenario:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content.</li>
             * <li><strong>meaningless</strong>: meaningless content, such as a black or white screen.</li>
             * <li><strong>PIP</strong>: picture-in-picture.</li>
             * <li><strong>smoking</strong>: smoking.</li>
             * <li><strong>drivelive</strong>: live streaming in a running vehicle.</li>
             * </ul>
             * </li>
             * <li><p>Valid values in the logo moderation scenario:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content.</li>
             * <li><strong>TV</strong>: controlled logo.</li>
             * <li><strong>trademark</strong>: trademark.</li>
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
             * <p>The score. Valid values: 0 to 100.</p>
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
             * <li><strong>porn</strong>: pornographic content moderation.</li>
             * <li><strong>terrorism</strong>: terrorist content moderation.</li>
             * <li><strong>ad</strong>: ad moderation.</li>
             * <li><strong>live</strong>: undesirable scene moderation.</li>
             * <li><strong>logo</strong>: logo moderation.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ad</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The recommended subsequent operation. Valid values:</p>
             * <ul>
             * <li><strong>pass</strong>: The content passes the moderation.</li>
             * <li><strong>review</strong>: The content needs to be manually reviewed.</li>
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

            public CensorResult build() {
                return new CensorResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaCensorJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobListResponseBody</p>
     */
    public static class CensorResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CensorResult")
        private java.util.List<CensorResult> censorResult;

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
        public java.util.List<CensorResult> getCensorResult() {
            return this.censorResult;
        }

        public static final class Builder {
            private java.util.List<CensorResult> censorResult; 

            /**
             * CensorResult.
             */
            public Builder censorResult(java.util.List<CensorResult> censorResult) {
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
     * {@link QueryMediaCensorJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobListResponseBody</p>
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
             * <p>The label of the moderation result. Separate multiple labels with commas (,).</p>
             * <ul>
             * <li><p>Valid values in the pornographic content moderation scenario:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content.</li>
             * <li><strong>sexy</strong>: sexy content.</li>
             * <li><strong>porn</strong>: pornographic content.</li>
             * </ul>
             * </li>
             * <li><p>Valid values in the terrorist content moderation scenario:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content.</li>
             * <li><strong>bloody</strong>: bloody content.</li>
             * <li><strong>explosion</strong>: explosion and smoke.</li>
             * <li><strong>outfit</strong>: special costume.</li>
             * <li><strong>logo</strong>: special logo.</li>
             * <li><strong>weapon</strong>: weapon.</li>
             * <li><strong>politics</strong>: political content.</li>
             * <li><strong>violence</strong>: violence.</li>
             * <li><strong>crowd</strong>: crowd.</li>
             * <li><strong>parade</strong>: parade.</li>
             * <li><strong>carcrash</strong>: car accident.</li>
             * <li><strong>flag</strong>: flag.</li>
             * <li><strong>location</strong>: landmark.</li>
             * <li><strong>others</strong>: other content.</li>
             * </ul>
             * </li>
             * <li><p>Valid values in the ad moderation scenario:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content.</li>
             * <li><strong>ad</strong>: other ads.</li>
             * <li><strong>politics</strong>: political content in text.</li>
             * <li><strong>porn</strong>: pornographic content in text.</li>
             * <li><strong>abuse</strong>: abuse in text.</li>
             * <li><strong>terrorism</strong>: terrorist content in text.</li>
             * <li><strong>contraband</strong>: prohibited content in text.</li>
             * <li><strong>spam</strong>: spam in text.</li>
             * <li><strong>npx</strong>: illegal ad.</li>
             * <li><strong>qrcode</strong>: QR code.</li>
             * <li><strong>programCode</strong>: mini program code.</li>
             * </ul>
             * </li>
             * <li><p>Valid values in the undesirable scene moderation scenario:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content.</li>
             * <li><strong>meaningless</strong>: meaningless content, such as a black or white screen.</li>
             * <li><strong>PIP</strong>: picture-in-picture.</li>
             * <li><strong>smoking</strong>: smoking.</li>
             * <li><strong>drivelive</strong>: live streaming in a running vehicle.</li>
             * </ul>
             * </li>
             * <li><p>Valid values in the logo moderation scenario:</p>
             * <ul>
             * <li><strong>normal</strong>: normal content.</li>
             * <li><strong>TV</strong>: controlled logo.</li>
             * <li><strong>trademark</strong>: trademark.</li>
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
             * <p>The score. Valid values: 0 to 100.</p>
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
             * <li><strong>porn</strong>: pornographic content moderation.</li>
             * <li><strong>terrorism</strong>: terrorist content moderation.</li>
             * <li><strong>ad</strong>: ad moderation.</li>
             * <li><strong>live</strong>: undesirable scene moderation.</li>
             * <li><strong>logo</strong>: logo moderation.</li>
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
             * <li><strong>review</strong>: The content needs to be manually reviewed.</li>
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
     * {@link QueryMediaCensorJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobListResponseBody</p>
     */
    public static class VideoTimelineCensorResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CensorResult")
        private java.util.List<CensorResultsCensorResult> censorResult;

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
        public java.util.List<CensorResultsCensorResult> getCensorResult() {
            return this.censorResult;
        }

        public static final class Builder {
            private java.util.List<CensorResultsCensorResult> censorResult; 

            /**
             * CensorResult.
             */
            public Builder censorResult(java.util.List<CensorResultsCensorResult> censorResult) {
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
     * {@link QueryMediaCensorJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobListResponseBody</p>
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
             * <p>The OSS object that is generated as the output snapshot.</p>
             * <blockquote>
             * <p> In the example, {Count} is a placeholder. The OSS objects that are generated as output snapshots are named <code>output00001-****.jpg</code>, <code>output00002-****.jpg</code>, and so on.</p>
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
     * {@link QueryMediaCensorJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobListResponseBody</p>
     */
    public static class VideoTimelines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VideoTimeline")
        private java.util.List<VideoTimeline> videoTimeline;

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
        public java.util.List<VideoTimeline> getVideoTimeline() {
            return this.videoTimeline;
        }

        public static final class Builder {
            private java.util.List<VideoTimeline> videoTimeline; 

            /**
             * VideoTimeline.
             */
            public Builder videoTimeline(java.util.List<VideoTimeline> videoTimeline) {
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
     * {@link QueryMediaCensorJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobListResponseBody</p>
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
             * <p>A collection of moderation results. The information includes the summary about various scenarios such as pornographic content moderation and terrorist content moderation.</p>
             */
            public Builder censorResults(CensorResults censorResults) {
                this.censorResults = censorResults;
                return this;
            }

            /**
             * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
             * 
             * <strong>example:</strong>
             * <p>ea04afcca7cd4e80b9ece8fbb251</p>
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
     * {@link QueryMediaCensorJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobListResponseBody</p>
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
             * <p>The OSS bucket in which the output snapshot is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>test-bucket-****</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The ID of the region in which the output snapshot resides.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-shanghai</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The OSS object that is generated as the output snapshot.</p>
             * <blockquote>
             * <p> In the example, {Count} is a placeholder. The OSS objects that are generated as output snapshots are named <code>output00001-****.jpg, output00002-****.jpg</code>, and so on.</p>
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
     * {@link QueryMediaCensorJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobListResponseBody</p>
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
             * <p>The moderation template. Default value: common. The default value indicates that the default template is used.</p>
             * <blockquote>
             * <p> If the moderation template is not specified, the default value common is returned. If a custom moderation template that is created by submitting a ticket is specified, the UID of the template is returned.</p>
             * </blockquote>
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
             * <p>Indicates whether the video content needs to be moderated. Default value: <strong>true</strong>. Valid values:</p>
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
     * {@link QueryMediaCensorJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobListResponseBody</p>
     */
    public static class MediaCensorJob extends TeaModel {
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
             * <p>The moderation results of live comments.</p>
             */
            public Builder barrageCensorResult(BarrageCensorResult barrageCensorResult) {
                this.barrageCensorResult = barrageCensorResult;
                return this;
            }

            /**
             * <p>The error code returned if the job failed. This parameter is not returned if the job is successful.</p>
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
             * <p>The time when the content moderation job was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-04T07:25:48Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The moderation results of descriptions.</p>
             */
            public Builder descCensorResult(DescCensorResult descCensorResult) {
                this.descCensorResult = descCensorResult;
                return this;
            }

            /**
             * <p>The time when the content moderation job was complete.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-04T07:25:50Z</p>
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
             * <p>f8f166eea7a44e9bb0a4aecf9543</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The error message returned if the job failed. This parameter is not returned if the job is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>The resource operated cannot be found</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The ID of the MPS queue to which the job was submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>c5b30b7c0d0e4a0abde1d5f9e751****</p>
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * <p>The job state.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The recommended subsequent operation. Valid values:</p>
             * <ul>
             * <li><strong>pass</strong>: The content passes the moderation.</li>
             * <li><strong>review</strong>: The content needs to be manually reviewed.</li>
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

            /**
             * <p>The moderation results of titles.</p>
             */
            public Builder titleCensorResult(TitleCensorResult titleCensorResult) {
                this.titleCensorResult = titleCensorResult;
                return this;
            }

            /**
             * <p>The user-defined data.</p>
             * 
             * <strong>example:</strong>
             * <p>example userdata ****</p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * <p>The moderation results of videos.</p>
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

            public MediaCensorJob build() {
                return new MediaCensorJob(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaCensorJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobListResponseBody</p>
     */
    public static class MediaCensorJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MediaCensorJob")
        private java.util.List<MediaCensorJob> mediaCensorJob;

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
        public java.util.List<MediaCensorJob> getMediaCensorJob() {
            return this.mediaCensorJob;
        }

        public static final class Builder {
            private java.util.List<MediaCensorJob> mediaCensorJob; 

            /**
             * MediaCensorJob.
             */
            public Builder mediaCensorJob(java.util.List<MediaCensorJob> mediaCensorJob) {
                this.mediaCensorJob = mediaCensorJob;
                return this;
            }

            public MediaCensorJobList build() {
                return new MediaCensorJobList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaCensorJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaCensorJobListResponseBody</p>
     */
    public static class NonExistIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("String")
        private java.util.List<String> string;

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
        public java.util.List<String> getString() {
            return this.string;
        }

        public static final class Builder {
            private java.util.List<String> string; 

            /**
             * String.
             */
            public Builder string(java.util.List<String> string) {
                this.string = string;
                return this;
            }

            public NonExistIds build() {
                return new NonExistIds(this);
            } 

        } 

    }
}
