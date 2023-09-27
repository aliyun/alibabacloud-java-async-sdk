// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EngineVersionMetadata} extends {@link TeaModel}
 *
 * <p>EngineVersionMetadata</p>
 */
public class EngineVersionMetadata extends TeaModel {
    @NameInMap("engineVersion")
    @Validation(required = true)
    private String engineVersion;

    @NameInMap("features")
    private EngineVersionSupportedFeatures features;

    @NameInMap("status")
    @Validation(required = true)
    private String status;

    private EngineVersionMetadata(Builder builder) {
        this.engineVersion = builder.engineVersion;
        this.features = builder.features;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EngineVersionMetadata create() {
        return builder().build();
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return features
     */
    public EngineVersionSupportedFeatures getFeatures() {
        return this.features;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String engineVersion; 
        private EngineVersionSupportedFeatures features; 
        private String status; 

        /**
         * engineVersion.
         */
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * features.
         */
        public Builder features(EngineVersionSupportedFeatures features) {
            this.features = features;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public EngineVersionMetadata build() {
            return new EngineVersionMetadata(this);
        } 

    } 

}
