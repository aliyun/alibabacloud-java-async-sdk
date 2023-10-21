// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutMonitoringConfigRequest} extends {@link RequestModel}
 *
 * <p>PutMonitoringConfigRequest</p>
 */
public class PutMonitoringConfigRequest extends Request {
    @Query
    @NameInMap("AutoInstall")
    private Boolean autoInstall;

    @Query
    @NameInMap("EnableInstallAgentNewECS")
    private Boolean enableInstallAgentNewECS;

    private PutMonitoringConfigRequest(Builder builder) {
        super(builder);
        this.autoInstall = builder.autoInstall;
        this.enableInstallAgentNewECS = builder.enableInstallAgentNewECS;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutMonitoringConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoInstall
     */
    public Boolean getAutoInstall() {
        return this.autoInstall;
    }

    /**
     * @return enableInstallAgentNewECS
     */
    public Boolean getEnableInstallAgentNewECS() {
        return this.enableInstallAgentNewECS;
    }

    public static final class Builder extends Request.Builder<PutMonitoringConfigRequest, Builder> {
        private Boolean autoInstall; 
        private Boolean enableInstallAgentNewECS; 

        private Builder() {
            super();
        } 

        private Builder(PutMonitoringConfigRequest request) {
            super(request);
            this.autoInstall = request.autoInstall;
            this.enableInstallAgentNewECS = request.enableInstallAgentNewECS;
        } 

        /**
         * Specifies whether to automatically install the CloudMonitor agent on existing Elastic Compute Service (ECS) instances. Valid values:
         * <p>
         * 
         * *   true (default value)
         * *   false
         */
        public Builder autoInstall(Boolean autoInstall) {
            this.putQueryParameter("AutoInstall", autoInstall);
            this.autoInstall = autoInstall;
            return this;
        }

        /**
         * Specifies whether to automatically install the CloudMonitor agent on new ECS instances. Valid values:
         * <p>
         * 
         * *   true (default value)
         * *   false
         */
        public Builder enableInstallAgentNewECS(Boolean enableInstallAgentNewECS) {
            this.putQueryParameter("EnableInstallAgentNewECS", enableInstallAgentNewECS);
            this.enableInstallAgentNewECS = enableInstallAgentNewECS;
            return this;
        }

        @Override
        public PutMonitoringConfigRequest build() {
            return new PutMonitoringConfigRequest(this);
        } 

    } 

}
