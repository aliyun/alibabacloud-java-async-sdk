// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteQualityRelativeNodeRequest} extends {@link RequestModel}
 *
 * <p>DeleteQualityRelativeNodeRequest</p>
 */
public class DeleteQualityRelativeNodeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnvType")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 40, minLength = 1)
    private String envType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MatchExpression")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 80, minLength = 1)
    private String matchExpression;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long nodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TableName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String tableName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetNodeProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long targetNodeProjectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetNodeProjectName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 512, minLength = 1)
    private String targetNodeProjectName;

    private DeleteQualityRelativeNodeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.envType = builder.envType;
        this.matchExpression = builder.matchExpression;
        this.nodeId = builder.nodeId;
        this.projectId = builder.projectId;
        this.projectName = builder.projectName;
        this.tableName = builder.tableName;
        this.targetNodeProjectId = builder.targetNodeProjectId;
        this.targetNodeProjectName = builder.targetNodeProjectName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteQualityRelativeNodeRequest create() {
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
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
    }

    /**
     * @return matchExpression
     */
    public String getMatchExpression() {
        return this.matchExpression;
    }

    /**
     * @return nodeId
     */
    public Long getNodeId() {
        return this.nodeId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return targetNodeProjectId
     */
    public Long getTargetNodeProjectId() {
        return this.targetNodeProjectId;
    }

    /**
     * @return targetNodeProjectName
     */
    public String getTargetNodeProjectName() {
        return this.targetNodeProjectName;
    }

    public static final class Builder extends Request.Builder<DeleteQualityRelativeNodeRequest, Builder> {
        private String regionId; 
        private String envType; 
        private String matchExpression; 
        private Long nodeId; 
        private Long projectId; 
        private String projectName; 
        private String tableName; 
        private Long targetNodeProjectId; 
        private String targetNodeProjectName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteQualityRelativeNodeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.envType = request.envType;
            this.matchExpression = request.matchExpression;
            this.nodeId = request.nodeId;
            this.projectId = request.projectId;
            this.projectName = request.projectName;
            this.tableName = request.tableName;
            this.targetNodeProjectId = request.targetNodeProjectId;
            this.targetNodeProjectName = request.targetNodeProjectName;
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
         * The type of the compute engine or data source. Valid values:
         * <p>
         * 
         * *   cdh
         * *   analyticdb_for_mysql
         * *   odps
         * *   emr
         * *   hadoop
         * *   holodb
         * *   hybriddb_for_postgresql
         */
        public Builder envType(String envType) {
            this.putBodyParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * The partition filter expression.
         */
        public Builder matchExpression(String matchExpression) {
            this.putBodyParameter("MatchExpression", matchExpression);
            this.matchExpression = matchExpression;
            return this;
        }

        /**
         * The ID of the node.
         */
        public Builder nodeId(Long nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * The ID of the workspace.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The name of the compute engine instance or data source.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * The name of the table that is generated by the node.
         */
        public Builder tableName(String tableName) {
            this.putBodyParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * The ID of the workspace to which the node associated with the partition filter expression belongs.
         */
        public Builder targetNodeProjectId(Long targetNodeProjectId) {
            this.putBodyParameter("TargetNodeProjectId", targetNodeProjectId);
            this.targetNodeProjectId = targetNodeProjectId;
            return this;
        }

        /**
         * The name of the workspace to which the node associated with the partition filter expression belongs.
         */
        public Builder targetNodeProjectName(String targetNodeProjectName) {
            this.putBodyParameter("TargetNodeProjectName", targetNodeProjectName);
            this.targetNodeProjectName = targetNodeProjectName;
            return this;
        }

        @Override
        public DeleteQualityRelativeNodeRequest build() {
            return new DeleteQualityRelativeNodeRequest(this);
        } 

    } 

}
