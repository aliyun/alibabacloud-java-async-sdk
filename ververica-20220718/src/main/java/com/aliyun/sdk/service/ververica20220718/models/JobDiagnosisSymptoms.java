// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link JobDiagnosisSymptoms} extends {@link TeaModel}
 *
 * <p>JobDiagnosisSymptoms</p>
 */
public class JobDiagnosisSymptoms extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("autopilot")
    private JobDiagnosisSymptom autopilot;

    @com.aliyun.core.annotation.NameInMap("others")
    private java.util.List<JobDiagnosisSymptom> others;

    @com.aliyun.core.annotation.NameInMap("runtime")
    private java.util.List<JobDiagnosisSymptom> runtime;

    @com.aliyun.core.annotation.NameInMap("startup")
    private java.util.List<JobDiagnosisSymptom> startup;

    @com.aliyun.core.annotation.NameInMap("state")
    private java.util.List<JobDiagnosisSymptom> state;

    @com.aliyun.core.annotation.NameInMap("troubleshooting")
    private java.util.List<JobDiagnosisSymptom> troubleshooting;

    private JobDiagnosisSymptoms(Builder builder) {
        this.autopilot = builder.autopilot;
        this.others = builder.others;
        this.runtime = builder.runtime;
        this.startup = builder.startup;
        this.state = builder.state;
        this.troubleshooting = builder.troubleshooting;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JobDiagnosisSymptoms create() {
        return builder().build();
    }

    /**
     * @return autopilot
     */
    public JobDiagnosisSymptom getAutopilot() {
        return this.autopilot;
    }

    /**
     * @return others
     */
    public java.util.List<JobDiagnosisSymptom> getOthers() {
        return this.others;
    }

    /**
     * @return runtime
     */
    public java.util.List<JobDiagnosisSymptom> getRuntime() {
        return this.runtime;
    }

    /**
     * @return startup
     */
    public java.util.List<JobDiagnosisSymptom> getStartup() {
        return this.startup;
    }

    /**
     * @return state
     */
    public java.util.List<JobDiagnosisSymptom> getState() {
        return this.state;
    }

    /**
     * @return troubleshooting
     */
    public java.util.List<JobDiagnosisSymptom> getTroubleshooting() {
        return this.troubleshooting;
    }

    public static final class Builder {
        private JobDiagnosisSymptom autopilot; 
        private java.util.List<JobDiagnosisSymptom> others; 
        private java.util.List<JobDiagnosisSymptom> runtime; 
        private java.util.List<JobDiagnosisSymptom> startup; 
        private java.util.List<JobDiagnosisSymptom> state; 
        private java.util.List<JobDiagnosisSymptom> troubleshooting; 

        /**
         * autopilot.
         */
        public Builder autopilot(JobDiagnosisSymptom autopilot) {
            this.autopilot = autopilot;
            return this;
        }

        /**
         * others.
         */
        public Builder others(java.util.List<JobDiagnosisSymptom> others) {
            this.others = others;
            return this;
        }

        /**
         * runtime.
         */
        public Builder runtime(java.util.List<JobDiagnosisSymptom> runtime) {
            this.runtime = runtime;
            return this;
        }

        /**
         * startup.
         */
        public Builder startup(java.util.List<JobDiagnosisSymptom> startup) {
            this.startup = startup;
            return this;
        }

        /**
         * state.
         */
        public Builder state(java.util.List<JobDiagnosisSymptom> state) {
            this.state = state;
            return this;
        }

        /**
         * troubleshooting.
         */
        public Builder troubleshooting(java.util.List<JobDiagnosisSymptom> troubleshooting) {
            this.troubleshooting = troubleshooting;
            return this;
        }

        public JobDiagnosisSymptoms build() {
            return new JobDiagnosisSymptoms(this);
        } 

    } 

}
