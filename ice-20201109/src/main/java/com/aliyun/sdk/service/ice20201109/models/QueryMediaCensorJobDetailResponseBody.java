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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QueryMediaCensorJobDetailResponseBody model) {
            this.mediaCensorJobDetail = model.mediaCensorJobDetail;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of content moderation job results.</p>
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

            private Builder() {
            } 

            private Builder(BarrageCensorResult model) {
                this.label = model.label;
                this.rate = model.rate;
                this.scene = model.scene;
                this.suggestion = model.suggestion;
            } 

            /**
             * <p>The label of the moderation result. Valid values:</p>
             * <ul>
             * <li><p><strong>normal</strong>: normal</p>
             * </li>
             * <li><p><strong>spam</strong>: spam</p>
             * </li>
             * <li><p><strong>ad</strong>: advertisement</p>
             * </li>
             * <li><p><strong>abuse</strong>: abuse</p>
             * </li>
             * <li><p><strong>flood</strong>: flooding</p>
             * </li>
             * <li><p><strong>contraband</strong>: contraband</p>
             * </li>
             * <li><p><strong>meaningless</strong>: meaningless</p>
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
             * <p>The moderation scene. Set the value to <strong>antispam</strong>, which indicates text anti-spam.</p>
             * 
             * <strong>example:</strong>
             * <p>antispam</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The moderation suggestion. Valid values:</p>
             * <ul>
             * <li><p><strong>pass</strong>: The content passes the moderation.</p>
             * </li>
             * <li><p><strong>review</strong>: The content requires manual review.</p>
             * </li>
             * <li><p><strong>block</strong>: The content is blocked.</p>
             * </li>
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.label = model.label;
                this.rate = model.rate;
                this.scene = model.scene;
                this.suggestion = model.suggestion;
            } 

            /**
             * <p>The label of the moderation result. Valid values:</p>
             * <ul>
             * <li><p><strong>normal</strong>: normal</p>
             * </li>
             * <li><p><strong>spam</strong>: spam</p>
             * </li>
             * <li><p><strong>ad</strong>: advertisement</p>
             * </li>
             * <li><p><strong>abuse</strong>: abuse</p>
             * </li>
             * <li><p><strong>flood</strong>: flooding</p>
             * </li>
             * <li><p><strong>contraband</strong>: contraband</p>
             * </li>
             * <li><p><strong>meaningless</strong>: meaningless</p>
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
             * <p>The moderation scene. Set the value to <strong>antispam</strong>, which indicates text anti-spam.</p>
             * 
             * <strong>example:</strong>
             * <p>antispam</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The moderation suggestion. Valid values:</p>
             * <ul>
             * <li><p><strong>pass</strong>: The content passes the moderation.</p>
             * </li>
             * <li><p><strong>review</strong>: The content requires manual review.</p>
             * </li>
             * <li><p><strong>block</strong>: The content is blocked.</p>
             * </li>
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

            private Builder() {
            } 

            private Builder(Results model) {
                this.result = model.result;
            } 

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

            private Builder() {
            } 

            private Builder(CoverImageCensorResult model) {
                this.bucket = model.bucket;
                this.location = model.location;
                this.object = model.object;
                this.results = model.results;
            } 

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * Object.
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * Results.
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

            private Builder() {
            } 

            private Builder(CoverImageCensorResults model) {
                this.coverImageCensorResult = model.coverImageCensorResult;
            } 

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

            private Builder() {
            } 

            private Builder(DescCensorResult model) {
                this.label = model.label;
                this.rate = model.rate;
                this.scene = model.scene;
                this.suggestion = model.suggestion;
            } 

            /**
             * <p>The label of the moderation result. Valid values:</p>
             * <ul>
             * <li><p><strong>normal</strong>: normal</p>
             * </li>
             * <li><p><strong>spam</strong>: spam</p>
             * </li>
             * <li><p><strong>ad</strong>: advertisement</p>
             * </li>
             * <li><p><strong>abuse</strong>: abuse</p>
             * </li>
             * <li><p><strong>flood</strong>: flooding</p>
             * </li>
             * <li><p><strong>contraband</strong>: contraband</p>
             * </li>
             * <li><p><strong>meaningless</strong>: meaningless</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>terrorism</p>
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
             * <p>The moderation scene. Set the value to <strong>antispam</strong>, which indicates text anti-spam.</p>
             * 
             * <strong>example:</strong>
             * <p>antispam</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The moderation suggestion. Valid values:</p>
             * <ul>
             * <li><p><strong>pass</strong>: The content passes the moderation.</p>
             * </li>
             * <li><p><strong>review</strong>: The content requires manual review.</p>
             * </li>
             * <li><p><strong>block</strong>: The content is blocked.</p>
             * </li>
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

            private Builder() {
            } 

            private Builder(Input model) {
                this.bucket = model.bucket;
                this.location = model.location;
                this.object = model.object;
            } 

            /**
             * <p>The OSS bucket of the input file.</p>
             * 
             * <strong>example:</strong>
             * <p>bucket-test-in-****</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The OSS location of the input file.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-shanghai</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The OSS object of the input file.</p>
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

            private Builder() {
            } 

            private Builder(TitleCensorResult model) {
                this.label = model.label;
                this.rate = model.rate;
                this.scene = model.scene;
                this.suggestion = model.suggestion;
            } 

            /**
             * <p>The label of the moderation result. Valid values:</p>
             * <ul>
             * <li><p><strong>normal</strong>: normal</p>
             * </li>
             * <li><p><strong>spam</strong>: spam</p>
             * </li>
             * <li><p><strong>ad</strong>: advertisement</p>
             * </li>
             * <li><p><strong>abuse</strong>: abuse</p>
             * </li>
             * <li><p><strong>flood</strong>: flooding</p>
             * </li>
             * <li><p><strong>contraband</strong>: contraband</p>
             * </li>
             * <li><p><strong>meaningless</strong>: meaningless</p>
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
             * <p>99.91</p>
             */
            public Builder rate(String rate) {
                this.rate = rate;
                return this;
            }

            /**
             * <p>The moderation scene. Set the value to <strong>antispam</strong>, which indicates text anti-spam.</p>
             * 
             * <strong>example:</strong>
             * <p>antispam</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The moderation suggestion. Valid values:</p>
             * <ul>
             * <li><p><strong>pass</strong>: The content passes the moderation.</p>
             * </li>
             * <li><p><strong>review</strong>: The content requires manual review.</p>
             * </li>
             * <li><p><strong>block</strong>: The content is blocked.</p>
             * </li>
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

            private Builder() {
            } 

            private Builder(CensorResult model) {
                this.label = model.label;
                this.rate = model.rate;
                this.scene = model.scene;
                this.suggestion = model.suggestion;
            } 

            /**
             * <p>The label of the moderation result. Valid values:</p>
             * <ul>
             * <li><p><strong>normal</strong>: normal</p>
             * </li>
             * <li><p><strong>spam</strong>: spam</p>
             * </li>
             * <li><p><strong>ad</strong>: advertisement</p>
             * </li>
             * <li><p><strong>abuse</strong>: abuse</p>
             * </li>
             * <li><p><strong>flood</strong>: flooding</p>
             * </li>
             * <li><p><strong>contraband</strong>: contraband</p>
             * </li>
             * <li><p><strong>meaningless</strong>: meaningless</p>
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
             * <p>99.91</p>
             */
            public Builder rate(String rate) {
                this.rate = rate;
                return this;
            }

            /**
             * <p>The moderation scene. Set the value to <strong>antispam</strong>, which indicates text anti-spam.</p>
             * 
             * <strong>example:</strong>
             * <p>antispam</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The moderation suggestion. Valid values:</p>
             * <ul>
             * <li><p><strong>pass</strong>: The content passes the moderation.</p>
             * </li>
             * <li><p><strong>review</strong>: The content requires manual review.</p>
             * </li>
             * <li><p><strong>block</strong>: The content is blocked.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>block</p>
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

            private Builder() {
            } 

            private Builder(CensorResults model) {
                this.censorResult = model.censorResult;
            } 

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

            private Builder() {
            } 

            private Builder(CensorResultsCensorResult model) {
                this.label = model.label;
                this.rate = model.rate;
                this.scene = model.scene;
                this.suggestion = model.suggestion;
            } 

            /**
             * <p>The label of the moderation result. Valid values:</p>
             * <ul>
             * <li><p><strong>normal</strong>: normal</p>
             * </li>
             * <li><p><strong>spam</strong>: spam</p>
             * </li>
             * <li><p><strong>ad</strong>: advertisement</p>
             * </li>
             * <li><p><strong>abuse</strong>: abuse</p>
             * </li>
             * <li><p><strong>flood</strong>: flooding</p>
             * </li>
             * <li><p><strong>contraband</strong>: contraband</p>
             * </li>
             * <li><p><strong>meaningless</strong>: meaningless</p>
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
             * <p>99.91</p>
             */
            public Builder rate(String rate) {
                this.rate = rate;
                return this;
            }

            /**
             * <p>The moderation scene. Set the value to <strong>antispam</strong>, which indicates text anti-spam.</p>
             * 
             * <strong>example:</strong>
             * <p>antispam</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The moderation suggestion. Valid values:</p>
             * <ul>
             * <li><p><strong>pass</strong>: The content passes the moderation.</p>
             * </li>
             * <li><p><strong>review</strong>: The content requires manual review.</p>
             * </li>
             * <li><p><strong>block</strong>: The content is blocked.</p>
             * </li>
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

            private Builder() {
            } 

            private Builder(VideoTimelineCensorResults model) {
                this.censorResult = model.censorResult;
            } 

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

            private Builder() {
            } 

            private Builder(VideoTimeline model) {
                this.censorResults = model.censorResults;
                this.object = model.object;
                this.timestamp = model.timestamp;
            } 

            /**
             * CensorResults.
             */
            public Builder censorResults(VideoTimelineCensorResults censorResults) {
                this.censorResults = censorResults;
                return this;
            }

            /**
             * <p>The OSS object of the input file.</p>
             * 
             * <strong>example:</strong>
             * <p>test/ai/censor/test-****.mp4</p>
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * Timestamp.
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

            private Builder() {
            } 

            private Builder(VideoTimelines model) {
                this.videoTimeline = model.videoTimeline;
            } 

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

            private Builder() {
            } 

            private Builder(VensorCensorResult model) {
                this.censorResults = model.censorResults;
                this.nextPageToken = model.nextPageToken;
                this.videoTimelines = model.videoTimelines;
            } 

            /**
             * CensorResults.
             */
            public Builder censorResults(CensorResults censorResults) {
                this.censorResults = censorResults;
                return this;
            }

            /**
             * <p>The token for the next page.</p>
             * 
             * <strong>example:</strong>
             * <p>ea04afcca7cd4e80b9ece8fbb251****</p>
             */
            public Builder nextPageToken(String nextPageToken) {
                this.nextPageToken = nextPageToken;
                return this;
            }

            /**
             * VideoTimelines.
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

            private Builder() {
            } 

            private Builder(OutputFile model) {
                this.bucket = model.bucket;
                this.location = model.location;
                this.object = model.object;
            } 

            /**
             * <p>The OSS bucket where the snapshot output file is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>test-bucket-****</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The OSS location of the OSS bucket where the snapshot output file is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-shanghai</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The OSS object of the snapshot output file.</p>
             * <blockquote>
             * <p>In the example, {Count} is a placeholder. The image objects are sequentially named <code>output00001-****.jpg</code>, <code>output00002-****.jpg</code>, and so on.</p>
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

            private Builder() {
            } 

            private Builder(VideoCensorConfig model) {
                this.bizType = model.bizType;
                this.outputFile = model.outputFile;
                this.videoCensor = model.videoCensor;
            } 

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
             * <p>The storage address of the video snapshot results.</p>
             */
            public Builder outputFile(OutputFile outputFile) {
                this.outputFile = outputFile;
                return this;
            }

            /**
             * <p>Specifies whether to moderate the video content. Default value: <strong>true</strong>. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Moderate the video content.</p>
             * </li>
             * <li><p><strong>false</strong>: Do not moderate the video content.</p>
             * </li>
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

            private Builder() {
            } 

            private Builder(MediaCensorJobDetail model) {
                this.barrageCensorResult = model.barrageCensorResult;
                this.code = model.code;
                this.coverImageCensorResults = model.coverImageCensorResults;
                this.creationTime = model.creationTime;
                this.descCensorResult = model.descCensorResult;
                this.finishTime = model.finishTime;
                this.input = model.input;
                this.jobId = model.jobId;
                this.message = model.message;
                this.pipelineId = model.pipelineId;
                this.state = model.state;
                this.suggestion = model.suggestion;
                this.titleCensorResult = model.titleCensorResult;
                this.userData = model.userData;
                this.vensorCensorResult = model.vensorCensorResult;
                this.videoCensorConfig = model.videoCensorConfig;
            } 

            /**
             * <p>The barrage moderation result.</p>
             */
            public Builder barrageCensorResult(BarrageCensorResult barrageCensorResult) {
                this.barrageCensorResult = barrageCensorResult;
                return this;
            }

            /**
             * <p>The error code returned when the job fails. This parameter is not returned when the job is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>InvalidParameter.ResourceNotFound</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * CoverImageCensorResults.
             */
            public Builder coverImageCensorResults(CoverImageCensorResults coverImageCensorResults) {
                this.coverImageCensorResults = coverImageCensorResults;
                return this;
            }

            /**
             * <p>The creation time. The time is in the ISO 8601 format and in UTC (ending with Z).</p>
             * 
             * <strong>example:</strong>
             * <p>2018-09-13T16:32:24Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description moderation result.</p>
             */
            public Builder descCensorResult(DescCensorResult descCensorResult) {
                this.descCensorResult = descCensorResult;
                return this;
            }

            /**
             * <p>The completion time. The time is in the ISO 8601 format and in UTC (ending with Z).</p>
             * 
             * <strong>example:</strong>
             * <p>2018-09-13T16:38:24Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The job input.</p>
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
             * <p>The error message returned when the job fails. This parameter is not returned when the job is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>The resource operated cannot be found</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The pipeline ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c5b30b7c0d0e4a0abde1d5f9e751****</p>
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * <p>The job status.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The overall moderation result of the job. Valid values:</p>
             * <ul>
             * <li><p><strong>pass</strong>: The content passes the moderation.</p>
             * </li>
             * <li><p><strong>review</strong>: The content requires manual review.</p>
             * </li>
             * <li><p><strong>block</strong>: The content is blocked.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>If the moderation result of any type is review, the overall result is review. If the moderation result of any type is block, the overall result is block.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>block</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * <p>The title moderation result.</p>
             */
            public Builder titleCensorResult(TitleCensorResult titleCensorResult) {
                this.titleCensorResult = titleCensorResult;
                return this;
            }

            /**
             * <p>The custom user data.</p>
             * 
             * <strong>example:</strong>
             * <p>example userdata ****</p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * <p>The video moderation results.</p>
             */
            public Builder vensorCensorResult(VensorCensorResult vensorCensorResult) {
                this.vensorCensorResult = vensorCensorResult;
                return this;
            }

            /**
             * <p>The video moderation configuration.</p>
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
