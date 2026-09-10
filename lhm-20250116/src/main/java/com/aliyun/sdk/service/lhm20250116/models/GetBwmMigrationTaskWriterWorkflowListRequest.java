// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link GetBwmMigrationTaskWriterWorkflowListRequest} extends {@link RequestModel}
 *
 * <p>GetBwmMigrationTaskWriterWorkflowListRequest</p>
 */
public class GetBwmMigrationTaskWriterWorkflowListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workflowName")
    private String workflowName;

    private GetBwmMigrationTaskWriterWorkflowListRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.workflowName = builder.workflowName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBwmMigrationTaskWriterWorkflowListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return workflowName
     */
    public String getWorkflowName() {
        return this.workflowName;
    }

    public static final class Builder extends Request.Builder<GetBwmMigrationTaskWriterWorkflowListRequest, Builder> {
        private String instanceId; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String workflowName; 

        private Builder() {
            super();
        } 

        private Builder(GetBwmMigrationTaskWriterWorkflowListRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.workflowName = request.workflowName;
        } 

        /**
         * <p>The submit instance identifier.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("pageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The workflow name.</p>
         * 
         * <strong>example:</strong>
         * <p>workflow_name</p>
         */
        public Builder workflowName(String workflowName) {
            this.putQueryParameter("workflowName", workflowName);
            this.workflowName = workflowName;
            return this;
        }

        @Override
        public GetBwmMigrationTaskWriterWorkflowListRequest build() {
            return new GetBwmMigrationTaskWriterWorkflowListRequest(this);
        } 

    } 

}
