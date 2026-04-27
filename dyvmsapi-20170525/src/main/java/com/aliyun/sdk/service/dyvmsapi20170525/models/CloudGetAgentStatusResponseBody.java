// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link CloudGetAgentStatusResponseBody} extends {@link TeaModel}
 *
 * <p>CloudGetAgentStatusResponseBody</p>
 */
public class CloudGetAgentStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CloudGetAgentStatusResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudGetAgentStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CloudGetAgentStatusResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CloudGetAgentStatusResponseBody build() {
            return new CloudGetAgentStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CloudGetAgentStatusResponseBody} extends {@link TeaModel}
     *
     * <p>CloudGetAgentStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceStatus")
        private Long deviceStatus;

        @com.aliyun.core.annotation.NameInMap("LoginStatus")
        private Long loginStatus;

        @com.aliyun.core.annotation.NameInMap("MainUniqueId")
        private String mainUniqueId;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("StateAction")
        private String stateAction;

        private Data(Builder builder) {
            this.deviceStatus = builder.deviceStatus;
            this.loginStatus = builder.loginStatus;
            this.mainUniqueId = builder.mainUniqueId;
            this.state = builder.state;
            this.stateAction = builder.stateAction;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deviceStatus
         */
        public Long getDeviceStatus() {
            return this.deviceStatus;
        }

        /**
         * @return loginStatus
         */
        public Long getLoginStatus() {
            return this.loginStatus;
        }

        /**
         * @return mainUniqueId
         */
        public String getMainUniqueId() {
            return this.mainUniqueId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return stateAction
         */
        public String getStateAction() {
            return this.stateAction;
        }

        public static final class Builder {
            private Long deviceStatus; 
            private Long loginStatus; 
            private String mainUniqueId; 
            private String state; 
            private String stateAction; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.deviceStatus = model.deviceStatus;
                this.loginStatus = model.loginStatus;
                this.mainUniqueId = model.mainUniqueId;
                this.state = model.state;
                this.stateAction = model.stateAction;
            } 

            /**
             * <p>座席设备状态，座席登录状态不是离线时返回  -1：错误的状态  0：空闲状态  1：锁定状态   2：邀请中状态  3：响铃状态  4：使用中状态</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder deviceStatus(Long deviceStatus) {
                this.deviceStatus = deviceStatus;
                return this;
            }

            /**
             * <p>座席登录状态   0：离线状态  1：在线状态  2：置忙状态  3：整理状态</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder loginStatus(Long loginStatus) {
                this.loginStatus = loginStatus;
                return this;
            }

            /**
             * <p>座席当前参与的通话唯一标识，座席设备状态为1/2/3/4时返回</p>
             * 
             * <strong>example:</strong>
             * <p>medias_1-162046xxxx.12</p>
             */
            public Builder mainUniqueId(String mainUniqueId) {
                this.mainUniqueId = mainUniqueId;
                return this;
            }

            /**
             * <p>座席状态描述（结合了登录状态和设备状态），离线，空闲，置忙，整理，呼叫中，响铃，保持，通话</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>状态对应的动作，座席登录状态不是离线时返回</p>
             * 
             * <strong>example:</strong>
             * <p>idle</p>
             */
            public Builder stateAction(String stateAction) {
                this.stateAction = stateAction;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
