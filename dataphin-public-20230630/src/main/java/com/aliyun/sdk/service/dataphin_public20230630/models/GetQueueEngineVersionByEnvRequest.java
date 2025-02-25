// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetQueueEngineVersionByEnvRequest} extends {@link RequestModel}
 *
 * <p>GetQueueEngineVersionByEnvRequest</p>
 */
public class GetQueueEngineVersionByEnvRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Env")
    @com.aliyun.core.annotation.Validation(required = true)
    private String env;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueueName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queueName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamBatchMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String streamBatchMode;

    private GetQueueEngineVersionByEnvRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clusterId = builder.clusterId;
        this.env = builder.env;
        this.opTenantId = builder.opTenantId;
        this.projectId = builder.projectId;
        this.queueName = builder.queueName;
        this.streamBatchMode = builder.streamBatchMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQueueEngineVersionByEnvRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return queueName
     */
    public String getQueueName() {
        return this.queueName;
    }

    /**
     * @return streamBatchMode
     */
    public String getStreamBatchMode() {
        return this.streamBatchMode;
    }

    public static final class Builder extends Request.Builder<GetQueueEngineVersionByEnvRequest, Builder> {
        private String regionId; 
        private String clusterId; 
        private String env; 
        private Long opTenantId; 
        private Long projectId; 
        private String queueName; 
        private String streamBatchMode; 

        private Builder() {
            super();
        } 

        private Builder(GetQueueEngineVersionByEnvRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clusterId = request.clusterId;
            this.env = request.env;
            this.opTenantId = request.opTenantId;
            this.projectId = request.projectId;
            this.queueName = request.queueName;
            this.streamBatchMode = request.streamBatchMode;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>61187014-a3ba-4cdd-8609-1f0aa3df4a3d</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROD</p>
         */
        public Builder env(String env) {
            this.putQueryParameter("Env", env);
            this.env = env;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7081229106458752</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default-queue</p>
         */
        public Builder queueName(String queueName) {
            this.putQueryParameter("QueueName", queueName);
            this.queueName = queueName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BOTH</p>
         */
        public Builder streamBatchMode(String streamBatchMode) {
            this.putQueryParameter("StreamBatchMode", streamBatchMode);
            this.streamBatchMode = streamBatchMode;
            return this;
        }

        @Override
        public GetQueueEngineVersionByEnvRequest build() {
            return new GetQueueEngineVersionByEnvRequest(this);
        } 

    } 

}
