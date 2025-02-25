// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

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
 * {@link UpdateServerGroupServersAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateServerGroupServersAttributeResponseBody</p>
 */
public class UpdateServerGroupServersAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServerGroupId")
    private String serverGroupId;

    private UpdateServerGroupServersAttributeResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.requestId = builder.requestId;
        this.serverGroupId = builder.serverGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServerGroupServersAttributeResponseBody create() {
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
         * <p>The ID of the asynchronous task.</p>
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
         * <p>54B48E3D-DF70-471B-AA93-08E683A1B45</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The server group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-atstuj3rtoptyui****</p>
         */
        public Builder serverGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }

        public UpdateServerGroupServersAttributeResponseBody build() {
            return new UpdateServerGroupServersAttributeResponseBody(this);
        } 

    } 

}
