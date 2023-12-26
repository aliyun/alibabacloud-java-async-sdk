// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutoSnapshotTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutoSnapshotTasksResponseBody</p>
 */
public class DescribeAutoSnapshotTasksResponseBody extends TeaModel {
    @NameInMap("AutoSnapshotTasks")
    private AutoSnapshotTasks autoSnapshotTasks;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAutoSnapshotTasksResponseBody(Builder builder) {
        this.autoSnapshotTasks = builder.autoSnapshotTasks;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutoSnapshotTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return autoSnapshotTasks
     */
    public AutoSnapshotTasks getAutoSnapshotTasks() {
        return this.autoSnapshotTasks;
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
        private AutoSnapshotTasks autoSnapshotTasks; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The queried automatic snapshot tasks.
         */
        public Builder autoSnapshotTasks(AutoSnapshotTasks autoSnapshotTasks) {
            this.autoSnapshotTasks = autoSnapshotTasks;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of automatic snapshot tasks.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAutoSnapshotTasksResponseBody build() {
            return new DescribeAutoSnapshotTasksResponseBody(this);
        } 

    } 

    public static class AutoSnapshotTask extends TeaModel {
        @NameInMap("AutoSnapshotPolicyId")
        private String autoSnapshotPolicyId;

        @NameInMap("SourceFileSystemId")
        private String sourceFileSystemId;

        private AutoSnapshotTask(Builder builder) {
            this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
            this.sourceFileSystemId = builder.sourceFileSystemId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoSnapshotTask create() {
            return builder().build();
        }

        /**
         * @return autoSnapshotPolicyId
         */
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        /**
         * @return sourceFileSystemId
         */
        public String getSourceFileSystemId() {
            return this.sourceFileSystemId;
        }

        public static final class Builder {
            private String autoSnapshotPolicyId; 
            private String sourceFileSystemId; 

            /**
             * The ID of the automatic snapshot policy.
             */
            public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
                this.autoSnapshotPolicyId = autoSnapshotPolicyId;
                return this;
            }

            /**
             * The ID of the file system.
             */
            public Builder sourceFileSystemId(String sourceFileSystemId) {
                this.sourceFileSystemId = sourceFileSystemId;
                return this;
            }

            public AutoSnapshotTask build() {
                return new AutoSnapshotTask(this);
            } 

        } 

    }
    public static class AutoSnapshotTasks extends TeaModel {
        @NameInMap("AutoSnapshotTask")
        private java.util.List < AutoSnapshotTask> autoSnapshotTask;

        private AutoSnapshotTasks(Builder builder) {
            this.autoSnapshotTask = builder.autoSnapshotTask;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoSnapshotTasks create() {
            return builder().build();
        }

        /**
         * @return autoSnapshotTask
         */
        public java.util.List < AutoSnapshotTask> getAutoSnapshotTask() {
            return this.autoSnapshotTask;
        }

        public static final class Builder {
            private java.util.List < AutoSnapshotTask> autoSnapshotTask; 

            /**
             * AutoSnapshotTask.
             */
            public Builder autoSnapshotTask(java.util.List < AutoSnapshotTask> autoSnapshotTask) {
                this.autoSnapshotTask = autoSnapshotTask;
                return this;
            }

            public AutoSnapshotTasks build() {
                return new AutoSnapshotTasks(this);
            } 

        } 

    }
}
