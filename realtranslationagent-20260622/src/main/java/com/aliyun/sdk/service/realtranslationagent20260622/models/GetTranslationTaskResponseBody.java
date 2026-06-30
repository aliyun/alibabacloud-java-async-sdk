// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.realtranslationagent20260622.models;

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
 * {@link GetTranslationTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetTranslationTaskResponseBody</p>
 */
public class GetTranslationTaskResponseBody extends TeaModel {
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

    private GetTranslationTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTranslationTaskResponseBody create() {
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

        private Builder(GetTranslationTaskResponseBody model) {
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

        public GetTranslationTaskResponseBody build() {
            return new GetTranslationTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTranslationTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranslationTaskResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityLevel")
        private String securityLevel;

        @com.aliyun.core.annotation.NameInMap("SourceLanguage")
        private String sourceLanguage;

        @com.aliyun.core.annotation.NameInMap("Style")
        private String style;

        @com.aliyun.core.annotation.NameInMap("TargetLanguage")
        private String targetLanguage;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        private Config(Builder builder) {
            this.securityLevel = builder.securityLevel;
            this.sourceLanguage = builder.sourceLanguage;
            this.style = builder.style;
            this.targetLanguage = builder.targetLanguage;
            this.template = builder.template;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return securityLevel
         */
        public String getSecurityLevel() {
            return this.securityLevel;
        }

        /**
         * @return sourceLanguage
         */
        public String getSourceLanguage() {
            return this.sourceLanguage;
        }

        /**
         * @return style
         */
        public String getStyle() {
            return this.style;
        }

        /**
         * @return targetLanguage
         */
        public String getTargetLanguage() {
            return this.targetLanguage;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        public static final class Builder {
            private String securityLevel; 
            private String sourceLanguage; 
            private String style; 
            private String targetLanguage; 
            private String template; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.securityLevel = model.securityLevel;
                this.sourceLanguage = model.sourceLanguage;
                this.style = model.style;
                this.targetLanguage = model.targetLanguage;
                this.template = model.template;
            } 

            /**
             * SecurityLevel.
             */
            public Builder securityLevel(String securityLevel) {
                this.securityLevel = securityLevel;
                return this;
            }

            /**
             * SourceLanguage.
             */
            public Builder sourceLanguage(String sourceLanguage) {
                this.sourceLanguage = sourceLanguage;
                return this;
            }

            /**
             * Style.
             */
            public Builder style(String style) {
                this.style = style;
                return this;
            }

            /**
             * TargetLanguage.
             */
            public Builder targetLanguage(String targetLanguage) {
                this.targetLanguage = targetLanguage;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranslationTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranslationTaskResponseBody</p>
     */
    public static class ExtractedTerms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceTerm")
        private String sourceTerm;

        @com.aliyun.core.annotation.NameInMap("TargetTerm")
        private String targetTerm;

        private ExtractedTerms(Builder builder) {
            this.sourceTerm = builder.sourceTerm;
            this.targetTerm = builder.targetTerm;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtractedTerms create() {
            return builder().build();
        }

        /**
         * @return sourceTerm
         */
        public String getSourceTerm() {
            return this.sourceTerm;
        }

        /**
         * @return targetTerm
         */
        public String getTargetTerm() {
            return this.targetTerm;
        }

        public static final class Builder {
            private String sourceTerm; 
            private String targetTerm; 

            private Builder() {
            } 

            private Builder(ExtractedTerms model) {
                this.sourceTerm = model.sourceTerm;
                this.targetTerm = model.targetTerm;
            } 

            /**
             * SourceTerm.
             */
            public Builder sourceTerm(String sourceTerm) {
                this.sourceTerm = sourceTerm;
                return this;
            }

            /**
             * TargetTerm.
             */
            public Builder targetTerm(String targetTerm) {
                this.targetTerm = targetTerm;
                return this;
            }

            public ExtractedTerms build() {
                return new ExtractedTerms(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranslationTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranslationTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaseTaskId")
        private String baseTaskId;

        @com.aliyun.core.annotation.NameInMap("Config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("CostCredits")
        private Double costCredits;

        @com.aliyun.core.annotation.NameInMap("CostTime")
        private Long costTime;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("EstimatedCostCredits")
        private Double estimatedCostCredits;

        @com.aliyun.core.annotation.NameInMap("EstimatedTime")
        private Long estimatedTime;

        @com.aliyun.core.annotation.NameInMap("ExtractedTerms")
        private java.util.List<ExtractedTerms> extractedTerms;

        @com.aliyun.core.annotation.NameInMap("FileFormat")
        private String fileFormat;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FinishedAt")
        private String finishedAt;

        @com.aliyun.core.annotation.NameInMap("Fonts")
        private java.util.Map<String, java.util.List<String>> fonts;

        @com.aliyun.core.annotation.NameInMap("OrgId")
        private String orgId;

        @com.aliyun.core.annotation.NameInMap("OriginalFileName")
        private String originalFileName;

        @com.aliyun.core.annotation.NameInMap("PageCount")
        private Long pageCount;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("WordCount")
        private Long wordCount;

        @com.aliyun.core.annotation.NameInMap("WorkSpaceId")
        private String workSpaceId;

        private Data(Builder builder) {
            this.baseTaskId = builder.baseTaskId;
            this.config = builder.config;
            this.costCredits = builder.costCredits;
            this.costTime = builder.costTime;
            this.errorMessage = builder.errorMessage;
            this.estimatedCostCredits = builder.estimatedCostCredits;
            this.estimatedTime = builder.estimatedTime;
            this.extractedTerms = builder.extractedTerms;
            this.fileFormat = builder.fileFormat;
            this.fileName = builder.fileName;
            this.finishedAt = builder.finishedAt;
            this.fonts = builder.fonts;
            this.orgId = builder.orgId;
            this.originalFileName = builder.originalFileName;
            this.pageCount = builder.pageCount;
            this.progress = builder.progress;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.taskType = builder.taskType;
            this.wordCount = builder.wordCount;
            this.workSpaceId = builder.workSpaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return baseTaskId
         */
        public String getBaseTaskId() {
            return this.baseTaskId;
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
        }

        /**
         * @return costCredits
         */
        public Double getCostCredits() {
            return this.costCredits;
        }

        /**
         * @return costTime
         */
        public Long getCostTime() {
            return this.costTime;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return estimatedCostCredits
         */
        public Double getEstimatedCostCredits() {
            return this.estimatedCostCredits;
        }

        /**
         * @return estimatedTime
         */
        public Long getEstimatedTime() {
            return this.estimatedTime;
        }

        /**
         * @return extractedTerms
         */
        public java.util.List<ExtractedTerms> getExtractedTerms() {
            return this.extractedTerms;
        }

        /**
         * @return fileFormat
         */
        public String getFileFormat() {
            return this.fileFormat;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return finishedAt
         */
        public String getFinishedAt() {
            return this.finishedAt;
        }

        /**
         * @return fonts
         */
        public java.util.Map<String, java.util.List<String>> getFonts() {
            return this.fonts;
        }

        /**
         * @return orgId
         */
        public String getOrgId() {
            return this.orgId;
        }

        /**
         * @return originalFileName
         */
        public String getOriginalFileName() {
            return this.originalFileName;
        }

        /**
         * @return pageCount
         */
        public Long getPageCount() {
            return this.pageCount;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return wordCount
         */
        public Long getWordCount() {
            return this.wordCount;
        }

        /**
         * @return workSpaceId
         */
        public String getWorkSpaceId() {
            return this.workSpaceId;
        }

        public static final class Builder {
            private String baseTaskId; 
            private Config config; 
            private Double costCredits; 
            private Long costTime; 
            private String errorMessage; 
            private Double estimatedCostCredits; 
            private Long estimatedTime; 
            private java.util.List<ExtractedTerms> extractedTerms; 
            private String fileFormat; 
            private String fileName; 
            private String finishedAt; 
            private java.util.Map<String, java.util.List<String>> fonts; 
            private String orgId; 
            private String originalFileName; 
            private Long pageCount; 
            private Integer progress; 
            private String status; 
            private String taskId; 
            private String taskType; 
            private Long wordCount; 
            private String workSpaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.baseTaskId = model.baseTaskId;
                this.config = model.config;
                this.costCredits = model.costCredits;
                this.costTime = model.costTime;
                this.errorMessage = model.errorMessage;
                this.estimatedCostCredits = model.estimatedCostCredits;
                this.estimatedTime = model.estimatedTime;
                this.extractedTerms = model.extractedTerms;
                this.fileFormat = model.fileFormat;
                this.fileName = model.fileName;
                this.finishedAt = model.finishedAt;
                this.fonts = model.fonts;
                this.orgId = model.orgId;
                this.originalFileName = model.originalFileName;
                this.pageCount = model.pageCount;
                this.progress = model.progress;
                this.status = model.status;
                this.taskId = model.taskId;
                this.taskType = model.taskType;
                this.wordCount = model.wordCount;
                this.workSpaceId = model.workSpaceId;
            } 

            /**
             * BaseTaskId.
             */
            public Builder baseTaskId(String baseTaskId) {
                this.baseTaskId = baseTaskId;
                return this;
            }

            /**
             * Config.
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * CostCredits.
             */
            public Builder costCredits(Double costCredits) {
                this.costCredits = costCredits;
                return this;
            }

            /**
             * CostTime.
             */
            public Builder costTime(Long costTime) {
                this.costTime = costTime;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * EstimatedCostCredits.
             */
            public Builder estimatedCostCredits(Double estimatedCostCredits) {
                this.estimatedCostCredits = estimatedCostCredits;
                return this;
            }

            /**
             * EstimatedTime.
             */
            public Builder estimatedTime(Long estimatedTime) {
                this.estimatedTime = estimatedTime;
                return this;
            }

            /**
             * ExtractedTerms.
             */
            public Builder extractedTerms(java.util.List<ExtractedTerms> extractedTerms) {
                this.extractedTerms = extractedTerms;
                return this;
            }

            /**
             * FileFormat.
             */
            public Builder fileFormat(String fileFormat) {
                this.fileFormat = fileFormat;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * FinishedAt.
             */
            public Builder finishedAt(String finishedAt) {
                this.finishedAt = finishedAt;
                return this;
            }

            /**
             * Fonts.
             */
            public Builder fonts(java.util.Map<String, java.util.List<String>> fonts) {
                this.fonts = fonts;
                return this;
            }

            /**
             * OrgId.
             */
            public Builder orgId(String orgId) {
                this.orgId = orgId;
                return this;
            }

            /**
             * OriginalFileName.
             */
            public Builder originalFileName(String originalFileName) {
                this.originalFileName = originalFileName;
                return this;
            }

            /**
             * PageCount.
             */
            public Builder pageCount(Long pageCount) {
                this.pageCount = pageCount;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
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
             * TaskType.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * WordCount.
             */
            public Builder wordCount(Long wordCount) {
                this.wordCount = wordCount;
                return this;
            }

            /**
             * WorkSpaceId.
             */
            public Builder workSpaceId(String workSpaceId) {
                this.workSpaceId = workSpaceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
