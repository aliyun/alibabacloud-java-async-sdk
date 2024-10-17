// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDataCorrectTaskDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataCorrectTaskDetailResponseBody</p>
 */
public class GetDataCorrectTaskDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataCorrectTaskDetail")
    private DataCorrectTaskDetail dataCorrectTaskDetail;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The details of the data change task.</p>
         */
        public Builder dataCorrectTaskDetail(DataCorrectTaskDetail dataCorrectTaskDetail) {
            this.dataCorrectTaskDetail = dataCorrectTaskDetail;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B5FD0BC8-2D90-4478-B8EC-A0E92E0B1773</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDataCorrectTaskDetailResponseBody build() {
            return new GetDataCorrectTaskDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataCorrectTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataCorrectTaskDetailResponseBody</p>
     */
    public static class DataCorrectTaskDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualAffectRows")
        private Long actualAffectRows;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DBTaskGroupId")
        private Long DBTaskGroupId;

        @com.aliyun.core.annotation.NameInMap("jobStatus")
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
             * <p>The number of rows affected by the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder actualAffectRows(Long actualAffectRows) {
                this.actualAffectRows = actualAffectRows;
                return this;
            }

            /**
             * <p>The time when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-05 15:08:55</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the SQL task group.</p>
             * 
             * <strong>example:</strong>
             * <p>1234235</p>
             */
            public Builder DBTaskGroupId(Long DBTaskGroupId) {
                this.DBTaskGroupId = DBTaskGroupId;
                return this;
            }

            /**
             * <p>The state of the SQL task. Valid values:</p>
             * <ul>
             * <li><strong>INIT</strong>: The SQL task was initialized.</li>
             * <li><strong>PENDING</strong>: The SQL task waited to be run.</li>
             * <li><strong>BE_SCHEDULED</strong>: The SQL task waited to be scheduled.</li>
             * <li><strong>FAIL</strong>: The SQL task failed.</li>
             * <li><strong>SUCCESS</strong>: The SQL task was successful.</li>
             * <li><strong>PAUSE</strong>: The SQL task was paused.</li>
             * <li><strong>DELETE</strong>: The SQL task was deleted.</li>
             * <li><strong>RUNNING</strong>: The SQL task was being run.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
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
