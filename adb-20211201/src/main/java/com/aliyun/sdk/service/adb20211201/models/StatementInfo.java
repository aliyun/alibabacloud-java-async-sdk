// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link StatementInfo} extends {@link TeaModel}
 *
 * <p>StatementInfo</p>
 */
public class StatementInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CompletedTimeInMills")
    private Long completedTimeInMills;

    @com.aliyun.core.annotation.NameInMap("Output")
    private String output;

    @com.aliyun.core.annotation.NameInMap("Process")
    private Float process;

    @com.aliyun.core.annotation.NameInMap("StartedTimeInMills")
    private Long startedTimeInMills;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.NameInMap("StatementId")
    private String statementId;

    private StatementInfo(Builder builder) {
        this.code = builder.code;
        this.completedTimeInMills = builder.completedTimeInMills;
        this.output = builder.output;
        this.process = builder.process;
        this.startedTimeInMills = builder.startedTimeInMills;
        this.state = builder.state;
        this.statementId = builder.statementId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StatementInfo create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return completedTimeInMills
     */
    public Long getCompletedTimeInMills() {
        return this.completedTimeInMills;
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
     * @return startedTimeInMills
     */
    public Long getStartedTimeInMills() {
        return this.startedTimeInMills;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return statementId
     */
    public String getStatementId() {
        return this.statementId;
    }

    public static final class Builder {
        private String code; 
        private Long completedTimeInMills; 
        private String output; 
        private Float process; 
        private Long startedTimeInMills; 
        private String state; 
        private String statementId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CompletedTimeInMills.
         */
        public Builder completedTimeInMills(Long completedTimeInMills) {
            this.completedTimeInMills = completedTimeInMills;
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
         * StartedTimeInMills.
         */
        public Builder startedTimeInMills(Long startedTimeInMills) {
            this.startedTimeInMills = startedTimeInMills;
            return this;
        }

        /**
         * State.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * StatementId.
         */
        public Builder statementId(String statementId) {
            this.statementId = statementId;
            return this;
        }

        public StatementInfo build() {
            return new StatementInfo(this);
        } 

    } 

}
