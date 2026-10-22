// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link ModifyDatabasesProjectRequest} extends {@link RequestModel}
 *
 * <p>ModifyDatabasesProjectRequest</p>
 */
public class ModifyDatabasesProjectRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String databaseIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long targetProjectId;

    private ModifyDatabasesProjectRequest(Builder builder) {
        super(builder);
        this.databaseIds = builder.databaseIds;
        this.instanceId = builder.instanceId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.targetProjectId = builder.targetProjectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDatabasesProjectRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databaseIds
     */
    public String getDatabaseIds() {
        return this.databaseIds;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return targetProjectId
     */
    public Long getTargetProjectId() {
        return this.targetProjectId;
    }

    public static final class Builder extends Request.Builder<ModifyDatabasesProjectRequest, Builder> {
        private String databaseIds; 
        private String instanceId; 
        private Long projectId; 
        private String regionId; 
        private Long targetProjectId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDatabasesProjectRequest request) {
            super(request);
            this.databaseIds = request.databaseIds;
            this.instanceId = request.instanceId;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.targetProjectId = request.targetProjectId;
        } 

        /**
         * <p>The IDs of the database instances that you want to move. This parameter is a JSON-formatted string. You can specify up to 100 database instance IDs. Separate multiple database instance IDs with commas (,).</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2758822.html">ListDatabases</a> operation to query this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2,3</p>
         */
        public Builder databaseIds(String databaseIds) {
            this.putQueryParameter("DatabaseIds", databaseIds);
            this.databaseIds = databaseIds;
            return this;
        }

        /**
         * <p>The instance ID of the bastion host.</p>
         * <blockquote>
         * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-zmb2y9ydw08</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the project to which the database instances currently belong.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The region ID of the bastion host.</p>
         * <blockquote>
         * <p>For the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the target project to which you want to move the database instances.</p>
         * <blockquote>
         * <p>You can call the ListProjectsForProjectAuthorizationPrincipal operation to query this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder targetProjectId(Long targetProjectId) {
            this.putQueryParameter("TargetProjectId", targetProjectId);
            this.targetProjectId = targetProjectId;
            return this;
        }

        @Override
        public ModifyDatabasesProjectRequest build() {
            return new ModifyDatabasesProjectRequest(this);
        } 

    } 

}
