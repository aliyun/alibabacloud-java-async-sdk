// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428.models;

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
 * {@link StorefrontSceneRecognitionResponseBody} extends {@link TeaModel}
 *
 * <p>StorefrontSceneRecognitionResponseBody</p>
 */
public class StorefrontSceneRecognitionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private StorefrontSceneRecognitionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StorefrontSceneRecognitionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(StorefrontSceneRecognitionResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The scene recognition result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message or failure description.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>70CBEFDF-BB17-1EB3-8A21-569F3124738F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public StorefrontSceneRecognitionResponseBody build() {
            return new StorefrontSceneRecognitionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link StorefrontSceneRecognitionResponseBody} extends {@link TeaModel}
     *
     * <p>StorefrontSceneRecognitionResponseBody</p>
     */
    public static class Details extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Clazz")
        private String clazz;

        @com.aliyun.core.annotation.NameInMap("Confidence")
        private Float confidence;

        private Details(Builder builder) {
            this.clazz = builder.clazz;
            this.confidence = builder.confidence;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
            return builder().build();
        }

        /**
         * @return clazz
         */
        public String getClazz() {
            return this.clazz;
        }

        /**
         * @return confidence
         */
        public Float getConfidence() {
            return this.confidence;
        }

        public static final class Builder {
            private String clazz; 
            private Float confidence; 

            private Builder() {
            } 

            private Builder(Details model) {
                this.clazz = model.clazz;
                this.confidence = model.confidence;
            } 

            /**
             * <p>The non-empty category name.</p>
             * 
             * <strong>example:</strong>
             * <p>oppo vivo smartphone specialty store</p>
             */
            public Builder clazz(String clazz) {
                this.clazz = clazz;
                return this;
            }

            /**
             * <p>A finite numerical value. The source document does not specify a value range.</p>
             * 
             * <strong>example:</strong>
             * <p>0.99</p>
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            public Details build() {
                return new Details(this);
            } 

        } 

    }
    /**
     * 
     * {@link StorefrontSceneRecognitionResponseBody} extends {@link TeaModel}
     *
     * <p>StorefrontSceneRecognitionResponseBody</p>
     */
    public static class Regions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bbox2d")
        private java.util.List<Float> bbox2d;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private Regions(Builder builder) {
            this.bbox2d = builder.bbox2d;
            this.label = builder.label;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Regions create() {
            return builder().build();
        }

        /**
         * @return bbox2d
         */
        public java.util.List<Float> getBbox2d() {
            return this.bbox2d;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private java.util.List<Float> bbox2d; 
            private String label; 
            private String text; 

            private Builder() {
            } 

            private Builder(Regions model) {
                this.bbox2d = model.bbox2d;
                this.label = model.label;
                this.text = model.text;
            } 

            /**
             * <p>The bounding box coordinates.</p>
             */
            public Builder bbox2d(java.util.List<Float> bbox2d) {
                this.bbox2d = bbox2d;
                return this;
            }

            /**
             * <p>The label.</p>
             * 
             * <strong>example:</strong>
             * <p>store_sign</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The recognized text.</p>
             * 
             * <strong>example:</strong>
             * <p>oppo</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Regions build() {
                return new Regions(this);
            } 

        } 

    }
    /**
     * 
     * {@link StorefrontSceneRecognitionResponseBody} extends {@link TeaModel}
     *
     * <p>StorefrontSceneRecognitionResponseBody</p>
     */
    public static class Grounding extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Coverage")
        private String coverage;

        @com.aliyun.core.annotation.NameInMap("Regions")
        private java.util.List<Regions> regions;

        private Grounding(Builder builder) {
            this.coverage = builder.coverage;
            this.regions = builder.regions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Grounding create() {
            return builder().build();
        }

        /**
         * @return coverage
         */
        public String getCoverage() {
            return this.coverage;
        }

        /**
         * @return regions
         */
        public java.util.List<Regions> getRegions() {
            return this.regions;
        }

        public static final class Builder {
            private String coverage; 
            private java.util.List<Regions> regions; 

            private Builder() {
            } 

            private Builder(Grounding model) {
                this.coverage = model.coverage;
                this.regions = model.regions;
            } 

            /**
             * <p>The coverage.</p>
             * 
             * <strong>example:</strong>
             * <p>partial</p>
             */
            public Builder coverage(String coverage) {
                this.coverage = coverage;
                return this;
            }

            /**
             * <p>The region list.</p>
             */
            public Builder regions(java.util.List<Regions> regions) {
                this.regions = regions;
                return this;
            }

            public Grounding build() {
                return new Grounding(this);
            } 

        } 

    }
    /**
     * 
     * {@link StorefrontSceneRecognitionResponseBody} extends {@link TeaModel}
     *
     * <p>StorefrontSceneRecognitionResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Details")
        private java.util.List<Details> details;

        @com.aliyun.core.annotation.NameInMap("Grounding")
        private Grounding grounding;

        @com.aliyun.core.annotation.NameInMap("Scenes")
        private java.util.List<String> scenes;

        private Result(Builder builder) {
            this.details = builder.details;
            this.grounding = builder.grounding;
            this.scenes = builder.scenes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return details
         */
        public java.util.List<Details> getDetails() {
            return this.details;
        }

        /**
         * @return grounding
         */
        public Grounding getGrounding() {
            return this.grounding;
        }

        /**
         * @return scenes
         */
        public java.util.List<String> getScenes() {
            return this.scenes;
        }

        public static final class Builder {
            private java.util.List<Details> details; 
            private Grounding grounding; 
            private java.util.List<String> scenes; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.details = model.details;
                this.grounding = model.grounding;
                this.scenes = model.scenes;
            } 

            /**
             * <p>The classification details. This can be an empty array.</p>
             */
            public Builder details(java.util.List<Details> details) {
                this.details = details;
                return this;
            }

            /**
             * <p>The localization information.</p>
             */
            public Builder grounding(Grounding grounding) {
                this.grounding = grounding;
                return this;
            }

            /**
             * <p>The non-empty scene classification array.</p>
             */
            public Builder scenes(java.util.List<String> scenes) {
                this.scenes = scenes;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link StorefrontSceneRecognitionResponseBody} extends {@link TeaModel}
     *
     * <p>StorefrontSceneRecognitionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Result")
        private Result result;

        @com.aliyun.core.annotation.NameInMap("UsageMap")
        private java.util.Map<String, Long> usageMap;

        private Data(Builder builder) {
            this.result = builder.result;
            this.usageMap = builder.usageMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public Result getResult() {
            return this.result;
        }

        /**
         * @return usageMap
         */
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

        public static final class Builder {
            private Result result; 
            private java.util.Map<String, Long> usageMap; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.result = model.result;
                this.usageMap = model.usageMap;
            } 

            /**
             * <p>The scene recognition result details.</p>
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The usage information.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;ProcessingCount&quot;:1}</p>
             */
            public Builder usageMap(java.util.Map<String, Long> usageMap) {
                this.usageMap = usageMap;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
