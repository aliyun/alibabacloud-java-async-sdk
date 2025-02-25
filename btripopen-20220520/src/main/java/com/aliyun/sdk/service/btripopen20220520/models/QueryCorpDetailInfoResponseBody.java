// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link QueryCorpDetailInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCorpDetailInfoResponseBody</p>
 */
public class QueryCorpDetailInfoResponseBody extends TeaModel {
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

    private QueryCorpDetailInfoResponseBody(Builder builder) {
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

    public static QueryCorpDetailInfoResponseBody create() {
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

        public QueryCorpDetailInfoResponseBody build() {
            return new QueryCorpDetailInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryCorpDetailInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCorpDetailInfoResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("corp_id")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("corp_name")
        private String corpName;

        @com.aliyun.core.annotation.NameInMap("open_agent_id")
        private String openAgentId;

        @com.aliyun.core.annotation.NameInMap("super_admin_name")
        private String superAdminName;

        @com.aliyun.core.annotation.NameInMap("super_admin_phone")
        private String superAdminPhone;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        private Module(Builder builder) {
            this.corpId = builder.corpId;
            this.corpName = builder.corpName;
            this.openAgentId = builder.openAgentId;
            this.superAdminName = builder.superAdminName;
            this.superAdminPhone = builder.superAdminPhone;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
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
         * @return superAdminName
         */
        public String getSuperAdminName() {
            return this.superAdminName;
        }

        /**
         * @return superAdminPhone
         */
        public String getSuperAdminPhone() {
            return this.superAdminPhone;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String corpId; 
            private String corpName; 
            private String openAgentId; 
            private String superAdminName; 
            private String superAdminPhone; 
            private String userId; 

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
             * super_admin_name.
             */
            public Builder superAdminName(String superAdminName) {
                this.superAdminName = superAdminName;
                return this;
            }

            /**
             * super_admin_phone.
             */
            public Builder superAdminPhone(String superAdminPhone) {
                this.superAdminPhone = superAdminPhone;
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
