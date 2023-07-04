// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFlowLogServiceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetFlowLogServiceStatusResponseBody</p>
 */
public class GetFlowLogServiceStatusResponseBody extends TeaModel {
    @NameInMap("Enabled")
    private Boolean enabled;

    @NameInMap("RequestId")
    private String requestId;

    private GetFlowLogServiceStatusResponseBody(Builder builder) {
        this.enabled = builder.enabled;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFlowLogServiceStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean enabled; 
        private String requestId; 

        /**
         * Indicates whether the flow log feature is enabled. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no You can call the [OpenFlowLogService](~~449637~~) operation to enable the flow log feature.
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFlowLogServiceStatusResponseBody build() {
            return new GetFlowLogServiceStatusResponseBody(this);
        } 

    } 

}
