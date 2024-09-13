// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The returned HTTP status code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The message that is returned in response to the request.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeFileModerationResultResponseBody build() {
            return new DescribeFileModerationResultResponseBody(this);
        } 

    } 

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
             * Confidence score, 0 to 100, reserved to 2 decimal places.
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The details of the labels.
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
             * The H value of the coordinate point.
             */
            public Builder h(Integer h) {
                this.h = h;
                return this;
            }

            /**
             * The W value of the coordinate point.
             */
            public Builder w(Integer w) {
                this.w = w;
                return this;
            }

            /**
             * The X value of the coordinate point.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * The Y value of the coordinate point.
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
    public static class ImageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("LabelResult")
        private java.util.List < LabelResult> labelResult;

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
        public java.util.List < LabelResult> getLabelResult() {
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
            private java.util.List < LabelResult> labelResult; 
            private Location location; 
            private String riskLevel; 
            private String service; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Label information.
             */
            public Builder labelResult(java.util.List < LabelResult> labelResult) {
                this.labelResult = labelResult;
                return this;
            }

            /**
             * Location information.
             */
            public Builder location(Location location) {
                this.location = location;
                return this;
            }

            /**
             * RiskLevel.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * The moderation service.
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
             * Description
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The details of the labels.
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            /**
             * RiskLevel.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * The risk details that are hit.
             */
            public Builder riskTips(String riskTips) {
                this.riskTips = riskTips;
                return this;
            }

            /**
             * The risk words that are hit.
             */
            public Builder riskWords(String riskWords) {
                this.riskWords = riskWords;
                return this;
            }

            /**
             * The moderation service.
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            /**
             * Text content.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * Text segmentation information.
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
    public static class PageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageResult")
        private java.util.List < ImageResult> imageResult;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("TextResult")
        private java.util.List < TextResult> textResult;

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
        public java.util.List < ImageResult> getImageResult() {
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
        public java.util.List < TextResult> getTextResult() {
            return this.textResult;
        }

        /**
         * @return textUrl
         */
        public String getTextUrl() {
            return this.textUrl;
        }

        public static final class Builder {
            private java.util.List < ImageResult> imageResult; 
            private String imageUrl; 
            private Integer pageNum; 
            private java.util.List < TextResult> textResult; 
            private String textUrl; 

            /**
             * Image detection results.
             */
            public Builder imageResult(java.util.List < ImageResult> imageResult) {
                this.imageResult = imageResult;
                return this;
            }

            /**
             * The image url.
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * The page number.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * Text detection results.
             */
            public Builder textResult(java.util.List < TextResult> textResult) {
                this.textResult = textResult;
                return this;
            }

            /**
             * the text url.
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
             * Description
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The details of the labels.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * LabelSum.
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
    public static class ImageSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageLabels")
        private java.util.List < ImageLabels> imageLabels;

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
        public java.util.List < ImageLabels> getImageLabels() {
            return this.imageLabels;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private java.util.List < ImageLabels> imageLabels; 
            private String riskLevel; 

            /**
             * ImageLabels.
             */
            public Builder imageLabels(java.util.List < ImageLabels> imageLabels) {
                this.imageLabels = imageLabels;
                return this;
            }

            /**
             * RiskLevel.
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
             * The details of the labels.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * LabelSum.
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
    public static class TextSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("TextLabels")
        private java.util.List < TextLabels> textLabels;

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
        public java.util.List < TextLabels> getTextLabels() {
            return this.textLabels;
        }

        public static final class Builder {
            private String riskLevel; 
            private java.util.List < TextLabels> textLabels; 

            /**
             * RiskLevel.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * TextLabels.
             */
            public Builder textLabels(java.util.List < TextLabels> textLabels) {
                this.textLabels = textLabels;
                return this;
            }

            public TextSummary build() {
                return new TextSummary(this);
            } 

        } 

    }
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
             * ImageSummary.
             */
            public Builder imageSummary(ImageSummary imageSummary) {
                this.imageSummary = imageSummary;
                return this;
            }

            /**
             * PageSum.
             */
            public Builder pageSum(Integer pageSum) {
                this.pageSum = pageSum;
                return this;
            }

            /**
             * TextSummary.
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
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataId")
        private String dataId;

        @com.aliyun.core.annotation.NameInMap("DocType")
        private String docType;

        @com.aliyun.core.annotation.NameInMap("PageResult")
        private java.util.List < PageResult> pageResult;

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
        public java.util.List < PageResult> getPageResult() {
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
            private java.util.List < PageResult> pageResult; 
            private PageSummary pageSummary; 
            private String riskLevel; 
            private String url; 

            /**
             * The ID of the moderated object.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * Optional, document type.
             */
            public Builder docType(String docType) {
                this.docType = docType;
                return this;
            }

            /**
             * The pagination information.
             */
            public Builder pageResult(java.util.List < PageResult> pageResult) {
                this.pageResult = pageResult;
                return this;
            }

            /**
             * PageSummary.
             */
            public Builder pageSummary(PageSummary pageSummary) {
                this.pageSummary = pageSummary;
                return this;
            }

            /**
             * RiskLevel.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * The URL of the moderation object.
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
