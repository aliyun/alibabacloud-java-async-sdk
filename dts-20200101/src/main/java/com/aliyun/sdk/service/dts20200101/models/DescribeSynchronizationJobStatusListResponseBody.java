// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
    private java.util.List<SynchronizationJobListStatusList> synchronizationJobListStatusList;

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
    public java.util.List<SynchronizationJobListStatusList> getSynchronizationJobListStatusList() {
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
        private java.util.List<SynchronizationJobListStatusList> synchronizationJobListStatusList; 
        private Long totalRecordCount; 

        /**
         * <p>The error code returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The request processing has failed due to some unknown error.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of data synchronization instances displayed on one page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1413460B-138A-48D1-836C-B24EDDC1****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The status of the data synchronization tasks.</p>
         */
        public Builder synchronizationJobListStatusList(java.util.List<SynchronizationJobListStatusList> synchronizationJobListStatusList) {
            this.synchronizationJobListStatusList = synchronizationJobListStatusList;
            return this;
        }

        /**
         * <p>The total number of data synchronization instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalRecordCount(Long totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeSynchronizationJobStatusListResponseBody build() {
            return new DescribeSynchronizationJobStatusListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSynchronizationJobStatusListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSynchronizationJobStatusListResponseBody</p>
     */
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
             * <p>The UNIX timestamp generated when the latest data record was synchronized.</p>
             * <blockquote>
             * <p> You can use a search engine to obtain a UNIX timestamp converter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1610524452</p>
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * <p>The status of the data synchronization task in this direction. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: The task is not started.</li>
             * <li><strong>Prechecking</strong>: The task is being prechecked.</li>
             * <li><strong>PrecheckFailed</strong>: The task failed to pass the precheck.</li>
             * <li><strong>Initializing</strong>: The task is performing initial synchronization.</li>
             * <li><strong>InitializeFailed</strong>: Initial synchronization failed.</li>
             * <li><strong>Synchronizing</strong>: The task is synchronizing data.</li>
             * <li><strong>Failed</strong>: The task failed to synchronize data.</li>
             * <li><strong>Suspending</strong>: The task is paused.</li>
             * <li><strong>Modifying</strong>: The objects in the task are being modified.</li>
             * <li><strong>Finished</strong>: The task is completed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>InitializeFailed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The synchronization direction. Valid values:</p>
             * <ul>
             * <li><strong>Forward</strong></li>
             * <li><strong>Reverse</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Forward</p>
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
    /**
     * 
     * {@link DescribeSynchronizationJobStatusListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSynchronizationJobStatusListResponseBody</p>
     */
    public static class SynchronizationJobListStatusList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SynchronizationDirectionInfoList")
        private java.util.List<SynchronizationDirectionInfoList> synchronizationDirectionInfoList;

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
        public java.util.List<SynchronizationDirectionInfoList> getSynchronizationDirectionInfoList() {
            return this.synchronizationDirectionInfoList;
        }

        /**
         * @return synchronizationJobId
         */
        public String getSynchronizationJobId() {
            return this.synchronizationJobId;
        }

        public static final class Builder {
            private java.util.List<SynchronizationDirectionInfoList> synchronizationDirectionInfoList; 
            private String synchronizationJobId; 

            /**
             * <p>The details of data synchronization tasks in each direction.</p>
             */
            public Builder synchronizationDirectionInfoList(java.util.List<SynchronizationDirectionInfoList> synchronizationDirectionInfoList) {
                this.synchronizationDirectionInfoList = synchronizationDirectionInfoList;
                return this;
            }

            /**
             * <p>The ID of the data synchronization instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtsexjk1alb116****</p>
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
