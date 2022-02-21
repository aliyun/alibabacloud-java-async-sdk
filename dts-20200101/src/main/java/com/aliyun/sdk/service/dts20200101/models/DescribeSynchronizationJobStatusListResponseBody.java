// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSynchronizationJobStatusListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSynchronizationJobStatusListResponseBody</p>
 */
public class DescribeSynchronizationJobStatusListResponseBody extends TeaModel {
    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    @NameInMap("SynchronizationJobListStatusList")
    private java.util.List < SynchronizationJobListStatusList> synchronizationJobListStatusList;

    @NameInMap("TotalRecordCount")
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
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
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
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * SynchronizationJobListStatusList.
         */
        public Builder synchronizationJobListStatusList(java.util.List < SynchronizationJobListStatusList> synchronizationJobListStatusList) {
            this.synchronizationJobListStatusList = synchronizationJobListStatusList;
            return this;
        }

        /**
         * TotalRecordCount.
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
        @NameInMap("Checkpoint")
        private String checkpoint;

        @NameInMap("Status")
        private String status;

        @NameInMap("SynchronizationDirection")
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
             * Checkpoint.
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SynchronizationDirection.
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
        @NameInMap("SynchronizationDirectionInfoList")
        private java.util.List < SynchronizationDirectionInfoList> synchronizationDirectionInfoList;

        @NameInMap("SynchronizationJobId")
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
             * SynchronizationDirectionInfoList.
             */
            public Builder synchronizationDirectionInfoList(java.util.List < SynchronizationDirectionInfoList> synchronizationDirectionInfoList) {
                this.synchronizationDirectionInfoList = synchronizationDirectionInfoList;
                return this;
            }

            /**
             * SynchronizationJobId.
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
