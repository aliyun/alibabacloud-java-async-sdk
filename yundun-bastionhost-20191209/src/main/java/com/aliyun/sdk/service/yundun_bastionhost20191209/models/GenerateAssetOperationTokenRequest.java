// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateAssetOperationTokenRequest} extends {@link RequestModel}
 *
 * <p>GenerateAssetOperationTokenRequest</p>
 */
public class GenerateAssetOperationTokenRequest extends Request {
    @Query
    @NameInMap("AssetAccountId")
    private String assetAccountId;

    @Query
    @NameInMap("AssetAccountName")
    private String assetAccountName;

    @Query
    @NameInMap("AssetAccountPassword")
    private String assetAccountPassword;

    @Query
    @NameInMap("AssetAccountProtocolName")
    private String assetAccountProtocolName;

    @Query
    @NameInMap("AssetId")
    @Validation(required = true)
    private String assetId;

    @Query
    @NameInMap("AssetType")
    @Validation(required = true)
    private String assetType;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private GenerateAssetOperationTokenRequest(Builder builder) {
        super(builder);
        this.assetAccountId = builder.assetAccountId;
        this.assetAccountName = builder.assetAccountName;
        this.assetAccountPassword = builder.assetAccountPassword;
        this.assetAccountProtocolName = builder.assetAccountProtocolName;
        this.assetId = builder.assetId;
        this.assetType = builder.assetType;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateAssetOperationTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetAccountId
     */
    public String getAssetAccountId() {
        return this.assetAccountId;
    }

    /**
     * @return assetAccountName
     */
    public String getAssetAccountName() {
        return this.assetAccountName;
    }

    /**
     * @return assetAccountPassword
     */
    public String getAssetAccountPassword() {
        return this.assetAccountPassword;
    }

    /**
     * @return assetAccountProtocolName
     */
    public String getAssetAccountProtocolName() {
        return this.assetAccountProtocolName;
    }

    /**
     * @return assetId
     */
    public String getAssetId() {
        return this.assetId;
    }

    /**
     * @return assetType
     */
    public String getAssetType() {
        return this.assetType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GenerateAssetOperationTokenRequest, Builder> {
        private String assetAccountId; 
        private String assetAccountName; 
        private String assetAccountPassword; 
        private String assetAccountProtocolName; 
        private String assetId; 
        private String assetType; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GenerateAssetOperationTokenRequest request) {
            super(request);
            this.assetAccountId = request.assetAccountId;
            this.assetAccountName = request.assetAccountName;
            this.assetAccountPassword = request.assetAccountPassword;
            this.assetAccountProtocolName = request.assetAccountProtocolName;
            this.assetId = request.assetId;
            this.assetType = request.assetType;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * AssetAccountId.
         */
        public Builder assetAccountId(String assetAccountId) {
            this.putQueryParameter("AssetAccountId", assetAccountId);
            this.assetAccountId = assetAccountId;
            return this;
        }

        /**
         * AssetAccountName.
         */
        public Builder assetAccountName(String assetAccountName) {
            this.putQueryParameter("AssetAccountName", assetAccountName);
            this.assetAccountName = assetAccountName;
            return this;
        }

        /**
         * AssetAccountPassword.
         */
        public Builder assetAccountPassword(String assetAccountPassword) {
            this.putQueryParameter("AssetAccountPassword", assetAccountPassword);
            this.assetAccountPassword = assetAccountPassword;
            return this;
        }

        /**
         * AssetAccountProtocolName.
         */
        public Builder assetAccountProtocolName(String assetAccountProtocolName) {
            this.putQueryParameter("AssetAccountProtocolName", assetAccountProtocolName);
            this.assetAccountProtocolName = assetAccountProtocolName;
            return this;
        }

        /**
         * AssetId.
         */
        public Builder assetId(String assetId) {
            this.putQueryParameter("AssetId", assetId);
            this.assetId = assetId;
            return this;
        }

        /**
         * AssetType.
         */
        public Builder assetType(String assetType) {
            this.putQueryParameter("AssetType", assetType);
            this.assetType = assetType;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GenerateAssetOperationTokenRequest build() {
            return new GenerateAssetOperationTokenRequest(this);
        } 

    } 

}
