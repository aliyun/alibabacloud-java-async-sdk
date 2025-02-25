// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link CreateReverseDtsJobRequest} extends {@link RequestModel}
 *
 * <p>CreateReverseDtsJobRequest</p>
 */
public class CreateReverseDtsJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dtsJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShardPassword")
    private String shardPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShardUsername")
    private String shardUsername;

    private CreateReverseDtsJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dtsJobId = builder.dtsJobId;
        this.resourceGroupId = builder.resourceGroupId;
        this.shardPassword = builder.shardPassword;
        this.shardUsername = builder.shardUsername;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateReverseDtsJobRequest create() {
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
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return shardPassword
     */
    public String getShardPassword() {
        return this.shardPassword;
    }

    /**
     * @return shardUsername
     */
    public String getShardUsername() {
        return this.shardUsername;
    }

    public static final class Builder extends Request.Builder<CreateReverseDtsJobRequest, Builder> {
        private String regionId; 
        private String dtsJobId; 
        private String resourceGroupId; 
        private String shardPassword; 
        private String shardUsername; 

        private Builder() {
            super();
        } 

        private Builder(CreateReverseDtsJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dtsJobId = request.dtsJobId;
            this.resourceGroupId = request.resourceGroupId;
            this.shardPassword = request.shardPassword;
            this.shardUsername = request.shardUsername;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the synchronization or migration task, which can be queried by calling <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>n99m9jx822k****</p>
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * <p>Resource GroupId</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Shard Password</p>
         * 
         * <strong>example:</strong>
         * <p>DTStest****</p>
         */
        public Builder shardPassword(String shardPassword) {
            this.putQueryParameter("ShardPassword", shardPassword);
            this.shardPassword = shardPassword;
            return this;
        }

        /**
         * <p>Shard User name</p>
         * 
         * <strong>example:</strong>
         * <p>dtstest</p>
         */
        public Builder shardUsername(String shardUsername) {
            this.putQueryParameter("ShardUsername", shardUsername);
            this.shardUsername = shardUsername;
            return this;
        }

        @Override
        public CreateReverseDtsJobRequest build() {
            return new CreateReverseDtsJobRequest(this);
        } 

    } 

}
