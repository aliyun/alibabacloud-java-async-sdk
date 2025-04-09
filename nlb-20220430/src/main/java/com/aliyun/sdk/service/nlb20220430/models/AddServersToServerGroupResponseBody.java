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
 * {@link AddServersToServerGroupResponseBody} extends {@link TeaModel}
 *
 * <p>AddServersToServerGroupResponseBody</p>
 */
public class AddServersToServerGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServerGroupId")
    private String serverGroupId;

    private AddServersToServerGroupResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.requestId = builder.requestId;
        this.serverGroupId = builder.serverGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddServersToServerGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(AddServersToServerGroupResponseBody model) {
            this.jobId = model.jobId;
            this.requestId = model.requestId;
            this.serverGroupId = model.serverGroupId;
        } 

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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>54B48E3D-DF70-471B-AA93-08E683A1B45</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-atstuj3rtoptyui****</p>
         */
        public Builder serverGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }

        public AddServersToServerGroupResponseBody build() {
            return new AddServersToServerGroupResponseBody(this);
        } 

    } 

}
