// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TaskTemplate} extends {@link TeaModel}
 *
 * <p>TaskTemplate</p>
 */
public class TaskTemplate extends TeaModel {
    @NameInMap("createdTime")
    private String createdTime;

    @NameInMap("deletionTime")
    private String deletionTime;

    @NameInMap("description")
    private String description;

    @NameInMap("generation")
    private Integer generation;

    @NameInMap("kind")
    private String kind;

    @NameInMap("labels")
    private java.util.Map < String, String > labels;

    @NameInMap("name")
    @Validation(required = true, maxLength = 40, minLength = 1)
    private String name;

    @NameInMap("resourceVersion")
    private Integer resourceVersion;

    @NameInMap("spec")
    private TaskTemplateSpec spec;

    @NameInMap("uid")
    private String uid;

    private TaskTemplate(Builder builder) {
        this.createdTime = builder.createdTime;
        this.deletionTime = builder.deletionTime;
        this.description = builder.description;
        this.generation = builder.generation;
        this.kind = builder.kind;
        this.labels = builder.labels;
        this.name = builder.name;
        this.resourceVersion = builder.resourceVersion;
        this.spec = builder.spec;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TaskTemplate create() {
        return builder().build();
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return deletionTime
     */
    public String getDeletionTime() {
        return this.deletionTime;
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
    public TaskTemplateSpec getSpec() {
        return this.spec;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder {
        private String createdTime; 
        private String deletionTime; 
        private String description; 
        private Integer generation; 
        private String kind; 
        private java.util.Map < String, String > labels; 
        private String name; 
        private Integer resourceVersion; 
        private TaskTemplateSpec spec; 
        private String uid; 

        /**
         * A time representing the server time when this object was created. Clients may not set this value. Populated by the system. Read-only.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * Date and time at which a deletion is requested by the user. Null when the resource has not been requested for deletion. This field is set by the server, not directly settable by a client. Populated by the system. Read-only.
         */
        public Builder deletionTime(String deletionTime) {
            this.deletionTime = deletionTime;
            return this;
        }

        /**
         * Human-readable description of the resource
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * A sequence number representing a specific generation of the desired state. Populated by the system. Read-only.
         */
        public Builder generation(Integer generation) {
            this.generation = generation;
            return this;
        }

        /**
         * The kind of the resource
         */
        public Builder kind(String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Labels on the object for label-selections.
         */
        public Builder labels(java.util.Map < String, String > labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Name must be unique within a namespace. Is required when creating resources. Cannot be updated.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * A sequence number representing a specific generation of the desired state. Populated by the system. Read-only.
         */
        public Builder resourceVersion(Integer resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * spec.
         */
        public Builder spec(TaskTemplateSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Main user ID of an Aliyun account
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        public TaskTemplate build() {
            return new TaskTemplate(this);
        } 

    } 

}
