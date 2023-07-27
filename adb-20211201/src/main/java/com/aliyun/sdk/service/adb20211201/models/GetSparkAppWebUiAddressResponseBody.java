// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkAppWebUiAddressResponseBody} extends {@link TeaModel}
 *
 * <p>GetSparkAppWebUiAddressResponseBody</p>
 */
public class GetSparkAppWebUiAddressResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private GetSparkAppWebUiAddressResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSparkAppWebUiAddressResponseBody create() {
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
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSparkAppWebUiAddressResponseBody build() {
            return new GetSparkAppWebUiAddressResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("DBClusterId")
        private String DBClusterId;

        @NameInMap("ExpirationTimeInMillis")
        private Long expirationTimeInMillis;

        @NameInMap("WebUiAddress")
        private String webUiAddress;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.DBClusterId = builder.DBClusterId;
            this.expirationTimeInMillis = builder.expirationTimeInMillis;
            this.webUiAddress = builder.webUiAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return expirationTimeInMillis
         */
        public Long getExpirationTimeInMillis() {
            return this.expirationTimeInMillis;
        }

        /**
         * @return webUiAddress
         */
        public String getWebUiAddress() {
            return this.webUiAddress;
        }

        public static final class Builder {
            private String appId; 
            private String DBClusterId; 
            private Long expirationTimeInMillis; 
            private String webUiAddress; 

            /**
             * The ID of the Spark application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The ID of the Database.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * The expiration time. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder expirationTimeInMillis(Long expirationTimeInMillis) {
                this.expirationTimeInMillis = expirationTimeInMillis;
                return this;
            }

            /**
             * The URL of the web UI for the Spark application.
             */
            public Builder webUiAddress(String webUiAddress) {
                this.webUiAddress = webUiAddress;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
