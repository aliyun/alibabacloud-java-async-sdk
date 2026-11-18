// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link RunInventorySynchronizationJobResponseBody} extends {@link TeaModel}
 *
 * <p>RunInventorySynchronizationJobResponseBody</p>
 */
public class RunInventorySynchronizationJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InventorySynchronizationJobId")
    private String inventorySynchronizationJobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RunInventorySynchronizationJobResponseBody(Builder builder) {
        this.inventorySynchronizationJobId = builder.inventorySynchronizationJobId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunInventorySynchronizationJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return inventorySynchronizationJobId
     */
    public String getInventorySynchronizationJobId() {
        return this.inventorySynchronizationJobId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String inventorySynchronizationJobId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RunInventorySynchronizationJobResponseBody model) {
            this.inventorySynchronizationJobId = model.inventorySynchronizationJobId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The synchronization job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sync_xxxxxxxxxx</p>
         */
        public Builder inventorySynchronizationJobId(String inventorySynchronizationJobId) {
            this.inventorySynchronizationJobId = inventorySynchronizationJobId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RunInventorySynchronizationJobResponseBody build() {
            return new RunInventorySynchronizationJobResponseBody(this);
        } 

    } 

}
