// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link SeverityConfiguration} extends {@link TeaModel}
 *
 * <p>SeverityConfiguration</p>
 */
public class SeverityConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("evalCondition")
    private ConditionConfiguration evalCondition;

    @com.aliyun.core.annotation.NameInMap("severity")
    private Integer severity;

    private SeverityConfiguration(Builder builder) {
        this.evalCondition = builder.evalCondition;
        this.severity = builder.severity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SeverityConfiguration create() {
        return builder().build();
    }

    /**
     * @return evalCondition
     */
    public ConditionConfiguration getEvalCondition() {
        return this.evalCondition;
    }

    /**
     * @return severity
     */
    public Integer getSeverity() {
        return this.severity;
    }

    public static final class Builder {
        private ConditionConfiguration evalCondition; 
        private Integer severity; 

        /**
         * evalCondition.
         */
        public Builder evalCondition(ConditionConfiguration evalCondition) {
            this.evalCondition = evalCondition;
            return this;
        }

        /**
         * severity.
         */
        public Builder severity(Integer severity) {
            this.severity = severity;
            return this;
        }

        public SeverityConfiguration build() {
            return new SeverityConfiguration(this);
        } 

    } 

}
