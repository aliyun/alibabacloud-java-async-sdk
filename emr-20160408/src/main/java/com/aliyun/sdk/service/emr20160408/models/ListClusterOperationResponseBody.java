// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterOperationResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterOperationResponseBody</p>
 */
public class ListClusterOperationResponseBody extends TeaModel {
    @NameInMap("ClusterOperationList")
    private ClusterOperationList clusterOperationList;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListClusterOperationResponseBody(Builder builder) {
        this.clusterOperationList = builder.clusterOperationList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterOperationResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterOperationList
     */
    public ClusterOperationList getClusterOperationList() {
        return this.clusterOperationList;
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
        private ClusterOperationList clusterOperationList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * ClusterOperationList.
         */
        public Builder clusterOperationList(ClusterOperationList clusterOperationList) {
            this.clusterOperationList = clusterOperationList;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

        public ListClusterOperationResponseBody build() {
            return new ListClusterOperationResponseBody(this);
        } 

    } 

    public static class ClusterOperation extends TeaModel {
        @NameInMap("Comment")
        private String comment;

        @NameInMap("Duration")
        private String duration;

        @NameInMap("OperationId")
        private String operationId;

        @NameInMap("OperationName")
        private String operationName;

        @NameInMap("Percentage")
        private String percentage;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        private ClusterOperation(Builder builder) {
            this.comment = builder.comment;
            this.duration = builder.duration;
            this.operationId = builder.operationId;
            this.operationName = builder.operationName;
            this.percentage = builder.percentage;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterOperation create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return operationId
         */
        public String getOperationId() {
            return this.operationId;
        }

        /**
         * @return operationName
         */
        public String getOperationName() {
            return this.operationName;
        }

        /**
         * @return percentage
         */
        public String getPercentage() {
            return this.percentage;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String comment; 
            private String duration; 
            private String operationId; 
            private String operationName; 
            private String percentage; 
            private String startTime; 
            private String status; 

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * OperationId.
             */
            public Builder operationId(String operationId) {
                this.operationId = operationId;
                return this;
            }

            /**
             * OperationName.
             */
            public Builder operationName(String operationName) {
                this.operationName = operationName;
                return this;
            }

            /**
             * Percentage.
             */
            public Builder percentage(String percentage) {
                this.percentage = percentage;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ClusterOperation build() {
                return new ClusterOperation(this);
            } 

        } 

    }
    public static class ClusterOperationList extends TeaModel {
        @NameInMap("ClusterOperation")
        private java.util.List < ClusterOperation> clusterOperation;

        private ClusterOperationList(Builder builder) {
            this.clusterOperation = builder.clusterOperation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterOperationList create() {
            return builder().build();
        }

        /**
         * @return clusterOperation
         */
        public java.util.List < ClusterOperation> getClusterOperation() {
            return this.clusterOperation;
        }

        public static final class Builder {
            private java.util.List < ClusterOperation> clusterOperation; 

            /**
             * ClusterOperation.
             */
            public Builder clusterOperation(java.util.List < ClusterOperation> clusterOperation) {
                this.clusterOperation = clusterOperation;
                return this;
            }

            public ClusterOperationList build() {
                return new ClusterOperationList(this);
            } 

        } 

    }
}
