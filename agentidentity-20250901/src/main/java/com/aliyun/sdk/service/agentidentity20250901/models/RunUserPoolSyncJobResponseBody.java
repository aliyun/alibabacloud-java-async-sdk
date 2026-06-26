// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link RunUserPoolSyncJobResponseBody} extends {@link TeaModel}
 *
 * <p>RunUserPoolSyncJobResponseBody</p>
 */
public class RunUserPoolSyncJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SynchronizationJobId")
    private String synchronizationJobId;

    private RunUserPoolSyncJobResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.synchronizationJobId = builder.synchronizationJobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunUserPoolSyncJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return synchronizationJobId
     */
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

    public static final class Builder {
        private String requestId; 
        private String synchronizationJobId; 

        private Builder() {
        } 

        private Builder(RunUserPoolSyncJobResponseBody model) {
            this.requestId = model.requestId;
            this.synchronizationJobId = model.synchronizationJobId;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SynchronizationJobId.
         */
        public Builder synchronizationJobId(String synchronizationJobId) {
            this.synchronizationJobId = synchronizationJobId;
            return this;
        }

        public RunUserPoolSyncJobResponseBody build() {
            return new RunUserPoolSyncJobResponseBody(this);
        } 

    } 

}
