// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkface20180720.models;

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
 * {@link QueryAuthenticationResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAuthenticationResponseBody</p>
 */
public class QueryAuthenticationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Page")
    private Integer page;

    @com.aliyun.core.annotation.NameInMap("PageCount")
    private Integer pageCount;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private QueryAuthenticationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.page = builder.page;
        this.pageCount = builder.pageCount;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAuthenticationResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageCount
     */
    public Integer getPageCount() {
        return this.pageCount;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List<Data> data; 
        private String message; 
        private Integer page; 
        private Integer pageCount; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * PageCount.
         */
        public Builder pageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public QueryAuthenticationResponseBody build() {
            return new QueryAuthenticationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAuthenticationResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAuthenticationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApkPubkey")
        private String apkPubkey;

        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private String beginTime;

        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("IotId")
        private String iotId;

        @com.aliyun.core.annotation.NameInMap("LicenseType")
        private Integer licenseType;

        @com.aliyun.core.annotation.NameInMap("PackageName")
        private String packageName;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        private Data(Builder builder) {
            this.apkPubkey = builder.apkPubkey;
            this.beginTime = builder.beginTime;
            this.clientId = builder.clientId;
            this.deviceName = builder.deviceName;
            this.expiredTime = builder.expiredTime;
            this.iotId = builder.iotId;
            this.licenseType = builder.licenseType;
            this.packageName = builder.packageName;
            this.productKey = builder.productKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return apkPubkey
         */
        public String getApkPubkey() {
            return this.apkPubkey;
        }

        /**
         * @return beginTime
         */
        public String getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        /**
         * @return licenseType
         */
        public Integer getLicenseType() {
            return this.licenseType;
        }

        /**
         * @return packageName
         */
        public String getPackageName() {
            return this.packageName;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        public static final class Builder {
            private String apkPubkey; 
            private String beginTime; 
            private String clientId; 
            private String deviceName; 
            private String expiredTime; 
            private String iotId; 
            private Integer licenseType; 
            private String packageName; 
            private String productKey; 

            /**
             * ApkPubkey.
             */
            public Builder apkPubkey(String apkPubkey) {
                this.apkPubkey = apkPubkey;
                return this;
            }

            /**
             * BeginTime.
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * ClientId.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * IotId.
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            /**
             * LicenseType.
             */
            public Builder licenseType(Integer licenseType) {
                this.licenseType = licenseType;
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
             * ProductKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
