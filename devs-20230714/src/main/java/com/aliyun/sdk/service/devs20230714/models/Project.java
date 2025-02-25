// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Project} extends {@link TeaModel}
 *
 * <p>Project</p>
 */
public class Project extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("generation")
    private Integer generation;

    @com.aliyun.core.annotation.NameInMap("kind")
    private String kind;

    @com.aliyun.core.annotation.NameInMap("labels")
    private java.util.Map < String, String > labels;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 40, minLength = 1)
    private String name;

    @com.aliyun.core.annotation.NameInMap("resourceVersion")
    private Integer resourceVersion;

    @com.aliyun.core.annotation.NameInMap("spec")
    private ProjectSpec spec;

    @com.aliyun.core.annotation.NameInMap("status")
    private ProjectStatus status;

    @com.aliyun.core.annotation.NameInMap("uid")
    private String uid;

    @com.aliyun.core.annotation.NameInMap("updatedTime")
    private String updatedTime;

    private Project(Builder builder) {
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

    public static Project create() {
        return builder().build();
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
    public java.util.Map < String, String > getLabels() {
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
    public ProjectSpec getSpec() {
        return this.spec;
    }

    /**
     * @return status
     */
    public ProjectStatus getStatus() {
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
        private java.util.Map < String, String > labels; 
        private String name; 
        private Integer resourceVersion; 
        private ProjectSpec spec; 
        private ProjectStatus status; 
        private String uid; 
        private String updatedTime; 

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
        public Builder labels(java.util.Map < String, String > labels) {
            this.labels = labels;
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
         * resourceVersion.
         */
        public Builder resourceVersion(Integer resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * spec.
         */
        public Builder spec(ProjectSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
         * status.
         */
        public Builder status(ProjectStatus status) {
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

        public Project build() {
            return new Project(this);
        } 

    } 

}
