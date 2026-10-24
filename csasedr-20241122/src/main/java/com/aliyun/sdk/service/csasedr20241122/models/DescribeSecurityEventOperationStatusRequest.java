// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csasedr20241122.models;

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
 * {@link DescribeSecurityEventOperationStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeSecurityEventOperationStatusRequest</p>
 */
public class DescribeSecurityEventOperationStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityEventIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Long> securityEventIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long taskId;

    private DescribeSecurityEventOperationStatusRequest(Builder builder) {
        super(builder);
        this.securityEventIds = builder.securityEventIds;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityEventOperationStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return securityEventIds
     */
    public java.util.List<Long> getSecurityEventIds() {
        return this.securityEventIds;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<DescribeSecurityEventOperationStatusRequest, Builder> {
        private java.util.List<Long> securityEventIds; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSecurityEventOperationStatusRequest request) {
            super(request);
            this.securityEventIds = request.securityEventIds;
            this.taskId = request.taskId;
        } 

        /**
         * <p>The IDs of the security alert events.</p>
         * <blockquote>
         * <p>You must specify either TaskId or SecurityEventIds. The API call succeeds only if one of these parameters is specified.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        public Builder securityEventIds(java.util.List<Long> securityEventIds) {
            this.putQueryParameter("SecurityEventIds", securityEventIds);
            this.securityEventIds = securityEventIds;
            return this;
        }

        /**
         * <p>The ID of the task that processes the security alert event.</p>
         * <blockquote>
         * <p>You must specify either TaskId or SecurityEventIds. The API call succeeds only if one of these parameters is specified.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12121</p>
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DescribeSecurityEventOperationStatusRequest build() {
            return new DescribeSecurityEventOperationStatusRequest(this);
        } 

    } 

}
