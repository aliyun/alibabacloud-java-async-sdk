// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateQualityRelativeNodeRequest} extends {@link RequestModel}
 *
 * <p>CreateQualityRelativeNodeRequest</p>
 */
public class CreateQualityRelativeNodeRequest extends Request {
    @Body
    @NameInMap("EnvType")
    @Validation(required = true, maxLength = 40, minLength = 1)
    private String envType;

    @Body
    @NameInMap("MatchExpression")
    @Validation(required = true, maxLength = 80, minLength = 1)
    private String matchExpression;

    @Body
    @NameInMap("NodeId")
    @Validation(required = true)
    private Long nodeId;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private Long projectId;

    @Body
    @NameInMap("ProjectName")
    @Validation(required = true, maxLength = 128, minLength = 1)
    private String projectName;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("TableName")
    @Validation(required = true, maxLength = 128, minLength = 1)
    private String tableName;

    @Body
    @NameInMap("TargetNodeProjectId")
    @Validation(required = true)
    private Long targetNodeProjectId;

    @Body
    @NameInMap("TargetNodeProjectName")
    @Validation(required = true, maxLength = 128, minLength = 1)
    private String targetNodeProjectName;

    private CreateQualityRelativeNodeRequest(Builder builder) {
        super(builder);
        this.envType = builder.envType;
        this.matchExpression = builder.matchExpression;
        this.nodeId = builder.nodeId;
        this.projectId = builder.projectId;
        this.projectName = builder.projectName;
        this.regionId = builder.regionId;
        this.tableName = builder.tableName;
        this.targetNodeProjectId = builder.targetNodeProjectId;
        this.targetNodeProjectName = builder.targetNodeProjectName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateQualityRelativeNodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<CreateQualityRelativeNodeRequest, Builder> {
        private String envType; 
        private String matchExpression; 
        private Long nodeId; 
        private Long projectId; 
        private String projectName; 
        private String regionId; 
        private String tableName; 
        private Long targetNodeProjectId; 
        private String targetNodeProjectName; 

        private Builder() {
            super();
        } 

        private Builder(CreateQualityRelativeNodeRequest request) {
            super(request);
            this.envType = request.envType;
            this.matchExpression = request.matchExpression;
            this.nodeId = request.nodeId;
            this.projectId = request.projectId;
            this.projectName = request.projectName;
            this.regionId = request.regionId;
            this.tableName = request.tableName;
            this.targetNodeProjectId = request.targetNodeProjectId;
            this.targetNodeProjectName = request.targetNodeProjectName;
        } 

        /**
         * EnvType.
         */
        public Builder envType(String envType) {
            this.putBodyParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * MatchExpression.
         */
        public Builder matchExpression(String matchExpression) {
            this.putBodyParameter("MatchExpression", matchExpression);
            this.matchExpression = matchExpression;
            return this;
        }

        /**
         * NodeId.
         */
        public Builder nodeId(Long nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
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
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.putBodyParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * TargetNodeProjectId.
         */
        public Builder targetNodeProjectId(Long targetNodeProjectId) {
            this.putBodyParameter("TargetNodeProjectId", targetNodeProjectId);
            this.targetNodeProjectId = targetNodeProjectId;
            return this;
        }

        /**
         * TargetNodeProjectName.
         */
        public Builder targetNodeProjectName(String targetNodeProjectName) {
            this.putBodyParameter("TargetNodeProjectName", targetNodeProjectName);
            this.targetNodeProjectName = targetNodeProjectName;
            return this;
        }

        @Override
        public CreateQualityRelativeNodeRequest build() {
            return new CreateQualityRelativeNodeRequest(this);
        } 

    } 

}
