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
 * {@link ListDomainAccessLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDomainAccessLogsResponseBody</p>
 */
public class ListDomainAccessLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessLogs")
    private java.util.List<AccessLogs> accessLogs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Integer totalNum;

    private ListDomainAccessLogsResponseBody(Builder builder) {
        this.accessLogs = builder.accessLogs;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDomainAccessLogsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessLogs
     */
    public java.util.List<AccessLogs> getAccessLogs() {
        return this.accessLogs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalNum
     */
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private java.util.List<AccessLogs> accessLogs; 
        private String requestId; 
        private Integer totalNum; 

        private Builder() {
        } 

        private Builder(ListDomainAccessLogsResponseBody model) {
            this.accessLogs = model.accessLogs;
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
        } 

        /**
         * AccessLogs.
         */
        public Builder accessLogs(java.util.List<AccessLogs> accessLogs) {
            this.accessLogs = accessLogs;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>019F68B6-A17E-5ECD-B053-820242E5ADBF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalNum.
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public ListDomainAccessLogsResponseBody build() {
            return new ListDomainAccessLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDomainAccessLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDomainAccessLogsResponseBody</p>
     */
    public static class AccessLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockAction")
        private String blockAction;

        @com.aliyun.core.annotation.NameInMap("Department")
        private String department;

        @com.aliyun.core.annotation.NameInMap("DestAddress")
        private String destAddress;

        @com.aliyun.core.annotation.NameInMap("EventTime")
        private String eventTime;

        @com.aliyun.core.annotation.NameInMap("L4ProtocolType")
        private String l4ProtocolType;

        @com.aliyun.core.annotation.NameInMap("ProcessName")
        private String processName;

        @com.aliyun.core.annotation.NameInMap("RemoteAddress")
        private String remoteAddress;

        @com.aliyun.core.annotation.NameInMap("RemoteHost")
        private String remoteHost;

        @com.aliyun.core.annotation.NameInMap("RemotePort")
        private String remotePort;

        @com.aliyun.core.annotation.NameInMap("SrcAddress")
        private String srcAddress;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private AccessLogs(Builder builder) {
            this.blockAction = builder.blockAction;
            this.department = builder.department;
            this.destAddress = builder.destAddress;
            this.eventTime = builder.eventTime;
            this.l4ProtocolType = builder.l4ProtocolType;
            this.processName = builder.processName;
            this.remoteAddress = builder.remoteAddress;
            this.remoteHost = builder.remoteHost;
            this.remotePort = builder.remotePort;
            this.srcAddress = builder.srcAddress;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessLogs create() {
            return builder().build();
        }

        /**
         * @return blockAction
         */
        public String getBlockAction() {
            return this.blockAction;
        }

        /**
         * @return department
         */
        public String getDepartment() {
            return this.department;
        }

        /**
         * @return destAddress
         */
        public String getDestAddress() {
            return this.destAddress;
        }

        /**
         * @return eventTime
         */
        public String getEventTime() {
            return this.eventTime;
        }

        /**
         * @return l4ProtocolType
         */
        public String getL4ProtocolType() {
            return this.l4ProtocolType;
        }

        /**
         * @return processName
         */
        public String getProcessName() {
            return this.processName;
        }

        /**
         * @return remoteAddress
         */
        public String getRemoteAddress() {
            return this.remoteAddress;
        }

        /**
         * @return remoteHost
         */
        public String getRemoteHost() {
            return this.remoteHost;
        }

        /**
         * @return remotePort
         */
        public String getRemotePort() {
            return this.remotePort;
        }

        /**
         * @return srcAddress
         */
        public String getSrcAddress() {
            return this.srcAddress;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String blockAction; 
            private String department; 
            private String destAddress; 
            private String eventTime; 
            private String l4ProtocolType; 
            private String processName; 
            private String remoteAddress; 
            private String remoteHost; 
            private String remotePort; 
            private String srcAddress; 
            private String username; 

            private Builder() {
            } 

            private Builder(AccessLogs model) {
                this.blockAction = model.blockAction;
                this.department = model.department;
                this.destAddress = model.destAddress;
                this.eventTime = model.eventTime;
                this.l4ProtocolType = model.l4ProtocolType;
                this.processName = model.processName;
                this.remoteAddress = model.remoteAddress;
                this.remoteHost = model.remoteHost;
                this.remotePort = model.remotePort;
                this.srcAddress = model.srcAddress;
                this.username = model.username;
            } 

            /**
             * BlockAction.
             */
            public Builder blockAction(String blockAction) {
                this.blockAction = blockAction;
                return this;
            }

            /**
             * Department.
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * DestAddress.
             */
            public Builder destAddress(String destAddress) {
                this.destAddress = destAddress;
                return this;
            }

            /**
             * EventTime.
             */
            public Builder eventTime(String eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * L4ProtocolType.
             */
            public Builder l4ProtocolType(String l4ProtocolType) {
                this.l4ProtocolType = l4ProtocolType;
                return this;
            }

            /**
             * ProcessName.
             */
            public Builder processName(String processName) {
                this.processName = processName;
                return this;
            }

            /**
             * RemoteAddress.
             */
            public Builder remoteAddress(String remoteAddress) {
                this.remoteAddress = remoteAddress;
                return this;
            }

            /**
             * RemoteHost.
             */
            public Builder remoteHost(String remoteHost) {
                this.remoteHost = remoteHost;
                return this;
            }

            /**
             * RemotePort.
             */
            public Builder remotePort(String remotePort) {
                this.remotePort = remotePort;
                return this;
            }

            /**
             * SrcAddress.
             */
            public Builder srcAddress(String srcAddress) {
                this.srcAddress = srcAddress;
                return this;
            }

            /**
             * Username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public AccessLogs build() {
                return new AccessLogs(this);
            } 

        } 

    }
}
