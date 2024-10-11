// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSparkStatementsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSparkStatementsResponseBody</p>
 */
public class ListSparkStatementsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Statements")
    private java.util.List < Statements> statements;

    private ListSparkStatementsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.statements = builder.statements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSparkStatementsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return statements
     */
    public java.util.List < Statements> getStatements() {
        return this.statements;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Statements> statements; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Statements.
         */
        public Builder statements(java.util.List < Statements> statements) {
            this.statements = statements;
            return this;
        }

        public ListSparkStatementsResponseBody build() {
            return new ListSparkStatementsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSparkStatementsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSparkStatementsResponseBody</p>
     */
    public static class Statements extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CompletedTime")
        private Long completedTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("Output")
        private String output;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Float progress;

        @com.aliyun.core.annotation.NameInMap("StartedTime")
        private Long startedTime;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private Statements(Builder builder) {
            this.code = builder.code;
            this.completedTime = builder.completedTime;
            this.id = builder.id;
            this.output = builder.output;
            this.progress = builder.progress;
            this.startedTime = builder.startedTime;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Statements create() {
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
         * @return progress
         */
        public Float getProgress() {
            return this.progress;
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
            private Float progress; 
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
             * Progress.
             */
            public Builder progress(Float progress) {
                this.progress = progress;
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

            public Statements build() {
                return new Statements(this);
            } 

        } 

    }
}
