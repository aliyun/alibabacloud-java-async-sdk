// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Template} extends {@link TeaModel}
 *
 * <p>Template</p>
 */
public class Template extends TeaModel {
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

    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @NameInMap("spec")
    @Validation(required = true)
    private TemplateSpec spec;

    @NameInMap("status")
    private TemplateStatus status;

    @NameInMap("uid")
    private String uid;

    @NameInMap("version")
    private Integer version;

    private Template(Builder builder) {
        this.createdTime = builder.createdTime;
        this.deletionTime = builder.deletionTime;
        this.description = builder.description;
        this.generation = builder.generation;
        this.kind = builder.kind;
        this.name = builder.name;
        this.spec = builder.spec;
        this.status = builder.status;
        this.uid = builder.uid;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Template create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return spec
     */
    public TemplateSpec getSpec() {
        return this.spec;
    }

    /**
     * @return status
     */
    public TemplateStatus getStatus() {
        return this.status;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return version
     */
    public Integer getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String createdTime; 
        private String deletionTime; 
        private String description; 
        private Integer generation; 
        private String kind; 
        private String name; 
        private TemplateSpec spec; 
        private TemplateStatus status; 
        private String uid; 
        private Integer version; 

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
         * Name must be unique within a namespace. Is required when creating resources. Cannot be updated.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Specification of the desired behavior of the Template.
         */
        public Builder spec(TemplateSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Most recently observed status of the Template. This data may not be up-to-date. Populated by the system. Read-only.
         */
        public Builder status(TemplateStatus status) {
            this.status = status;
            return this;
        }

        /**
         * Main user ID of an Aliyun account
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        /**
         * The major version of the template. "1" by default. You should ONLY increment the major version when the template are not backwards compatible with the previous major version.
         */
        public Builder version(Integer version) {
            this.version = version;
            return this;
        }

        public Template build() {
            return new Template(this);
        } 

    } 

}
