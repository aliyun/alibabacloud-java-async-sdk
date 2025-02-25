// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link JyQueryAppInfoBySceneCodeResponseBody} extends {@link TeaModel}
 *
 * <p>JyQueryAppInfoBySceneCodeResponseBody</p>
 */
public class JyQueryAppInfoBySceneCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private JyQueryAppInfoBySceneCodeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JyQueryAppInfoBySceneCodeResponseBody create() {
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

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

        public JyQueryAppInfoBySceneCodeResponseBody build() {
            return new JyQueryAppInfoBySceneCodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link JyQueryAppInfoBySceneCodeResponseBody} extends {@link TeaModel}
     *
     * <p>JyQueryAppInfoBySceneCodeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CmAppId")
        private String cmAppId;

        @com.aliyun.core.annotation.NameInMap("CmAppKey")
        private String cmAppKey;

        @com.aliyun.core.annotation.NameInMap("CtAppId")
        private String ctAppId;

        @com.aliyun.core.annotation.NameInMap("CtAppKey")
        private String ctAppKey;

        private Data(Builder builder) {
            this.cmAppId = builder.cmAppId;
            this.cmAppKey = builder.cmAppKey;
            this.ctAppId = builder.ctAppId;
            this.ctAppKey = builder.ctAppKey;
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

        public static final class Builder {
            private String cmAppId; 
            private String cmAppKey; 
            private String ctAppId; 
            private String ctAppKey; 

            /**
             * CmAppId.
             */
            public Builder cmAppId(String cmAppId) {
                this.cmAppId = cmAppId;
                return this;
            }

            /**
             * CmAppKey.
             */
            public Builder cmAppKey(String cmAppKey) {
                this.cmAppKey = cmAppKey;
                return this;
            }

            /**
             * CtAppId.
             */
            public Builder ctAppId(String ctAppId) {
                this.ctAppId = ctAppId;
                return this;
            }

            /**
             * CtAppKey.
             */
            public Builder ctAppKey(String ctAppKey) {
                this.ctAppKey = ctAppKey;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
