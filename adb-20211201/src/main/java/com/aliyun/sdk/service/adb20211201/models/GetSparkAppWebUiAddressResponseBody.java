// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link GetSparkAppWebUiAddressResponseBody} extends {@link TeaModel}
 *
 * <p>GetSparkAppWebUiAddressResponseBody</p>
 */
public class GetSparkAppWebUiAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D65A809F-34CE-4550-9BC1-0ED21ETG380</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSparkAppWebUiAddressResponseBody build() {
            return new GetSparkAppWebUiAddressResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSparkAppWebUiAddressResponseBody} extends {@link TeaModel}
     *
     * <p>GetSparkAppWebUiAddressResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("ExpirationTimeInMillis")
        private Long expirationTimeInMillis;

        @com.aliyun.core.annotation.NameInMap("WebUiAddress")
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
             * <p>The Spark application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>s202205201533hz1209892000****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The database ID.</p>
             * 
             * <strong>example:</strong>
             * <p>amv-clusterxxx</p>
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * <p>The expiration time. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1655801973000</p>
             */
            public Builder expirationTimeInMillis(Long expirationTimeInMillis) {
                this.expirationTimeInMillis = expirationTimeInMillis;
                return this;
            }

            /**
             * <p>The URL of the web UI for the Spark application.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://adbsparkui-cn-hangzhou.aliyuncs.com/?token=">https://adbsparkui-cn-hangzhou.aliyuncs.com/?token=</a>****</p>
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
