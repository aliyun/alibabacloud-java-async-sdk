// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link ModifyDBInstanceDeploymentModeRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceDeploymentModeRequest</p>
 */
public class ModifyDBInstanceDeploymentModeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeployMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deployMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StandbyVSwitchId")
    private String standbyVSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StandbyZoneId")
    private String standbyZoneId;

    private ModifyDBInstanceDeploymentModeRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.deployMode = builder.deployMode;
        this.standbyVSwitchId = builder.standbyVSwitchId;
        this.standbyZoneId = builder.standbyZoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceDeploymentModeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return deployMode
     */
    public String getDeployMode() {
        return this.deployMode;
    }

    /**
     * @return standbyVSwitchId
     */
    public String getStandbyVSwitchId() {
        return this.standbyVSwitchId;
    }

    /**
     * @return standbyZoneId
     */
    public String getStandbyZoneId() {
        return this.standbyZoneId;
    }

    public static final class Builder extends Request.Builder<ModifyDBInstanceDeploymentModeRequest, Builder> {
        private String DBInstanceId; 
        private String deployMode; 
        private String standbyVSwitchId; 
        private String standbyZoneId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceDeploymentModeRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.deployMode = request.deployMode;
            this.standbyVSwitchId = request.standbyVSwitchId;
            this.standbyZoneId = request.standbyZoneId;
        } 

        /**
         * <p>The instance ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the IDs of all AnalyticDB for PostgreSQL instances in a region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The deployment mode. Valid values:</p>
         * <ul>
         * <li>multiple: multi-zone deployment.</li>
         * <li>single: single-zone deployment.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>multiple</p>
         */
        public Builder deployMode(String deployMode) {
            this.putQueryParameter("DeployMode", deployMode);
            this.deployMode = deployMode;
            return this;
        }

        /**
         * <p>The vSwitch ID in the secondary zone.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is required only for multi-zone deployment.</li>
         * <li>The zone of the vSwitch specified by this parameter must be the same as the zone specified by StandbyZoneId.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1cpq8mr64paltkb****</p>
         */
        public Builder standbyVSwitchId(String standbyVSwitchId) {
            this.putQueryParameter("StandbyVSwitchId", standbyVSwitchId);
            this.standbyVSwitchId = standbyVSwitchId;
            return this;
        }

        /**
         * <p>The secondary zone ID.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is required only for multi-zone deployment.</li>
         * <li>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query available zone IDs.</li>
         * <li>The secondary zone ID must be different from the primary zone ID.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        public Builder standbyZoneId(String standbyZoneId) {
            this.putQueryParameter("StandbyZoneId", standbyZoneId);
            this.standbyZoneId = standbyZoneId;
            return this;
        }

        @Override
        public ModifyDBInstanceDeploymentModeRequest build() {
            return new ModifyDBInstanceDeploymentModeRequest(this);
        } 

    } 

}
