// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link RunSemanticJobResponseBody} extends {@link TeaModel}
 *
 * <p>RunSemanticJobResponseBody</p>
 */
public class RunSemanticJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private RunSemanticJobResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunSemanticJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(RunSemanticJobResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The run information for this submission. A successful submission does not mean that the semantic model output has been generated. Use the detail operation to confirm the status before downloading results.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID. Used for locating logs and troubleshooting issues.</p>
         * 
         * <strong>example:</strong>
         * <p>676271D6-53B4-57BE-89FA-72F7AE1418DF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public RunSemanticJobResponseBody build() {
            return new RunSemanticJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RunSemanticJobResponseBody} extends {@link TeaModel}
     *
     * <p>RunSemanticJobResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentSqlIndex")
        private Integer currentSqlIndex;

        @com.aliyun.core.annotation.NameInMap("Env")
        private String env;

        @com.aliyun.core.annotation.NameInMap("ExecTypes")
        private java.util.List<Integer> execTypes;

        @com.aliyun.core.annotation.NameInMap("ExecutorJobId")
        private String executorJobId;

        @com.aliyun.core.annotation.NameInMap("JobRunId")
        private String jobRunId;

        @com.aliyun.core.annotation.NameInMap("Statuses")
        private java.util.List<Integer> statuses;

        private Data(Builder builder) {
            this.currentSqlIndex = builder.currentSqlIndex;
            this.env = builder.env;
            this.execTypes = builder.execTypes;
            this.executorJobId = builder.executorJobId;
            this.jobRunId = builder.jobRunId;
            this.statuses = builder.statuses;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentSqlIndex
         */
        public Integer getCurrentSqlIndex() {
            return this.currentSqlIndex;
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return execTypes
         */
        public java.util.List<Integer> getExecTypes() {
            return this.execTypes;
        }

        /**
         * @return executorJobId
         */
        public String getExecutorJobId() {
            return this.executorJobId;
        }

        /**
         * @return jobRunId
         */
        public String getJobRunId() {
            return this.jobRunId;
        }

        /**
         * @return statuses
         */
        public java.util.List<Integer> getStatuses() {
            return this.statuses;
        }

        public static final class Builder {
            private Integer currentSqlIndex; 
            private String env; 
            private java.util.List<Integer> execTypes; 
            private String executorJobId; 
            private String jobRunId; 
            private java.util.List<Integer> statuses; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currentSqlIndex = model.currentSqlIndex;
                this.env = model.env;
                this.execTypes = model.execTypes;
                this.executorJobId = model.executorJobId;
                this.jobRunId = model.jobRunId;
                this.statuses = model.statuses;
            } 

            /**
             * <p>The current SQL fragment index returned by the executor in the submission response.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder currentSqlIndex(Integer currentSqlIndex) {
                this.currentSqlIndex = currentSqlIndex;
                return this;
            }

            /**
             * <p>The runtime environment identifier returned by the executor in the submission response.</p>
             * 
             * <strong>example:</strong>
             * <p>PROD</p>
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * <p>The list of execution type codes returned by the executor in the submission response.</p>
             */
            public Builder execTypes(java.util.List<Integer> execTypes) {
                this.execTypes = execTypes;
                return this;
            }

            /**
             * <p>The executor task identifier. Pass this value to the ExecutorJobId parameter of GetSemanticJobDetail, GetSemanticJobLog, or KillSemanticJob.</p>
             * 
             * <strong>example:</strong>
             * <p>exec-job-demo</p>
             */
            public Builder executorJobId(String executorJobId) {
                this.executorJobId = executorJobId;
                return this;
            }

            /**
             * <p>The unique identifier of this run. Pass this value to the JobRunId parameter of DownloadSemanticResults to obtain the output of this run.</p>
             * 
             * <strong>example:</strong>
             * <p>01H00000000000000000000000</p>
             */
            public Builder jobRunId(String jobRunId) {
                this.jobRunId = jobRunId;
                return this;
            }

            /**
             * <p>The list of status codes returned by the executor in the submission response. The status at the submission stage does not indicate that the results are complete.</p>
             */
            public Builder statuses(java.util.List<Integer> statuses) {
                this.statuses = statuses;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
