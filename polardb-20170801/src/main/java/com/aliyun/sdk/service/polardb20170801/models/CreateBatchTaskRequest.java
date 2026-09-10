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
 * {@link CreateBatchTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateBatchTaskRequest</p>
 */
public class CreateBatchTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationType")
    private String applicationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Param")
    private String param;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskType;

    private CreateBatchTaskRequest(Builder builder) {
        super(builder);
        this.applicationType = builder.applicationType;
        this.instanceIds = builder.instanceIds;
        this.param = builder.param;
        this.regionId = builder.regionId;
        this.taskName = builder.taskName;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBatchTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationType
     */
    public String getApplicationType() {
        return this.applicationType;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return param
     */
    public String getParam() {
        return this.param;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<CreateBatchTaskRequest, Builder> {
        private String applicationType; 
        private java.util.List<String> instanceIds; 
        private String param; 
        private String regionId; 
        private String taskName; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(CreateBatchTaskRequest request) {
            super(request);
            this.applicationType = request.applicationType;
            this.instanceIds = request.instanceIds;
            this.param = request.param;
            this.regionId = request.regionId;
            this.taskName = request.taskName;
            this.taskType = request.taskType;
        } 

        /**
         * ApplicationType.
         */
        public Builder applicationType(String applicationType) {
            this.putQueryParameter("ApplicationType", applicationType);
            this.applicationType = applicationType;
            return this;
        }

        /**
         * <p>The instance IDs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            String instanceIdsShrink = shrink(instanceIds, "InstanceIds", "json");
            this.putQueryParameter("InstanceIds", instanceIdsShrink);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The task parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;skillName&quot;:&quot;github&quot;,&quot;version&quot;:&quot;1.0.0&quot;},{&quot;skillName&quot;:&quot;skill-vetter&quot;,&quot;version&quot;:&quot;1.0.1&quot;}]</p>
         */
        public Builder param(String param) {
            this.putQueryParameter("Param", param);
            this.param = param;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query the regions of all clusters in your account.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
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
         * <p>The name of the batch task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>batch_task_test</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>The task type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>polarclaw_install_skills</p>
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public CreateBatchTaskRequest build() {
            return new CreateBatchTaskRequest(this);
        } 

    } 

}
