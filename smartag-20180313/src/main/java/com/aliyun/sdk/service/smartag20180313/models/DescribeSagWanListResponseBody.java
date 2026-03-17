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
 * {@link DescribeSagWanListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSagWanListResponseBody</p>
 */
public class DescribeSagWanListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskStates")
    private java.util.List<TaskStates> taskStates;

    @com.aliyun.core.annotation.NameInMap("Wans")
    private java.util.List<Wans> wans;

    private DescribeSagWanListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskStates = builder.taskStates;
        this.wans = builder.wans;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSagWanListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return wans
     */
    public java.util.List<Wans> getWans() {
        return this.wans;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TaskStates> taskStates; 
        private java.util.List<Wans> wans; 

        private Builder() {
        } 

        private Builder(DescribeSagWanListResponseBody model) {
            this.requestId = model.requestId;
            this.taskStates = model.taskStates;
            this.wans = model.wans;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CE6642D4-21EB-4168-9BF9-F217953F9892</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of and information about the query task.</p>
         */
        public Builder taskStates(java.util.List<TaskStates> taskStates) {
            this.taskStates = taskStates;
            return this;
        }

        /**
         * <p>The settings of the WAN port.</p>
         */
        public Builder wans(java.util.List<Wans> wans) {
            this.wans = wans;
            return this;
        }

        public DescribeSagWanListResponseBody build() {
            return new DescribeSagWanListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSagWanListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSagWanListResponseBody</p>
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
             * <p>1586834861000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The error code returned to the query task. A value of 200 indicates that the query task is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message returned to the query task. A value of Successful indicates that the query task is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>Successful</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The status of the query task. Valid values:</p>
             * <ul>
             * <li><strong>Initialized</strong>: The query task is initialized.</li>
             * <li><strong>Offline</strong>: The SAG device is disconnected from Alibaba Cloud and Alibaba Cloud has not assigned the query task to the SAG device. After the SAG device is connected to Alibaba Cloud, Alibaba Cloud assigns the query task to the SAG device.</li>
             * <li><strong>Succeed</strong>: Alibaba Cloud has assigned the query task to the SAG device.</li>
             * <li><strong>Processing</strong>: Alibaba Cloud is assigning the query task to the SAG device.</li>
             * <li><strong>VersionNotSupport</strong>: The query task is not supported by the current version of the SAG device.</li>
             * <li><strong>BuildRequestError</strong>: The query task is not supported by the controller of the SAG device.</li>
             * <li><strong>HardwareError</strong>: Alibaba Cloud failed to assign the query task to the SAG device because the SAG device is faulty.</li>
             * <li><strong>TaskNotExist</strong>: The query task does not exist.</li>
             * <li><strong>OfflineNotConfiged</strong>: The SAG device is disconnected from Alibaba Cloud and Alibaba Cloud has not assigned the query task to the SAG device. Alibaba Cloud does not assign the query task to the SAG device even after the SAG device is connected to Alibaba Cloud.</li>
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
    /**
     * 
     * {@link DescribeSagWanListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSagWanListResponseBody</p>
     */
    public static class Wans extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BandWidth")
        private Integer bandWidth;

        @com.aliyun.core.annotation.NameInMap("Gateway")
        private String gateway;

        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("IPType")
        private String IPType;

        @com.aliyun.core.annotation.NameInMap("ISP")
        private String ISP;

        @com.aliyun.core.annotation.NameInMap("Mask")
        private String mask;

        @com.aliyun.core.annotation.NameInMap("PortName")
        private String portName;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("TrafficState")
        private String trafficState;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private Wans(Builder builder) {
            this.bandWidth = builder.bandWidth;
            this.gateway = builder.gateway;
            this.ip = builder.ip;
            this.IPType = builder.IPType;
            this.ISP = builder.ISP;
            this.mask = builder.mask;
            this.portName = builder.portName;
            this.priority = builder.priority;
            this.trafficState = builder.trafficState;
            this.username = builder.username;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Wans create() {
            return builder().build();
        }

        /**
         * @return bandWidth
         */
        public Integer getBandWidth() {
            return this.bandWidth;
        }

        /**
         * @return gateway
         */
        public String getGateway() {
            return this.gateway;
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
         * @return ISP
         */
        public String getISP() {
            return this.ISP;
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
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return trafficState
         */
        public String getTrafficState() {
            return this.trafficState;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private Integer bandWidth; 
            private String gateway; 
            private String ip; 
            private String IPType; 
            private String ISP; 
            private String mask; 
            private String portName; 
            private Integer priority; 
            private String trafficState; 
            private String username; 
            private Integer weight; 

            private Builder() {
            } 

            private Builder(Wans model) {
                this.bandWidth = model.bandWidth;
                this.gateway = model.gateway;
                this.ip = model.ip;
                this.IPType = model.IPType;
                this.ISP = model.ISP;
                this.mask = model.mask;
                this.portName = model.portName;
                this.priority = model.priority;
                this.trafficState = model.trafficState;
                this.username = model.username;
                this.weight = model.weight;
            } 

            /**
             * <p>The bandwidth cap of the WAN port. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder bandWidth(Integer bandWidth) {
                this.bandWidth = bandWidth;
                return this;
            }

            /**
             * <p>The IP address of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>192.XX.XX.1</p>
             */
            public Builder gateway(String gateway) {
                this.gateway = gateway;
                return this;
            }

            /**
             * <p>The IP address of the WAN port.</p>
             * 
             * <strong>example:</strong>
             * <p>172.XX.XX.1</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The connection type of the WAN port. Valid values:</p>
             * <ul>
             * <li><strong>DHCP</strong>: The WAN port connects to the Internet through an IP address that is dynamically assigned by the Dynamic Host Configuration Protocol (DHCP) server.</li>
             * <li><strong>STATIC</strong>: The WAN port connects to the Internet through a static IP address.</li>
             * <li><strong>PPPOE</strong>: The WAN port connects to the Internet through dial-up connections.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>STATIC</p>
             */
            public Builder IPType(String IPType) {
                this.IPType = IPType;
                return this;
            }

            /**
             * <p>The Internet service provider (ISP) used by the WAN port.</p>
             * <ul>
             * <li><strong>CT</strong>: China Telecom</li>
             * <li><strong>CM</strong>: China Mobile</li>
             * <li><strong>CU</strong>: China Unicom</li>
             * <li><strong>Other</strong>: Other ISPs</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CT</p>
             */
            public Builder ISP(String ISP) {
                this.ISP = ISP;
                return this;
            }

            /**
             * <p>The subnet mask of the WAN port IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>255.255.255.240</p>
             */
            public Builder mask(String mask) {
                this.mask = mask;
                return this;
            }

            /**
             * <p>The number of the WAN port.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder portName(String portName) {
                this.portName = portName;
                return this;
            }

            /**
             * <p>The priority of the WAN port.</p>
             * <p>Valid values: <strong>-1</strong> and <strong>1 to 50</strong>. A smaller number represents a higher priority.</p>
             * <blockquote>
             * <p> A value of <strong>-1</strong> indicates that the WAN port is not used to forward network traffic.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The status of data transfer on the WAN port. Valid values:</p>
             * <ul>
             * <li><strong>active</strong>: The WAN port is the active port for data transfer.</li>
             * <li><strong>standby</strong>: The WAN port is a standby port. If the active port is down, data transfer is switched to the WAN port.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder trafficState(String trafficState) {
                this.trafficState = trafficState;
                return this;
            }

            /**
             * <p>The username of the PPPoE account.</p>
             * 
             * <strong>example:</strong>
             * <p>Usernamexx</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            /**
             * <p>The weight of the WAN port.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public Wans build() {
                return new Wans(this);
            } 

        } 

    }
}
