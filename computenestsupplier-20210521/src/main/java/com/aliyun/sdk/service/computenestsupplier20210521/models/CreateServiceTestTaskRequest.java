// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link CreateServiceTestTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceTestTaskRequest</p>
 */
public class CreateServiceTestTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskRegionId")
    private String taskRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TestCaseIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> testCaseIds;

    private CreateServiceTestTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.taskName = builder.taskName;
        this.taskRegionId = builder.taskRegionId;
        this.testCaseIds = builder.testCaseIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceTestTaskRequest create() {
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
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskRegionId
     */
    public String getTaskRegionId() {
        return this.taskRegionId;
    }

    /**
     * @return testCaseIds
     */
    public java.util.List<String> getTestCaseIds() {
        return this.testCaseIds;
    }

    public static final class Builder extends Request.Builder<CreateServiceTestTaskRequest, Builder> {
        private String regionId; 
        private String taskName; 
        private String taskRegionId; 
        private java.util.List<String> testCaseIds; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceTestTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.taskName = request.taskName;
            this.taskRegionId = request.taskRegionId;
            this.testCaseIds = request.testCaseIds;
        } 

        /**
         * <p>The region ID.</p>
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
         * <p>The name of the task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>The Task Execution Region</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder taskRegionId(String taskRegionId) {
            this.putQueryParameter("TaskRegionId", taskRegionId);
            this.taskRegionId = taskRegionId;
            return this;
        }

        /**
         * <p>The service test case ids.</p>
         * <p>This parameter is required.</p>
         */
        public Builder testCaseIds(java.util.List<String> testCaseIds) {
            this.putQueryParameter("TestCaseIds", testCaseIds);
            this.testCaseIds = testCaseIds;
            return this;
        }

        @Override
        public CreateServiceTestTaskRequest build() {
            return new CreateServiceTestTaskRequest(this);
        } 

    } 

}
