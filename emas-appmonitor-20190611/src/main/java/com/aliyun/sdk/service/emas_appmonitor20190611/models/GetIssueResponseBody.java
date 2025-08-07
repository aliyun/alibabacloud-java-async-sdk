// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emas_appmonitor20190611.models;

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
 * {@link GetIssueResponseBody} extends {@link TeaModel}
 *
 * <p>GetIssueResponseBody</p>
 */
public class GetIssueResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Args")
    private java.util.Map<String, ?> args;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetIssueResponseBody(Builder builder) {
        this.args = builder.args;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIssueResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return args
     */
    public java.util.Map<String, ?> getArgs() {
        return this.args;
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public Model getModel() {
        return this.model;
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
        private java.util.Map<String, ?> args; 
        private Integer errorCode; 
        private String message; 
        private Model model; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetIssueResponseBody model) {
            this.args = model.args;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.model = model.model;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Args</p>
         */
        public Builder args(java.util.Map<String, ?> args) {
            this.args = args;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
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
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
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

        public GetIssueResponseBody build() {
            return new GetIssueResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetIssueResponseBody} extends {@link TeaModel}
     *
     * <p>GetIssueResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AffectedVersions")
        private java.util.List<String> affectedVersions;

        @com.aliyun.core.annotation.NameInMap("AllocSizeMax")
        private Long allocSizeMax;

        @com.aliyun.core.annotation.NameInMap("AllocSizePct50")
        private Long allocSizePct50;

        @com.aliyun.core.annotation.NameInMap("AllocSizePct70")
        private Long allocSizePct70;

        @com.aliyun.core.annotation.NameInMap("AllocSizePct90")
        private Long allocSizePct90;

        @com.aliyun.core.annotation.NameInMap("CruxStack")
        private String cruxStack;

        @com.aliyun.core.annotation.NameInMap("DigestHash")
        private String digestHash;

        @com.aliyun.core.annotation.NameInMap("ErrorColumn")
        private Integer errorColumn;

        @com.aliyun.core.annotation.NameInMap("ErrorCount")
        private Integer errorCount;

        @com.aliyun.core.annotation.NameInMap("ErrorCountGrowthRate")
        private Double errorCountGrowthRate;

        @com.aliyun.core.annotation.NameInMap("ErrorDeviceCount")
        private Integer errorDeviceCount;

        @com.aliyun.core.annotation.NameInMap("ErrorDeviceCountGrowthRate")
        private Double errorDeviceCountGrowthRate;

        @com.aliyun.core.annotation.NameInMap("ErrorDeviceRate")
        private Double errorDeviceRate;

        @com.aliyun.core.annotation.NameInMap("ErrorDeviceRateGrowthRate")
        private Double errorDeviceRateGrowthRate;

        @com.aliyun.core.annotation.NameInMap("ErrorFileName")
        private String errorFileName;

        @com.aliyun.core.annotation.NameInMap("ErrorLine")
        private String errorLine;

        @com.aliyun.core.annotation.NameInMap("ErrorName")
        private String errorName;

        @com.aliyun.core.annotation.NameInMap("ErrorRate")
        private Double errorRate;

        @com.aliyun.core.annotation.NameInMap("ErrorRateGrowthRate")
        private Double errorRateGrowthRate;

        @com.aliyun.core.annotation.NameInMap("ErrorType")
        private String errorType;

        @com.aliyun.core.annotation.NameInMap("EventTime")
        private Long eventTime;

        @com.aliyun.core.annotation.NameInMap("FirstVersion")
        private String firstVersion;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtLatest")
        private Long gmtLatest;

        @com.aliyun.core.annotation.NameInMap("KeyLine")
        private Integer keyLine;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Stack")
        private String stack;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("SymbolicStatus")
        private Boolean symbolicStatus;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<String> tags;

        private Model(Builder builder) {
            this.affectedVersions = builder.affectedVersions;
            this.allocSizeMax = builder.allocSizeMax;
            this.allocSizePct50 = builder.allocSizePct50;
            this.allocSizePct70 = builder.allocSizePct70;
            this.allocSizePct90 = builder.allocSizePct90;
            this.cruxStack = builder.cruxStack;
            this.digestHash = builder.digestHash;
            this.errorColumn = builder.errorColumn;
            this.errorCount = builder.errorCount;
            this.errorCountGrowthRate = builder.errorCountGrowthRate;
            this.errorDeviceCount = builder.errorDeviceCount;
            this.errorDeviceCountGrowthRate = builder.errorDeviceCountGrowthRate;
            this.errorDeviceRate = builder.errorDeviceRate;
            this.errorDeviceRateGrowthRate = builder.errorDeviceRateGrowthRate;
            this.errorFileName = builder.errorFileName;
            this.errorLine = builder.errorLine;
            this.errorName = builder.errorName;
            this.errorRate = builder.errorRate;
            this.errorRateGrowthRate = builder.errorRateGrowthRate;
            this.errorType = builder.errorType;
            this.eventTime = builder.eventTime;
            this.firstVersion = builder.firstVersion;
            this.gmtCreate = builder.gmtCreate;
            this.gmtLatest = builder.gmtLatest;
            this.keyLine = builder.keyLine;
            this.name = builder.name;
            this.stack = builder.stack;
            this.status = builder.status;
            this.summary = builder.summary;
            this.symbolicStatus = builder.symbolicStatus;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return affectedVersions
         */
        public java.util.List<String> getAffectedVersions() {
            return this.affectedVersions;
        }

        /**
         * @return allocSizeMax
         */
        public Long getAllocSizeMax() {
            return this.allocSizeMax;
        }

        /**
         * @return allocSizePct50
         */
        public Long getAllocSizePct50() {
            return this.allocSizePct50;
        }

        /**
         * @return allocSizePct70
         */
        public Long getAllocSizePct70() {
            return this.allocSizePct70;
        }

        /**
         * @return allocSizePct90
         */
        public Long getAllocSizePct90() {
            return this.allocSizePct90;
        }

        /**
         * @return cruxStack
         */
        public String getCruxStack() {
            return this.cruxStack;
        }

        /**
         * @return digestHash
         */
        public String getDigestHash() {
            return this.digestHash;
        }

        /**
         * @return errorColumn
         */
        public Integer getErrorColumn() {
            return this.errorColumn;
        }

        /**
         * @return errorCount
         */
        public Integer getErrorCount() {
            return this.errorCount;
        }

        /**
         * @return errorCountGrowthRate
         */
        public Double getErrorCountGrowthRate() {
            return this.errorCountGrowthRate;
        }

        /**
         * @return errorDeviceCount
         */
        public Integer getErrorDeviceCount() {
            return this.errorDeviceCount;
        }

        /**
         * @return errorDeviceCountGrowthRate
         */
        public Double getErrorDeviceCountGrowthRate() {
            return this.errorDeviceCountGrowthRate;
        }

        /**
         * @return errorDeviceRate
         */
        public Double getErrorDeviceRate() {
            return this.errorDeviceRate;
        }

        /**
         * @return errorDeviceRateGrowthRate
         */
        public Double getErrorDeviceRateGrowthRate() {
            return this.errorDeviceRateGrowthRate;
        }

        /**
         * @return errorFileName
         */
        public String getErrorFileName() {
            return this.errorFileName;
        }

        /**
         * @return errorLine
         */
        public String getErrorLine() {
            return this.errorLine;
        }

        /**
         * @return errorName
         */
        public String getErrorName() {
            return this.errorName;
        }

        /**
         * @return errorRate
         */
        public Double getErrorRate() {
            return this.errorRate;
        }

        /**
         * @return errorRateGrowthRate
         */
        public Double getErrorRateGrowthRate() {
            return this.errorRateGrowthRate;
        }

        /**
         * @return errorType
         */
        public String getErrorType() {
            return this.errorType;
        }

        /**
         * @return eventTime
         */
        public Long getEventTime() {
            return this.eventTime;
        }

        /**
         * @return firstVersion
         */
        public String getFirstVersion() {
            return this.firstVersion;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtLatest
         */
        public Long getGmtLatest() {
            return this.gmtLatest;
        }

        /**
         * @return keyLine
         */
        public Integer getKeyLine() {
            return this.keyLine;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return stack
         */
        public String getStack() {
            return this.stack;
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
         * @return symbolicStatus
         */
        public Boolean getSymbolicStatus() {
            return this.symbolicStatus;
        }

        /**
         * @return tags
         */
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private java.util.List<String> affectedVersions; 
            private Long allocSizeMax; 
            private Long allocSizePct50; 
            private Long allocSizePct70; 
            private Long allocSizePct90; 
            private String cruxStack; 
            private String digestHash; 
            private Integer errorColumn; 
            private Integer errorCount; 
            private Double errorCountGrowthRate; 
            private Integer errorDeviceCount; 
            private Double errorDeviceCountGrowthRate; 
            private Double errorDeviceRate; 
            private Double errorDeviceRateGrowthRate; 
            private String errorFileName; 
            private String errorLine; 
            private String errorName; 
            private Double errorRate; 
            private Double errorRateGrowthRate; 
            private String errorType; 
            private Long eventTime; 
            private String firstVersion; 
            private Long gmtCreate; 
            private Long gmtLatest; 
            private Integer keyLine; 
            private String name; 
            private String stack; 
            private Integer status; 
            private String summary; 
            private Boolean symbolicStatus; 
            private java.util.List<String> tags; 

            private Builder() {
            } 

            private Builder(Model model) {
                this.affectedVersions = model.affectedVersions;
                this.allocSizeMax = model.allocSizeMax;
                this.allocSizePct50 = model.allocSizePct50;
                this.allocSizePct70 = model.allocSizePct70;
                this.allocSizePct90 = model.allocSizePct90;
                this.cruxStack = model.cruxStack;
                this.digestHash = model.digestHash;
                this.errorColumn = model.errorColumn;
                this.errorCount = model.errorCount;
                this.errorCountGrowthRate = model.errorCountGrowthRate;
                this.errorDeviceCount = model.errorDeviceCount;
                this.errorDeviceCountGrowthRate = model.errorDeviceCountGrowthRate;
                this.errorDeviceRate = model.errorDeviceRate;
                this.errorDeviceRateGrowthRate = model.errorDeviceRateGrowthRate;
                this.errorFileName = model.errorFileName;
                this.errorLine = model.errorLine;
                this.errorName = model.errorName;
                this.errorRate = model.errorRate;
                this.errorRateGrowthRate = model.errorRateGrowthRate;
                this.errorType = model.errorType;
                this.eventTime = model.eventTime;
                this.firstVersion = model.firstVersion;
                this.gmtCreate = model.gmtCreate;
                this.gmtLatest = model.gmtLatest;
                this.keyLine = model.keyLine;
                this.name = model.name;
                this.stack = model.stack;
                this.status = model.status;
                this.summary = model.summary;
                this.symbolicStatus = model.symbolicStatus;
                this.tags = model.tags;
            } 

            /**
             * AffectedVersions.
             */
            public Builder affectedVersions(java.util.List<String> affectedVersions) {
                this.affectedVersions = affectedVersions;
                return this;
            }

            /**
             * AllocSizeMax.
             */
            public Builder allocSizeMax(Long allocSizeMax) {
                this.allocSizeMax = allocSizeMax;
                return this;
            }

            /**
             * AllocSizePct50.
             */
            public Builder allocSizePct50(Long allocSizePct50) {
                this.allocSizePct50 = allocSizePct50;
                return this;
            }

            /**
             * AllocSizePct70.
             */
            public Builder allocSizePct70(Long allocSizePct70) {
                this.allocSizePct70 = allocSizePct70;
                return this;
            }

            /**
             * AllocSizePct90.
             */
            public Builder allocSizePct90(Long allocSizePct90) {
                this.allocSizePct90 = allocSizePct90;
                return this;
            }

            /**
             * CruxStack.
             */
            public Builder cruxStack(String cruxStack) {
                this.cruxStack = cruxStack;
                return this;
            }

            /**
             * DigestHash.
             */
            public Builder digestHash(String digestHash) {
                this.digestHash = digestHash;
                return this;
            }

            /**
             * ErrorColumn.
             */
            public Builder errorColumn(Integer errorColumn) {
                this.errorColumn = errorColumn;
                return this;
            }

            /**
             * ErrorCount.
             */
            public Builder errorCount(Integer errorCount) {
                this.errorCount = errorCount;
                return this;
            }

            /**
             * ErrorCountGrowthRate.
             */
            public Builder errorCountGrowthRate(Double errorCountGrowthRate) {
                this.errorCountGrowthRate = errorCountGrowthRate;
                return this;
            }

            /**
             * ErrorDeviceCount.
             */
            public Builder errorDeviceCount(Integer errorDeviceCount) {
                this.errorDeviceCount = errorDeviceCount;
                return this;
            }

            /**
             * ErrorDeviceCountGrowthRate.
             */
            public Builder errorDeviceCountGrowthRate(Double errorDeviceCountGrowthRate) {
                this.errorDeviceCountGrowthRate = errorDeviceCountGrowthRate;
                return this;
            }

            /**
             * ErrorDeviceRate.
             */
            public Builder errorDeviceRate(Double errorDeviceRate) {
                this.errorDeviceRate = errorDeviceRate;
                return this;
            }

            /**
             * ErrorDeviceRateGrowthRate.
             */
            public Builder errorDeviceRateGrowthRate(Double errorDeviceRateGrowthRate) {
                this.errorDeviceRateGrowthRate = errorDeviceRateGrowthRate;
                return this;
            }

            /**
             * ErrorFileName.
             */
            public Builder errorFileName(String errorFileName) {
                this.errorFileName = errorFileName;
                return this;
            }

            /**
             * ErrorLine.
             */
            public Builder errorLine(String errorLine) {
                this.errorLine = errorLine;
                return this;
            }

            /**
             * ErrorName.
             */
            public Builder errorName(String errorName) {
                this.errorName = errorName;
                return this;
            }

            /**
             * ErrorRate.
             */
            public Builder errorRate(Double errorRate) {
                this.errorRate = errorRate;
                return this;
            }

            /**
             * ErrorRateGrowthRate.
             */
            public Builder errorRateGrowthRate(Double errorRateGrowthRate) {
                this.errorRateGrowthRate = errorRateGrowthRate;
                return this;
            }

            /**
             * ErrorType.
             */
            public Builder errorType(String errorType) {
                this.errorType = errorType;
                return this;
            }

            /**
             * EventTime.
             */
            public Builder eventTime(Long eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * FirstVersion.
             */
            public Builder firstVersion(String firstVersion) {
                this.firstVersion = firstVersion;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtLatest.
             */
            public Builder gmtLatest(Long gmtLatest) {
                this.gmtLatest = gmtLatest;
                return this;
            }

            /**
             * KeyLine.
             */
            public Builder keyLine(Integer keyLine) {
                this.keyLine = keyLine;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Stack.
             */
            public Builder stack(String stack) {
                this.stack = stack;
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
             * SymbolicStatus.
             */
            public Builder symbolicStatus(Boolean symbolicStatus) {
                this.symbolicStatus = symbolicStatus;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<String> tags) {
                this.tags = tags;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
