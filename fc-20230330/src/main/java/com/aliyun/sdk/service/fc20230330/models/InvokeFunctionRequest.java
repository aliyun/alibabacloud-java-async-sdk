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
         * <p>The function name.</p>
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
         * <p>The request parameters of function invocation.</p>
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
         * <p>The ID of the asynchronous task. You must enable the asynchronous task feature in advance.</p>
         * <blockquote>
         * <p> If you use an SDK to invoke a function, we recommend that you specify a business-related ID to facilitate subsequent operations. For example, a video processing function can use video file names as invocation IDs. This way, you can easily check whether a video is successfully processed or terminated before it is processed. The ID can start only with letters or underscores. An ID can contain <em>letters, digits (0 - 9), underscores</em>, and hyphens (-). It can be up to 128 characters in length. If you do not specify the ID of the asynchronous invocation, the system automatically generates an ID.</p>
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
         * <p>The type of function invocation. Valid values: Sync and Async.</p>
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
         * <p>The log type of function invocation. Valid values: None and Tail.</p>
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
