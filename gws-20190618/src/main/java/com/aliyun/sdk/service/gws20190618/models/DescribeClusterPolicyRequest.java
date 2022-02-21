// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterPolicyRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterPolicyRequest</p>
 */
public class DescribeClusterPolicyRequest extends Request {
    @Query
    @NameInMap("AsyncMode")
    private Boolean asyncMode;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("TaskId")
    private String taskId;

    private DescribeClusterPolicyRequest(Builder builder) {
        super(builder);
        this.asyncMode = builder.asyncMode;
        this.clusterId = builder.clusterId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterPolicyRequest create() {
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
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<DescribeClusterPolicyRequest, Builder> {
        private Boolean asyncMode; 
        private String clusterId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterPolicyRequest response) {
            super(response);
            this.asyncMode = response.asyncMode;
            this.clusterId = response.clusterId;
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
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
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
        public DescribeClusterPolicyRequest build() {
            return new DescribeClusterPolicyRequest(this);
        } 

    } 

}
