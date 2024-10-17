// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateTaskTimeVariablesRequest} extends {@link RequestModel}
 *
 * <p>UpdateTaskTimeVariablesRequest</p>
 */
public class UpdateTaskTimeVariablesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeVariables")
    @com.aliyun.core.annotation.Validation(required = true)
    private String timeVariables;

    private UpdateTaskTimeVariablesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.nodeId = builder.nodeId;
        this.tid = builder.tid;
        this.timeVariables = builder.timeVariables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTaskTimeVariablesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    /**
     * @return timeVariables
     */
    public String getTimeVariables() {
        return this.timeVariables;
    }

    public static final class Builder extends Request.Builder<UpdateTaskTimeVariablesRequest, Builder> {
        private String regionId; 
        private String nodeId; 
        private Long tid; 
        private String timeVariables; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTaskTimeVariablesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.nodeId = request.nodeId;
            this.tid = request.tid;
            this.timeVariables = request.timeVariables;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the task node. You can call the <a href="https://help.aliyun.com/document_detail/424711.html">GetTaskInstanceRelation</a> operation to query the node ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>43****</p>
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The ID of the tenant.</p>
         * <blockquote>
         * <p>:To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * <p>The time variables configured for the node. The value of this parameter must be a JSON string.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;variables&quot;:[ {&quot;name&quot;:&quot;var&quot;, &quot;pattern&quot;:&quot;yyyy-MM-dd|+0m+0h-2d+0w+0M+1y&quot;} ]}</p>
         */
        public Builder timeVariables(String timeVariables) {
            this.putQueryParameter("TimeVariables", timeVariables);
            this.timeVariables = timeVariables;
            return this;
        }

        @Override
        public UpdateTaskTimeVariablesRequest build() {
            return new UpdateTaskTimeVariablesRequest(this);
        } 

    } 

}
