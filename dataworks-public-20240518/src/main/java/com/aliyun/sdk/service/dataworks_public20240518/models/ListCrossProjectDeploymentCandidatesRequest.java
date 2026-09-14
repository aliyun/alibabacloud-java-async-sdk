// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListCrossProjectDeploymentCandidatesRequest} extends {@link RequestModel}
 *
 * <p>ListCrossProjectDeploymentCandidatesRequest</p>
 */
public class ListCrossProjectDeploymentCandidatesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChangeType")
    private String changeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CommitTimeFrom")
    private Long commitTimeFrom;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CommitTimeTo")
    private Long commitTimeTo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CommitUser")
    private String commitUser;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeploymentEnvironmentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long deploymentEnvironmentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ObjectId")
    private String objectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ObjectType")
    private String objectType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    private ListCrossProjectDeploymentCandidatesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.changeType = builder.changeType;
        this.commitTimeFrom = builder.commitTimeFrom;
        this.commitTimeTo = builder.commitTimeTo;
        this.commitUser = builder.commitUser;
        this.deploymentEnvironmentId = builder.deploymentEnvironmentId;
        this.keyword = builder.keyword;
        this.objectId = builder.objectId;
        this.objectType = builder.objectType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCrossProjectDeploymentCandidatesRequest create() {
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
     * @return changeType
     */
    public String getChangeType() {
        return this.changeType;
    }

    /**
     * @return commitTimeFrom
     */
    public Long getCommitTimeFrom() {
        return this.commitTimeFrom;
    }

    /**
     * @return commitTimeTo
     */
    public Long getCommitTimeTo() {
        return this.commitTimeTo;
    }

    /**
     * @return commitUser
     */
    public String getCommitUser() {
        return this.commitUser;
    }

    /**
     * @return deploymentEnvironmentId
     */
    public Long getDeploymentEnvironmentId() {
        return this.deploymentEnvironmentId;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return objectId
     */
    public String getObjectId() {
        return this.objectId;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<ListCrossProjectDeploymentCandidatesRequest, Builder> {
        private String regionId; 
        private String changeType; 
        private Long commitTimeFrom; 
        private Long commitTimeTo; 
        private String commitUser; 
        private Long deploymentEnvironmentId; 
        private String keyword; 
        private String objectId; 
        private String objectType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(ListCrossProjectDeploymentCandidatesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.changeType = request.changeType;
            this.commitTimeFrom = request.commitTimeFrom;
            this.commitTimeTo = request.commitTimeTo;
            this.commitUser = request.commitUser;
            this.deploymentEnvironmentId = request.deploymentEnvironmentId;
            this.keyword = request.keyword;
            this.objectId = request.objectId;
            this.objectType = request.objectType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The change type.</p>
         * 
         * <strong>example:</strong>
         * <p>ADD</p>
         */
        public Builder changeType(String changeType) {
            this.putBodyParameter("ChangeType", changeType);
            this.changeType = changeType;
            return this;
        }

        /**
         * <p>The start of the commit time range. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1788739200000</p>
         */
        public Builder commitTimeFrom(Long commitTimeFrom) {
            this.putBodyParameter("CommitTimeFrom", commitTimeFrom);
            this.commitTimeFrom = commitTimeFrom;
            return this;
        }

        /**
         * <p>The end of the commit time range. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1788825599999</p>
         */
        public Builder commitTimeTo(Long commitTimeTo) {
            this.putBodyParameter("CommitTimeTo", commitTimeTo);
            this.commitTimeTo = commitTimeTo;
            return this;
        }

        /**
         * <p>The committer.</p>
         * 
         * <strong>example:</strong>
         * <p>operator</p>
         */
        public Builder commitUser(String commitUser) {
            this.putBodyParameter("CommitUser", commitUser);
            this.commitUser = commitUser;
            return this;
        }

        /**
         * <p>The cross-workspace deployment environment ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        public Builder deploymentEnvironmentId(Long deploymentEnvironmentId) {
            this.putBodyParameter("DeploymentEnvironmentId", deploymentEnvironmentId);
            this.deploymentEnvironmentId = deploymentEnvironmentId;
            return this;
        }

        /**
         * <p>The search keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>object</p>
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The candidate object ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder objectId(String objectId) {
            this.putBodyParameter("ObjectId", objectId);
            this.objectId = objectId;
            return this;
        }

        /**
         * <p>The candidate object type.</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS_SQL</p>
         */
        public Builder objectType(String objectType) {
            this.putBodyParameter("ObjectType", objectType);
            this.objectType = objectType;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public ListCrossProjectDeploymentCandidatesRequest build() {
            return new ListCrossProjectDeploymentCandidatesRequest(this);
        } 

    } 

}
