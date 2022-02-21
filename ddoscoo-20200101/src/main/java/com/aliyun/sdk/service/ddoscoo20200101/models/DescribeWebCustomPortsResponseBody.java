// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebCustomPortsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebCustomPortsResponseBody</p>
 */
public class DescribeWebCustomPortsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("WebCustomPorts")
    private java.util.List < WebCustomPorts> webCustomPorts;

    private DescribeWebCustomPortsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.webCustomPorts = builder.webCustomPorts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebCustomPortsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return webCustomPorts
     */
    public java.util.List < WebCustomPorts> getWebCustomPorts() {
        return this.webCustomPorts;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < WebCustomPorts> webCustomPorts; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WebCustomPorts.
         */
        public Builder webCustomPorts(java.util.List < WebCustomPorts> webCustomPorts) {
            this.webCustomPorts = webCustomPorts;
            return this;
        }

        public DescribeWebCustomPortsResponseBody build() {
            return new DescribeWebCustomPortsResponseBody(this);
        } 

    } 

    public static class WebCustomPorts extends TeaModel {
        @NameInMap("ProxyPorts")
        private java.util.List < String > proxyPorts;

        @NameInMap("ProxyType")
        private String proxyType;

        private WebCustomPorts(Builder builder) {
            this.proxyPorts = builder.proxyPorts;
            this.proxyType = builder.proxyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebCustomPorts create() {
            return builder().build();
        }

        /**
         * @return proxyPorts
         */
        public java.util.List < String > getProxyPorts() {
            return this.proxyPorts;
        }

        /**
         * @return proxyType
         */
        public String getProxyType() {
            return this.proxyType;
        }

        public static final class Builder {
            private java.util.List < String > proxyPorts; 
            private String proxyType; 

            /**
             * ProxyPorts.
             */
            public Builder proxyPorts(java.util.List < String > proxyPorts) {
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

            public WebCustomPorts build() {
                return new WebCustomPorts(this);
            } 

        } 

    }
}
