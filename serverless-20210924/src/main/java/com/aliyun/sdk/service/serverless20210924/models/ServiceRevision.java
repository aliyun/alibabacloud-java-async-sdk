// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ServiceRevision} extends {@link TeaModel}
 *
 * <p>ServiceRevision</p>
 */
public class ServiceRevision extends TeaModel {
    @NameInMap("createdTime")
    private String createdTime;

    @NameInMap("kind")
    private String kind;

    @NameInMap("serviceGeneration")
    private Integer serviceGeneration;

    @NameInMap("serviceName")
    private String serviceName;

    @NameInMap("spec")
    @Validation(required = true)
    private ServiceSpec spec;

    @NameInMap("status")
    private EnvironmentStatus status;

    @NameInMap("uid")
    private String uid;

    private ServiceRevision(Builder builder) {
        this.createdTime = builder.createdTime;
        this.kind = builder.kind;
        this.serviceGeneration = builder.serviceGeneration;
        this.serviceName = builder.serviceName;
        this.spec = builder.spec;
        this.status = builder.status;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ServiceRevision create() {
        return builder().build();
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return kind
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * @return serviceGeneration
     */
    public Integer getServiceGeneration() {
        return this.serviceGeneration;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return spec
     */
    public ServiceSpec getSpec() {
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
        private String kind; 
        private Integer serviceGeneration; 
        private String serviceName; 
        private ServiceSpec spec; 
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
         * The kind of the resource.
         */
        public Builder kind(String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * The generation of the service.
         */
        public Builder serviceGeneration(Integer serviceGeneration) {
            this.serviceGeneration = serviceGeneration;
            return this;
        }

        /**
         * The name of a service.
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * Specification of the desired behavior of the Service.
         */
        public Builder spec(ServiceSpec spec) {
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

        public ServiceRevision build() {
            return new ServiceRevision(this);
        } 

    } 

}
