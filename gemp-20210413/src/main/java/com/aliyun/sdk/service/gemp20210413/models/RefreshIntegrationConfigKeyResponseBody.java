// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshIntegrationConfigKeyResponseBody} extends {@link TeaModel}
 *
 * <p>RefreshIntegrationConfigKeyResponseBody</p>
 */
public class RefreshIntegrationConfigKeyResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
    private String requestId;

    private RefreshIntegrationConfigKeyResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshIntegrationConfigKeyResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RefreshIntegrationConfigKeyResponseBody build() {
            return new RefreshIntegrationConfigKeyResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("key")
        private String key;

        private Data(Builder builder) {
            this.key = builder.key;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        public static final class Builder {
            private String key; 

            /**
             * 集成秘钥
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
