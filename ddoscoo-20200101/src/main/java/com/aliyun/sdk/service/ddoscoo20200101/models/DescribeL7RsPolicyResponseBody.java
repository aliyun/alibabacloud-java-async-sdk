// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeL7RsPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeL7RsPolicyResponseBody</p>
 */
public class DescribeL7RsPolicyResponseBody extends TeaModel {
    @NameInMap("Attributes")
    private java.util.List < Attributes> attributes;

    @NameInMap("ProxyMode")
    private String proxyMode;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeL7RsPolicyResponseBody(Builder builder) {
        this.attributes = builder.attributes;
        this.proxyMode = builder.proxyMode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeL7RsPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return attributes
     */
    public java.util.List < Attributes> getAttributes() {
        return this.attributes;
    }

    /**
     * @return proxyMode
     */
    public String getProxyMode() {
        return this.proxyMode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Attributes> attributes; 
        private String proxyMode; 
        private String requestId; 

        /**
         * Attributes.
         */
        public Builder attributes(java.util.List < Attributes> attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * ProxyMode.
         */
        public Builder proxyMode(String proxyMode) {
            this.proxyMode = proxyMode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeL7RsPolicyResponseBody build() {
            return new DescribeL7RsPolicyResponseBody(this);
        } 

    } 

    public static class Attribute extends TeaModel {
        @NameInMap("Weight")
        private Integer weight;

        private Attribute(Builder builder) {
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attribute create() {
            return builder().build();
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private Integer weight; 

            /**
             * Weight.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public Attribute build() {
                return new Attribute(this);
            } 

        } 

    }
    public static class Attributes extends TeaModel {
        @NameInMap("Attribute")
        private Attribute attribute;

        @NameInMap("RealServer")
        private String realServer;

        @NameInMap("RsType")
        private Integer rsType;

        private Attributes(Builder builder) {
            this.attribute = builder.attribute;
            this.realServer = builder.realServer;
            this.rsType = builder.rsType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attributes create() {
            return builder().build();
        }

        /**
         * @return attribute
         */
        public Attribute getAttribute() {
            return this.attribute;
        }

        /**
         * @return realServer
         */
        public String getRealServer() {
            return this.realServer;
        }

        /**
         * @return rsType
         */
        public Integer getRsType() {
            return this.rsType;
        }

        public static final class Builder {
            private Attribute attribute; 
            private String realServer; 
            private Integer rsType; 

            /**
             * Attribute.
             */
            public Builder attribute(Attribute attribute) {
                this.attribute = attribute;
                return this;
            }

            /**
             * RealServer.
             */
            public Builder realServer(String realServer) {
                this.realServer = realServer;
                return this;
            }

            /**
             * RsType.
             */
            public Builder rsType(Integer rsType) {
                this.rsType = rsType;
                return this;
            }

            public Attributes build() {
                return new Attributes(this);
            } 

        } 

    }
}
