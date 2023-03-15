// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListChangeSetsResponseBody} extends {@link TeaModel}
 *
 * <p>ListChangeSetsResponseBody</p>
 */
public class ListChangeSetsResponseBody extends TeaModel {
    @NameInMap("ChangeSets")
    private java.util.List < ChangeSets> changeSets;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListChangeSetsResponseBody(Builder builder) {
        this.changeSets = builder.changeSets;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChangeSetsResponseBody create() {
        return builder().build();
    }

    /**
     * @return changeSets
     */
    public java.util.List < ChangeSets> getChangeSets() {
        return this.changeSets;
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
        private java.util.List < ChangeSets> changeSets; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The list of change sets.
         */
        public Builder changeSets(java.util.List < ChangeSets> changeSets) {
            this.changeSets = changeSets;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of queried entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListChangeSetsResponseBody build() {
            return new ListChangeSetsResponseBody(this);
        } 

    } 

    public static class ChangeSets extends TeaModel {
        @NameInMap("ChangeSetId")
        private String changeSetId;

        @NameInMap("ChangeSetName")
        private String changeSetName;

        @NameInMap("ChangeSetType")
        private String changeSetType;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("ExecutionStatus")
        private String executionStatus;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("StackId")
        private String stackId;

        @NameInMap("StackName")
        private String stackName;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusReason")
        private String statusReason;

        private ChangeSets(Builder builder) {
            this.changeSetId = builder.changeSetId;
            this.changeSetName = builder.changeSetName;
            this.changeSetType = builder.changeSetType;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.executionStatus = builder.executionStatus;
            this.regionId = builder.regionId;
            this.stackId = builder.stackId;
            this.stackName = builder.stackName;
            this.status = builder.status;
            this.statusReason = builder.statusReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeSets create() {
            return builder().build();
        }

        /**
         * @return changeSetId
         */
        public String getChangeSetId() {
            return this.changeSetId;
        }

        /**
         * @return changeSetName
         */
        public String getChangeSetName() {
            return this.changeSetName;
        }

        /**
         * @return changeSetType
         */
        public String getChangeSetType() {
            return this.changeSetType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return executionStatus
         */
        public String getExecutionStatus() {
            return this.executionStatus;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return stackId
         */
        public String getStackId() {
            return this.stackId;
        }

        /**
         * @return stackName
         */
        public String getStackName() {
            return this.stackName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusReason
         */
        public String getStatusReason() {
            return this.statusReason;
        }

        public static final class Builder {
            private String changeSetId; 
            private String changeSetName; 
            private String changeSetType; 
            private String createTime; 
            private String description; 
            private String executionStatus; 
            private String regionId; 
            private String stackId; 
            private String stackName; 
            private String status; 
            private String statusReason; 

            /**
             * The ID of the change set.
             */
            public Builder changeSetId(String changeSetId) {
                this.changeSetId = changeSetId;
                return this;
            }

            /**
             * The name of the change set.
             */
            public Builder changeSetName(String changeSetName) {
                this.changeSetName = changeSetName;
                return this;
            }

            /**
             * The type of the change set.
             */
            public Builder changeSetType(String changeSetType) {
                this.changeSetType = changeSetType;
                return this;
            }

            /**
             * The time when the change set was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the change set.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The execution status of the change set.
             */
            public Builder executionStatus(String executionStatus) {
                this.executionStatus = executionStatus;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the stack with which the change set is associated.
             */
            public Builder stackId(String stackId) {
                this.stackId = stackId;
                return this;
            }

            /**
             * The name of the stack with which the change set is associated.
             */
            public Builder stackName(String stackName) {
                this.stackName = stackName;
                return this;
            }

            /**
             * The status of the change set.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The reason why the change set is in its current status.
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            public ChangeSets build() {
                return new ChangeSets(this);
            } 

        } 

    }
}
