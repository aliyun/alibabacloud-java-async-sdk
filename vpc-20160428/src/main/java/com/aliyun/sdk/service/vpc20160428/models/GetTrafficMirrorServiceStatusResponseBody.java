// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrafficMirrorServiceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetTrafficMirrorServiceStatusResponseBody</p>
 */
public class GetTrafficMirrorServiceStatusResponseBody extends TeaModel {
    @NameInMap("Enabled")
    private Boolean enabled;

    @NameInMap("RequestId")
    private String requestId;

    private GetTrafficMirrorServiceStatusResponseBody(Builder builder) {
        this.enabled = builder.enabled;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrafficMirrorServiceStatusResponseBody create() {
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
         * Enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetTrafficMirrorServiceStatusResponseBody build() {
            return new GetTrafficMirrorServiceStatusResponseBody(this);
        } 

    } 

}
