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
 * {@link CloudListOnlineAgentResponseBody} extends {@link TeaModel}
 *
 * <p>CloudListOnlineAgentResponseBody</p>
 */
public class CloudListOnlineAgentResponseBody extends TeaModel {
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

    private CloudListOnlineAgentResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudListOnlineAgentResponseBody create() {
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

        private Builder(CloudListOnlineAgentResponseBody model) {
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

        public CloudListOnlineAgentResponseBody build() {
            return new CloudListOnlineAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CloudListOnlineAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CloudListOnlineAgentResponseBody</p>
     */
    public static class AgentStatuses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindTel")
        private String bindTel;

        @com.aliyun.core.annotation.NameInMap("Cno")
        private String cno;

        @com.aliyun.core.annotation.NameInMap("DeviceStatus")
        private Long deviceStatus;

        @com.aliyun.core.annotation.NameInMap("DeviceStatusDuration")
        private Long deviceStatusDuration;

        @com.aliyun.core.annotation.NameInMap("LoginStatus")
        private Long loginStatus;

        @com.aliyun.core.annotation.NameInMap("LoginStatusDuration")
        private Long loginStatusDuration;

        @com.aliyun.core.annotation.NameInMap("LoginTime")
        private String loginTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private AgentStatuses(Builder builder) {
            this.bindTel = builder.bindTel;
            this.cno = builder.cno;
            this.deviceStatus = builder.deviceStatus;
            this.deviceStatusDuration = builder.deviceStatusDuration;
            this.loginStatus = builder.loginStatus;
            this.loginStatusDuration = builder.loginStatusDuration;
            this.loginTime = builder.loginTime;
            this.name = builder.name;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentStatuses create() {
            return builder().build();
        }

        /**
         * @return bindTel
         */
        public String getBindTel() {
            return this.bindTel;
        }

        /**
         * @return cno
         */
        public String getCno() {
            return this.cno;
        }

        /**
         * @return deviceStatus
         */
        public Long getDeviceStatus() {
            return this.deviceStatus;
        }

        /**
         * @return deviceStatusDuration
         */
        public Long getDeviceStatusDuration() {
            return this.deviceStatusDuration;
        }

        /**
         * @return loginStatus
         */
        public Long getLoginStatus() {
            return this.loginStatus;
        }

        /**
         * @return loginStatusDuration
         */
        public Long getLoginStatusDuration() {
            return this.loginStatusDuration;
        }

        /**
         * @return loginTime
         */
        public String getLoginTime() {
            return this.loginTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String bindTel; 
            private String cno; 
            private Long deviceStatus; 
            private Long deviceStatusDuration; 
            private Long loginStatus; 
            private Long loginStatusDuration; 
            private String loginTime; 
            private String name; 
            private String state; 

            private Builder() {
            } 

            private Builder(AgentStatuses model) {
                this.bindTel = model.bindTel;
                this.cno = model.cno;
                this.deviceStatus = model.deviceStatus;
                this.deviceStatusDuration = model.deviceStatusDuration;
                this.loginStatus = model.loginStatus;
                this.loginStatusDuration = model.loginStatusDuration;
                this.loginTime = model.loginTime;
                this.name = model.name;
                this.state = model.state;
            } 

            /**
             * <p>绑定电话</p>
             * 
             * <strong>example:</strong>
             * <p>22223333</p>
             */
            public Builder bindTel(String bindTel) {
                this.bindTel = bindTel;
                return this;
            }

            /**
             * <p>座席工号</p>
             * 
             * <strong>example:</strong>
             * <p>1111</p>
             */
            public Builder cno(String cno) {
                this.cno = cno;
                return this;
            }

            /**
             * <p>设备状态，-1 失效，0 空闲，1 已锁定，2 呼叫中，3 响铃，4 通话中</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder deviceStatus(Long deviceStatus) {
                this.deviceStatus = deviceStatus;
                return this;
            }

            /**
             * <p>设备状态时长</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder deviceStatusDuration(Long deviceStatusDuration) {
                this.deviceStatusDuration = deviceStatusDuration;
                return this;
            }

            /**
             * <p>登录状态，0离线，1在线，2置忙，3整理</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder loginStatus(Long loginStatus) {
                this.loginStatus = loginStatus;
                return this;
            }

            /**
             * <p>登录状态时长</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder loginStatusDuration(Long loginStatusDuration) {
                this.loginStatusDuration = loginStatusDuration;
                return this;
            }

            /**
             * <p>登录时间</p>
             * 
             * <strong>example:</strong>
             * <p>1774821736</p>
             */
            public Builder loginTime(String loginTime) {
                this.loginTime = loginTime;
                return this;
            }

            /**
             * <p>座席名称</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>座席状态（结合了登录状态和设备状态），失效，空闲，置忙，整理，呼叫中，响铃，通话</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public AgentStatuses build() {
                return new AgentStatuses(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloudListOnlineAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CloudListOnlineAgentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentStatuses")
        private java.util.List<AgentStatuses> agentStatuses;

        private Data(Builder builder) {
            this.agentStatuses = builder.agentStatuses;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentStatuses
         */
        public java.util.List<AgentStatuses> getAgentStatuses() {
            return this.agentStatuses;
        }

        public static final class Builder {
            private java.util.List<AgentStatuses> agentStatuses; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentStatuses = model.agentStatuses;
            } 

            /**
             * <p>座席状态数组</p>
             */
            public Builder agentStatuses(java.util.List<AgentStatuses> agentStatuses) {
                this.agentStatuses = agentStatuses;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
