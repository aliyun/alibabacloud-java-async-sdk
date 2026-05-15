// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link CdcYamlArtifact} extends {@link TeaModel}
 *
 * <p>CdcYamlArtifact</p>
 */
public class CdcYamlArtifact extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("additionalDependencies")
    private java.util.List<String> additionalDependencies;

    @com.aliyun.core.annotation.NameInMap("cdcYaml")
    private String cdcYaml;

    private CdcYamlArtifact(Builder builder) {
        this.additionalDependencies = builder.additionalDependencies;
        this.cdcYaml = builder.cdcYaml;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CdcYamlArtifact create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return additionalDependencies
     */
    public java.util.List<String> getAdditionalDependencies() {
        return this.additionalDependencies;
    }

    /**
     * @return cdcYaml
     */
    public String getCdcYaml() {
        return this.cdcYaml;
    }

    public static final class Builder {
        private java.util.List<String> additionalDependencies; 
        private String cdcYaml; 

        private Builder() {
        } 

        private Builder(CdcYamlArtifact model) {
            this.additionalDependencies = model.additionalDependencies;
            this.cdcYaml = model.cdcYaml;
        } 

        /**
         * additionalDependencies.
         */
        public Builder additionalDependencies(java.util.List<String> additionalDependencies) {
            this.additionalDependencies = additionalDependencies;
            return this;
        }

        /**
         * cdcYaml.
         */
        public Builder cdcYaml(String cdcYaml) {
            this.cdcYaml = cdcYaml;
            return this;
        }

        public CdcYamlArtifact build() {
            return new CdcYamlArtifact(this);
        } 

    } 

}
