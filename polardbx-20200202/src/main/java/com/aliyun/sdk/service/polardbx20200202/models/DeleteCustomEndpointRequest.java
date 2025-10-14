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
 * {@link DeleteCustomEndpointRequest} extends {@link RequestModel}
 *
 * <p>DeleteCustomEndpointRequest</p>
 */
public class DeleteCustomEndpointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomEndpointId")
    private String customEndpointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteCustomEndpointRequest(Builder builder) {
        super(builder);
        this.customEndpointId = builder.customEndpointId;
        this.DBInstanceName = builder.DBInstanceName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCustomEndpointRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customEndpointId
     */
    public String getCustomEndpointId() {
        return this.customEndpointId;
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

    public static final class Builder extends Request.Builder<DeleteCustomEndpointRequest, Builder> {
        private String customEndpointId; 
        private String DBInstanceName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCustomEndpointRequest request) {
            super(request);
            this.customEndpointId = request.customEndpointId;
            this.DBInstanceName = request.DBInstanceName;
            this.regionId = request.regionId;
        } 

        /**
         * CustomEndpointId.
         */
        public Builder customEndpointId(String customEndpointId) {
            this.putQueryParameter("CustomEndpointId", customEndpointId);
            this.customEndpointId = customEndpointId;
            return this;
        }

        /**
         * DBInstanceName.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
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
        public DeleteCustomEndpointRequest build() {
            return new DeleteCustomEndpointRequest(this);
        } 

    } 

}
