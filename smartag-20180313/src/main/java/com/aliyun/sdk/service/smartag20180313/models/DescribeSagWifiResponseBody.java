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
 * {@link DescribeSagWifiResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSagWifiResponseBody</p>
 */
public class DescribeSagWifiResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthenticationType")
    private String authenticationType;

    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private String bandwidth;

    @com.aliyun.core.annotation.NameInMap("Channel")
    private String channel;

    @com.aliyun.core.annotation.NameInMap("EncryptAlgorithm")
    private String encryptAlgorithm;

    @com.aliyun.core.annotation.NameInMap("IsAuth")
    private String isAuth;

    @com.aliyun.core.annotation.NameInMap("IsBroadcast")
    private String isBroadcast;

    @com.aliyun.core.annotation.NameInMap("IsEnable")
    private String isEnable;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Ssid")
    private String ssid;

    @com.aliyun.core.annotation.NameInMap("TaskStates")
    private java.util.List<TaskStates> taskStates;

    private DescribeSagWifiResponseBody(Builder builder) {
        this.authenticationType = builder.authenticationType;
        this.bandwidth = builder.bandwidth;
        this.channel = builder.channel;
        this.encryptAlgorithm = builder.encryptAlgorithm;
        this.isAuth = builder.isAuth;
        this.isBroadcast = builder.isBroadcast;
        this.isEnable = builder.isEnable;
        this.requestId = builder.requestId;
        this.ssid = builder.ssid;
        this.taskStates = builder.taskStates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSagWifiResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authenticationType
     */
    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * @return bandwidth
     */
    public String getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return encryptAlgorithm
     */
    public String getEncryptAlgorithm() {
        return this.encryptAlgorithm;
    }

    /**
     * @return isAuth
     */
    public String getIsAuth() {
        return this.isAuth;
    }

    /**
     * @return isBroadcast
     */
    public String getIsBroadcast() {
        return this.isBroadcast;
    }

    /**
     * @return isEnable
     */
    public String getIsEnable() {
        return this.isEnable;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ssid
     */
    public String getSsid() {
        return this.ssid;
    }

    /**
     * @return taskStates
     */
    public java.util.List<TaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static final class Builder {
        private String authenticationType; 
        private String bandwidth; 
        private String channel; 
        private String encryptAlgorithm; 
        private String isAuth; 
        private String isBroadcast; 
        private String isEnable; 
        private String requestId; 
        private String ssid; 
        private java.util.List<TaskStates> taskStates; 

        private Builder() {
        } 

        private Builder(DescribeSagWifiResponseBody model) {
            this.authenticationType = model.authenticationType;
            this.bandwidth = model.bandwidth;
            this.channel = model.channel;
            this.encryptAlgorithm = model.encryptAlgorithm;
            this.isAuth = model.isAuth;
            this.isBroadcast = model.isBroadcast;
            this.isEnable = model.isEnable;
            this.requestId = model.requestId;
            this.ssid = model.ssid;
            this.taskStates = model.taskStates;
        } 

        /**
         * <p>The authentication type. Valid values:</p>
         * <ul>
         * <li><strong>NONE</strong>: authentication is disabled.</li>
         * <li><strong>WPA-PSK</strong>: WPA-PSK authentication is enabled.</li>
         * <li><strong>WPA2-PSK</strong>: WPA2-PSK authentication is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WPA2-PSK</p>
         */
        public Builder authenticationType(String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        /**
         * <p>The bandwidth of the Wi-Fi channel. Valid values:</p>
         * <ul>
         * <li><strong>Automatic</strong></li>
         * <li><strong>20 HMz</strong></li>
         * <li><strong>40 MHz</strong></li>
         * </ul>
         */
        public Builder bandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The Wi-Fi channel.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder channel(String channel) {
            this.channel = channel;
            return this;
        }

        /**
         * <p>The encryption algorithm.</p>
         * <ul>
         * <li><strong>AUTO</strong>: automatically selects the encryption algorithm.</li>
         * <li><strong>TKIP</strong>: uses the Temporal Key Integrity Protocol (TKIP).</li>
         * <li><strong>AES</strong>: uses the Advanced Encryption Standard authorized by Wi-Fi®.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AES</p>
         */
        public Builder encryptAlgorithm(String encryptAlgorithm) {
            this.encryptAlgorithm = encryptAlgorithm;
            return this;
        }

        /**
         * <p>Indicates whether wireless security is enabled.</p>
         * <ul>
         * <li><strong>True</strong>: wireless security is enabled.</li>
         * <li><strong>False</strong>: wireless security is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder isAuth(String isAuth) {
            this.isAuth = isAuth;
            return this;
        }

        /**
         * <p>Indicates whether broadcast over Wi-Fi is enabled. Valid values:</p>
         * <ul>
         * <li><strong>True</strong>: broadcast is enabled.</li>
         * <li><strong>False</strong>: broadcast is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder isBroadcast(String isBroadcast) {
            this.isBroadcast = isBroadcast;
            return this;
        }

        /**
         * <p>Indicates whether wireless connections are enabled. Valid values:</p>
         * <ul>
         * <li><strong>True</strong>: wireless connections are enabled.</li>
         * <li><strong>False</strong>: wireless connections are disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder isEnable(String isEnable) {
            this.isEnable = isEnable;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E93884AC-6C21-4FEA-8E3A-7377D33B194F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The service set identifier (SSID) of the Wi-Fi network.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_sag_123456***</p>
         */
        public Builder ssid(String ssid) {
            this.ssid = ssid;
            return this;
        }

        /**
         * <p>The information about the query task.</p>
         */
        public Builder taskStates(java.util.List<TaskStates> taskStates) {
            this.taskStates = taskStates;
            return this;
        }

        public DescribeSagWifiResponseBody build() {
            return new DescribeSagWifiResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSagWifiResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSagWifiResponseBody</p>
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
             * <p>1586843621000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The error code returned for a query task. The 200 error code indicates that the query task is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message returned for a query task. The Successful error message indicates that the query task is successful.</p>
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
             * <li><strong>Initialized</strong>: The query task has been initialized.</li>
             * <li><strong>Offline</strong>: The query task is not dispatched because the SAG device is disconnected from Alibaba Cloud. The task will be dispatched after the SAG device is connected to Alibaba Cloud.</li>
             * <li><strong>Succeed</strong>: The query task has been dispatched.</li>
             * <li><strong>Processing</strong>: The query task is being dispatched.</li>
             * <li><strong>VersionNotSupport</strong>: The current version of the SAG device does not support query tasks.</li>
             * <li><strong>BuildRequestError</strong>: The SAG control system does not support query tasks.</li>
             * <li><strong>HardwareError</strong>: The query task failed to be dispatched due to device errors.</li>
             * <li><strong>TaskNotExist</strong>: The query task does not exist.</li>
             * <li><strong>OfflineNotConfiged</strong>: The query task is not dispatched because the SAG device is disconnected from Alibaba Cloud. The task will not be dispatched after the device is connected to Alibaba Cloud.</li>
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
