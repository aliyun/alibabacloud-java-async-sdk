// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

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
 * {@link ListLayer7CustomPortsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLayer7CustomPortsResponseBody</p>
 */
public class ListLayer7CustomPortsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Layer7CustomPorts")
    private java.util.List<Layer7CustomPorts> layer7CustomPorts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListLayer7CustomPortsResponseBody(Builder builder) {
        this.layer7CustomPorts = builder.layer7CustomPorts;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLayer7CustomPortsResponseBody create() {
        return builder().build();
    }

    /**
     * @return layer7CustomPorts
     */
    public java.util.List<Layer7CustomPorts> getLayer7CustomPorts() {
        return this.layer7CustomPorts;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Layer7CustomPorts> layer7CustomPorts; 
        private String requestId; 

        /**
         * Layer7CustomPorts.
         */
        public Builder layer7CustomPorts(java.util.List<Layer7CustomPorts> layer7CustomPorts) {
            this.layer7CustomPorts = layer7CustomPorts;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListLayer7CustomPortsResponseBody build() {
            return new ListLayer7CustomPortsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLayer7CustomPortsResponseBody} extends {@link TeaModel}
     *
     * <p>ListLayer7CustomPortsResponseBody</p>
     */
    public static class Layer7CustomPorts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Flag")
        private String flag;

        @com.aliyun.core.annotation.NameInMap("ProxyPorts")
        private java.util.List<String> proxyPorts;

        @com.aliyun.core.annotation.NameInMap("ProxyType")
        private String proxyType;

        private Layer7CustomPorts(Builder builder) {
            this.flag = builder.flag;
            this.proxyPorts = builder.proxyPorts;
            this.proxyType = builder.proxyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Layer7CustomPorts create() {
            return builder().build();
        }

        /**
         * @return flag
         */
        public String getFlag() {
            return this.flag;
        }

        /**
         * @return proxyPorts
         */
        public java.util.List<String> getProxyPorts() {
            return this.proxyPorts;
        }

        /**
         * @return proxyType
         */
        public String getProxyType() {
            return this.proxyType;
        }

        public static final class Builder {
            private String flag; 
            private java.util.List<String> proxyPorts; 
            private String proxyType; 

            /**
             * Flag.
             */
            public Builder flag(String flag) {
                this.flag = flag;
                return this;
            }

            /**
             * ProxyPorts.
             */
            public Builder proxyPorts(java.util.List<String> proxyPorts) {
                this.proxyPorts = proxyPorts;
                return this;
            }

            /**
             * ProxyType.
             */
            public Builder proxyType(String proxyType) {
                this.proxyType = proxyType;
                return this;
            }

            public Layer7CustomPorts build() {
                return new Layer7CustomPorts(this);
            } 

        } 

    }
}
