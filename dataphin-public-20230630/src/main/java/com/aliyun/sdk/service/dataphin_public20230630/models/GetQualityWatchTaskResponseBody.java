// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetQualityWatchTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetQualityWatchTaskResponseBody</p>
 */
public class GetQualityWatchTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("WatchTaskInfo")
    private WatchTaskInfo watchTaskInfo;

    private GetQualityWatchTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.watchTaskInfo = builder.watchTaskInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQualityWatchTaskResponseBody create() {
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

    /**
     * @return watchTaskInfo
     */
    public WatchTaskInfo getWatchTaskInfo() {
        return this.watchTaskInfo;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private WatchTaskInfo watchTaskInfo; 

        private Builder() {
        } 

        private Builder(GetQualityWatchTaskResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.watchTaskInfo = model.watchTaskInfo;
        } 

        /**
         * <p>The backend response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The details of the backend exception.</p>
         * 
         * <strong>example:</strong>
         * <p>internal error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The details of the monitoring node task object.</p>
         */
        public Builder watchTaskInfo(WatchTaskInfo watchTaskInfo) {
            this.watchTaskInfo = watchTaskInfo;
            return this;
        }

        public GetQualityWatchTaskResponseBody build() {
            return new GetQualityWatchTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetQualityWatchTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityWatchTaskResponseBody</p>
     */
    public static class StrongRuleCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorRuleCount")
        private Long errorRuleCount;

        @com.aliyun.core.annotation.NameInMap("FinishedRuleCount")
        private Long finishedRuleCount;

        @com.aliyun.core.annotation.NameInMap("SuccessRuleCount")
        private Long successRuleCount;

        @com.aliyun.core.annotation.NameInMap("TotalRuleCount")
        private Long totalRuleCount;

        private StrongRuleCount(Builder builder) {
            this.errorRuleCount = builder.errorRuleCount;
            this.finishedRuleCount = builder.finishedRuleCount;
            this.successRuleCount = builder.successRuleCount;
            this.totalRuleCount = builder.totalRuleCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StrongRuleCount create() {
            return builder().build();
        }

        /**
         * @return errorRuleCount
         */
        public Long getErrorRuleCount() {
            return this.errorRuleCount;
        }

        /**
         * @return finishedRuleCount
         */
        public Long getFinishedRuleCount() {
            return this.finishedRuleCount;
        }

        /**
         * @return successRuleCount
         */
        public Long getSuccessRuleCount() {
            return this.successRuleCount;
        }

        /**
         * @return totalRuleCount
         */
        public Long getTotalRuleCount() {
            return this.totalRuleCount;
        }

        public static final class Builder {
            private Long errorRuleCount; 
            private Long finishedRuleCount; 
            private Long successRuleCount; 
            private Long totalRuleCount; 

            private Builder() {
            } 

            private Builder(StrongRuleCount model) {
                this.errorRuleCount = model.errorRuleCount;
                this.finishedRuleCount = model.finishedRuleCount;
                this.successRuleCount = model.successRuleCount;
                this.totalRuleCount = model.totalRuleCount;
            } 

            /**
             * <p>The number of rules that failed to execute.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder errorRuleCount(Long errorRuleCount) {
                this.errorRuleCount = errorRuleCount;
                return this;
            }

            /**
             * <p>The number of rules that have been executed.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder finishedRuleCount(Long finishedRuleCount) {
                this.finishedRuleCount = finishedRuleCount;
                return this;
            }

            /**
             * <p>The number of rules that were executed successfully.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder successRuleCount(Long successRuleCount) {
                this.successRuleCount = successRuleCount;
                return this;
            }

            /**
             * <p>The total number of rules.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalRuleCount(Long totalRuleCount) {
                this.totalRuleCount = totalRuleCount;
                return this;
            }

            public StrongRuleCount build() {
                return new StrongRuleCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetQualityWatchTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityWatchTaskResponseBody</p>
     */
    public static class ValidateRuleCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorRuleCount")
        private Long errorRuleCount;

        @com.aliyun.core.annotation.NameInMap("FinishedRuleCount")
        private Long finishedRuleCount;

        @com.aliyun.core.annotation.NameInMap("SuccessRuleCount")
        private Long successRuleCount;

        @com.aliyun.core.annotation.NameInMap("TotalRuleCount")
        private Long totalRuleCount;

        private ValidateRuleCount(Builder builder) {
            this.errorRuleCount = builder.errorRuleCount;
            this.finishedRuleCount = builder.finishedRuleCount;
            this.successRuleCount = builder.successRuleCount;
            this.totalRuleCount = builder.totalRuleCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValidateRuleCount create() {
            return builder().build();
        }

        /**
         * @return errorRuleCount
         */
        public Long getErrorRuleCount() {
            return this.errorRuleCount;
        }

        /**
         * @return finishedRuleCount
         */
        public Long getFinishedRuleCount() {
            return this.finishedRuleCount;
        }

        /**
         * @return successRuleCount
         */
        public Long getSuccessRuleCount() {
            return this.successRuleCount;
        }

        /**
         * @return totalRuleCount
         */
        public Long getTotalRuleCount() {
            return this.totalRuleCount;
        }

        public static final class Builder {
            private Long errorRuleCount; 
            private Long finishedRuleCount; 
            private Long successRuleCount; 
            private Long totalRuleCount; 

            private Builder() {
            } 

            private Builder(ValidateRuleCount model) {
                this.errorRuleCount = model.errorRuleCount;
                this.finishedRuleCount = model.finishedRuleCount;
                this.successRuleCount = model.successRuleCount;
                this.totalRuleCount = model.totalRuleCount;
            } 

            /**
             * <p>The number of rules that failed to execute.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder errorRuleCount(Long errorRuleCount) {
                this.errorRuleCount = errorRuleCount;
                return this;
            }

            /**
             * <p>The number of rules that have been executed.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder finishedRuleCount(Long finishedRuleCount) {
                this.finishedRuleCount = finishedRuleCount;
                return this;
            }

            /**
             * <p>The number of rules that were executed successfully.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder successRuleCount(Long successRuleCount) {
                this.successRuleCount = successRuleCount;
                return this;
            }

            /**
             * <p>The total number of rules.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalRuleCount(Long totalRuleCount) {
                this.totalRuleCount = totalRuleCount;
                return this;
            }

            public ValidateRuleCount build() {
                return new ValidateRuleCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetQualityWatchTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityWatchTaskResponseBody</p>
     */
    public static class WeakRuleCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorRuleCount")
        private Long errorRuleCount;

        @com.aliyun.core.annotation.NameInMap("FinishedRuleCount")
        private Long finishedRuleCount;

        @com.aliyun.core.annotation.NameInMap("SuccessRuleCount")
        private Long successRuleCount;

        @com.aliyun.core.annotation.NameInMap("TotalRuleCount")
        private Long totalRuleCount;

        private WeakRuleCount(Builder builder) {
            this.errorRuleCount = builder.errorRuleCount;
            this.finishedRuleCount = builder.finishedRuleCount;
            this.successRuleCount = builder.successRuleCount;
            this.totalRuleCount = builder.totalRuleCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WeakRuleCount create() {
            return builder().build();
        }

        /**
         * @return errorRuleCount
         */
        public Long getErrorRuleCount() {
            return this.errorRuleCount;
        }

        /**
         * @return finishedRuleCount
         */
        public Long getFinishedRuleCount() {
            return this.finishedRuleCount;
        }

        /**
         * @return successRuleCount
         */
        public Long getSuccessRuleCount() {
            return this.successRuleCount;
        }

        /**
         * @return totalRuleCount
         */
        public Long getTotalRuleCount() {
            return this.totalRuleCount;
        }

        public static final class Builder {
            private Long errorRuleCount; 
            private Long finishedRuleCount; 
            private Long successRuleCount; 
            private Long totalRuleCount; 

            private Builder() {
            } 

            private Builder(WeakRuleCount model) {
                this.errorRuleCount = model.errorRuleCount;
                this.finishedRuleCount = model.finishedRuleCount;
                this.successRuleCount = model.successRuleCount;
                this.totalRuleCount = model.totalRuleCount;
            } 

            /**
             * <p>The number of rules that failed to execute.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder errorRuleCount(Long errorRuleCount) {
                this.errorRuleCount = errorRuleCount;
                return this;
            }

            /**
             * <p>The number of rules that have been executed.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder finishedRuleCount(Long finishedRuleCount) {
                this.finishedRuleCount = finishedRuleCount;
                return this;
            }

            /**
             * <p>The number of rules that were executed successfully.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder successRuleCount(Long successRuleCount) {
                this.successRuleCount = successRuleCount;
                return this;
            }

            /**
             * <p>The total number of rules.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalRuleCount(Long totalRuleCount) {
                this.totalRuleCount = totalRuleCount;
                return this;
            }

            public WeakRuleCount build() {
                return new WeakRuleCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetQualityWatchTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityWatchTaskResponseBody</p>
     */
    public static class RuleCountInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StrongRuleCount")
        private StrongRuleCount strongRuleCount;

        @com.aliyun.core.annotation.NameInMap("ValidateRuleCount")
        private ValidateRuleCount validateRuleCount;

        @com.aliyun.core.annotation.NameInMap("WeakRuleCount")
        private WeakRuleCount weakRuleCount;

        private RuleCountInfo(Builder builder) {
            this.strongRuleCount = builder.strongRuleCount;
            this.validateRuleCount = builder.validateRuleCount;
            this.weakRuleCount = builder.weakRuleCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleCountInfo create() {
            return builder().build();
        }

        /**
         * @return strongRuleCount
         */
        public StrongRuleCount getStrongRuleCount() {
            return this.strongRuleCount;
        }

        /**
         * @return validateRuleCount
         */
        public ValidateRuleCount getValidateRuleCount() {
            return this.validateRuleCount;
        }

        /**
         * @return weakRuleCount
         */
        public WeakRuleCount getWeakRuleCount() {
            return this.weakRuleCount;
        }

        public static final class Builder {
            private StrongRuleCount strongRuleCount; 
            private ValidateRuleCount validateRuleCount; 
            private WeakRuleCount weakRuleCount; 

            private Builder() {
            } 

            private Builder(RuleCountInfo model) {
                this.strongRuleCount = model.strongRuleCount;
                this.validateRuleCount = model.validateRuleCount;
                this.weakRuleCount = model.weakRuleCount;
            } 

            /**
             * <p>The strong rule count.</p>
             */
            public Builder strongRuleCount(StrongRuleCount strongRuleCount) {
                this.strongRuleCount = strongRuleCount;
                return this;
            }

            /**
             * <p>The validation rule count.</p>
             */
            public Builder validateRuleCount(ValidateRuleCount validateRuleCount) {
                this.validateRuleCount = validateRuleCount;
                return this;
            }

            /**
             * <p>The weak rule count.</p>
             */
            public Builder weakRuleCount(WeakRuleCount weakRuleCount) {
                this.weakRuleCount = weakRuleCount;
                return this;
            }

            public RuleCountInfo build() {
                return new RuleCountInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetQualityWatchTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityWatchTaskResponseBody</p>
     */
    public static class WatchTaskInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizDate")
        private String bizDate;

        @com.aliyun.core.annotation.NameInMap("BizDateFormat")
        private String bizDateFormat;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("QualityOwner")
        private String qualityOwner;

        @com.aliyun.core.annotation.NameInMap("QualityOwnerName")
        private String qualityOwnerName;

        @com.aliyun.core.annotation.NameInMap("RuleCountInfo")
        private RuleCountInfo ruleCountInfo;

        @com.aliyun.core.annotation.NameInMap("RuleIdList")
        private java.util.List<Long> ruleIdList;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("WatchId")
        private Long watchId;

        private WatchTaskInfo(Builder builder) {
            this.bizDate = builder.bizDate;
            this.bizDateFormat = builder.bizDateFormat;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.endTime = builder.endTime;
            this.id = builder.id;
            this.modifier = builder.modifier;
            this.modifyTime = builder.modifyTime;
            this.qualityOwner = builder.qualityOwner;
            this.qualityOwnerName = builder.qualityOwnerName;
            this.ruleCountInfo = builder.ruleCountInfo;
            this.ruleIdList = builder.ruleIdList;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.watchId = builder.watchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WatchTaskInfo create() {
            return builder().build();
        }

        /**
         * @return bizDate
         */
        public String getBizDate() {
            return this.bizDate;
        }

        /**
         * @return bizDateFormat
         */
        public String getBizDateFormat() {
            return this.bizDateFormat;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return qualityOwner
         */
        public String getQualityOwner() {
            return this.qualityOwner;
        }

        /**
         * @return qualityOwnerName
         */
        public String getQualityOwnerName() {
            return this.qualityOwnerName;
        }

        /**
         * @return ruleCountInfo
         */
        public RuleCountInfo getRuleCountInfo() {
            return this.ruleCountInfo;
        }

        /**
         * @return ruleIdList
         */
        public java.util.List<Long> getRuleIdList() {
            return this.ruleIdList;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return watchId
         */
        public Long getWatchId() {
            return this.watchId;
        }

        public static final class Builder {
            private String bizDate; 
            private String bizDateFormat; 
            private String createTime; 
            private String creator; 
            private String endTime; 
            private Long id; 
            private String modifier; 
            private String modifyTime; 
            private String qualityOwner; 
            private String qualityOwnerName; 
            private RuleCountInfo ruleCountInfo; 
            private java.util.List<Long> ruleIdList; 
            private String startTime; 
            private String status; 
            private Long watchId; 

            private Builder() {
            } 

            private Builder(WatchTaskInfo model) {
                this.bizDate = model.bizDate;
                this.bizDateFormat = model.bizDateFormat;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.endTime = model.endTime;
                this.id = model.id;
                this.modifier = model.modifier;
                this.modifyTime = model.modifyTime;
                this.qualityOwner = model.qualityOwner;
                this.qualityOwnerName = model.qualityOwnerName;
                this.ruleCountInfo = model.ruleCountInfo;
                this.ruleIdList = model.ruleIdList;
                this.startTime = model.startTime;
                this.status = model.status;
                this.watchId = model.watchId;
            } 

            /**
             * <p>The business date.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-30</p>
             */
            public Builder bizDate(String bizDate) {
                this.bizDate = bizDate;
                return this;
            }

            /**
             * <p>The business date format.</p>
             * 
             * <strong>example:</strong>
             * <p>yyyy-MM-dd</p>
             */
            public Builder bizDateFormat(String bizDateFormat) {
                this.bizDateFormat = bizDateFormat;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-30 00:00:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The creator.</p>
             * 
             * <strong>example:</strong>
             * <p>30012011</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The end time. Time format: yyyy-MM-dd HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-30 20:00:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The quality watchtask ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The user ID of the last modifier.</p>
             * 
             * <strong>example:</strong>
             * <p>30012011</p>
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-30 00:00:00</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The user ID of the quality owner.</p>
             * 
             * <strong>example:</strong>
             * <p>30012011</p>
             */
            public Builder qualityOwner(String qualityOwner) {
                this.qualityOwner = qualityOwner;
                return this;
            }

            /**
             * <p>The name of the quality owner.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder qualityOwnerName(String qualityOwnerName) {
                this.qualityOwnerName = qualityOwnerName;
                return this;
            }

            /**
             * <p>The quality rule count information.</p>
             */
            public Builder ruleCountInfo(RuleCountInfo ruleCountInfo) {
                this.ruleCountInfo = ruleCountInfo;
                return this;
            }

            /**
             * <p>The list of quality rule IDs.</p>
             */
            public Builder ruleIdList(java.util.List<Long> ruleIdList) {
                this.ruleIdList = ruleIdList;
                return this;
            }

            /**
             * <p>The start time. Time format: yyyy-MM-dd HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-30 08:00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li>NOT_RUN: not executed.</li>
             * <li>WAITING: waiting.</li>
             * <li>RUNNING: executing.</li>
             * <li>SUCCESS: executed successfully.</li>
             * <li>FAILED: execution failed.</li>
             * <li>CANCEL: canceled.</li>
             * <li>TIMEOUT: timed out.</li>
             * <li>OFFLINE: offline.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The monitored object ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder watchId(Long watchId) {
                this.watchId = watchId;
                return this;
            }

            public WatchTaskInfo build() {
                return new WatchTaskInfo(this);
            } 

        } 

    }
}
