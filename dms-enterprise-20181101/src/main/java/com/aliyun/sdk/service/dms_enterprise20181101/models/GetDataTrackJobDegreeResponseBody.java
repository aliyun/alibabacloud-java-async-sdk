// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataTrackJobDegreeResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataTrackJobDegreeResponseBody</p>
 */
public class GetDataTrackJobDegreeResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("JobDegree")
    private JobDegree jobDegree;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetDataTrackJobDegreeResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.jobDegree = builder.jobDegree;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataTrackJobDegreeResponseBody create() {
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
     * @return jobDegree
     */
    public JobDegree getJobDegree() {
        return this.jobDegree;
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
        private String errorCode; 
        private String errorMessage; 
        private JobDegree jobDegree; 
        private String requestId; 
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
         * JobDegree.
         */
        public Builder jobDegree(JobDegree jobDegree) {
            this.jobDegree = jobDegree;
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

        public GetDataTrackJobDegreeResponseBody build() {
            return new GetDataTrackJobDegreeResponseBody(this);
        } 

    } 

    public static class JobDegree extends TeaModel {
        @NameInMap("DownloadCompletionDegree")
        private Double downloadCompletionDegree;

        @NameInMap("FilterCompletionDegree")
        private Double filterCompletionDegree;

        @NameInMap("JobStatus")
        private String jobStatus;

        @NameInMap("ListCompletionDegree")
        private Double listCompletionDegree;

        @NameInMap("StatusDesc")
        private String statusDesc;

        private JobDegree(Builder builder) {
            this.downloadCompletionDegree = builder.downloadCompletionDegree;
            this.filterCompletionDegree = builder.filterCompletionDegree;
            this.jobStatus = builder.jobStatus;
            this.listCompletionDegree = builder.listCompletionDegree;
            this.statusDesc = builder.statusDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobDegree create() {
            return builder().build();
        }

        /**
         * @return downloadCompletionDegree
         */
        public Double getDownloadCompletionDegree() {
            return this.downloadCompletionDegree;
        }

        /**
         * @return filterCompletionDegree
         */
        public Double getFilterCompletionDegree() {
            return this.filterCompletionDegree;
        }

        /**
         * @return jobStatus
         */
        public String getJobStatus() {
            return this.jobStatus;
        }

        /**
         * @return listCompletionDegree
         */
        public Double getListCompletionDegree() {
            return this.listCompletionDegree;
        }

        /**
         * @return statusDesc
         */
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public static final class Builder {
            private Double downloadCompletionDegree; 
            private Double filterCompletionDegree; 
            private String jobStatus; 
            private Double listCompletionDegree; 
            private String statusDesc; 

            /**
             * DownloadCompletionDegree.
             */
            public Builder downloadCompletionDegree(Double downloadCompletionDegree) {
                this.downloadCompletionDegree = downloadCompletionDegree;
                return this;
            }

            /**
             * FilterCompletionDegree.
             */
            public Builder filterCompletionDegree(Double filterCompletionDegree) {
                this.filterCompletionDegree = filterCompletionDegree;
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
             * ListCompletionDegree.
             */
            public Builder listCompletionDegree(Double listCompletionDegree) {
                this.listCompletionDegree = listCompletionDegree;
                return this;
            }

            /**
             * StatusDesc.
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            public JobDegree build() {
                return new JobDegree(this);
            } 

        } 

    }
}
