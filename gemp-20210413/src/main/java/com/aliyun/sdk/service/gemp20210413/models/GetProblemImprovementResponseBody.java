// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProblemImprovementResponseBody} extends {@link TeaModel}
 *
 * <p>GetProblemImprovementResponseBody</p>
 */
public class GetProblemImprovementResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetProblemImprovementResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProblemImprovementResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * data
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetProblemImprovementResponseBody build() {
            return new GetProblemImprovementResponseBody(this);
        } 

    } 

    public static class MeasureList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("checkStandard")
        private String checkStandard;

        @com.aliyun.core.annotation.NameInMap("checkUserId")
        private Long checkUserId;

        @com.aliyun.core.annotation.NameInMap("checkUserIsValid")
        private Integer checkUserIsValid;

        @com.aliyun.core.annotation.NameInMap("checkUserName")
        private String checkUserName;

        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("directorId")
        private Long directorId;

        @com.aliyun.core.annotation.NameInMap("directorIsValid")
        private Integer directorIsValid;

        @com.aliyun.core.annotation.NameInMap("directorName")
        private String directorName;

        @com.aliyun.core.annotation.NameInMap("measureId")
        private Long measureId;

        @com.aliyun.core.annotation.NameInMap("planFinishTime")
        private String planFinishTime;

        @com.aliyun.core.annotation.NameInMap("stalkerId")
        private Long stalkerId;

        @com.aliyun.core.annotation.NameInMap("stalkerIsValid")
        private Integer stalkerIsValid;

        @com.aliyun.core.annotation.NameInMap("stalkerName")
        private String stalkerName;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("type")
        private Long type;

        private MeasureList(Builder builder) {
            this.checkStandard = builder.checkStandard;
            this.checkUserId = builder.checkUserId;
            this.checkUserIsValid = builder.checkUserIsValid;
            this.checkUserName = builder.checkUserName;
            this.content = builder.content;
            this.directorId = builder.directorId;
            this.directorIsValid = builder.directorIsValid;
            this.directorName = builder.directorName;
            this.measureId = builder.measureId;
            this.planFinishTime = builder.planFinishTime;
            this.stalkerId = builder.stalkerId;
            this.stalkerIsValid = builder.stalkerIsValid;
            this.stalkerName = builder.stalkerName;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MeasureList create() {
            return builder().build();
        }

        /**
         * @return checkStandard
         */
        public String getCheckStandard() {
            return this.checkStandard;
        }

        /**
         * @return checkUserId
         */
        public Long getCheckUserId() {
            return this.checkUserId;
        }

        /**
         * @return checkUserIsValid
         */
        public Integer getCheckUserIsValid() {
            return this.checkUserIsValid;
        }

        /**
         * @return checkUserName
         */
        public String getCheckUserName() {
            return this.checkUserName;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return directorId
         */
        public Long getDirectorId() {
            return this.directorId;
        }

        /**
         * @return directorIsValid
         */
        public Integer getDirectorIsValid() {
            return this.directorIsValid;
        }

        /**
         * @return directorName
         */
        public String getDirectorName() {
            return this.directorName;
        }

        /**
         * @return measureId
         */
        public Long getMeasureId() {
            return this.measureId;
        }

        /**
         * @return planFinishTime
         */
        public String getPlanFinishTime() {
            return this.planFinishTime;
        }

        /**
         * @return stalkerId
         */
        public Long getStalkerId() {
            return this.stalkerId;
        }

        /**
         * @return stalkerIsValid
         */
        public Integer getStalkerIsValid() {
            return this.stalkerIsValid;
        }

        /**
         * @return stalkerName
         */
        public String getStalkerName() {
            return this.stalkerName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public Long getType() {
            return this.type;
        }

        public static final class Builder {
            private String checkStandard; 
            private Long checkUserId; 
            private Integer checkUserIsValid; 
            private String checkUserName; 
            private String content; 
            private Long directorId; 
            private Integer directorIsValid; 
            private String directorName; 
            private Long measureId; 
            private String planFinishTime; 
            private Long stalkerId; 
            private Integer stalkerIsValid; 
            private String stalkerName; 
            private String status; 
            private Long type; 

            /**
             * checkStandard.
             */
            public Builder checkStandard(String checkStandard) {
                this.checkStandard = checkStandard;
                return this;
            }

            /**
             * checkUserId.
             */
            public Builder checkUserId(Long checkUserId) {
                this.checkUserId = checkUserId;
                return this;
            }

            /**
             * checkUserIsValid.
             */
            public Builder checkUserIsValid(Integer checkUserIsValid) {
                this.checkUserIsValid = checkUserIsValid;
                return this;
            }

            /**
             * checkUserName.
             */
            public Builder checkUserName(String checkUserName) {
                this.checkUserName = checkUserName;
                return this;
            }

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * directorId.
             */
            public Builder directorId(Long directorId) {
                this.directorId = directorId;
                return this;
            }

            /**
             * directorIsValid.
             */
            public Builder directorIsValid(Integer directorIsValid) {
                this.directorIsValid = directorIsValid;
                return this;
            }

            /**
             * directorName.
             */
            public Builder directorName(String directorName) {
                this.directorName = directorName;
                return this;
            }

            /**
             * measureId.
             */
            public Builder measureId(Long measureId) {
                this.measureId = measureId;
                return this;
            }

            /**
             * planFinishTime.
             */
            public Builder planFinishTime(String planFinishTime) {
                this.planFinishTime = planFinishTime;
                return this;
            }

            /**
             * stalkerId.
             */
            public Builder stalkerId(Long stalkerId) {
                this.stalkerId = stalkerId;
                return this;
            }

            /**
             * stalkerIsValid.
             */
            public Builder stalkerIsValid(Integer stalkerIsValid) {
                this.stalkerIsValid = stalkerIsValid;
                return this;
            }

            /**
             * stalkerName.
             */
            public Builder stalkerName(String stalkerName) {
                this.stalkerName = stalkerName;
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
             * type.
             */
            public Builder type(Long type) {
                this.type = type;
                return this;
            }

            public MeasureList build() {
                return new MeasureList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("customProblemReason")
        private String customProblemReason;

        @com.aliyun.core.annotation.NameInMap("discoverSource")
        private String discoverSource;

        @com.aliyun.core.annotation.NameInMap("dutyDepartmentId")
        private String dutyDepartmentId;

        @com.aliyun.core.annotation.NameInMap("dutyDepartmentName")
        private String dutyDepartmentName;

        @com.aliyun.core.annotation.NameInMap("dutyUserId")
        private Long dutyUserId;

        @com.aliyun.core.annotation.NameInMap("dutyUserIsValid")
        private Long dutyUserIsValid;

        @com.aliyun.core.annotation.NameInMap("dutyUserName")
        private String dutyUserName;

        @com.aliyun.core.annotation.NameInMap("dutyUserPhone")
        private String dutyUserPhone;

        @com.aliyun.core.annotation.NameInMap("injectionMode")
        private String injectionMode;

        @com.aliyun.core.annotation.NameInMap("isManual")
        private Boolean isManual;

        @com.aliyun.core.annotation.NameInMap("measureList")
        private java.util.List < MeasureList> measureList;

        @com.aliyun.core.annotation.NameInMap("monitorSourceName")
        private String monitorSourceName;

        @com.aliyun.core.annotation.NameInMap("problemId")
        private String problemId;

        @com.aliyun.core.annotation.NameInMap("problemReason")
        private String problemReason;

        @com.aliyun.core.annotation.NameInMap("recentActivity")
        private String recentActivity;

        @com.aliyun.core.annotation.NameInMap("recoveryMode")
        private String recoveryMode;

        @com.aliyun.core.annotation.NameInMap("relationChanges")
        private String relationChanges;

        @com.aliyun.core.annotation.NameInMap("remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("replayDutyUserId")
        private Long replayDutyUserId;

        @com.aliyun.core.annotation.NameInMap("replayDutyUserIsValid")
        private Long replayDutyUserIsValid;

        @com.aliyun.core.annotation.NameInMap("replayDutyUserName")
        private String replayDutyUserName;

        @com.aliyun.core.annotation.NameInMap("replayDutyUserPhone")
        private String replayDutyUserPhone;

        @com.aliyun.core.annotation.NameInMap("userReport")
        private Long userReport;

        private Data(Builder builder) {
            this.customProblemReason = builder.customProblemReason;
            this.discoverSource = builder.discoverSource;
            this.dutyDepartmentId = builder.dutyDepartmentId;
            this.dutyDepartmentName = builder.dutyDepartmentName;
            this.dutyUserId = builder.dutyUserId;
            this.dutyUserIsValid = builder.dutyUserIsValid;
            this.dutyUserName = builder.dutyUserName;
            this.dutyUserPhone = builder.dutyUserPhone;
            this.injectionMode = builder.injectionMode;
            this.isManual = builder.isManual;
            this.measureList = builder.measureList;
            this.monitorSourceName = builder.monitorSourceName;
            this.problemId = builder.problemId;
            this.problemReason = builder.problemReason;
            this.recentActivity = builder.recentActivity;
            this.recoveryMode = builder.recoveryMode;
            this.relationChanges = builder.relationChanges;
            this.remark = builder.remark;
            this.replayDutyUserId = builder.replayDutyUserId;
            this.replayDutyUserIsValid = builder.replayDutyUserIsValid;
            this.replayDutyUserName = builder.replayDutyUserName;
            this.replayDutyUserPhone = builder.replayDutyUserPhone;
            this.userReport = builder.userReport;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return customProblemReason
         */
        public String getCustomProblemReason() {
            return this.customProblemReason;
        }

        /**
         * @return discoverSource
         */
        public String getDiscoverSource() {
            return this.discoverSource;
        }

        /**
         * @return dutyDepartmentId
         */
        public String getDutyDepartmentId() {
            return this.dutyDepartmentId;
        }

        /**
         * @return dutyDepartmentName
         */
        public String getDutyDepartmentName() {
            return this.dutyDepartmentName;
        }

        /**
         * @return dutyUserId
         */
        public Long getDutyUserId() {
            return this.dutyUserId;
        }

        /**
         * @return dutyUserIsValid
         */
        public Long getDutyUserIsValid() {
            return this.dutyUserIsValid;
        }

        /**
         * @return dutyUserName
         */
        public String getDutyUserName() {
            return this.dutyUserName;
        }

        /**
         * @return dutyUserPhone
         */
        public String getDutyUserPhone() {
            return this.dutyUserPhone;
        }

        /**
         * @return injectionMode
         */
        public String getInjectionMode() {
            return this.injectionMode;
        }

        /**
         * @return isManual
         */
        public Boolean getIsManual() {
            return this.isManual;
        }

        /**
         * @return measureList
         */
        public java.util.List < MeasureList> getMeasureList() {
            return this.measureList;
        }

        /**
         * @return monitorSourceName
         */
        public String getMonitorSourceName() {
            return this.monitorSourceName;
        }

        /**
         * @return problemId
         */
        public String getProblemId() {
            return this.problemId;
        }

        /**
         * @return problemReason
         */
        public String getProblemReason() {
            return this.problemReason;
        }

        /**
         * @return recentActivity
         */
        public String getRecentActivity() {
            return this.recentActivity;
        }

        /**
         * @return recoveryMode
         */
        public String getRecoveryMode() {
            return this.recoveryMode;
        }

        /**
         * @return relationChanges
         */
        public String getRelationChanges() {
            return this.relationChanges;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return replayDutyUserId
         */
        public Long getReplayDutyUserId() {
            return this.replayDutyUserId;
        }

        /**
         * @return replayDutyUserIsValid
         */
        public Long getReplayDutyUserIsValid() {
            return this.replayDutyUserIsValid;
        }

        /**
         * @return replayDutyUserName
         */
        public String getReplayDutyUserName() {
            return this.replayDutyUserName;
        }

        /**
         * @return replayDutyUserPhone
         */
        public String getReplayDutyUserPhone() {
            return this.replayDutyUserPhone;
        }

        /**
         * @return userReport
         */
        public Long getUserReport() {
            return this.userReport;
        }

        public static final class Builder {
            private String customProblemReason; 
            private String discoverSource; 
            private String dutyDepartmentId; 
            private String dutyDepartmentName; 
            private Long dutyUserId; 
            private Long dutyUserIsValid; 
            private String dutyUserName; 
            private String dutyUserPhone; 
            private String injectionMode; 
            private Boolean isManual; 
            private java.util.List < MeasureList> measureList; 
            private String monitorSourceName; 
            private String problemId; 
            private String problemReason; 
            private String recentActivity; 
            private String recoveryMode; 
            private String relationChanges; 
            private String remark; 
            private Long replayDutyUserId; 
            private Long replayDutyUserIsValid; 
            private String replayDutyUserName; 
            private String replayDutyUserPhone; 
            private Long userReport; 

            /**
             * customProblemReason.
             */
            public Builder customProblemReason(String customProblemReason) {
                this.customProblemReason = customProblemReason;
                return this;
            }

            /**
             * discoverSource.
             */
            public Builder discoverSource(String discoverSource) {
                this.discoverSource = discoverSource;
                return this;
            }

            /**
             * dutyDepartmentId.
             */
            public Builder dutyDepartmentId(String dutyDepartmentId) {
                this.dutyDepartmentId = dutyDepartmentId;
                return this;
            }

            /**
             * dutyDepartmentName.
             */
            public Builder dutyDepartmentName(String dutyDepartmentName) {
                this.dutyDepartmentName = dutyDepartmentName;
                return this;
            }

            /**
             * dutyUserId.
             */
            public Builder dutyUserId(Long dutyUserId) {
                this.dutyUserId = dutyUserId;
                return this;
            }

            /**
             * dutyUserIsValid.
             */
            public Builder dutyUserIsValid(Long dutyUserIsValid) {
                this.dutyUserIsValid = dutyUserIsValid;
                return this;
            }

            /**
             * dutyUserName.
             */
            public Builder dutyUserName(String dutyUserName) {
                this.dutyUserName = dutyUserName;
                return this;
            }

            /**
             * dutyUserPhone.
             */
            public Builder dutyUserPhone(String dutyUserPhone) {
                this.dutyUserPhone = dutyUserPhone;
                return this;
            }

            /**
             * injectionMode.
             */
            public Builder injectionMode(String injectionMode) {
                this.injectionMode = injectionMode;
                return this;
            }

            /**
             * isManual.
             */
            public Builder isManual(Boolean isManual) {
                this.isManual = isManual;
                return this;
            }

            /**
             * measureList.
             */
            public Builder measureList(java.util.List < MeasureList> measureList) {
                this.measureList = measureList;
                return this;
            }

            /**
             * monitorSourceName.
             */
            public Builder monitorSourceName(String monitorSourceName) {
                this.monitorSourceName = monitorSourceName;
                return this;
            }

            /**
             * problemId.
             */
            public Builder problemId(String problemId) {
                this.problemId = problemId;
                return this;
            }

            /**
             * problemReason.
             */
            public Builder problemReason(String problemReason) {
                this.problemReason = problemReason;
                return this;
            }

            /**
             * recentActivity.
             */
            public Builder recentActivity(String recentActivity) {
                this.recentActivity = recentActivity;
                return this;
            }

            /**
             * recoveryMode.
             */
            public Builder recoveryMode(String recoveryMode) {
                this.recoveryMode = recoveryMode;
                return this;
            }

            /**
             * relationChanges.
             */
            public Builder relationChanges(String relationChanges) {
                this.relationChanges = relationChanges;
                return this;
            }

            /**
             * remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * replayDutyUserId.
             */
            public Builder replayDutyUserId(Long replayDutyUserId) {
                this.replayDutyUserId = replayDutyUserId;
                return this;
            }

            /**
             * replayDutyUserIsValid.
             */
            public Builder replayDutyUserIsValid(Long replayDutyUserIsValid) {
                this.replayDutyUserIsValid = replayDutyUserIsValid;
                return this;
            }

            /**
             * replayDutyUserName.
             */
            public Builder replayDutyUserName(String replayDutyUserName) {
                this.replayDutyUserName = replayDutyUserName;
                return this;
            }

            /**
             * replayDutyUserPhone.
             */
            public Builder replayDutyUserPhone(String replayDutyUserPhone) {
                this.replayDutyUserPhone = replayDutyUserPhone;
                return this;
            }

            /**
             * userReport.
             */
            public Builder userReport(Long userReport) {
                this.userReport = userReport;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
