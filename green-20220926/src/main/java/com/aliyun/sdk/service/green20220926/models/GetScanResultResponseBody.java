// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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

        private Builder() {
        } 

        private Builder(GetScanResultResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.msg = model.msg;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Error code, consistent with HTTP status.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Further description of the error code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * <p>ID assigned by the backend to uniquely identify a request. Can be used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Success indicator</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetScanResultResponseBody build() {
            return new GetScanResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetScanResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetScanResultResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Confidence")
        private String confidence;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        private Result(Builder builder) {
            this.confidence = builder.confidence;
            this.description = builder.description;
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
            private String confidence; 
            private String description; 
            private String label; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.confidence = model.confidence;
                this.description = model.description;
                this.label = model.label;
            } 

            /**
             * <p>Confidence score, ranging from 0 to 100, with two decimal places.</p>
             * 
             * <strong>example:</strong>
             * <p>50.0</p>
             */
            public Builder confidence(String confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>Description of the Label field.</p>
             * 
             * <strong>example:</strong>
             * <p>疑似色情内容</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Label.</p>
             * 
             * <strong>example:</strong>
             * <p>politics</p>
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
    /**
     * 
     * {@link GetScanResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetScanResultResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("ApiLabels")
        private String apiLabels;

        @com.aliyun.core.annotation.NameInMap("ApiRequestTime")
        private String apiRequestTime;

        @com.aliyun.core.annotation.NameInMap("ApiRiskLevel")
        private String apiRiskLevel;

        @com.aliyun.core.annotation.NameInMap("ApiService")
        private String apiService;

        @com.aliyun.core.annotation.NameInMap("ApiTaskId")
        private String apiTaskId;

        @com.aliyun.core.annotation.NameInMap("AttackLevel")
        private String attackLevel;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("DataId")
        private String dataId;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ExtFeedback")
        private String extFeedback;

        @com.aliyun.core.annotation.NameInMap("Extra")
        private java.util.Map<String, ?> extra;

        @com.aliyun.core.annotation.NameInMap("FrameCount")
        private Long frameCount;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GuardFileUrls")
        private java.util.List<String> guardFileUrls;

        @com.aliyun.core.annotation.NameInMap("GuardImageUrls")
        private java.util.List<String> guardImageUrls;

        @com.aliyun.core.annotation.NameInMap("ImageLabels")
        private java.util.List<java.util.Map<String, ?>> imageLabels;

        @com.aliyun.core.annotation.NameInMap("ImageService")
        private String imageService;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private String labels;

        @com.aliyun.core.annotation.NameInMap("LiveId")
        private String liveId;

        @com.aliyun.core.annotation.NameInMap("MaliciousFileLevel")
        private String maliciousFileLevel;

        @com.aliyun.core.annotation.NameInMap("MaliciousUrlLevel")
        private String maliciousUrlLevel;

        @com.aliyun.core.annotation.NameInMap("ManualOnly")
        private Boolean manualOnly;

        @com.aliyun.core.annotation.NameInMap("NoLabels")
        private java.util.List<String> noLabels;

        @com.aliyun.core.annotation.NameInMap("Offset")
        private Long offset;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Long pageNum;

        @com.aliyun.core.annotation.NameInMap("RequestFrom")
        private String requestFrom;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("RequestTime")
        private String requestTime;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<Result> result;

        @com.aliyun.core.annotation.NameInMap("ReviewLabels")
        private String reviewLabels;

        @com.aliyun.core.annotation.NameInMap("ReviewRiskLevel")
        private String reviewRiskLevel;

        @com.aliyun.core.annotation.NameInMap("ReviewTime")
        private String reviewTime;

        @com.aliyun.core.annotation.NameInMap("ReviewUid")
        private String reviewUid;

        @com.aliyun.core.annotation.NameInMap("Reviewed")
        private Boolean reviewed;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("RiskTips")
        private String riskTips;

        @com.aliyun.core.annotation.NameInMap("RiskWords")
        private String riskWords;

        @com.aliyun.core.annotation.NameInMap("ScanResult")
        private String scanResult;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Float score;

        @com.aliyun.core.annotation.NameInMap("SensitiveLevel")
        private String sensitiveLevel;

        @com.aliyun.core.annotation.NameInMap("ServiceCode")
        private String serviceCode;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TextLabels")
        private java.util.List<java.util.Map<String, ?>> textLabels;

        @com.aliyun.core.annotation.NameInMap("Thumbnail")
        private String thumbnail;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("VoiceLabels")
        private java.util.List<java.util.Map<String, ?>> voiceLabels;

        @com.aliyun.core.annotation.NameInMap("VoiceScanOpened")
        private Boolean voiceScanOpened;

        @com.aliyun.core.annotation.NameInMap("VoiceService")
        private String voiceService;

        private Items(Builder builder) {
            this.accountId = builder.accountId;
            this.apiLabels = builder.apiLabels;
            this.apiRequestTime = builder.apiRequestTime;
            this.apiRiskLevel = builder.apiRiskLevel;
            this.apiService = builder.apiService;
            this.apiTaskId = builder.apiTaskId;
            this.attackLevel = builder.attackLevel;
            this.content = builder.content;
            this.dataId = builder.dataId;
            this.endTime = builder.endTime;
            this.extFeedback = builder.extFeedback;
            this.extra = builder.extra;
            this.frameCount = builder.frameCount;
            this.gmtCreate = builder.gmtCreate;
            this.guardFileUrls = builder.guardFileUrls;
            this.guardImageUrls = builder.guardImageUrls;
            this.imageLabels = builder.imageLabels;
            this.imageService = builder.imageService;
            this.imageUrl = builder.imageUrl;
            this.labels = builder.labels;
            this.liveId = builder.liveId;
            this.maliciousFileLevel = builder.maliciousFileLevel;
            this.maliciousUrlLevel = builder.maliciousUrlLevel;
            this.manualOnly = builder.manualOnly;
            this.noLabels = builder.noLabels;
            this.offset = builder.offset;
            this.pageNum = builder.pageNum;
            this.requestFrom = builder.requestFrom;
            this.requestId = builder.requestId;
            this.requestTime = builder.requestTime;
            this.resourceType = builder.resourceType;
            this.result = builder.result;
            this.reviewLabels = builder.reviewLabels;
            this.reviewRiskLevel = builder.reviewRiskLevel;
            this.reviewTime = builder.reviewTime;
            this.reviewUid = builder.reviewUid;
            this.reviewed = builder.reviewed;
            this.riskLevel = builder.riskLevel;
            this.riskTips = builder.riskTips;
            this.riskWords = builder.riskWords;
            this.scanResult = builder.scanResult;
            this.score = builder.score;
            this.sensitiveLevel = builder.sensitiveLevel;
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
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return apiLabels
         */
        public String getApiLabels() {
            return this.apiLabels;
        }

        /**
         * @return apiRequestTime
         */
        public String getApiRequestTime() {
            return this.apiRequestTime;
        }

        /**
         * @return apiRiskLevel
         */
        public String getApiRiskLevel() {
            return this.apiRiskLevel;
        }

        /**
         * @return apiService
         */
        public String getApiService() {
            return this.apiService;
        }

        /**
         * @return apiTaskId
         */
        public String getApiTaskId() {
            return this.apiTaskId;
        }

        /**
         * @return attackLevel
         */
        public String getAttackLevel() {
            return this.attackLevel;
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
        public java.util.Map<String, ?> getExtra() {
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
         * @return guardFileUrls
         */
        public java.util.List<String> getGuardFileUrls() {
            return this.guardFileUrls;
        }

        /**
         * @return guardImageUrls
         */
        public java.util.List<String> getGuardImageUrls() {
            return this.guardImageUrls;
        }

        /**
         * @return imageLabels
         */
        public java.util.List<java.util.Map<String, ?>> getImageLabels() {
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
         * @return liveId
         */
        public String getLiveId() {
            return this.liveId;
        }

        /**
         * @return maliciousFileLevel
         */
        public String getMaliciousFileLevel() {
            return this.maliciousFileLevel;
        }

        /**
         * @return maliciousUrlLevel
         */
        public String getMaliciousUrlLevel() {
            return this.maliciousUrlLevel;
        }

        /**
         * @return manualOnly
         */
        public Boolean getManualOnly() {
            return this.manualOnly;
        }

        /**
         * @return noLabels
         */
        public java.util.List<String> getNoLabels() {
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
         * @return requestFrom
         */
        public String getRequestFrom() {
            return this.requestFrom;
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
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return result
         */
        public java.util.List<Result> getResult() {
            return this.result;
        }

        /**
         * @return reviewLabels
         */
        public String getReviewLabels() {
            return this.reviewLabels;
        }

        /**
         * @return reviewRiskLevel
         */
        public String getReviewRiskLevel() {
            return this.reviewRiskLevel;
        }

        /**
         * @return reviewTime
         */
        public String getReviewTime() {
            return this.reviewTime;
        }

        /**
         * @return reviewUid
         */
        public String getReviewUid() {
            return this.reviewUid;
        }

        /**
         * @return reviewed
         */
        public Boolean getReviewed() {
            return this.reviewed;
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
         * @return sensitiveLevel
         */
        public String getSensitiveLevel() {
            return this.sensitiveLevel;
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
        public java.util.List<java.util.Map<String, ?>> getTextLabels() {
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
        public java.util.List<java.util.Map<String, ?>> getVoiceLabels() {
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
            private String accountId; 
            private String apiLabels; 
            private String apiRequestTime; 
            private String apiRiskLevel; 
            private String apiService; 
            private String apiTaskId; 
            private String attackLevel; 
            private String content; 
            private String dataId; 
            private String endTime; 
            private String extFeedback; 
            private java.util.Map<String, ?> extra; 
            private Long frameCount; 
            private String gmtCreate; 
            private java.util.List<String> guardFileUrls; 
            private java.util.List<String> guardImageUrls; 
            private java.util.List<java.util.Map<String, ?>> imageLabels; 
            private String imageService; 
            private String imageUrl; 
            private String labels; 
            private String liveId; 
            private String maliciousFileLevel; 
            private String maliciousUrlLevel; 
            private Boolean manualOnly; 
            private java.util.List<String> noLabels; 
            private Long offset; 
            private Long pageNum; 
            private String requestFrom; 
            private String requestId; 
            private String requestTime; 
            private String resourceType; 
            private java.util.List<Result> result; 
            private String reviewLabels; 
            private String reviewRiskLevel; 
            private String reviewTime; 
            private String reviewUid; 
            private Boolean reviewed; 
            private String riskLevel; 
            private String riskTips; 
            private String riskWords; 
            private String scanResult; 
            private Float score; 
            private String sensitiveLevel; 
            private String serviceCode; 
            private String startTime; 
            private String suggestion; 
            private String taskId; 
            private java.util.List<java.util.Map<String, ?>> textLabels; 
            private String thumbnail; 
            private String timeStamp; 
            private String url; 
            private java.util.List<java.util.Map<String, ?>> voiceLabels; 
            private Boolean voiceScanOpened; 
            private String voiceService; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.accountId = model.accountId;
                this.apiLabels = model.apiLabels;
                this.apiRequestTime = model.apiRequestTime;
                this.apiRiskLevel = model.apiRiskLevel;
                this.apiService = model.apiService;
                this.apiTaskId = model.apiTaskId;
                this.attackLevel = model.attackLevel;
                this.content = model.content;
                this.dataId = model.dataId;
                this.endTime = model.endTime;
                this.extFeedback = model.extFeedback;
                this.extra = model.extra;
                this.frameCount = model.frameCount;
                this.gmtCreate = model.gmtCreate;
                this.guardFileUrls = model.guardFileUrls;
                this.guardImageUrls = model.guardImageUrls;
                this.imageLabels = model.imageLabels;
                this.imageService = model.imageService;
                this.imageUrl = model.imageUrl;
                this.labels = model.labels;
                this.liveId = model.liveId;
                this.maliciousFileLevel = model.maliciousFileLevel;
                this.maliciousUrlLevel = model.maliciousUrlLevel;
                this.manualOnly = model.manualOnly;
                this.noLabels = model.noLabels;
                this.offset = model.offset;
                this.pageNum = model.pageNum;
                this.requestFrom = model.requestFrom;
                this.requestId = model.requestId;
                this.requestTime = model.requestTime;
                this.resourceType = model.resourceType;
                this.result = model.result;
                this.reviewLabels = model.reviewLabels;
                this.reviewRiskLevel = model.reviewRiskLevel;
                this.reviewTime = model.reviewTime;
                this.reviewUid = model.reviewUid;
                this.reviewed = model.reviewed;
                this.riskLevel = model.riskLevel;
                this.riskTips = model.riskTips;
                this.riskWords = model.riskWords;
                this.scanResult = model.scanResult;
                this.score = model.score;
                this.sensitiveLevel = model.sensitiveLevel;
                this.serviceCode = model.serviceCode;
                this.startTime = model.startTime;
                this.suggestion = model.suggestion;
                this.taskId = model.taskId;
                this.textLabels = model.textLabels;
                this.thumbnail = model.thumbnail;
                this.timeStamp = model.timeStamp;
                this.url = model.url;
                this.voiceLabels = model.voiceLabels;
                this.voiceScanOpened = model.voiceScanOpened;
                this.voiceService = model.voiceService;
            } 

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>Automated review labels.</p>
             * 
             * <strong>example:</strong>
             * <p>porn</p>
             */
            public Builder apiLabels(String apiLabels) {
                this.apiLabels = apiLabels;
                return this;
            }

            /**
             * <p>Machine review time.</p>
             * 
             * <strong>example:</strong>
             * <p>1755501226</p>
             */
            public Builder apiRequestTime(String apiRequestTime) {
                this.apiRequestTime = apiRequestTime;
                return this;
            }

            /**
             * <p>Automated review risk level.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder apiRiskLevel(String apiRiskLevel) {
                this.apiRiskLevel = apiRiskLevel;
                return this;
            }

            /**
             * <p>Automated review service</p>
             * 
             * <strong>example:</strong>
             * <p>basecheckLine</p>
             */
            public Builder apiService(String apiService) {
                this.apiService = apiService;
                return this;
            }

            /**
             * <p>Automated review task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder apiTaskId(String apiTaskId) {
                this.apiTaskId = apiTaskId;
                return this;
            }

            /**
             * <p>Attack level, returned based on the set high and low risk scores. The return values include:</p>
             * <ul>
             * <li><p>high: High risk</p>
             * </li>
             * <li><p>medium: Medium risk</p>
             * </li>
             * <li><p>low: Low risk</p>
             * </li>
             * <li><p>none: No risk detected</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder attackLevel(String attackLevel) {
                this.attackLevel = attackLevel;
                return this;
            }

            /**
             * <p>Content.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>Data Id</p>
             * 
             * <strong>example:</strong>
             * <p>4f27b8cc7c4544cb90b41882a5b36326</p>
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * <p>Segment end time (in seconds).</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Feedback information.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder extFeedback(String extFeedback) {
                this.extFeedback = extFeedback;
                return this;
            }

            /**
             * <p>Additional parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder extra(java.util.Map<String, ?> extra) {
                this.extra = extra;
                return this;
            }

            /**
             * <p>Frame count.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder frameCount(Long frameCount) {
                this.frameCount = frameCount;
                return this;
            }

            /**
             * <p>Creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-08-11 09:00:19</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Multimodal file URLs.</p>
             */
            public Builder guardFileUrls(java.util.List<String> guardFileUrls) {
                this.guardFileUrls = guardFileUrls;
                return this;
            }

            /**
             * <p>Multimodal image URLs.</p>
             */
            public Builder guardImageUrls(java.util.List<String> guardImageUrls) {
                this.guardImageUrls = guardImageUrls;
                return this;
            }

            /**
             * <p>Image labels.</p>
             */
            public Builder imageLabels(java.util.List<java.util.Map<String, ?>> imageLabels) {
                this.imageLabels = imageLabels;
                return this;
            }

            /**
             * <p>Image service.</p>
             * 
             * <strong>example:</strong>
             * <p>baselineCheck</p>
             */
            public Builder imageService(String imageService) {
                this.imageService = imageService;
                return this;
            }

            /**
             * <p>URL</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.aliyuncs.com/xxx.png">https://www.aliyuncs.com/xxx.png</a></p>
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>Labels.</p>
             * 
             * <strong>example:</strong>
             * <p>nonLabel</p>
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            /**
             * LiveId.
             */
            public Builder liveId(String liveId) {
                this.liveId = liveId;
                return this;
            }

            /**
             * <p>Malicious file risk level.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder maliciousFileLevel(String maliciousFileLevel) {
                this.maliciousFileLevel = maliciousFileLevel;
                return this;
            }

            /**
             * <p>Malicious URL risk level.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder maliciousUrlLevel(String maliciousUrlLevel) {
                this.maliciousUrlLevel = maliciousUrlLevel;
                return this;
            }

            /**
             * <p>Whether it is a pure manual review.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder manualOnly(Boolean manualOnly) {
                this.manualOnly = manualOnly;
                return this;
            }

            /**
             * <p>No labels</p>
             */
            public Builder noLabels(java.util.List<String> noLabels) {
                this.noLabels = noLabels;
                return this;
            }

            /**
             * <p>Frame offset value.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder offset(Long offset) {
                this.offset = offset;
                return this;
            }

            /**
             * <p>Page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNum(Long pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>Request source.</p>
             * 
             * <strong>example:</strong>
             * <p>online_test</p>
             */
            public Builder requestFrom(String requestFrom) {
                this.requestFrom = requestFrom;
                return this;
            }

            /**
             * <p>Request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>Request time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-08-11 09:00:19</p>
             */
            public Builder requestTime(String requestTime) {
                this.requestTime = requestTime;
                return this;
            }

            /**
             * <p>Resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>Return collection.</p>
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            /**
             * <p>Review labels.</p>
             * 
             * <strong>example:</strong>
             * <p>porn</p>
             */
            public Builder reviewLabels(String reviewLabels) {
                this.reviewLabels = reviewLabels;
                return this;
            }

            /**
             * <p>Review status.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder reviewRiskLevel(String reviewRiskLevel) {
                this.reviewRiskLevel = reviewRiskLevel;
                return this;
            }

            /**
             * <p>Review time.</p>
             * 
             * <strong>example:</strong>
             * <p>1755501226</p>
             */
            public Builder reviewTime(String reviewTime) {
                this.reviewTime = reviewTime;
                return this;
            }

            /**
             * <p>Reviewer.</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
             */
            public Builder reviewUid(String reviewUid) {
                this.reviewUid = reviewUid;
                return this;
            }

            /**
             * <p>Whether it has been reviewed.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder reviewed(Boolean reviewed) {
                this.reviewed = reviewed;
                return this;
            }

            /**
             * <p>Risk level, returned based on the set high and low risk scores. The return values include:</p>
             * <ul>
             * <li><p>high: High risk</p>
             * </li>
             * <li><p>medium: Medium risk</p>
             * </li>
             * <li><p>low: Low risk</p>
             * </li>
             * <li><p>none: No risk detected</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>Details of the detected risk.</p>
             * 
             * <strong>example:</strong>
             * <p>色情服务</p>
             */
            public Builder riskTips(String riskTips) {
                this.riskTips = riskTips;
                return this;
            }

            /**
             * <p>Keywords of the detected risk.</p>
             * 
             * <strong>example:</strong>
             * <p>色情_低俗词</p>
             */
            public Builder riskWords(String riskWords) {
                this.riskWords = riskWords;
                return this;
            }

            /**
             * <p>Details of the result.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder scanResult(String scanResult) {
                this.scanResult = scanResult;
                return this;
            }

            /**
             * <p>Score.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder score(Float score) {
                this.score = score;
                return this;
            }

            /**
             * <p>Sensitive level, returned based on the set high and low risk scores. The return values include:</p>
             * <ul>
             * <li><strong>S1</strong>: Indicates low sensitivity.</li>
             * <li><strong>S2</strong>: Indicates medium sensitivity.</li>
             * <li><strong>S3</strong>: Indicates high sensitivity.</li>
             * <li><strong>S4</strong>: Indicates very high sensitivity.</li>
             * <li><strong>S0</strong>: Indicates no sensitivity.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>S0</p>
             */
            public Builder sensitiveLevel(String sensitiveLevel) {
                this.sensitiveLevel = sensitiveLevel;
                return this;
            }

            /**
             * <p>Service code.</p>
             * 
             * <strong>example:</strong>
             * <p>baselineCheck</p>
             */
            public Builder serviceCode(String serviceCode) {
                this.serviceCode = serviceCode;
                return this;
            }

            /**
             * <p>Segment start time (in seconds).</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>Suggestion.</p>
             * 
             * <strong>example:</strong>
             * <p>review</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * <p>Task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vi_s_EbrXb716LyBpkfwxyX5xyh-1A6RY9</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>Text labels.</p>
             */
            public Builder textLabels(java.util.List<java.util.Map<String, ?>> textLabels) {
                this.textLabels = textLabels;
                return this;
            }

            /**
             * <p>Thumbnail URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.aliyuncs.com/xxx.png">https://www.aliyuncs.com/xxx.png</a></p>
             */
            public Builder thumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
                return this;
            }

            /**
             * <p>Timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:40-00:00:42</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * <p>Task URL</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.aliyuncs.com/xxx.png">https://www.aliyuncs.com/xxx.png</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>Voice labels.</p>
             */
            public Builder voiceLabels(java.util.List<java.util.Map<String, ?>> voiceLabels) {
                this.voiceLabels = voiceLabels;
                return this;
            }

            /**
             * <p>Whether audio detection is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder voiceScanOpened(Boolean voiceScanOpened) {
                this.voiceScanOpened = voiceScanOpened;
                return this;
            }

            /**
             * <p>Voice service.</p>
             * 
             * <strong>example:</strong>
             * <p>live_stream_detection</p>
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
    /**
     * 
     * {@link GetScanResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetScanResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<Items> items;

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
        public java.util.List<Items> getItems() {
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
            private java.util.List<Items> items; 
            private Integer pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currentPage = model.currentPage;
                this.items = model.items;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>Current page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>Data for the current page.</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>Number of items per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
