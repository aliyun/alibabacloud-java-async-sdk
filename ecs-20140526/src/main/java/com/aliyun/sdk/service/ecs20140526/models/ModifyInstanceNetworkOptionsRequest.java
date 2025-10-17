// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link ModifyInstanceNetworkOptionsRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceNetworkOptionsRequest</p>
 */
public class ModifyInstanceNetworkOptionsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BandwidthWeighting")
    private String bandwidthWeighting;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyInstanceNetworkOptionsRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.bandwidthWeighting = builder.bandwidthWeighting;
        this.instanceId = builder.instanceId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceNetworkOptionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return bandwidthWeighting
     */
    public String getBandwidthWeighting() {
        return this.bandwidthWeighting;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceNetworkOptionsRequest, Builder> {
        private String sourceRegionId; 
        private String bandwidthWeighting; 
        private String instanceId; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceNetworkOptionsRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.bandwidthWeighting = request.bandwidthWeighting;
            this.instanceId = request.instanceId;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * <p>The bandwidth weight.</p>
         * <p>The supported values vary with instance types. You can query the bandwidth weights supported by the current instance type by using the <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Vpc-L1: Vpc-L1.</li>
         * <li>Vpc-L2: Vpc-L2.</li>
         * <li>Ebs-L1: Ebs-L1.</li>
         * <li>Ebs-L2: Ebs-L2.</li>
         * <li>Default: the Default.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Vpc-L1</p>
         */
        public Builder bandwidthWeighting(String bandwidthWeighting) {
            this.putQueryParameter("BandwidthWeighting", bandwidthWeighting);
            this.bandwidthWeighting = bandwidthWeighting;
            return this;
        }

        /**
         * <p>The ID of the instance whose network bandwidth weight is to be modified.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp67acfmxazb4p****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public ModifyInstanceNetworkOptionsRequest build() {
            return new ModifyInstanceNetworkOptionsRequest(this);
        } 

    } 

}
