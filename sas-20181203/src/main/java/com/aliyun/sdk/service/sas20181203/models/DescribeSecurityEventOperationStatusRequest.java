// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityEventIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > securityEventIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long taskId;

    private DescribeSecurityEventOperationStatusRequest(Builder builder) {
        super(builder);
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityEventIds = builder.securityEventIds;
        this.sourceIp = builder.sourceIp;
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return securityEventIds
     */
    public java.util.List < String > getSecurityEventIds() {
        return this.securityEventIds;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<DescribeSecurityEventOperationStatusRequest, Builder> {
        private Long resourceOwnerId; 
        private java.util.List < String > securityEventIds; 
        private String sourceIp; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSecurityEventOperationStatusRequest request) {
            super(request);
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityEventIds = request.securityEventIds;
            this.sourceIp = request.sourceIp;
            this.taskId = request.taskId;
        } 

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The IDs of the alert events.</p>
         * <blockquote>
         * <p> You must specify at least one of the TaskId and SecurityEventIds parameters.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;909361&quot;]</p>
         */
        public Builder securityEventIds(java.util.List < String > securityEventIds) {
            this.putQueryParameter("SecurityEventIds", securityEventIds);
            this.securityEventIds = securityEventIds;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The ID of the task that handles the alert events.</p>
         * <blockquote>
         * <p> You must specify at least one of the TaskId and SecurityEventIds parameters.</p>
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
