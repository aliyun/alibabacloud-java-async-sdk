// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppSecretResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAppSecretResponseBody</p>
 */
public class CreateAppSecretResponseBody extends TeaModel {
    @NameInMap("AppSecret")
    private AppSecret appSecret;

    @NameInMap("RequestId")
    private String requestId;

    private CreateAppSecretResponseBody(Builder builder) {
        this.appSecret = builder.appSecret;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppSecretResponseBody create() {
        return builder().build();
    }

    /**
     * @return appSecret
     */
    public AppSecret getAppSecret() {
        return this.appSecret;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AppSecret appSecret; 
        private String requestId; 

        /**
         * The information of the application secret.
         */
        public Builder appSecret(AppSecret appSecret) {
            this.appSecret = appSecret;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAppSecretResponseBody build() {
            return new CreateAppSecretResponseBody(this);
        } 

    } 

    public static class AppSecret extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppSecretId")
        private String appSecretId;

        @NameInMap("AppSecretValue")
        private String appSecretValue;

        @NameInMap("CreateDate")
        private String createDate;

        private AppSecret(Builder builder) {
            this.appId = builder.appId;
            this.appSecretId = builder.appSecretId;
            this.appSecretValue = builder.appSecretValue;
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
         * @return appSecretValue
         */
        public String getAppSecretValue() {
            return this.appSecretValue;
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
            private String appSecretValue; 
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
             * The content of the application secret. This value can be used as the client secret for open authorization.
             */
            public Builder appSecretValue(String appSecretValue) {
                this.appSecretValue = appSecretValue;
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
}
