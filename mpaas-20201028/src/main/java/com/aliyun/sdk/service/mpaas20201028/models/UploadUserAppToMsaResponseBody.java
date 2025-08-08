// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

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
 * {@link UploadUserAppToMsaResponseBody} extends {@link TeaModel}
 *
 * <p>UploadUserAppToMsaResponseBody</p>
 */
public class UploadUserAppToMsaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultContent")
    private ResultContent resultContent;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(UploadUserAppToMsaResponseBody model) {
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.resultContent = model.resultContent;
            this.resultMessage = model.resultMessage;
        } 

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

    /**
     * 
     * {@link UploadUserAppToMsaResponseBody} extends {@link TeaModel}
     *
     * <p>UploadUserAppToMsaResponseBody</p>
     */
    public static class EnhanceMapping extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Info")
        private String info;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Type")
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

            private Builder() {
            } 

            private Builder(EnhanceMapping model) {
                this.info = model.info;
                this.reason = model.reason;
                this.type = model.type;
            } 

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
    /**
     * 
     * {@link UploadUserAppToMsaResponseBody} extends {@link TeaModel}
     *
     * <p>UploadUserAppToMsaResponseBody</p>
     */
    public static class ApkInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AfterMd5")
        private String afterMd5;

        @com.aliyun.core.annotation.NameInMap("AfterSize")
        private Long afterSize;

        @com.aliyun.core.annotation.NameInMap("AppCode")
        private String appCode;

        @com.aliyun.core.annotation.NameInMap("AppPackage")
        private String appPackage;

        @com.aliyun.core.annotation.NameInMap("BeforeMd5")
        private String beforeMd5;

        @com.aliyun.core.annotation.NameInMap("BeforeSize")
        private Long beforeSize;

        @com.aliyun.core.annotation.NameInMap("ClassForest")
        private String classForest;

        @com.aliyun.core.annotation.NameInMap("EnhanceMapping")
        private EnhanceMapping enhanceMapping;

        @com.aliyun.core.annotation.NameInMap("EnhanceRules")
        private java.util.List<String> enhanceRules;

        @com.aliyun.core.annotation.NameInMap("EnhancedClasses")
        private java.util.List<String> enhancedClasses;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Long progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("VersionCode")
        private String versionCode;

        @com.aliyun.core.annotation.NameInMap("VersionName")
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
        public java.util.List<String> getEnhanceRules() {
            return this.enhanceRules;
        }

        /**
         * @return enhancedClasses
         */
        public java.util.List<String> getEnhancedClasses() {
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
            private java.util.List<String> enhanceRules; 
            private java.util.List<String> enhancedClasses; 
            private Long id; 
            private String label; 
            private Long progress; 
            private Long status; 
            private String taskType; 
            private String versionCode; 
            private String versionName; 

            private Builder() {
            } 

            private Builder(ApkInfo model) {
                this.afterMd5 = model.afterMd5;
                this.afterSize = model.afterSize;
                this.appCode = model.appCode;
                this.appPackage = model.appPackage;
                this.beforeMd5 = model.beforeMd5;
                this.beforeSize = model.beforeSize;
                this.classForest = model.classForest;
                this.enhanceMapping = model.enhanceMapping;
                this.enhanceRules = model.enhanceRules;
                this.enhancedClasses = model.enhancedClasses;
                this.id = model.id;
                this.label = model.label;
                this.progress = model.progress;
                this.status = model.status;
                this.taskType = model.taskType;
                this.versionCode = model.versionCode;
                this.versionName = model.versionName;
            } 

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
            public Builder enhanceRules(java.util.List<String> enhanceRules) {
                this.enhanceRules = enhanceRules;
                return this;
            }

            /**
             * EnhancedClasses.
             */
            public Builder enhancedClasses(java.util.List<String> enhancedClasses) {
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
    /**
     * 
     * {@link UploadUserAppToMsaResponseBody} extends {@link TeaModel}
     *
     * <p>UploadUserAppToMsaResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApkInfo")
        private ApkInfo apkInfo;

        @com.aliyun.core.annotation.NameInMap("EnhanceTaskId")
        private Long enhanceTaskId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Long progress;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.apkInfo = model.apkInfo;
                this.enhanceTaskId = model.enhanceTaskId;
                this.id = model.id;
                this.progress = model.progress;
                this.status = model.status;
            } 

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
    /**
     * 
     * {@link UploadUserAppToMsaResponseBody} extends {@link TeaModel}
     *
     * <p>UploadUserAppToMsaResponseBody</p>
     */
    public static class ResultContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Data")
        private Data data;

        @com.aliyun.core.annotation.NameInMap("Extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Success")
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

            private Builder() {
            } 

            private Builder(ResultContent model) {
                this.code = model.code;
                this.data = model.data;
                this.extra = model.extra;
                this.message = model.message;
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
