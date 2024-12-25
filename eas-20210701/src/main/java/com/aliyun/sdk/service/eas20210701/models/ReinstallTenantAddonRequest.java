// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link ReinstallTenantAddonRequest} extends {@link RequestModel}
 *
 * <p>ReinstallTenantAddonRequest</p>
 */
public class ReinstallTenantAddonRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TenantAddonName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantAddonName;

    private ReinstallTenantAddonRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.tenantAddonName = builder.tenantAddonName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReinstallTenantAddonRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return tenantAddonName
     */
    public String getTenantAddonName() {
        return this.tenantAddonName;
    }

    public static final class Builder extends Request.Builder<ReinstallTenantAddonRequest, Builder> {
        private String clusterId; 
        private String tenantAddonName; 

        private Builder() {
            super();
        } 

        private Builder(ReinstallTenantAddonRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.tenantAddonName = request.tenantAddonName;
        } 

        /**
         * <p>The region ID of the service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The plug-in name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>prometheus_discovery</p>
         */
        public Builder tenantAddonName(String tenantAddonName) {
            this.putPathParameter("TenantAddonName", tenantAddonName);
            this.tenantAddonName = tenantAddonName;
            return this;
        }

        @Override
        public ReinstallTenantAddonRequest build() {
            return new ReinstallTenantAddonRequest(this);
        } 

    } 

}
