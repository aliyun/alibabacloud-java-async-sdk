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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
             * CurrentSqlIndex.
             */
            public Builder currentSqlIndex(Integer currentSqlIndex) {
                this.currentSqlIndex = currentSqlIndex;
                return this;
            }

            /**
             * Env.
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * ExecTypes.
             */
            public Builder execTypes(java.util.List<Integer> execTypes) {
                this.execTypes = execTypes;
                return this;
            }

            /**
             * ExecutorJobId.
             */
            public Builder executorJobId(String executorJobId) {
                this.executorJobId = executorJobId;
                return this;
            }

            /**
             * JobRunId.
             */
            public Builder jobRunId(String jobRunId) {
                this.jobRunId = jobRunId;
                return this;
            }

            /**
             * Statuses.
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
