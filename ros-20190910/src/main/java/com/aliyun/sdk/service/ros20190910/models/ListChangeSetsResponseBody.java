// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListChangeSetsResponseBody} extends {@link TeaModel}
 *
 * <p>ListChangeSetsResponseBody</p>
 */
public class ListChangeSetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChangeSets")
    private java.util.List < ChangeSets> changeSets;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The change sets.</p>
         */
        public Builder changeSets(java.util.List < ChangeSets> changeSets) {
            this.changeSets = changeSets;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
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
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of change sets returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListChangeSetsResponseBody build() {
            return new ListChangeSetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListChangeSetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListChangeSetsResponseBody</p>
     */
    public static class ChangeSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChangeSetId")
        private String changeSetId;

        @com.aliyun.core.annotation.NameInMap("ChangeSetName")
        private String changeSetName;

        @com.aliyun.core.annotation.NameInMap("ChangeSetType")
        private String changeSetType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExecutionStatus")
        private String executionStatus;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("StackId")
        private String stackId;

        @com.aliyun.core.annotation.NameInMap("StackName")
        private String stackName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusReason")
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
             * <p>The ID of the change set.</p>
             * 
             * <strong>example:</strong>
             * <p>1f6521a4-05af-4975-afe9-bc4b45ad****</p>
             */
            public Builder changeSetId(String changeSetId) {
                this.changeSetId = changeSetId;
                return this;
            }

            /**
             * <p>The name of the change set.</p>
             * 
             * <strong>example:</strong>
             * <p>MyChangeSet</p>
             */
            public Builder changeSetName(String changeSetName) {
                this.changeSetName = changeSetName;
                return this;
            }

            /**
             * <p>The type of the change set.</p>
             * 
             * <strong>example:</strong>
             * <p>UPDATE</p>
             */
            public Builder changeSetType(String changeSetType) {
                this.changeSetType = changeSetType;
                return this;
            }

            /**
             * <p>The time when the change set was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-08-01T05:16:31</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the change set.</p>
             * 
             * <strong>example:</strong>
             * <p>It is a demo.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The execution status of the change set.</p>
             * 
             * <strong>example:</strong>
             * <p>AVAILABLE</p>
             */
            public Builder executionStatus(String executionStatus) {
                this.executionStatus = executionStatus;
                return this;
            }

            /**
             * <p>The region ID of the change set.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the stack with which the change set is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
             */
            public Builder stackId(String stackId) {
                this.stackId = stackId;
                return this;
            }

            /**
             * <p>The name of the stack with which the change set is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>MyStack</p>
             */
            public Builder stackName(String stackName) {
                this.stackName = stackName;
                return this;
            }

            /**
             * <p>The status of the change set.</p>
             * 
             * <strong>example:</strong>
             * <p>CREATE_COMPLETE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The reason why the change set is in its current state.</p>
             * 
             * <strong>example:</strong>
             * <p>too many changes</p>
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
