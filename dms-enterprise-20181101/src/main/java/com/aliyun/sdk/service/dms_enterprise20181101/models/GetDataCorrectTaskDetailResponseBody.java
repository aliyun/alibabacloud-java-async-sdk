// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataCorrectTaskDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataCorrectTaskDetailResponseBody</p>
 */
public class GetDataCorrectTaskDetailResponseBody extends TeaModel {
    @NameInMap("DataCorrectTaskDetail")
    private DataCorrectTaskDetail dataCorrectTaskDetail;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetDataCorrectTaskDetailResponseBody(Builder builder) {
        this.dataCorrectTaskDetail = builder.dataCorrectTaskDetail;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataCorrectTaskDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataCorrectTaskDetail
     */
    public DataCorrectTaskDetail getDataCorrectTaskDetail() {
        return this.dataCorrectTaskDetail;
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

    public static final class Builder {
        private DataCorrectTaskDetail dataCorrectTaskDetail; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * DataCorrectTaskDetail.
         */
        public Builder dataCorrectTaskDetail(DataCorrectTaskDetail dataCorrectTaskDetail) {
            this.dataCorrectTaskDetail = dataCorrectTaskDetail;
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

        public GetDataCorrectTaskDetailResponseBody build() {
            return new GetDataCorrectTaskDetailResponseBody(this);
        } 

    } 

    public static class DataCorrectTaskDetail extends TeaModel {
        @NameInMap("ActualAffectRows")
        private Long actualAffectRows;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DBTaskGroupId")
        private Long DBTaskGroupId;

        @NameInMap("jobStatus")
        private String jobStatus;

        private DataCorrectTaskDetail(Builder builder) {
            this.actualAffectRows = builder.actualAffectRows;
            this.createTime = builder.createTime;
            this.DBTaskGroupId = builder.DBTaskGroupId;
            this.jobStatus = builder.jobStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataCorrectTaskDetail create() {
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

            public DataCorrectTaskDetail build() {
                return new DataCorrectTaskDetail(this);
            } 

        } 

    }
}
