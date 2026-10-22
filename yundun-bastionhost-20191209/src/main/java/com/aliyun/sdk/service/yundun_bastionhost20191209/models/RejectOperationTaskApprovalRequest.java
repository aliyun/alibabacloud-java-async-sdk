// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link RejectOperationTaskApprovalRequest} extends {@link RequestModel}
 *
 * <p>RejectOperationTaskApprovalRequest</p>
 */
public class RejectOperationTaskApprovalRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApproveId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String approveId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private RejectOperationTaskApprovalRequest(Builder builder) {
        super(builder);
        this.approveId = builder.approveId;
        this.instanceId = builder.instanceId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RejectOperationTaskApprovalRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return approveId
     */
    public String getApproveId() {
        return this.approveId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<RejectOperationTaskApprovalRequest, Builder> {
        private String approveId; 
        private String instanceId; 
        private Long projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RejectOperationTaskApprovalRequest request) {
            super(request);
            this.approveId = request.approveId;
            this.instanceId = request.instanceId;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The O&amp;M task approval ID.</p>
         * <blockquote>
         * <p>You can call the ListTodoOpsTaskApprovals operation to query the value of this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder approveId(String approveId) {
            this.putQueryParameter("ApproveId", approveId);
            this.approveId = approveId;
            return this;
        }

        /**
         * <p>The instance ID of the Bastionhost instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the value of this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-st220aw****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The region ID of the Bastionhost instance.</p>
         * <blockquote>
         * <p>For the mappings between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public RejectOperationTaskApprovalRequest build() {
            return new RejectOperationTaskApprovalRequest(this);
        } 

    } 

}
