// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DeleteResourceControlRequest} extends {@link RequestModel}
 *
 * <p>DeleteResourceControlRequest</p>
 */
public class DeleteResourceControlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceControlName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceControlName;

    private DeleteResourceControlRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.regionId = builder.regionId;
        this.resourceControlName = builder.resourceControlName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteResourceControlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceControlName
     */
    public String getResourceControlName() {
        return this.resourceControlName;
    }

    public static final class Builder extends Request.Builder<DeleteResourceControlRequest, Builder> {
        private String DBClusterId; 
        private String regionId; 
        private String resourceControlName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteResourceControlRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.regionId = request.regionId;
            this.resourceControlName = request.resourceControlName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-****************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
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

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-rc</p>
         */
        public Builder resourceControlName(String resourceControlName) {
            this.putQueryParameter("ResourceControlName", resourceControlName);
            this.resourceControlName = resourceControlName;
            return this;
        }

        @Override
        public DeleteResourceControlRequest build() {
            return new DeleteResourceControlRequest(this);
        } 

    } 

}
