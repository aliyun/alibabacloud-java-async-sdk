// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeUserIPSWhitelistResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserIPSWhitelistResponseBody</p>
 */
public class DescribeUserIPSWhitelistResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Ipv6Whitelists")
    private java.util.List<Ipv6Whitelists> ipv6Whitelists;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Whitelists")
    private java.util.List<Whitelists> whitelists;

    private DescribeUserIPSWhitelistResponseBody(Builder builder) {
        this.ipv6Whitelists = builder.ipv6Whitelists;
        this.requestId = builder.requestId;
        this.whitelists = builder.whitelists;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserIPSWhitelistResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipv6Whitelists
     */
    public java.util.List<Ipv6Whitelists> getIpv6Whitelists() {
        return this.ipv6Whitelists;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return whitelists
     */
    public java.util.List<Whitelists> getWhitelists() {
        return this.whitelists;
    }

    public static final class Builder {
        private java.util.List<Ipv6Whitelists> ipv6Whitelists; 
        private String requestId; 
        private java.util.List<Whitelists> whitelists; 

        private Builder() {
        } 

        private Builder(DescribeUserIPSWhitelistResponseBody model) {
            this.ipv6Whitelists = model.ipv6Whitelists;
            this.requestId = model.requestId;
            this.whitelists = model.whitelists;
        } 

        /**
         * <p>The list of IPv6 whitelists for the IPS on the Internet Border.</p>
         */
        public Builder ipv6Whitelists(java.util.List<Ipv6Whitelists> ipv6Whitelists) {
            this.ipv6Whitelists = ipv6Whitelists;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F788A5-6A47-5EA9-AC30-CA4DB98AD520</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of IPv4 whitelists for the IPS on the Internet Border.</p>
         */
        public Builder whitelists(java.util.List<Whitelists> whitelists) {
            this.whitelists = whitelists;
            return this;
        }

        public DescribeUserIPSWhitelistResponseBody build() {
            return new DescribeUserIPSWhitelistResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserIPSWhitelistResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserIPSWhitelistResponseBody</p>
     */
    public static class Ipv6Whitelists extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Direction")
        private Long direction;

        @com.aliyun.core.annotation.NameInMap("ListType")
        private Long listType;

        @com.aliyun.core.annotation.NameInMap("ListValue")
        private String listValue;

        @com.aliyun.core.annotation.NameInMap("WhiteListValue")
        private java.util.List<String> whiteListValue;

        @com.aliyun.core.annotation.NameInMap("WhiteType")
        private Long whiteType;

        private Ipv6Whitelists(Builder builder) {
            this.direction = builder.direction;
            this.listType = builder.listType;
            this.listValue = builder.listValue;
            this.whiteListValue = builder.whiteListValue;
            this.whiteType = builder.whiteType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6Whitelists create() {
            return builder().build();
        }

        /**
         * @return direction
         */
        public Long getDirection() {
            return this.direction;
        }

        /**
         * @return listType
         */
        public Long getListType() {
            return this.listType;
        }

        /**
         * @return listValue
         */
        public String getListValue() {
            return this.listValue;
        }

        /**
         * @return whiteListValue
         */
        public java.util.List<String> getWhiteListValue() {
            return this.whiteListValue;
        }

        /**
         * @return whiteType
         */
        public Long getWhiteType() {
            return this.whiteType;
        }

        public static final class Builder {
            private Long direction; 
            private Long listType; 
            private String listValue; 
            private java.util.List<String> whiteListValue; 
            private Long whiteType; 

            private Builder() {
            } 

            private Builder(Ipv6Whitelists model) {
                this.direction = model.direction;
                this.listType = model.listType;
                this.listValue = model.listValue;
                this.whiteListValue = model.whiteListValue;
                this.whiteType = model.whiteType;
            } 

            /**
             * <p>The direction of IPv6 traffic on the Internet Border.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder direction(Long direction) {
                this.direction = direction;
                return this;
            }

            /**
             * <p>The type of address in the IPv6 whitelist for the Internet.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder listType(Long listType) {
                this.listType = listType;
                return this;
            }

            /**
             * <p>The value of the IPv6 whitelist on the Internet Border.</p>
             * <ul>
             * <li><p>If the whitelist type is <code>custom input</code>: the name of the address book.</p>
             * </li>
             * <li><p>If the whitelist type is <code>address book reference</code>: an IPv6 address.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2408:400a:81a:7900:a77d:ea36:fcbf:de40/128</p>
             */
            public Builder listValue(String listValue) {
                this.listValue = listValue;
                return this;
            }

            /**
             * <p>The list of IPv6 whitelists for the Internet.</p>
             */
            public Builder whiteListValue(java.util.List<String> whiteListValue) {
                this.whiteListValue = whiteListValue;
                return this;
            }

            /**
             * <p>The type of source or destination for which the IPv6 whitelist on the Internet Border takes effect.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder whiteType(Long whiteType) {
                this.whiteType = whiteType;
                return this;
            }

            public Ipv6Whitelists build() {
                return new Ipv6Whitelists(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUserIPSWhitelistResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserIPSWhitelistResponseBody</p>
     */
    public static class Whitelists extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Direction")
        private Long direction;

        @com.aliyun.core.annotation.NameInMap("ListType")
        private Long listType;

        @com.aliyun.core.annotation.NameInMap("ListValue")
        private String listValue;

        @com.aliyun.core.annotation.NameInMap("WhiteListValue")
        private java.util.List<String> whiteListValue;

        @com.aliyun.core.annotation.NameInMap("WhiteType")
        private Long whiteType;

        private Whitelists(Builder builder) {
            this.direction = builder.direction;
            this.listType = builder.listType;
            this.listValue = builder.listValue;
            this.whiteListValue = builder.whiteListValue;
            this.whiteType = builder.whiteType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Whitelists create() {
            return builder().build();
        }

        /**
         * @return direction
         */
        public Long getDirection() {
            return this.direction;
        }

        /**
         * @return listType
         */
        public Long getListType() {
            return this.listType;
        }

        /**
         * @return listValue
         */
        public String getListValue() {
            return this.listValue;
        }

        /**
         * @return whiteListValue
         */
        public java.util.List<String> getWhiteListValue() {
            return this.whiteListValue;
        }

        /**
         * @return whiteType
         */
        public Long getWhiteType() {
            return this.whiteType;
        }

        public static final class Builder {
            private Long direction; 
            private Long listType; 
            private String listValue; 
            private java.util.List<String> whiteListValue; 
            private Long whiteType; 

            private Builder() {
            } 

            private Builder(Whitelists model) {
                this.direction = model.direction;
                this.listType = model.listType;
                this.listValue = model.listValue;
                this.whiteListValue = model.whiteListValue;
                this.whiteType = model.whiteType;
            } 

            /**
             * <p>The direction of IPv4 traffic on the Internet Border.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder direction(Long direction) {
                this.direction = direction;
                return this;
            }

            /**
             * <p>The type of address in the IPv4 whitelist for the Internet.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder listType(Long listType) {
                this.listType = listType;
                return this;
            }

            /**
             * <p>The value of the IPv4 whitelist on the Internet Border.</p>
             * <ul>
             * <li><p>If the whitelist type is <code>custom input</code>: the name of the address book.</p>
             * </li>
             * <li><p>If the whitelist type is <code>address book reference</code>: an IPv4 address.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>10.10.200.4/32,10.10.200.25/32</p>
             */
            public Builder listValue(String listValue) {
                this.listValue = listValue;
                return this;
            }

            /**
             * <p>The list of IPv4 whitelists for the Internet.</p>
             */
            public Builder whiteListValue(java.util.List<String> whiteListValue) {
                this.whiteListValue = whiteListValue;
                return this;
            }

            /**
             * <p>The type of source or destination for which the IPv4 whitelist on the Internet Border takes effect.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder whiteType(Long whiteType) {
                this.whiteType = whiteType;
                return this;
            }

            public Whitelists build() {
                return new Whitelists(this);
            } 

        } 

    }
}
