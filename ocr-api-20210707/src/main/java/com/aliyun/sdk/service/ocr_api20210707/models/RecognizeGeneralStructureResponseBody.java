// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RecognizeGeneralStructureResponseBody} extends {@link TeaModel}
 *
 * <p>RecognizeGeneralStructureResponseBody</p>
 */
public class RecognizeGeneralStructureResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RecognizeGeneralStructureResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeGeneralStructureResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RecognizeGeneralStructureResponseBody build() {
            return new RecognizeGeneralStructureResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RecognizeGeneralStructureResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeGeneralStructureResponseBody</p>
     */
    public static class KvInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private Object data;

        @com.aliyun.core.annotation.NameInMap("KvCount")
        private Integer kvCount;

        private KvInfo(Builder builder) {
            this.data = builder.data;
            this.kvCount = builder.kvCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KvInfo create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public Object getData() {
            return this.data;
        }

        /**
         * @return kvCount
         */
        public Integer getKvCount() {
            return this.kvCount;
        }

        public static final class Builder {
            private Object data; 
            private Integer kvCount; 

            /**
             * Data.
             */
            public Builder data(Object data) {
                this.data = data;
                return this;
            }

            /**
             * KvCount.
             */
            public Builder kvCount(Integer kvCount) {
                this.kvCount = kvCount;
                return this;
            }

            public KvInfo build() {
                return new KvInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeGeneralStructureResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeGeneralStructureResponseBody</p>
     */
    public static class SubImages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Angle")
        private Integer angle;

        @com.aliyun.core.annotation.NameInMap("KvInfo")
        private KvInfo kvInfo;

        @com.aliyun.core.annotation.NameInMap("SubImageId")
        private Integer subImageId;

        private SubImages(Builder builder) {
            this.angle = builder.angle;
            this.kvInfo = builder.kvInfo;
            this.subImageId = builder.subImageId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubImages create() {
            return builder().build();
        }

        /**
         * @return angle
         */
        public Integer getAngle() {
            return this.angle;
        }

        /**
         * @return kvInfo
         */
        public KvInfo getKvInfo() {
            return this.kvInfo;
        }

        /**
         * @return subImageId
         */
        public Integer getSubImageId() {
            return this.subImageId;
        }

        public static final class Builder {
            private Integer angle; 
            private KvInfo kvInfo; 
            private Integer subImageId; 

            /**
             * Angle.
             */
            public Builder angle(Integer angle) {
                this.angle = angle;
                return this;
            }

            /**
             * KvInfo.
             */
            public Builder kvInfo(KvInfo kvInfo) {
                this.kvInfo = kvInfo;
                return this;
            }

            /**
             * SubImageId.
             */
            public Builder subImageId(Integer subImageId) {
                this.subImageId = subImageId;
                return this;
            }

            public SubImages build() {
                return new SubImages(this);
            } 

        } 

    }
    /**
     * 
     * {@link RecognizeGeneralStructureResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeGeneralStructureResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("SubImageCount")
        private Integer subImageCount;

        @com.aliyun.core.annotation.NameInMap("SubImages")
        private java.util.List < SubImages> subImages;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Integer width;

        private Data(Builder builder) {
            this.height = builder.height;
            this.subImageCount = builder.subImageCount;
            this.subImages = builder.subImages;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return subImageCount
         */
        public Integer getSubImageCount() {
            return this.subImageCount;
        }

        /**
         * @return subImages
         */
        public java.util.List < SubImages> getSubImages() {
            return this.subImages;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer height; 
            private Integer subImageCount; 
            private java.util.List < SubImages> subImages; 
            private Integer width; 

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * SubImageCount.
             */
            public Builder subImageCount(Integer subImageCount) {
                this.subImageCount = subImageCount;
                return this;
            }

            /**
             * SubImages.
             */
            public Builder subImages(java.util.List < SubImages> subImages) {
                this.subImages = subImages;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
