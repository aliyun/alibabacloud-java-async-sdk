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
 * {@link UdfArtifact} extends {@link TeaModel}
 *
 * <p>UdfArtifact</p>
 */
public class UdfArtifact extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("artifactType")
    private String artifactType;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("dependencyJarUris")
    private java.util.List<String> dependencyJarUris;

    @com.aliyun.core.annotation.NameInMap("jarUrl")
    private String jarUrl;

    @com.aliyun.core.annotation.NameInMap("modifiedAt")
    private Long modifiedAt;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("udfClasses")
    private java.util.List<UdfClass> udfClasses;

    private UdfArtifact(Builder builder) {
        this.artifactType = builder.artifactType;
        this.createdAt = builder.createdAt;
        this.creator = builder.creator;
        this.dependencyJarUris = builder.dependencyJarUris;
        this.jarUrl = builder.jarUrl;
        this.modifiedAt = builder.modifiedAt;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.udfClasses = builder.udfClasses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UdfArtifact create() {
        return builder().build();
    }

    /**
     * @return artifactType
     */
    public String getArtifactType() {
        return this.artifactType;
    }

    /**
     * @return createdAt
     */
    public Long getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return dependencyJarUris
     */
    public java.util.List<String> getDependencyJarUris() {
        return this.dependencyJarUris;
    }

    /**
     * @return jarUrl
     */
    public String getJarUrl() {
        return this.jarUrl;
    }

    /**
     * @return modifiedAt
     */
    public Long getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return udfClasses
     */
    public java.util.List<UdfClass> getUdfClasses() {
        return this.udfClasses;
    }

    public static final class Builder {
        private String artifactType; 
        private Long createdAt; 
        private String creator; 
        private java.util.List<String> dependencyJarUris; 
        private String jarUrl; 
        private Long modifiedAt; 
        private String name; 
        private String namespace; 
        private java.util.List<UdfClass> udfClasses; 

        /**
         * artifactType.
         */
        public Builder artifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }

        /**
         * createdAt.
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * creator.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * dependencyJarUris.
         */
        public Builder dependencyJarUris(java.util.List<String> dependencyJarUris) {
            this.dependencyJarUris = dependencyJarUris;
            return this;
        }

        /**
         * jarUrl.
         */
        public Builder jarUrl(String jarUrl) {
            this.jarUrl = jarUrl;
            return this;
        }

        /**
         * modifiedAt.
         */
        public Builder modifiedAt(Long modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * namespace.
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * udfClasses.
         */
        public Builder udfClasses(java.util.List<UdfClass> udfClasses) {
            this.udfClasses = udfClasses;
            return this;
        }

        public UdfArtifact build() {
            return new UdfArtifact(this);
        } 

    } 

}
