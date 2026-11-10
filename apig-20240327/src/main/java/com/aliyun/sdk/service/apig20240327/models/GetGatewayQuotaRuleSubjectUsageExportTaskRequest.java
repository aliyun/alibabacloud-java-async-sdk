// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetGatewayQuotaRuleSubjectUsageExportTaskRequest} extends {@link RequestModel}
 *
 * <p>GetGatewayQuotaRuleSubjectUsageExportTaskRequest</p>
 */
public class GetGatewayQuotaRuleSubjectUsageExportTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ruleId")
    private String ruleId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("subjectId")
    private String subjectId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    private GetGatewayQuotaRuleSubjectUsageExportTaskRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.ruleId = builder.ruleId;
        this.subjectId = builder.subjectId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGatewayQuotaRuleSubjectUsageExportTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return subjectId
     */
    public String getSubjectId() {
        return this.subjectId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetGatewayQuotaRuleSubjectUsageExportTaskRequest, Builder> {
        private String gatewayId; 
        private String ruleId; 
        private String subjectId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetGatewayQuotaRuleSubjectUsageExportTaskRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.ruleId = request.ruleId;
            this.subjectId = request.subjectId;
            this.taskId = request.taskId;
        } 

        /**
         * <p>The gateway ID. This parameter is required and must be the same as the gatewayId passed when the export task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-123456</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The quota rule ID. This parameter is required and must be the same as the ruleId passed when the export task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>qr-123456</p>
         */
        public Builder ruleId(String ruleId) {
            this.putPathParameter("ruleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The consumption subject ID. This parameter is required and must be the same as the subjectId passed when the task was created. Consumers use IDs with the cs- prefix, and consumer groups use IDs with the csg- prefix.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-123456</p>
         */
        public Builder subjectId(String subjectId) {
            this.putPathParameter("subjectId", subjectId);
            this.subjectId = subjectId;
            return this;
        }

        /**
         * <p>The export task ID. This parameter is required. Use the taskId returned by CreateGatewayQuotaRuleSubjectUsageExportTask.</p>
         * 
         * <strong>example:</strong>
         * <p>finops-export-abcdef1234567890</p>
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetGatewayQuotaRuleSubjectUsageExportTaskRequest build() {
            return new GetGatewayQuotaRuleSubjectUsageExportTaskRequest(this);
        } 

    } 

}
