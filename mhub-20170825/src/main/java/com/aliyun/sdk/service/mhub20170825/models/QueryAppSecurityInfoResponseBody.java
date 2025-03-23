// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mhub20170825.models;

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
 * {@link QueryAppSecurityInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAppSecurityInfoResponseBody</p>
 */
public class QueryAppSecurityInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppSecurityInfo")
    private AppSecurityInfo appSecurityInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryAppSecurityInfoResponseBody(Builder builder) {
        this.appSecurityInfo = builder.appSecurityInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAppSecurityInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return appSecurityInfo
     */
    public AppSecurityInfo getAppSecurityInfo() {
        return this.appSecurityInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AppSecurityInfo appSecurityInfo; 
        private String requestId; 

        /**
         * AppSecurityInfo.
         */
        public Builder appSecurityInfo(AppSecurityInfo appSecurityInfo) {
            this.appSecurityInfo = appSecurityInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryAppSecurityInfoResponseBody build() {
            return new QueryAppSecurityInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAppSecurityInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAppSecurityInfoResponseBody</p>
     */
    public static class ExtConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TlogRsaSecret")
        private String tlogRsaSecret;

        private ExtConfig(Builder builder) {
            this.tlogRsaSecret = builder.tlogRsaSecret;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtConfig create() {
            return builder().build();
        }

        /**
         * @return tlogRsaSecret
         */
        public String getTlogRsaSecret() {
            return this.tlogRsaSecret;
        }

        public static final class Builder {
            private String tlogRsaSecret; 

            /**
             * TlogRsaSecret.
             */
            public Builder tlogRsaSecret(String tlogRsaSecret) {
                this.tlogRsaSecret = tlogRsaSecret;
                return this;
            }

            public ExtConfig build() {
                return new ExtConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAppSecurityInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAppSecurityInfoResponseBody</p>
     */
    public static class AppSecurityInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppKey")
        private String appKey;

        @com.aliyun.core.annotation.NameInMap("AppSecret")
        private String appSecret;

        @com.aliyun.core.annotation.NameInMap("ExtConfig")
        private ExtConfig extConfig;

        private AppSecurityInfo(Builder builder) {
            this.appKey = builder.appKey;
            this.appSecret = builder.appSecret;
            this.extConfig = builder.extConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppSecurityInfo create() {
            return builder().build();
        }

        /**
         * @return appKey
         */
        public String getAppKey() {
            return this.appKey;
        }

        /**
         * @return appSecret
         */
        public String getAppSecret() {
            return this.appSecret;
        }

        /**
         * @return extConfig
         */
        public ExtConfig getExtConfig() {
            return this.extConfig;
        }

        public static final class Builder {
            private String appKey; 
            private String appSecret; 
            private ExtConfig extConfig; 

            /**
             * AppKey.
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * AppSecret.
             */
            public Builder appSecret(String appSecret) {
                this.appSecret = appSecret;
                return this;
            }

            /**
             * ExtConfig.
             */
            public Builder extConfig(ExtConfig extConfig) {
                this.extConfig = extConfig;
                return this;
            }

            public AppSecurityInfo build() {
                return new AppSecurityInfo(this);
            } 

        } 

    }
}
