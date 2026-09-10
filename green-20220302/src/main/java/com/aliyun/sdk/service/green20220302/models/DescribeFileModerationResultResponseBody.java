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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeFileModerationResultResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The return code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
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

            private Builder() {
            } 

            private Builder(LabelResult model) {
                this.confidence = model.confidence;
                this.description = model.description;
                this.label = model.label;
            } 

            /**
             * <p>The risk score.</p>
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
             * <p>This is a title</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The label.</p>
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

            private Builder() {
            } 

            private Builder(Location model) {
                this.h = model.h;
                this.w = model.w;
                this.x = model.x;
                this.y = model.y;
            } 

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

            private Builder() {
            } 

            private Builder(ImageResult model) {
                this.description = model.description;
                this.labelResult = model.labelResult;
                this.location = model.location;
                this.riskLevel = model.riskLevel;
                this.service = model.service;
            } 

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a title</p>
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
             * <p>The location information.</p>
             */
            public Builder location(Location location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The risk level.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The invoked service.</p>
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
    public static class CustomizedHit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeyWords")
        private String keyWords;

        @com.aliyun.core.annotation.NameInMap("LibName")
        private String libName;

        private CustomizedHit(Builder builder) {
            this.keyWords = builder.keyWords;
            this.libName = builder.libName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomizedHit create() {
            return builder().build();
        }

        /**
         * @return keyWords
         */
        public String getKeyWords() {
            return this.keyWords;
        }

        /**
         * @return libName
         */
        public String getLibName() {
            return this.libName;
        }

        public static final class Builder {
            private String keyWords; 
            private String libName; 

            private Builder() {
            } 

            private Builder(CustomizedHit model) {
                this.keyWords = model.keyWords;
                this.libName = model.libName;
            } 

            /**
             * <p>The hit keyword.</p>
             * 
             * <strong>example:</strong>
             * <p>Popular among everyone</p>
             */
            public Builder keyWords(String keyWords) {
                this.keyWords = keyWords;
                return this;
            }

            /**
             * <p>The vocabulary name.</p>
             * 
             * <strong>example:</strong>
             * <p>TestVocabulary22</p>
             */
            public Builder libName(String libName) {
                this.libName = libName;
                return this;
            }

            public CustomizedHit build() {
                return new CustomizedHit(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFileModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileModerationResultResponseBody</p>
     */
    public static class RiskPositions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndPos")
        private Long endPos;

        @com.aliyun.core.annotation.NameInMap("RiskWord")
        private String riskWord;

        @com.aliyun.core.annotation.NameInMap("StartPos")
        private Long startPos;

        private RiskPositions(Builder builder) {
            this.endPos = builder.endPos;
            this.riskWord = builder.riskWord;
            this.startPos = builder.startPos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskPositions create() {
            return builder().build();
        }

        /**
         * @return endPos
         */
        public Long getEndPos() {
            return this.endPos;
        }

        /**
         * @return riskWord
         */
        public String getRiskWord() {
            return this.riskWord;
        }

        /**
         * @return startPos
         */
        public Long getStartPos() {
            return this.startPos;
        }

        public static final class Builder {
            private Long endPos; 
            private String riskWord; 
            private Long startPos; 

            private Builder() {
            } 

            private Builder(RiskPositions model) {
                this.endPos = model.endPos;
                this.riskWord = model.riskWord;
                this.startPos = model.startPos;
            } 

            /**
             * <p>The end position.</p>
             * 
             * <strong>example:</strong>
             * <p>21</p>
             */
            public Builder endPos(Long endPos) {
                this.endPos = endPos;
                return this;
            }

            /**
             * <p>The violation word.</p>
             * 
             * <strong>example:</strong>
             * <p>Visit pornographic website</p>
             */
            public Builder riskWord(String riskWord) {
                this.riskWord = riskWord;
                return this;
            }

            /**
             * <p>The start position.</p>
             * 
             * <strong>example:</strong>
             * <p>17</p>
             */
            public Builder startPos(Long startPos) {
                this.startPos = startPos;
                return this;
            }

            public RiskPositions build() {
                return new RiskPositions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFileModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileModerationResultResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Confidence")
        private Float confidence;

        @com.aliyun.core.annotation.NameInMap("CustomizedHit")
        private java.util.List<CustomizedHit> customizedHit;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("RiskPositions")
        private java.util.List<RiskPositions> riskPositions;

        @com.aliyun.core.annotation.NameInMap("RiskWords")
        private String riskWords;

        private Result(Builder builder) {
            this.confidence = builder.confidence;
            this.customizedHit = builder.customizedHit;
            this.description = builder.description;
            this.label = builder.label;
            this.riskLevel = builder.riskLevel;
            this.riskPositions = builder.riskPositions;
            this.riskWords = builder.riskWords;
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
         * @return customizedHit
         */
        public java.util.List<CustomizedHit> getCustomizedHit() {
            return this.customizedHit;
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
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return riskPositions
         */
        public java.util.List<RiskPositions> getRiskPositions() {
            return this.riskPositions;
        }

        /**
         * @return riskWords
         */
        public String getRiskWords() {
            return this.riskWords;
        }

        public static final class Builder {
            private Float confidence; 
            private java.util.List<CustomizedHit> customizedHit; 
            private String description; 
            private String label; 
            private String riskLevel; 
            private java.util.List<RiskPositions> riskPositions; 
            private String riskWords; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.confidence = model.confidence;
                this.customizedHit = model.customizedHit;
                this.description = model.description;
                this.label = model.label;
                this.riskLevel = model.riskLevel;
                this.riskPositions = model.riskPositions;
                this.riskWords = model.riskWords;
            } 

            /**
             * <p>The label confidence score.</p>
             * 
             * <strong>example:</strong>
             * <p>90.50</p>
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>The custom vocabulary hit results.</p>
             */
            public Builder customizedHit(java.util.List<CustomizedHit> customizedHit) {
                this.customizedHit = customizedHit;
                return this;
            }

            /**
             * <p>The description corresponding to the label.</p>
             * 
             * <strong>example:</strong>
             * <p>Pornography</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The text label in page results.</p>
             * 
             * <strong>example:</strong>
             * <p>Political sensitivity</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The risk level.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The positions of the violation words.</p>
             */
            public Builder riskPositions(java.util.List<RiskPositions> riskPositions) {
                this.riskPositions = riskPositions;
                return this;
            }

            /**
             * <p>The hit violation words.</p>
             * 
             * <strong>example:</strong>
             * <p>Popular among everyone</p>
             */
            public Builder riskWords(String riskWords) {
                this.riskWords = riskWords;
                return this;
            }

            public Result build() {
                return new Result(this);
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

        @com.aliyun.core.annotation.NameInMap("Descriptions")
        private String descriptions;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private String labels;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<Result> result;

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
            this.descriptions = builder.descriptions;
            this.labels = builder.labels;
            this.result = builder.result;
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
         * @return descriptions
         */
        public String getDescriptions() {
            return this.descriptions;
        }

        /**
         * @return labels
         */
        public String getLabels() {
            return this.labels;
        }

        /**
         * @return result
         */
        public java.util.List<Result> getResult() {
            return this.result;
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
            private String descriptions; 
            private String labels; 
            private java.util.List<Result> result; 
            private String riskLevel; 
            private String riskTips; 
            private String riskWords; 
            private String service; 
            private String text; 
            private String textSegment; 

            private Builder() {
            } 

            private Builder(TextResult model) {
                this.description = model.description;
                this.descriptions = model.descriptions;
                this.labels = model.labels;
                this.result = model.result;
                this.riskLevel = model.riskLevel;
                this.riskTips = model.riskTips;
                this.riskWords = model.riskWords;
                this.service = model.service;
                this.text = model.text;
                this.textSegment = model.textSegment;
            } 

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a title</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The label descriptions.</p>
             * 
             * <strong>example:</strong>
             * <p>Suspected advertising content</p>
             */
            public Builder descriptions(String descriptions) {
                this.descriptions = descriptions;
                return this;
            }

            /**
             * <p>The label values.</p>
             * 
             * <strong>example:</strong>
             * <p>porn</p>
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The text plus version result.</p>
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The risk level.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The hit risk details.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder riskTips(String riskTips) {
                this.riskTips = riskTips;
                return this;
            }

            /**
             * <p>The hit risk keywords.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder riskWords(String riskWords) {
                this.riskWords = riskWords;
                return this;
            }

            /**
             * <p>The service.</p>
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
             * <p>blah blah</p>
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

            private Builder() {
            } 

            private Builder(PageResult model) {
                this.imageResult = model.imageResult;
                this.imageUrl = model.imageUrl;
                this.pageNum = model.pageNum;
                this.textResult = model.textResult;
                this.textUrl = model.textUrl;
            } 

            /**
             * <p>The image detection results.</p>
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
             * <p>The URL where the text content is stored.</p>
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

            private Builder() {
            } 

            private Builder(ImageLabels model) {
                this.description = model.description;
                this.label = model.label;
                this.labelSum = model.labelSum;
            } 

            /**
             * <p>The label description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The label.</p>
             * 
             * <strong>example:</strong>
             * <p>contraband</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The number of times the label appears.</p>
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

            private Builder() {
            } 

            private Builder(ImageSummary model) {
                this.imageLabels = model.imageLabels;
                this.riskLevel = model.riskLevel;
            } 

            /**
             * <p>The image labels.</p>
             */
            public Builder imageLabels(java.util.List<ImageLabels> imageLabels) {
                this.imageLabels = imageLabels;
                return this;
            }

            /**
             * <p>The risk level.</p>
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
    public static class AIGC extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContentProducer")
        private String contentProducer;

        @com.aliyun.core.annotation.NameInMap("ContentPropagator")
        private String contentPropagator;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("ProduceID")
        private String produceID;

        @com.aliyun.core.annotation.NameInMap("PropagateID")
        private String propagateID;

        @com.aliyun.core.annotation.NameInMap("ReservedCode1")
        private String reservedCode1;

        @com.aliyun.core.annotation.NameInMap("ReservedCode2")
        private String reservedCode2;

        private AIGC(Builder builder) {
            this.contentProducer = builder.contentProducer;
            this.contentPropagator = builder.contentPropagator;
            this.label = builder.label;
            this.produceID = builder.produceID;
            this.propagateID = builder.propagateID;
            this.reservedCode1 = builder.reservedCode1;
            this.reservedCode2 = builder.reservedCode2;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AIGC create() {
            return builder().build();
        }

        /**
         * @return contentProducer
         */
        public String getContentProducer() {
            return this.contentProducer;
        }

        /**
         * @return contentPropagator
         */
        public String getContentPropagator() {
            return this.contentPropagator;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return produceID
         */
        public String getProduceID() {
            return this.produceID;
        }

        /**
         * @return propagateID
         */
        public String getPropagateID() {
            return this.propagateID;
        }

        /**
         * @return reservedCode1
         */
        public String getReservedCode1() {
            return this.reservedCode1;
        }

        /**
         * @return reservedCode2
         */
        public String getReservedCode2() {
            return this.reservedCode2;
        }

        public static final class Builder {
            private String contentProducer; 
            private String contentPropagator; 
            private String label; 
            private String produceID; 
            private String propagateID; 
            private String reservedCode1; 
            private String reservedCode2; 

            private Builder() {
            } 

            private Builder(AIGC model) {
                this.contentProducer = model.contentProducer;
                this.contentPropagator = model.contentPropagator;
                this.label = model.label;
                this.produceID = model.produceID;
                this.propagateID = model.propagateID;
                this.reservedCode1 = model.reservedCode1;
                this.reservedCode2 = model.reservedCode2;
            } 

            /**
             * <p>The content producer code.</p>
             * 
             * <strong>example:</strong>
             * <p>00119144030008867405X210001</p>
             */
            public Builder contentProducer(String contentProducer) {
                this.contentProducer = contentProducer;
                return this;
            }

            /**
             * <p>The content propagator code.</p>
             * 
             * <strong>example:</strong>
             * <p>00119144030008867405X220001</p>
             */
            public Builder contentPropagator(String contentPropagator) {
                this.contentPropagator = contentPropagator;
                return this;
            }

            /**
             * <p>The content attribute declared by the implicit label.</p>
             * 
             * <strong>example:</strong>
             * <p>AI-generated or synthetic content</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The content production ID.</p>
             * 
             * <strong>example:</strong>
             * <p>tos-cn-i-tb4s082cfz/ad88d9b125694f57b2c72235e5c42af1</p>
             */
            public Builder produceID(String produceID) {
                this.produceID = produceID;
                return this;
            }

            /**
             * <p>The content propagation ID.</p>
             * 
             * <strong>example:</strong>
             * <p>tos-cn-i-tb4s082cfz/ad88d9b125694f57b2c72235e5c42af1</p>
             */
            public Builder propagateID(String propagateID) {
                this.propagateID = propagateID;
                return this;
            }

            /**
             * <p>Reserved field 1.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder reservedCode1(String reservedCode1) {
                this.reservedCode1 = reservedCode1;
                return this;
            }

            /**
             * <p>Reserved field 2.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder reservedCode2(String reservedCode2) {
                this.reservedCode2 = reservedCode2;
                return this;
            }

            public AIGC build() {
                return new AIGC(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFileModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileModerationResultResponseBody</p>
     */
    public static class AigcData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AIGC")
        private AIGC AIGC;

        @com.aliyun.core.annotation.NameInMap("Explain")
        private String explain;

        private AigcData(Builder builder) {
            this.AIGC = builder.AIGC;
            this.explain = builder.explain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AigcData create() {
            return builder().build();
        }

        /**
         * @return AIGC
         */
        public AIGC getAIGC() {
            return this.AIGC;
        }

        /**
         * @return explain
         */
        public String getExplain() {
            return this.explain;
        }

        public static final class Builder {
            private AIGC AIGC; 
            private String explain; 

            private Builder() {
            } 

            private Builder(AigcData model) {
                this.AIGC = model.AIGC;
                this.explain = model.explain;
            } 

            /**
             * <p>The implicit label information of AI-generated or synthetic content.</p>
             */
            public Builder AIGC(AIGC AIGC) {
                this.AIGC = AIGC;
                return this;
            }

            /**
             * <p>The comprehensive analysis report for forgery detection by the large language model.</p>
             * 
             * <strong>example:</strong>
             * <h3>Comprehensive Report for Users</h3>
             * <h4>Quick Image Overview</h4>
             * <ul>
             * <li><strong>Image Subject</strong>: A scanned document titled &quot;Letter of Authorization&quot;, containing the names of the authorizing and authorized companies and red official seals</li>
             * </ul>
             */
            public Builder explain(String explain) {
                this.explain = explain;
                return this;
            }

            public AigcData build() {
                return new AigcData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFileModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileModerationResultResponseBody</p>
     */
    public static class Ext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AigcData")
        private AigcData aigcData;

        private Ext(Builder builder) {
            this.aigcData = builder.aigcData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ext create() {
            return builder().build();
        }

        /**
         * @return aigcData
         */
        public AigcData getAigcData() {
            return this.aigcData;
        }

        public static final class Builder {
            private AigcData aigcData; 

            private Builder() {
            } 

            private Builder(Ext model) {
                this.aigcData = model.aigcData;
            } 

            /**
             * <p>The details of AI-generated or synthetic content detection.</p>
             */
            public Builder aigcData(AigcData aigcData) {
                this.aigcData = aigcData;
                return this;
            }

            public Ext build() {
                return new Ext(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFileModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileModerationResultResponseBody</p>
     */
    public static class RiskLabels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Confidence")
        private Float confidence;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        private RiskLabels(Builder builder) {
            this.confidence = builder.confidence;
            this.description = builder.description;
            this.label = builder.label;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskLabels create() {
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

            private Builder() {
            } 

            private Builder(RiskLabels model) {
                this.confidence = model.confidence;
                this.description = model.description;
                this.label = model.label;
            } 

            /**
             * <p>The confidence score of the label.</p>
             * 
             * <strong>example:</strong>
             * <p>95.96</p>
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>The description of the risk label in Chinese.</p>
             * 
             * <strong>example:</strong>
             * <p>疑似AI生成合成内容</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The risk label.</p>
             * 
             * <strong>example:</strong>
             * <p>tamper_aigc</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            public RiskLabels build() {
                return new RiskLabels(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFileModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileModerationResultResponseBody</p>
     */
    public static class RiskSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ext")
        private Ext ext;

        @com.aliyun.core.annotation.NameInMap("RiskLabels")
        private java.util.List<RiskLabels> riskLabels;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        private RiskSummary(Builder builder) {
            this.ext = builder.ext;
            this.riskLabels = builder.riskLabels;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskSummary create() {
            return builder().build();
        }

        /**
         * @return ext
         */
        public Ext getExt() {
            return this.ext;
        }

        /**
         * @return riskLabels
         */
        public java.util.List<RiskLabels> getRiskLabels() {
            return this.riskLabels;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private Ext ext; 
            private java.util.List<RiskLabels> riskLabels; 
            private String riskLevel; 

            private Builder() {
            } 

            private Builder(RiskSummary model) {
                this.ext = model.ext;
                this.riskLabels = model.riskLabels;
                this.riskLevel = model.riskLevel;
            } 

            /**
             * <p>The extended information.</p>
             */
            public Builder ext(Ext ext) {
                this.ext = ext;
                return this;
            }

            /**
             * <p>The list of matched forgery detection risk labels.</p>
             */
            public Builder riskLabels(java.util.List<RiskLabels> riskLabels) {
                this.riskLabels = riskLabels;
                return this;
            }

            /**
             * <p>The overall risk level of the document, which is the highest level among all matched labels.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public RiskSummary build() {
                return new RiskSummary(this);
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
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("LabelSum")
        private Integer labelSum;

        private TextLabels(Builder builder) {
            this.description = builder.description;
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

            private Builder() {
            } 

            private Builder(TextLabels model) {
                this.description = model.description;
                this.label = model.label;
                this.labelSum = model.labelSum;
            } 

            /**
             * <p>The label descriptions.</p>
             * 
             * <strong>example:</strong>
             * <p>No risk detected</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The label.</p>
             * 
             * <strong>example:</strong>
             * <p>contraband</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The number of times the label appears.</p>
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

            private Builder() {
            } 

            private Builder(TextSummary model) {
                this.riskLevel = model.riskLevel;
                this.textLabels = model.textLabels;
            } 

            /**
             * <p>The risk level.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The text labels.</p>
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

        @com.aliyun.core.annotation.NameInMap("RiskSummary")
        private RiskSummary riskSummary;

        @com.aliyun.core.annotation.NameInMap("TextSummary")
        private TextSummary textSummary;

        private PageSummary(Builder builder) {
            this.imageSummary = builder.imageSummary;
            this.pageSum = builder.pageSum;
            this.riskSummary = builder.riskSummary;
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
         * @return riskSummary
         */
        public RiskSummary getRiskSummary() {
            return this.riskSummary;
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
            private RiskSummary riskSummary; 
            private TextSummary textSummary; 

            private Builder() {
            } 

            private Builder(PageSummary model) {
                this.imageSummary = model.imageSummary;
                this.pageSum = model.pageSum;
                this.riskSummary = model.riskSummary;
                this.textSummary = model.textSummary;
            } 

            /**
             * <p>The image summary information.</p>
             */
            public Builder imageSummary(ImageSummary imageSummary) {
                this.imageSummary = imageSummary;
                return this;
            }

            /**
             * <p>The total number of pages.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageSum(Integer pageSum) {
                this.pageSum = pageSum;
                return this;
            }

            /**
             * <p>The document forgery detection risk summary.</p>
             */
            public Builder riskSummary(RiskSummary riskSummary) {
                this.riskSummary = riskSummary;
                return this;
            }

            /**
             * <p>The text summary information.</p>
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
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

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
            this.accountId = builder.accountId;
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
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
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
            private String accountId; 
            private String dataId; 
            private String docType; 
            private java.util.List<PageResult> pageResult; 
            private PageSummary pageSummary; 
            private String riskLevel; 
            private String url; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountId = model.accountId;
                this.dataId = model.dataId;
                this.docType = model.docType;
                this.pageResult = model.pageResult;
                this.pageSummary = model.pageSummary;
                this.riskLevel = model.riskLevel;
                this.url = model.url;
            } 

            /**
             * <p>The AccountId specified by the caller.</p>
             * 
             * <strong>example:</strong>
             * <p>accountIdtest123</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The data ID.</p>
             * 
             * <strong>example:</strong>
             * <p>26769ada6e264e7ba9aa048241e12be9</p>
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * <p>The document type. This parameter is optional.</p>
             * 
             * <strong>example:</strong>
             * <p>doc</p>
             */
            public Builder docType(String docType) {
                this.docType = docType;
                return this;
            }

            /**
             * <p>The list of detection results.</p>
             */
            public Builder pageResult(java.util.List<PageResult> pageResult) {
                this.pageResult = pageResult;
                return this;
            }

            /**
             * <p>The summary information.</p>
             */
            public Builder pageSummary(PageSummary pageSummary) {
                this.pageSummary = pageSummary;
                return this;
            }

            /**
             * <p>The risk level.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The URL for downloading the file.</p>
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
