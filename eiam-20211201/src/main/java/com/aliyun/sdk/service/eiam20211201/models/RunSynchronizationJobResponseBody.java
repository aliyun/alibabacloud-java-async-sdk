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
 * {@link RunSynchronizationJobResponseBody} extends {@link TeaModel}
 *
 * <p>RunSynchronizationJobResponseBody</p>
 */
public class RunSynchronizationJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SynchronizationJobId")
    private String synchronizationJobId;

    private RunSynchronizationJobResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.synchronizationJobId = builder.synchronizationJobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunSynchronizationJobResponseBody create() {
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

        private Builder(RunSynchronizationJobResponseBody model) {
            this.requestId = model.requestId;
            this.synchronizationJobId = model.synchronizationJobId;
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

        /**
         * <p>The ID of the synchronization job.</p>
         * 
         * <strong>example:</strong>
         * <p>sync_0000347vjovtcf41li0fgsd98gn24q9nj9xxxxx</p>
         */
        public Builder synchronizationJobId(String synchronizationJobId) {
            this.synchronizationJobId = synchronizationJobId;
            return this;
        }

        public RunSynchronizationJobResponseBody build() {
            return new RunSynchronizationJobResponseBody(this);
        } 

    } 

}
