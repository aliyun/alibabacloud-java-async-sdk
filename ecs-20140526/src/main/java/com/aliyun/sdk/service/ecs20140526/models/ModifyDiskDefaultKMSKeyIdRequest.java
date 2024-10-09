// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyDiskDefaultKMSKeyIdRequest} extends {@link RequestModel}
 *
 * <p>ModifyDiskDefaultKMSKeyIdRequest</p>
 */
public class ModifyDiskDefaultKMSKeyIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KMSKeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String KMSKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyDiskDefaultKMSKeyIdRequest(Builder builder) {
        super(builder);
        this.KMSKeyId = builder.KMSKeyId;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDiskDefaultKMSKeyIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return KMSKeyId
     */
    public String getKMSKeyId() {
        return this.KMSKeyId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<ModifyDiskDefaultKMSKeyIdRequest, Builder> {
        private String KMSKeyId; 
        private String regionId; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDiskDefaultKMSKeyIdRequest request) {
            super(request);
            this.KMSKeyId = request.KMSKeyId;
            this.regionId = request.regionId;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The ID of the new KMS key.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        public Builder KMSKeyId(String KMSKeyId) {
            this.putQueryParameter("KMSKeyId", KMSKeyId);
            this.KMSKeyId = KMSKeyId;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public ModifyDiskDefaultKMSKeyIdRequest build() {
            return new ModifyDiskDefaultKMSKeyIdRequest(this);
        } 

    } 

}
