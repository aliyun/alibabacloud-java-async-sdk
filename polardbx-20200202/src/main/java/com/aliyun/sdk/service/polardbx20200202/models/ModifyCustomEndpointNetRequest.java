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
 * {@link ModifyCustomEndpointNetRequest} extends {@link RequestModel}
 *
 * <p>ModifyCustomEndpointNetRequest</p>
 */
public class ModifyCustomEndpointNetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnPrefix")
    private String connPrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomEndpointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customEndpointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private Integer port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private ModifyCustomEndpointNetRequest(Builder builder) {
        super(builder);
        this.connPrefix = builder.connPrefix;
        this.customEndpointId = builder.customEndpointId;
        this.DBInstanceName = builder.DBInstanceName;
        this.port = builder.port;
        this.regionId = builder.regionId;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCustomEndpointNetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connPrefix
     */
    public String getConnPrefix() {
        return this.connPrefix;
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
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<ModifyCustomEndpointNetRequest, Builder> {
        private String connPrefix; 
        private String customEndpointId; 
        private String DBInstanceName; 
        private Integer port; 
        private String regionId; 
        private String vSwitchId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCustomEndpointNetRequest request) {
            super(request);
            this.connPrefix = request.connPrefix;
            this.customEndpointId = request.customEndpointId;
            this.DBInstanceName = request.DBInstanceName;
            this.port = request.port;
            this.regionId = request.regionId;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
        } 

        /**
         * ConnPrefix.
         */
        public Builder connPrefix(String connPrefix) {
            this.putQueryParameter("ConnPrefix", connPrefix);
            this.connPrefix = connPrefix;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cep-002</p>
         */
        public Builder customEndpointId(String customEndpointId) {
            this.putQueryParameter("CustomEndpointId", customEndpointId);
            this.customEndpointId = customEndpointId;
            return this;
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
         * Port.
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
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
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public ModifyCustomEndpointNetRequest build() {
            return new ModifyCustomEndpointNetRequest(this);
        } 

    } 

}
