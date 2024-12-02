// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link MoveDatabasesToNetworkDomainRequest} extends {@link RequestModel}
 *
 * <p>MoveDatabasesToNetworkDomainRequest</p>
 */
public class MoveDatabasesToNetworkDomainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > databaseIds;

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

    private MoveDatabasesToNetworkDomainRequest(Builder builder) {
        super(builder);
        this.databaseIds = builder.databaseIds;
        this.instanceId = builder.instanceId;
        this.networkDomainId = builder.networkDomainId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MoveDatabasesToNetworkDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databaseIds
     */
    public java.util.List < String > getDatabaseIds() {
        return this.databaseIds;
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

    public static final class Builder extends Request.Builder<MoveDatabasesToNetworkDomainRequest, Builder> {
        private java.util.List < String > databaseIds; 
        private String instanceId; 
        private String networkDomainId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(MoveDatabasesToNetworkDomainRequest request) {
            super(request);
            this.databaseIds = request.databaseIds;
            this.instanceId = request.instanceId;
            this.networkDomainId = request.networkDomainId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The IDs of the databases that you want to add to the network domain.</p>
         * <p>This parameter is required.</p>
         */
        public Builder databaseIds(java.util.List < String > databaseIds) {
            this.putQueryParameter("DatabaseIds", databaseIds);
            this.databaseIds = databaseIds;
            return this;
        }

        /**
         * <p>The bastion host ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-zpr3h2zo60l</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the network domain to which you want to add databases.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2758827.html">ListNetworkDomains</a> operation to query the network domain ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder networkDomainId(String networkDomainId) {
            this.putQueryParameter("NetworkDomainId", networkDomainId);
            this.networkDomainId = networkDomainId;
            return this;
        }

        /**
         * <p>The region ID of the bastion host.</p>
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
        public MoveDatabasesToNetworkDomainRequest build() {
            return new MoveDatabasesToNetworkDomainRequest(this);
        } 

    } 

}
