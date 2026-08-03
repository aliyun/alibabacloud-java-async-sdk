// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link GetAICoachDebugResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetAICoachDebugResultResponseBody</p>
 */
public class GetAICoachDebugResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("aliyunSubId")
    private String aliyunSubId;

    @com.aliyun.core.annotation.NameInMap("dataId")
    private String dataId;

    @com.aliyun.core.annotation.NameInMap("dataType")
    private Long dataType;

    @com.aliyun.core.annotation.NameInMap("dialogueList")
    private java.util.List<DialogueList> dialogueList;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("finishTime")
    private String finishTime;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("scriptDebugId")
    private String scriptDebugId;

    @com.aliyun.core.annotation.NameInMap("status")
    private Long status;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("taskReport")
    private TaskReport taskReport;

    private GetAICoachDebugResultResponseBody(Builder builder) {
        this.aliyunSubId = builder.aliyunSubId;
        this.dataId = builder.dataId;
        this.dataType = builder.dataType;
        this.dialogueList = builder.dialogueList;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.finishTime = builder.finishTime;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.requestId = builder.requestId;
        this.scriptDebugId = builder.scriptDebugId;
        this.status = builder.status;
        this.success = builder.success;
        this.taskId = builder.taskId;
        this.taskReport = builder.taskReport;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAICoachDebugResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunSubId
     */
    public String getAliyunSubId() {
        return this.aliyunSubId;
    }

    /**
     * @return dataId
     */
    public String getDataId() {
        return this.dataId;
    }

    /**
     * @return dataType
     */
    public Long getDataType() {
        return this.dataType;
    }

    /**
     * @return dialogueList
     */
    public java.util.List<DialogueList> getDialogueList() {
        return this.dialogueList;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return finishTime
     */
    public String getFinishTime() {
        return this.finishTime;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scriptDebugId
     */
    public String getScriptDebugId() {
        return this.scriptDebugId;
    }

    /**
     * @return status
     */
    public Long getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskReport
     */
    public TaskReport getTaskReport() {
        return this.taskReport;
    }

    public static final class Builder {
        private String aliyunSubId; 
        private String dataId; 
        private Long dataType; 
        private java.util.List<DialogueList> dialogueList; 
        private String errorCode; 
        private String errorMessage; 
        private String finishTime; 
        private String gmtCreate; 
        private String gmtModified; 
        private String requestId; 
        private String scriptDebugId; 
        private Long status; 
        private Boolean success; 
        private String taskId; 
        private TaskReport taskReport; 

        private Builder() {
        } 

        private Builder(GetAICoachDebugResultResponseBody model) {
            this.aliyunSubId = model.aliyunSubId;
            this.dataId = model.dataId;
            this.dataType = model.dataType;
            this.dialogueList = model.dialogueList;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.finishTime = model.finishTime;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.requestId = model.requestId;
            this.scriptDebugId = model.scriptDebugId;
            this.status = model.status;
            this.success = model.success;
            this.taskId = model.taskId;
            this.taskReport = model.taskReport;
        } 

        /**
         * aliyunSubId.
         */
        public Builder aliyunSubId(String aliyunSubId) {
            this.aliyunSubId = aliyunSubId;
            return this;
        }

        /**
         * dataId.
         */
        public Builder dataId(String dataId) {
            this.dataId = dataId;
            return this;
        }

        /**
         * dataType.
         */
        public Builder dataType(Long dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * dialogueList.
         */
        public Builder dialogueList(java.util.List<DialogueList> dialogueList) {
            this.dialogueList = dialogueList;
            return this;
        }

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * finishTime.
         */
        public Builder finishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2226A26A-26E5-5AB9-A14A-54D612FCF96A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>debugId</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scriptDebugId(String scriptDebugId) {
            this.scriptDebugId = scriptDebugId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(Long status) {
            this.status = status;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * taskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * taskReport.
         */
        public Builder taskReport(TaskReport taskReport) {
            this.taskReport = taskReport;
            return this;
        }

        public GetAICoachDebugResultResponseBody build() {
            return new GetAICoachDebugResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAICoachDebugResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAICoachDebugResultResponseBody</p>
     */
    public static class DialogueList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        private DialogueList(Builder builder) {
            this.message = builder.message;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DialogueList create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String message; 
            private String role; 

            private Builder() {
            } 

            private Builder(DialogueList model) {
                this.message = model.message;
                this.role = model.role;
            } 

            /**
             * message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public DialogueList build() {
                return new DialogueList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAICoachDebugResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAICoachDebugResultResponseBody</p>
     */
    public static class DeductionRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("hit")
        private Boolean hit;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("reason")
        private java.util.List<String> reason;

        private DeductionRule(Builder builder) {
            this.hit = builder.hit;
            this.name = builder.name;
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeductionRule create() {
            return builder().build();
        }

        /**
         * @return hit
         */
        public Boolean getHit() {
            return this.hit;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return reason
         */
        public java.util.List<String> getReason() {
            return this.reason;
        }

        public static final class Builder {
            private Boolean hit; 
            private String name; 
            private java.util.List<String> reason; 

            private Builder() {
            } 

            private Builder(DeductionRule model) {
                this.hit = model.hit;
                this.name = model.name;
                this.reason = model.reason;
            } 

            /**
             * hit.
             */
            public Builder hit(Boolean hit) {
                this.hit = hit;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * reason.
             */
            public Builder reason(java.util.List<String> reason) {
                this.reason = reason;
                return this;
            }

            public DeductionRule build() {
                return new DeductionRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAICoachDebugResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAICoachDebugResultResponseBody</p>
     */
    public static class Expressiveness extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("reason")
        private java.util.List<String> reason;

        @com.aliyun.core.annotation.NameInMap("scoreRounds")
        private Integer scoreRounds;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("totalRounds")
        private Integer totalRounds;

        private Expressiveness(Builder builder) {
            this.name = builder.name;
            this.reason = builder.reason;
            this.scoreRounds = builder.scoreRounds;
            this.status = builder.status;
            this.totalRounds = builder.totalRounds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Expressiveness create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return reason
         */
        public java.util.List<String> getReason() {
            return this.reason;
        }

        /**
         * @return scoreRounds
         */
        public Integer getScoreRounds() {
            return this.scoreRounds;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalRounds
         */
        public Integer getTotalRounds() {
            return this.totalRounds;
        }

        public static final class Builder {
            private String name; 
            private java.util.List<String> reason; 
            private Integer scoreRounds; 
            private String status; 
            private Integer totalRounds; 

            private Builder() {
            } 

            private Builder(Expressiveness model) {
                this.name = model.name;
                this.reason = model.reason;
                this.scoreRounds = model.scoreRounds;
                this.status = model.status;
                this.totalRounds = model.totalRounds;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * reason.
             */
            public Builder reason(java.util.List<String> reason) {
                this.reason = reason;
                return this;
            }

            /**
             * scoreRounds.
             */
            public Builder scoreRounds(Integer scoreRounds) {
                this.scoreRounds = scoreRounds;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * totalRounds.
             */
            public Builder totalRounds(Integer totalRounds) {
                this.totalRounds = totalRounds;
                return this;
            }

            public Expressiveness build() {
                return new Expressiveness(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAICoachDebugResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAICoachDebugResultResponseBody</p>
     */
    public static class AnswerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("reason")
        private java.util.List<String> reason;

        @com.aliyun.core.annotation.NameInMap("status")
        private Long status;

        private AnswerList(Builder builder) {
            this.reason = builder.reason;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnswerList create() {
            return builder().build();
        }

        /**
         * @return reason
         */
        public java.util.List<String> getReason() {
            return this.reason;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List<String> reason; 
            private Long status; 

            private Builder() {
            } 

            private Builder(AnswerList model) {
                this.reason = model.reason;
                this.status = model.status;
            } 

            /**
             * reason.
             */
            public Builder reason(java.util.List<String> reason) {
                this.reason = reason;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            public AnswerList build() {
                return new AnswerList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAICoachDebugResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAICoachDebugResultResponseBody</p>
     */
    public static class Point extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("answerList")
        private java.util.List<AnswerList> answerList;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Point(Builder builder) {
            this.answerList = builder.answerList;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Point create() {
            return builder().build();
        }

        /**
         * @return answerList
         */
        public java.util.List<AnswerList> getAnswerList() {
            return this.answerList;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<AnswerList> answerList; 
            private String name; 

            private Builder() {
            } 

            private Builder(Point model) {
                this.answerList = model.answerList;
                this.name = model.name;
            } 

            /**
             * answerList.
             */
            public Builder answerList(java.util.List<AnswerList> answerList) {
                this.answerList = answerList;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Point build() {
                return new Point(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAICoachDebugResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetAICoachDebugResultResponseBody</p>
     */
    public static class TaskReport extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deductionRule")
        private DeductionRule deductionRule;

        @com.aliyun.core.annotation.NameInMap("expressiveness")
        private Expressiveness expressiveness;

        @com.aliyun.core.annotation.NameInMap("point")
        private Point point;

        private TaskReport(Builder builder) {
            this.deductionRule = builder.deductionRule;
            this.expressiveness = builder.expressiveness;
            this.point = builder.point;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskReport create() {
            return builder().build();
        }

        /**
         * @return deductionRule
         */
        public DeductionRule getDeductionRule() {
            return this.deductionRule;
        }

        /**
         * @return expressiveness
         */
        public Expressiveness getExpressiveness() {
            return this.expressiveness;
        }

        /**
         * @return point
         */
        public Point getPoint() {
            return this.point;
        }

        public static final class Builder {
            private DeductionRule deductionRule; 
            private Expressiveness expressiveness; 
            private Point point; 

            private Builder() {
            } 

            private Builder(TaskReport model) {
                this.deductionRule = model.deductionRule;
                this.expressiveness = model.expressiveness;
                this.point = model.point;
            } 

            /**
             * deductionRule.
             */
            public Builder deductionRule(DeductionRule deductionRule) {
                this.deductionRule = deductionRule;
                return this;
            }

            /**
             * expressiveness.
             */
            public Builder expressiveness(Expressiveness expressiveness) {
                this.expressiveness = expressiveness;
                return this;
            }

            /**
             * point.
             */
            public Builder point(Point point) {
                this.point = point;
                return this;
            }

            public TaskReport build() {
                return new TaskReport(this);
            } 

        } 

    }
}
