// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateServerGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateServerGroupResponseBody</p>
 */
public class CreateServerGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServerGroupId")
    private String serverGroupId;

    private CreateServerGroupResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.requestId = builder.requestId;
        this.serverGroupId = builder.serverGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServerGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serverGroupId
     */
    public String getServerGroupId() {
        return this.serverGroupId;
    }

    public static final class Builder {
        private String jobId; 
        private String requestId; 
        private String serverGroupId; 

        /**
         * <p>The ID of the asynchronous job.</p>
         * 
         * <strong>example:</strong>
         * <p>72dcd26b-f12d-4c27-b3af-18f6aed5****</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-atstuj3rtoptyui****</p>
         */
        public Builder serverGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }

        public CreateServerGroupResponseBody build() {
            return new CreateServerGroupResponseBody(this);
        } 

    } 

}
