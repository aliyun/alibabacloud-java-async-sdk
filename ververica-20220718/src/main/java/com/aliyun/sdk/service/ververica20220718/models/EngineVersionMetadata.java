// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EngineVersionMetadata} extends {@link TeaModel}
 *
 * <p>EngineVersionMetadata</p>
 */
public class EngineVersionMetadata extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("engineVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engineVersion;

    @com.aliyun.core.annotation.NameInMap("features")
    private EngineVersionSupportedFeatures features;

    @com.aliyun.core.annotation.NameInMap("status")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vvr-6.0.0-flink-1.15</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STABLE</p>
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
