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
 * {@link ImageTranslationStandardResponseBody} extends {@link TeaModel}
 *
 * <p>ImageTranslationStandardResponseBody</p>
 */
public class ImageTranslationStandardResponseBody extends TeaModel {
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

    private ImageTranslationStandardResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageTranslationStandardResponseBody create() {
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

        private Builder(ImageTranslationStandardResponseBody model) {
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

        public ImageTranslationStandardResponseBody build() {
            return new ImageTranslationStandardResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ImageTranslationStandardResponseBody} extends {@link TeaModel}
     *
     * <p>ImageTranslationStandardResponseBody</p>
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
             * Degree.
             */
            public Builder degree(Integer degree) {
                this.degree = degree;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Left.
             */
            public Builder left(Integer left) {
                this.left = left;
                return this;
            }

            /**
             * Top.
             */
            public Builder top(Integer top) {
                this.top = top;
                return this;
            }

            /**
             * Width.
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
     * {@link ImageTranslationStandardResponseBody} extends {@link TeaModel}
     *
     * <p>ImageTranslationStandardResponseBody</p>
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
             * Degree.
             */
            public Builder degree(Integer degree) {
                this.degree = degree;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Left.
             */
            public Builder left(Integer left) {
                this.left = left;
                return this;
            }

            /**
             * Top.
             */
            public Builder top(Integer top) {
                this.top = top;
                return this;
            }

            /**
             * Width.
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
     * {@link ImageTranslationStandardResponseBody} extends {@link TeaModel}
     *
     * <p>ImageTranslationStandardResponseBody</p>
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
             * Degree.
             */
            public Builder degree(Integer degree) {
                this.degree = degree;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Left.
             */
            public Builder left(Integer left) {
                this.left = left;
                return this;
            }

            /**
             * Top.
             */
            public Builder top(Integer top) {
                this.top = top;
                return this;
            }

            /**
             * Width.
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
     * {@link ImageTranslationStandardResponseBody} extends {@link TeaModel}
     *
     * <p>ImageTranslationStandardResponseBody</p>
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
             * Color.
             */
            public Builder color(String color) {
                this.color = color;
                return this;
            }

            /**
             * Fontsize.
             */
            public Builder fontsize(Integer fontsize) {
                this.fontsize = fontsize;
                return this;
            }

            /**
             * HorizontalLayout.
             */
            public Builder horizontalLayout(String horizontalLayout) {
                this.horizontalLayout = horizontalLayout;
                return this;
            }

            /**
             * ImageRect.
             */
            public Builder imageRect(ImageRect imageRect) {
                this.imageRect = imageRect;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * LineCount.
             */
            public Builder lineCount(Integer lineCount) {
                this.lineCount = lineCount;
                return this;
            }

            /**
             * TextRect.
             */
            public Builder textRect(TextRect textRect) {
                this.textRect = textRect;
                return this;
            }

            /**
             * Valid.
             */
            public Builder valid(Boolean valid) {
                this.valid = valid;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * VerticalLayout.
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
     * {@link ImageTranslationStandardResponseBody} extends {@link TeaModel}
     *
     * <p>ImageTranslationStandardResponseBody</p>
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
             * Color.
             */
            public Builder color(String color) {
                this.color = color;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Fontsize.
             */
            public Builder fontsize(Integer fontsize) {
                this.fontsize = fontsize;
                return this;
            }

            /**
             * HorizontalLayout.
             */
            public Builder horizontalLayout(String horizontalLayout) {
                this.horizontalLayout = horizontalLayout;
                return this;
            }

            /**
             * LineCount.
             */
            public Builder lineCount(Integer lineCount) {
                this.lineCount = lineCount;
                return this;
            }

            /**
             * Texts.
             */
            public Builder texts(java.util.List<Texts> texts) {
                this.texts = texts;
                return this;
            }

            /**
             * VerticalLayout.
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
     * {@link ImageTranslationStandardResponseBody} extends {@link TeaModel}
     *
     * <p>ImageTranslationStandardResponseBody</p>
     */
    public static class EditInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Font")
        private java.util.List<String> font;

        @com.aliyun.core.annotation.NameInMap("GoodsRects")
        private GoodsRects goodsRects;

        @com.aliyun.core.annotation.NameInMap("GoodsUrl")
        private String goodsUrl;

        @com.aliyun.core.annotation.NameInMap("Languages")
        private java.util.List<String> languages;

        @com.aliyun.core.annotation.NameInMap("PictUrl")
        private String pictUrl;

        @com.aliyun.core.annotation.NameInMap("RepairedUrl")
        private String repairedUrl;

        @com.aliyun.core.annotation.NameInMap("RepairedUrls")
        private java.util.List<String> repairedUrls;

        @com.aliyun.core.annotation.NameInMap("ResultImageIds")
        private java.util.List<String> resultImageIds;

        @com.aliyun.core.annotation.NameInMap("ResultUrls")
        private java.util.List<String> resultUrls;

        @com.aliyun.core.annotation.NameInMap("TextAreas")
        private java.util.List<TextAreas> textAreas;

        private EditInfo(Builder builder) {
            this.font = builder.font;
            this.goodsRects = builder.goodsRects;
            this.goodsUrl = builder.goodsUrl;
            this.languages = builder.languages;
            this.pictUrl = builder.pictUrl;
            this.repairedUrl = builder.repairedUrl;
            this.repairedUrls = builder.repairedUrls;
            this.resultImageIds = builder.resultImageIds;
            this.resultUrls = builder.resultUrls;
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
         * @return goodsUrl
         */
        public String getGoodsUrl() {
            return this.goodsUrl;
        }

        /**
         * @return languages
         */
        public java.util.List<String> getLanguages() {
            return this.languages;
        }

        /**
         * @return pictUrl
         */
        public String getPictUrl() {
            return this.pictUrl;
        }

        /**
         * @return repairedUrl
         */
        public String getRepairedUrl() {
            return this.repairedUrl;
        }

        /**
         * @return repairedUrls
         */
        public java.util.List<String> getRepairedUrls() {
            return this.repairedUrls;
        }

        /**
         * @return resultImageIds
         */
        public java.util.List<String> getResultImageIds() {
            return this.resultImageIds;
        }

        /**
         * @return resultUrls
         */
        public java.util.List<String> getResultUrls() {
            return this.resultUrls;
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
            private String goodsUrl; 
            private java.util.List<String> languages; 
            private String pictUrl; 
            private String repairedUrl; 
            private java.util.List<String> repairedUrls; 
            private java.util.List<String> resultImageIds; 
            private java.util.List<String> resultUrls; 
            private java.util.List<TextAreas> textAreas; 

            private Builder() {
            } 

            private Builder(EditInfo model) {
                this.font = model.font;
                this.goodsRects = model.goodsRects;
                this.goodsUrl = model.goodsUrl;
                this.languages = model.languages;
                this.pictUrl = model.pictUrl;
                this.repairedUrl = model.repairedUrl;
                this.repairedUrls = model.repairedUrls;
                this.resultImageIds = model.resultImageIds;
                this.resultUrls = model.resultUrls;
                this.textAreas = model.textAreas;
            } 

            /**
             * Font.
             */
            public Builder font(java.util.List<String> font) {
                this.font = font;
                return this;
            }

            /**
             * GoodsRects.
             */
            public Builder goodsRects(GoodsRects goodsRects) {
                this.goodsRects = goodsRects;
                return this;
            }

            /**
             * GoodsUrl.
             */
            public Builder goodsUrl(String goodsUrl) {
                this.goodsUrl = goodsUrl;
                return this;
            }

            /**
             * Languages.
             */
            public Builder languages(java.util.List<String> languages) {
                this.languages = languages;
                return this;
            }

            /**
             * PictUrl.
             */
            public Builder pictUrl(String pictUrl) {
                this.pictUrl = pictUrl;
                return this;
            }

            /**
             * RepairedUrl.
             */
            public Builder repairedUrl(String repairedUrl) {
                this.repairedUrl = repairedUrl;
                return this;
            }

            /**
             * RepairedUrls.
             */
            public Builder repairedUrls(java.util.List<String> repairedUrls) {
                this.repairedUrls = repairedUrls;
                return this;
            }

            /**
             * ResultImageIds.
             */
            public Builder resultImageIds(java.util.List<String> resultImageIds) {
                this.resultImageIds = resultImageIds;
                return this;
            }

            /**
             * ResultUrls.
             */
            public Builder resultUrls(java.util.List<String> resultUrls) {
                this.resultUrls = resultUrls;
                return this;
            }

            /**
             * TextAreas.
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
     * {@link ImageTranslationStandardResponseBody} extends {@link TeaModel}
     *
     * <p>ImageTranslationStandardResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EditInfo")
        private EditInfo editInfo;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("UsageMap")
        private java.util.Map<String, Long> usageMap;

        private Data(Builder builder) {
            this.editInfo = builder.editInfo;
            this.imageUrl = builder.imageUrl;
            this.usageMap = builder.usageMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return editInfo
         */
        public EditInfo getEditInfo() {
            return this.editInfo;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return usageMap
         */
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

        public static final class Builder {
            private EditInfo editInfo; 
            private String imageUrl; 
            private java.util.Map<String, Long> usageMap; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.editInfo = model.editInfo;
                this.imageUrl = model.imageUrl;
                this.usageMap = model.usageMap;
            } 

            /**
             * EditInfo.
             */
            public Builder editInfo(EditInfo editInfo) {
                this.editInfo = editInfo;
                return this;
            }

            /**
             * ImageUrl.
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
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
