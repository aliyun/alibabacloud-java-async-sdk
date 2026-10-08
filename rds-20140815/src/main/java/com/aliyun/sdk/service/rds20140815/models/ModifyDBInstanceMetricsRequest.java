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
 * {@link ModifyDBInstanceMetricsRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceMetricsRequest</p>
 */
public class ModifyDBInstanceMetricsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricsConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricsConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scope")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scope;

    private ModifyDBInstanceMetricsRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.metricsConfig = builder.metricsConfig;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scope = builder.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceMetricsRequest create() {
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
     * @return metricsConfig
     */
    public String getMetricsConfig() {
        return this.metricsConfig;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    public static final class Builder extends Request.Builder<ModifyDBInstanceMetricsRequest, Builder> {
        private String DBInstanceName; 
        private String metricsConfig; 
        private Long resourceOwnerId; 
        private String scope; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceMetricsRequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.metricsConfig = request.metricsConfig;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scope = request.scope;
        } 

        /**
         * <p>The instance ID. You can call DescribeDBInstances to obtain the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pgm-bp1s1j103lo6****</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>The monitoring metrics to configure for the instance. You can specify multiple metric keys separated by commas (,). A maximum of 30 metric keys can be specified.</p>
         * <p>You can call the DescribeAvailableMetrics operation to obtain the enhanced monitoring metric keys.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>os.cpu_usage.sys.avg,os.cpu_usage.user.avg</p>
         */
        public Builder metricsConfig(String metricsConfig) {
            this.putQueryParameter("MetricsConfig", metricsConfig);
            this.metricsConfig = metricsConfig;
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

        /**
         * <p>The scope of the modification. Valid values:</p>
         * <ul>
         * <li><strong>instance</strong>: instance level. The modification is applied only to cloud disk instance.</li>
         * <li><strong>region</strong>: region level. The modification is applied to all ApsaraDB RDS for PostgreSQL instances that use the same storage type as cloud disk instance in the current region. For example, if cloud disk instance uses cloud disks, the modification is applied to all ApsaraDB RDS for PostgreSQL instances with cloud disks in the current region.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        @Override
        public ModifyDBInstanceMetricsRequest build() {
            return new ModifyDBInstanceMetricsRequest(this);
        } 

    } 

}
