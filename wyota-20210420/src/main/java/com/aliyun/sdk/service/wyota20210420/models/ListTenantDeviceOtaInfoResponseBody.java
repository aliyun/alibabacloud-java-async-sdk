// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListTenantDeviceOtaInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListTenantDeviceOtaInfoResponseBody</p>
 */
public class ListTenantDeviceOtaInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListTenantDeviceOtaInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTenantDeviceOtaInfoResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTenantDeviceOtaInfoResponseBody build() {
            return new ListTenantDeviceOtaInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTenantDeviceOtaInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListTenantDeviceOtaInfoResponseBody</p>
     */
    public static class TenantDeviceOtaInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentVersion")
        private String currentVersion;

        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        private TenantDeviceOtaInfos(Builder builder) {
            this.currentVersion = builder.currentVersion;
            this.deviceId = builder.deviceId;
            this.model = builder.model;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantDeviceOtaInfos create() {
            return builder().build();
        }

        /**
         * @return currentVersion
         */
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        public static final class Builder {
            private String currentVersion; 
            private String deviceId; 
            private String model; 

            /**
             * CurrentVersion.
             */
            public Builder currentVersion(String currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            public TenantDeviceOtaInfos build() {
                return new TenantDeviceOtaInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTenantDeviceOtaInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListTenantDeviceOtaInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TenantDeviceOtaInfos")
        private java.util.List < TenantDeviceOtaInfos> tenantDeviceOtaInfos;

        private Data(Builder builder) {
            this.tenantDeviceOtaInfos = builder.tenantDeviceOtaInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return tenantDeviceOtaInfos
         */
        public java.util.List < TenantDeviceOtaInfos> getTenantDeviceOtaInfos() {
            return this.tenantDeviceOtaInfos;
        }

        public static final class Builder {
            private java.util.List < TenantDeviceOtaInfos> tenantDeviceOtaInfos; 

            /**
             * TenantDeviceOtaInfos.
             */
            public Builder tenantDeviceOtaInfos(java.util.List < TenantDeviceOtaInfos> tenantDeviceOtaInfos) {
                this.tenantDeviceOtaInfos = tenantDeviceOtaInfos;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
