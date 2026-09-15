// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link DescribeOnlineTestResultRequest} extends {@link RequestModel}
 *
 * <p>DescribeOnlineTestResultRequest</p>
 */
public class DescribeOnlineTestResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    private String serviceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private DescribeOnlineTestResultRequest(Builder builder) {
        super(builder);
        this.resourceType = builder.resourceType;
        this.serviceCode = builder.serviceCode;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOnlineTestResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<DescribeOnlineTestResultRequest, Builder> {
        private String resourceType; 
        private String serviceCode; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOnlineTestResultRequest request) {
            super(request);
            this.resourceType = request.resourceType;
            this.serviceCode = request.serviceCode;
            this.taskId = request.taskId;
        } 

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The service code.</p>
         * 
         * <strong>example:</strong>
         * <p>videoDetection</p>
         */
        public Builder serviceCode(String serviceCode) {
            this.putQueryParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * <p>The ID of the detection task.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx-xxxxx</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DescribeOnlineTestResultRequest build() {
            return new DescribeOnlineTestResultRequest(this);
        } 

    } 

}
