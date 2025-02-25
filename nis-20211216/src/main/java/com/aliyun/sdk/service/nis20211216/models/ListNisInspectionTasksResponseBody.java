// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNisInspectionTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListNisInspectionTasksResponseBody</p>
 */
public class ListNisInspectionTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InspectionTaskList")
    private java.util.List < InspectionTaskList> inspectionTaskList;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListNisInspectionTasksResponseBody(Builder builder) {
        this.inspectionTaskList = builder.inspectionTaskList;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNisInspectionTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return inspectionTaskList
     */
    public java.util.List < InspectionTaskList> getInspectionTaskList() {
        return this.inspectionTaskList;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < InspectionTaskList> inspectionTaskList; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * InspectionTaskList.
         */
        public Builder inspectionTaskList(java.util.List < InspectionTaskList> inspectionTaskList) {
            this.inspectionTaskList = inspectionTaskList;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListNisInspectionTasksResponseBody build() {
            return new ListNisInspectionTasksResponseBody(this);
        } 

    } 

    public static class InspectionTaskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("InspectionName")
        private String inspectionName;

        @com.aliyun.core.annotation.NameInMap("InspectionProject")
        private String inspectionProject;

        @com.aliyun.core.annotation.NameInMap("InspectionTaskId")
        private String inspectionTaskId;

        @com.aliyun.core.annotation.NameInMap("LastUpdateReportId")
        private String lastUpdateReportId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private InspectionTaskList(Builder builder) {
            this.createTime = builder.createTime;
            this.inspectionName = builder.inspectionName;
            this.inspectionProject = builder.inspectionProject;
            this.inspectionTaskId = builder.inspectionTaskId;
            this.lastUpdateReportId = builder.lastUpdateReportId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InspectionTaskList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return lastUpdateReportId
         */
        public String getLastUpdateReportId() {
            return this.lastUpdateReportId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createTime; 
            private String inspectionName; 
            private String inspectionProject; 
            private String inspectionTaskId; 
            private String lastUpdateReportId; 
            private String status; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * LastUpdateReportId.
             */
            public Builder lastUpdateReportId(String lastUpdateReportId) {
                this.lastUpdateReportId = lastUpdateReportId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public InspectionTaskList build() {
                return new InspectionTaskList(this);
            } 

        } 

    }
}
