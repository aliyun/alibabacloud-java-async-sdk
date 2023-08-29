// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadUserAppToMsaResponseBody} extends {@link TeaModel}
 *
 * <p>UploadUserAppToMsaResponseBody</p>
 */
public class UploadUserAppToMsaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResultCode")
    private String resultCode;

    @NameInMap("ResultContent")
    private ResultContent resultContent;

    @NameInMap("ResultMessage")
    private String resultMessage;

    private UploadUserAppToMsaResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultContent = builder.resultContent;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadUserAppToMsaResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultContent
     */
    public ResultContent getResultContent() {
        return this.resultContent;
    }

    /**
     * @return resultMessage
     */
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static final class Builder {
        private String requestId; 
        private String resultCode; 
        private ResultContent resultContent; 
        private String resultMessage; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ResultContent.
         */
        public Builder resultContent(ResultContent resultContent) {
            this.resultContent = resultContent;
            return this;
        }

        /**
         * ResultMessage.
         */
        public Builder resultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }

        public UploadUserAppToMsaResponseBody build() {
            return new UploadUserAppToMsaResponseBody(this);
        } 

    } 

    public static class EnhanceMapping extends TeaModel {
        @NameInMap("Info")
        private String info;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("Type")
        private String type;

        private EnhanceMapping(Builder builder) {
            this.info = builder.info;
            this.reason = builder.reason;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnhanceMapping create() {
            return builder().build();
        }

        /**
         * @return info
         */
        public String getInfo() {
            return this.info;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String info; 
            private String reason; 
            private String type; 

            /**
             * Info.
             */
            public Builder info(String info) {
                this.info = info;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public EnhanceMapping build() {
                return new EnhanceMapping(this);
            } 

        } 

    }
    public static class ApkInfo extends TeaModel {
        @NameInMap("AfterMd5")
        private String afterMd5;

        @NameInMap("AfterSize")
        private Long afterSize;

        @NameInMap("AppCode")
        private String appCode;

        @NameInMap("AppPackage")
        private String appPackage;

        @NameInMap("BeforeMd5")
        private String beforeMd5;

        @NameInMap("BeforeSize")
        private Long beforeSize;

        @NameInMap("ClassForest")
        private String classForest;

        @NameInMap("EnhanceMapping")
        private EnhanceMapping enhanceMapping;

        @NameInMap("EnhanceRules")
        private java.util.List < String > enhanceRules;

        @NameInMap("EnhancedClasses")
        private java.util.List < String > enhancedClasses;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Label")
        private String label;

        @NameInMap("Progress")
        private Long progress;

        @NameInMap("Status")
        private Long status;

        @NameInMap("TaskType")
        private String taskType;

        @NameInMap("VersionCode")
        private String versionCode;

        @NameInMap("VersionName")
        private String versionName;

        private ApkInfo(Builder builder) {
            this.afterMd5 = builder.afterMd5;
            this.afterSize = builder.afterSize;
            this.appCode = builder.appCode;
            this.appPackage = builder.appPackage;
            this.beforeMd5 = builder.beforeMd5;
            this.beforeSize = builder.beforeSize;
            this.classForest = builder.classForest;
            this.enhanceMapping = builder.enhanceMapping;
            this.enhanceRules = builder.enhanceRules;
            this.enhancedClasses = builder.enhancedClasses;
            this.id = builder.id;
            this.label = builder.label;
            this.progress = builder.progress;
            this.status = builder.status;
            this.taskType = builder.taskType;
            this.versionCode = builder.versionCode;
            this.versionName = builder.versionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApkInfo create() {
            return builder().build();
        }

        /**
         * @return afterMd5
         */
        public String getAfterMd5() {
            return this.afterMd5;
        }

        /**
         * @return afterSize
         */
        public Long getAfterSize() {
            return this.afterSize;
        }

        /**
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
        }

        /**
         * @return appPackage
         */
        public String getAppPackage() {
            return this.appPackage;
        }

        /**
         * @return beforeMd5
         */
        public String getBeforeMd5() {
            return this.beforeMd5;
        }

        /**
         * @return beforeSize
         */
        public Long getBeforeSize() {
            return this.beforeSize;
        }

        /**
         * @return classForest
         */
        public String getClassForest() {
            return this.classForest;
        }

        /**
         * @return enhanceMapping
         */
        public EnhanceMapping getEnhanceMapping() {
            return this.enhanceMapping;
        }

        /**
         * @return enhanceRules
         */
        public java.util.List < String > getEnhanceRules() {
            return this.enhanceRules;
        }

        /**
         * @return enhancedClasses
         */
        public java.util.List < String > getEnhancedClasses() {
            return this.enhancedClasses;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return progress
         */
        public Long getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return versionCode
         */
        public String getVersionCode() {
            return this.versionCode;
        }

        /**
         * @return versionName
         */
        public String getVersionName() {
            return this.versionName;
        }

        public static final class Builder {
            private String afterMd5; 
            private Long afterSize; 
            private String appCode; 
            private String appPackage; 
            private String beforeMd5; 
            private Long beforeSize; 
            private String classForest; 
            private EnhanceMapping enhanceMapping; 
            private java.util.List < String > enhanceRules; 
            private java.util.List < String > enhancedClasses; 
            private Long id; 
            private String label; 
            private Long progress; 
            private Long status; 
            private String taskType; 
            private String versionCode; 
            private String versionName; 

            /**
             * AfterMd5.
             */
            public Builder afterMd5(String afterMd5) {
                this.afterMd5 = afterMd5;
                return this;
            }

            /**
             * AfterSize.
             */
            public Builder afterSize(Long afterSize) {
                this.afterSize = afterSize;
                return this;
            }

            /**
             * AppCode.
             */
            public Builder appCode(String appCode) {
                this.appCode = appCode;
                return this;
            }

            /**
             * AppPackage.
             */
            public Builder appPackage(String appPackage) {
                this.appPackage = appPackage;
                return this;
            }

            /**
             * BeforeMd5.
             */
            public Builder beforeMd5(String beforeMd5) {
                this.beforeMd5 = beforeMd5;
                return this;
            }

            /**
             * BeforeSize.
             */
            public Builder beforeSize(Long beforeSize) {
                this.beforeSize = beforeSize;
                return this;
            }

            /**
             * ClassForest.
             */
            public Builder classForest(String classForest) {
                this.classForest = classForest;
                return this;
            }

            /**
             * EnhanceMapping.
             */
            public Builder enhanceMapping(EnhanceMapping enhanceMapping) {
                this.enhanceMapping = enhanceMapping;
                return this;
            }

            /**
             * EnhanceRules.
             */
            public Builder enhanceRules(java.util.List < String > enhanceRules) {
                this.enhanceRules = enhanceRules;
                return this;
            }

            /**
             * EnhancedClasses.
             */
            public Builder enhancedClasses(java.util.List < String > enhancedClasses) {
                this.enhancedClasses = enhancedClasses;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(Long progress) {
                this.progress = progress;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Long status) {
                this.status = status;
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
             * VersionCode.
             */
            public Builder versionCode(String versionCode) {
                this.versionCode = versionCode;
                return this;
            }

            /**
             * VersionName.
             */
            public Builder versionName(String versionName) {
                this.versionName = versionName;
                return this;
            }

            public ApkInfo build() {
                return new ApkInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ApkInfo")
        private ApkInfo apkInfo;

        @NameInMap("EnhanceTaskId")
        private Long enhanceTaskId;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Progress")
        private Long progress;

        @NameInMap("Status")
        private Long status;

        private Data(Builder builder) {
            this.apkInfo = builder.apkInfo;
            this.enhanceTaskId = builder.enhanceTaskId;
            this.id = builder.id;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return apkInfo
         */
        public ApkInfo getApkInfo() {
            return this.apkInfo;
        }

        /**
         * @return enhanceTaskId
         */
        public Long getEnhanceTaskId() {
            return this.enhanceTaskId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return progress
         */
        public Long getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        public static final class Builder {
            private ApkInfo apkInfo; 
            private Long enhanceTaskId; 
            private Long id; 
            private Long progress; 
            private Long status; 

            /**
             * ApkInfo.
             */
            public Builder apkInfo(ApkInfo apkInfo) {
                this.apkInfo = apkInfo;
                return this;
            }

            /**
             * EnhanceTaskId.
             */
            public Builder enhanceTaskId(Long enhanceTaskId) {
                this.enhanceTaskId = enhanceTaskId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(Long progress) {
                this.progress = progress;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class ResultContent extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Data")
        private Data data;

        @NameInMap("Extra")
        private String extra;

        @NameInMap("Message")
        private String message;

        @NameInMap("Success")
        private Boolean success;

        private ResultContent(Builder builder) {
            this.code = builder.code;
            this.data = builder.data;
            this.extra = builder.extra;
            this.message = builder.message;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultContent create() {
            return builder().build();
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
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
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
            private String extra; 
            private String message; 
            private Boolean success; 

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
             * Extra.
             */
            public Builder extra(String extra) {
                this.extra = extra;
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
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public ResultContent build() {
                return new ResultContent(this);
            } 

        } 

    }
}
