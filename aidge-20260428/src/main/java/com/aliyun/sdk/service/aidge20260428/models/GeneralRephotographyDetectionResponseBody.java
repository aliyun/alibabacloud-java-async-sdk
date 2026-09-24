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
 * {@link GeneralRephotographyDetectionResponseBody} extends {@link TeaModel}
 *
 * <p>GeneralRephotographyDetectionResponseBody</p>
 */
public class GeneralRephotographyDetectionResponseBody extends TeaModel {
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

    private GeneralRephotographyDetectionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GeneralRephotographyDetectionResponseBody create() {
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

        private Builder(GeneralRephotographyDetectionResponseBody model) {
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
         * <p>The recapture detection result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message or failure description.</p>
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

        public GeneralRephotographyDetectionResponseBody build() {
            return new GeneralRephotographyDetectionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GeneralRephotographyDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>GeneralRephotographyDetectionResponseBody</p>
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
             * <p>The target category. For valid values, see the table below.</p>
             * 
             * <strong>example:</strong>
             * <p>product</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The confirmed short name or text of up to 24 characters. This value is an empty string if the text is unreadable.</p>
             * 
             * <strong>example:</strong>
             * <p>Product</p>
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
     * {@link GeneralRephotographyDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>GeneralRephotographyDetectionResponseBody</p>
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
             * <p>The coverage of the localization. Valid values:</p>
             * <ul>
             * <li>complete: All relevant visible targets are fully covered.</li>
             * <li>partial: Only some targets are valid or recognizable.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>complete</p>
             */
            public Builder coverage(String coverage) {
                this.coverage = coverage;
                return this;
            }

            /**
             * <p>The array of targets. A maximum of 12 items are returned. This value can be empty if no relevant targets exist.</p>
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
     * {@link GeneralRephotographyDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>GeneralRephotographyDetectionResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Grounding")
        private Grounding grounding;

        @com.aliyun.core.annotation.NameInMap("IsFake")
        private Boolean isFake;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Result(Builder builder) {
            this.grounding = builder.grounding;
            this.isFake = builder.isFake;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return grounding
         */
        public Grounding getGrounding() {
            return this.grounding;
        }

        /**
         * @return isFake
         */
        public Boolean getIsFake() {
            return this.isFake;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Grounding grounding; 
            private Boolean isFake; 
            private String type; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.grounding = model.grounding;
                this.isFake = model.isFake;
                this.type = model.type;
            } 

            /**
             * <p>The supplementary element localization result.</p>
             */
            public Builder grounding(Grounding grounding) {
                this.grounding = grounding;
                return this;
            }

            /**
             * <p>Indicates whether the image is a recaptured photo.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isFake(Boolean isFake) {
                this.isFake = isFake;
                return this;
            }

            /**
             * <p>The detection type. The value is fixed as general.</p>
             * 
             * <strong>example:</strong>
             * <p>general</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link GeneralRephotographyDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>GeneralRephotographyDetectionResponseBody</p>
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
             * <p>The business result. This value is an empty object if the request fails.</p>
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The usage information. The value is <code>{&quot;ProcessingCount&quot;:1}</code> on success, or an empty object on failure.</p>
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
