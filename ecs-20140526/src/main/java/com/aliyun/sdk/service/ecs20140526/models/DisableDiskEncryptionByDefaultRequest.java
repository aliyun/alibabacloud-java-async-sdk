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
 * {@link DisableDiskEncryptionByDefaultRequest} extends {@link RequestModel}
 *
 * <p>DisableDiskEncryptionByDefaultRequest</p>
 */
public class DisableDiskEncryptionByDefaultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private DisableDiskEncryptionByDefaultRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableDiskEncryptionByDefaultRequest create() {
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<DisableDiskEncryptionByDefaultRequest, Builder> {
        private String regionId; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DisableDiskEncryptionByDefaultRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The ID of the region for which you want to disable Account-level EBS Default Encryption. You can call the <a href="https://help.aliyun.com/document_detail/2679950.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
        public DisableDiskEncryptionByDefaultRequest build() {
            return new DisableDiskEncryptionByDefaultRequest(this);
        } 

    } 

}
