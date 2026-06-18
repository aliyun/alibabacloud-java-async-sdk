// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link E2BNetwork} extends {@link TeaModel}
 *
 * <p>E2BNetwork</p>
 */
public class E2BNetwork extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("allowOut")
    private java.util.List<String> allowOut;

    @com.aliyun.core.annotation.NameInMap("allowPublicTraffic")
    private Boolean allowPublicTraffic;

    @com.aliyun.core.annotation.NameInMap("denyOut")
    private java.util.List<String> denyOut;

    @com.aliyun.core.annotation.NameInMap("maskRequestHost")
    private String maskRequestHost;

    private E2BNetwork(Builder builder) {
        this.allowOut = builder.allowOut;
        this.allowPublicTraffic = builder.allowPublicTraffic;
        this.denyOut = builder.denyOut;
        this.maskRequestHost = builder.maskRequestHost;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static E2BNetwork create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowOut
     */
    public java.util.List<String> getAllowOut() {
        return this.allowOut;
    }

    /**
     * @return allowPublicTraffic
     */
    public Boolean getAllowPublicTraffic() {
        return this.allowPublicTraffic;
    }

    /**
     * @return denyOut
     */
    public java.util.List<String> getDenyOut() {
        return this.denyOut;
    }

    /**
     * @return maskRequestHost
     */
    public String getMaskRequestHost() {
        return this.maskRequestHost;
    }

    public static final class Builder {
        private java.util.List<String> allowOut; 
        private Boolean allowPublicTraffic; 
        private java.util.List<String> denyOut; 
        private String maskRequestHost; 

        private Builder() {
        } 

        private Builder(E2BNetwork model) {
            this.allowOut = model.allowOut;
            this.allowPublicTraffic = model.allowPublicTraffic;
            this.denyOut = model.denyOut;
            this.maskRequestHost = model.maskRequestHost;
        } 

        /**
         * allowOut.
         */
        public Builder allowOut(java.util.List<String> allowOut) {
            this.allowOut = allowOut;
            return this;
        }

        /**
         * allowPublicTraffic.
         */
        public Builder allowPublicTraffic(Boolean allowPublicTraffic) {
            this.allowPublicTraffic = allowPublicTraffic;
            return this;
        }

        /**
         * denyOut.
         */
        public Builder denyOut(java.util.List<String> denyOut) {
            this.denyOut = denyOut;
            return this;
        }

        /**
         * maskRequestHost.
         */
        public Builder maskRequestHost(String maskRequestHost) {
            this.maskRequestHost = maskRequestHost;
            return this;
        }

        public E2BNetwork build() {
            return new E2BNetwork(this);
        } 

    } 

}
