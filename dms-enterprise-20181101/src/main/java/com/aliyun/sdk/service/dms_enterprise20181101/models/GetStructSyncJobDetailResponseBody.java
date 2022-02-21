// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStructSyncJobDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetStructSyncJobDetailResponseBody</p>
 */
public class GetStructSyncJobDetailResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StructSyncJobDetail")
    private StructSyncJobDetail structSyncJobDetail;

    @NameInMap("Success")
    private Boolean success;

    private GetStructSyncJobDetailResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.structSyncJobDetail = builder.structSyncJobDetail;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStructSyncJobDetailResponseBody create() {
        return builder().build();
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
     * @return structSyncJobDetail
     */
    public StructSyncJobDetail getStructSyncJobDetail() {
        return this.structSyncJobDetail;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private StructSyncJobDetail structSyncJobDetail; 
        private Boolean success; 

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
         * StructSyncJobDetail.
         */
        public Builder structSyncJobDetail(StructSyncJobDetail structSyncJobDetail) {
            this.structSyncJobDetail = structSyncJobDetail;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetStructSyncJobDetailResponseBody build() {
            return new GetStructSyncJobDetailResponseBody(this);
        } 

    } 

    public static class StructSyncJobDetail extends TeaModel {
        @NameInMap("DBTaskGroupId")
        private Long DBTaskGroupId;

        @NameInMap("ExecuteCount")
        private Long executeCount;

        @NameInMap("JobStatus")
        private String jobStatus;

        @NameInMap("Message")
        private String message;

        @NameInMap("SecurityRule")
        private String securityRule;

        @NameInMap("SqlCount")
        private Long sqlCount;

        @NameInMap("TableAnalyzed")
        private Long tableAnalyzed;

        @NameInMap("TableCount")
        private Long tableCount;

        private StructSyncJobDetail(Builder builder) {
            this.DBTaskGroupId = builder.DBTaskGroupId;
            this.executeCount = builder.executeCount;
            this.jobStatus = builder.jobStatus;
            this.message = builder.message;
            this.securityRule = builder.securityRule;
            this.sqlCount = builder.sqlCount;
            this.tableAnalyzed = builder.tableAnalyzed;
            this.tableCount = builder.tableCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StructSyncJobDetail create() {
            return builder().build();
        }

        /**
         * @return DBTaskGroupId
         */
        public Long getDBTaskGroupId() {
            return this.DBTaskGroupId;
        }

        /**
         * @return executeCount
         */
        public Long getExecuteCount() {
            return this.executeCount;
        }

        /**
         * @return jobStatus
         */
        public String getJobStatus() {
            return this.jobStatus;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return securityRule
         */
        public String getSecurityRule() {
            return this.securityRule;
        }

        /**
         * @return sqlCount
         */
        public Long getSqlCount() {
            return this.sqlCount;
        }

        /**
         * @return tableAnalyzed
         */
        public Long getTableAnalyzed() {
            return this.tableAnalyzed;
        }

        /**
         * @return tableCount
         */
        public Long getTableCount() {
            return this.tableCount;
        }

        public static final class Builder {
            private Long DBTaskGroupId; 
            private Long executeCount; 
            private String jobStatus; 
            private String message; 
            private String securityRule; 
            private Long sqlCount; 
            private Long tableAnalyzed; 
            private Long tableCount; 

            /**
             * DBTaskGroupId.
             */
            public Builder DBTaskGroupId(Long DBTaskGroupId) {
                this.DBTaskGroupId = DBTaskGroupId;
                return this;
            }

            /**
             * ExecuteCount.
             */
            public Builder executeCount(Long executeCount) {
                this.executeCount = executeCount;
                return this;
            }

            /**
             * JobStatus.
             */
            public Builder jobStatus(String jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * SecurityRule.
             */
            public Builder securityRule(String securityRule) {
                this.securityRule = securityRule;
                return this;
            }

            /**
             * SqlCount.
             */
            public Builder sqlCount(Long sqlCount) {
                this.sqlCount = sqlCount;
                return this;
            }

            /**
             * TableAnalyzed.
             */
            public Builder tableAnalyzed(Long tableAnalyzed) {
                this.tableAnalyzed = tableAnalyzed;
                return this;
            }

            /**
             * TableCount.
             */
            public Builder tableCount(Long tableCount) {
                this.tableCount = tableCount;
                return this;
            }

            public StructSyncJobDetail build() {
                return new StructSyncJobDetail(this);
            } 

        } 

    }
}
