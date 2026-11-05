// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link DryRunResult} extends {@link TeaModel}
 *
 * <p>DryRunResult</p>
 */
public class DryRunResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("exitCode")
    private Integer exitCode;

    @com.aliyun.core.annotation.NameInMap("result")
    private String result;

    @com.aliyun.core.annotation.NameInMap("violations")
    private java.util.List<DryRunViolation> violations;

    private DryRunResult(Builder builder) {
        this.exitCode = builder.exitCode;
        this.result = builder.result;
        this.violations = builder.violations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DryRunResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exitCode
     */
    public Integer getExitCode() {
        return this.exitCode;
    }

    /**
     * @return result
     */
    public String getResult() {
        return this.result;
    }

    /**
     * @return violations
     */
    public java.util.List<DryRunViolation> getViolations() {
        return this.violations;
    }

    public static final class Builder {
        private Integer exitCode; 
        private String result; 
        private java.util.List<DryRunViolation> violations; 

        private Builder() {
        } 

        private Builder(DryRunResult model) {
            this.exitCode = model.exitCode;
            this.result = model.result;
            this.violations = model.violations;
        } 

        /**
         * <p>The exit code. A value of 0 indicates that the validation passed. A value of 1 indicates that the request was rejected by business rules. For specific reasons, see violations. A value of 2 indicates that the request structure cannot be parsed and rule validation cannot be performed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder exitCode(Integer exitCode) {
            this.exitCode = exitCode;
            return this;
        }

        /**
         * <p>The text representation of the result. A value of ok indicates that the validation passed, and rejected indicates that the request was rejected by business rules. This field is empty when the exit code is 2, which means the request structure cannot be parsed.</p>
         * 
         * <strong>example:</strong>
         * <p>rejected</p>
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        /**
         * <p>The list of violations. Each violation consists of three elements: field, message, and suggestion, which represent the path of the violated field, the violation description, and the remediation suggestion, respectively. This array is empty when the exit code is 0 (passed). All violations are listed when the exit code is 1 (rejected by business rules). The location and cause of the unparseable fields are provided when the exit code is 2 (unparseable request structure).</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;field&quot;:&quot;schedule.intervalSecs&quot;,&quot;message&quot;:&quot;schedule interval must be a multiple of 15 seconds&quot;,&quot;suggestion&quot;:&quot;must satisfy: 15-86400 seconds and a multiple of 15&quot;}]</p>
         */
        public Builder violations(java.util.List<DryRunViolation> violations) {
            this.violations = violations;
            return this;
        }

        public DryRunResult build() {
            return new DryRunResult(this);
        } 

    } 

}
