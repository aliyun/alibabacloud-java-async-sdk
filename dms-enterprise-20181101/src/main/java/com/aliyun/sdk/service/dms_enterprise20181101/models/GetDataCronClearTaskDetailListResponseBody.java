// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataCronClearTaskDetailListResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataCronClearTaskDetailListResponseBody</p>
 */
public class GetDataCronClearTaskDetailListResponseBody extends TeaModel {
    @NameInMap("DataCronClearTaskDetailList")
    private java.util.List < DataCronClearTaskDetailList> dataCronClearTaskDetailList;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    private GetDataCronClearTaskDetailListResponseBody(Builder builder) {
        this.dataCronClearTaskDetailList = builder.dataCronClearTaskDetailList;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataCronClearTaskDetailListResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataCronClearTaskDetailList
     */
    public java.util.List < DataCronClearTaskDetailList> getDataCronClearTaskDetailList() {
        return this.dataCronClearTaskDetailList;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < DataCronClearTaskDetailList> dataCronClearTaskDetailList; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * DataCronClearTaskDetailList.
         */
        public Builder dataCronClearTaskDetailList(java.util.List < DataCronClearTaskDetailList> dataCronClearTaskDetailList) {
            this.dataCronClearTaskDetailList = dataCronClearTaskDetailList;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetDataCronClearTaskDetailListResponseBody build() {
            return new GetDataCronClearTaskDetailListResponseBody(this);
        } 

    } 

    public static class DataCronClearTaskDetailList extends TeaModel {
        @NameInMap("ActualAffectRows")
        private Long actualAffectRows;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DBTaskGroupId")
        private Long DBTaskGroupId;

        @NameInMap("jobStatus")
        private String jobStatus;

        private DataCronClearTaskDetailList(Builder builder) {
            this.actualAffectRows = builder.actualAffectRows;
            this.createTime = builder.createTime;
            this.DBTaskGroupId = builder.DBTaskGroupId;
            this.jobStatus = builder.jobStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataCronClearTaskDetailList create() {
            return builder().build();
        }

        /**
         * @return actualAffectRows
         */
        public Long getActualAffectRows() {
            return this.actualAffectRows;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return DBTaskGroupId
         */
        public Long getDBTaskGroupId() {
            return this.DBTaskGroupId;
        }

        /**
         * @return jobStatus
         */
        public String getJobStatus() {
            return this.jobStatus;
        }

        public static final class Builder {
            private Long actualAffectRows; 
            private String createTime; 
            private Long DBTaskGroupId; 
            private String jobStatus; 

            /**
             * ActualAffectRows.
             */
            public Builder actualAffectRows(Long actualAffectRows) {
                this.actualAffectRows = actualAffectRows;
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
             * DBTaskGroupId.
             */
            public Builder DBTaskGroupId(Long DBTaskGroupId) {
                this.DBTaskGroupId = DBTaskGroupId;
                return this;
            }

            /**
             * jobStatus.
             */
            public Builder jobStatus(String jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            public DataCronClearTaskDetailList build() {
                return new DataCronClearTaskDetailList(this);
            } 

        } 

    }
}
