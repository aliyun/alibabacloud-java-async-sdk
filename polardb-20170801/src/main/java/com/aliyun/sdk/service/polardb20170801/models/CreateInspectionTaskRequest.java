// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreateInspectionTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateInspectionTaskRequest</p>
 */
public class CreateInspectionTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CronExpression")
    private String cronExpression;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterList")
    private java.util.List<DBClusterList> DBClusterList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpaceId")
    private String spaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskDescription")
    private String taskDescription;

    private CreateInspectionTaskRequest(Builder builder) {
        super(builder);
        this.cronExpression = builder.cronExpression;
        this.DBClusterList = builder.DBClusterList;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.spaceId = builder.spaceId;
        this.taskDescription = builder.taskDescription;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInspectionTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cronExpression
     */
    public String getCronExpression() {
        return this.cronExpression;
    }

    /**
     * @return DBClusterList
     */
    public java.util.List<DBClusterList> getDBClusterList() {
        return this.DBClusterList;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    /**
     * @return taskDescription
     */
    public String getTaskDescription() {
        return this.taskDescription;
    }

    public static final class Builder extends Request.Builder<CreateInspectionTaskRequest, Builder> {
        private String cronExpression; 
        private java.util.List<DBClusterList> DBClusterList; 
        private String regionId; 
        private String resourceGroupId; 
        private String spaceId; 
        private String taskDescription; 

        private Builder() {
            super();
        } 

        private Builder(CreateInspectionTaskRequest request) {
            super(request);
            this.cronExpression = request.cronExpression;
            this.DBClusterList = request.DBClusterList;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.spaceId = request.spaceId;
            this.taskDescription = request.taskDescription;
        } 

        /**
         * <p>The cron expression for the inspection task, which specifies the periodic execution schedule.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 * * *</p>
         */
        public Builder cronExpression(String cronExpression) {
            this.putQueryParameter("CronExpression", cronExpression);
            this.cronExpression = cronExpression;
            return this;
        }

        /**
         * <p>The list of clusters associated with the inspection task.</p>
         */
        public Builder DBClusterList(java.util.List<DBClusterList> DBClusterList) {
            this.putQueryParameter("DBClusterList", DBClusterList);
            this.DBClusterList = DBClusterList;
            return this;
        }

        /**
         * <p>The ID of the region where the task resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-123</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the inspection workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>space-123</p>
         */
        public Builder spaceId(String spaceId) {
            this.putQueryParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        /**
         * <p>The description of the inspection task.</p>
         * 
         * <strong>example:</strong>
         * <p>Periodic inspection task</p>
         */
        public Builder taskDescription(String taskDescription) {
            this.putQueryParameter("TaskDescription", taskDescription);
            this.taskDescription = taskDescription;
            return this;
        }

        @Override
        public CreateInspectionTaskRequest build() {
            return new CreateInspectionTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateInspectionTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateInspectionTaskRequest</p>
     */
    public static class DBClusterList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private DBClusterList(Builder builder) {
            this.DBClusterId = builder.DBClusterId;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBClusterList create() {
            return builder().build();
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String DBClusterId; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(DBClusterList model) {
                this.DBClusterId = model.DBClusterId;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The ID of the PolarDB cluster to be inspected.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-test123456</p>
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * <p>The ID of the region where the cluster to be inspected resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public DBClusterList build() {
                return new DBClusterList(this);
            } 

        } 

    }
}
