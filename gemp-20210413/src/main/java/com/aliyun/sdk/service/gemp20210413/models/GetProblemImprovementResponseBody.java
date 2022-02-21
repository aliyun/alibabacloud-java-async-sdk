// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProblemImprovementResponseBody} extends {@link TeaModel}
 *
 * <p>GetProblemImprovementResponseBody</p>
 */
public class GetProblemImprovementResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
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
         * data.
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
        @NameInMap("checkStandard")
        private String checkStandard;

        @NameInMap("checkUserId")
        private Long checkUserId;

        @NameInMap("checkUserName")
        private String checkUserName;

        @NameInMap("content")
        private String content;

        @NameInMap("directorId")
        private Long directorId;

        @NameInMap("directorName")
        private String directorName;

        @NameInMap("measureId")
        private Long measureId;

        @NameInMap("planFinishTime")
        private String planFinishTime;

        @NameInMap("stalkerId")
        private Long stalkerId;

        @NameInMap("stalkerName")
        private String stalkerName;

        @NameInMap("status")
        private String status;

        @NameInMap("type")
        private Long type;

        private MeasureList(Builder builder) {
            this.checkStandard = builder.checkStandard;
            this.checkUserId = builder.checkUserId;
            this.checkUserName = builder.checkUserName;
            this.content = builder.content;
            this.directorId = builder.directorId;
            this.directorName = builder.directorName;
            this.measureId = builder.measureId;
            this.planFinishTime = builder.planFinishTime;
            this.stalkerId = builder.stalkerId;
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
            private String checkUserName; 
            private String content; 
            private Long directorId; 
            private String directorName; 
            private Long measureId; 
            private String planFinishTime; 
            private Long stalkerId; 
            private String stalkerName; 
            private String status; 
            private Long type; 

            /**
             * 验收标准
             */
            public Builder checkStandard(String checkStandard) {
                this.checkStandard = checkStandard;
                return this;
            }

            /**
             * 验收人id
             */
            public Builder checkUserId(Long checkUserId) {
                this.checkUserId = checkUserId;
                return this;
            }

            /**
             * 验收人名称
             */
            public Builder checkUserName(String checkUserName) {
                this.checkUserName = checkUserName;
                return this;
            }

            /**
             * 措施内容
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * 负责人id
             */
            public Builder directorId(Long directorId) {
                this.directorId = directorId;
                return this;
            }

            /**
             * 负责人名称
             */
            public Builder directorName(String directorName) {
                this.directorName = directorName;
                return this;
            }

            /**
             * 改进措施id 用于删除或更新
             */
            public Builder measureId(Long measureId) {
                this.measureId = measureId;
                return this;
            }

            /**
             * 计划完成时间
             */
            public Builder planFinishTime(String planFinishTime) {
                this.planFinishTime = planFinishTime;
                return this;
            }

            /**
             * 跟踪人id
             */
            public Builder stalkerId(Long stalkerId) {
                this.stalkerId = stalkerId;
                return this;
            }

            /**
             * 跟踪人名称
             */
            public Builder stalkerName(String stalkerName) {
                this.stalkerName = stalkerName;
                return this;
            }

            /**
             * UNIMPROVED	状态 IMPROVED 改进 2 未改进UNIMPROVED
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 措施类型
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
        @NameInMap("discoverSource")
        private String discoverSource;

        @NameInMap("dutyDepartmentId")
        private String dutyDepartmentId;

        @NameInMap("dutyDepartmentName")
        private String dutyDepartmentName;

        @NameInMap("dutyUserId")
        private Long dutyUserId;

        @NameInMap("dutyUserName")
        private String dutyUserName;

        @NameInMap("dutyUserPhone")
        private String dutyUserPhone;

        @NameInMap("injectionMode")
        private String injectionMode;

        @NameInMap("isManual")
        private Boolean isManual;

        @NameInMap("measureList")
        private java.util.List < MeasureList> measureList;

        @NameInMap("monitorSourceName")
        private String monitorSourceName;

        @NameInMap("problemId")
        private String problemId;

        @NameInMap("problemReason")
        private String problemReason;

        @NameInMap("recentActivity")
        private String recentActivity;

        @NameInMap("recoveryMode")
        private String recoveryMode;

        @NameInMap("relationChanges")
        private String relationChanges;

        @NameInMap("remark")
        private String remark;

        @NameInMap("replayDutyUserId")
        private Long replayDutyUserId;

        @NameInMap("replayDutyUserName")
        private String replayDutyUserName;

        @NameInMap("replayDutyUserPhone")
        private String replayDutyUserPhone;

        @NameInMap("userReport")
        private Long userReport;

        private Data(Builder builder) {
            this.discoverSource = builder.discoverSource;
            this.dutyDepartmentId = builder.dutyDepartmentId;
            this.dutyDepartmentName = builder.dutyDepartmentName;
            this.dutyUserId = builder.dutyUserId;
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
            private String discoverSource; 
            private String dutyDepartmentId; 
            private String dutyDepartmentName; 
            private Long dutyUserId; 
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
            private String replayDutyUserName; 
            private String replayDutyUserPhone; 
            private Long userReport; 

            /**
             * 发现来源 码表:PROBLEM_DISCOVER_SOURCE
             */
            public Builder discoverSource(String discoverSource) {
                this.discoverSource = discoverSource;
                return this;
            }

            /**
             * 故障责任部门
             */
            public Builder dutyDepartmentId(String dutyDepartmentId) {
                this.dutyDepartmentId = dutyDepartmentId;
                return this;
            }

            /**
             * 故障责任部门名称
             */
            public Builder dutyDepartmentName(String dutyDepartmentName) {
                this.dutyDepartmentName = dutyDepartmentName;
                return this;
            }

            /**
             * 故障责任人id
             */
            public Builder dutyUserId(Long dutyUserId) {
                this.dutyUserId = dutyUserId;
                return this;
            }

            /**
             * 故障责任人名称
             */
            public Builder dutyUserName(String dutyUserName) {
                this.dutyUserName = dutyUserName;
                return this;
            }

            /**
             * 故障责任人手机号
             */
            public Builder dutyUserPhone(String dutyUserPhone) {
                this.dutyUserPhone = dutyUserPhone;
                return this;
            }

            /**
             * 注入方式 码表:PROBLEM_INJECTION_MODE
             */
            public Builder injectionMode(String injectionMode) {
                this.injectionMode = injectionMode;
                return this;
            }

            /**
             * 是否手动
             */
            public Builder isManual(Boolean isManual) {
                this.isManual = isManual;
                return this;
            }

            /**
             * 改进措施列表
             */
            public Builder measureList(java.util.List < MeasureList> measureList) {
                this.measureList = measureList;
                return this;
            }

            /**
             * 监控源
             */
            public Builder monitorSourceName(String monitorSourceName) {
                this.monitorSourceName = monitorSourceName;
                return this;
            }

            /**
             * 故障ID
             */
            public Builder problemId(String problemId) {
                this.problemId = problemId;
                return this;
            }

            /**
             * 故障原因
             */
            public Builder problemReason(String problemReason) {
                this.problemReason = problemReason;
                return this;
            }

            /**
             * 最近活动 码表:PROBLEM_RECENT_ACTIVITY
             */
            public Builder recentActivity(String recentActivity) {
                this.recentActivity = recentActivity;
                return this;
            }

            /**
             * 恢复方式  码表:PROBLEM_RECOVERY_MODE
             */
            public Builder recoveryMode(String recoveryMode) {
                this.recoveryMode = recoveryMode;
                return this;
            }

            /**
             * 关联变更
             */
            public Builder relationChanges(String relationChanges) {
                this.relationChanges = relationChanges;
                return this;
            }

            /**
             * 备注
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * 复盘负责人id
             */
            public Builder replayDutyUserId(Long replayDutyUserId) {
                this.replayDutyUserId = replayDutyUserId;
                return this;
            }

            /**
             * 复盘负责人名称
             */
            public Builder replayDutyUserName(String replayDutyUserName) {
                this.replayDutyUserName = replayDutyUserName;
                return this;
            }

            /**
             * 复盘负责人手机号
             */
            public Builder replayDutyUserPhone(String replayDutyUserPhone) {
                this.replayDutyUserPhone = replayDutyUserPhone;
                return this;
            }

            /**
             * 用户上报 码表:PROBLEM_USER_REPORT
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
