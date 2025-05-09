// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link SimplyAddInstanceRequest} extends {@link RequestModel}
 *
 * <p>SimplyAddInstanceRequest</p>
 */
public class SimplyAddInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabasePassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String databasePassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseUser")
    @com.aliyun.core.annotation.Validation(required = true)
    private String databaseUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Host")
    private String host;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceRegion")
    private String instanceRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private Integer port;

    private SimplyAddInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.databasePassword = builder.databasePassword;
        this.databaseUser = builder.databaseUser;
        this.host = builder.host;
        this.instanceId = builder.instanceId;
        this.instanceRegion = builder.instanceRegion;
        this.port = builder.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SimplyAddInstanceRequest create() {
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
     * @return databasePassword
     */
    public String getDatabasePassword() {
        return this.databasePassword;
    }

    /**
     * @return databaseUser
     */
    public String getDatabaseUser() {
        return this.databaseUser;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceRegion
     */
    public String getInstanceRegion() {
        return this.instanceRegion;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    public static final class Builder extends Request.Builder<SimplyAddInstanceRequest, Builder> {
        private String regionId; 
        private String databasePassword; 
        private String databaseUser; 
        private String host; 
        private String instanceId; 
        private String instanceRegion; 
        private Integer port; 

        private Builder() {
            super();
        } 

        private Builder(SimplyAddInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.databasePassword = request.databasePassword;
            this.databaseUser = request.databaseUser;
            this.host = request.host;
            this.instanceId = request.instanceId;
            this.instanceRegion = request.instanceRegion;
            this.port = request.port;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test***</p>
         */
        public Builder databasePassword(String databasePassword) {
            this.putQueryParameter("DatabasePassword", databasePassword);
            this.databasePassword = databasePassword;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder databaseUser(String databaseUser) {
            this.putQueryParameter("DatabaseUser", databaseUser);
            this.databaseUser = databaseUser;
            return this;
        }

        /**
         * Host.
         */
        public Builder host(String host) {
            this.putQueryParameter("Host", host);
            this.host = host;
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
         * InstanceRegion.
         */
        public Builder instanceRegion(String instanceRegion) {
            this.putQueryParameter("InstanceRegion", instanceRegion);
            this.instanceRegion = instanceRegion;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        @Override
        public SimplyAddInstanceRequest build() {
            return new SimplyAddInstanceRequest(this);
        } 

    } 

}
