// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link SubmitAsyncTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitAsyncTaskRequest</p>
 */
public class SubmitAsyncTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskExecuteTime")
    private String taskExecuteTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskParam")
    private String taskParam;

    private SubmitAsyncTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.taskCode = builder.taskCode;
        this.taskExecuteTime = builder.taskExecuteTime;
        this.taskName = builder.taskName;
        this.taskParam = builder.taskParam;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAsyncTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return taskCode
     */
    public String getTaskCode() {
        return this.taskCode;
    }

    /**
     * @return taskExecuteTime
     */
    public String getTaskExecuteTime() {
        return this.taskExecuteTime;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskParam
     */
    public String getTaskParam() {
        return this.taskParam;
    }

    public static final class Builder extends Request.Builder<SubmitAsyncTaskRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private String taskCode; 
        private String taskExecuteTime; 
        private String taskName; 
        private String taskParam; 

        private Builder() {
            super();
        } 

        private Builder(SubmitAsyncTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.taskCode = request.taskCode;
            this.taskExecuteTime = request.taskExecuteTime;
            this.taskName = request.taskName;
            this.taskParam = request.taskParam;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2daaa2e0c209xb26acb97009ea77bd4b_p_efm</p>
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MaterialDocumentUpload</p>
         */
        public Builder taskCode(String taskCode) {
            this.putBodyParameter("TaskCode", taskCode);
            this.taskCode = taskCode;
            return this;
        }

        /**
         * TaskExecuteTime.
         */
        public Builder taskExecuteTime(String taskExecuteTime) {
            this.putBodyParameter("TaskExecuteTime", taskExecuteTime);
            this.taskExecuteTime = taskExecuteTime;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.putBodyParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * TaskParam.
         */
        public Builder taskParam(String taskParam) {
            this.putBodyParameter("TaskParam", taskParam);
            this.taskParam = taskParam;
            return this;
        }

        @Override
        public SubmitAsyncTaskRequest build() {
            return new SubmitAsyncTaskRequest(this);
        } 

    } 

}
