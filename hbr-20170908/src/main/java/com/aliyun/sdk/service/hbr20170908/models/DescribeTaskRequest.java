// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTaskRequest} extends {@link RequestModel}
 *
 * <p>DescribeTaskRequest</p>
 */
public class DescribeTaskRequest extends Request {
    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("TaskId")
    private String taskId;

    @Query
    @NameInMap("Token")
    private String token;

    private DescribeTaskRequest(Builder builder) {
        super(builder);
        this.resourceGroupId = builder.resourceGroupId;
        this.taskId = builder.taskId;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<DescribeTaskRequest, Builder> {
        private String resourceGroupId; 
        private String taskId; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTaskRequest response) {
            super(response);
            this.resourceGroupId = response.resourceGroupId;
            this.taskId = response.taskId;
            this.token = response.token;
        } 

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public DescribeTaskRequest build() {
            return new DescribeTaskRequest(this);
        } 

    } 

}
