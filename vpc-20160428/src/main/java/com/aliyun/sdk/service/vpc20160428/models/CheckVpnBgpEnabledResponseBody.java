// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckVpnBgpEnabledResponseBody} extends {@link TeaModel}
 *
 * <p>CheckVpnBgpEnabledResponseBody</p>
 */
public class CheckVpnBgpEnabledResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BgpEnabled")
    private Boolean bgpEnabled;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * Indicates whether the region supports BGP.
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder bgpEnabled(Boolean bgpEnabled) {
            this.bgpEnabled = bgpEnabled;
            return this;
        }

        /**
         * The request ID.
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
