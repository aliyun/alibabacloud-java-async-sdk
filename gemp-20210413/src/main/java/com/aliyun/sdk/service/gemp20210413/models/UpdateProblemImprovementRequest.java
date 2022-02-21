// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProblemImprovementRequest} extends {@link RequestModel}
 *
 * <p>UpdateProblemImprovementRequest</p>
 */
public class UpdateProblemImprovementRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("discoverSource")
    private Long discoverSource;

    @Body
    @NameInMap("dutyDepartmentId")
    private Long dutyDepartmentId;

    @Body
    @NameInMap("dutyDepartmentName")
    private String dutyDepartmentName;

    @Body
    @NameInMap("dutyUserId")
    private Long dutyUserId;

    @Body
    @NameInMap("injectionMode")
    private String injectionMode;

    @Body
    @NameInMap("monitorSourceName")
    private String monitorSourceName;

    @Body
    @NameInMap("problemId")
    private Long problemId;

    @Body
    @NameInMap("problemReason")
    private String problemReason;

    @Body
    @NameInMap("recentActivity")
    private String recentActivity;

    @Body
    @NameInMap("recoveryMode")
    private String recoveryMode;

    @Body
    @NameInMap("relationChanges")
    private String relationChanges;

    @Body
    @NameInMap("remark")
    private String remark;

    @Body
    @NameInMap("replayDutyUserId")
    private Long replayDutyUserId;

    @Body
    @NameInMap("userReport")
    private Long userReport;

    private UpdateProblemImprovementRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.discoverSource = builder.discoverSource;
        this.dutyDepartmentId = builder.dutyDepartmentId;
        this.dutyDepartmentName = builder.dutyDepartmentName;
        this.dutyUserId = builder.dutyUserId;
        this.injectionMode = builder.injectionMode;
        this.monitorSourceName = builder.monitorSourceName;
        this.problemId = builder.problemId;
        this.problemReason = builder.problemReason;
        this.recentActivity = builder.recentActivity;
        this.recoveryMode = builder.recoveryMode;
        this.relationChanges = builder.relationChanges;
        this.remark = builder.remark;
        this.replayDutyUserId = builder.replayDutyUserId;
        this.userReport = builder.userReport;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProblemImprovementRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return discoverSource
     */
    public Long getDiscoverSource() {
        return this.discoverSource;
    }

    /**
     * @return dutyDepartmentId
     */
    public Long getDutyDepartmentId() {
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
     * @return injectionMode
     */
    public String getInjectionMode() {
        return this.injectionMode;
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
    public Long getProblemId() {
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
     * @return userReport
     */
    public Long getUserReport() {
        return this.userReport;
    }

    public static final class Builder extends Request.Builder<UpdateProblemImprovementRequest, Builder> {
        private String clientToken; 
        private Long discoverSource; 
        private Long dutyDepartmentId; 
        private String dutyDepartmentName; 
        private Long dutyUserId; 
        private String injectionMode; 
        private String monitorSourceName; 
        private Long problemId; 
        private String problemReason; 
        private String recentActivity; 
        private String recoveryMode; 
        private String relationChanges; 
        private String remark; 
        private Long replayDutyUserId; 
        private Long userReport; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProblemImprovementRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.discoverSource = response.discoverSource;
            this.dutyDepartmentId = response.dutyDepartmentId;
            this.dutyDepartmentName = response.dutyDepartmentName;
            this.dutyUserId = response.dutyUserId;
            this.injectionMode = response.injectionMode;
            this.monitorSourceName = response.monitorSourceName;
            this.problemId = response.problemId;
            this.problemReason = response.problemReason;
            this.recentActivity = response.recentActivity;
            this.recoveryMode = response.recoveryMode;
            this.relationChanges = response.relationChanges;
            this.remark = response.remark;
            this.replayDutyUserId = response.replayDutyUserId;
            this.userReport = response.userReport;
        } 

        /**
         * 幂等校验token
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 发现来源 码表:PROBLEM_DISCOVER_SOURCE
         */
        public Builder discoverSource(Long discoverSource) {
            this.putBodyParameter("discoverSource", discoverSource);
            this.discoverSource = discoverSource;
            return this;
        }

        /**
         * 故障责任部门ID
         */
        public Builder dutyDepartmentId(Long dutyDepartmentId) {
            this.putBodyParameter("dutyDepartmentId", dutyDepartmentId);
            this.dutyDepartmentId = dutyDepartmentId;
            return this;
        }

        /**
         * 故障责任部门
         */
        public Builder dutyDepartmentName(String dutyDepartmentName) {
            this.putBodyParameter("dutyDepartmentName", dutyDepartmentName);
            this.dutyDepartmentName = dutyDepartmentName;
            return this;
        }

        /**
         * 故障责任人id
         */
        public Builder dutyUserId(Long dutyUserId) {
            this.putBodyParameter("dutyUserId", dutyUserId);
            this.dutyUserId = dutyUserId;
            return this;
        }

        /**
         * 注入方式 码表:PROBLEM_INJECTION_MODE
         */
        public Builder injectionMode(String injectionMode) {
            this.putBodyParameter("injectionMode", injectionMode);
            this.injectionMode = injectionMode;
            return this;
        }

        /**
         * 监控源
         */
        public Builder monitorSourceName(String monitorSourceName) {
            this.putBodyParameter("monitorSourceName", monitorSourceName);
            this.monitorSourceName = monitorSourceName;
            return this;
        }

        /**
         * 故障ID
         */
        public Builder problemId(Long problemId) {
            this.putBodyParameter("problemId", problemId);
            this.problemId = problemId;
            return this;
        }

        /**
         * 故障原因
         */
        public Builder problemReason(String problemReason) {
            this.putBodyParameter("problemReason", problemReason);
            this.problemReason = problemReason;
            return this;
        }

        /**
         * 最近活动 码表:PROBLEM_RECENT_ACTIVITY
         */
        public Builder recentActivity(String recentActivity) {
            this.putBodyParameter("recentActivity", recentActivity);
            this.recentActivity = recentActivity;
            return this;
        }

        /**
         * 恢复方式  码表:PROBLEM_RECOVERY_MODE
         */
        public Builder recoveryMode(String recoveryMode) {
            this.putBodyParameter("recoveryMode", recoveryMode);
            this.recoveryMode = recoveryMode;
            return this;
        }

        /**
         * 关联变更
         */
        public Builder relationChanges(String relationChanges) {
            this.putBodyParameter("relationChanges", relationChanges);
            this.relationChanges = relationChanges;
            return this;
        }

        /**
         * 备注
         */
        public Builder remark(String remark) {
            this.putBodyParameter("remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * 复盘负责人id
         */
        public Builder replayDutyUserId(Long replayDutyUserId) {
            this.putBodyParameter("replayDutyUserId", replayDutyUserId);
            this.replayDutyUserId = replayDutyUserId;
            return this;
        }

        /**
         * 用户上报 码表:PROBLEM_USER_REPORT
         */
        public Builder userReport(Long userReport) {
            this.putBodyParameter("userReport", userReport);
            this.userReport = userReport;
            return this;
        }

        @Override
        public UpdateProblemImprovementRequest build() {
            return new UpdateProblemImprovementRequest(this);
        } 

    } 

}
