// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link GetDatasetDocumentResponseBody} extends {@link TeaModel}
 *
 * <p>GetDatasetDocumentResponseBody</p>
 */
public class GetDatasetDocumentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDatasetDocumentResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDatasetDocumentResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetDatasetDocumentResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public GetDatasetDocumentResponseBody build() {
            return new GetDatasetDocumentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDatasetDocumentResponseBody} extends {@link TeaModel}
     *
     * <p>GetDatasetDocumentResponseBody</p>
     */
    public static class AsrSentences extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private AsrSentences(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AsrSentences create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private Long endTime; 
            private Long startTime; 
            private String text; 

            private Builder() {
            } 

            private Builder(AsrSentences model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
                this.text = model.text;
            } 

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public AsrSentences build() {
                return new AsrSentences(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDatasetDocumentResponseBody} extends {@link TeaModel}
     *
     * <p>GetDatasetDocumentResponseBody</p>
     */
    public static class KeyValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private KeyValues(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeyValues create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(KeyValues model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public KeyValues build() {
                return new KeyValues(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDatasetDocumentResponseBody} extends {@link TeaModel}
     *
     * <p>GetDatasetDocumentResponseBody</p>
     */
    public static class VideoShots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private VideoShots(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoShots create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private Long endTime; 
            private Long startTime; 
            private String text; 

            private Builder() {
            } 

            private Builder(VideoShots model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
                this.text = model.text;
            } 

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public VideoShots build() {
                return new VideoShots(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDatasetDocumentResponseBody} extends {@link TeaModel}
     *
     * <p>GetDatasetDocumentResponseBody</p>
     */
    public static class Metadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsrSentences")
        private java.util.List<AsrSentences> asrSentences;

        @com.aliyun.core.annotation.NameInMap("KeyValues")
        private java.util.List<KeyValues> keyValues;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("VideoShots")
        private java.util.List<VideoShots> videoShots;

        private Metadata(Builder builder) {
            this.asrSentences = builder.asrSentences;
            this.keyValues = builder.keyValues;
            this.text = builder.text;
            this.videoShots = builder.videoShots;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metadata create() {
            return builder().build();
        }

        /**
         * @return asrSentences
         */
        public java.util.List<AsrSentences> getAsrSentences() {
            return this.asrSentences;
        }

        /**
         * @return keyValues
         */
        public java.util.List<KeyValues> getKeyValues() {
            return this.keyValues;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return videoShots
         */
        public java.util.List<VideoShots> getVideoShots() {
            return this.videoShots;
        }

        public static final class Builder {
            private java.util.List<AsrSentences> asrSentences; 
            private java.util.List<KeyValues> keyValues; 
            private String text; 
            private java.util.List<VideoShots> videoShots; 

            private Builder() {
            } 

            private Builder(Metadata model) {
                this.asrSentences = model.asrSentences;
                this.keyValues = model.keyValues;
                this.text = model.text;
                this.videoShots = model.videoShots;
            } 

            /**
             * AsrSentences.
             */
            public Builder asrSentences(java.util.List<AsrSentences> asrSentences) {
                this.asrSentences = asrSentences;
                return this;
            }

            /**
             * KeyValues.
             */
            public Builder keyValues(java.util.List<KeyValues> keyValues) {
                this.keyValues = keyValues;
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
             * VideoShots.
             */
            public Builder videoShots(java.util.List<VideoShots> videoShots) {
                this.videoShots = videoShots;
                return this;
            }

            public Metadata build() {
                return new Metadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDatasetDocumentResponseBody} extends {@link TeaModel}
     *
     * <p>GetDatasetDocumentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryUuid")
        private String categoryUuid;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("DisableHandleMultimodalMedia")
        private Boolean disableHandleMultimodalMedia;

        @com.aliyun.core.annotation.NameInMap("DocId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("DocType")
        private String docType;

        @com.aliyun.core.annotation.NameInMap("DocUuid")
        private String docUuid;

        @com.aliyun.core.annotation.NameInMap("Extend1")
        private String extend1;

        @com.aliyun.core.annotation.NameInMap("Extend2")
        private String extend2;

        @com.aliyun.core.annotation.NameInMap("Extend3")
        private String extend3;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private Metadata metadata;

        @com.aliyun.core.annotation.NameInMap("PubTime")
        private String pubTime;

        @com.aliyun.core.annotation.NameInMap("SourceFrom")
        private String sourceFrom;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<String> tags;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Data(Builder builder) {
            this.categoryUuid = builder.categoryUuid;
            this.content = builder.content;
            this.disableHandleMultimodalMedia = builder.disableHandleMultimodalMedia;
            this.docId = builder.docId;
            this.docType = builder.docType;
            this.docUuid = builder.docUuid;
            this.extend1 = builder.extend1;
            this.extend2 = builder.extend2;
            this.extend3 = builder.extend3;
            this.metadata = builder.metadata;
            this.pubTime = builder.pubTime;
            this.sourceFrom = builder.sourceFrom;
            this.status = builder.status;
            this.summary = builder.summary;
            this.tags = builder.tags;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return categoryUuid
         */
        public String getCategoryUuid() {
            return this.categoryUuid;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return disableHandleMultimodalMedia
         */
        public Boolean getDisableHandleMultimodalMedia() {
            return this.disableHandleMultimodalMedia;
        }

        /**
         * @return docId
         */
        public String getDocId() {
            return this.docId;
        }

        /**
         * @return docType
         */
        public String getDocType() {
            return this.docType;
        }

        /**
         * @return docUuid
         */
        public String getDocUuid() {
            return this.docUuid;
        }

        /**
         * @return extend1
         */
        public String getExtend1() {
            return this.extend1;
        }

        /**
         * @return extend2
         */
        public String getExtend2() {
            return this.extend2;
        }

        /**
         * @return extend3
         */
        public String getExtend3() {
            return this.extend3;
        }

        /**
         * @return metadata
         */
        public Metadata getMetadata() {
            return this.metadata;
        }

        /**
         * @return pubTime
         */
        public String getPubTime() {
            return this.pubTime;
        }

        /**
         * @return sourceFrom
         */
        public String getSourceFrom() {
            return this.sourceFrom;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return tags
         */
        public java.util.List<String> getTags() {
            return this.tags;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String categoryUuid; 
            private String content; 
            private Boolean disableHandleMultimodalMedia; 
            private String docId; 
            private String docType; 
            private String docUuid; 
            private String extend1; 
            private String extend2; 
            private String extend3; 
            private Metadata metadata; 
            private String pubTime; 
            private String sourceFrom; 
            private Integer status; 
            private String summary; 
            private java.util.List<String> tags; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.categoryUuid = model.categoryUuid;
                this.content = model.content;
                this.disableHandleMultimodalMedia = model.disableHandleMultimodalMedia;
                this.docId = model.docId;
                this.docType = model.docType;
                this.docUuid = model.docUuid;
                this.extend1 = model.extend1;
                this.extend2 = model.extend2;
                this.extend3 = model.extend3;
                this.metadata = model.metadata;
                this.pubTime = model.pubTime;
                this.sourceFrom = model.sourceFrom;
                this.status = model.status;
                this.summary = model.summary;
                this.tags = model.tags;
                this.title = model.title;
                this.url = model.url;
            } 

            /**
             * CategoryUuid.
             */
            public Builder categoryUuid(String categoryUuid) {
                this.categoryUuid = categoryUuid;
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
             * DisableHandleMultimodalMedia.
             */
            public Builder disableHandleMultimodalMedia(Boolean disableHandleMultimodalMedia) {
                this.disableHandleMultimodalMedia = disableHandleMultimodalMedia;
                return this;
            }

            /**
             * DocId.
             */
            public Builder docId(String docId) {
                this.docId = docId;
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
             * DocUuid.
             */
            public Builder docUuid(String docUuid) {
                this.docUuid = docUuid;
                return this;
            }

            /**
             * Extend1.
             */
            public Builder extend1(String extend1) {
                this.extend1 = extend1;
                return this;
            }

            /**
             * Extend2.
             */
            public Builder extend2(String extend2) {
                this.extend2 = extend2;
                return this;
            }

            /**
             * Extend3.
             */
            public Builder extend3(String extend3) {
                this.extend3 = extend3;
                return this;
            }

            /**
             * Metadata.
             */
            public Builder metadata(Metadata metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * PubTime.
             */
            public Builder pubTime(String pubTime) {
                this.pubTime = pubTime;
                return this;
            }

            /**
             * SourceFrom.
             */
            public Builder sourceFrom(String sourceFrom) {
                this.sourceFrom = sourceFrom;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<String> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
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
