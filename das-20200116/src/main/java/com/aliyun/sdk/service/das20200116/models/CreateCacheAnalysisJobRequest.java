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

    @Query
    @NameInMap("Separators")
    private String separators;

    private CreateCacheAnalysisJobRequest(Builder builder) {
        super(builder);
        this.backupSetId = builder.backupSetId;
        this.instanceId = builder.instanceId;
        this.nodeId = builder.nodeId;
        this.separators = builder.separators;
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

    /**
     * @return separators
     */
    public String getSeparators() {
        return this.separators;
    }

    public static final class Builder extends Request.Builder<CreateCacheAnalysisJobRequest, Builder> {
        private String backupSetId; 
        private String instanceId; 
        private String nodeId; 
        private String separators; 

        private Builder() {
            super();
        } 

        private Builder(CreateCacheAnalysisJobRequest request) {
            super(request);
            this.backupSetId = request.backupSetId;
            this.instanceId = request.instanceId;
            this.nodeId = request.nodeId;
            this.separators = request.separators;
        } 

        /**
         * The ID of the backup file. You can call the [DescribeBackups](~~61081~~) operation to query the ID.
         * <p>
         * 
         * *   If you need to specify multiple backup file IDs, separate them with commas (,). For example, you can set this parameter to `12345,67890`.
         * *   If you do not specify this parameter, the system automatically backs up the task and performs cache analysis on the backup file.
         */
        public Builder backupSetId(String backupSetId) {
            this.putQueryParameter("BackupSetId", backupSetId);
            this.backupSetId = backupSetId;
            return this;
        }

        /**
         * The ID of the ApsaraDB for Redis instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the data node on the instance. You can specify this parameter to query the monitoring information about the specified node.
         * <p>
         * 
         * >  If you specify the BackupSetId parameter, the system ignores the NodeId parameter. You can call the [DescribeLogicInstanceTopology](~~94665~~) operation to query the node ID.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * The delimiters used to identify the prefixes of keys. You do not need to specify this parameter if one or more of the following default delimiters are used: `: ; , _ - + @ = | #`
         */
        public Builder separators(String separators) {
            this.putQueryParameter("Separators", separators);
            this.separators = separators;
            return this;
        }

        @Override
        public CreateCacheAnalysisJobRequest build() {
            return new CreateCacheAnalysisJobRequest(this);
        } 

    } 

}
