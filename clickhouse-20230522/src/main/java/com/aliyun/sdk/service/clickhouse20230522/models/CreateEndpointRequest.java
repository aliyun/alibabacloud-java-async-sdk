// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20230522.models;

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
 * {@link CreateEndpointRequest} extends {@link RequestModel}
 *
 * <p>CreateEndpointRequest</p>
 */
public class CreateEndpointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionPrefix")
    private String connectionPrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceNetType")
    private String DBInstanceNetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private CreateEndpointRequest(Builder builder) {
        super(builder);
        this.connectionPrefix = builder.connectionPrefix;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBInstanceNetType = builder.DBInstanceNetType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEndpointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectionPrefix
     */
    public String getConnectionPrefix() {
        return this.connectionPrefix;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return DBInstanceNetType
     */
    public String getDBInstanceNetType() {
        return this.DBInstanceNetType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateEndpointRequest, Builder> {
        private String connectionPrefix; 
        private String DBInstanceId; 
        private String DBInstanceNetType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateEndpointRequest request) {
            super(request);
            this.connectionPrefix = request.connectionPrefix;
            this.DBInstanceId = request.DBInstanceId;
            this.DBInstanceNetType = request.DBInstanceNetType;
            this.regionId = request.regionId;
        } 

        /**
         * ConnectionPrefix.
         */
        public Builder connectionPrefix(String connectionPrefix) {
            this.putQueryParameter("ConnectionPrefix", connectionPrefix);
            this.connectionPrefix = connectionPrefix;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp100p4q1g9z3****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The network type.</p>
         * 
         * <strong>example:</strong>
         * <p>Public</p>
         */
        public Builder DBInstanceNetType(String DBInstanceNetType) {
            this.putQueryParameter("DBInstanceNetType", DBInstanceNetType);
            this.DBInstanceNetType = DBInstanceNetType;
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

        @Override
        public CreateEndpointRequest build() {
            return new CreateEndpointRequest(this);
        } 

    } 

}
