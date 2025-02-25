// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link GetDataCronClearTaskDetailListResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataCronClearTaskDetailListResponseBody</p>
 */
public class GetDataCronClearTaskDetailListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataCronClearTaskDetailList")
    private java.util.List<DataCronClearTaskDetailList> dataCronClearTaskDetailList;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
    public java.util.List<DataCronClearTaskDetailList> getDataCronClearTaskDetailList() {
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
        private java.util.List<DataCronClearTaskDetailList> dataCronClearTaskDetailList; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * <p>The historical data cleansing tasks</p>
         */
        public Builder dataCronClearTaskDetailList(java.util.List<DataCronClearTaskDetailList> dataCronClearTaskDetailList) {
            this.dataCronClearTaskDetailList = dataCronClearTaskDetailList;
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
         * <p>C1D39814-9808-47F8-AFE0-AF167239AC9B</p>
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

        /**
         * <p>The total number of SQL tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetDataCronClearTaskDetailListResponseBody build() {
            return new GetDataCronClearTaskDetailListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataCronClearTaskDetailListResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataCronClearTaskDetailListResponseBody</p>
     */
    public static class DataCronClearTaskDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualAffectRows")
        private Long actualAffectRows;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DBTaskGroupId")
        private Long DBTaskGroupId;

        @com.aliyun.core.annotation.NameInMap("jobStatus")
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
             * <p>The number of rows affected by the SQL task.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder actualAffectRows(Long actualAffectRows) {
                this.actualAffectRows = actualAffectRows;
                return this;
            }

            /**
             * <p>The time when the SQL task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-14 10:00:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the SQL task group.</p>
             * 
             * <strong>example:</strong>
             * <p>432523</p>
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

            public DataCronClearTaskDetailList build() {
                return new DataCronClearTaskDetailList(this);
            } 

        } 

    }
}
