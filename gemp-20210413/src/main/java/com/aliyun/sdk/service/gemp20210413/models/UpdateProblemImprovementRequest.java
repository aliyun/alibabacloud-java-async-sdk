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
    @NameInMap("customProblemReason")
    private String customProblemReason;

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
        this.customProblemReason = builder.customProblemReason;
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
     * @return customProblemReason
     */
    public String getCustomProblemReason() {
        return this.customProblemReason;
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
        private String customProblemReason; 
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

        private Builder(UpdateProblemImprovementRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.customProblemReason = request.customProblemReason;
            this.discoverSource = request.discoverSource;
            this.dutyDepartmentId = request.dutyDepartmentId;
            this.dutyDepartmentName = request.dutyDepartmentName;
            this.dutyUserId = request.dutyUserId;
            this.injectionMode = request.injectionMode;
            this.monitorSourceName = request.monitorSourceName;
            this.problemId = request.problemId;
            this.problemReason = request.problemReason;
            this.recentActivity = request.recentActivity;
            this.recoveryMode = request.recoveryMode;
            this.relationChanges = request.relationChanges;
            this.remark = request.remark;
            this.replayDutyUserId = request.replayDutyUserId;
            this.userReport = request.userReport;
        } 

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * customProblemReason.
         */
        public Builder customProblemReason(String customProblemReason) {
            this.putBodyParameter("customProblemReason", customProblemReason);
            this.customProblemReason = customProblemReason;
            return this;
        }

        /**
         * discoverSource.
         */
        public Builder discoverSource(Long discoverSource) {
            this.putBodyParameter("discoverSource", discoverSource);
            this.discoverSource = discoverSource;
            return this;
        }

        /**
         * dutyDepartmentId.
         */
        public Builder dutyDepartmentId(Long dutyDepartmentId) {
            this.putBodyParameter("dutyDepartmentId", dutyDepartmentId);
            this.dutyDepartmentId = dutyDepartmentId;
            return this;
        }

        /**
         * dutyDepartmentName.
         */
        public Builder dutyDepartmentName(String dutyDepartmentName) {
            this.putBodyParameter("dutyDepartmentName", dutyDepartmentName);
            this.dutyDepartmentName = dutyDepartmentName;
            return this;
        }

        /**
         * dutyUserId.
         */
        public Builder dutyUserId(Long dutyUserId) {
            this.putBodyParameter("dutyUserId", dutyUserId);
            this.dutyUserId = dutyUserId;
            return this;
        }

        /**
         * injectionMode.
         */
        public Builder injectionMode(String injectionMode) {
            this.putBodyParameter("injectionMode", injectionMode);
            this.injectionMode = injectionMode;
            return this;
        }

        /**
         * monitorSourceName.
         */
        public Builder monitorSourceName(String monitorSourceName) {
            this.putBodyParameter("monitorSourceName", monitorSourceName);
            this.monitorSourceName = monitorSourceName;
            return this;
        }

        /**
         * problemId.
         */
        public Builder problemId(Long problemId) {
            this.putBodyParameter("problemId", problemId);
            this.problemId = problemId;
            return this;
        }

        /**
         * problemReason.
         */
        public Builder problemReason(String problemReason) {
            this.putBodyParameter("problemReason", problemReason);
            this.problemReason = problemReason;
            return this;
        }

        /**
         * recentActivity.
         */
        public Builder recentActivity(String recentActivity) {
            this.putBodyParameter("recentActivity", recentActivity);
            this.recentActivity = recentActivity;
            return this;
        }

        /**
         * recoveryMode.
         */
        public Builder recoveryMode(String recoveryMode) {
            this.putBodyParameter("recoveryMode", recoveryMode);
            this.recoveryMode = recoveryMode;
            return this;
        }

        /**
         * relationChanges.
         */
        public Builder relationChanges(String relationChanges) {
            this.putBodyParameter("relationChanges", relationChanges);
            this.relationChanges = relationChanges;
            return this;
        }

        /**
         * remark.
         */
        public Builder remark(String remark) {
            this.putBodyParameter("remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * replayDutyUserId.
         */
        public Builder replayDutyUserId(Long replayDutyUserId) {
            this.putBodyParameter("replayDutyUserId", replayDutyUserId);
            this.replayDutyUserId = replayDutyUserId;
            return this;
        }

        /**
         * userReport.
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
