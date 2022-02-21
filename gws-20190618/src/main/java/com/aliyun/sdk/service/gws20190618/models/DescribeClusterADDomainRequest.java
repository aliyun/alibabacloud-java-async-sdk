// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterADDomainRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterADDomainRequest</p>
 */
public class DescribeClusterADDomainRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("TaskId")
    private String taskId;

    private DescribeClusterADDomainRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterADDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DescribeClusterADDomainRequest, Builder> {
        private String clusterId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterADDomainRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.taskId = response.taskId;
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
        public DescribeClusterADDomainRequest build() {
            return new DescribeClusterADDomainRequest(this);
        } 

    } 

}
