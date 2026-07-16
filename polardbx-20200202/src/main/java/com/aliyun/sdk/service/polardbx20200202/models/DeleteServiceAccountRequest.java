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
 * {@link DeleteServiceAccountRequest} extends {@link RequestModel}
 *
 * <p>DeleteServiceAccountRequest</p>
 */
public class DeleteServiceAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceAccountType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceAccountType;

    private DeleteServiceAccountRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.regionId = builder.regionId;
        this.serviceAccountType = builder.serviceAccountType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteServiceAccountRequest create() {
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
     * @return serviceAccountType
     */
    public String getServiceAccountType() {
        return this.serviceAccountType;
    }

    public static final class Builder extends Request.Builder<DeleteServiceAccountRequest, Builder> {
        private String DBInstanceName; 
        private String regionId; 
        private String serviceAccountType; 

        private Builder() {
            super();
        } 

        private Builder(DeleteServiceAccountRequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.regionId = request.regionId;
            this.serviceAccountType = request.serviceAccountType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-********</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>METADATA_READONLY</p>
         */
        public Builder serviceAccountType(String serviceAccountType) {
            this.putQueryParameter("ServiceAccountType", serviceAccountType);
            this.serviceAccountType = serviceAccountType;
            return this;
        }

        @Override
        public DeleteServiceAccountRequest build() {
            return new DeleteServiceAccountRequest(this);
        } 

    } 

}
