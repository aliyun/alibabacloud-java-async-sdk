// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImageModerationResponseBody} extends {@link TeaModel}
 *
 * <p>ImageModerationResponseBody</p>
 */
public class ImageModerationResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Msg")
    private String msg;

    @NameInMap("RequestId")
    private String requestId;

    private ImageModerationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageModerationResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String msg; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ImageModerationResponseBody build() {
            return new ImageModerationResponseBody(this);
        } 

    } 

    public static class Recognition extends TeaModel {
        @NameInMap("Classification")
        private String classification;

        @NameInMap("Confidence")
        private Float confidence;

        private Recognition(Builder builder) {
            this.classification = builder.classification;
            this.confidence = builder.confidence;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Recognition create() {
            return builder().build();
        }

        /**
         * @return classification
         */
        public String getClassification() {
            return this.classification;
        }

        /**
         * @return confidence
         */
        public Float getConfidence() {
            return this.confidence;
        }

        public static final class Builder {
            private String classification; 
            private Float confidence; 

            /**
             * Classification.
             */
            public Builder classification(String classification) {
                this.classification = classification;
                return this;
            }

            /**
             * Confidence.
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            public Recognition build() {
                return new Recognition(this);
            } 

        } 

    }
    public static class Ext extends TeaModel {
        @NameInMap("Recognition")
        private java.util.List < Recognition> recognition;

        private Ext(Builder builder) {
            this.recognition = builder.recognition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ext create() {
            return builder().build();
        }

        /**
         * @return recognition
         */
        public java.util.List < Recognition> getRecognition() {
            return this.recognition;
        }

        public static final class Builder {
            private java.util.List < Recognition> recognition; 

            /**
             * Recognition.
             */
            public Builder recognition(java.util.List < Recognition> recognition) {
                this.recognition = recognition;
                return this;
            }

            public Ext build() {
                return new Ext(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("Confidence")
        private Float confidence;

        @NameInMap("Label")
        private String label;

        private Result(Builder builder) {
            this.confidence = builder.confidence;
            this.label = builder.label;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return confidence
         */
        public Float getConfidence() {
            return this.confidence;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        public static final class Builder {
            private Float confidence; 
            private String label; 

            /**
             * Confidence.
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("DataId")
        private String dataId;

        @NameInMap("Ext")
        private Ext ext;

        @NameInMap("Result")
        private java.util.List < Result> result;

        private Data(Builder builder) {
            this.dataId = builder.dataId;
            this.ext = builder.ext;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return ext
         */
        public Ext getExt() {
            return this.ext;
        }

        /**
         * @return result
         */
        public java.util.List < Result> getResult() {
            return this.result;
        }

        public static final class Builder {
            private String dataId; 
            private Ext ext; 
            private java.util.List < Result> result; 

            /**
             * DataId.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * Ext.
             */
            public Builder ext(Ext ext) {
                this.ext = ext;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
