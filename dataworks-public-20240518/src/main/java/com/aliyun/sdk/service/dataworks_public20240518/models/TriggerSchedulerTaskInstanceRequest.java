// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link TriggerSchedulerTaskInstanceRequest} extends {@link RequestModel}
 *
 * <p>TriggerSchedulerTaskInstanceRequest</p>
 */
public class TriggerSchedulerTaskInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvType")
    private String envType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TriggerTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long triggerTime;

    private TriggerSchedulerTaskInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.envType = builder.envType;
        this.taskId = builder.taskId;
        this.triggerTime = builder.triggerTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TriggerSchedulerTaskInstanceRequest create() {
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
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    /**
     * @return triggerTime
     */
    public Long getTriggerTime() {
        return this.triggerTime;
    }

    public static final class Builder extends Request.Builder<TriggerSchedulerTaskInstanceRequest, Builder> {
        private String regionId; 
        private String envType; 
        private Long taskId; 
        private Long triggerTime; 

        private Builder() {
            super();
        } 

        private Builder(TriggerSchedulerTaskInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.envType = request.envType;
            this.taskId = request.taskId;
            this.triggerTime = request.triggerTime;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The environment of the workspace. Valid values:</p>
         * <ul>
         * <li>Prod: production environment</li>
         * <li>Dev: development environment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        public Builder envType(String envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder taskId(Long taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The time defined by the HTTP Trigger node. This value is a UNIX timestamp.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        public Builder triggerTime(Long triggerTime) {
            this.putBodyParameter("TriggerTime", triggerTime);
            this.triggerTime = triggerTime;
            return this;
        }

        @Override
        public TriggerSchedulerTaskInstanceRequest build() {
            return new TriggerSchedulerTaskInstanceRequest(this);
        } 

    } 

}
