// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTaskContentRequest} extends {@link RequestModel}
 *
 * <p>UpdateTaskContentRequest</p>
 */
public class UpdateTaskContentRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeContent")
    private String nodeContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private UpdateTaskContentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.nodeContent = builder.nodeContent;
        this.nodeId = builder.nodeId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTaskContentRequest create() {
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
     * @return nodeContent
     */
    public String getNodeContent() {
        return this.nodeContent;
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

    public static final class Builder extends Request.Builder<UpdateTaskContentRequest, Builder> {
        private String regionId; 
        private String nodeContent; 
        private String nodeId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTaskContentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.nodeContent = request.nodeContent;
            this.nodeId = request.nodeId;
            this.tid = request.tid;
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
         * The node configurations after modification.
         */
        public Builder nodeContent(String nodeContent) {
            this.putQueryParameter("NodeContent", nodeContent);
            this.nodeContent = nodeContent;
            return this;
        }

        /**
         * The ID of the task node. You can call the [GetTaskInstanceRelation](~~424711~~) operation to query the node ID.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * The ID of the tenant.
         * <p>
         * 
         * > To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the ["View information about the current tenant"](~~181330~~) section of the Manage DMS tenants topic.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public UpdateTaskContentRequest build() {
            return new UpdateTaskContentRequest(this);
        } 

    } 

}
