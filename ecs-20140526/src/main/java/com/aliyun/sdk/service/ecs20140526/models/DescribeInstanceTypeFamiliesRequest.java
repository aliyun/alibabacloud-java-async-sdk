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
 * {@link DescribeInstanceTypeFamiliesRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceTypeFamiliesRequest</p>
 */
public class DescribeInstanceTypeFamiliesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Generation")
    private String generation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private DescribeInstanceTypeFamiliesRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.generation = builder.generation;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceTypeFamiliesRequest create() {
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
     * @return generation
     */
    public String getGeneration() {
        return this.generation;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<DescribeInstanceTypeFamiliesRequest, Builder> {
        private String sourceRegionId; 
        private String generation; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceTypeFamiliesRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.generation = request.generation;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
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
         * <p>The generation of instance families. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>. Valid values:</p>
         * <ul>
         * <li><p>ecs-1: Series I instance family. These were among the first to go online and are cost-effective.</p>
         * </li>
         * <li><p>ecs-2: Series II instance family. This family features a second hardware and software upgrade with enhanced instance performance.</p>
         * </li>
         * <li><p>ecs-3: Series III instance family. This family delivers excellent performance and can handle various workload requirements.</p>
         * </li>
         * <li><p>ecs-4: Series IV instance family. This family includes common enterprise-level instance types (such as g5, c5, and r5), ECS Bare Metal instance types (such as ebmc5s, ebmg5s, and ebmr5s), and burstable instance types (such as t5). They provide strong scenario adaptability, can handle massive popular workloads, and deliver lower latency.</p>
         * </li>
         * <li><p>ecs-5: Series V instance family. This family includes common enterprise-level instance types (such as g6, c6, and r6), ECS Bare Metal instance types (such as ebmg6, ebmg6e, and ebmc6), and storage-enhanced instance family types (such as g6e). They deliver faster response times and superior performance.</p>
         * </li>
         * <li><p>ecs-6: Series VI instance family. This family includes enterprise-level instance types (such as hfc7, hfg7, and hfr7) and ECS Bare Metal instance types (such as ebmhfg7). This series of instance families is in invitational preview.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ecs-5</p>
         */
        public Builder generation(String generation) {
            this.putQueryParameter("Generation", generation);
            this.generation = generation;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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
         * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
        public DescribeInstanceTypeFamiliesRequest build() {
            return new DescribeInstanceTypeFamiliesRequest(this);
        } 

    } 

}
