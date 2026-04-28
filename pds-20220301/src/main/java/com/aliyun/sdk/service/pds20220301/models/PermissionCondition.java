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
    @com.aliyun.core.annotation.NameInMap("bool_equals")
    private BoolEquals boolEquals;

    @com.aliyun.core.annotation.NameInMap("bool_not_equals")
    private BoolNotEquals boolNotEquals;

    @com.aliyun.core.annotation.NameInMap("ip_equals")
    private IpEquals ipEquals;

    @com.aliyun.core.annotation.NameInMap("ip_not_equals")
    private IpNotEquals ipNotEquals;

    @com.aliyun.core.annotation.NameInMap("string_like")
    private StringLike stringLike;

    @com.aliyun.core.annotation.NameInMap("string_not_like")
    private StringNotLike stringNotLike;

    private PermissionCondition(Builder builder) {
        this.boolEquals = builder.boolEquals;
        this.boolNotEquals = builder.boolNotEquals;
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return boolEquals
     */
    public BoolEquals getBoolEquals() {
        return this.boolEquals;
    }

    /**
     * @return boolNotEquals
     */
    public BoolNotEquals getBoolNotEquals() {
        return this.boolNotEquals;
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
        private BoolEquals boolEquals; 
        private BoolNotEquals boolNotEquals; 
        private IpEquals ipEquals; 
        private IpNotEquals ipNotEquals; 
        private StringLike stringLike; 
        private StringNotLike stringNotLike; 

        private Builder() {
        } 

        private Builder(PermissionCondition model) {
            this.boolEquals = model.boolEquals;
            this.boolNotEquals = model.boolNotEquals;
            this.ipEquals = model.ipEquals;
            this.ipNotEquals = model.ipNotEquals;
            this.stringLike = model.stringLike;
            this.stringNotLike = model.stringNotLike;
        } 

        /**
         * bool_equals.
         */
        public Builder boolEquals(BoolEquals boolEquals) {
            this.boolEquals = boolEquals;
            return this;
        }

        /**
         * bool_not_equals.
         */
        public Builder boolNotEquals(BoolNotEquals boolNotEquals) {
            this.boolNotEquals = boolNotEquals;
            return this;
        }

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
    public static class BoolEquals extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("is_share_link")
        private Boolean isShareLink;

        private BoolEquals(Builder builder) {
            this.isShareLink = builder.isShareLink;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BoolEquals create() {
            return builder().build();
        }

        /**
         * @return isShareLink
         */
        public Boolean getIsShareLink() {
            return this.isShareLink;
        }

        public static final class Builder {
            private Boolean isShareLink; 

            private Builder() {
            } 

            private Builder(BoolEquals model) {
                this.isShareLink = model.isShareLink;
            } 

            /**
             * is_share_link.
             */
            public Builder isShareLink(Boolean isShareLink) {
                this.isShareLink = isShareLink;
                return this;
            }

            public BoolEquals build() {
                return new BoolEquals(this);
            } 

        } 

    }
    /**
     * 
     * {@link PermissionCondition} extends {@link TeaModel}
     *
     * <p>PermissionCondition</p>
     */
    public static class BoolNotEquals extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("is_share_link")
        private Boolean isShareLink;

        private BoolNotEquals(Builder builder) {
            this.isShareLink = builder.isShareLink;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BoolNotEquals create() {
            return builder().build();
        }

        /**
         * @return isShareLink
         */
        public Boolean getIsShareLink() {
            return this.isShareLink;
        }

        public static final class Builder {
            private Boolean isShareLink; 

            private Builder() {
            } 

            private Builder(BoolNotEquals model) {
                this.isShareLink = model.isShareLink;
            } 

            /**
             * is_share_link.
             */
            public Builder isShareLink(Boolean isShareLink) {
                this.isShareLink = isShareLink;
                return this;
            }

            public BoolNotEquals build() {
                return new BoolNotEquals(this);
            } 

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

            private Builder() {
            } 

            private Builder(IpEquals model) {
                this.clientIp = model.clientIp;
            } 

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

            private Builder() {
            } 

            private Builder(IpNotEquals model) {
                this.clientIp = model.clientIp;
            } 

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

            private Builder() {
            } 

            private Builder(StringLike model) {
                this.vpcId = model.vpcId;
            } 

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

            private Builder() {
            } 

            private Builder(StringNotLike model) {
                this.vpcId = model.vpcId;
            } 

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
