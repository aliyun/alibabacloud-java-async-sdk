// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link UpdateKyuubiServiceRequest} extends {@link RequestModel}
 *
 * <p>UpdateKyuubiServiceRequest</p>
 */
public class UpdateKyuubiServiceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("kyuubiServiceId")
    private String kyuubiServiceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("computeInstance")
    private String computeInstance;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("kyuubiConfigs")
    private String kyuubiConfigs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("kyuubiReleaseVersion")
    private String kyuubiReleaseVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("publicEndpointEnabled")
    private Boolean publicEndpointEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("queue")
    private String queue;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("releaseVersion")
    private String releaseVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("replica")
    private Integer replica;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("restart")
    private Boolean restart;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sparkConfigs")
    private String sparkConfigs;

    private UpdateKyuubiServiceRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.kyuubiServiceId = builder.kyuubiServiceId;
        this.computeInstance = builder.computeInstance;
        this.kyuubiConfigs = builder.kyuubiConfigs;
        this.kyuubiReleaseVersion = builder.kyuubiReleaseVersion;
        this.name = builder.name;
        this.publicEndpointEnabled = builder.publicEndpointEnabled;
        this.queue = builder.queue;
        this.releaseVersion = builder.releaseVersion;
        this.replica = builder.replica;
        this.restart = builder.restart;
        this.sparkConfigs = builder.sparkConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKyuubiServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return kyuubiServiceId
     */
    public String getKyuubiServiceId() {
        return this.kyuubiServiceId;
    }

    /**
     * @return computeInstance
     */
    public String getComputeInstance() {
        return this.computeInstance;
    }

    /**
     * @return kyuubiConfigs
     */
    public String getKyuubiConfigs() {
        return this.kyuubiConfigs;
    }

    /**
     * @return kyuubiReleaseVersion
     */
    public String getKyuubiReleaseVersion() {
        return this.kyuubiReleaseVersion;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return publicEndpointEnabled
     */
    public Boolean getPublicEndpointEnabled() {
        return this.publicEndpointEnabled;
    }

    /**
     * @return queue
     */
    public String getQueue() {
        return this.queue;
    }

    /**
     * @return releaseVersion
     */
    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    /**
     * @return replica
     */
    public Integer getReplica() {
        return this.replica;
    }

    /**
     * @return restart
     */
    public Boolean getRestart() {
        return this.restart;
    }

    /**
     * @return sparkConfigs
     */
    public String getSparkConfigs() {
        return this.sparkConfigs;
    }

    public static final class Builder extends Request.Builder<UpdateKyuubiServiceRequest, Builder> {
        private String workspaceId; 
        private String kyuubiServiceId; 
        private String computeInstance; 
        private String kyuubiConfigs; 
        private String kyuubiReleaseVersion; 
        private String name; 
        private Boolean publicEndpointEnabled; 
        private String queue; 
        private String releaseVersion; 
        private Integer replica; 
        private Boolean restart; 
        private String sparkConfigs; 

        private Builder() {
            super();
        } 

        private Builder(UpdateKyuubiServiceRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.kyuubiServiceId = request.kyuubiServiceId;
            this.computeInstance = request.computeInstance;
            this.kyuubiConfigs = request.kyuubiConfigs;
            this.kyuubiReleaseVersion = request.kyuubiReleaseVersion;
            this.name = request.name;
            this.publicEndpointEnabled = request.publicEndpointEnabled;
            this.queue = request.queue;
            this.releaseVersion = request.releaseVersion;
            this.replica = request.replica;
            this.restart = request.restart;
            this.sparkConfigs = request.sparkConfigs;
        } 

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * kyuubiServiceId.
         */
        public Builder kyuubiServiceId(String kyuubiServiceId) {
            this.putPathParameter("kyuubiServiceId", kyuubiServiceId);
            this.kyuubiServiceId = kyuubiServiceId;
            return this;
        }

        /**
         * computeInstance.
         */
        public Builder computeInstance(String computeInstance) {
            this.putBodyParameter("computeInstance", computeInstance);
            this.computeInstance = computeInstance;
            return this;
        }

        /**
         * kyuubiConfigs.
         */
        public Builder kyuubiConfigs(String kyuubiConfigs) {
            this.putBodyParameter("kyuubiConfigs", kyuubiConfigs);
            this.kyuubiConfigs = kyuubiConfigs;
            return this;
        }

        /**
         * kyuubiReleaseVersion.
         */
        public Builder kyuubiReleaseVersion(String kyuubiReleaseVersion) {
            this.putBodyParameter("kyuubiReleaseVersion", kyuubiReleaseVersion);
            this.kyuubiReleaseVersion = kyuubiReleaseVersion;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * publicEndpointEnabled.
         */
        public Builder publicEndpointEnabled(Boolean publicEndpointEnabled) {
            this.putBodyParameter("publicEndpointEnabled", publicEndpointEnabled);
            this.publicEndpointEnabled = publicEndpointEnabled;
            return this;
        }

        /**
         * queue.
         */
        public Builder queue(String queue) {
            this.putBodyParameter("queue", queue);
            this.queue = queue;
            return this;
        }

        /**
         * releaseVersion.
         */
        public Builder releaseVersion(String releaseVersion) {
            this.putBodyParameter("releaseVersion", releaseVersion);
            this.releaseVersion = releaseVersion;
            return this;
        }

        /**
         * replica.
         */
        public Builder replica(Integer replica) {
            this.putBodyParameter("replica", replica);
            this.replica = replica;
            return this;
        }

        /**
         * restart.
         */
        public Builder restart(Boolean restart) {
            this.putBodyParameter("restart", restart);
            this.restart = restart;
            return this;
        }

        /**
         * sparkConfigs.
         */
        public Builder sparkConfigs(String sparkConfigs) {
            this.putBodyParameter("sparkConfigs", sparkConfigs);
            this.sparkConfigs = sparkConfigs;
            return this;
        }

        @Override
        public UpdateKyuubiServiceRequest build() {
            return new UpdateKyuubiServiceRequest(this);
        } 

    } 

}
