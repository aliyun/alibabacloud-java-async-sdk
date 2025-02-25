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
 * {@link UpdatePolarDBXInstanceNodeRequest} extends {@link RequestModel}
 *
 * <p>UpdatePolarDBXInstanceNodeRequest</p>
 */
public class UpdatePolarDBXInstanceNodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddDNSpec")
    private String addDNSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CNNodeCount")
    private String CNNodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DNNodeCount")
    private String DNNodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbInstanceNodeCount")
    private String dbInstanceNodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteDNIds")
    private String deleteDNIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StoragePoolName")
    private String storagePoolName;

    private UpdatePolarDBXInstanceNodeRequest(Builder builder) {
        super(builder);
        this.addDNSpec = builder.addDNSpec;
        this.CNNodeCount = builder.CNNodeCount;
        this.clientToken = builder.clientToken;
        this.DBInstanceName = builder.DBInstanceName;
        this.DNNodeCount = builder.DNNodeCount;
        this.dbInstanceNodeCount = builder.dbInstanceNodeCount;
        this.deleteDNIds = builder.deleteDNIds;
        this.regionId = builder.regionId;
        this.storagePoolName = builder.storagePoolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePolarDBXInstanceNodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addDNSpec
     */
    public String getAddDNSpec() {
        return this.addDNSpec;
    }

    /**
     * @return CNNodeCount
     */
    public String getCNNodeCount() {
        return this.CNNodeCount;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return DNNodeCount
     */
    public String getDNNodeCount() {
        return this.DNNodeCount;
    }

    /**
     * @return dbInstanceNodeCount
     */
    public String getDbInstanceNodeCount() {
        return this.dbInstanceNodeCount;
    }

    /**
     * @return deleteDNIds
     */
    public String getDeleteDNIds() {
        return this.deleteDNIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return storagePoolName
     */
    public String getStoragePoolName() {
        return this.storagePoolName;
    }

    public static final class Builder extends Request.Builder<UpdatePolarDBXInstanceNodeRequest, Builder> {
        private String addDNSpec; 
        private String CNNodeCount; 
        private String clientToken; 
        private String DBInstanceName; 
        private String DNNodeCount; 
        private String dbInstanceNodeCount; 
        private String deleteDNIds; 
        private String regionId; 
        private String storagePoolName; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePolarDBXInstanceNodeRequest request) {
            super(request);
            this.addDNSpec = request.addDNSpec;
            this.CNNodeCount = request.CNNodeCount;
            this.clientToken = request.clientToken;
            this.DBInstanceName = request.DBInstanceName;
            this.DNNodeCount = request.DNNodeCount;
            this.dbInstanceNodeCount = request.dbInstanceNodeCount;
            this.deleteDNIds = request.deleteDNIds;
            this.regionId = request.regionId;
            this.storagePoolName = request.storagePoolName;
        } 

        /**
         * AddDNSpec.
         */
        public Builder addDNSpec(String addDNSpec) {
            this.putQueryParameter("AddDNSpec", addDNSpec);
            this.addDNSpec = addDNSpec;
            return this;
        }

        /**
         * CNNodeCount.
         */
        public Builder CNNodeCount(String CNNodeCount) {
            this.putQueryParameter("CNNodeCount", CNNodeCount);
            this.CNNodeCount = CNNodeCount;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-hzjasdyuoo</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * DNNodeCount.
         */
        public Builder DNNodeCount(String DNNodeCount) {
            this.putQueryParameter("DNNodeCount", DNNodeCount);
            this.DNNodeCount = DNNodeCount;
            return this;
        }

        /**
         * DbInstanceNodeCount.
         */
        public Builder dbInstanceNodeCount(String dbInstanceNodeCount) {
            this.putQueryParameter("DbInstanceNodeCount", dbInstanceNodeCount);
            this.dbInstanceNodeCount = dbInstanceNodeCount;
            return this;
        }

        /**
         * DeleteDNIds.
         */
        public Builder deleteDNIds(String deleteDNIds) {
            this.putQueryParameter("DeleteDNIds", deleteDNIds);
            this.deleteDNIds = deleteDNIds;
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
         * StoragePoolName.
         */
        public Builder storagePoolName(String storagePoolName) {
            this.putQueryParameter("StoragePoolName", storagePoolName);
            this.storagePoolName = storagePoolName;
            return this;
        }

        @Override
        public UpdatePolarDBXInstanceNodeRequest build() {
            return new UpdatePolarDBXInstanceNodeRequest(this);
        } 

    } 

}
