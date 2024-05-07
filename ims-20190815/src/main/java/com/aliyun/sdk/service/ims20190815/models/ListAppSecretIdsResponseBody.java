// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppSecretIdsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppSecretIdsResponseBody</p>
 */
public class ListAppSecretIdsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppSecrets")
    private AppSecrets appSecrets;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAppSecretIdsResponseBody(Builder builder) {
        this.appSecrets = builder.appSecrets;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppSecretIdsResponseBody create() {
        return builder().build();
    }

    /**
     * @return appSecrets
     */
    public AppSecrets getAppSecrets() {
        return this.appSecrets;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AppSecrets appSecrets; 
        private String requestId; 

        /**
         * The details of the application secret.
         */
        public Builder appSecrets(AppSecrets appSecrets) {
            this.appSecrets = appSecrets;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAppSecretIdsResponseBody build() {
            return new ListAppSecretIdsResponseBody(this);
        } 

    } 

    public static class AppSecret extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppSecretId")
        private String appSecretId;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        private AppSecret(Builder builder) {
            this.appId = builder.appId;
            this.appSecretId = builder.appSecretId;
            this.createDate = builder.createDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppSecret create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appSecretId
         */
        public String getAppSecretId() {
            return this.appSecretId;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        public static final class Builder {
            private String appId; 
            private String appSecretId; 
            private String createDate; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The ID of the application secret.
             */
            public Builder appSecretId(String appSecretId) {
                this.appSecretId = appSecretId;
                return this;
            }

            /**
             * The creation time.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            public AppSecret build() {
                return new AppSecret(this);
            } 

        } 

    }
    public static class AppSecrets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppSecret")
        private java.util.List < AppSecret> appSecret;

        private AppSecrets(Builder builder) {
            this.appSecret = builder.appSecret;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppSecrets create() {
            return builder().build();
        }

        /**
         * @return appSecret
         */
        public java.util.List < AppSecret> getAppSecret() {
            return this.appSecret;
        }

        public static final class Builder {
            private java.util.List < AppSecret> appSecret; 

            /**
             * AppSecret.
             */
            public Builder appSecret(java.util.List < AppSecret> appSecret) {
                this.appSecret = appSecret;
                return this;
            }

            public AppSecrets build() {
                return new AppSecrets(this);
            } 

        } 

    }
}
