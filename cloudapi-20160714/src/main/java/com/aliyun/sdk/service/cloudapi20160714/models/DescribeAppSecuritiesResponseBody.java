// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link DescribeAppSecuritiesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppSecuritiesResponseBody</p>
 */
public class DescribeAppSecuritiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppSecuritys")
    private AppSecuritys appSecuritys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The associated security policy information.</p>
         */
        public Builder appSecuritys(AppSecuritys appSecuritys) {
            this.appSecuritys = appSecuritys;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EF924FE4-2EDD-4CD3-89EC-34E4708574E7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAppSecuritiesResponseBody build() {
            return new DescribeAppSecuritiesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAppSecuritiesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppSecuritiesResponseBody</p>
     */
    public static class AppSecurity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppCode")
        private String appCode;

        @com.aliyun.core.annotation.NameInMap("AppKey")
        private String appKey;

        @com.aliyun.core.annotation.NameInMap("AppSecret")
        private String appSecret;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
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
             * <p>The application AppCode.</p>
             * 
             * <strong>example:</strong>
             * <p>d2350ecd62c44cbfbe35a7f182e35105</p>
             */
            public Builder appCode(String appCode) {
                this.appCode = appCode;
                return this;
            }

            /**
             * <p>The application AppKey.</p>
             * 
             * <strong>example:</strong>
             * <p>34379343</p>
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * <p>The application AppSecret.</p>
             * 
             * <strong>example:</strong>
             * <p>ea5291a7aff343769eb3139a2f6de8c9</p>
             */
            public Builder appSecret(String appSecret) {
                this.appSecret = appSecret;
                return this;
            }

            /**
             * <p>The time when the AppKey was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-14T18:50:59</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The time when the AppSecret was last modified. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-08-14T18:03:00+08:00</p>
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
    /**
     * 
     * {@link DescribeAppSecuritiesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppSecuritiesResponseBody</p>
     */
    public static class AppSecuritys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppSecurity")
        private java.util.List<AppSecurity> appSecurity;

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
        public java.util.List<AppSecurity> getAppSecurity() {
            return this.appSecurity;
        }

        public static final class Builder {
            private java.util.List<AppSecurity> appSecurity; 

            /**
             * AppSecurity.
             */
            public Builder appSecurity(java.util.List<AppSecurity> appSecurity) {
                this.appSecurity = appSecurity;
                return this;
            }

            public AppSecuritys build() {
                return new AppSecuritys(this);
            } 

        } 

    }
}
