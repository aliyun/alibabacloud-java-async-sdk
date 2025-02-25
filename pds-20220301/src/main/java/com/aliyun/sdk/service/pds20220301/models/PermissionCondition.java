// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link PermissionCondition} extends {@link TeaModel}
 *
 * <p>PermissionCondition</p>
 */
public class PermissionCondition extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ip_equals")
    private IpEquals ipEquals;

    @com.aliyun.core.annotation.NameInMap("ip_not_equals")
    private IpNotEquals ipNotEquals;

    @com.aliyun.core.annotation.NameInMap("string_like")
    private StringLike stringLike;

    @com.aliyun.core.annotation.NameInMap("string_not_like")
    private StringNotLike stringNotLike;

    private PermissionCondition(Builder builder) {
        this.ipEquals = builder.ipEquals;
        this.ipNotEquals = builder.ipNotEquals;
        this.stringLike = builder.stringLike;
        this.stringNotLike = builder.stringNotLike;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PermissionCondition create() {
        return builder().build();
    }

    /**
     * @return ipEquals
     */
    public IpEquals getIpEquals() {
        return this.ipEquals;
    }

    /**
     * @return ipNotEquals
     */
    public IpNotEquals getIpNotEquals() {
        return this.ipNotEquals;
    }

    /**
     * @return stringLike
     */
    public StringLike getStringLike() {
        return this.stringLike;
    }

    /**
     * @return stringNotLike
     */
    public StringNotLike getStringNotLike() {
        return this.stringNotLike;
    }

    public static final class Builder {
        private IpEquals ipEquals; 
        private IpNotEquals ipNotEquals; 
        private StringLike stringLike; 
        private StringNotLike stringNotLike; 

        /**
         * ip_equals.
         */
        public Builder ipEquals(IpEquals ipEquals) {
            this.ipEquals = ipEquals;
            return this;
        }

        /**
         * ip_not_equals.
         */
        public Builder ipNotEquals(IpNotEquals ipNotEquals) {
            this.ipNotEquals = ipNotEquals;
            return this;
        }

        /**
         * string_like.
         */
        public Builder stringLike(StringLike stringLike) {
            this.stringLike = stringLike;
            return this;
        }

        /**
         * string_not_like.
         */
        public Builder stringNotLike(StringNotLike stringNotLike) {
            this.stringNotLike = stringNotLike;
            return this;
        }

        public PermissionCondition build() {
            return new PermissionCondition(this);
        } 

    } 

    /**
     * 
     * {@link PermissionCondition} extends {@link TeaModel}
     *
     * <p>PermissionCondition</p>
     */
    public static class IpEquals extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("client_ip")
        private java.util.List<String> clientIp;

        private IpEquals(Builder builder) {
            this.clientIp = builder.clientIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpEquals create() {
            return builder().build();
        }

        /**
         * @return clientIp
         */
        public java.util.List<String> getClientIp() {
            return this.clientIp;
        }

        public static final class Builder {
            private java.util.List<String> clientIp; 

            /**
             * client_ip.
             */
            public Builder clientIp(java.util.List<String> clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            public IpEquals build() {
                return new IpEquals(this);
            } 

        } 

    }
    /**
     * 
     * {@link PermissionCondition} extends {@link TeaModel}
     *
     * <p>PermissionCondition</p>
     */
    public static class IpNotEquals extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("client_ip")
        private java.util.List<String> clientIp;

        private IpNotEquals(Builder builder) {
            this.clientIp = builder.clientIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpNotEquals create() {
            return builder().build();
        }

        /**
         * @return clientIp
         */
        public java.util.List<String> getClientIp() {
            return this.clientIp;
        }

        public static final class Builder {
            private java.util.List<String> clientIp; 

            /**
             * client_ip.
             */
            public Builder clientIp(java.util.List<String> clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            public IpNotEquals build() {
                return new IpNotEquals(this);
            } 

        } 

    }
    /**
     * 
     * {@link PermissionCondition} extends {@link TeaModel}
     *
     * <p>PermissionCondition</p>
     */
    public static class StringLike extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("vpc_id")
        private java.util.List<String> vpcId;

        private StringLike(Builder builder) {
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StringLike create() {
            return builder().build();
        }

        /**
         * @return vpcId
         */
        public java.util.List<String> getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private java.util.List<String> vpcId; 

            /**
             * vpc_id.
             */
            public Builder vpcId(java.util.List<String> vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public StringLike build() {
                return new StringLike(this);
            } 

        } 

    }
    /**
     * 
     * {@link PermissionCondition} extends {@link TeaModel}
     *
     * <p>PermissionCondition</p>
     */
    public static class StringNotLike extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("vpc_id")
        private java.util.List<String> vpcId;

        private StringNotLike(Builder builder) {
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StringNotLike create() {
            return builder().build();
        }

        /**
         * @return vpcId
         */
        public java.util.List<String> getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private java.util.List<String> vpcId; 

            /**
             * vpc_id.
             */
            public Builder vpcId(java.util.List<String> vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public StringNotLike build() {
                return new StringNotLike(this);
            } 

        } 

    }
}
