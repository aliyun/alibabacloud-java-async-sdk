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
 * {@link CreateAppResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAppResponseBody</p>
 */
public class CreateAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppInfo")
    private AppInfo appInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAppResponseBody(Builder builder) {
        this.appInfo = builder.appInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppResponseBody create() {
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

        public CreateAppResponseBody build() {
            return new CreateAppResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateAppResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAppResponseBody</p>
     */
    public static class AppInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppKey")
        private String appKey;

        @com.aliyun.core.annotation.NameInMap("BundleId")
        private String bundleId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PackageName")
        private String packageName;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private Integer productId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        private AppInfo(Builder builder) {
            this.appKey = builder.appKey;
            this.bundleId = builder.bundleId;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.packageName = builder.packageName;
            this.productId = builder.productId;
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
         * @return bundleId
         */
        public String getBundleId() {
            return this.bundleId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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
        public Integer getProductId() {
            return this.productId;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String appKey; 
            private String bundleId; 
            private String createTime; 
            private String description; 
            private String modifyTime; 
            private String name; 
            private String packageName; 
            private Integer productId; 
            private Integer type; 

            /**
             * AppKey.
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
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
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
            public Builder productId(Integer productId) {
                this.productId = productId;
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
