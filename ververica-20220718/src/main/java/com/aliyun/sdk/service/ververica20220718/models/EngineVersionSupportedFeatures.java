// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EngineVersionSupportedFeatures} extends {@link TeaModel}
 *
 * <p>EngineVersionSupportedFeatures</p>
 */
public class EngineVersionSupportedFeatures extends TeaModel {
    @NameInMap("supportNativeSavepoint")
    private Boolean supportNativeSavepoint;

    @NameInMap("useForSqlDeployments")
    private Boolean useForSqlDeployments;

    private EngineVersionSupportedFeatures(Builder builder) {
        this.supportNativeSavepoint = builder.supportNativeSavepoint;
        this.useForSqlDeployments = builder.useForSqlDeployments;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EngineVersionSupportedFeatures create() {
        return builder().build();
    }

    /**
     * @return supportNativeSavepoint
     */
    public Boolean getSupportNativeSavepoint() {
        return this.supportNativeSavepoint;
    }

    /**
     * @return useForSqlDeployments
     */
    public Boolean getUseForSqlDeployments() {
        return this.useForSqlDeployments;
    }

    public static final class Builder {
        private Boolean supportNativeSavepoint; 
        private Boolean useForSqlDeployments; 

        /**
         * supportNativeSavepoint.
         */
        public Builder supportNativeSavepoint(Boolean supportNativeSavepoint) {
            this.supportNativeSavepoint = supportNativeSavepoint;
            return this;
        }

        /**
         * useForSqlDeployments.
         */
        public Builder useForSqlDeployments(Boolean useForSqlDeployments) {
            this.useForSqlDeployments = useForSqlDeployments;
            return this;
        }

        public EngineVersionSupportedFeatures build() {
            return new EngineVersionSupportedFeatures(this);
        } 

    } 

}
