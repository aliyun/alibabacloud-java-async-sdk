// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetK8sAppPrecheckResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetK8sAppPrecheckResultResponseBody</p>
 */
public class GetK8sAppPrecheckResultResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetK8sAppPrecheckResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetK8sAppPrecheckResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The data that is returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The additional information that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetK8sAppPrecheckResultResponseBody build() {
            return new GetK8sAppPrecheckResultResponseBody(this);
        } 

    } 

    public static class JobResults extends TeaModel {
        @NameInMap("Interrupted")
        private Boolean interrupted;

        @NameInMap("Name")
        private String name;

        @NameInMap("Pass")
        private Boolean pass;

        @NameInMap("Reason")
        private String reason;

        private JobResults(Builder builder) {
            this.interrupted = builder.interrupted;
            this.name = builder.name;
            this.pass = builder.pass;
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobResults create() {
            return builder().build();
        }

        /**
         * @return interrupted
         */
        public Boolean getInterrupted() {
            return this.interrupted;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pass
         */
        public Boolean getPass() {
            return this.pass;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        public static final class Builder {
            private Boolean interrupted; 
            private String name; 
            private Boolean pass; 
            private String reason; 

            /**
             * Specifies whether the precheck of the item was interrupted:
             * <p>
             * 
             * *   true: The precheck of the item was interrupted.
             * *   false: The precheck of the item was not interrupted.
             */
            public Builder interrupted(Boolean interrupted) {
                this.interrupted = interrupted;
                return this;
            }

            /**
             * The name of the precheck item.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Indicates whether the precheck item passed the precheck:
             * <p>
             * 
             * *   true: The precheck item passed the precheck.
             * *   false: The precheck item failed the precheck.
             */
            public Builder pass(Boolean pass) {
                this.pass = pass;
                return this;
            }

            /**
             * The reason why the precheck item failed the precheck or the precheck of the item was interrupted. This parameter is left empty when the application passed the precheck.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            public JobResults build() {
                return new JobResults(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("JobResults")
        private java.util.List < JobResults> jobResults;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.jobResults = builder.jobResults;
            this.reason = builder.reason;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return jobResults
         */
        public java.util.List < JobResults> getJobResults() {
            return this.jobResults;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < JobResults> jobResults; 
            private String reason; 
            private String status; 

            /**
             * The precheck result for the application change.
             */
            public Builder jobResults(java.util.List < JobResults> jobResults) {
                this.jobResults = jobResults;
                return this;
            }

            /**
             * The reason why the application failed the precheck. This parameter is left empty when the application passed the precheck.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The precheck state for the application change. Valid values:
             * <p>
             * 
             * *   checking: The application is being prechecked.
             * *   pass: The application passed the precheck.
             * *   failed: The application failed the precheck.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
