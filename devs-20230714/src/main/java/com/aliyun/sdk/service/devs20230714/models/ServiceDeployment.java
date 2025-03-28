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
 * {@link ServiceDeployment} extends {@link TeaModel}
 *
 * <p>ServiceDeployment</p>
 */
public class ServiceDeployment extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("environmentDeploymentName")
    private String environmentDeploymentName;

    @com.aliyun.core.annotation.NameInMap("kind")
    private String kind;

    @com.aliyun.core.annotation.NameInMap("labels")
    private java.util.Map<String, String> labels;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 63, minLength = 1)
    private String name;

    @com.aliyun.core.annotation.NameInMap("status")
    private ServiceDeploymentStatus status;

    @com.aliyun.core.annotation.NameInMap("uid")
    private String uid;

    private ServiceDeployment(Builder builder) {
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.environmentDeploymentName = builder.environmentDeploymentName;
        this.kind = builder.kind;
        this.labels = builder.labels;
        this.name = builder.name;
        this.status = builder.status;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ServiceDeployment create() {
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
     * @return environmentDeploymentName
     */
    public String getEnvironmentDeploymentName() {
        return this.environmentDeploymentName;
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
     * @return status
     */
    public ServiceDeploymentStatus getStatus() {
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
        private String description; 
        private String environmentDeploymentName; 
        private String kind; 
        private java.util.Map<String, String> labels; 
        private String name; 
        private ServiceDeploymentStatus status; 
        private String uid; 

        private Builder() {
        } 

        private Builder(ServiceDeployment model) {
            this.createdTime = model.createdTime;
            this.description = model.description;
            this.environmentDeploymentName = model.environmentDeploymentName;
            this.kind = model.kind;
            this.labels = model.labels;
            this.name = model.name;
            this.status = model.status;
            this.uid = model.uid;
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
         * environmentDeploymentName.
         */
        public Builder environmentDeploymentName(String environmentDeploymentName) {
            this.environmentDeploymentName = environmentDeploymentName;
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
         * <p>my-deployment</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * status.
         */
        public Builder status(ServiceDeploymentStatus status) {
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

        public ServiceDeployment build() {
            return new ServiceDeployment(this);
        } 

    } 

}
