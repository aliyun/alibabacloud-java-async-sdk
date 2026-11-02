// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link QuerySmarttagJobResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmarttagJobResponseBody</p>
 */
public class QuerySmarttagJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobStatus")
    private String jobStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private Results results;

    @com.aliyun.core.annotation.NameInMap("Usages")
    private Usages usages;

    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private QuerySmarttagJobResponseBody(Builder builder) {
        this.jobStatus = builder.jobStatus;
        this.requestId = builder.requestId;
        this.results = builder.results;
        this.usages = builder.usages;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmarttagJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobStatus
     */
    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return results
     */
    public Results getResults() {
        return this.results;
    }

    /**
     * @return usages
     */
    public Usages getUsages() {
        return this.usages;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder {
        private String jobStatus; 
        private String requestId; 
        private Results results; 
        private Usages usages; 
        private String userData; 

        private Builder() {
        } 

        private Builder(QuerySmarttagJobResponseBody model) {
            this.jobStatus = model.jobStatus;
            this.requestId = model.requestId;
            this.results = model.results;
            this.usages = model.usages;
            this.userData = model.userData;
        } 

        /**
         * <p>The status of the job. Valid values:</p>
         * <ul>
         * <li><p><strong>Success</strong>: The job is processed.</p>
         * </li>
         * <li><p><strong>Fail</strong>: The job fails to be processed.</p>
         * </li>
         * <li><p><strong>Processing</strong>: The job is being processed.</p>
         * </li>
         * <li><p><strong>Submitted</strong>: The job is submitted and waiting to be processed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder jobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Results.
         */
        public Builder results(Results results) {
            this.results = results;
            return this;
        }

        /**
         * Usages.
         */
        public Builder usages(Usages usages) {
            this.usages = usages;
            return this;
        }

        /**
         * <p>The information passed through during an MNS callback. For the message format, see the callback message format definition below.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;userId&quot;:&quot;123432412831&quot;}</p>
         */
        public Builder userData(String userData) {
            this.userData = userData;
            return this;
        }

        public QuerySmarttagJobResponseBody build() {
            return new QuerySmarttagJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySmarttagJobResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmarttagJobResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private String data;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Result(Builder builder) {
            this.data = builder.data;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String data; 
            private String type; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.data = model.data;
                this.type = model.type;
            } 

            /**
             * Data.
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySmarttagJobResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmarttagJobResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<Result> result;

        private Results(Builder builder) {
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public java.util.List<Result> getResult() {
            return this.result;
        }

        public static final class Builder {
            private java.util.List<Result> result; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.result = model.result;
            } 

            /**
             * Result.
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySmarttagJobResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmarttagJobResponseBody</p>
     */
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Quota")
        private Long quota;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Usage(Builder builder) {
            this.quota = builder.quota;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usage create() {
            return builder().build();
        }

        /**
         * @return quota
         */
        public Long getQuota() {
            return this.quota;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long quota; 
            private String type; 

            private Builder() {
            } 

            private Builder(Usage model) {
                this.quota = model.quota;
                this.type = model.type;
            } 

            /**
             * Quota.
             */
            public Builder quota(Long quota) {
                this.quota = quota;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Usage build() {
                return new Usage(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySmarttagJobResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmarttagJobResponseBody</p>
     */
    public static class Usages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Usage")
        private java.util.List<Usage> usage;

        private Usages(Builder builder) {
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usages create() {
            return builder().build();
        }

        /**
         * @return usage
         */
        public java.util.List<Usage> getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private java.util.List<Usage> usage; 

            private Builder() {
            } 

            private Builder(Usages model) {
                this.usage = model.usage;
            } 

            /**
             * Usage.
             */
            public Builder usage(java.util.List<Usage> usage) {
                this.usage = usage;
                return this;
            }

            public Usages build() {
                return new Usages(this);
            } 

        } 

    }
}
