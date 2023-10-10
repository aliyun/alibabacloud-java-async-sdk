// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchAdvancedMonitoringRequest} extends {@link RequestModel}
 *
 * <p>SwitchAdvancedMonitoringRequest</p>
 */
public class SwitchAdvancedMonitoringRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("EnableAdvancedMonitoring")
    private Boolean enableAdvancedMonitoring;

    private SwitchAdvancedMonitoringRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.enableAdvancedMonitoring = builder.enableAdvancedMonitoring;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchAdvancedMonitoringRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return enableAdvancedMonitoring
     */
    public Boolean getEnableAdvancedMonitoring() {
        return this.enableAdvancedMonitoring;
    }

    public static final class Builder extends Request.Builder<SwitchAdvancedMonitoringRequest, Builder> {
        private String appId; 
        private Boolean enableAdvancedMonitoring; 

        private Builder() {
            super();
        } 

        private Builder(SwitchAdvancedMonitoringRequest request) {
            super(request);
            this.appId = request.appId;
            this.enableAdvancedMonitoring = request.enableAdvancedMonitoring;
        } 

        /**
         * The ID of the application for which you want to query or configure the advanced application monitoring feature.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Specifies whether to enable the advanced application monitoring feature. Valid values:
         * <p>
         * 
         * *   true: enables the advanced application monitoring feature.
         * *   false: disables the advanced application monitoring feature.
         * 
         * If you call this operation to query the status of the advanced application monitoring feature, you do not need to specify this parameter.
         */
        public Builder enableAdvancedMonitoring(Boolean enableAdvancedMonitoring) {
            this.putQueryParameter("EnableAdvancedMonitoring", enableAdvancedMonitoring);
            this.enableAdvancedMonitoring = enableAdvancedMonitoring;
            return this;
        }

        @Override
        public SwitchAdvancedMonitoringRequest build() {
            return new SwitchAdvancedMonitoringRequest(this);
        } 

    } 

}
