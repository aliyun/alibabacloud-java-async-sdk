// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetPublicIpAddressPoolServiceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetPublicIpAddressPoolServiceStatusResponseBody</p>
 */
public class GetPublicIpAddressPoolServiceStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetPublicIpAddressPoolServiceStatusResponseBody(Builder builder) {
        this.enabled = builder.enabled;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPublicIpAddressPoolServiceStatusResponseBody create() {
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
         * <p>Indicates whether the IP address pool feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> You can call OpenPublicIpAddressPoolService to enable the IP address pool feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>54B48E3D-DF70-471B-AA93-06F82A1B457</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPublicIpAddressPoolServiceStatusResponseBody build() {
            return new GetPublicIpAddressPoolServiceStatusResponseBody(this);
        } 

    } 

}
