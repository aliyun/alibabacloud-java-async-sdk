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
 * {@link ListQualityWatchTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListQualityWatchTasksResponseBody</p>
 */
public class ListQualityWatchTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageResult")
    private PageResult pageResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListQualityWatchTasksResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageResult = builder.pageResult;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQualityWatchTasksResponseBody create() {
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
     * @return pageResult
     */
    public PageResult getPageResult() {
        return this.pageResult;
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
        private Integer httpStatusCode; 
        private String message; 
        private PageResult pageResult; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListQualityWatchTasksResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageResult = model.pageResult;
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
         * PageResult.
         */
        public Builder pageResult(PageResult pageResult) {
            this.pageResult = pageResult;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListQualityWatchTasksResponseBody build() {
            return new ListQualityWatchTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListQualityWatchTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListQualityWatchTasksResponseBody</p>
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
             * ErrorRuleCount.
             */
            public Builder errorRuleCount(Long errorRuleCount) {
                this.errorRuleCount = errorRuleCount;
                return this;
            }

            /**
             * FinishedRuleCount.
             */
            public Builder finishedRuleCount(Long finishedRuleCount) {
                this.finishedRuleCount = finishedRuleCount;
                return this;
            }

            /**
             * SuccessRuleCount.
             */
            public Builder successRuleCount(Long successRuleCount) {
                this.successRuleCount = successRuleCount;
                return this;
            }

            /**
             * TotalRuleCount.
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
     * {@link ListQualityWatchTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListQualityWatchTasksResponseBody</p>
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
             * ErrorRuleCount.
             */
            public Builder errorRuleCount(Long errorRuleCount) {
                this.errorRuleCount = errorRuleCount;
                return this;
            }

            /**
             * FinishedRuleCount.
             */
            public Builder finishedRuleCount(Long finishedRuleCount) {
                this.finishedRuleCount = finishedRuleCount;
                return this;
            }

            /**
             * SuccessRuleCount.
             */
            public Builder successRuleCount(Long successRuleCount) {
                this.successRuleCount = successRuleCount;
                return this;
            }

            /**
             * TotalRuleCount.
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
     * {@link ListQualityWatchTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListQualityWatchTasksResponseBody</p>
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
             * ErrorRuleCount.
             */
            public Builder errorRuleCount(Long errorRuleCount) {
                this.errorRuleCount = errorRuleCount;
                return this;
            }

            /**
             * FinishedRuleCount.
             */
            public Builder finishedRuleCount(Long finishedRuleCount) {
                this.finishedRuleCount = finishedRuleCount;
                return this;
            }

            /**
             * SuccessRuleCount.
             */
            public Builder successRuleCount(Long successRuleCount) {
                this.successRuleCount = successRuleCount;
                return this;
            }

            /**
             * TotalRuleCount.
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
     * {@link ListQualityWatchTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListQualityWatchTasksResponseBody</p>
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
             * StrongRuleCount.
             */
            public Builder strongRuleCount(StrongRuleCount strongRuleCount) {
                this.strongRuleCount = strongRuleCount;
                return this;
            }

            /**
             * ValidateRuleCount.
             */
            public Builder validateRuleCount(ValidateRuleCount validateRuleCount) {
                this.validateRuleCount = validateRuleCount;
                return this;
            }

            /**
             * WeakRuleCount.
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
     * {@link ListQualityWatchTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListQualityWatchTasksResponseBody</p>
     */
    public static class QualityWatchTaskList extends TeaModel {
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

        private QualityWatchTaskList(Builder builder) {
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

        public static QualityWatchTaskList create() {
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

            private Builder(QualityWatchTaskList model) {
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
             * BizDate.
             */
            public Builder bizDate(String bizDate) {
                this.bizDate = bizDate;
                return this;
            }

            /**
             * BizDateFormat.
             */
            public Builder bizDateFormat(String bizDateFormat) {
                this.bizDateFormat = bizDateFormat;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
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
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * QualityOwner.
             */
            public Builder qualityOwner(String qualityOwner) {
                this.qualityOwner = qualityOwner;
                return this;
            }

            /**
             * QualityOwnerName.
             */
            public Builder qualityOwnerName(String qualityOwnerName) {
                this.qualityOwnerName = qualityOwnerName;
                return this;
            }

            /**
             * RuleCountInfo.
             */
            public Builder ruleCountInfo(RuleCountInfo ruleCountInfo) {
                this.ruleCountInfo = ruleCountInfo;
                return this;
            }

            /**
             * RuleIdList.
             */
            public Builder ruleIdList(java.util.List<Long> ruleIdList) {
                this.ruleIdList = ruleIdList;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * WatchId.
             */
            public Builder watchId(Long watchId) {
                this.watchId = watchId;
                return this;
            }

            public QualityWatchTaskList build() {
                return new QualityWatchTaskList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListQualityWatchTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListQualityWatchTasksResponseBody</p>
     */
    public static class PageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QualityWatchTaskList")
        private java.util.List<QualityWatchTaskList> qualityWatchTaskList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private PageResult(Builder builder) {
            this.qualityWatchTaskList = builder.qualityWatchTaskList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageResult create() {
            return builder().build();
        }

        /**
         * @return qualityWatchTaskList
         */
        public java.util.List<QualityWatchTaskList> getQualityWatchTaskList() {
            return this.qualityWatchTaskList;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<QualityWatchTaskList> qualityWatchTaskList; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(PageResult model) {
                this.qualityWatchTaskList = model.qualityWatchTaskList;
                this.totalCount = model.totalCount;
            } 

            /**
             * QualityWatchTaskList.
             */
            public Builder qualityWatchTaskList(java.util.List<QualityWatchTaskList> qualityWatchTaskList) {
                this.qualityWatchTaskList = qualityWatchTaskList;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageResult build() {
                return new PageResult(this);
            } 

        } 

    }
}
