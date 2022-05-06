// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceMetricsRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceMetricsRequest</p>
 */
public class ModifyDBInstanceMetricsRequest extends Request {
    @Query
    @NameInMap("DBInstanceName")
    @Validation(required = true)
    private String DBInstanceName;

    @Query
    @NameInMap("MetricsConfig")
    @Validation(required = true)
    private String metricsConfig;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Scope")
    @Validation(required = true)
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
         * DBInstanceName.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * MetricsConfig.
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
         * Scope.
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
