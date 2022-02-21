// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPhysicalConnectionServiceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetPhysicalConnectionServiceStatusResponseBody</p>
 */
public class GetPhysicalConnectionServiceStatusResponseBody extends TeaModel {
    @NameInMap("Enabled")
    private Boolean enabled;

    @NameInMap("RequestId")
    private String requestId;

    private GetPhysicalConnectionServiceStatusResponseBody(Builder builder) {
        this.enabled = builder.enabled;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPhysicalConnectionServiceStatusResponseBody create() {
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
         * 是否开通出云流量服务
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPhysicalConnectionServiceStatusResponseBody build() {
            return new GetPhysicalConnectionServiceStatusResponseBody(this);
        } 

    } 

}
