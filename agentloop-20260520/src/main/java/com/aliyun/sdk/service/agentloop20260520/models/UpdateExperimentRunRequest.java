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
 * {@link UpdateExperimentRunRequest} extends {@link RequestModel}
 *
 * <p>UpdateExperimentRunRequest</p>
 */
public class UpdateExperimentRunRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("recordId")
    private String recordId;

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
    @com.aliyun.core.annotation.NameInMap("failedTasks")
    private Integer failedTasks;

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

    private UpdateExperimentRunRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.recordId = builder.recordId;
        this.completedAt = builder.completedAt;
        this.completedTasks = builder.completedTasks;
        this.executedAt = builder.executedAt;
        this.failedTasks = builder.failedTasks;
        this.recordName = builder.recordName;
        this.status = builder.status;
        this.totalTasks = builder.totalTasks;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateExperimentRunRequest create() {
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
     * @return recordId
     */
    public String getRecordId() {
        return this.recordId;
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
     * @return failedTasks
     */
    public Integer getFailedTasks() {
        return this.failedTasks;
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

    public static final class Builder extends Request.Builder<UpdateExperimentRunRequest, Builder> {
        private String agentSpace; 
        private String recordId; 
        private Long completedAt; 
        private Integer completedTasks; 
        private Long executedAt; 
        private Integer failedTasks; 
        private String recordName; 
        private String status; 
        private Integer totalTasks; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateExperimentRunRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.recordId = request.recordId;
            this.completedAt = request.completedAt;
            this.completedTasks = request.completedTasks;
            this.executedAt = request.executedAt;
            this.failedTasks = request.failedTasks;
            this.recordName = request.recordName;
            this.status = request.status;
            this.totalTasks = request.totalTasks;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The AgentSpace name.</p>
         * 
         * <strong>example:</strong>
         * <p>al-playground-cn-hongkong</p>
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * <p>The experiment record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a5397261-6e6d-4e45-bf52-feb8686f7524</p>
         */
        public Builder recordId(String recordId) {
            this.putPathParameter("recordId", recordId);
            this.recordId = recordId;
            return this;
        }

        /**
         * <p>The experiment completion time. A millisecond-level UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1784719989371</p>
         */
        public Builder completedAt(Long completedAt) {
            this.putBodyParameter("completedAt", completedAt);
            this.completedAt = completedAt;
            return this;
        }

        /**
         * <p>The number of completed tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder completedTasks(Integer completedTasks) {
            this.putBodyParameter("completedTasks", completedTasks);
            this.completedTasks = completedTasks;
            return this;
        }

        /**
         * <p>The experiment execution time. A millisecond-level UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1784719439255</p>
         */
        public Builder executedAt(Long executedAt) {
            this.putBodyParameter("executedAt", executedAt);
            this.executedAt = executedAt;
            return this;
        }

        /**
         * <p>The number of failed tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder failedTasks(Integer failedTasks) {
            this.putBodyParameter("failedTasks", failedTasks);
            this.failedTasks = failedTasks;
            return this;
        }

        /**
         * <p>The experiment record name.</p>
         * 
         * <strong>example:</strong>
         * <p>rca_benchmark_eval_experiment 2026/07/22 19:23:59</p>
         */
        public Builder recordName(String recordName) {
            this.putBodyParameter("recordName", recordName);
            this.recordName = recordName;
            return this;
        }

        /**
         * <p>The experiment record status. Set to cancelled to cancel execution.</p>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The total number of tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalTasks(Integer totalTasks) {
            this.putBodyParameter("totalTasks", totalTasks);
            this.totalTasks = totalTasks;
            return this;
        }

        /**
         * <p>Optional.</p>
         * 
         * <strong>example:</strong>
         * <p>a1b2c3d4-1234-5678-90ab-cdef12345678</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public UpdateExperimentRunRequest build() {
            return new UpdateExperimentRunRequest(this);
        } 

    } 

}
