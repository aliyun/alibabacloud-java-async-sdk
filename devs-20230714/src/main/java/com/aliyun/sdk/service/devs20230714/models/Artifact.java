// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link Artifact} extends {@link TeaModel}
 *
 * <p>Artifact</p>
 */
public class Artifact extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("generation")
    private Integer generation;

    @com.aliyun.core.annotation.NameInMap("kind")
    private String kind;

    @com.aliyun.core.annotation.NameInMap("labels")
    private java.util.Map<String, String> labels;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
    private String name;

    @com.aliyun.core.annotation.NameInMap("resourceVersion")
    private Integer resourceVersion;

    @com.aliyun.core.annotation.NameInMap("spec")
    private ArtifactSpec spec;

    @com.aliyun.core.annotation.NameInMap("status")
    private ArtifactStatus status;

    @com.aliyun.core.annotation.NameInMap("uid")
    private String uid;

    @com.aliyun.core.annotation.NameInMap("updatedTime")
    private String updatedTime;

    private Artifact(Builder builder) {
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.generation = builder.generation;
        this.kind = builder.kind;
        this.labels = builder.labels;
        this.name = builder.name;
        this.resourceVersion = builder.resourceVersion;
        this.spec = builder.spec;
        this.status = builder.status;
        this.uid = builder.uid;
        this.updatedTime = builder.updatedTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Artifact create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return generation
     */
    public Integer getGeneration() {
        return this.generation;
    }

    /**
     * @return kind
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * @return labels
     */
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return resourceVersion
     */
    public Integer getResourceVersion() {
        return this.resourceVersion;
    }

    /**
     * @return spec
     */
    public ArtifactSpec getSpec() {
        return this.spec;
    }

    /**
     * @return status
     */
    public ArtifactStatus getStatus() {
        return this.status;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return updatedTime
     */
    public String getUpdatedTime() {
        return this.updatedTime;
    }

    public static final class Builder {
        private String createdTime; 
        private String description; 
        private Integer generation; 
        private String kind; 
        private java.util.Map<String, String> labels; 
        private String name; 
        private Integer resourceVersion; 
        private ArtifactSpec spec; 
        private ArtifactStatus status; 
        private String uid; 
        private String updatedTime; 

        private Builder() {
        } 

        private Builder(Artifact model) {
            this.createdTime = model.createdTime;
            this.description = model.description;
            this.generation = model.generation;
            this.kind = model.kind;
            this.labels = model.labels;
            this.name = model.name;
            this.resourceVersion = model.resourceVersion;
            this.spec = model.spec;
            this.status = model.status;
            this.uid = model.uid;
            this.updatedTime = model.updatedTime;
        } 

        /**
         * createdTime.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * generation.
         */
        public Builder generation(Integer generation) {
            this.generation = generation;
            return this;
        }

        /**
         * kind.
         */
        public Builder kind(String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * labels.
         */
        public Builder labels(java.util.Map<String, String> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-artifact</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * resourceVersion.
         */
        public Builder resourceVersion(Integer resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * spec.
         */
        public Builder spec(ArtifactSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
         * status.
         */
        public Builder status(ArtifactStatus status) {
            this.status = status;
            return this;
        }

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        /**
         * updatedTime.
         */
        public Builder updatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }

        public Artifact build() {
            return new Artifact(this);
        } 

    } 

}
