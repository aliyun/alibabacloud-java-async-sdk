// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PythonArtifact} extends {@link TeaModel}
 *
 * <p>PythonArtifact</p>
 */
public class PythonArtifact extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("additionalDependencies")
    private java.util.List < String > additionalDependencies;

    @com.aliyun.core.annotation.NameInMap("additionalPythonArchives")
    private java.util.List < String > additionalPythonArchives;

    @com.aliyun.core.annotation.NameInMap("additionalPythonLibraries")
    private java.util.List < String > additionalPythonLibraries;

    @com.aliyun.core.annotation.NameInMap("entryModule")
    private String entryModule;

    @com.aliyun.core.annotation.NameInMap("mainArgs")
    private String mainArgs;

    @com.aliyun.core.annotation.NameInMap("pythonArtifactUri")
    private String pythonArtifactUri;

    private PythonArtifact(Builder builder) {
        this.additionalDependencies = builder.additionalDependencies;
        this.additionalPythonArchives = builder.additionalPythonArchives;
        this.additionalPythonLibraries = builder.additionalPythonLibraries;
        this.entryModule = builder.entryModule;
        this.mainArgs = builder.mainArgs;
        this.pythonArtifactUri = builder.pythonArtifactUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PythonArtifact create() {
        return builder().build();
    }

    /**
     * @return additionalDependencies
     */
    public java.util.List < String > getAdditionalDependencies() {
        return this.additionalDependencies;
    }

    /**
     * @return additionalPythonArchives
     */
    public java.util.List < String > getAdditionalPythonArchives() {
        return this.additionalPythonArchives;
    }

    /**
     * @return additionalPythonLibraries
     */
    public java.util.List < String > getAdditionalPythonLibraries() {
        return this.additionalPythonLibraries;
    }

    /**
     * @return entryModule
     */
    public String getEntryModule() {
        return this.entryModule;
    }

    /**
     * @return mainArgs
     */
    public String getMainArgs() {
        return this.mainArgs;
    }

    /**
     * @return pythonArtifactUri
     */
    public String getPythonArtifactUri() {
        return this.pythonArtifactUri;
    }

    public static final class Builder {
        private java.util.List < String > additionalDependencies; 
        private java.util.List < String > additionalPythonArchives; 
        private java.util.List < String > additionalPythonLibraries; 
        private String entryModule; 
        private String mainArgs; 
        private String pythonArtifactUri; 

        /**
         * additionalDependencies.
         */
        public Builder additionalDependencies(java.util.List < String > additionalDependencies) {
            this.additionalDependencies = additionalDependencies;
            return this;
        }

        /**
         * additionalPythonArchives.
         */
        public Builder additionalPythonArchives(java.util.List < String > additionalPythonArchives) {
            this.additionalPythonArchives = additionalPythonArchives;
            return this;
        }

        /**
         * additionalPythonLibraries.
         */
        public Builder additionalPythonLibraries(java.util.List < String > additionalPythonLibraries) {
            this.additionalPythonLibraries = additionalPythonLibraries;
            return this;
        }

        /**
         * entryModule.
         */
        public Builder entryModule(String entryModule) {
            this.entryModule = entryModule;
            return this;
        }

        /**
         * mainArgs.
         */
        public Builder mainArgs(String mainArgs) {
            this.mainArgs = mainArgs;
            return this;
        }

        /**
         * pythonArtifactUri.
         */
        public Builder pythonArtifactUri(String pythonArtifactUri) {
            this.pythonArtifactUri = pythonArtifactUri;
            return this;
        }

        public PythonArtifact build() {
            return new PythonArtifact(this);
        } 

    } 

}
