// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetScanResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetScanResultResponseBody</p>
 */
public class GetScanResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetScanResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScanResultResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String msg; 
        private String requestId; 
        private Boolean success; 

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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetScanResultResponseBody build() {
            return new GetScanResultResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Confidence")
        private String confidence;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        private Result(Builder builder) {
            this.confidence = builder.confidence;
            this.label = builder.label;
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
        public String getConfidence() {
            return this.confidence;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        public static final class Builder {
            private String confidence; 
            private String label; 

            /**
             * Confidence.
             */
            public Builder confidence(String confidence) {
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

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("DataId")
        private String dataId;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ExtFeedback")
        private String extFeedback;

        @com.aliyun.core.annotation.NameInMap("Extra")
        private java.util.Map < String, ? > extra;

        @com.aliyun.core.annotation.NameInMap("FrameCount")
        private Long frameCount;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("ImageLabels")
        private java.util.List < java.util.Map<String, ?>> imageLabels;

        @com.aliyun.core.annotation.NameInMap("ImageService")
        private String imageService;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private String labels;

        @com.aliyun.core.annotation.NameInMap("NoLabels")
        private java.util.List < String > noLabels;

        @com.aliyun.core.annotation.NameInMap("Offset")
        private Long offset;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Long pageNum;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("RequestTime")
        private String requestTime;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List < Result> result;

        @com.aliyun.core.annotation.NameInMap("RiskTips")
        private String riskTips;

        @com.aliyun.core.annotation.NameInMap("RiskWords")
        private String riskWords;

        @com.aliyun.core.annotation.NameInMap("ScanResult")
        private String scanResult;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Float score;

        @com.aliyun.core.annotation.NameInMap("ServiceCode")
        private String serviceCode;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TextLabels")
        private java.util.List < java.util.Map<String, ?>> textLabels;

        @com.aliyun.core.annotation.NameInMap("Thumbnail")
        private String thumbnail;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("VoiceLabels")
        private java.util.List < java.util.Map<String, ?>> voiceLabels;

        @com.aliyun.core.annotation.NameInMap("VoiceScanOpened")
        private Boolean voiceScanOpened;

        @com.aliyun.core.annotation.NameInMap("VoiceService")
        private String voiceService;

        private Items(Builder builder) {
            this.content = builder.content;
            this.dataId = builder.dataId;
            this.endTime = builder.endTime;
            this.extFeedback = builder.extFeedback;
            this.extra = builder.extra;
            this.frameCount = builder.frameCount;
            this.gmtCreate = builder.gmtCreate;
            this.imageLabels = builder.imageLabels;
            this.imageService = builder.imageService;
            this.imageUrl = builder.imageUrl;
            this.labels = builder.labels;
            this.noLabels = builder.noLabels;
            this.offset = builder.offset;
            this.pageNum = builder.pageNum;
            this.requestId = builder.requestId;
            this.requestTime = builder.requestTime;
            this.result = builder.result;
            this.riskTips = builder.riskTips;
            this.riskWords = builder.riskWords;
            this.scanResult = builder.scanResult;
            this.score = builder.score;
            this.serviceCode = builder.serviceCode;
            this.startTime = builder.startTime;
            this.suggestion = builder.suggestion;
            this.taskId = builder.taskId;
            this.textLabels = builder.textLabels;
            this.thumbnail = builder.thumbnail;
            this.timeStamp = builder.timeStamp;
            this.url = builder.url;
            this.voiceLabels = builder.voiceLabels;
            this.voiceScanOpened = builder.voiceScanOpened;
            this.voiceService = builder.voiceService;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return extFeedback
         */
        public String getExtFeedback() {
            return this.extFeedback;
        }

        /**
         * @return extra
         */
        public java.util.Map < String, ? > getExtra() {
            return this.extra;
        }

        /**
         * @return frameCount
         */
        public Long getFrameCount() {
            return this.frameCount;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return imageLabels
         */
        public java.util.List < java.util.Map<String, ?>> getImageLabels() {
            return this.imageLabels;
        }

        /**
         * @return imageService
         */
        public String getImageService() {
            return this.imageService;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return labels
         */
        public String getLabels() {
            return this.labels;
        }

        /**
         * @return noLabels
         */
        public java.util.List < String > getNoLabels() {
            return this.noLabels;
        }

        /**
         * @return offset
         */
        public Long getOffset() {
            return this.offset;
        }

        /**
         * @return pageNum
         */
        public Long getPageNum() {
            return this.pageNum;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return requestTime
         */
        public String getRequestTime() {
            return this.requestTime;
        }

        /**
         * @return result
         */
        public java.util.List < Result> getResult() {
            return this.result;
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
         * @return scanResult
         */
        public String getScanResult() {
            return this.scanResult;
        }

        /**
         * @return score
         */
        public Float getScore() {
            return this.score;
        }

        /**
         * @return serviceCode
         */
        public String getServiceCode() {
            return this.serviceCode;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return textLabels
         */
        public java.util.List < java.util.Map<String, ?>> getTextLabels() {
            return this.textLabels;
        }

        /**
         * @return thumbnail
         */
        public String getThumbnail() {
            return this.thumbnail;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return voiceLabels
         */
        public java.util.List < java.util.Map<String, ?>> getVoiceLabels() {
            return this.voiceLabels;
        }

        /**
         * @return voiceScanOpened
         */
        public Boolean getVoiceScanOpened() {
            return this.voiceScanOpened;
        }

        /**
         * @return voiceService
         */
        public String getVoiceService() {
            return this.voiceService;
        }

        public static final class Builder {
            private String content; 
            private String dataId; 
            private String endTime; 
            private String extFeedback; 
            private java.util.Map < String, ? > extra; 
            private Long frameCount; 
            private String gmtCreate; 
            private java.util.List < java.util.Map<String, ?>> imageLabels; 
            private String imageService; 
            private String imageUrl; 
            private String labels; 
            private java.util.List < String > noLabels; 
            private Long offset; 
            private Long pageNum; 
            private String requestId; 
            private String requestTime; 
            private java.util.List < Result> result; 
            private String riskTips; 
            private String riskWords; 
            private String scanResult; 
            private Float score; 
            private String serviceCode; 
            private String startTime; 
            private String suggestion; 
            private String taskId; 
            private java.util.List < java.util.Map<String, ?>> textLabels; 
            private String thumbnail; 
            private String timeStamp; 
            private String url; 
            private java.util.List < java.util.Map<String, ?>> voiceLabels; 
            private Boolean voiceScanOpened; 
            private String voiceService; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * dataId
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ExtFeedback.
             */
            public Builder extFeedback(String extFeedback) {
                this.extFeedback = extFeedback;
                return this;
            }

            /**
             * Extra.
             */
            public Builder extra(java.util.Map < String, ? > extra) {
                this.extra = extra;
                return this;
            }

            /**
             * FrameCount.
             */
            public Builder frameCount(Long frameCount) {
                this.frameCount = frameCount;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * ImageLabels.
             */
            public Builder imageLabels(java.util.List < java.util.Map<String, ?>> imageLabels) {
                this.imageLabels = imageLabels;
                return this;
            }

            /**
             * ImageService.
             */
            public Builder imageService(String imageService) {
                this.imageService = imageService;
                return this;
            }

            /**
             * url
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
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
             * NoLabels.
             */
            public Builder noLabels(java.util.List < String > noLabels) {
                this.noLabels = noLabels;
                return this;
            }

            /**
             * Offset.
             */
            public Builder offset(Long offset) {
                this.offset = offset;
                return this;
            }

            /**
             * PageNum.
             */
            public Builder pageNum(Long pageNum) {
                this.pageNum = pageNum;
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
             * RequestTime.
             */
            public Builder requestTime(String requestTime) {
                this.requestTime = requestTime;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
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
             * ScanResult.
             */
            public Builder scanResult(String scanResult) {
                this.scanResult = scanResult;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Float score) {
                this.score = score;
                return this;
            }

            /**
             * ServiceCode.
             */
            public Builder serviceCode(String serviceCode) {
                this.serviceCode = serviceCode;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Suggestion.
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
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
             * TextLabels.
             */
            public Builder textLabels(java.util.List < java.util.Map<String, ?>> textLabels) {
                this.textLabels = textLabels;
                return this;
            }

            /**
             * Thumbnail.
             */
            public Builder thumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * VoiceLabels.
             */
            public Builder voiceLabels(java.util.List < java.util.Map<String, ?>> voiceLabels) {
                this.voiceLabels = voiceLabels;
                return this;
            }

            /**
             * VoiceScanOpened.
             */
            public Builder voiceScanOpened(Boolean voiceScanOpened) {
                this.voiceScanOpened = voiceScanOpened;
                return this;
            }

            /**
             * VoiceService.
             */
            public Builder voiceService(String voiceService) {
                this.voiceService = voiceService;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List < Items> items;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.currentPage = builder.currentPage;
            this.items = builder.items;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return items
         */
        public java.util.List < Items> getItems() {
            return this.items;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private java.util.List < Items> items; 
            private Integer pageSize; 
            private Long totalCount; 

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * Items.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
