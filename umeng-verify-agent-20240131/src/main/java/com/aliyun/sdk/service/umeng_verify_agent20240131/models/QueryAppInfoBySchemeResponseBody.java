// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_verify_agent20240131.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAppInfoBySchemeResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAppInfoBySchemeResponseBody</p>
 */
public class QueryAppInfoBySchemeResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("msg")
    private String msg;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    private QueryAppInfoBySchemeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAppInfoBySchemeResponseBody create() {
        return builder().build();
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
     * @return msg
     */
    public String getMsg() {
        return this.msg;
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
        private String code; 
        private Data data; 
        private String msg; 
        private String requestId; 
        private Boolean success; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
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

        public QueryAppInfoBySchemeResponseBody build() {
            return new QueryAppInfoBySchemeResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("cmAppId")
        private String cmAppId;

        @NameInMap("cmAppKey")
        private String cmAppKey;

        @NameInMap("ctAppId")
        private String ctAppId;

        @NameInMap("ctAppKey")
        private String ctAppKey;

        @NameInMap("cuAppId")
        private String cuAppId;

        @NameInMap("cuAppKey")
        private String cuAppKey;

        @NameInMap("cuRsaPublickKey")
        private String cuRsaPublickKey;

        private Data(Builder builder) {
            this.cmAppId = builder.cmAppId;
            this.cmAppKey = builder.cmAppKey;
            this.ctAppId = builder.ctAppId;
            this.ctAppKey = builder.ctAppKey;
            this.cuAppId = builder.cuAppId;
            this.cuAppKey = builder.cuAppKey;
            this.cuRsaPublickKey = builder.cuRsaPublickKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cmAppId
         */
        public String getCmAppId() {
            return this.cmAppId;
        }

        /**
         * @return cmAppKey
         */
        public String getCmAppKey() {
            return this.cmAppKey;
        }

        /**
         * @return ctAppId
         */
        public String getCtAppId() {
            return this.ctAppId;
        }

        /**
         * @return ctAppKey
         */
        public String getCtAppKey() {
            return this.ctAppKey;
        }

        /**
         * @return cuAppId
         */
        public String getCuAppId() {
            return this.cuAppId;
        }

        /**
         * @return cuAppKey
         */
        public String getCuAppKey() {
            return this.cuAppKey;
        }

        /**
         * @return cuRsaPublickKey
         */
        public String getCuRsaPublickKey() {
            return this.cuRsaPublickKey;
        }

        public static final class Builder {
            private String cmAppId; 
            private String cmAppKey; 
            private String ctAppId; 
            private String ctAppKey; 
            private String cuAppId; 
            private String cuAppKey; 
            private String cuRsaPublickKey; 

            /**
             * cmAppId.
             */
            public Builder cmAppId(String cmAppId) {
                this.cmAppId = cmAppId;
                return this;
            }

            /**
             * cmAppKey.
             */
            public Builder cmAppKey(String cmAppKey) {
                this.cmAppKey = cmAppKey;
                return this;
            }

            /**
             * ctAppId.
             */
            public Builder ctAppId(String ctAppId) {
                this.ctAppId = ctAppId;
                return this;
            }

            /**
             * ctAppKey.
             */
            public Builder ctAppKey(String ctAppKey) {
                this.ctAppKey = ctAppKey;
                return this;
            }

            /**
             * cuAppId.
             */
            public Builder cuAppId(String cuAppId) {
                this.cuAppId = cuAppId;
                return this;
            }

            /**
             * cuAppKey.
             */
            public Builder cuAppKey(String cuAppKey) {
                this.cuAppKey = cuAppKey;
                return this;
            }

            /**
             * cuRsaPublickKey.
             */
            public Builder cuRsaPublickKey(String cuRsaPublickKey) {
                this.cuRsaPublickKey = cuRsaPublickKey;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
