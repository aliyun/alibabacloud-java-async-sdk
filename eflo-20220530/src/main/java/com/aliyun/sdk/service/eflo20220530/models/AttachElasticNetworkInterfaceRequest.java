// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link AttachElasticNetworkInterfaceRequest} extends {@link RequestModel}
 *
 * <p>AttachElasticNetworkInterfaceRequest</p>
 */
public class AttachElasticNetworkInterfaceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ElasticNetworkInterfaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String elasticNetworkInterfaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private AttachElasticNetworkInterfaceRequest(Builder builder) {
        super(builder);
        this.elasticNetworkInterfaceId = builder.elasticNetworkInterfaceId;
        this.nodeId = builder.nodeId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachElasticNetworkInterfaceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return elasticNetworkInterfaceId
     */
    public String getElasticNetworkInterfaceId() {
        return this.elasticNetworkInterfaceId;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AttachElasticNetworkInterfaceRequest, Builder> {
        private String elasticNetworkInterfaceId; 
        private String nodeId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AttachElasticNetworkInterfaceRequest request) {
            super(request);
            this.elasticNetworkInterfaceId = request.elasticNetworkInterfaceId;
            this.nodeId = request.nodeId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the ENI.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>leni-1234****</p>
         */
        public Builder elasticNetworkInterfaceId(String elasticNetworkInterfaceId) {
            this.putBodyParameter("ElasticNetworkInterfaceId", elasticNetworkInterfaceId);
            this.elasticNetworkInterfaceId = elasticNetworkInterfaceId;
            return this;
        }

        /**
         * <p>The ID of the node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-lbj3aej****</p>
         */
        public Builder nodeId(String nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The region ID of the disk.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public AttachElasticNetworkInterfaceRequest build() {
            return new AttachElasticNetworkInterfaceRequest(this);
        } 

    } 

}
