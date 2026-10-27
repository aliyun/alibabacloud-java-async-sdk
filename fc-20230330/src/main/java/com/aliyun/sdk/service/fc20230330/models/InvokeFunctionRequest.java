// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link InvokeFunctionRequest} extends {@link RequestModel}
 *
 * <p>InvokeFunctionRequest</p>
 */
public class InvokeFunctionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("functionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functionName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.io.InputStream body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("qualifier")
    private String qualifier;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-fc-async-task-id")
    private String xFcAsyncTaskId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-fc-invocation-type")
    private String xFcInvocationType;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-fc-log-type")
    private String xFcLogType;

    private InvokeFunctionRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.body = builder.body;
        this.qualifier = builder.qualifier;
        this.xFcAsyncTaskId = builder.xFcAsyncTaskId;
        this.xFcInvocationType = builder.xFcInvocationType;
        this.xFcLogType = builder.xFcLogType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeFunctionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return body
     */
    public java.io.InputStream getBody() {
        return this.body;
    }

    /**
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * @return xFcAsyncTaskId
     */
    public String getXFcAsyncTaskId() {
        return this.xFcAsyncTaskId;
    }

    /**
     * @return xFcInvocationType
     */
    public String getXFcInvocationType() {
        return this.xFcInvocationType;
    }

    /**
     * @return xFcLogType
     */
    public String getXFcLogType() {
        return this.xFcLogType;
    }

    public static final class Builder extends Request.Builder<InvokeFunctionRequest, Builder> {
        private String functionName; 
        private java.io.InputStream body; 
        private String qualifier; 
        private String xFcAsyncTaskId; 
        private String xFcInvocationType; 
        private String xFcLogType; 

        private Builder() {
            super();
        } 

        private Builder(InvokeFunctionRequest request) {
            super(request);
            this.functionName = request.functionName;
            this.body = request.body;
            this.qualifier = request.qualifier;
            this.xFcAsyncTaskId = request.xFcAsyncTaskId;
            this.xFcInvocationType = request.xFcInvocationType;
            this.xFcLogType = request.xFcLogType;
        } 

        /**
         * <p>The name of the function.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-func</p>
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * <p>The parameters for function invoke.</p>
         * 
         * <strong>example:</strong>
         * <p>event</p>
         */
        public Builder body(java.io.InputStream body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>The version or alias of the function.</p>
         * 
         * <strong>example:</strong>
         * <p>LATEST</p>
         */
        public Builder qualifier(String qualifier) {
            this.putQueryParameter("qualifier", qualifier);
            this.qualifier = qualifier;
            return this;
        }

        /**
         * <p>The ID of the asynchronous task. You must enable asynchronous tasks in advance.</p>
         * <blockquote>
         * <p>We recommend that you set a business-related ID when you use the SDK to invoke the function, which facilitates subsequent operations on the execution. For example, a video processing function can use the video file name as the invoke ID, through which you can check whether the video processing is complete or stop the video processing. The ID must start with an uppercase or lowercase letter or an underscore (<em>), and can contain uppercase and lowercase letters, digits (0-9), underscores (</em>), and hyphens (-). It can be up to 128 characters in length. If you do not specify an ID for the asynchronous invoke, the system automatically generates one.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test-id</p>
         */
        public Builder xFcAsyncTaskId(String xFcAsyncTaskId) {
            this.putHeaderParameter("x-fc-async-task-id", xFcAsyncTaskId);
            this.xFcAsyncTaskId = xFcAsyncTaskId;
            return this;
        }

        /**
         * <p>The function invoke type. Valid values: Sync and Async.</p>
         * 
         * <strong>example:</strong>
         * <p>Sync</p>
         */
        public Builder xFcInvocationType(String xFcInvocationType) {
            this.putHeaderParameter("x-fc-invocation-type", xFcInvocationType);
            this.xFcInvocationType = xFcInvocationType;
            return this;
        }

        /**
         * <p>The log type returned for function invoke. Valid values: None and Tail.</p>
         * 
         * <strong>example:</strong>
         * <p>Tail</p>
         */
        public Builder xFcLogType(String xFcLogType) {
            this.putHeaderParameter("x-fc-log-type", xFcLogType);
            this.xFcLogType = xFcLogType;
            return this;
        }

        @Override
        public InvokeFunctionRequest build() {
            return new InvokeFunctionRequest(this);
        } 

    } 

}
