// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallCloudMonitorAgentResponseBody} extends {@link TeaModel}
 *
 * <p>InstallCloudMonitorAgentResponseBody</p>
 */
public class InstallCloudMonitorAgentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private InstallCloudMonitorAgentResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallCloudMonitorAgentResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public InstallCloudMonitorAgentResponseBody build() {
            return new InstallCloudMonitorAgentResponseBody(this);
        } 

    } 

}
