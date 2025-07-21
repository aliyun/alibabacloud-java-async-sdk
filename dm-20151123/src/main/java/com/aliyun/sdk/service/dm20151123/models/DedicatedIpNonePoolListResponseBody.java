// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link DedicatedIpNonePoolListResponseBody} extends {@link TeaModel}
 *
 * <p>DedicatedIpNonePoolListResponseBody</p>
 */
public class DedicatedIpNonePoolListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Ips")
    private java.util.List<Ips> ips;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DedicatedIpNonePoolListResponseBody(Builder builder) {
        this.ips = builder.ips;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DedicatedIpNonePoolListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ips
     */
    public java.util.List<Ips> getIps() {
        return this.ips;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Ips> ips; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DedicatedIpNonePoolListResponseBody model) {
            this.ips = model.ips;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Information on IPs not added to the IP pool</p>
         */
        public Builder ips(java.util.List<Ips> ips) {
            this.ips = ips;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DedicatedIpNonePoolListResponseBody build() {
            return new DedicatedIpNonePoolListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DedicatedIpNonePoolListResponseBody} extends {@link TeaModel}
     *
     * <p>DedicatedIpNonePoolListResponseBody</p>
     */
    public static class Ips extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        private Ips(Builder builder) {
            this.id = builder.id;
            this.ip = builder.ip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ips create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        public static final class Builder {
            private String id; 
            private String ip; 

            private Builder() {
            } 

            private Builder(Ips model) {
                this.id = model.id;
                this.ip = model.ip;
            } 

            /**
             * <p>Purchased instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>IP address</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            public Ips build() {
                return new Ips(this);
            } 

        } 

    }
}
