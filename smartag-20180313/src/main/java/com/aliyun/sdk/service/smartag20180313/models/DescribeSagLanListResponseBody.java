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
         * <p>The information about the LAN port.</p>
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
         * <p>The state of the query task.</p>
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
             * <p>The last IP address of the DHCP pool.</p>
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
             * <p>The connection type of the LAN port.</p>
             * <p><strong>DHCP</strong>: a dynamic IP address. Uses the Dynamic Host Configuration Protocol (DHCP) to dynamically assign an IP address to a connected device.</p>
             * <p><strong>STATIC</strong>: a static IP address. Specifies a static IP address for the LAN port.</p>
             * 
             * <strong>example:</strong>
             * <p>DHCP</p>
             */
            public Builder IPType(String IPType) {
                this.IPType = IPType;
                return this;
            }

            /**
             * <p>The time duration that the IP address is retained after it is assigned through DHCP. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder lease(String lease) {
                this.lease = lease;
                return this;
            }

            /**
             * <p>The subnet mask of the IP address of the port.</p>
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
             * <p>The first IP address of the DHCP pool.</p>
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
             * <p>The error code returned. A value of 200 indicates that the query task is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message. A value of Successful indicates that the query task is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>Successful</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The state of the query task. Valid values:</p>
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
}
