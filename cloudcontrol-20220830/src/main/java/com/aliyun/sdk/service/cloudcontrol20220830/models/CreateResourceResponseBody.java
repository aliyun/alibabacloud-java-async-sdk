// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateResourceResponseBody model) {
            this.requestId = model.requestId;
            this.resourceId = model.resourceId;
            this.resourcePath = model.resourcePath;
            this.taskId = model.taskId;
        } 

        /**
         * <p>The ID of a request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cctest</p>
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The path of the resources. The relative resource ID. The resource path contains the complete resource location (parent resource/child resource).</p>
         * 
         * <strong>example:</strong>
         * <p>Instance/r-8vbf5abe31c9c4d4/Account/cctest</p>
         */
        public Builder resourcePath(String resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }

        /**
         * <p>The ID of the asynchronous task. If the operation is asynchronous, this field is returned. In this case, the HTTP status code 202 is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>task-433aead756057fff8189a7ce5****</p>
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
