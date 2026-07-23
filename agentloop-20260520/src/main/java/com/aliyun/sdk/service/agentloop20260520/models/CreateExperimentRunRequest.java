// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link CreateExperimentRunRequest} extends {@link RequestModel}
 *
 * <p>CreateExperimentRunRequest</p>
 */
public class CreateExperimentRunRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("completedAt")
    private Long completedAt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("completedTasks")
    private Integer completedTasks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("executedAt")
    private Long executedAt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("experimentPlanId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String experimentPlanId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("failedTasks")
    private Integer failedTasks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("offlineExperiments")
    private java.util.List<OfflineExperimentConfig> offlineExperiments;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("recordName")
    private String recordName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("totalTasks")
    private Integer totalTasks;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private CreateExperimentRunRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.completedAt = builder.completedAt;
        this.completedTasks = builder.completedTasks;
        this.executedAt = builder.executedAt;
        this.experimentPlanId = builder.experimentPlanId;
        this.failedTasks = builder.failedTasks;
        this.offlineExperiments = builder.offlineExperiments;
        this.recordName = builder.recordName;
        this.status = builder.status;
        this.totalTasks = builder.totalTasks;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExperimentRunRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentSpace
     */
    public String getAgentSpace() {
        return this.agentSpace;
    }

    /**
     * @return completedAt
     */
    public Long getCompletedAt() {
        return this.completedAt;
    }

    /**
     * @return completedTasks
     */
    public Integer getCompletedTasks() {
        return this.completedTasks;
    }

    /**
     * @return executedAt
     */
    public Long getExecutedAt() {
        return this.executedAt;
    }

    /**
     * @return experimentPlanId
     */
    public String getExperimentPlanId() {
        return this.experimentPlanId;
    }

    /**
     * @return failedTasks
     */
    public Integer getFailedTasks() {
        return this.failedTasks;
    }

    /**
     * @return offlineExperiments
     */
    public java.util.List<OfflineExperimentConfig> getOfflineExperiments() {
        return this.offlineExperiments;
    }

    /**
     * @return recordName
     */
    public String getRecordName() {
        return this.recordName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return totalTasks
     */
    public Integer getTotalTasks() {
        return this.totalTasks;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreateExperimentRunRequest, Builder> {
        private String agentSpace; 
        private Long completedAt; 
        private Integer completedTasks; 
        private Long executedAt; 
        private String experimentPlanId; 
        private Integer failedTasks; 
        private java.util.List<OfflineExperimentConfig> offlineExperiments; 
        private String recordName; 
        private String status; 
        private Integer totalTasks; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateExperimentRunRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.completedAt = request.completedAt;
            this.completedTasks = request.completedTasks;
            this.executedAt = request.executedAt;
            this.experimentPlanId = request.experimentPlanId;
            this.failedTasks = request.failedTasks;
            this.offlineExperiments = request.offlineExperiments;
            this.recordName = request.recordName;
            this.status = request.status;
            this.totalTasks = request.totalTasks;
            this.clientToken = request.clientToken;
        } 

        /**
         * agentSpace.
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * completedAt.
         */
        public Builder completedAt(Long completedAt) {
            this.putBodyParameter("completedAt", completedAt);
            this.completedAt = completedAt;
            return this;
        }

        /**
         * completedTasks.
         */
        public Builder completedTasks(Integer completedTasks) {
            this.putBodyParameter("completedTasks", completedTasks);
            this.completedTasks = completedTasks;
            return this;
        }

        /**
         * executedAt.
         */
        public Builder executedAt(Long executedAt) {
            this.putBodyParameter("executedAt", executedAt);
            this.executedAt = executedAt;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exp-plan-0242d983f5d340fd8479cf2c19eb279e</p>
         */
        public Builder experimentPlanId(String experimentPlanId) {
            this.putBodyParameter("experimentPlanId", experimentPlanId);
            this.experimentPlanId = experimentPlanId;
            return this;
        }

        /**
         * failedTasks.
         */
        public Builder failedTasks(Integer failedTasks) {
            this.putBodyParameter("failedTasks", failedTasks);
            this.failedTasks = failedTasks;
            return this;
        }

        /**
         * offlineExperiments.
         */
        public Builder offlineExperiments(java.util.List<OfflineExperimentConfig> offlineExperiments) {
            this.putBodyParameter("offlineExperiments", offlineExperiments);
            this.offlineExperiments = offlineExperiments;
            return this;
        }

        /**
         * recordName.
         */
        public Builder recordName(String recordName) {
            this.putBodyParameter("recordName", recordName);
            this.recordName = recordName;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * totalTasks.
         */
        public Builder totalTasks(Integer totalTasks) {
            this.putBodyParameter("totalTasks", totalTasks);
            this.totalTasks = totalTasks;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public CreateExperimentRunRequest build() {
            return new CreateExperimentRunRequest(this);
        } 

    } 

}
