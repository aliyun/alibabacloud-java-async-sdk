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
 * {@link UpdateTaskInstancesRequest} extends {@link RequestModel}
 *
 * <p>UpdateTaskInstancesRequest</p>
 */
public class UpdateTaskInstancesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskInstances")
    private java.util.List<TaskInstances> taskInstances;

    private UpdateTaskInstancesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.comment = builder.comment;
        this.taskInstances = builder.taskInstances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTaskInstancesRequest create() {
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
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return taskInstances
     */
    public java.util.List<TaskInstances> getTaskInstances() {
        return this.taskInstances;
    }

    public static final class Builder extends Request.Builder<UpdateTaskInstancesRequest, Builder> {
        private String regionId; 
        private String comment; 
        private java.util.List<TaskInstances> taskInstances; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTaskInstancesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.comment = request.comment;
            this.taskInstances = request.taskInstances;
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
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a comment</p>
         */
        public Builder comment(String comment) {
            this.putBodyParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>The instances.</p>
         */
        public Builder taskInstances(java.util.List<TaskInstances> taskInstances) {
            String taskInstancesShrink = shrink(taskInstances, "TaskInstances", "json");
            this.putBodyParameter("TaskInstances", taskInstancesShrink);
            this.taskInstances = taskInstances;
            return this;
        }

        @Override
        public UpdateTaskInstancesRequest build() {
            return new UpdateTaskInstancesRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateTaskInstancesRequest} extends {@link TeaModel}
     *
     * <p>UpdateTaskInstancesRequest</p>
     */
    public static class DataSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private DataSource(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSource create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(DataSource model) {
                this.name = model.name;
            } 

            /**
             * <p>The name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql_test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public DataSource build() {
                return new DataSource(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateTaskInstancesRequest} extends {@link TeaModel}
     *
     * <p>UpdateTaskInstancesRequest</p>
     */
    public static class TaskInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSource")
        private DataSource dataSource;

        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("RuntimeResource")
        private String runtimeResource;

        private TaskInstances(Builder builder) {
            this.dataSource = builder.dataSource;
            this.id = builder.id;
            this.priority = builder.priority;
            this.runtimeResource = builder.runtimeResource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskInstances create() {
            return builder().build();
        }

        /**
         * @return dataSource
         */
        public DataSource getDataSource() {
            return this.dataSource;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return runtimeResource
         */
        public String getRuntimeResource() {
            return this.runtimeResource;
        }

        public static final class Builder {
            private DataSource dataSource; 
            private Long id; 
            private Integer priority; 
            private String runtimeResource; 

            private Builder() {
            } 

            private Builder(TaskInstances model) {
                this.dataSource = model.dataSource;
                this.id = model.id;
                this.priority = model.priority;
                this.runtimeResource = model.runtimeResource;
            } 

            /**
             * <p>The information about the associated data source.</p>
             */
            public Builder dataSource(DataSource dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The priority of the instance. Valid values: 1, 3, 5, 7, and 8.</p>
             * <p>A larger value indicates a higher priority. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The resource group information. Set this parameter to the ID of a resource group for scheduling.</p>
             * 
             * <strong>example:</strong>
             * <p>S_res_group_524258031846018_1684XXXXXXXXX</p>
             */
            public Builder runtimeResource(String runtimeResource) {
                this.runtimeResource = runtimeResource;
                return this;
            }

            public TaskInstances build() {
                return new TaskInstances(this);
            } 

        } 

    }
}
