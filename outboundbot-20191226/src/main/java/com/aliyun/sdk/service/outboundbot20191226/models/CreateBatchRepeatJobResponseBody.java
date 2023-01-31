// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBatchRepeatJobResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBatchRepeatJobResponseBody</p>
 */
public class CreateBatchRepeatJobResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("JobGroup")
    private JobGroup jobGroup;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateBatchRepeatJobResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.jobGroup = builder.jobGroup;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBatchRepeatJobResponseBody create() {
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
     * @return jobGroup
     */
    public JobGroup getJobGroup() {
        return this.jobGroup;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private JobGroup jobGroup; 
        private String message; 
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
         * JobGroup.
         */
        public Builder jobGroup(JobGroup jobGroup) {
            this.jobGroup = jobGroup;
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

        public CreateBatchRepeatJobResponseBody build() {
            return new CreateBatchRepeatJobResponseBody(this);
        } 

    } 

    public static class JobGroup extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("MinConcurrency")
        private Long minConcurrency;

        @NameInMap("Priority")
        private String priority;

        @NameInMap("RingingDuration")
        private Long ringingDuration;

        private JobGroup(Builder builder) {
            this.id = builder.id;
            this.minConcurrency = builder.minConcurrency;
            this.priority = builder.priority;
            this.ringingDuration = builder.ringingDuration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobGroup create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return minConcurrency
         */
        public Long getMinConcurrency() {
            return this.minConcurrency;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return ringingDuration
         */
        public Long getRingingDuration() {
            return this.ringingDuration;
        }

        public static final class Builder {
            private String id; 
            private Long minConcurrency; 
            private String priority; 
            private Long ringingDuration; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MinConcurrency.
             */
            public Builder minConcurrency(Long minConcurrency) {
                this.minConcurrency = minConcurrency;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * RingingDuration.
             */
            public Builder ringingDuration(Long ringingDuration) {
                this.ringingDuration = ringingDuration;
                return this;
            }

            public JobGroup build() {
                return new JobGroup(this);
            } 

        } 

    }
}
