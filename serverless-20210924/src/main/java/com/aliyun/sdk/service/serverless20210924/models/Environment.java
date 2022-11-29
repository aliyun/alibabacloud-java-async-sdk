// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Environment} extends {@link TeaModel}
 *
 * <p>Environment</p>
 */
public class Environment extends TeaModel {
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
    @Validation(required = true, maxLength = 40, minLength = 1)
    private String name;

    @NameInMap("spec")
    @Validation(required = true)
    private EnvironmentSpec spec;

    @NameInMap("status")
    private EnvironmentStatus status;

    @NameInMap("uid")
    private String uid;

    private Environment(Builder builder) {
        this.createdTime = builder.createdTime;
        this.deletionTime = builder.deletionTime;
        this.description = builder.description;
        this.generation = builder.generation;
        this.kind = builder.kind;
        this.name = builder.name;
        this.spec = builder.spec;
        this.status = builder.status;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Environment create() {
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
    public EnvironmentSpec getSpec() {
        return this.spec;
    }

    /**
     * @return status
     */
    public EnvironmentStatus getStatus() {
        return this.status;
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
        private String name; 
        private EnvironmentSpec spec; 
        private EnvironmentStatus status; 
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
         * Name must be unique within a namespace. Is required when creating resources. Cannot be updated.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Specification of the desired behavior of the Environment.
         */
        public Builder spec(EnvironmentSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Most recently observed status of the Environment. This data may not be up-to-date. Populated by the system. Read-only.
         */
        public Builder status(EnvironmentStatus status) {
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

        public Environment build() {
            return new Environment(this);
        } 

    } 

}
