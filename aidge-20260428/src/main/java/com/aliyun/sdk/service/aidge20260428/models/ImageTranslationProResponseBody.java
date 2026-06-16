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

        /**
         * Success.
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
             * <p>矩形旋转角度</p>
             */
            public Builder degree(Integer degree) {
                this.degree = degree;
                return this;
            }

            /**
             * <p>矩形高度</p>
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * <p>矩形左侧X坐标</p>
             */
            public Builder left(Integer left) {
                this.left = left;
                return this;
            }

            /**
             * <p>矩形顶部Y坐标</p>
             */
            public Builder top(Integer top) {
                this.top = top;
                return this;
            }

            /**
             * <p>矩形宽度</p>
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
             * <p>矩形旋转角度</p>
             */
            public Builder degree(Integer degree) {
                this.degree = degree;
                return this;
            }

            /**
             * <p>矩形高度</p>
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * <p>矩形左侧X坐标</p>
             */
            public Builder left(Integer left) {
                this.left = left;
                return this;
            }

            /**
             * <p>矩形顶部Y坐标</p>
             */
            public Builder top(Integer top) {
                this.top = top;
                return this;
            }

            /**
             * <p>矩形宽度</p>
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
             * <p>矩形旋转角度</p>
             */
            public Builder degree(Integer degree) {
                this.degree = degree;
                return this;
            }

            /**
             * <p>矩形高度</p>
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * <p>矩形左侧X坐标</p>
             */
            public Builder left(Integer left) {
                this.left = left;
                return this;
            }

            /**
             * <p>矩形顶部Y坐标</p>
             */
            public Builder top(Integer top) {
                this.top = top;
                return this;
            }

            /**
             * <p>矩形宽度</p>
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

        @com.aliyun.core.annotation.NameInMap("OvisErrMsg")
        private String ovisErrMsg;

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
            this.ovisErrMsg = builder.ovisErrMsg;
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
         * @return ovisErrMsg
         */
        public String getOvisErrMsg() {
            return this.ovisErrMsg;
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
            private String ovisErrMsg; 
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
                this.ovisErrMsg = model.ovisErrMsg;
                this.textRect = model.textRect;
                this.valid = model.valid;
                this.value = model.value;
                this.verticalLayout = model.verticalLayout;
            } 

            /**
             * <p>文本颜色</p>
             */
            public Builder color(String color) {
                this.color = color;
                return this;
            }

            /**
             * <p>字体大小</p>
             */
            public Builder fontsize(Integer fontsize) {
                this.fontsize = fontsize;
                return this;
            }

            /**
             * <p>水平布局方式</p>
             */
            public Builder horizontalLayout(String horizontalLayout) {
                this.horizontalLayout = horizontalLayout;
                return this;
            }

            /**
             * <p>图片区域矩形信息</p>
             */
            public Builder imageRect(ImageRect imageRect) {
                this.imageRect = imageRect;
                return this;
            }

            /**
             * <p>文本语言</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>文本行数</p>
             */
            public Builder lineCount(Integer lineCount) {
                this.lineCount = lineCount;
                return this;
            }

            /**
             * <p>OVIS错误信息</p>
             */
            public Builder ovisErrMsg(String ovisErrMsg) {
                this.ovisErrMsg = ovisErrMsg;
                return this;
            }

            /**
             * <p>文本区域矩形信息</p>
             */
            public Builder textRect(TextRect textRect) {
                this.textRect = textRect;
                return this;
            }

            /**
             * <p>文本是否有效</p>
             */
            public Builder valid(Boolean valid) {
                this.valid = valid;
                return this;
            }

            /**
             * <p>翻译后的文本值</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * <p>垂直布局方式</p>
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
             * <p>文本颜色</p>
             */
            public Builder color(String color) {
                this.color = color;
                return this;
            }

            /**
             * <p>文本区域内容</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>字体大小</p>
             */
            public Builder fontsize(Integer fontsize) {
                this.fontsize = fontsize;
                return this;
            }

            /**
             * <p>水平布局方式</p>
             */
            public Builder horizontalLayout(String horizontalLayout) {
                this.horizontalLayout = horizontalLayout;
                return this;
            }

            /**
             * <p>文本区域行数</p>
             */
            public Builder lineCount(Integer lineCount) {
                this.lineCount = lineCount;
                return this;
            }

            /**
             * <p>文本列表</p>
             */
            public Builder texts(java.util.List<Texts> texts) {
                this.texts = texts;
                return this;
            }

            /**
             * <p>垂直布局方式</p>
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
             * <p>使用的字体列表</p>
             */
            public Builder font(java.util.List<String> font) {
                this.font = font;
                return this;
            }

            /**
             * <p>商品区域矩形信息</p>
             */
            public Builder goodsRects(GoodsRects goodsRects) {
                this.goodsRects = goodsRects;
                return this;
            }

            /**
             * <p>检测到的语言列表</p>
             */
            public Builder languages(java.util.List<String> languages) {
                this.languages = languages;
                return this;
            }

            /**
             * <p>修复后的图片URL</p>
             */
            public Builder repairedUrl(String repairedUrl) {
                this.repairedUrl = repairedUrl;
                return this;
            }

            /**
             * <p>结果图片ID列表</p>
             */
            public Builder resultImageIds(java.util.List<String> resultImageIds) {
                this.resultImageIds = resultImageIds;
                return this;
            }

            /**
             * <p>文本区域列表</p>
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
             * <p>翻译后文件URL</p>
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * <p>翻译语言</p>
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
             * <p>图片编辑相关信息</p>
             */
            public Builder editInfo(EditInfo editInfo) {
                this.editInfo = editInfo;
                return this;
            }

            /**
             * <p>翻译结果列表</p>
             */
            public Builder resultList(java.util.List<ResultList> resultList) {
                this.resultList = resultList;
                return this;
            }

            /**
             * <p>源图片URL</p>
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
             * <p>翻译后文件URL</p>
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * <p>翻译语言</p>
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
             * <p>翻译后的文件列表</p>
             */
            public Builder genFiles(java.util.List<GenFiles> genFiles) {
                this.genFiles = genFiles;
                return this;
            }

            /**
             * <p>翻译结果列表</p>
             */
            public Builder resultList(java.util.List<DataResultList> resultList) {
                this.resultList = resultList;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * UsageMap.
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
