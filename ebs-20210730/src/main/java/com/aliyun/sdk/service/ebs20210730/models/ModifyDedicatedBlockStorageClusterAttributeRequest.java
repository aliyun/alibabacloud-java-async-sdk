// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDedicatedBlockStorageClusterAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyDedicatedBlockStorageClusterAttributeRequest</p>
 */
public class ModifyDedicatedBlockStorageClusterAttributeRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DbscId")
    @Validation(required = true)
    private String dbscId;

    @Query
    @NameInMap("DbscName")
    @Validation(required = true)
    private String dbscName;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ModifyDedicatedBlockStorageClusterAttributeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dbscId = builder.dbscId;
        this.dbscName = builder.dbscName;
        this.description = builder.description;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDedicatedBlockStorageClusterAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dbscId
     */
    public String getDbscId() {
        return this.dbscId;
    }

    /**
     * @return dbscName
     */
    public String getDbscName() {
        return this.dbscName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyDedicatedBlockStorageClusterAttributeRequest, Builder> {
        private String clientToken; 
        private String dbscId; 
        private String dbscName; 
        private String description; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDedicatedBlockStorageClusterAttributeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dbscId = request.dbscId;
            this.dbscName = request.dbscName;
            this.description = request.description;
            this.regionId = request.regionId;
        } 

        /**
         * 客户端幂等token
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 专属集群ID
         */
        public Builder dbscId(String dbscId) {
            this.putQueryParameter("DbscId", dbscId);
            this.dbscId = dbscId;
            return this;
        }

        /**
         * 修改后的专属集群名称，不为空
         */
        public Builder dbscName(String dbscName) {
            this.putQueryParameter("DbscName", dbscName);
            this.dbscName = dbscName;
            return this;
        }

        /**
         * 修改后的专属集群描述信息
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * 专属块存储集群所在的地域ID。您可以调用DescribeRegions
         * <p>
         * 查看最新的阿里云地域列表。
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyDedicatedBlockStorageClusterAttributeRequest build() {
            return new ModifyDedicatedBlockStorageClusterAttributeRequest(this);
        } 

    } 

}
