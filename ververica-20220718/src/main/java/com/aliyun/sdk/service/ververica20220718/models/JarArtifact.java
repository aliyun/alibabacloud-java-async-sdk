// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JarArtifact} extends {@link TeaModel}
 *
 * <p>JarArtifact</p>
 */
public class JarArtifact extends TeaModel {
    @NameInMap("additionalDependencies")
    private java.util.List < String > additionalDependencies;

    @NameInMap("entryClass")
    private String entryClass;

    @NameInMap("jarUri")
    private String jarUri;

    @NameInMap("mainArgs")
    private String mainArgs;

    private JarArtifact(Builder builder) {
        this.additionalDependencies = builder.additionalDependencies;
        this.entryClass = builder.entryClass;
        this.jarUri = builder.jarUri;
        this.mainArgs = builder.mainArgs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JarArtifact create() {
        return builder().build();
    }

    /**
     * @return additionalDependencies
     */
    public java.util.List < String > getAdditionalDependencies() {
        return this.additionalDependencies;
    }

    /**
     * @return entryClass
     */
    public String getEntryClass() {
        return this.entryClass;
    }

    /**
     * @return jarUri
     */
    public String getJarUri() {
        return this.jarUri;
    }

    /**
     * @return mainArgs
     */
    public String getMainArgs() {
        return this.mainArgs;
    }

    public static final class Builder {
        private java.util.List < String > additionalDependencies; 
        private String entryClass; 
        private String jarUri; 
        private String mainArgs; 

        /**
         * additionalDependencies.
         */
        public Builder additionalDependencies(java.util.List < String > additionalDependencies) {
            this.additionalDependencies = additionalDependencies;
            return this;
        }

        /**
         * entryClass.
         */
        public Builder entryClass(String entryClass) {
            this.entryClass = entryClass;
            return this;
        }

        /**
         * jarUri.
         */
        public Builder jarUri(String jarUri) {
            this.jarUri = jarUri;
            return this;
        }

        /**
         * mainArgs.
         */
        public Builder mainArgs(String mainArgs) {
            this.mainArgs = mainArgs;
            return this;
        }

        public JarArtifact build() {
            return new JarArtifact(this);
        } 

    } 

}
