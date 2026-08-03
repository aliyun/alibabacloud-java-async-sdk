// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link DescribeInspectionTaskReportRequest} extends {@link RequestModel}
 *
 * <p>DescribeInspectionTaskReportRequest</p>
 */
public class DescribeInspectionTaskReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InspectionInsId")
    private String inspectionInsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private DescribeInspectionTaskReportRequest(Builder builder) {
        super(builder);
        this.inspectionInsId = builder.inspectionInsId;
        this.instanceId = builder.instanceId;
        this.securityToken = builder.securityToken;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInspectionTaskReportRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return inspectionInsId
     */
    public String getInspectionInsId() {
        return this.inspectionInsId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<DescribeInspectionTaskReportRequest, Builder> {
        private String inspectionInsId; 
        private String instanceId; 
        private String securityToken; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInspectionTaskReportRequest request) {
            super(request);
            this.inspectionInsId = request.inspectionInsId;
            this.instanceId = request.instanceId;
            this.securityToken = request.securityToken;
            this.taskId = request.taskId;
        } 

        /**
         * InspectionInsId.
         */
        public Builder inspectionInsId(String inspectionInsId) {
            this.putQueryParameter("InspectionInsId", inspectionInsId);
            this.inspectionInsId = inspectionInsId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ta-bp19f4f6994813xxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tit-dca42f85c73644e0ab5c80ef64121axxx</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DescribeInspectionTaskReportRequest build() {
            return new DescribeInspectionTaskReportRequest(this);
        } 

    } 

}
