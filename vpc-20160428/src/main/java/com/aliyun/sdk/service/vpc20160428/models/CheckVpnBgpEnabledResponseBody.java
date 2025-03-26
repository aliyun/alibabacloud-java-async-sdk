// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CheckVpnBgpEnabledResponseBody model) {
            this.bgpEnabled = model.bgpEnabled;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether the region supports BGP.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder bgpEnabled(Boolean bgpEnabled) {
            this.bgpEnabled = bgpEnabled;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DF448D2E-215D-334F-B10D-7C3B087EF996</p>
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
