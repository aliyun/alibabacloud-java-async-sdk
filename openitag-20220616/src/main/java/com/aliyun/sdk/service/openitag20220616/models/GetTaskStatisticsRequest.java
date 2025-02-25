// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTaskStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetTaskStatisticsRequest</p>
 */
public class GetTaskStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatType")
    private String statType;

    private GetTaskStatisticsRequest(Builder builder) {
        super(builder);
        this.tenantId = builder.tenantId;
        this.taskId = builder.taskId;
        this.statType = builder.statType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return statType
     */
    public String getStatType() {
        return this.statType;
    }

    public static final class Builder extends Request.Builder<GetTaskStatisticsRequest, Builder> {
        private String tenantId; 
        private String taskId; 
        private String statType; 

        private Builder() {
            super();
        } 

        private Builder(GetTaskStatisticsRequest request) {
            super(request);
            this.tenantId = request.tenantId;
            this.taskId = request.taskId;
            this.statType = request.statType;
        } 

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putPathParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * StatType.
         */
        public Builder statType(String statType) {
            this.putQueryParameter("StatType", statType);
            this.statType = statType;
            return this;
        }

        @Override
        public GetTaskStatisticsRequest build() {
            return new GetTaskStatisticsRequest(this);
        } 

    } 

}
