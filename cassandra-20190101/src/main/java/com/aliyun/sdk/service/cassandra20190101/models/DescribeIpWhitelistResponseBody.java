// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIpWhitelistResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIpWhitelistResponseBody</p>
 */
public class DescribeIpWhitelistResponseBody extends TeaModel {
    @NameInMap("IpList")
    private IpList ipList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeIpWhitelistResponseBody(Builder builder) {
        this.ipList = builder.ipList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpWhitelistResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipList
     */
    public IpList getIpList() {
        return this.ipList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private IpList ipList; 
        private String requestId; 

        /**
         * IpList.
         */
        public Builder ipList(IpList ipList) {
            this.ipList = ipList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeIpWhitelistResponseBody build() {
            return new DescribeIpWhitelistResponseBody(this);
        } 

    } 

    public static class IpList extends TeaModel {
        @NameInMap("IP")
        private java.util.List < String > IP;

        private IpList(Builder builder) {
            this.IP = builder.IP;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpList create() {
            return builder().build();
        }

        /**
         * @return IP
         */
        public java.util.List < String > getIP() {
            return this.IP;
        }

        public static final class Builder {
            private java.util.List < String > IP; 

            /**
             * IP.
             */
            public Builder IP(java.util.List < String > IP) {
                this.IP = IP;
                return this;
            }

            public IpList build() {
                return new IpList(this);
            } 

        } 

    }
}
