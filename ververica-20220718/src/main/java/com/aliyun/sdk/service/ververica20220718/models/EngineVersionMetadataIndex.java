// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EngineVersionMetadataIndex} extends {@link TeaModel}
 *
 * <p>EngineVersionMetadataIndex</p>
 */
public class EngineVersionMetadataIndex extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("defaultEngineVersion")
    private String defaultEngineVersion;

    @com.aliyun.core.annotation.NameInMap("engineVersionMetadata")
    private java.util.List < EngineVersionMetadata > engineVersionMetadata;

    private EngineVersionMetadataIndex(Builder builder) {
        this.defaultEngineVersion = builder.defaultEngineVersion;
        this.engineVersionMetadata = builder.engineVersionMetadata;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EngineVersionMetadataIndex create() {
        return builder().build();
    }

    /**
     * @return defaultEngineVersion
     */
    public String getDefaultEngineVersion() {
        return this.defaultEngineVersion;
    }

    /**
     * @return engineVersionMetadata
     */
    public java.util.List < EngineVersionMetadata > getEngineVersionMetadata() {
        return this.engineVersionMetadata;
    }

    public static final class Builder {
        private String defaultEngineVersion; 
        private java.util.List < EngineVersionMetadata > engineVersionMetadata; 

        /**
         * defaultEngineVersion.
         */
        public Builder defaultEngineVersion(String defaultEngineVersion) {
            this.defaultEngineVersion = defaultEngineVersion;
            return this;
        }

        /**
         * engineVersionMetadata.
         */
        public Builder engineVersionMetadata(java.util.List < EngineVersionMetadata > engineVersionMetadata) {
            this.engineVersionMetadata = engineVersionMetadata;
            return this;
        }

        public EngineVersionMetadataIndex build() {
            return new EngineVersionMetadataIndex(this);
        } 

    } 

}
