// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link SendRCSReplyResponseBody} extends {@link TeaModel}
 *
 * <p>SendRCSReplyResponseBody</p>
 */
public class SendRCSReplyResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SendRCSReplyResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendRCSReplyResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(SendRCSReplyResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SendRCSReplyResponseBody build() {
            return new SendRCSReplyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SendRCSReplyResponseBody} extends {@link TeaModel}
     *
     * <p>SendRCSReplyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
        private String accessDeniedDetail;

        @com.aliyun.core.annotation.NameInMap("Bdcust")
        private String bdcust;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Debug")
        private java.util.Map<String, ?> debug;

        @com.aliyun.core.annotation.NameInMap("E")
        private String e;

        @com.aliyun.core.annotation.NameInMap("ExtendMap")
        private java.util.Map<String, ?> extendMap;

        @com.aliyun.core.annotation.NameInMap("GateFailMsg")
        private String gateFailMsg;

        @com.aliyun.core.annotation.NameInMap("KeyString")
        private String keyString;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Module")
        private java.util.Map<String, ?> module;

        @com.aliyun.core.annotation.NameInMap("PartnerId")
        private String partnerId;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private Data(Builder builder) {
            this.accessDeniedDetail = builder.accessDeniedDetail;
            this.bdcust = builder.bdcust;
            this.code = builder.code;
            this.debug = builder.debug;
            this.e = builder.e;
            this.extendMap = builder.extendMap;
            this.gateFailMsg = builder.gateFailMsg;
            this.keyString = builder.keyString;
            this.message = builder.message;
            this.module = builder.module;
            this.partnerId = builder.partnerId;
            this.requestId = builder.requestId;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessDeniedDetail
         */
        public String getAccessDeniedDetail() {
            return this.accessDeniedDetail;
        }

        /**
         * @return bdcust
         */
        public String getBdcust() {
            return this.bdcust;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return debug
         */
        public java.util.Map<String, ?> getDebug() {
            return this.debug;
        }

        /**
         * @return e
         */
        public String getE() {
            return this.e;
        }

        /**
         * @return extendMap
         */
        public java.util.Map<String, ?> getExtendMap() {
            return this.extendMap;
        }

        /**
         * @return gateFailMsg
         */
        public String getGateFailMsg() {
            return this.gateFailMsg;
        }

        /**
         * @return keyString
         */
        public String getKeyString() {
            return this.keyString;
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
        public java.util.Map<String, ?> getModule() {
            return this.module;
        }

        /**
         * @return partnerId
         */
        public String getPartnerId() {
            return this.partnerId;
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

        public static final class Builder {
            private String accessDeniedDetail; 
            private String bdcust; 
            private String code; 
            private java.util.Map<String, ?> debug; 
            private String e; 
            private java.util.Map<String, ?> extendMap; 
            private String gateFailMsg; 
            private String keyString; 
            private String message; 
            private java.util.Map<String, ?> module; 
            private String partnerId; 
            private String requestId; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accessDeniedDetail = model.accessDeniedDetail;
                this.bdcust = model.bdcust;
                this.code = model.code;
                this.debug = model.debug;
                this.e = model.e;
                this.extendMap = model.extendMap;
                this.gateFailMsg = model.gateFailMsg;
                this.keyString = model.keyString;
                this.message = model.message;
                this.module = model.module;
                this.partnerId = model.partnerId;
                this.requestId = model.requestId;
                this.success = model.success;
            } 

            /**
             * AccessDeniedDetail.
             */
            public Builder accessDeniedDetail(String accessDeniedDetail) {
                this.accessDeniedDetail = accessDeniedDetail;
                return this;
            }

            /**
             * Bdcust.
             */
            public Builder bdcust(String bdcust) {
                this.bdcust = bdcust;
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
             * Debug.
             */
            public Builder debug(java.util.Map<String, ?> debug) {
                this.debug = debug;
                return this;
            }

            /**
             * E.
             */
            public Builder e(String e) {
                this.e = e;
                return this;
            }

            /**
             * ExtendMap.
             */
            public Builder extendMap(java.util.Map<String, ?> extendMap) {
                this.extendMap = extendMap;
                return this;
            }

            /**
             * GateFailMsg.
             */
            public Builder gateFailMsg(String gateFailMsg) {
                this.gateFailMsg = gateFailMsg;
                return this;
            }

            /**
             * KeyString.
             */
            public Builder keyString(String keyString) {
                this.keyString = keyString;
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
             * Module.
             */
            public Builder module(java.util.Map<String, ?> module) {
                this.module = module;
                return this;
            }

            /**
             * PartnerId.
             */
            public Builder partnerId(String partnerId) {
                this.partnerId = partnerId;
                return this;
            }

            /**
             * RequestId.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
