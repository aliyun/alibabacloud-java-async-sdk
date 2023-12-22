// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFileModerationResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFileModerationResultResponseBody</p>
 */
public class DescribeFileModerationResultResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
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
        @NameInMap("Confidence")
        private Float confidence;

        @NameInMap("Label")
        private String label;

        private LabelResult(Builder builder) {
            this.confidence = builder.confidence;
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

            public LabelResult build() {
                return new LabelResult(this);
            } 

        } 

    }
    public static class Location extends TeaModel {
        @NameInMap("H")
        private Integer h;

        @NameInMap("W")
        private Integer w;

        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
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
             * H.
             */
            public Builder h(Integer h) {
                this.h = h;
                return this;
            }

            /**
             * W.
             */
            public Builder w(Integer w) {
                this.w = w;
                return this;
            }

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
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
        @NameInMap("Description")
        private String description;

        @NameInMap("LabelResult")
        private java.util.List < LabelResult> labelResult;

        @NameInMap("Location")
        private Location location;

        @NameInMap("Service")
        private String service;

        private ImageResult(Builder builder) {
            this.description = builder.description;
            this.labelResult = builder.labelResult;
            this.location = builder.location;
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
         * @return service
         */
        public String getService() {
            return this.service;
        }

        public static final class Builder {
            private String description; 
            private java.util.List < LabelResult> labelResult; 
            private Location location; 
            private String service; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * LabelResult.
             */
            public Builder labelResult(java.util.List < LabelResult> labelResult) {
                this.labelResult = labelResult;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(Location location) {
                this.location = location;
                return this;
            }

            /**
             * Service.
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Labels")
        private String labels;

        @NameInMap("RiskTips")
        private String riskTips;

        @NameInMap("RiskWords")
        private String riskWords;

        @NameInMap("Service")
        private String service;

        @NameInMap("Text")
        private String text;

        @NameInMap("TextSegment")
        private String textSegment;

        private TextResult(Builder builder) {
            this.description = builder.description;
            this.labels = builder.labels;
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
            private String riskTips; 
            private String riskWords; 
            private String service; 
            private String text; 
            private String textSegment; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            /**
             * RiskTips.
             */
            public Builder riskTips(String riskTips) {
                this.riskTips = riskTips;
                return this;
            }

            /**
             * RiskWords.
             */
            public Builder riskWords(String riskWords) {
                this.riskWords = riskWords;
                return this;
            }

            /**
             * Service.
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * TextSegment.
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
        @NameInMap("ImageResult")
        private java.util.List < ImageResult> imageResult;

        @NameInMap("ImageUrl")
        private String imageUrl;

        @NameInMap("PageNum")
        private Integer pageNum;

        @NameInMap("TextResult")
        private java.util.List < TextResult> textResult;

        @NameInMap("TextUrl")
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
             * ImageResult.
             */
            public Builder imageResult(java.util.List < ImageResult> imageResult) {
                this.imageResult = imageResult;
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
             * PageNum.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * TextResult.
             */
            public Builder textResult(java.util.List < TextResult> textResult) {
                this.textResult = textResult;
                return this;
            }

            /**
             * TextUrl.
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
    public static class Data extends TeaModel {
        @NameInMap("DataId")
        private String dataId;

        @NameInMap("DocType")
        private String docType;

        @NameInMap("PageResult")
        private java.util.List < PageResult> pageResult;

        @NameInMap("Url")
        private String url;

        private Data(Builder builder) {
            this.dataId = builder.dataId;
            this.docType = builder.docType;
            this.pageResult = builder.pageResult;
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
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String dataId; 
            private String docType; 
            private java.util.List < PageResult> pageResult; 
            private String url; 

            /**
             * DataId.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * DocType.
             */
            public Builder docType(String docType) {
                this.docType = docType;
                return this;
            }

            /**
             * PageResult.
             */
            public Builder pageResult(java.util.List < PageResult> pageResult) {
                this.pageResult = pageResult;
                return this;
            }

            /**
             * Url.
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
