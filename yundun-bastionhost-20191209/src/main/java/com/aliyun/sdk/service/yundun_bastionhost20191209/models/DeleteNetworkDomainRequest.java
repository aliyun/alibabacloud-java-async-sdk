// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteNetworkDomainRequest} extends {@link RequestModel}
 *
 * <p>DeleteNetworkDomainRequest</p>
 */
public class DeleteNetworkDomainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkDomainId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkDomainId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteNetworkDomainRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.networkDomainId = builder.networkDomainId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNetworkDomainRequest create() {
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
     * @return networkDomainId
     */
    public String getNetworkDomainId() {
        return this.networkDomainId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteNetworkDomainRequest, Builder> {
        private String instanceId; 
        private String networkDomainId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNetworkDomainRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.networkDomainId = request.networkDomainId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the bastion host whose network domain you want to delete.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the ID of the bastion host.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost_std_intl-sg-uq833e2dz02</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the network domain to be deleted.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder networkDomainId(String networkDomainId) {
            this.putQueryParameter("NetworkDomainId", networkDomainId);
            this.networkDomainId = networkDomainId;
            return this;
        }

        /**
         * <p>The region ID of the bastion host whose network domain you want to delete.</p>
         * <blockquote>
         * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
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
        public DeleteNetworkDomainRequest build() {
            return new DeleteNetworkDomainRequest(this);
        } 

    } 

}
