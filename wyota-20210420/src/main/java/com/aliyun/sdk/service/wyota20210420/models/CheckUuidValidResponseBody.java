// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CheckUuidValidResponseBody} extends {@link TeaModel}
 *
 * <p>CheckUuidValidResponseBody</p>
 */
public class CheckUuidValidResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckUuidValidResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckUuidValidResponseBody create() {
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

        public CheckUuidValidResponseBody build() {
            return new CheckUuidValidResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckUuidValidResponseBody} extends {@link TeaModel}
     *
     * <p>CheckUuidValidResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NewUpgrade")
        private Boolean newUpgrade;

        private Data(Builder builder) {
            this.newUpgrade = builder.newUpgrade;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return newUpgrade
         */
        public Boolean getNewUpgrade() {
            return this.newUpgrade;
        }

        public static final class Builder {
            private Boolean newUpgrade; 

            /**
             * NewUpgrade.
             */
            public Builder newUpgrade(Boolean newUpgrade) {
                this.newUpgrade = newUpgrade;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
