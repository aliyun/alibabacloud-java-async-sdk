// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductEnvironmentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProductEnvironmentsResponseBody</p>
 */
public class ListProductEnvironmentsResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("msg")
    private String msg;

    private ListProductEnvironmentsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductEnvironmentsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String msg; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        public ListProductEnvironmentsResponseBody build() {
            return new ListProductEnvironmentsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("envName")
        private String envName;

        @NameInMap("envType")
        private String envType;

        @NameInMap("envUID")
        private String envUID;

        @NameInMap("instanceStatus")
        private String instanceStatus;

        @NameInMap("oldProductVersion")
        private String oldProductVersion;

        @NameInMap("oldProductVersionUID")
        private String oldProductVersionUID;

        @NameInMap("platformStatus")
        private String platformStatus;

        @NameInMap("productName")
        private String productName;

        @NameInMap("productUID")
        private String productUID;

        @NameInMap("productVersion")
        private String productVersion;

        @NameInMap("productVersionUID")
        private String productVersionUID;

        @NameInMap("provider")
        private String provider;

        @NameInMap("uid")
        private String uid;

        @NameInMap("vendorConfig")
        private String vendorConfig;

        @NameInMap("vendorType")
        private String vendorType;

        private Data(Builder builder) {
            this.envName = builder.envName;
            this.envType = builder.envType;
            this.envUID = builder.envUID;
            this.instanceStatus = builder.instanceStatus;
            this.oldProductVersion = builder.oldProductVersion;
            this.oldProductVersionUID = builder.oldProductVersionUID;
            this.platformStatus = builder.platformStatus;
            this.productName = builder.productName;
            this.productUID = builder.productUID;
            this.productVersion = builder.productVersion;
            this.productVersionUID = builder.productVersionUID;
            this.provider = builder.provider;
            this.uid = builder.uid;
            this.vendorConfig = builder.vendorConfig;
            this.vendorType = builder.vendorType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return envName
         */
        public String getEnvName() {
            return this.envName;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return envUID
         */
        public String getEnvUID() {
            return this.envUID;
        }

        /**
         * @return instanceStatus
         */
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return oldProductVersion
         */
        public String getOldProductVersion() {
            return this.oldProductVersion;
        }

        /**
         * @return oldProductVersionUID
         */
        public String getOldProductVersionUID() {
            return this.oldProductVersionUID;
        }

        /**
         * @return platformStatus
         */
        public String getPlatformStatus() {
            return this.platformStatus;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return productUID
         */
        public String getProductUID() {
            return this.productUID;
        }

        /**
         * @return productVersion
         */
        public String getProductVersion() {
            return this.productVersion;
        }

        /**
         * @return productVersionUID
         */
        public String getProductVersionUID() {
            return this.productVersionUID;
        }

        /**
         * @return provider
         */
        public String getProvider() {
            return this.provider;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return vendorConfig
         */
        public String getVendorConfig() {
            return this.vendorConfig;
        }

        /**
         * @return vendorType
         */
        public String getVendorType() {
            return this.vendorType;
        }

        public static final class Builder {
            private String envName; 
            private String envType; 
            private String envUID; 
            private String instanceStatus; 
            private String oldProductVersion; 
            private String oldProductVersionUID; 
            private String platformStatus; 
            private String productName; 
            private String productUID; 
            private String productVersion; 
            private String productVersionUID; 
            private String provider; 
            private String uid; 
            private String vendorConfig; 
            private String vendorType; 

            /**
             * envName.
             */
            public Builder envName(String envName) {
                this.envName = envName;
                return this;
            }

            /**
             * envType.
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * envUID.
             */
            public Builder envUID(String envUID) {
                this.envUID = envUID;
                return this;
            }

            /**
             * instanceStatus.
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * oldProductVersion.
             */
            public Builder oldProductVersion(String oldProductVersion) {
                this.oldProductVersion = oldProductVersion;
                return this;
            }

            /**
             * oldProductVersionUID.
             */
            public Builder oldProductVersionUID(String oldProductVersionUID) {
                this.oldProductVersionUID = oldProductVersionUID;
                return this;
            }

            /**
             * platformStatus.
             */
            public Builder platformStatus(String platformStatus) {
                this.platformStatus = platformStatus;
                return this;
            }

            /**
             * productName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * productUID.
             */
            public Builder productUID(String productUID) {
                this.productUID = productUID;
                return this;
            }

            /**
             * productVersion.
             */
            public Builder productVersion(String productVersion) {
                this.productVersion = productVersion;
                return this;
            }

            /**
             * productVersionUID.
             */
            public Builder productVersionUID(String productVersionUID) {
                this.productVersionUID = productVersionUID;
                return this;
            }

            /**
             * provider.
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            /**
             * uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * vendorConfig.
             */
            public Builder vendorConfig(String vendorConfig) {
                this.vendorConfig = vendorConfig;
                return this;
            }

            /**
             * vendorType.
             */
            public Builder vendorType(String vendorType) {
                this.vendorType = vendorType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
