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
 * {@link Savepoint} extends {@link TeaModel}
 *
 * <p>Savepoint</p>
 */
public class Savepoint extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdAt")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("deploymentId")
    private String deploymentId;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("jobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("modifiedAt")
    private Long modifiedAt;

    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("nativeFormat")
    private Boolean nativeFormat;

    @com.aliyun.core.annotation.NameInMap("savepointId")
    private String savepointId;

    @com.aliyun.core.annotation.NameInMap("savepointLocation")
    private String savepointLocation;

    @com.aliyun.core.annotation.NameInMap("savepointOrigin")
    private String savepointOrigin;

    @com.aliyun.core.annotation.NameInMap("status")
    private SavepointStatus status;

    @com.aliyun.core.annotation.NameInMap("stopWithDrainEnabled")
    private Boolean stopWithDrainEnabled;

    private Savepoint(Builder builder) {
        this.createdAt = builder.createdAt;
        this.deploymentId = builder.deploymentId;
        this.description = builder.description;
        this.jobId = builder.jobId;
        this.modifiedAt = builder.modifiedAt;
        this.namespace = builder.namespace;
        this.nativeFormat = builder.nativeFormat;
        this.savepointId = builder.savepointId;
        this.savepointLocation = builder.savepointLocation;
        this.savepointOrigin = builder.savepointOrigin;
        this.status = builder.status;
        this.stopWithDrainEnabled = builder.stopWithDrainEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Savepoint create() {
        return builder().build();
    }

    /**
     * @return createdAt
     */
    public Long getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return deploymentId
     */
    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return modifiedAt
     */
    public Long getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return nativeFormat
     */
    public Boolean getNativeFormat() {
        return this.nativeFormat;
    }

    /**
     * @return savepointId
     */
    public String getSavepointId() {
        return this.savepointId;
    }

    /**
     * @return savepointLocation
     */
    public String getSavepointLocation() {
        return this.savepointLocation;
    }

    /**
     * @return savepointOrigin
     */
    public String getSavepointOrigin() {
        return this.savepointOrigin;
    }

    /**
     * @return status
     */
    public SavepointStatus getStatus() {
        return this.status;
    }

    /**
     * @return stopWithDrainEnabled
     */
    public Boolean getStopWithDrainEnabled() {
        return this.stopWithDrainEnabled;
    }

    public static final class Builder {
        private Long createdAt; 
        private String deploymentId; 
        private String description; 
        private String jobId; 
        private Long modifiedAt; 
        private String namespace; 
        private Boolean nativeFormat; 
        private String savepointId; 
        private String savepointLocation; 
        private String savepointOrigin; 
        private SavepointStatus status; 
        private Boolean stopWithDrainEnabled; 

        /**
         * createdAt.
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * deploymentId.
         */
        public Builder deploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
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
         * jobId.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
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
         * namespace.
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * nativeFormat.
         */
        public Builder nativeFormat(Boolean nativeFormat) {
            this.nativeFormat = nativeFormat;
            return this;
        }

        /**
         * savepointId.
         */
        public Builder savepointId(String savepointId) {
            this.savepointId = savepointId;
            return this;
        }

        /**
         * savepointLocation.
         */
        public Builder savepointLocation(String savepointLocation) {
            this.savepointLocation = savepointLocation;
            return this;
        }

        /**
         * savepointOrigin.
         */
        public Builder savepointOrigin(String savepointOrigin) {
            this.savepointOrigin = savepointOrigin;
            return this;
        }

        /**
         * status.
         */
        public Builder status(SavepointStatus status) {
            this.status = status;
            return this;
        }

        /**
         * stopWithDrainEnabled.
         */
        public Builder stopWithDrainEnabled(Boolean stopWithDrainEnabled) {
            this.stopWithDrainEnabled = stopWithDrainEnabled;
            return this;
        }

        public Savepoint build() {
            return new Savepoint(this);
        } 

    } 

}
