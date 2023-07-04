// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckVpnBgpEnabledResponseBody} extends {@link TeaModel}
 *
 * <p>CheckVpnBgpEnabledResponseBody</p>
 */
public class CheckVpnBgpEnabledResponseBody extends TeaModel {
    @NameInMap("BgpEnabled")
    private Boolean bgpEnabled;

    @NameInMap("RequestId")
    private String requestId;

    private CheckVpnBgpEnabledResponseBody(Builder builder) {
        this.bgpEnabled = builder.bgpEnabled;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckVpnBgpEnabledResponseBody create() {
        return builder().build();
    }

    /**
     * @return bgpEnabled
     */
    public Boolean getBgpEnabled() {
        return this.bgpEnabled;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean bgpEnabled; 
        private String requestId; 

        /**
         * Indicates whether the BGP feature is supported in the current region.
         * <p>
         * 
         * *   **true**: supported.
         * *   **false**: not supported.
         */
        public Builder bgpEnabled(Boolean bgpEnabled) {
            this.bgpEnabled = bgpEnabled;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckVpnBgpEnabledResponseBody build() {
            return new CheckVpnBgpEnabledResponseBody(this);
        } 

    } 

}
