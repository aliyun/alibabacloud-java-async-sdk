// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

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
 * {@link DescribeFileModerationResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFileModerationResultResponseBody</p>
 */
public class DescribeFileModerationResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeFileModerationResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFileModerationResultResponseBody create() {
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * <p>The returned HTTP status code. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message that is returned in response to the request.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6CF2815C-C8C7-4A01-B52E-FF6E24F53492</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeFileModerationResultResponseBody build() {
            return new DescribeFileModerationResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFileModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileModerationResultResponseBody</p>
     */
    public static class LabelResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Confidence")
        private Float confidence;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        private LabelResult(Builder builder) {
            this.confidence = builder.confidence;
            this.description = builder.description;
            this.label = builder.label;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LabelResult create() {
            return builder().build();
        }

        /**
         * @return confidence
         */
        public Float getConfidence() {
            return this.confidence;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        public static final class Builder {
            private Float confidence; 
            private String description; 
            private String label; 

            /**
             * <p>The score of the confidence level. Valid values: 0 to 100. The value is accurate to two decimal places.</p>
             * 
             * <strong>example:</strong>
             * <p>25.0</p>
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a title.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The details of the labels.</p>
             * 
             * <strong>example:</strong>
             * <p>nonlabel</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            public LabelResult build() {
                return new LabelResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFileModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileModerationResultResponseBody</p>
     */
    public static class Location extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("H")
        private Integer h;

        @com.aliyun.core.annotation.NameInMap("W")
        private Integer w;

        @com.aliyun.core.annotation.NameInMap("X")
        private Integer x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Integer y;

        private Location(Builder builder) {
            this.h = builder.h;
            this.w = builder.w;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Location create() {
            return builder().build();
        }

        /**
         * @return h
         */
        public Integer getH() {
            return this.h;
        }

        /**
         * @return w
         */
        public Integer getW() {
            return this.w;
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer h; 
            private Integer w; 
            private Integer x; 
            private Integer y; 

            /**
             * <p>The H value of the coordinate point.</p>
             * 
             * <strong>example:</strong>
             * <p>44</p>
             */
            public Builder h(Integer h) {
                this.h = h;
                return this;
            }

            /**
             * <p>The W value of the coordinate point.</p>
             * 
             * <strong>example:</strong>
             * <p>33</p>
             */
            public Builder w(Integer w) {
                this.w = w;
                return this;
            }

            /**
             * <p>The X value of the coordinate point.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The Y value of the coordinate point.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public Location build() {
                return new Location(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFileModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileModerationResultResponseBody</p>
     */
    public static class ImageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("LabelResult")
        private java.util.List<LabelResult> labelResult;

        @com.aliyun.core.annotation.NameInMap("Location")
        private Location location;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("Service")
        private String service;

        private ImageResult(Builder builder) {
            this.description = builder.description;
            this.labelResult = builder.labelResult;
            this.location = builder.location;
            this.riskLevel = builder.riskLevel;
            this.service = builder.service;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageResult create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return labelResult
         */
        public java.util.List<LabelResult> getLabelResult() {
            return this.labelResult;
        }

        /**
         * @return location
         */
        public Location getLocation() {
            return this.location;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return service
         */
        public String getService() {
            return this.service;
        }

        public static final class Builder {
            private String description; 
            private java.util.List<LabelResult> labelResult; 
            private Location location; 
            private String riskLevel; 
            private String service; 

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a title.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The label information.</p>
             */
            public Builder labelResult(java.util.List<LabelResult> labelResult) {
                this.labelResult = labelResult;
                return this;
            }

            /**
             * <p>The location information</p>
             */
            public Builder location(Location location) {
                this.location = location;
                return this;
            }

            /**
             * <p>Risk Level</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The moderation service.</p>
             * 
             * <strong>example:</strong>
             * <p>baselineCheck</p>
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            public ImageResult build() {
                return new ImageResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFileModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileModerationResultResponseBody</p>
     */
    public static class TextResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private String labels;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("RiskTips")
        private String riskTips;

        @com.aliyun.core.annotation.NameInMap("RiskWords")
        private String riskWords;

        @com.aliyun.core.annotation.NameInMap("Service")
        private String service;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("TextSegment")
        private String textSegment;

        private TextResult(Builder builder) {
            this.description = builder.description;
            this.labels = builder.labels;
            this.riskLevel = builder.riskLevel;
            this.riskTips = builder.riskTips;
            this.riskWords = builder.riskWords;
            this.service = builder.service;
            this.text = builder.text;
            this.textSegment = builder.textSegment;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextResult create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return labels
         */
        public String getLabels() {
            return this.labels;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return riskTips
         */
        public String getRiskTips() {
            return this.riskTips;
        }

        /**
         * @return riskWords
         */
        public String getRiskWords() {
            return this.riskWords;
        }

        /**
         * @return service
         */
        public String getService() {
            return this.service;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return textSegment
         */
        public String getTextSegment() {
            return this.textSegment;
        }

        public static final class Builder {
            private String description; 
            private String labels; 
            private String riskLevel; 
            private String riskTips; 
            private String riskWords; 
            private String service; 
            private String text; 
            private String textSegment; 

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a title.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The details of the labels.</p>
             * 
             * <strong>example:</strong>
             * <p>porn</p>
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>Risk Level</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The risk details that are hit.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder riskTips(String riskTips) {
                this.riskTips = riskTips;
                return this;
            }

            /**
             * <p>The risk words that are hit.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder riskWords(String riskWords) {
                this.riskWords = riskWords;
                return this;
            }

            /**
             * <p>The moderation service.</p>
             * 
             * <strong>example:</strong>
             * <p>chat_detection</p>
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            /**
             * <p>The text content.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a text.</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The text segmentation information.</p>
             * 
             * <strong>example:</strong>
             * <p>[0,999]</p>
             */
            public Builder textSegment(String textSegment) {
                this.textSegment = textSegment;
                return this;
            }

            public TextResult build() {
                return new TextResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFileModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileModerationResultResponseBody</p>
     */
    public static class PageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageResult")
        private java.util.List<ImageResult> imageResult;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("TextResult")
        private java.util.List<TextResult> textResult;

        @com.aliyun.core.annotation.NameInMap("TextUrl")
        private String textUrl;

        private PageResult(Builder builder) {
            this.imageResult = builder.imageResult;
            this.imageUrl = builder.imageUrl;
            this.pageNum = builder.pageNum;
            this.textResult = builder.textResult;
            this.textUrl = builder.textUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageResult create() {
            return builder().build();
        }

        /**
         * @return imageResult
         */
        public java.util.List<ImageResult> getImageResult() {
            return this.imageResult;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return textResult
         */
        public java.util.List<TextResult> getTextResult() {
            return this.textResult;
        }

        /**
         * @return textUrl
         */
        public String getTextUrl() {
            return this.textUrl;
        }

        public static final class Builder {
            private java.util.List<ImageResult> imageResult; 
            private String imageUrl; 
            private Integer pageNum; 
            private java.util.List<TextResult> textResult; 
            private String textUrl; 

            /**
             * <p>The image moderation results.</p>
             */
            public Builder imageResult(java.util.List<ImageResult> imageResult) {
                this.imageResult = imageResult;
                return this;
            }

            /**
             * <p>The image URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://detect-obj.oss-cn-hangzhou.aliyuncs.com/sample/xxxx.jpg">https://detect-obj.oss-cn-hangzhou.aliyuncs.com/sample/xxxx.jpg</a></p>
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>The text moderation results.</p>
             */
            public Builder textResult(java.util.List<TextResult> textResult) {
                this.textResult = textResult;
                return this;
            }

            /**
             * <p>The text URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://detect-obj.oss-cn-hangzhou.aliyuncs.com/sample/xxxx.txt">https://detect-obj.oss-cn-hangzhou.aliyuncs.com/sample/xxxx.txt</a></p>
             */
            public Builder textUrl(String textUrl) {
                this.textUrl = textUrl;
                return this;
            }

            public PageResult build() {
                return new PageResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFileModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileModerationResultResponseBody</p>
     */
    public static class ImageLabels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("LabelSum")
        private Integer labelSum;

        private ImageLabels(Builder builder) {
            this.description = builder.description;
            this.label = builder.label;
            this.labelSum = builder.labelSum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageLabels create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return labelSum
         */
        public Integer getLabelSum() {
            return this.labelSum;
        }

        public static final class Builder {
            private String description; 
            private String label; 
            private Integer labelSum; 

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The details of the labels.</p>
             * 
             * <strong>example:</strong>
             * <p>contraband</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The number of times that the label is matched.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder labelSum(Integer labelSum) {
                this.labelSum = labelSum;
                return this;
            }

            public ImageLabels build() {
                return new ImageLabels(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFileModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileModerationResultResponseBody</p>
     */
    public static class ImageSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageLabels")
        private java.util.List<ImageLabels> imageLabels;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        private ImageSummary(Builder builder) {
            this.imageLabels = builder.imageLabels;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageSummary create() {
            return builder().build();
        }

        /**
         * @return imageLabels
         */
        public java.util.List<ImageLabels> getImageLabels() {
            return this.imageLabels;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private java.util.List<ImageLabels> imageLabels; 
            private String riskLevel; 

            /**
             * <p>Image Label</p>
             */
            public Builder imageLabels(java.util.List<ImageLabels> imageLabels) {
                this.imageLabels = imageLabels;
                return this;
            }

            /**
             * <p>Risk Level</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public ImageSummary build() {
                return new ImageSummary(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFileModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileModerationResultResponseBody</p>
     */
    public static class TextLabels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("LabelSum")
        private Integer labelSum;

        private TextLabels(Builder builder) {
            this.label = builder.label;
            this.labelSum = builder.labelSum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextLabels create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return labelSum
         */
        public Integer getLabelSum() {
            return this.labelSum;
        }

        public static final class Builder {
            private String label; 
            private Integer labelSum; 

            /**
             * <p>The details of the labels.</p>
             * 
             * <strong>example:</strong>
             * <p>contraband</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The number of times that the label is matched.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder labelSum(Integer labelSum) {
                this.labelSum = labelSum;
                return this;
            }

            public TextLabels build() {
                return new TextLabels(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFileModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileModerationResultResponseBody</p>
     */
    public static class TextSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("TextLabels")
        private java.util.List<TextLabels> textLabels;

        private TextSummary(Builder builder) {
            this.riskLevel = builder.riskLevel;
            this.textLabels = builder.textLabels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextSummary create() {
            return builder().build();
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return textLabels
         */
        public java.util.List<TextLabels> getTextLabels() {
            return this.textLabels;
        }

        public static final class Builder {
            private String riskLevel; 
            private java.util.List<TextLabels> textLabels; 

            /**
             * <p>Risk Level</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>Text Label</p>
             */
            public Builder textLabels(java.util.List<TextLabels> textLabels) {
                this.textLabels = textLabels;
                return this;
            }

            public TextSummary build() {
                return new TextSummary(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFileModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileModerationResultResponseBody</p>
     */
    public static class PageSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageSummary")
        private ImageSummary imageSummary;

        @com.aliyun.core.annotation.NameInMap("PageSum")
        private Integer pageSum;

        @com.aliyun.core.annotation.NameInMap("TextSummary")
        private TextSummary textSummary;

        private PageSummary(Builder builder) {
            this.imageSummary = builder.imageSummary;
            this.pageSum = builder.pageSum;
            this.textSummary = builder.textSummary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageSummary create() {
            return builder().build();
        }

        /**
         * @return imageSummary
         */
        public ImageSummary getImageSummary() {
            return this.imageSummary;
        }

        /**
         * @return pageSum
         */
        public Integer getPageSum() {
            return this.pageSum;
        }

        /**
         * @return textSummary
         */
        public TextSummary getTextSummary() {
            return this.textSummary;
        }

        public static final class Builder {
            private ImageSummary imageSummary; 
            private Integer pageSum; 
            private TextSummary textSummary; 

            /**
             * <p>Image Results Summary</p>
             */
            public Builder imageSummary(ImageSummary imageSummary) {
                this.imageSummary = imageSummary;
                return this;
            }

            /**
             * <p>Number of pages</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageSum(Integer pageSum) {
                this.pageSum = pageSum;
                return this;
            }

            /**
             * <p>Text Results Summary</p>
             */
            public Builder textSummary(TextSummary textSummary) {
                this.textSummary = textSummary;
                return this;
            }

            public PageSummary build() {
                return new PageSummary(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFileModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileModerationResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataId")
        private String dataId;

        @com.aliyun.core.annotation.NameInMap("DocType")
        private String docType;

        @com.aliyun.core.annotation.NameInMap("PageResult")
        private java.util.List<PageResult> pageResult;

        @com.aliyun.core.annotation.NameInMap("PageSummary")
        private PageSummary pageSummary;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Data(Builder builder) {
            this.dataId = builder.dataId;
            this.docType = builder.docType;
            this.pageResult = builder.pageResult;
            this.pageSummary = builder.pageSummary;
            this.riskLevel = builder.riskLevel;
            this.url = builder.url;
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
         * @return docType
         */
        public String getDocType() {
            return this.docType;
        }

        /**
         * @return pageResult
         */
        public java.util.List<PageResult> getPageResult() {
            return this.pageResult;
        }

        /**
         * @return pageSummary
         */
        public PageSummary getPageSummary() {
            return this.pageSummary;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String dataId; 
            private String docType; 
            private java.util.List<PageResult> pageResult; 
            private PageSummary pageSummary; 
            private String riskLevel; 
            private String url; 

            /**
             * <p>The ID of the moderated object.</p>
             * 
             * <strong>example:</strong>
             * <p>26769ada6e264e7ba9aa048241e12be9</p>
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * <p>Optional. The document type.</p>
             * 
             * <strong>example:</strong>
             * <p>doc</p>
             */
            public Builder docType(String docType) {
                this.docType = docType;
                return this;
            }

            /**
             * <p>An array that consists of the moderation results.</p>
             */
            public Builder pageResult(java.util.List<PageResult> pageResult) {
                this.pageResult = pageResult;
                return this;
            }

            /**
             * <p>Summary of results</p>
             */
            public Builder pageSummary(PageSummary pageSummary) {
                this.pageSummary = pageSummary;
                return this;
            }

            /**
             * <p>Risk Level</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The URL of the moderated object.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://detect-obj.oss-cn-hangzhou.aliyuncs.com/sample/xxxx.pdf">https://detect-obj.oss-cn-hangzhou.aliyuncs.com/sample/xxxx.pdf</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
