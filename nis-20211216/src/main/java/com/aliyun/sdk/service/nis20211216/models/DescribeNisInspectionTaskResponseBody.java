// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

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
 * {@link DescribeNisInspectionTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNisInspectionTaskResponseBody</p>
 */
public class DescribeNisInspectionTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CheckResourceList")
    private java.util.List<CheckResourceList> checkResourceList;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("InspectionInterval")
    private String inspectionInterval;

    @com.aliyun.core.annotation.NameInMap("InspectionName")
    private String inspectionName;

    @com.aliyun.core.annotation.NameInMap("InspectionProject")
    private String inspectionProject;

    @com.aliyun.core.annotation.NameInMap("InspectionTaskId")
    private String inspectionTaskId;

    @com.aliyun.core.annotation.NameInMap("InspectionTriggerTime")
    private String inspectionTriggerTime;

    @com.aliyun.core.annotation.NameInMap("LastUpdateReportId")
    private String lastUpdateReportId;

    @com.aliyun.core.annotation.NameInMap("LastUpdateTime")
    private String lastUpdateTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeNisInspectionTaskResponseBody(Builder builder) {
        this.checkResourceList = builder.checkResourceList;
        this.createTime = builder.createTime;
        this.inspectionInterval = builder.inspectionInterval;
        this.inspectionName = builder.inspectionName;
        this.inspectionProject = builder.inspectionProject;
        this.inspectionTaskId = builder.inspectionTaskId;
        this.inspectionTriggerTime = builder.inspectionTriggerTime;
        this.lastUpdateReportId = builder.lastUpdateReportId;
        this.lastUpdateTime = builder.lastUpdateTime;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNisInspectionTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkResourceList
     */
    public java.util.List<CheckResourceList> getCheckResourceList() {
        return this.checkResourceList;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return inspectionInterval
     */
    public String getInspectionInterval() {
        return this.inspectionInterval;
    }

    /**
     * @return inspectionName
     */
    public String getInspectionName() {
        return this.inspectionName;
    }

    /**
     * @return inspectionProject
     */
    public String getInspectionProject() {
        return this.inspectionProject;
    }

    /**
     * @return inspectionTaskId
     */
    public String getInspectionTaskId() {
        return this.inspectionTaskId;
    }

    /**
     * @return inspectionTriggerTime
     */
    public String getInspectionTriggerTime() {
        return this.inspectionTriggerTime;
    }

    /**
     * @return lastUpdateReportId
     */
    public String getLastUpdateReportId() {
        return this.lastUpdateReportId;
    }

    /**
     * @return lastUpdateTime
     */
    public String getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private java.util.List<CheckResourceList> checkResourceList; 
        private String createTime; 
        private String inspectionInterval; 
        private String inspectionName; 
        private String inspectionProject; 
        private String inspectionTaskId; 
        private String inspectionTriggerTime; 
        private String lastUpdateReportId; 
        private String lastUpdateTime; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(DescribeNisInspectionTaskResponseBody model) {
            this.checkResourceList = model.checkResourceList;
            this.createTime = model.createTime;
            this.inspectionInterval = model.inspectionInterval;
            this.inspectionName = model.inspectionName;
            this.inspectionProject = model.inspectionProject;
            this.inspectionTaskId = model.inspectionTaskId;
            this.inspectionTriggerTime = model.inspectionTriggerTime;
            this.lastUpdateReportId = model.lastUpdateReportId;
            this.lastUpdateTime = model.lastUpdateTime;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * CheckResourceList.
         */
        public Builder checkResourceList(java.util.List<CheckResourceList> checkResourceList) {
            this.checkResourceList = checkResourceList;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * InspectionInterval.
         */
        public Builder inspectionInterval(String inspectionInterval) {
            this.inspectionInterval = inspectionInterval;
            return this;
        }

        /**
         * InspectionName.
         */
        public Builder inspectionName(String inspectionName) {
            this.inspectionName = inspectionName;
            return this;
        }

        /**
         * InspectionProject.
         */
        public Builder inspectionProject(String inspectionProject) {
            this.inspectionProject = inspectionProject;
            return this;
        }

        /**
         * InspectionTaskId.
         */
        public Builder inspectionTaskId(String inspectionTaskId) {
            this.inspectionTaskId = inspectionTaskId;
            return this;
        }

        /**
         * InspectionTriggerTime.
         */
        public Builder inspectionTriggerTime(String inspectionTriggerTime) {
            this.inspectionTriggerTime = inspectionTriggerTime;
            return this;
        }

        /**
         * LastUpdateReportId.
         */
        public Builder lastUpdateReportId(String lastUpdateReportId) {
            this.lastUpdateReportId = lastUpdateReportId;
            return this;
        }

        /**
         * LastUpdateTime.
         */
        public Builder lastUpdateTime(String lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeNisInspectionTaskResponseBody build() {
            return new DescribeNisInspectionTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNisInspectionTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNisInspectionTaskResponseBody</p>
     */
    public static class CheckResourceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckScope")
        private String checkScope;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private CheckResourceList(Builder builder) {
            this.checkScope = builder.checkScope;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckResourceList create() {
            return builder().build();
        }

        /**
         * @return checkScope
         */
        public String getCheckScope() {
            return this.checkScope;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String checkScope; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(CheckResourceList model) {
                this.checkScope = model.checkScope;
                this.resourceType = model.resourceType;
            } 

            /**
             * CheckScope.
             */
            public Builder checkScope(String checkScope) {
                this.checkScope = checkScope;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public CheckResourceList build() {
                return new CheckResourceList(this);
            } 

        } 

    }
}
