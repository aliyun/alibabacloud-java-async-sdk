// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link GetTransferableNodesRequest} extends {@link RequestModel}
 *
 * <p>GetTransferableNodesRequest</p>
 */
public class GetTransferableNodesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("count")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer count;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nodeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeType;

    private GetTransferableNodesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.count = builder.count;
        this.nodeType = builder.nodeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTransferableNodesRequest create() {
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
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return nodeType
     */
    public String getNodeType() {
        return this.nodeType;
    }

    public static final class Builder extends Request.Builder<GetTransferableNodesRequest, Builder> {
        private String instanceId; 
        private Integer count; 
        private String nodeType; 

        private Builder() {
            super();
        } 

        private Builder(GetTransferableNodesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.count = request.count;
            this.nodeType = request.nodeType;
        } 

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-nif1q9o8r0008****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The number of nodes to be migrated.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder count(Integer count) {
            this.putQueryParameter("count", count);
            this.count = count;
            return this;
        }

        /**
         * <p>The type of nodes.<strong>WORKER</strong>represents a hot node,<strong>WORKER_WARM</strong> represents a warm node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WORKER</p>
         */
        public Builder nodeType(String nodeType) {
            this.putQueryParameter("nodeType", nodeType);
            this.nodeType = nodeType;
            return this;
        }

        @Override
        public GetTransferableNodesRequest build() {
            return new GetTransferableNodesRequest(this);
        } 

    } 

}
