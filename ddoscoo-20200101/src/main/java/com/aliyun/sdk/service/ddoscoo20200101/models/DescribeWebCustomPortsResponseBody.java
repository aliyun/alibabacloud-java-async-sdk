// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeWebCustomPortsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebCustomPortsResponseBody</p>
 */
public class DescribeWebCustomPortsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WebCustomPorts")
    private java.util.List<WebCustomPorts> webCustomPorts;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<WebCustomPorts> getWebCustomPorts() {
        return this.webCustomPorts;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<WebCustomPorts> webCustomPorts; 

        private Builder() {
        } 

        private Builder(DescribeWebCustomPortsResponseBody model) {
            this.requestId = model.requestId;
            this.webCustomPorts = model.webCustomPorts;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0bcf28g5-d57c-11e7-9bs0-d89d6717dxbc</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array consisting of information about supported custom ports that are used by a website.</p>
         */
        public Builder webCustomPorts(java.util.List<WebCustomPorts> webCustomPorts) {
            this.webCustomPorts = webCustomPorts;
            return this;
        }

        public DescribeWebCustomPortsResponseBody build() {
            return new DescribeWebCustomPortsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWebCustomPortsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWebCustomPortsResponseBody</p>
     */
    public static class WebCustomPorts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProxyPorts")
        private java.util.List<String> proxyPorts;

        @com.aliyun.core.annotation.NameInMap("ProxyType")
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
            private java.util.List<String> proxyPorts; 
            private String proxyType; 

            private Builder() {
            } 

            private Builder(WebCustomPorts model) {
                this.proxyPorts = model.proxyPorts;
                this.proxyType = model.proxyType;
            } 

            /**
             * <p>An array that consists of supported custom ports.</p>
             */
            public Builder proxyPorts(java.util.List<String> proxyPorts) {
                this.proxyPorts = proxyPorts;
                return this;
            }

            /**
             * <p>The type of the protocol. Valid values:</p>
             * <ul>
             * <li><strong>http</strong></li>
             * <li><strong>https</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>http</p>
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
