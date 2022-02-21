// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTransferableNodesRequest} extends {@link RequestModel}
 *
 * <p>GetTransferableNodesRequest</p>
 */
public class GetTransferableNodesRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("count")
    @Validation(required = true)
    private Integer count;

    @Query
    @NameInMap("nodeType")
    @Validation(required = true)
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

        private Builder(GetTransferableNodesRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.count = response.count;
            this.nodeType = response.nodeType;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * count.
         */
        public Builder count(Integer count) {
            this.putQueryParameter("count", count);
            this.count = count;
            return this;
        }

        /**
         * nodeType.
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
