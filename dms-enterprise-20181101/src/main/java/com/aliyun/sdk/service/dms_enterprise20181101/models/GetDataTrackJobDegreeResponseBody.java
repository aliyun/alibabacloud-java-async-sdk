// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDataTrackJobDegreeResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataTrackJobDegreeResponseBody</p>
 */
public class GetDataTrackJobDegreeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("JobDegree")
    private JobDegree jobDegree;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The progress details of the data tracking task.</p>
         */
        public Builder jobDegree(JobDegree jobDegree) {
            this.jobDegree = jobDegree;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C51420E3-144A-4A94-B473-8662FCF4AD10</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDataTrackJobDegreeResponseBody build() {
            return new GetDataTrackJobDegreeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataTrackJobDegreeResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataTrackJobDegreeResponseBody</p>
     */
    public static class JobDegree extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DownloadCompletionDegree")
        private Double downloadCompletionDegree;

        @com.aliyun.core.annotation.NameInMap("FilterCompletionDegree")
        private Double filterCompletionDegree;

        @com.aliyun.core.annotation.NameInMap("JobStatus")
        private String jobStatus;

        @com.aliyun.core.annotation.NameInMap("ListCompletionDegree")
        private Double listCompletionDegree;

        @com.aliyun.core.annotation.NameInMap("StatusDesc")
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
             * <p>The progress of binary log download. Valid values: 0 to 1. A value of 1 indicates that binary log download is complete.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder downloadCompletionDegree(Double downloadCompletionDegree) {
                this.downloadCompletionDegree = downloadCompletionDegree;
                return this;
            }

            /**
             * <p>The progress of binary log parsing. Valid values: 0 to 1. A value of 1 indicates that binary log parsing is complete.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder filterCompletionDegree(Double filterCompletionDegree) {
                this.filterCompletionDegree = filterCompletionDegree;
                return this;
            }

            /**
             * <p>The status of the data tracking task. Valid values:</p>
             * <ul>
             * <li><strong>INIT</strong>: The task is being initialized.</li>
             * <li><strong>LISTING</strong>: The binary logs are being obtained.</li>
             * <li><strong>LIST_SUCCESS</strong>: The binary logs are successfully obtained.</li>
             * <li><strong>DOWNLOADING</strong>: The binary logs are being downloaded.</li>
             * <li><strong>DOWNLOAD_FAIL</strong>: The binary logs failed to be downloaded.</li>
             * <li><strong>DOWNLOAD_SUCCESS</strong>: The binary logs are successfully downloaded.</li>
             * <li><strong>FILTERING</strong>: The binary logs are being parsed.</li>
             * <li><strong>FILTER_FAIL</strong>: The binary logs failed to be parsed.</li>
             * <li><strong>FILTER_SUCCESS</strong>: The binary logs are successfully parsed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FILTER_SUCCESS</p>
             */
            public Builder jobStatus(String jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * <p>The progress of binary log obtaining. Valid values: 0 to 1. A value of 1 indicates that binary log obtaining is complete.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder listCompletionDegree(Double listCompletionDegree) {
                this.listCompletionDegree = listCompletionDegree;
                return this;
            }

            /**
             * <p>The description of the task status.</p>
             * 
             * <strong>example:</strong>
             * <p>searching success</p>
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
