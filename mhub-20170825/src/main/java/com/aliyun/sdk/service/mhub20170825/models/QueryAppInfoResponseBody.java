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
 * {@link QueryAppInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAppInfoResponseBody</p>
 */
public class QueryAppInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppInfo")
    private AppInfo appInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryAppInfoResponseBody(Builder builder) {
        this.appInfo = builder.appInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAppInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return appInfo
     */
    public AppInfo getAppInfo() {
        return this.appInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AppInfo appInfo; 
        private String requestId; 

        /**
         * AppInfo.
         */
        public Builder appInfo(AppInfo appInfo) {
            this.appInfo = appInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryAppInfoResponseBody build() {
            return new QueryAppInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAppInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAppInfoResponseBody</p>
     */
    public static class AppInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppKey")
        private String appKey;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("BundleId")
        private String bundleId;

        @com.aliyun.core.annotation.NameInMap("CertDevelopAvail")
        private Boolean certDevelopAvail;

        @com.aliyun.core.annotation.NameInMap("CertDevelopExpiration")
        private String certDevelopExpiration;

        @com.aliyun.core.annotation.NameInMap("CertProductAvail")
        private Boolean certProductAvail;

        @com.aliyun.core.annotation.NameInMap("CertProductExpiration")
        private String certProductExpiration;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EncodedIcon")
        private String encodedIcon;

        @com.aliyun.core.annotation.NameInMap("IndustryId")
        private Integer industryId;

        @com.aliyun.core.annotation.NameInMap("PackageName")
        private String packageName;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private Long productId;

        @com.aliyun.core.annotation.NameInMap("Readonly")
        private Boolean readonly;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        private AppInfo(Builder builder) {
            this.appKey = builder.appKey;
            this.appName = builder.appName;
            this.bundleId = builder.bundleId;
            this.certDevelopAvail = builder.certDevelopAvail;
            this.certDevelopExpiration = builder.certDevelopExpiration;
            this.certProductAvail = builder.certProductAvail;
            this.certProductExpiration = builder.certProductExpiration;
            this.createTime = builder.createTime;
            this.encodedIcon = builder.encodedIcon;
            this.industryId = builder.industryId;
            this.packageName = builder.packageName;
            this.productId = builder.productId;
            this.readonly = builder.readonly;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppInfo create() {
            return builder().build();
        }

        /**
         * @return appKey
         */
        public String getAppKey() {
            return this.appKey;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return bundleId
         */
        public String getBundleId() {
            return this.bundleId;
        }

        /**
         * @return certDevelopAvail
         */
        public Boolean getCertDevelopAvail() {
            return this.certDevelopAvail;
        }

        /**
         * @return certDevelopExpiration
         */
        public String getCertDevelopExpiration() {
            return this.certDevelopExpiration;
        }

        /**
         * @return certProductAvail
         */
        public Boolean getCertProductAvail() {
            return this.certProductAvail;
        }

        /**
         * @return certProductExpiration
         */
        public String getCertProductExpiration() {
            return this.certProductExpiration;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return encodedIcon
         */
        public String getEncodedIcon() {
            return this.encodedIcon;
        }

        /**
         * @return industryId
         */
        public Integer getIndustryId() {
            return this.industryId;
        }

        /**
         * @return packageName
         */
        public String getPackageName() {
            return this.packageName;
        }

        /**
         * @return productId
         */
        public Long getProductId() {
            return this.productId;
        }

        /**
         * @return readonly
         */
        public Boolean getReadonly() {
            return this.readonly;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String appKey; 
            private String appName; 
            private String bundleId; 
            private Boolean certDevelopAvail; 
            private String certDevelopExpiration; 
            private Boolean certProductAvail; 
            private String certProductExpiration; 
            private String createTime; 
            private String encodedIcon; 
            private Integer industryId; 
            private String packageName; 
            private Long productId; 
            private Boolean readonly; 
            private Integer status; 
            private Integer type; 

            /**
             * AppKey.
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * BundleId.
             */
            public Builder bundleId(String bundleId) {
                this.bundleId = bundleId;
                return this;
            }

            /**
             * CertDevelopAvail.
             */
            public Builder certDevelopAvail(Boolean certDevelopAvail) {
                this.certDevelopAvail = certDevelopAvail;
                return this;
            }

            /**
             * CertDevelopExpiration.
             */
            public Builder certDevelopExpiration(String certDevelopExpiration) {
                this.certDevelopExpiration = certDevelopExpiration;
                return this;
            }

            /**
             * CertProductAvail.
             */
            public Builder certProductAvail(Boolean certProductAvail) {
                this.certProductAvail = certProductAvail;
                return this;
            }

            /**
             * CertProductExpiration.
             */
            public Builder certProductExpiration(String certProductExpiration) {
                this.certProductExpiration = certProductExpiration;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * EncodedIcon.
             */
            public Builder encodedIcon(String encodedIcon) {
                this.encodedIcon = encodedIcon;
                return this;
            }

            /**
             * IndustryId.
             */
            public Builder industryId(Integer industryId) {
                this.industryId = industryId;
                return this;
            }

            /**
             * PackageName.
             */
            public Builder packageName(String packageName) {
                this.packageName = packageName;
                return this;
            }

            /**
             * ProductId.
             */
            public Builder productId(Long productId) {
                this.productId = productId;
                return this;
            }

            /**
             * Readonly.
             */
            public Builder readonly(Boolean readonly) {
                this.readonly = readonly;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public AppInfo build() {
                return new AppInfo(this);
            } 

        } 

    }
}
