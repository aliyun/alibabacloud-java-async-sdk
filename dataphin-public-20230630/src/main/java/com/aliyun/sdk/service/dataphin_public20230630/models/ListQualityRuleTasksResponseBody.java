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
 * {@link ListQualityRuleTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListQualityRuleTasksResponseBody</p>
 */
public class ListQualityRuleTasksResponseBody extends TeaModel {
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

    private ListQualityRuleTasksResponseBody(Builder builder) {
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

    public static ListQualityRuleTasksResponseBody create() {
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

        private Builder(ListQualityRuleTasksResponseBody model) {
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

        public ListQualityRuleTasksResponseBody build() {
            return new ListQualityRuleTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListQualityRuleTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListQualityRuleTasksResponseBody</p>
     */
    public static class QualityRuleTaskList extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Long templateId;

        @com.aliyun.core.annotation.NameInMap("ValidateObjectName")
        private String validateObjectName;

        @com.aliyun.core.annotation.NameInMap("ValidateObjectType")
        private String validateObjectType;

        @com.aliyun.core.annotation.NameInMap("ValidatePartition")
        private String validatePartition;

        @com.aliyun.core.annotation.NameInMap("ValidateSuccess")
        private Boolean validateSuccess;

        @com.aliyun.core.annotation.NameInMap("WatchId")
        private Long watchId;

        @com.aliyun.core.annotation.NameInMap("WatchTaskId")
        private Long watchTaskId;

        private QualityRuleTaskList(Builder builder) {
            this.bizDate = builder.bizDate;
            this.bizDateFormat = builder.bizDateFormat;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.endTime = builder.endTime;
            this.id = builder.id;
            this.modifier = builder.modifier;
            this.modifyTime = builder.modifyTime;
            this.ruleId = builder.ruleId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.templateId = builder.templateId;
            this.validateObjectName = builder.validateObjectName;
            this.validateObjectType = builder.validateObjectType;
            this.validatePartition = builder.validatePartition;
            this.validateSuccess = builder.validateSuccess;
            this.watchId = builder.watchId;
            this.watchTaskId = builder.watchTaskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QualityRuleTaskList create() {
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
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
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
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        /**
         * @return validateObjectName
         */
        public String getValidateObjectName() {
            return this.validateObjectName;
        }

        /**
         * @return validateObjectType
         */
        public String getValidateObjectType() {
            return this.validateObjectType;
        }

        /**
         * @return validatePartition
         */
        public String getValidatePartition() {
            return this.validatePartition;
        }

        /**
         * @return validateSuccess
         */
        public Boolean getValidateSuccess() {
            return this.validateSuccess;
        }

        /**
         * @return watchId
         */
        public Long getWatchId() {
            return this.watchId;
        }

        /**
         * @return watchTaskId
         */
        public Long getWatchTaskId() {
            return this.watchTaskId;
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
            private Long ruleId; 
            private String startTime; 
            private String status; 
            private Long templateId; 
            private String validateObjectName; 
            private String validateObjectType; 
            private String validatePartition; 
            private Boolean validateSuccess; 
            private Long watchId; 
            private Long watchTaskId; 

            private Builder() {
            } 

            private Builder(QualityRuleTaskList model) {
                this.bizDate = model.bizDate;
                this.bizDateFormat = model.bizDateFormat;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.endTime = model.endTime;
                this.id = model.id;
                this.modifier = model.modifier;
                this.modifyTime = model.modifyTime;
                this.ruleId = model.ruleId;
                this.startTime = model.startTime;
                this.status = model.status;
                this.templateId = model.templateId;
                this.validateObjectName = model.validateObjectName;
                this.validateObjectType = model.validateObjectType;
                this.validatePartition = model.validatePartition;
                this.validateSuccess = model.validateSuccess;
                this.watchId = model.watchId;
                this.watchTaskId = model.watchTaskId;
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
             * RuleId.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
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
             * TemplateId.
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * ValidateObjectName.
             */
            public Builder validateObjectName(String validateObjectName) {
                this.validateObjectName = validateObjectName;
                return this;
            }

            /**
             * ValidateObjectType.
             */
            public Builder validateObjectType(String validateObjectType) {
                this.validateObjectType = validateObjectType;
                return this;
            }

            /**
             * ValidatePartition.
             */
            public Builder validatePartition(String validatePartition) {
                this.validatePartition = validatePartition;
                return this;
            }

            /**
             * ValidateSuccess.
             */
            public Builder validateSuccess(Boolean validateSuccess) {
                this.validateSuccess = validateSuccess;
                return this;
            }

            /**
             * WatchId.
             */
            public Builder watchId(Long watchId) {
                this.watchId = watchId;
                return this;
            }

            /**
             * WatchTaskId.
             */
            public Builder watchTaskId(Long watchTaskId) {
                this.watchTaskId = watchTaskId;
                return this;
            }

            public QualityRuleTaskList build() {
                return new QualityRuleTaskList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListQualityRuleTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListQualityRuleTasksResponseBody</p>
     */
    public static class PageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QualityRuleTaskList")
        private java.util.List<QualityRuleTaskList> qualityRuleTaskList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private PageResult(Builder builder) {
            this.qualityRuleTaskList = builder.qualityRuleTaskList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageResult create() {
            return builder().build();
        }

        /**
         * @return qualityRuleTaskList
         */
        public java.util.List<QualityRuleTaskList> getQualityRuleTaskList() {
            return this.qualityRuleTaskList;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<QualityRuleTaskList> qualityRuleTaskList; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(PageResult model) {
                this.qualityRuleTaskList = model.qualityRuleTaskList;
                this.totalCount = model.totalCount;
            } 

            /**
             * QualityRuleTaskList.
             */
            public Builder qualityRuleTaskList(java.util.List<QualityRuleTaskList> qualityRuleTaskList) {
                this.qualityRuleTaskList = qualityRuleTaskList;
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
