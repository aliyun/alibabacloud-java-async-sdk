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
 * {@link ApplyAutoSnapshotPolicyRequest} extends {@link RequestModel}
 *
 * <p>ApplyAutoSnapshotPolicyRequest</p>
 */
public class ApplyAutoSnapshotPolicyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("autoSnapshotPolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String autoSnapshotPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("diskIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String diskIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ApplyAutoSnapshotPolicyRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
        this.diskIds = builder.diskIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyAutoSnapshotPolicyRequest create() {
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

    /**
     * @return autoSnapshotPolicyId
     */
    public String getAutoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }

    /**
     * @return diskIds
     */
    public String getDiskIds() {
        return this.diskIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ApplyAutoSnapshotPolicyRequest, Builder> {
        private String sourceRegionId; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String autoSnapshotPolicyId; 
        private String diskIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ApplyAutoSnapshotPolicyRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.autoSnapshotPolicyId = request.autoSnapshotPolicyId;
            this.diskIds = request.diskIds;
            this.regionId = request.regionId;
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

        /**
         * <p>The ID of the automatic snapshot policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp14yziiuvu3s6jn****</p>
         */
        public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.putQueryParameter("autoSnapshotPolicyId", autoSnapshotPolicyId);
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }

        /**
         * <p>The IDs of disks. The value is a JSON array that consists of disk IDs. Separate the disk IDs with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;d-bp14k9cxvr5uzy54****&quot;, &quot;d-bp1dtj8v7x6u08iw****&quot;, &quot;d-bp1c0tyj9tfli2r8****&quot;]</p>
         */
        public Builder diskIds(String diskIds) {
            this.putQueryParameter("diskIds", diskIds);
            this.diskIds = diskIds;
            return this;
        }

        /**
         * <p>The region ID of the automatic snapshot policy and the disks. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ApplyAutoSnapshotPolicyRequest build() {
            return new ApplyAutoSnapshotPolicyRequest(this);
        } 

    } 

}
