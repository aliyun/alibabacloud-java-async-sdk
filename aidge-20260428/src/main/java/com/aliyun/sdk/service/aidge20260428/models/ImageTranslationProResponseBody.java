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
 * {@link ImageTranslationProResponseBody} extends {@link TeaModel}
 *
 * <p>ImageTranslationProResponseBody</p>
 */
public class ImageTranslationProResponseBody extends TeaModel {
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

    private ImageTranslationProResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageTranslationProResponseBody create() {
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

        private Builder(ImageTranslationProResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code. A value of 200 indicates a successful call. For other response codes, refer to the error code information.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The translation result data. ResultList contains the URLs of the translation results. GenFiles contains EditInfo, which includes the recognized text information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message. &quot;Success&quot; is returned for successful calls. A specific error message is returned for failed calls, such as &quot;The content contains sensitive data. Try other input.&quot;</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID, which uniquely identifies the request.</p>
         * 
         * <strong>example:</strong>
         * <p>61785C32-80C2-19A3-9E55-2C3702C84B40</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. A value of true indicates success. A value of false indicates failure.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ImageTranslationProResponseBody build() {
            return new ImageTranslationProResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ImageTranslationProResponseBody} extends {@link TeaModel}
     *
     * <p>ImageTranslationProResponseBody</p>
     */
    public static class GoodsRects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Degree")
        private Integer degree;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("Left")
        private Integer left;

        @com.aliyun.core.annotation.NameInMap("Top")
        private Integer top;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Integer width;

        private GoodsRects(Builder builder) {
            this.degree = builder.degree;
            this.height = builder.height;
            this.left = builder.left;
            this.top = builder.top;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GoodsRects create() {
            return builder().build();
        }

        /**
         * @return degree
         */
        public Integer getDegree() {
            return this.degree;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return left
         */
        public Integer getLeft() {
            return this.left;
        }

        /**
         * @return top
         */
        public Integer getTop() {
            return this.top;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer degree; 
            private Integer height; 
            private Integer left; 
            private Integer top; 
            private Integer width; 

            private Builder() {
            } 

            private Builder(GoodsRects model) {
                this.degree = model.degree;
                this.height = model.height;
                this.left = model.left;
                this.top = model.top;
                this.width = model.width;
            } 

            /**
             * <p>The rotation angle of the text box, in degrees. A value less than 1 indicates a horizontal text box.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder degree(Integer degree) {
                this.degree = degree;
                return this;
            }

            /**
             * <p>The height.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The left coordinate.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder left(Integer left) {
                this.left = left;
                return this;
            }

            /**
             * <p>The top coordinate.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder top(Integer top) {
                this.top = top;
                return this;
            }

            /**
             * <p>The width.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public GoodsRects build() {
                return new GoodsRects(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageTranslationProResponseBody} extends {@link TeaModel}
     *
     * <p>ImageTranslationProResponseBody</p>
     */
    public static class ImageRect extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Degree")
        private Integer degree;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("Left")
        private Integer left;

        @com.aliyun.core.annotation.NameInMap("Top")
        private Integer top;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Integer width;

        private ImageRect(Builder builder) {
            this.degree = builder.degree;
            this.height = builder.height;
            this.left = builder.left;
            this.top = builder.top;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageRect create() {
            return builder().build();
        }

        /**
         * @return degree
         */
        public Integer getDegree() {
            return this.degree;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return left
         */
        public Integer getLeft() {
            return this.left;
        }

        /**
         * @return top
         */
        public Integer getTop() {
            return this.top;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer degree; 
            private Integer height; 
            private Integer left; 
            private Integer top; 
            private Integer width; 

            private Builder() {
            } 

            private Builder(ImageRect model) {
                this.degree = model.degree;
                this.height = model.height;
                this.left = model.left;
                this.top = model.top;
                this.width = model.width;
            } 

            /**
             * <p>The rotation angle of the text box, in degrees. A value less than 1 indicates a horizontal text box.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder degree(Integer degree) {
                this.degree = degree;
                return this;
            }

            /**
             * <p>The height.</p>
             * 
             * <strong>example:</strong>
             * <p>54</p>
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The left coordinate.</p>
             * 
             * <strong>example:</strong>
             * <p>43</p>
             */
            public Builder left(Integer left) {
                this.left = left;
                return this;
            }

            /**
             * <p>The top coordinate.</p>
             * 
             * <strong>example:</strong>
             * <p>83</p>
             */
            public Builder top(Integer top) {
                this.top = top;
                return this;
            }

            /**
             * <p>The width.</p>
             * 
             * <strong>example:</strong>
             * <p>418</p>
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public ImageRect build() {
                return new ImageRect(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageTranslationProResponseBody} extends {@link TeaModel}
     *
     * <p>ImageTranslationProResponseBody</p>
     */
    public static class TextRect extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Degree")
        private Integer degree;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("Left")
        private Integer left;

        @com.aliyun.core.annotation.NameInMap("Top")
        private Integer top;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Integer width;

        private TextRect(Builder builder) {
            this.degree = builder.degree;
            this.height = builder.height;
            this.left = builder.left;
            this.top = builder.top;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextRect create() {
            return builder().build();
        }

        /**
         * @return degree
         */
        public Integer getDegree() {
            return this.degree;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return left
         */
        public Integer getLeft() {
            return this.left;
        }

        /**
         * @return top
         */
        public Integer getTop() {
            return this.top;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer degree; 
            private Integer height; 
            private Integer left; 
            private Integer top; 
            private Integer width; 

            private Builder() {
            } 

            private Builder(TextRect model) {
                this.degree = model.degree;
                this.height = model.height;
                this.left = model.left;
                this.top = model.top;
                this.width = model.width;
            } 

            /**
             * <p>The rotation angle of the text box, in degrees. A value less than 1 indicates a horizontal text box.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder degree(Integer degree) {
                this.degree = degree;
                return this;
            }

            /**
             * <p>The height.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The left coordinate.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder left(Integer left) {
                this.left = left;
                return this;
            }

            /**
             * <p>The top coordinate.</p>
             * 
             * <strong>example:</strong>
             * <p>95</p>
             */
            public Builder top(Integer top) {
                this.top = top;
                return this;
            }

            /**
             * <p>The width.</p>
             * 
             * <strong>example:</strong>
             * <p>488</p>
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public TextRect build() {
                return new TextRect(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageTranslationProResponseBody} extends {@link TeaModel}
     *
     * <p>ImageTranslationProResponseBody</p>
     */
    public static class Texts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Color")
        private String color;

        @com.aliyun.core.annotation.NameInMap("Fontsize")
        private Integer fontsize;

        @com.aliyun.core.annotation.NameInMap("HorizontalLayout")
        private String horizontalLayout;

        @com.aliyun.core.annotation.NameInMap("ImageRect")
        private ImageRect imageRect;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("LineCount")
        private Integer lineCount;

        @com.aliyun.core.annotation.NameInMap("TextRect")
        private TextRect textRect;

        @com.aliyun.core.annotation.NameInMap("Valid")
        private Boolean valid;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("VerticalLayout")
        private String verticalLayout;

        private Texts(Builder builder) {
            this.color = builder.color;
            this.fontsize = builder.fontsize;
            this.horizontalLayout = builder.horizontalLayout;
            this.imageRect = builder.imageRect;
            this.language = builder.language;
            this.lineCount = builder.lineCount;
            this.textRect = builder.textRect;
            this.valid = builder.valid;
            this.value = builder.value;
            this.verticalLayout = builder.verticalLayout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Texts create() {
            return builder().build();
        }

        /**
         * @return color
         */
        public String getColor() {
            return this.color;
        }

        /**
         * @return fontsize
         */
        public Integer getFontsize() {
            return this.fontsize;
        }

        /**
         * @return horizontalLayout
         */
        public String getHorizontalLayout() {
            return this.horizontalLayout;
        }

        /**
         * @return imageRect
         */
        public ImageRect getImageRect() {
            return this.imageRect;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return lineCount
         */
        public Integer getLineCount() {
            return this.lineCount;
        }

        /**
         * @return textRect
         */
        public TextRect getTextRect() {
            return this.textRect;
        }

        /**
         * @return valid
         */
        public Boolean getValid() {
            return this.valid;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return verticalLayout
         */
        public String getVerticalLayout() {
            return this.verticalLayout;
        }

        public static final class Builder {
            private String color; 
            private Integer fontsize; 
            private String horizontalLayout; 
            private ImageRect imageRect; 
            private String language; 
            private Integer lineCount; 
            private TextRect textRect; 
            private Boolean valid; 
            private String value; 
            private String verticalLayout; 

            private Builder() {
            } 

            private Builder(Texts model) {
                this.color = model.color;
                this.fontsize = model.fontsize;
                this.horizontalLayout = model.horizontalLayout;
                this.imageRect = model.imageRect;
                this.language = model.language;
                this.lineCount = model.lineCount;
                this.textRect = model.textRect;
                this.valid = model.valid;
                this.value = model.value;
                this.verticalLayout = model.verticalLayout;
            } 

            /**
             * <p>The text color after translation.</p>
             * 
             * <strong>example:</strong>
             * <p>#515151</p>
             */
            public Builder color(String color) {
                this.color = color;
                return this;
            }

            /**
             * <p>The font size of the translated text.</p>
             * 
             * <strong>example:</strong>
             * <p>29</p>
             */
            public Builder fontsize(Integer fontsize) {
                this.fontsize = fontsize;
                return this;
            }

            /**
             * <p>The horizontal layout mode. Valid values: center, left, right.</p>
             * 
             * <strong>example:</strong>
             * <p>center</p>
             */
            public Builder horizontalLayout(String horizontalLayout) {
                this.horizontalLayout = horizontalLayout;
                return this;
            }

            /**
             * <p>The coordinates of the image repair area.</p>
             */
            public Builder imageRect(ImageRect imageRect) {
                this.imageRect = imageRect;
                return this;
            }

            /**
             * <p>The target language code for translation.</p>
             * 
             * <strong>example:</strong>
             * <p>en</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The number of lines in the text box.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder lineCount(Integer lineCount) {
                this.lineCount = lineCount;
                return this;
            }

            /**
             * <p>The coordinates of the text box area.</p>
             */
            public Builder textRect(TextRect textRect) {
                this.textRect = textRect;
                return this;
            }

            /**
             * <p>Indicates whether the TextItem is valid. The TextItem is invalid if this value does not exist or is set to false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder valid(Boolean valid) {
                this.valid = valid;
                return this;
            }

            /**
             * <p>The translated text content.</p>
             * 
             * <strong>example:</strong>
             * <p>Adorable Design · Crisp Bell Sound</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * <p>The vertical layout mode. Valid values: center, top, and down.</p>
             * 
             * <strong>example:</strong>
             * <p>center</p>
             */
            public Builder verticalLayout(String verticalLayout) {
                this.verticalLayout = verticalLayout;
                return this;
            }

            public Texts build() {
                return new Texts(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageTranslationProResponseBody} extends {@link TeaModel}
     *
     * <p>ImageTranslationProResponseBody</p>
     */
    public static class TextAreas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Color")
        private String color;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Fontsize")
        private Integer fontsize;

        @com.aliyun.core.annotation.NameInMap("HorizontalLayout")
        private String horizontalLayout;

        @com.aliyun.core.annotation.NameInMap("LineCount")
        private Integer lineCount;

        @com.aliyun.core.annotation.NameInMap("Texts")
        private java.util.List<Texts> texts;

        @com.aliyun.core.annotation.NameInMap("VerticalLayout")
        private String verticalLayout;

        private TextAreas(Builder builder) {
            this.color = builder.color;
            this.content = builder.content;
            this.fontsize = builder.fontsize;
            this.horizontalLayout = builder.horizontalLayout;
            this.lineCount = builder.lineCount;
            this.texts = builder.texts;
            this.verticalLayout = builder.verticalLayout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextAreas create() {
            return builder().build();
        }

        /**
         * @return color
         */
        public String getColor() {
            return this.color;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return fontsize
         */
        public Integer getFontsize() {
            return this.fontsize;
        }

        /**
         * @return horizontalLayout
         */
        public String getHorizontalLayout() {
            return this.horizontalLayout;
        }

        /**
         * @return lineCount
         */
        public Integer getLineCount() {
            return this.lineCount;
        }

        /**
         * @return texts
         */
        public java.util.List<Texts> getTexts() {
            return this.texts;
        }

        /**
         * @return verticalLayout
         */
        public String getVerticalLayout() {
            return this.verticalLayout;
        }

        public static final class Builder {
            private String color; 
            private String content; 
            private Integer fontsize; 
            private String horizontalLayout; 
            private Integer lineCount; 
            private java.util.List<Texts> texts; 
            private String verticalLayout; 

            private Builder() {
            } 

            private Builder(TextAreas model) {
                this.color = model.color;
                this.content = model.content;
                this.fontsize = model.fontsize;
                this.horizontalLayout = model.horizontalLayout;
                this.lineCount = model.lineCount;
                this.texts = model.texts;
                this.verticalLayout = model.verticalLayout;
            } 

            /**
             * <p>The text color, such as #ffffff.</p>
             * 
             * <strong>example:</strong>
             * <p>#515151</p>
             */
            public Builder color(String color) {
                this.color = color;
                return this;
            }

            /**
             * <p>The original text before translation.</p>
             * 
             * <strong>example:</strong>
             * <p>萌趣造型·清脆响铃</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The font size.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder fontsize(Integer fontsize) {
                this.fontsize = fontsize;
                return this;
            }

            /**
             * <p>The horizontal layout mode. Valid values: center, left, right.</p>
             * 
             * <strong>example:</strong>
             * <p>left</p>
             */
            public Builder horizontalLayout(String horizontalLayout) {
                this.horizontalLayout = horizontalLayout;
                return this;
            }

            /**
             * <p>The number of lines in the text box.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder lineCount(Integer lineCount) {
                this.lineCount = lineCount;
                return this;
            }

            /**
             * <p>The list of translated texts. Each element corresponds to the translation result for a target language.</p>
             */
            public Builder texts(java.util.List<Texts> texts) {
                this.texts = texts;
                return this;
            }

            /**
             * <p>The vertical layout mode. Valid values: center, top, and down.</p>
             * 
             * <strong>example:</strong>
             * <p>center</p>
             */
            public Builder verticalLayout(String verticalLayout) {
                this.verticalLayout = verticalLayout;
                return this;
            }

            public TextAreas build() {
                return new TextAreas(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageTranslationProResponseBody} extends {@link TeaModel}
     *
     * <p>ImageTranslationProResponseBody</p>
     */
    public static class EditInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Font")
        private java.util.List<String> font;

        @com.aliyun.core.annotation.NameInMap("GoodsRects")
        private GoodsRects goodsRects;

        @com.aliyun.core.annotation.NameInMap("Languages")
        private java.util.List<String> languages;

        @com.aliyun.core.annotation.NameInMap("RepairedUrl")
        private String repairedUrl;

        @com.aliyun.core.annotation.NameInMap("ResultImageIds")
        private java.util.List<String> resultImageIds;

        @com.aliyun.core.annotation.NameInMap("TextAreas")
        private java.util.List<TextAreas> textAreas;

        private EditInfo(Builder builder) {
            this.font = builder.font;
            this.goodsRects = builder.goodsRects;
            this.languages = builder.languages;
            this.repairedUrl = builder.repairedUrl;
            this.resultImageIds = builder.resultImageIds;
            this.textAreas = builder.textAreas;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EditInfo create() {
            return builder().build();
        }

        /**
         * @return font
         */
        public java.util.List<String> getFont() {
            return this.font;
        }

        /**
         * @return goodsRects
         */
        public GoodsRects getGoodsRects() {
            return this.goodsRects;
        }

        /**
         * @return languages
         */
        public java.util.List<String> getLanguages() {
            return this.languages;
        }

        /**
         * @return repairedUrl
         */
        public String getRepairedUrl() {
            return this.repairedUrl;
        }

        /**
         * @return resultImageIds
         */
        public java.util.List<String> getResultImageIds() {
            return this.resultImageIds;
        }

        /**
         * @return textAreas
         */
        public java.util.List<TextAreas> getTextAreas() {
            return this.textAreas;
        }

        public static final class Builder {
            private java.util.List<String> font; 
            private GoodsRects goodsRects; 
            private java.util.List<String> languages; 
            private String repairedUrl; 
            private java.util.List<String> resultImageIds; 
            private java.util.List<TextAreas> textAreas; 

            private Builder() {
            } 

            private Builder(EditInfo model) {
                this.font = model.font;
                this.goodsRects = model.goodsRects;
                this.languages = model.languages;
                this.repairedUrl = model.repairedUrl;
                this.resultImageIds = model.resultImageIds;
                this.textAreas = model.textAreas;
            } 

            /**
             * <p>The list of font types.</p>
             */
            public Builder font(java.util.List<String> font) {
                this.font = font;
                return this;
            }

            /**
             * <p>The coordinate information of the product bounding box area.</p>
             */
            public Builder goodsRects(GoodsRects goodsRects) {
                this.goodsRects = goodsRects;
                return this;
            }

            /**
             * <p>The list of target languages for translation.</p>
             */
            public Builder languages(java.util.List<String> languages) {
                this.languages = languages;
                return this;
            }

            /**
             * <p>The URL of the image after all text has been inpainted.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://dashscope-a717.oss-cn-beijing.aliyuncs.com/repaired.png">http://dashscope-a717.oss-cn-beijing.aliyuncs.com/repaired.png</a></p>
             */
            public Builder repairedUrl(String repairedUrl) {
                this.repairedUrl = repairedUrl;
                return this;
            }

            /**
             * <p>The collection of global IDs for the translated images.</p>
             */
            public Builder resultImageIds(java.util.List<String> resultImageIds) {
                this.resultImageIds = resultImageIds;
                return this;
            }

            /**
             * <p>The list of text boxes, which contains information about all recognized text areas.</p>
             */
            public Builder textAreas(java.util.List<TextAreas> textAreas) {
                this.textAreas = textAreas;
                return this;
            }

            public EditInfo build() {
                return new EditInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageTranslationProResponseBody} extends {@link TeaModel}
     *
     * <p>ImageTranslationProResponseBody</p>
     */
    public static class ResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        private ResultList(Builder builder) {
            this.fileUrl = builder.fileUrl;
            this.language = builder.language;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultList create() {
            return builder().build();
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        public static final class Builder {
            private String fileUrl; 
            private String language; 

            private Builder() {
            } 

            private Builder(ResultList model) {
                this.fileUrl = model.fileUrl;
                this.language = model.language;
            } 

            /**
             * <p>The URL of the translated image file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://dashscope-a717.oss-cn-beijing.aliyuncs.com/xxx.jpg">http://dashscope-a717.oss-cn-beijing.aliyuncs.com/xxx.jpg</a></p>
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * <p>The target language for translation.</p>
             * 
             * <strong>example:</strong>
             * <p>en</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            public ResultList build() {
                return new ResultList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageTranslationProResponseBody} extends {@link TeaModel}
     *
     * <p>ImageTranslationProResponseBody</p>
     */
    public static class GenFiles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EditInfo")
        private EditInfo editInfo;

        @com.aliyun.core.annotation.NameInMap("ResultList")
        private java.util.List<ResultList> resultList;

        @com.aliyun.core.annotation.NameInMap("SrcImage")
        private String srcImage;

        private GenFiles(Builder builder) {
            this.editInfo = builder.editInfo;
            this.resultList = builder.resultList;
            this.srcImage = builder.srcImage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GenFiles create() {
            return builder().build();
        }

        /**
         * @return editInfo
         */
        public EditInfo getEditInfo() {
            return this.editInfo;
        }

        /**
         * @return resultList
         */
        public java.util.List<ResultList> getResultList() {
            return this.resultList;
        }

        /**
         * @return srcImage
         */
        public String getSrcImage() {
            return this.srcImage;
        }

        public static final class Builder {
            private EditInfo editInfo; 
            private java.util.List<ResultList> resultList; 
            private String srcImage; 

            private Builder() {
            } 

            private Builder(GenFiles model) {
                this.editInfo = model.editInfo;
                this.resultList = model.resultList;
                this.srcImage = model.srcImage;
            } 

            /**
             * <p>The editor information, which contains recognized information such as text areas, product areas, and fonts.</p>
             */
            public Builder editInfo(EditInfo editInfo) {
                this.editInfo = editInfo;
                return this;
            }

            /**
             * <p>The collection of translation results.</p>
             */
            public Builder resultList(java.util.List<ResultList> resultList) {
                this.resultList = resultList;
                return this;
            }

            /**
             * <p>The URL of the original image.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://img.alicdn.com/imgextra/i3/O1CN01HTDhDi28Fd85ZYs7H_!!6000000007903-0-tps-800-800.jpg">https://img.alicdn.com/imgextra/i3/O1CN01HTDhDi28Fd85ZYs7H_!!6000000007903-0-tps-800-800.jpg</a></p>
             */
            public Builder srcImage(String srcImage) {
                this.srcImage = srcImage;
                return this;
            }

            public GenFiles build() {
                return new GenFiles(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageTranslationProResponseBody} extends {@link TeaModel}
     *
     * <p>ImageTranslationProResponseBody</p>
     */
    public static class DataResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        private DataResultList(Builder builder) {
            this.fileUrl = builder.fileUrl;
            this.language = builder.language;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataResultList create() {
            return builder().build();
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        public static final class Builder {
            private String fileUrl; 
            private String language; 

            private Builder() {
            } 

            private Builder(DataResultList model) {
                this.fileUrl = model.fileUrl;
                this.language = model.language;
            } 

            /**
             * <p>The URL of the translated result image.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://dashscope-a717.oss-cn-beijing.aliyuncs.com/xxx.jpg">http://dashscope-a717.oss-cn-beijing.aliyuncs.com/xxx.jpg</a></p>
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * <p>The target language for image translation.</p>
             * 
             * <strong>example:</strong>
             * <p>en</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            public DataResultList build() {
                return new DataResultList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ImageTranslationProResponseBody} extends {@link TeaModel}
     *
     * <p>ImageTranslationProResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GenFiles")
        private java.util.List<GenFiles> genFiles;

        @com.aliyun.core.annotation.NameInMap("ResultList")
        private java.util.List<DataResultList> resultList;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("UsageMap")
        private java.util.Map<String, Long> usageMap;

        private Data(Builder builder) {
            this.genFiles = builder.genFiles;
            this.resultList = builder.resultList;
            this.taskId = builder.taskId;
            this.usageMap = builder.usageMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return genFiles
         */
        public java.util.List<GenFiles> getGenFiles() {
            return this.genFiles;
        }

        /**
         * @return resultList
         */
        public java.util.List<DataResultList> getResultList() {
            return this.resultList;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return usageMap
         */
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

        public static final class Builder {
            private java.util.List<GenFiles> genFiles; 
            private java.util.List<DataResultList> resultList; 
            private String taskId; 
            private java.util.Map<String, Long> usageMap; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.genFiles = model.genFiles;
                this.resultList = model.resultList;
                this.taskId = model.taskId;
                this.usageMap = model.usageMap;
            } 

            /**
             * <p>The editor protocol, which contains translation result files and editing information.</p>
             */
            public Builder genFiles(java.util.List<GenFiles> genFiles) {
                this.genFiles = genFiles;
                return this;
            }

            /**
             * <p>The list of image translation results.</p>
             */
            public Builder resultList(java.util.List<DataResultList> resultList) {
                this.resultList = resultList;
                return this;
            }

            /**
             * <p>The asynchronous task ID. This parameter is not returned for synchronous calls.</p>
             * 
             * <strong>example:</strong>
             * <p>abc123-task-id</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The usage information, such as the number of processed images.</p>
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
