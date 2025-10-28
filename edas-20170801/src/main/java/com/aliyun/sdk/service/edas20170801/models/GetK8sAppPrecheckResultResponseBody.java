// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link GetK8sAppPrecheckResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetK8sAppPrecheckResultResponseBody</p>
 */
public class GetK8sAppPrecheckResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetK8sAppPrecheckResultResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data that is returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The additional information that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B909AB1F-3763-4963-B1CE-0BDFA192****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetK8sAppPrecheckResultResponseBody build() {
            return new GetK8sAppPrecheckResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetK8sAppPrecheckResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetK8sAppPrecheckResultResponseBody</p>
     */
    public static class JobResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Interrupted")
        private Boolean interrupted;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Pass")
        private Boolean pass;

        @com.aliyun.core.annotation.NameInMap("Reason")
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

            private Builder() {
            } 

            private Builder(JobResults model) {
                this.interrupted = model.interrupted;
                this.name = model.name;
                this.pass = model.pass;
                this.reason = model.reason;
            } 

            /**
             * <p>Specifies whether the precheck of the item was interrupted:</p>
             * <ul>
             * <li>true: The precheck of the item was interrupted.</li>
             * <li>false: The precheck of the item was not interrupted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder interrupted(Boolean interrupted) {
                this.interrupted = interrupted;
                return this;
            }

            /**
             * <p>The name of the precheck item.</p>
             * 
             * <strong>example:</strong>
             * <p>Cluster Health Check</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Indicates whether the precheck item passed the precheck:</p>
             * <ul>
             * <li>true: The precheck item passed the precheck.</li>
             * <li>false: The precheck item failed the precheck.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder pass(Boolean pass) {
                this.pass = pass;
                return this;
            }

            /**
             * <p>The reason why the precheck item failed the precheck or the precheck of the item was interrupted. This parameter is left empty when the application passed the precheck.</p>
             * 
             * <strong>example:</strong>
             * <p>The Kubernetes cluster is disconnected from the EDAS control plane.</p>
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
    /**
     * 
     * {@link GetK8sAppPrecheckResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetK8sAppPrecheckResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobResults")
        private java.util.List<JobResults> jobResults;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Status")
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
        public java.util.List<JobResults> getJobResults() {
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
            private java.util.List<JobResults> jobResults; 
            private String reason; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.jobResults = model.jobResults;
                this.reason = model.reason;
                this.status = model.status;
            } 

            /**
             * <p>The precheck result for the application change.</p>
             */
            public Builder jobResults(java.util.List<JobResults> jobResults) {
                this.jobResults = jobResults;
                return this;
            }

            /**
             * <p>The reason why the application failed the precheck. This parameter is left empty when the application passed the precheck.</p>
             * 
             * <strong>example:</strong>
             * <p>The Kubernetes cluster is disconnected from the EDAS control plane.</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The precheck state for the application change. Valid values:</p>
             * <ul>
             * <li>checking: The application is being prechecked.</li>
             * <li>pass: The application passed the precheck.</li>
             * <li>failed: The application failed the precheck.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>checking</p>
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
