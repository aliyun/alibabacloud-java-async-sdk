// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppSecuritiesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppSecuritiesResponseBody</p>
 */
public class DescribeAppSecuritiesResponseBody extends TeaModel {
    @NameInMap("AppSecuritys")
    private AppSecuritys appSecuritys;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAppSecuritiesResponseBody(Builder builder) {
        this.appSecuritys = builder.appSecuritys;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppSecuritiesResponseBody create() {
        return builder().build();
    }

    /**
     * @return appSecuritys
     */
    public AppSecuritys getAppSecuritys() {
        return this.appSecuritys;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AppSecuritys appSecuritys; 
        private String requestId; 

        /**
         * AppSecuritys.
         */
        public Builder appSecuritys(AppSecuritys appSecuritys) {
            this.appSecuritys = appSecuritys;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAppSecuritiesResponseBody build() {
            return new DescribeAppSecuritiesResponseBody(this);
        } 

    } 

    public static class AppSecurity extends TeaModel {
        @NameInMap("AppCode")
        private String appCode;

        @NameInMap("AppKey")
        private String appKey;

        @NameInMap("AppSecret")
        private String appSecret;

        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        private AppSecurity(Builder builder) {
            this.appCode = builder.appCode;
            this.appKey = builder.appKey;
            this.appSecret = builder.appSecret;
            this.createdTime = builder.createdTime;
            this.modifiedTime = builder.modifiedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppSecurity create() {
            return builder().build();
        }

        /**
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
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
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public static final class Builder {
            private String appCode; 
            private String appKey; 
            private String appSecret; 
            private String createdTime; 
            private String modifiedTime; 

            /**
             * AppCode.
             */
            public Builder appCode(String appCode) {
                this.appCode = appCode;
                return this;
            }

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
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            public AppSecurity build() {
                return new AppSecurity(this);
            } 

        } 

    }
    public static class AppSecuritys extends TeaModel {
        @NameInMap("AppSecurity")
        private java.util.List < AppSecurity> appSecurity;

        private AppSecuritys(Builder builder) {
            this.appSecurity = builder.appSecurity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppSecuritys create() {
            return builder().build();
        }

        /**
         * @return appSecurity
         */
        public java.util.List < AppSecurity> getAppSecurity() {
            return this.appSecurity;
        }

        public static final class Builder {
            private java.util.List < AppSecurity> appSecurity; 

            /**
             * AppSecurity.
             */
            public Builder appSecurity(java.util.List < AppSecurity> appSecurity) {
                this.appSecurity = appSecurity;
                return this;
            }

            public AppSecuritys build() {
                return new AppSecuritys(this);
            } 

        } 

    }
}
