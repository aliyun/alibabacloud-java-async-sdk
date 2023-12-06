// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProductVersionPackageResponseBody} extends {@link TeaModel}
 *
 * <p>GetProductVersionPackageResponseBody</p>
 */
public class GetProductVersionPackageResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("msg")
    private String msg;

    private GetProductVersionPackageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProductVersionPackageResponseBody create() {
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
    public Data getData() {
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
        private Data data; 
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
        public Builder data(Data data) {
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

        public GetProductVersionPackageResponseBody build() {
            return new GetProductVersionPackageResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("packageContentType")
        private String packageContentType;

        @NameInMap("packageSize")
        private String packageSize;

        @NameInMap("packageStatus")
        private String packageStatus;

        @NameInMap("packageType")
        private String packageType;

        @NameInMap("packageUID")
        private String packageUID;

        @NameInMap("packageURL")
        private String packageURL;

        @NameInMap("platform")
        private Platform platform;

        @NameInMap("platformList")
        private java.util.List < Platform > platformList;

        private Data(Builder builder) {
            this.packageContentType = builder.packageContentType;
            this.packageSize = builder.packageSize;
            this.packageStatus = builder.packageStatus;
            this.packageType = builder.packageType;
            this.packageUID = builder.packageUID;
            this.packageURL = builder.packageURL;
            this.platform = builder.platform;
            this.platformList = builder.platformList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return packageContentType
         */
        public String getPackageContentType() {
            return this.packageContentType;
        }

        /**
         * @return packageSize
         */
        public String getPackageSize() {
            return this.packageSize;
        }

        /**
         * @return packageStatus
         */
        public String getPackageStatus() {
            return this.packageStatus;
        }

        /**
         * @return packageType
         */
        public String getPackageType() {
            return this.packageType;
        }

        /**
         * @return packageUID
         */
        public String getPackageUID() {
            return this.packageUID;
        }

        /**
         * @return packageURL
         */
        public String getPackageURL() {
            return this.packageURL;
        }

        /**
         * @return platform
         */
        public Platform getPlatform() {
            return this.platform;
        }

        /**
         * @return platformList
         */
        public java.util.List < Platform > getPlatformList() {
            return this.platformList;
        }

        public static final class Builder {
            private String packageContentType; 
            private String packageSize; 
            private String packageStatus; 
            private String packageType; 
            private String packageUID; 
            private String packageURL; 
            private Platform platform; 
            private java.util.List < Platform > platformList; 

            /**
             * packageContentType.
             */
            public Builder packageContentType(String packageContentType) {
                this.packageContentType = packageContentType;
                return this;
            }

            /**
             * packageSize.
             */
            public Builder packageSize(String packageSize) {
                this.packageSize = packageSize;
                return this;
            }

            /**
             * packageStatus.
             */
            public Builder packageStatus(String packageStatus) {
                this.packageStatus = packageStatus;
                return this;
            }

            /**
             * packageType.
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * packageUID.
             */
            public Builder packageUID(String packageUID) {
                this.packageUID = packageUID;
                return this;
            }

            /**
             * packageURL.
             */
            public Builder packageURL(String packageURL) {
                this.packageURL = packageURL;
                return this;
            }

            /**
             * platform.
             */
            public Builder platform(Platform platform) {
                this.platform = platform;
                return this;
            }

            /**
             * platformList.
             */
            public Builder platformList(java.util.List < Platform > platformList) {
                this.platformList = platformList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
