// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20170601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHiTSDBInstanceSecurityIpListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHiTSDBInstanceSecurityIpListResponseBody</p>
 */
public class DescribeHiTSDBInstanceSecurityIpListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityIpList")
    private java.util.List < SecurityIpList> securityIpList;

    private DescribeHiTSDBInstanceSecurityIpListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityIpList = builder.securityIpList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHiTSDBInstanceSecurityIpListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityIpList
     */
    public java.util.List < SecurityIpList> getSecurityIpList() {
        return this.securityIpList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SecurityIpList> securityIpList; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SecurityIpList.
         */
        public Builder securityIpList(java.util.List < SecurityIpList> securityIpList) {
            this.securityIpList = securityIpList;
            return this;
        }

        public DescribeHiTSDBInstanceSecurityIpListResponseBody build() {
            return new DescribeHiTSDBInstanceSecurityIpListResponseBody(this);
        } 

    } 

    public static class SecurityIpList extends TeaModel {
        @NameInMap("Ip")
        private String ip;

        private SecurityIpList(Builder builder) {
            this.ip = builder.ip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityIpList create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        public static final class Builder {
            private String ip; 

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            public SecurityIpList build() {
                return new SecurityIpList(this);
            } 

        } 

    }
}
