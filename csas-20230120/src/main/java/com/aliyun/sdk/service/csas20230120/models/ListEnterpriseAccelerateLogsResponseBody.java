// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListEnterpriseAccelerateLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEnterpriseAccelerateLogsResponseBody</p>
 */
public class ListEnterpriseAccelerateLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Logs")
    private java.util.List<Logs> logs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNumber")
    private Integer totalNumber;

    private ListEnterpriseAccelerateLogsResponseBody(Builder builder) {
        this.logs = builder.logs;
        this.requestId = builder.requestId;
        this.totalNumber = builder.totalNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnterpriseAccelerateLogsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logs
     */
    public java.util.List<Logs> getLogs() {
        return this.logs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalNumber
     */
    public Integer getTotalNumber() {
        return this.totalNumber;
    }

    public static final class Builder {
        private java.util.List<Logs> logs; 
        private String requestId; 
        private Integer totalNumber; 

        private Builder() {
        } 

        private Builder(ListEnterpriseAccelerateLogsResponseBody model) {
            this.logs = model.logs;
            this.requestId = model.requestId;
            this.totalNumber = model.totalNumber;
        } 

        /**
         * <p>List of logs.</p>
         */
        public Builder logs(java.util.List<Logs> logs) {
            this.logs = logs;
            return this;
        }

        /**
         * <p>The ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>43F07A6A-294D-56FB-85EB-6AD00C5B60FF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of logs.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        public Builder totalNumber(Integer totalNumber) {
            this.totalNumber = totalNumber;
            return this;
        }

        public ListEnterpriseAccelerateLogsResponseBody build() {
            return new ListEnterpriseAccelerateLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEnterpriseAccelerateLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEnterpriseAccelerateLogsResponseBody</p>
     */
    public static class Logs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Department")
        private String department;

        @com.aliyun.core.annotation.NameInMap("DeviceType")
        private String deviceType;

        @com.aliyun.core.annotation.NameInMap("DstAddr")
        private String dstAddr;

        @com.aliyun.core.annotation.NameInMap("InBytes")
        private String inBytes;

        @com.aliyun.core.annotation.NameInMap("OutBytes")
        private String outBytes;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("ProxyAddr")
        private String proxyAddr;

        @com.aliyun.core.annotation.NameInMap("UnixTime")
        private String unixTime;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private Logs(Builder builder) {
            this.department = builder.department;
            this.deviceType = builder.deviceType;
            this.dstAddr = builder.dstAddr;
            this.inBytes = builder.inBytes;
            this.outBytes = builder.outBytes;
            this.policyName = builder.policyName;
            this.proxyAddr = builder.proxyAddr;
            this.unixTime = builder.unixTime;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logs create() {
            return builder().build();
        }

        /**
         * @return department
         */
        public String getDepartment() {
            return this.department;
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return dstAddr
         */
        public String getDstAddr() {
            return this.dstAddr;
        }

        /**
         * @return inBytes
         */
        public String getInBytes() {
            return this.inBytes;
        }

        /**
         * @return outBytes
         */
        public String getOutBytes() {
            return this.outBytes;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        /**
         * @return proxyAddr
         */
        public String getProxyAddr() {
            return this.proxyAddr;
        }

        /**
         * @return unixTime
         */
        public String getUnixTime() {
            return this.unixTime;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String department; 
            private String deviceType; 
            private String dstAddr; 
            private String inBytes; 
            private String outBytes; 
            private String policyName; 
            private String proxyAddr; 
            private String unixTime; 
            private String username; 

            private Builder() {
            } 

            private Builder(Logs model) {
                this.department = model.department;
                this.deviceType = model.deviceType;
                this.dstAddr = model.dstAddr;
                this.inBytes = model.inBytes;
                this.outBytes = model.outBytes;
                this.policyName = model.policyName;
                this.proxyAddr = model.proxyAddr;
                this.unixTime = model.unixTime;
                this.username = model.username;
            } 

            /**
             * <p>Department.</p>
             * 
             * <strong>example:</strong>
             * <p>测试部</p>
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * <p>Device type.</p>
             * 
             * <strong>example:</strong>
             * <p>windows</p>
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * <p>Destination endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.bing.com:443">www.bing.com:443</a></p>
             */
            public Builder dstAddr(String dstAddr) {
                this.dstAddr = dstAddr;
                return this;
            }

            /**
             * <p>Inbound traffic, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>12299</p>
             */
            public Builder inBytes(String inBytes) {
                this.inBytes = inBytes;
                return this;
            }

            /**
             * <p>Outbound traffic, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>2603</p>
             */
            public Builder outBytes(String outBytes) {
                this.outBytes = outBytes;
                return this;
            }

            /**
             * <p>Enterprise acceleration policy name.</p>
             * 
             * <strong>example:</strong>
             * <p>白名单加速</p>
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * <p>Enterprise acceleration instance address.</p>
             * 
             * <strong>example:</strong>
             * <p>8.222.179.xxx:10015</p>
             */
            public Builder proxyAddr(String proxyAddr) {
                this.proxyAddr = proxyAddr;
                return this;
            }

            /**
             * <p>Time.</p>
             * 
             * <strong>example:</strong>
             * <p>1748422797</p>
             */
            public Builder unixTime(String unixTime) {
                this.unixTime = unixTime;
                return this;
            }

            /**
             * <p>Username.</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Logs build() {
                return new Logs(this);
            } 

        } 

    }
}
