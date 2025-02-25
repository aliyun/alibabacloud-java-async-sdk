// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResourceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateResourceResponseBody</p>
 */
public class CreateResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resourceId")
    private String resourceId;

    @com.aliyun.core.annotation.NameInMap("resourcePath")
    private String resourcePath;

    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    private CreateResourceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceId = builder.resourceId;
        this.resourcePath = builder.resourcePath;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourcePath
     */
    public String getResourcePath() {
        return this.resourcePath;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String requestId; 
        private String resourceId; 
        private String resourcePath; 
        private String taskId; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resourceId.
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * resourcePath.
         */
        public Builder resourcePath(String resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }

        /**
         * taskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public CreateResourceResponseBody build() {
            return new CreateResourceResponseBody(this);
        } 

    } 

}
