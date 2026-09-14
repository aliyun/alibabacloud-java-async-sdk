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
 * {@link CreateKyuubiServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateKyuubiServiceRequest</p>
 */
public class CreateKyuubiServiceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

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
    @com.aliyun.core.annotation.NameInMap("sparkConfigs")
    private String sparkConfigs;

    private CreateKyuubiServiceRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.computeInstance = builder.computeInstance;
        this.kyuubiConfigs = builder.kyuubiConfigs;
        this.kyuubiReleaseVersion = builder.kyuubiReleaseVersion;
        this.name = builder.name;
        this.publicEndpointEnabled = builder.publicEndpointEnabled;
        this.queue = builder.queue;
        this.releaseVersion = builder.releaseVersion;
        this.replica = builder.replica;
        this.sparkConfigs = builder.sparkConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKyuubiServiceRequest create() {
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
     * @return sparkConfigs
     */
    public String getSparkConfigs() {
        return this.sparkConfigs;
    }

    public static final class Builder extends Request.Builder<CreateKyuubiServiceRequest, Builder> {
        private String workspaceId; 
        private String computeInstance; 
        private String kyuubiConfigs; 
        private String kyuubiReleaseVersion; 
        private String name; 
        private Boolean publicEndpointEnabled; 
        private String queue; 
        private String releaseVersion; 
        private Integer replica; 
        private String sparkConfigs; 

        private Builder() {
            super();
        } 

        private Builder(CreateKyuubiServiceRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.computeInstance = request.computeInstance;
            this.kyuubiConfigs = request.kyuubiConfigs;
            this.kyuubiReleaseVersion = request.kyuubiReleaseVersion;
            this.name = request.name;
            this.publicEndpointEnabled = request.publicEndpointEnabled;
            this.queue = request.queue;
            this.releaseVersion = request.releaseVersion;
            this.replica = request.replica;
            this.sparkConfigs = request.sparkConfigs;
        } 

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-d2d82aa09155****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The specifications of the Kyuubi service.</p>
         * 
         * <strong>example:</strong>
         * <p>2c8g</p>
         */
        public Builder computeInstance(String computeInstance) {
            this.putBodyParameter("computeInstance", computeInstance);
            this.computeInstance = computeInstance;
            return this;
        }

        /**
         * <p>The Kyuubi service configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;key\&quot;:\&quot;kyuubi.engine.share.level\&quot;,\&quot;value\&quot;:\&quot;USER\&quot;}]</p>
         */
        public Builder kyuubiConfigs(String kyuubiConfigs) {
            this.putBodyParameter("kyuubiConfigs", kyuubiConfigs);
            this.kyuubiConfigs = kyuubiConfigs;
            return this;
        }

        /**
         * <p>The Kyuubi service database engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.9.2-0.0.2</p>
         */
        public Builder kyuubiReleaseVersion(String kyuubiReleaseVersion) {
            this.putBodyParameter("kyuubiReleaseVersion", kyuubiReleaseVersion);
            this.kyuubiReleaseVersion = kyuubiReleaseVersion;
            return this;
        }

        /**
         * <p>The Kyuubi service name.</p>
         * 
         * <strong>example:</strong>
         * <p>dev_serverless_spark</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>Specifies whether to enable public network access.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder publicEndpointEnabled(Boolean publicEndpointEnabled) {
            this.putBodyParameter("publicEndpointEnabled", publicEndpointEnabled);
            this.publicEndpointEnabled = publicEndpointEnabled;
            return this;
        }

        /**
         * <p>The queue where the Kyuubi service runs.</p>
         * 
         * <strong>example:</strong>
         * <p>dev_queue</p>
         */
        public Builder queue(String queue) {
            this.putBodyParameter("queue", queue);
            this.queue = queue;
            return this;
        }

        /**
         * <p>The Spark database engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>esr-4.6.0 (Spark 3.5.2, Scala 2.12)</p>
         */
        public Builder releaseVersion(String releaseVersion) {
            this.putBodyParameter("releaseVersion", releaseVersion);
            this.releaseVersion = releaseVersion;
            return this;
        }

        /**
         * <p>The number of replicas for high availability (HA).</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder replica(Integer replica) {
            this.putBodyParameter("replica", replica);
            this.replica = replica;
            return this;
        }

        /**
         * <p>The Spark configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;key\&quot;:\&quot;spark.app.name\&quot;,\&quot;value\&quot;:\&quot;test\&quot;}]</p>
         */
        public Builder sparkConfigs(String sparkConfigs) {
            this.putBodyParameter("sparkConfigs", sparkConfigs);
            this.sparkConfigs = sparkConfigs;
            return this;
        }

        @Override
        public CreateKyuubiServiceRequest build() {
            return new CreateKyuubiServiceRequest(this);
        } 

    } 

}
