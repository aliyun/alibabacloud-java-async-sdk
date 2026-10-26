// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link RunInstanceInspectionResponseBody} extends {@link TeaModel}
 *
 * <p>RunInstanceInspectionResponseBody</p>
 */
public class RunInstanceInspectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("runId")
    private String runId;

    private RunInstanceInspectionResponseBody(Builder builder) {
        this.runId = builder.runId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunInstanceInspectionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    public static final class Builder {
        private String runId; 

        private Builder() {
        } 

        private Builder(RunInstanceInspectionResponseBody model) {
            this.runId = model.runId;
        } 

        /**
         * runId.
         */
        public Builder runId(String runId) {
            this.runId = runId;
            return this;
        }

        public RunInstanceInspectionResponseBody build() {
            return new RunInstanceInspectionResponseBody(this);
        } 

    } 

}
