// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCacheAnalysisJobRequest} extends {@link RequestModel}
 *
 * <p>CreateCacheAnalysisJobRequest</p>
 */
public class CreateCacheAnalysisJobRequest extends Request {
    @Query
    @NameInMap("BackupSetId")
    private String backupSetId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("NodeId")
    private String nodeId;

    private CreateCacheAnalysisJobRequest(Builder builder) {
        super(builder);
        this.backupSetId = builder.backupSetId;
        this.instanceId = builder.instanceId;
        this.nodeId = builder.nodeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCacheAnalysisJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupSetId
     */
    public String getBackupSetId() {
        return this.backupSetId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    public static final class Builder extends Request.Builder<CreateCacheAnalysisJobRequest, Builder> {
        private String backupSetId; 
        private String instanceId; 
        private String nodeId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCacheAnalysisJobRequest response) {
            super(response);
            this.backupSetId = response.backupSetId;
            this.instanceId = response.instanceId;
            this.nodeId = response.nodeId;
        } 

        /**
         * BackupSetId.
         */
        public Builder backupSetId(String backupSetId) {
            this.putQueryParameter("BackupSetId", backupSetId);
            this.backupSetId = backupSetId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NodeId.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        @Override
        public CreateCacheAnalysisJobRequest build() {
            return new CreateCacheAnalysisJobRequest(this);
        } 

    } 

}
