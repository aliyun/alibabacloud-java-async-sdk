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
 * {@link ClinkAgentStatusDetailResponseBody} extends {@link TeaModel}
 *
 * <p>ClinkAgentStatusDetailResponseBody</p>
 */
public class ClinkAgentStatusDetailResponseBody extends TeaModel {
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

    private ClinkAgentStatusDetailResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClinkAgentStatusDetailResponseBody create() {
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

        private Builder(ClinkAgentStatusDetailResponseBody model) {
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

        public ClinkAgentStatusDetailResponseBody build() {
            return new ClinkAgentStatusDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ClinkAgentStatusDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkAgentStatusDetailResponseBody</p>
     */
    public static class AgentStatusDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindTel")
        private String bindTel;

        @com.aliyun.core.annotation.NameInMap("BindType")
        private Long bindType;

        @com.aliyun.core.annotation.NameInMap("Cno")
        private String cno;

        @com.aliyun.core.annotation.NameInMap("EnterpriseId")
        private Long enterpriseId;

        @com.aliyun.core.annotation.NameInMap("LoginType")
        private Long loginType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusDetails")
        private String statusDetails;

        private AgentStatusDetail(Builder builder) {
            this.bindTel = builder.bindTel;
            this.bindType = builder.bindType;
            this.cno = builder.cno;
            this.enterpriseId = builder.enterpriseId;
            this.loginType = builder.loginType;
            this.name = builder.name;
            this.status = builder.status;
            this.statusDetails = builder.statusDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentStatusDetail create() {
            return builder().build();
        }

        /**
         * @return bindTel
         */
        public String getBindTel() {
            return this.bindTel;
        }

        /**
         * @return bindType
         */
        public Long getBindType() {
            return this.bindType;
        }

        /**
         * @return cno
         */
        public String getCno() {
            return this.cno;
        }

        /**
         * @return enterpriseId
         */
        public Long getEnterpriseId() {
            return this.enterpriseId;
        }

        /**
         * @return loginType
         */
        public Long getLoginType() {
            return this.loginType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusDetails
         */
        public String getStatusDetails() {
            return this.statusDetails;
        }

        public static final class Builder {
            private String bindTel; 
            private Long bindType; 
            private String cno; 
            private Long enterpriseId; 
            private Long loginType; 
            private String name; 
            private String status; 
            private String statusDetails; 

            private Builder() {
            } 

            private Builder(AgentStatusDetail model) {
                this.bindTel = model.bindTel;
                this.bindType = model.bindType;
                this.cno = model.cno;
                this.enterpriseId = model.enterpriseId;
                this.loginType = model.loginType;
                this.name = model.name;
                this.status = model.status;
                this.statusDetails = model.statusDetails;
            } 

            /**
             * <p>绑定号码</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder bindTel(String bindTel) {
                this.bindTel = bindTel;
                return this;
            }

            /**
             * <p>电话类型，1:电话；2:IP话机；3:软电话</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bindType(Long bindType) {
                this.bindType = bindType;
                return this;
            }

            /**
             * <p>座席号</p>
             * 
             * <strong>example:</strong>
             * <p>1111</p>
             */
            public Builder cno(String cno) {
                this.cno = cno;
                return this;
            }

            /**
             * <p>企业id</p>
             * 
             * <strong>example:</strong>
             * <p>8004970</p>
             */
            public Builder enterpriseId(Long enterpriseId) {
                this.enterpriseId = enterpriseId;
                return this;
            }

            /**
             * <p>登录终端，1:工具条；2:座席；3:管理员；4:接口；6:APP；9:移动SDK</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder loginType(Long loginType) {
                this.loginType = loginType;
                return this;
            }

            /**
             * <p>座席名称</p>
             * 
             * <strong>example:</strong>
             * <p>name3</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>座席状态， IDLE：空闲； PAUSE：置忙； WRAPUP：整理； CALLING： 呼叫中； RINGING：响铃； BUSY：通话</p>
             * 
             * <strong>example:</strong>
             * <p>IDLE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>座席状态详情，空闲，忙碌，整理，呼叫中，响铃，呼入振铃，外呼振铃，通话，呼入通话，外呼通话，自定义置忙状态</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder statusDetails(String statusDetails) {
                this.statusDetails = statusDetails;
                return this;
            }

            public AgentStatusDetail build() {
                return new AgentStatusDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ClinkAgentStatusDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkAgentStatusDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentStatusDetail")
        private AgentStatusDetail agentStatusDetail;

        @com.aliyun.core.annotation.NameInMap("ClinkRequestId")
        private String clinkRequestId;

        private Data(Builder builder) {
            this.agentStatusDetail = builder.agentStatusDetail;
            this.clinkRequestId = builder.clinkRequestId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentStatusDetail
         */
        public AgentStatusDetail getAgentStatusDetail() {
            return this.agentStatusDetail;
        }

        /**
         * @return clinkRequestId
         */
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        public static final class Builder {
            private AgentStatusDetail agentStatusDetail; 
            private String clinkRequestId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentStatusDetail = model.agentStatusDetail;
                this.clinkRequestId = model.clinkRequestId;
            } 

            /**
             * <p>座席状态详情</p>
             */
            public Builder agentStatusDetail(AgentStatusDetail agentStatusDetail) {
                this.agentStatusDetail = agentStatusDetail;
                return this;
            }

            /**
             * <p>请求 id</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder clinkRequestId(String clinkRequestId) {
                this.clinkRequestId = clinkRequestId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
