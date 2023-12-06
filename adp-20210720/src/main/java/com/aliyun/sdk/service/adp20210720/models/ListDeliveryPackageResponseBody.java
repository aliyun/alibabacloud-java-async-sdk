// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeliveryPackageResponseBody} extends {@link TeaModel}
 *
 * <p>ListDeliveryPackageResponseBody</p>
 */
public class ListDeliveryPackageResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("msg")
    private String msg;

    private ListDeliveryPackageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeliveryPackageResponseBody create() {
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

        public ListDeliveryPackageResponseBody build() {
            return new ListDeliveryPackageResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("deliverableUID")
        private String deliverableUID;

        @NameInMap("originDeliverableUID")
        private String originDeliverableUID;

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
        private String platform;

        private Data(Builder builder) {
            this.deliverableUID = builder.deliverableUID;
            this.originDeliverableUID = builder.originDeliverableUID;
            this.packageContentType = builder.packageContentType;
            this.packageSize = builder.packageSize;
            this.packageStatus = builder.packageStatus;
            this.packageType = builder.packageType;
            this.packageUID = builder.packageUID;
            this.packageURL = builder.packageURL;
            this.platform = builder.platform;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deliverableUID
         */
        public String getDeliverableUID() {
            return this.deliverableUID;
        }

        /**
         * @return originDeliverableUID
         */
        public String getOriginDeliverableUID() {
            return this.originDeliverableUID;
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
        public String getPlatform() {
            return this.platform;
        }

        public static final class Builder {
            private String deliverableUID; 
            private String originDeliverableUID; 
            private String packageContentType; 
            private String packageSize; 
            private String packageStatus; 
            private String packageType; 
            private String packageUID; 
            private String packageURL; 
            private String platform; 

            /**
             * deliverableUID.
             */
            public Builder deliverableUID(String deliverableUID) {
                this.deliverableUID = deliverableUID;
                return this;
            }

            /**
             * originDeliverableUID.
             */
            public Builder originDeliverableUID(String originDeliverableUID) {
                this.originDeliverableUID = originDeliverableUID;
                return this;
            }

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
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
