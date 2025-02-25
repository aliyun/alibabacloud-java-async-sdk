// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link CreateCacheAnalysisJobRequest} extends {@link RequestModel}
 *
 * <p>CreateCacheAnalysisJobRequest</p>
 */
public class CreateCacheAnalysisJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupSetId")
    private String backupSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Separators")
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
         * <p>The ID of the backup file. You can call the <a href="https://help.aliyun.com/document_detail/61081.html">DescribeBackups</a> operation to query the ID.</p>
         * <ul>
         * <li>If you need to specify multiple backup file IDs, separate them with commas (,). For example, you can set this parameter to <code>12345,67890</code>.</li>
         * <li>If you do not specify this parameter, the system automatically backs up the task and performs cache analysis on the backup file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder backupSetId(String backupSetId) {
            this.putQueryParameter("BackupSetId", backupSetId);
            this.backupSetId = backupSetId;
            return this;
        }

        /**
         * <p>The ID of the ApsaraDB for Redis instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp18ff4a195d****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the data node on the instance. You can specify this parameter to query the monitoring information about the specified node.</p>
         * <blockquote>
         * <p> If you specify the BackupSetId parameter, the system ignores the NodeId parameter. You can call the <a href="https://help.aliyun.com/document_detail/94665.html">DescribeLogicInstanceTopology</a> operation to query the node ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>r-x****-db-0</p>
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The delimiters used to identify the prefixes of keys. You do not need to specify this parameter if one or more of the following default delimiters are used: <code>: ; , _ - + @ = | #</code></p>
         * 
         * <strong>example:</strong>
         * <p>&amp;</p>
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
