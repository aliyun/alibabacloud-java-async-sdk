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

        /**
         * Ipv6Whitelists.
         */
        public Builder ipv6Whitelists(java.util.List<Ipv6Whitelists> ipv6Whitelists) {
            this.ipv6Whitelists = ipv6Whitelists;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Whitelists.
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

            /**
             * Direction.
             */
            public Builder direction(Long direction) {
                this.direction = direction;
                return this;
            }

            /**
             * ListType.
             */
            public Builder listType(Long listType) {
                this.listType = listType;
                return this;
            }

            /**
             * ListValue.
             */
            public Builder listValue(String listValue) {
                this.listValue = listValue;
                return this;
            }

            /**
             * WhiteListValue.
             */
            public Builder whiteListValue(java.util.List<String> whiteListValue) {
                this.whiteListValue = whiteListValue;
                return this;
            }

            /**
             * WhiteType.
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

            /**
             * Direction.
             */
            public Builder direction(Long direction) {
                this.direction = direction;
                return this;
            }

            /**
             * ListType.
             */
            public Builder listType(Long listType) {
                this.listType = listType;
                return this;
            }

            /**
             * ListValue.
             */
            public Builder listValue(String listValue) {
                this.listValue = listValue;
                return this;
            }

            /**
             * WhiteListValue.
             */
            public Builder whiteListValue(java.util.List<String> whiteListValue) {
                this.whiteListValue = whiteListValue;
                return this;
            }

            /**
             * WhiteType.
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
