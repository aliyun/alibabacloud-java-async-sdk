// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GetIdentityProviderStatusCheckJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetIdentityProviderStatusCheckJobResponseBody</p>
 */
public class GetIdentityProviderStatusCheckJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IdentityProviderStatusCheckJob")
    private IdentityProviderStatusCheckJob identityProviderStatusCheckJob;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetIdentityProviderStatusCheckJobResponseBody(Builder builder) {
        this.identityProviderStatusCheckJob = builder.identityProviderStatusCheckJob;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIdentityProviderStatusCheckJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return identityProviderStatusCheckJob
     */
    public IdentityProviderStatusCheckJob getIdentityProviderStatusCheckJob() {
        return this.identityProviderStatusCheckJob;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private IdentityProviderStatusCheckJob identityProviderStatusCheckJob; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetIdentityProviderStatusCheckJobResponseBody model) {
            this.identityProviderStatusCheckJob = model.identityProviderStatusCheckJob;
            this.requestId = model.requestId;
        } 

        /**
         * IdentityProviderStatusCheckJob.
         */
        public Builder identityProviderStatusCheckJob(IdentityProviderStatusCheckJob identityProviderStatusCheckJob) {
            this.identityProviderStatusCheckJob = identityProviderStatusCheckJob;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetIdentityProviderStatusCheckJobResponseBody build() {
            return new GetIdentityProviderStatusCheckJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetIdentityProviderStatusCheckJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderStatusCheckJobResponseBody</p>
     */
    public static class ErrorReason extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorLevel")
        private String errorLevel;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        private ErrorReason(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorLevel = builder.errorLevel;
            this.errorMessage = builder.errorMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorReason create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorLevel
         */
        public String getErrorLevel() {
            return this.errorLevel;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorLevel; 
            private String errorMessage; 

            private Builder() {
            } 

            private Builder(ErrorReason model) {
                this.errorCode = model.errorCode;
                this.errorLevel = model.errorLevel;
                this.errorMessage = model.errorMessage;
            } 

            /**
             * <p>错误码</p>
             * 
             * <strong>example:</strong>
             * <p>NetworkAccessPointWarning.SingleNetworkAccessPath</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>错误级别</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder errorLevel(String errorLevel) {
                this.errorLevel = errorLevel;
                return this;
            }

            /**
             * <p>错误信息</p>
             * 
             * <strong>example:</strong>
             * <p>There is only one path in the current network access endpoint.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            public ErrorReason build() {
                return new ErrorReason(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIdentityProviderStatusCheckJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderStatusCheckJobResponseBody</p>
     */
    public static class JobCheckItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorReason")
        private ErrorReason errorReason;

        @com.aliyun.core.annotation.NameInMap("MajorCheckItem")
        private String majorCheckItem;

        @com.aliyun.core.annotation.NameInMap("MinorCheckItem")
        private String minorCheckItem;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        private JobCheckItems(Builder builder) {
            this.errorReason = builder.errorReason;
            this.majorCheckItem = builder.majorCheckItem;
            this.minorCheckItem = builder.minorCheckItem;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobCheckItems create() {
            return builder().build();
        }

        /**
         * @return errorReason
         */
        public ErrorReason getErrorReason() {
            return this.errorReason;
        }

        /**
         * @return majorCheckItem
         */
        public String getMajorCheckItem() {
            return this.majorCheckItem;
        }

        /**
         * @return minorCheckItem
         */
        public String getMinorCheckItem() {
            return this.minorCheckItem;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        public static final class Builder {
            private ErrorReason errorReason; 
            private String majorCheckItem; 
            private String minorCheckItem; 
            private String result; 

            private Builder() {
            } 

            private Builder(JobCheckItems model) {
                this.errorReason = model.errorReason;
                this.majorCheckItem = model.majorCheckItem;
                this.minorCheckItem = model.minorCheckItem;
                this.result = model.result;
            } 

            /**
             * <p>错误原因</p>
             */
            public Builder errorReason(ErrorReason errorReason) {
                this.errorReason = errorReason;
                return this;
            }

            /**
             * <p>主要检查项</p>
             * 
             * <strong>example:</strong>
             * <p>network_check</p>
             */
            public Builder majorCheckItem(String majorCheckItem) {
                this.majorCheckItem = majorCheckItem;
                return this;
            }

            /**
             * <p>次要检查项</p>
             * 
             * <strong>example:</strong>
             * <p>network_access_status</p>
             */
            public Builder minorCheckItem(String minorCheckItem) {
                this.minorCheckItem = minorCheckItem;
                return this;
            }

            /**
             * <p>结果</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            public JobCheckItems build() {
                return new JobCheckItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIdentityProviderStatusCheckJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderStatusCheckJobResponseBody</p>
     */
    public static class IdentityProviderStatusCheckJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckResult")
        private String checkResult;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("IdentityProviderId")
        private String identityProviderId;

        @com.aliyun.core.annotation.NameInMap("IdentityProviderStatusCheckJobId")
        private String identityProviderStatusCheckJobId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("JobCheckItems")
        private java.util.List<JobCheckItems> jobCheckItems;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private IdentityProviderStatusCheckJob(Builder builder) {
            this.checkResult = builder.checkResult;
            this.endTime = builder.endTime;
            this.identityProviderId = builder.identityProviderId;
            this.identityProviderStatusCheckJobId = builder.identityProviderStatusCheckJobId;
            this.instanceId = builder.instanceId;
            this.jobCheckItems = builder.jobCheckItems;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IdentityProviderStatusCheckJob create() {
            return builder().build();
        }

        /**
         * @return checkResult
         */
        public String getCheckResult() {
            return this.checkResult;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return identityProviderId
         */
        public String getIdentityProviderId() {
            return this.identityProviderId;
        }

        /**
         * @return identityProviderStatusCheckJobId
         */
        public String getIdentityProviderStatusCheckJobId() {
            return this.identityProviderStatusCheckJobId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return jobCheckItems
         */
        public java.util.List<JobCheckItems> getJobCheckItems() {
            return this.jobCheckItems;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String checkResult; 
            private Long endTime; 
            private String identityProviderId; 
            private String identityProviderStatusCheckJobId; 
            private String instanceId; 
            private java.util.List<JobCheckItems> jobCheckItems; 
            private Long startTime; 
            private String status; 

            private Builder() {
            } 

            private Builder(IdentityProviderStatusCheckJob model) {
                this.checkResult = model.checkResult;
                this.endTime = model.endTime;
                this.identityProviderId = model.identityProviderId;
                this.identityProviderStatusCheckJobId = model.identityProviderStatusCheckJobId;
                this.instanceId = model.instanceId;
                this.jobCheckItems = model.jobCheckItems;
                this.startTime = model.startTime;
                this.status = model.status;
            } 

            /**
             * <p>任务检查结果</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder checkResult(String checkResult) {
                this.checkResult = checkResult;
                return this;
            }

            /**
             * <p>结束时间</p>
             * 
             * <strong>example:</strong>
             * <p>1763776265757</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>IdP身份提供方</p>
             * 
             * <strong>example:</strong>
             * <p>idp_ncehkms65fiefobrvwy2blrxxx</p>
             */
            public Builder identityProviderId(String identityProviderId) {
                this.identityProviderId = identityProviderId;
                return this;
            }

            /**
             * <p>IdP状态检查任务Id</p>
             * 
             * <strong>example:</strong>
             * <p>async_000036tfu8cgngmakngrr2rk75qgf87pf3rxxx</p>
             */
            public Builder identityProviderStatusCheckJobId(String identityProviderStatusCheckJobId) {
                this.identityProviderStatusCheckJobId = identityProviderStatusCheckJobId;
                return this;
            }

            /**
             * <p>IDaaS EIAM 实例Id</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ki6hd7ihir4ybawogqk6kqsfxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>状态检查子项任务结果信息</p>
             */
            public Builder jobCheckItems(java.util.List<JobCheckItems> jobCheckItems) {
                this.jobCheckItems = jobCheckItems;
                return this;
            }

            /**
             * <p>开始时间</p>
             * 
             * <strong>example:</strong>
             * <p>1763776265757</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>任务检查状态</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public IdentityProviderStatusCheckJob build() {
                return new IdentityProviderStatusCheckJob(this);
            } 

        } 

    }
}
