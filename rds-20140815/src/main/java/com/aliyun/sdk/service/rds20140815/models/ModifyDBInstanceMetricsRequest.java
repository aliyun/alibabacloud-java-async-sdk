// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The instance ID. You can call the DescribeDBInstances operation to query the instance ID.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * The keys of the Enhanced Monitoring metrics that you want to display for the instance. You can enter a maximum of 30 metric keys. If you enter multiple metric keys, you must separate the metric keys with commas (,).
         * <p>
         * 
         * You can call the DescribeAvailableMetrics operation to query the keys of metrics.
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
         * The application scope of this modification. Valid values:
         * <p>
         * 
         * *   **instance**: This modification is applied only to the current instance.
         * *   **region**: This modification is applied to all ApsaraDB RDS for PostgreSQL instances that are equipped with the same type of storage media as the current instance in the region to which the current instance belongs. For example, if the current instance is equipped with cloud disks, this modification is applied to all ApsaraDB RDS for PostgreSQL instances that are equipped with cloud disks in the region to which the current instance belongs.
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
