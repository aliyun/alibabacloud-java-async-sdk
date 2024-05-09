// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SummaryJobDetailResponseBody} extends {@link TeaModel}
 *
 * <p>SummaryJobDetailResponseBody</p>
 */
public class SummaryJobDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("ProgressSummaryDetails")
    private java.util.List < ProgressSummaryDetails> progressSummaryDetails;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SummaryJobDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.jobId = builder.jobId;
        this.progressSummaryDetails = builder.progressSummaryDetails;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SummaryJobDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return progressSummaryDetails
     */
    public java.util.List < ProgressSummaryDetails> getProgressSummaryDetails() {
        return this.progressSummaryDetails;
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
        private String code; 
        private Integer httpStatusCode; 
        private String jobId; 
        private java.util.List < ProgressSummaryDetails> progressSummaryDetails; 
        private String requestId; 
        private Boolean success; 

        /**
         * The error code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The ID of the data migration or data synchronization task.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * The returned information about the migrated or synchronized objects in arrays.
         * <p>
         * 
         * >  The arrays are in the following format: \[{"key":"Function","state":5,"totalCount":22},{"key":"Procedure","state":5,"totalCount":26},{"key":"Table","state":0,"totalCount":68},{"key":"View","state":5,"totalCount":100}].
         */
        public Builder progressSummaryDetails(java.util.List < ProgressSummaryDetails> progressSummaryDetails) {
            this.progressSummaryDetails = progressSummaryDetails;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SummaryJobDetailResponseBody build() {
            return new SummaryJobDetailResponseBody(this);
        } 

    } 

    public static class ProgressSummaryDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("State")
        private Integer state;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private ProgressSummaryDetails(Builder builder) {
            this.key = builder.key;
            this.state = builder.state;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProgressSummaryDetails create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return state
         */
        public Integer getState() {
            return this.state;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String key; 
            private Integer state; 
            private Long totalCount; 

            /**
             * The type of migrated or synchronized object. Valid values: **Table**, **Constraint**, **Index**, **View**, **Materialize View**, **Type**, **Synonym**, **Trigger**, **Function**, **Procedure**, **Package**, **Default**, **Rule**, **PlanGuide**, and **Sequence**.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The state of the data migration or data synchronization task. Valid values:
             * <p>
             * 
             * *   **0**: The task was complete.
             * *   **1**: The task was waiting to start.
             * *   **2**: The task was being initialized.
             * *   **3**: The task was in progress.
             * *   **4**: An error occurred.
             * *   **5**: The task failed.
             */
            public Builder state(Integer state) {
                this.state = state;
                return this;
            }

            /**
             * The total number of migrated or synchronized objects.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public ProgressSummaryDetails build() {
                return new ProgressSummaryDetails(this);
            } 

        } 

    }
}
