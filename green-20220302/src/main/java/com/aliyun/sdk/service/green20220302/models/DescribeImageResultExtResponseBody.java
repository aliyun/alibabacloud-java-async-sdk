// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageResultExtResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageResultExtResponseBody</p>
 */
public class DescribeImageResultExtResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeImageResultExtResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageResultExtResponseBody create() {
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

        public DescribeImageResultExtResponseBody build() {
            return new DescribeImageResultExtResponseBody(this);
        } 

    } 

    public static class CustomImage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("LibId")
        private String libId;

        @com.aliyun.core.annotation.NameInMap("LibName")
        private String libName;

        private CustomImage(Builder builder) {
            this.imageId = builder.imageId;
            this.libId = builder.libId;
            this.libName = builder.libName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomImage create() {
            return builder().build();
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return libId
         */
        public String getLibId() {
            return this.libId;
        }

        /**
         * @return libName
         */
        public String getLibName() {
            return this.libName;
        }

        public static final class Builder {
            private String imageId; 
            private String libId; 
            private String libName; 

            /**
             * 图片ID。
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * 图库ID。
             */
            public Builder libId(String libId) {
                this.libId = libId;
                return this;
            }

            /**
             * 图库名。
             */
            public Builder libName(String libName) {
                this.libName = libName;
                return this;
            }

            public CustomImage build() {
                return new CustomImage(this);
            } 

        } 

    }
    public static class PublicFigure extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FigureId")
        private String figureId;

        private PublicFigure(Builder builder) {
            this.figureId = builder.figureId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicFigure create() {
            return builder().build();
        }

        /**
         * @return figureId
         */
        public String getFigureId() {
            return this.figureId;
        }

        public static final class Builder {
            private String figureId; 

            /**
             * 人物ID。
             */
            public Builder figureId(String figureId) {
                this.figureId = figureId;
                return this;
            }

            public PublicFigure build() {
                return new PublicFigure(this);
            } 

        } 

    }
    public static class CustomTexts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeyWords")
        private String keyWords;

        @com.aliyun.core.annotation.NameInMap("LibId")
        private String libId;

        @com.aliyun.core.annotation.NameInMap("LibName")
        private String libName;

        private CustomTexts(Builder builder) {
            this.keyWords = builder.keyWords;
            this.libId = builder.libId;
            this.libName = builder.libName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomTexts create() {
            return builder().build();
        }

        /**
         * @return keyWords
         */
        public String getKeyWords() {
            return this.keyWords;
        }

        /**
         * @return libId
         */
        public String getLibId() {
            return this.libId;
        }

        /**
         * @return libName
         */
        public String getLibName() {
            return this.libName;
        }

        public static final class Builder {
            private String keyWords; 
            private String libId; 
            private String libName; 

            /**
             * KeyWords.
             */
            public Builder keyWords(String keyWords) {
                this.keyWords = keyWords;
                return this;
            }

            /**
             * 图库ID。
             */
            public Builder libId(String libId) {
                this.libId = libId;
                return this;
            }

            /**
             * 图库名。
             */
            public Builder libName(String libName) {
                this.libName = libName;
                return this;
            }

            public CustomTexts build() {
                return new CustomTexts(this);
            } 

        } 

    }
    public static class TextInImage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomTexts")
        private java.util.List < CustomTexts> customTexts;

        @com.aliyun.core.annotation.NameInMap("OcrDatas")
        private java.util.List < String > ocrDatas;

        @com.aliyun.core.annotation.NameInMap("RiskWords")
        private java.util.List < String > riskWords;

        private TextInImage(Builder builder) {
            this.customTexts = builder.customTexts;
            this.ocrDatas = builder.ocrDatas;
            this.riskWords = builder.riskWords;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextInImage create() {
            return builder().build();
        }

        /**
         * @return customTexts
         */
        public java.util.List < CustomTexts> getCustomTexts() {
            return this.customTexts;
        }

        /**
         * @return ocrDatas
         */
        public java.util.List < String > getOcrDatas() {
            return this.ocrDatas;
        }

        /**
         * @return riskWords
         */
        public java.util.List < String > getRiskWords() {
            return this.riskWords;
        }

        public static final class Builder {
            private java.util.List < CustomTexts> customTexts; 
            private java.util.List < String > ocrDatas; 
            private java.util.List < String > riskWords; 

            /**
             * CustomTexts.
             */
            public Builder customTexts(java.util.List < CustomTexts> customTexts) {
                this.customTexts = customTexts;
                return this;
            }

            /**
             * OcrDatas.
             */
            public Builder ocrDatas(java.util.List < String > ocrDatas) {
                this.ocrDatas = ocrDatas;
                return this;
            }

            /**
             * RiskWords.
             */
            public Builder riskWords(java.util.List < String > riskWords) {
                this.riskWords = riskWords;
                return this;
            }

            public TextInImage build() {
                return new TextInImage(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomImage")
        private java.util.List < CustomImage> customImage;

        @com.aliyun.core.annotation.NameInMap("PublicFigure")
        private java.util.List < PublicFigure> publicFigure;

        @com.aliyun.core.annotation.NameInMap("TextInImage")
        private TextInImage textInImage;

        private Data(Builder builder) {
            this.customImage = builder.customImage;
            this.publicFigure = builder.publicFigure;
            this.textInImage = builder.textInImage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return customImage
         */
        public java.util.List < CustomImage> getCustomImage() {
            return this.customImage;
        }

        /**
         * @return publicFigure
         */
        public java.util.List < PublicFigure> getPublicFigure() {
            return this.publicFigure;
        }

        /**
         * @return textInImage
         */
        public TextInImage getTextInImage() {
            return this.textInImage;
        }

        public static final class Builder {
            private java.util.List < CustomImage> customImage; 
            private java.util.List < PublicFigure> publicFigure; 
            private TextInImage textInImage; 

            /**
             * CustomImage.
             */
            public Builder customImage(java.util.List < CustomImage> customImage) {
                this.customImage = customImage;
                return this;
            }

            /**
             * PublicFigure.
             */
            public Builder publicFigure(java.util.List < PublicFigure> publicFigure) {
                this.publicFigure = publicFigure;
                return this;
            }

            /**
             * TextInImage.
             */
            public Builder textInImage(TextInImage textInImage) {
                this.textInImage = textInImage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
