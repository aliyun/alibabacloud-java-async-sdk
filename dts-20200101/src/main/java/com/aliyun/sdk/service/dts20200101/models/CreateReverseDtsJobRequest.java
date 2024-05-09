// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * DtsJobId.
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ShardPassword.
         */
        public Builder shardPassword(String shardPassword) {
            this.putQueryParameter("ShardPassword", shardPassword);
            this.shardPassword = shardPassword;
            return this;
        }

        /**
         * ShardUsername.
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
