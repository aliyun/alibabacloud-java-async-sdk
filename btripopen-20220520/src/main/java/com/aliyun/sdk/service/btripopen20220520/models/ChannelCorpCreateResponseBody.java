// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ChannelCorpCreateResponseBody} extends {@link TeaModel}
 *
 * <p>ChannelCorpCreateResponseBody</p>
 */
public class ChannelCorpCreateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private ChannelCorpCreateResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChannelCorpCreateResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Module module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public ChannelCorpCreateResponseBody build() {
            return new ChannelCorpCreateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ChannelCorpCreateResponseBody} extends {@link TeaModel}
     *
     * <p>ChannelCorpCreateResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("administrator_name")
        private String administratorName;

        @com.aliyun.core.annotation.NameInMap("administrator_phone")
        private String administratorPhone;

        @com.aliyun.core.annotation.NameInMap("corp_id")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("corp_name")
        private String corpName;

        @com.aliyun.core.annotation.NameInMap("open_agent_id")
        private String openAgentId;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        private Module(Builder builder) {
            this.administratorName = builder.administratorName;
            this.administratorPhone = builder.administratorPhone;
            this.corpId = builder.corpId;
            this.corpName = builder.corpName;
            this.openAgentId = builder.openAgentId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return administratorName
         */
        public String getAdministratorName() {
            return this.administratorName;
        }

        /**
         * @return administratorPhone
         */
        public String getAdministratorPhone() {
            return this.administratorPhone;
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return corpName
         */
        public String getCorpName() {
            return this.corpName;
        }

        /**
         * @return openAgentId
         */
        public String getOpenAgentId() {
            return this.openAgentId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String administratorName; 
            private String administratorPhone; 
            private String corpId; 
            private String corpName; 
            private String openAgentId; 
            private String userId; 

            /**
             * administrator_name.
             */
            public Builder administratorName(String administratorName) {
                this.administratorName = administratorName;
                return this;
            }

            /**
             * administrator_phone.
             */
            public Builder administratorPhone(String administratorPhone) {
                this.administratorPhone = administratorPhone;
                return this;
            }

            /**
             * corp_id.
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * corp_name.
             */
            public Builder corpName(String corpName) {
                this.corpName = corpName;
                return this;
            }

            /**
             * open_agent_id.
             */
            public Builder openAgentId(String openAgentId) {
                this.openAgentId = openAgentId;
                return this;
            }

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
