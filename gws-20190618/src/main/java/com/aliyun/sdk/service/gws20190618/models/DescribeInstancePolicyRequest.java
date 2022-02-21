// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstancePolicyRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstancePolicyRequest</p>
 */
public class DescribeInstancePolicyRequest extends Request {
    @Query
    @NameInMap("AsyncMode")
    private Boolean asyncMode;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("TaskId")
    private String taskId;

    private DescribeInstancePolicyRequest(Builder builder) {
        super(builder);
        this.asyncMode = builder.asyncMode;
        this.instanceId = builder.instanceId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstancePolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asyncMode
     */
    public Boolean getAsyncMode() {
        return this.asyncMode;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<DescribeInstancePolicyRequest, Builder> {
        private Boolean asyncMode; 
        private String instanceId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstancePolicyRequest response) {
            super(response);
            this.asyncMode = response.asyncMode;
            this.instanceId = response.instanceId;
            this.taskId = response.taskId;
        } 

        /**
         * AsyncMode.
         */
        public Builder asyncMode(Boolean asyncMode) {
            this.putQueryParameter("AsyncMode", asyncMode);
            this.asyncMode = asyncMode;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DescribeInstancePolicyRequest build() {
            return new DescribeInstancePolicyRequest(this);
        } 

    } 

}
