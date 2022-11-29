// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnvironmentRevision} extends {@link TeaModel}
 *
 * <p>EnvironmentRevision</p>
 */
public class EnvironmentRevision extends TeaModel {
    @NameInMap("createdTime")
    private String createdTime;

    @NameInMap("environmentGeneration")
    private Integer environmentGeneration;

    @NameInMap("environmentName")
    private String environmentName;

    @NameInMap("kind")
    private String kind;

    @NameInMap("spec")
    private EnvironmentSpec spec;

    @NameInMap("status")
    private EnvironmentStatus status;

    @NameInMap("uid")
    private String uid;

    private EnvironmentRevision(Builder builder) {
        this.createdTime = builder.createdTime;
        this.environmentGeneration = builder.environmentGeneration;
        this.environmentName = builder.environmentName;
        this.kind = builder.kind;
        this.spec = builder.spec;
        this.status = builder.status;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnvironmentRevision create() {
        return builder().build();
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return environmentGeneration
     */
    public Integer getEnvironmentGeneration() {
        return this.environmentGeneration;
    }

    /**
     * @return environmentName
     */
    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * @return kind
     */
    public String getKind() {
        return this.kind;
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
        private Integer environmentGeneration; 
        private String environmentName; 
        private String kind; 
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
         * The generation of the environment.
         */
        public Builder environmentGeneration(Integer environmentGeneration) {
            this.environmentGeneration = environmentGeneration;
            return this;
        }

        /**
         * The name of an environment.
         */
        public Builder environmentName(String environmentName) {
            this.environmentName = environmentName;
            return this;
        }

        /**
         * The kind of the resource.
         */
        public Builder kind(String kind) {
            this.kind = kind;
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
         * Main user ID of an Aliyun account.
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        public EnvironmentRevision build() {
            return new EnvironmentRevision(this);
        } 

    } 

}
