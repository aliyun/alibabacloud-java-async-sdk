// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link CreateStoragePoolRequest} extends {@link RequestModel}
 *
 * <p>CreateStoragePoolRequest</p>
 */
public class CreateStoragePoolRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StoragePoolDNList")
    private String storagePoolDNList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StoragePoolName")
    private String storagePoolName;

    private CreateStoragePoolRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.storagePoolDNList = builder.storagePoolDNList;
        this.storagePoolName = builder.storagePoolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStoragePoolRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return storagePoolDNList
     */
    public String getStoragePoolDNList() {
        return this.storagePoolDNList;
    }

    /**
     * @return storagePoolName
     */
    public String getStoragePoolName() {
        return this.storagePoolName;
    }

    public static final class Builder extends Request.Builder<CreateStoragePoolRequest, Builder> {
        private String DBInstanceName; 
        private String regionId; 
        private String resourceGroupId; 
        private String storagePoolDNList; 
        private String storagePoolName; 

        private Builder() {
            super();
        } 

        private Builder(CreateStoragePoolRequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.storagePoolDNList = request.storagePoolDNList;
            this.storagePoolName = request.storagePoolName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-bjxxxxxxxx</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * StoragePoolDNList.
         */
        public Builder storagePoolDNList(String storagePoolDNList) {
            this.putQueryParameter("StoragePoolDNList", storagePoolDNList);
            this.storagePoolDNList = storagePoolDNList;
            return this;
        }

        /**
         * StoragePoolName.
         */
        public Builder storagePoolName(String storagePoolName) {
            this.putQueryParameter("StoragePoolName", storagePoolName);
            this.storagePoolName = storagePoolName;
            return this;
        }

        @Override
        public CreateStoragePoolRequest build() {
            return new CreateStoragePoolRequest(this);
        } 

    } 

}
