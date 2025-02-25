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
 * {@link JobStatusRunning} extends {@link TeaModel}
 *
 * <p>JobStatusRunning</p>
 */
public class JobStatusRunning extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("observedFlinkJobRestarts")
    private Long observedFlinkJobRestarts;

    @com.aliyun.core.annotation.NameInMap("observedFlinkJobStatus")
    private String observedFlinkJobStatus;

    private JobStatusRunning(Builder builder) {
        this.observedFlinkJobRestarts = builder.observedFlinkJobRestarts;
        this.observedFlinkJobStatus = builder.observedFlinkJobStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JobStatusRunning create() {
        return builder().build();
    }

    /**
     * @return observedFlinkJobRestarts
     */
    public Long getObservedFlinkJobRestarts() {
        return this.observedFlinkJobRestarts;
    }

    /**
     * @return observedFlinkJobStatus
     */
    public String getObservedFlinkJobStatus() {
        return this.observedFlinkJobStatus;
    }

    public static final class Builder {
        private Long observedFlinkJobRestarts; 
        private String observedFlinkJobStatus; 

        /**
         * observedFlinkJobRestarts.
         */
        public Builder observedFlinkJobRestarts(Long observedFlinkJobRestarts) {
            this.observedFlinkJobRestarts = observedFlinkJobRestarts;
            return this;
        }

        /**
         * observedFlinkJobStatus.
         */
        public Builder observedFlinkJobStatus(String observedFlinkJobStatus) {
            this.observedFlinkJobStatus = observedFlinkJobStatus;
            return this;
        }

        public JobStatusRunning build() {
            return new JobStatusRunning(this);
        } 

    } 

}
