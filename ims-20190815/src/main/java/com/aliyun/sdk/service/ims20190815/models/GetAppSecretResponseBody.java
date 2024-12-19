// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link GetAppSecretResponseBody} extends {@link TeaModel}
 *
 * <p>GetAppSecretResponseBody</p>
 */
public class GetAppSecretResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppSecret")
    private AppSecret appSecret;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAppSecretResponseBody(Builder builder) {
        this.appSecret = builder.appSecret;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppSecretResponseBody create() {
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
         * <p>The details of the application secret.</p>
         */
        public Builder appSecret(AppSecret appSecret) {
            this.appSecret = appSecret;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE46FC3C-3BDE-4771-B531-27B7B6EB533D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAppSecretResponseBody build() {
            return new GetAppSecretResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAppSecretResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppSecretResponseBody</p>
     */
    public static class AppSecret extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppSecretId")
        private String appSecretId;

        @com.aliyun.core.annotation.NameInMap("AppSecretValue")
        private String appSecretValue;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
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
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>472457090344041****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The ID of the application secret.</p>
             * 
             * <strong>example:</strong>
             * <p>2efd5004-005c-4f05-83c6-5b1dd176****</p>
             */
            public Builder appSecretId(String appSecretId) {
                this.appSecretId = appSecretId;
                return this;
            }

            /**
             * <p>The content of the application secret.</p>
             * 
             * <strong>example:</strong>
             * <p>ai78ZmmxnlUG1jXlBZRDFKos9DIjY4m17Q7dCpMwn1rqXsTGb1X1XmrmveMp****</p>
             */
            public Builder appSecretValue(String appSecretValue) {
                this.appSecretValue = appSecretValue;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-26T02:52:31Z</p>
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
