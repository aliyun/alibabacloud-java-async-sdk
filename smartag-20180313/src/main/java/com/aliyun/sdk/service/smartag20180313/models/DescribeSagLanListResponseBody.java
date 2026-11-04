// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeSagLanListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSagLanListResponseBody</p>
 */
public class DescribeSagLanListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Lans")
    private java.util.List<Lans> lans;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskStates")
    private java.util.List<TaskStates> taskStates;

    private DescribeSagLanListResponseBody(Builder builder) {
        this.lans = builder.lans;
        this.requestId = builder.requestId;
        this.taskStates = builder.taskStates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSagLanListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lans
     */
    public java.util.List<Lans> getLans() {
        return this.lans;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskStates
     */
    public java.util.List<TaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static final class Builder {
        private java.util.List<Lans> lans; 
        private String requestId; 
        private java.util.List<TaskStates> taskStates; 

        private Builder() {
        } 

        private Builder(DescribeSagLanListResponseBody model) {
            this.lans = model.lans;
            this.requestId = model.requestId;
            this.taskStates = model.taskStates;
        } 

        /**
         * <p>The list of LAN port information.</p>
         */
        public Builder lans(java.util.List<Lans> lans) {
            this.lans = lans;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1120228A-E5E1-4E9C-B56D-96887E1A2B2F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status information of the query task.</p>
         */
        public Builder taskStates(java.util.List<TaskStates> taskStates) {
            this.taskStates = taskStates;
            return this;
        }

        public DescribeSagLanListResponseBody build() {
            return new DescribeSagLanListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSagLanListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSagLanListResponseBody</p>
     */
    public static class Lans extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndIp")
        private String endIp;

        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("IPType")
        private String IPType;

        @com.aliyun.core.annotation.NameInMap("Lease")
        private String lease;

        @com.aliyun.core.annotation.NameInMap("Mask")
        private String mask;

        @com.aliyun.core.annotation.NameInMap("PortName")
        private String portName;

        @com.aliyun.core.annotation.NameInMap("StartIp")
        private String startIp;

        private Lans(Builder builder) {
            this.endIp = builder.endIp;
            this.ip = builder.ip;
            this.IPType = builder.IPType;
            this.lease = builder.lease;
            this.mask = builder.mask;
            this.portName = builder.portName;
            this.startIp = builder.startIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Lans create() {
            return builder().build();
        }

        /**
         * @return endIp
         */
        public String getEndIp() {
            return this.endIp;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return IPType
         */
        public String getIPType() {
            return this.IPType;
        }

        /**
         * @return lease
         */
        public String getLease() {
            return this.lease;
        }

        /**
         * @return mask
         */
        public String getMask() {
            return this.mask;
        }

        /**
         * @return portName
         */
        public String getPortName() {
            return this.portName;
        }

        /**
         * @return startIp
         */
        public String getStartIp() {
            return this.startIp;
        }

        public static final class Builder {
            private String endIp; 
            private String ip; 
            private String IPType; 
            private String lease; 
            private String mask; 
            private String portName; 
            private String startIp; 

            private Builder() {
            } 

            private Builder(Lans model) {
                this.endIp = model.endIp;
                this.ip = model.ip;
                this.IPType = model.IPType;
                this.lease = model.lease;
                this.mask = model.mask;
                this.portName = model.portName;
                this.startIp = model.startIp;
            } 

            /**
             * <p>The end address of the DHCP address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>192.XX.XX.254</p>
             */
            public Builder endIp(String endIp) {
                this.endIp = endIp;
                return this;
            }

            /**
             * <p>The IP address of the LAN port.</p>
             * 
             * <strong>example:</strong>
             * <p>192.XX.XX.1</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The connection type of the LAN port. Valid values:</p>
             * <p><strong>DHCP</strong>: Dynamic IP. Uses the DHCP protocol to dynamically assign IP addresses to connected devices.</p>
             * <p><strong>STATIC</strong>: Static IP. Statically specifies the IP address of the LAN port.</p>
             * 
             * <strong>example:</strong>
             * <p>DHCP</p>
             */
            public Builder IPType(String IPType) {
                this.IPType = IPType;
                return this;
            }

            /**
             * <p>The DHCP lease time. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder lease(String lease) {
                this.lease = lease;
                return this;
            }

            /**
             * <p>The subnet mask.</p>
             * 
             * <strong>example:</strong>
             * <p>255.255.255.0</p>
             */
            public Builder mask(String mask) {
                this.mask = mask;
                return this;
            }

            /**
             * <p>The name of the port.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder portName(String portName) {
                this.portName = portName;
                return this;
            }

            /**
             * <p>The start IP address of the DHCP address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>192.XX.XX.2</p>
             */
            public Builder startIp(String startIp) {
                this.startIp = startIp;
                return this;
            }

            public Lans build() {
                return new Lans(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSagLanListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSagLanListResponseBody</p>
     */
    public static class TaskStates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private TaskStates(Builder builder) {
            this.createTime = builder.createTime;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskStates create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String createTime; 
            private String errorCode; 
            private String errorMessage; 
            private String state; 

            private Builder() {
            } 

            private Builder(TaskStates model) {
                this.createTime = model.createTime;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.state = model.state;
            } 

            /**
             * <p>The time when the query task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1586852928000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The error code. 200 indicates that the query task succeeded.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message. Successful indicates that the query task succeeded.</p>
             * 
             * <strong>example:</strong>
             * <p>Successful</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The status of the asynchronous task. Valid values:</p>
             * <ul>
             * <li><strong>Initialized</strong>: The query task is initialized.</li>
             * <li><strong>Offline</strong>: The Smart Access Gateway device is offline and the query task is not delivered. The task will be delivered after the device comes online.</li>
             * <li><strong>Succeed</strong>: The query task was delivered successfully.</li>
             * <li><strong>Processing</strong>: The query task is being delivered.</li>
             * <li><strong>VersionNotSupport</strong>: The current version of the Smart Access Gateway device does not support this operation.</li>
             * <li><strong>BuildRequestError</strong>: The request is not supported by the management system.</li>
             * <li><strong>HardwareError</strong>: The query task failed to be delivered due to a device error.</li>
             * <li><strong>TaskNotExist</strong>: The query task does not exist.</li>
             * <li><strong>OfflineNotConfiged</strong>: The Smart Access Gateway device is offline and the query task is not delivered. The task will not be delivered even after the device comes online.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Succeed</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public TaskStates build() {
                return new TaskStates(this);
            } 

        } 

    }
}
