// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SummaryJobDetailResponseBody} extends {@link TeaModel}
 *
 * <p>SummaryJobDetailResponseBody</p>
 */
public class SummaryJobDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("JobId")
    private String jobId;

    @NameInMap("ProgressSummaryDetails")
    private java.util.List < ProgressSummaryDetails> progressSummaryDetails;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * ProgressSummaryDetails.
         */
        public Builder progressSummaryDetails(java.util.List < ProgressSummaryDetails> progressSummaryDetails) {
            this.progressSummaryDetails = progressSummaryDetails;
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
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SummaryJobDetailResponseBody build() {
            return new SummaryJobDetailResponseBody(this);
        } 

    } 

    public static class ProgressSummaryDetails extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("State")
        private Integer state;

        @NameInMap("TotalCount")
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * State.
             */
            public Builder state(Integer state) {
                this.state = state;
                return this;
            }

            /**
             * TotalCount.
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
