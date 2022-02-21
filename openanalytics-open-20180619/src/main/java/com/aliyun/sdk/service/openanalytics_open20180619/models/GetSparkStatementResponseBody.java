// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkStatementResponseBody} extends {@link TeaModel}
 *
 * <p>GetSparkStatementResponseBody</p>
 */
public class GetSparkStatementResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private GetSparkStatementResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSparkStatementResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private Data data; 
        private String requestId; 

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

        public GetSparkStatementResponseBody build() {
            return new GetSparkStatementResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("CompletedTime")
        private Long completedTime;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("Output")
        private String output;

        @NameInMap("Process")
        private Float process;

        @NameInMap("StartedTime")
        private Long startedTime;

        @NameInMap("State")
        private String state;

        private Data(Builder builder) {
            this.code = builder.code;
            this.completedTime = builder.completedTime;
            this.id = builder.id;
            this.output = builder.output;
            this.process = builder.process;
            this.startedTime = builder.startedTime;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return completedTime
         */
        public Long getCompletedTime() {
            return this.completedTime;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        /**
         * @return process
         */
        public Float getProcess() {
            return this.process;
        }

        /**
         * @return startedTime
         */
        public Long getStartedTime() {
            return this.startedTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String code; 
            private Long completedTime; 
            private Integer id; 
            private String output; 
            private Float process; 
            private Long startedTime; 
            private String state; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * CompletedTime.
             */
            public Builder completedTime(Long completedTime) {
                this.completedTime = completedTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * Output.
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * Process.
             */
            public Builder process(Float process) {
                this.process = process;
                return this;
            }

            /**
             * StartedTime.
             */
            public Builder startedTime(Long startedTime) {
                this.startedTime = startedTime;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
