// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link PatchPolarClawConfigRequest} extends {@link RequestModel}
 *
 * <p>PatchPolarClawConfigRequest</p>
 */
public class PatchPolarClawConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigPatch")
    private java.util.Map<String, ?> configPatch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Restart")
    private Boolean restart;

    private PatchPolarClawConfigRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.configPatch = builder.configPatch;
        this.restart = builder.restart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PatchPolarClawConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return configPatch
     */
    public java.util.Map<String, ?> getConfigPatch() {
        return this.configPatch;
    }

    /**
     * @return restart
     */
    public Boolean getRestart() {
        return this.restart;
    }

    public static final class Builder extends Request.Builder<PatchPolarClawConfigRequest, Builder> {
        private String applicationId; 
        private java.util.Map<String, ?> configPatch; 
        private Boolean restart; 

        private Builder() {
            super();
        } 

        private Builder(PatchPolarClawConfigRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.configPatch = request.configPatch;
            this.restart = request.restart;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * ConfigPatch.
         */
        public Builder configPatch(java.util.Map<String, ?> configPatch) {
            String configPatchShrink = shrink(configPatch, "ConfigPatch", "json");
            this.putQueryParameter("ConfigPatch", configPatchShrink);
            this.configPatch = configPatch;
            return this;
        }

        /**
         * Restart.
         */
        public Builder restart(Boolean restart) {
            this.putQueryParameter("Restart", restart);
            this.restart = restart;
            return this;
        }

        @Override
        public PatchPolarClawConfigRequest build() {
            return new PatchPolarClawConfigRequest(this);
        } 

    } 

}
