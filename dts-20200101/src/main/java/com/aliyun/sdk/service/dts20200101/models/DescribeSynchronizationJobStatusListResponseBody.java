// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSynchronizationJobStatusListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSynchronizationJobStatusListResponseBody</p>
 */
public class DescribeSynchronizationJobStatusListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("SynchronizationJobListStatusList")
    private java.util.List < SynchronizationJobListStatusList> synchronizationJobListStatusList;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Long totalRecordCount;

    private DescribeSynchronizationJobStatusListResponseBody(Builder builder) {
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.synchronizationJobListStatusList = builder.synchronizationJobListStatusList;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSynchronizationJobStatusListResponseBody create() {
        return builder().build();
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return synchronizationJobListStatusList
     */
    public java.util.List < SynchronizationJobListStatusList> getSynchronizationJobListStatusList() {
        return this.synchronizationJobListStatusList;
    }

    /**
     * @return totalRecordCount
     */
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private String errCode; 
        private String errMessage; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private String success; 
        private java.util.List < SynchronizationJobListStatusList> synchronizationJobListStatusList; 
        private Long totalRecordCount; 

        /**
         * The error code returned if the call failed.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * The error message returned if the call failed.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
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
         * The number of data synchronization instances displayed on one page.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * Indicates whether the call was successful.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * The status of the data synchronization tasks.
         */
        public Builder synchronizationJobListStatusList(java.util.List < SynchronizationJobListStatusList> synchronizationJobListStatusList) {
            this.synchronizationJobListStatusList = synchronizationJobListStatusList;
            return this;
        }

        /**
         * The total number of data synchronization instances.
         */
        public Builder totalRecordCount(Long totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeSynchronizationJobStatusListResponseBody build() {
            return new DescribeSynchronizationJobStatusListResponseBody(this);
        } 

    } 

    public static class SynchronizationDirectionInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Checkpoint")
        private String checkpoint;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SynchronizationDirection")
        private String synchronizationDirection;

        private SynchronizationDirectionInfoList(Builder builder) {
            this.checkpoint = builder.checkpoint;
            this.status = builder.status;
            this.synchronizationDirection = builder.synchronizationDirection;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SynchronizationDirectionInfoList create() {
            return builder().build();
        }

        /**
         * @return checkpoint
         */
        public String getCheckpoint() {
            return this.checkpoint;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return synchronizationDirection
         */
        public String getSynchronizationDirection() {
            return this.synchronizationDirection;
        }

        public static final class Builder {
            private String checkpoint; 
            private String status; 
            private String synchronizationDirection; 

            /**
             * The UNIX timestamp generated when the latest data record was synchronized.
             * <p>
             * 
             * >  You can use a search engine to obtain a UNIX timestamp converter.
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * The status of the data synchronization task in this direction. Valid values:
             * <p>
             * 
             * *   **NotStarted**: The task is not started.
             * *   **Prechecking**: The task is being prechecked.
             * *   **PrecheckFailed**: The task failed to pass the precheck.
             * *   **Initializing**: The task is performing initial synchronization.
             * *   **InitializeFailed**: Initial synchronization failed.
             * *   **Synchronizing**: The task is synchronizing data.
             * *   **Failed**: The task failed to synchronize data.
             * *   **Suspending**: The task is paused.
             * *   **Modifying**: The objects in the task are being modified.
             * *   **Finished**: The task is completed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The synchronization direction. Valid values:
             * <p>
             * 
             * *   **Forward**
             * *   **Reverse**
             */
            public Builder synchronizationDirection(String synchronizationDirection) {
                this.synchronizationDirection = synchronizationDirection;
                return this;
            }

            public SynchronizationDirectionInfoList build() {
                return new SynchronizationDirectionInfoList(this);
            } 

        } 

    }
    public static class SynchronizationJobListStatusList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SynchronizationDirectionInfoList")
        private java.util.List < SynchronizationDirectionInfoList> synchronizationDirectionInfoList;

        @com.aliyun.core.annotation.NameInMap("SynchronizationJobId")
        private String synchronizationJobId;

        private SynchronizationJobListStatusList(Builder builder) {
            this.synchronizationDirectionInfoList = builder.synchronizationDirectionInfoList;
            this.synchronizationJobId = builder.synchronizationJobId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SynchronizationJobListStatusList create() {
            return builder().build();
        }

        /**
         * @return synchronizationDirectionInfoList
         */
        public java.util.List < SynchronizationDirectionInfoList> getSynchronizationDirectionInfoList() {
            return this.synchronizationDirectionInfoList;
        }

        /**
         * @return synchronizationJobId
         */
        public String getSynchronizationJobId() {
            return this.synchronizationJobId;
        }

        public static final class Builder {
            private java.util.List < SynchronizationDirectionInfoList> synchronizationDirectionInfoList; 
            private String synchronizationJobId; 

            /**
             * The details of data synchronization tasks in each direction.
             */
            public Builder synchronizationDirectionInfoList(java.util.List < SynchronizationDirectionInfoList> synchronizationDirectionInfoList) {
                this.synchronizationDirectionInfoList = synchronizationDirectionInfoList;
                return this;
            }

            /**
             * The ID of the data synchronization instance.
             */
            public Builder synchronizationJobId(String synchronizationJobId) {
                this.synchronizationJobId = synchronizationJobId;
                return this;
            }

            public SynchronizationJobListStatusList build() {
                return new SynchronizationJobListStatusList(this);
            } 

        } 

    }
}
