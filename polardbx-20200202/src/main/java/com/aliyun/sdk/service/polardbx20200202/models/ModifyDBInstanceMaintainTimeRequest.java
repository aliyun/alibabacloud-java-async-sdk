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
 * {@link ModifyDBInstanceMaintainTimeRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceMaintainTimeRequest</p>
 */
public class ModifyDBInstanceMaintainTimeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaintainTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String maintainTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ModifyDBInstanceMaintainTimeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.DBInstanceName = builder.DBInstanceName;
        this.maintainTime = builder.maintainTime;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceMaintainTimeRequest create() {
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
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return maintainTime
     */
    public String getMaintainTime() {
        return this.maintainTime;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyDBInstanceMaintainTimeRequest, Builder> {
        private String clientToken; 
        private String DBInstanceName; 
        private String maintainTime; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceMaintainTimeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.DBInstanceName = request.DBInstanceName;
            this.maintainTime = request.maintainTime;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The unique token.</p>
         * 
         * <strong>example:</strong>
         * <p>73559800-3c8c-11ec-bd40-99cfcff3fe1e</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The name of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-htri0ori2r4k9p</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>The maintenance window in UTC. Valid values: 00:00Z-23:59Z.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>21:00Z-00:00Z</p>
         */
        public Builder maintainTime(String maintainTime) {
            this.putQueryParameter("MaintainTime", maintainTime);
            this.maintainTime = maintainTime;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
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
        public ModifyDBInstanceMaintainTimeRequest build() {
            return new ModifyDBInstanceMaintainTimeRequest(this);
        } 

    } 

}
