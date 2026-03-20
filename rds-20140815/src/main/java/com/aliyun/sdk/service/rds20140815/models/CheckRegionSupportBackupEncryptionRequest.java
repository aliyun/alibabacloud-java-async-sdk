// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link CheckRegionSupportBackupEncryptionRequest} extends {@link RequestModel}
 *
 * <p>CheckRegionSupportBackupEncryptionRequest</p>
 */
public class CheckRegionSupportBackupEncryptionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceID")
    private String DBInstanceID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CheckRegionSupportBackupEncryptionRequest(Builder builder) {
        super(builder);
        this.DBInstanceID = builder.DBInstanceID;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckRegionSupportBackupEncryptionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceID
     */
    public String getDBInstanceID() {
        return this.DBInstanceID;
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

    public static final class Builder extends Request.Builder<CheckRegionSupportBackupEncryptionRequest, Builder> {
        private String DBInstanceID; 
        private String regionId; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CheckRegionSupportBackupEncryptionRequest request) {
            super(request);
            this.DBInstanceID = request.DBInstanceID;
            this.regionId = request.regionId;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * DBInstanceID.
         */
        public Builder DBInstanceID(String DBInstanceID) {
            this.putQueryParameter("DBInstanceID", DBInstanceID);
            this.DBInstanceID = DBInstanceID;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public CheckRegionSupportBackupEncryptionRequest build() {
            return new CheckRegionSupportBackupEncryptionRequest(this);
        } 

    } 

}
