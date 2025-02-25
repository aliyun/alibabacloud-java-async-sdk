// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListBindInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListBindInfoResponseBody</p>
 */
public class ListBindInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BindInfoModels")
    private java.util.List<BindInfoModels> bindInfoModels;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListBindInfoResponseBody(Builder builder) {
        this.bindInfoModels = builder.bindInfoModels;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBindInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return bindInfoModels
     */
    public java.util.List<BindInfoModels> getBindInfoModels() {
        return this.bindInfoModels;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<BindInfoModels> bindInfoModels; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * BindInfoModels.
         */
        public Builder bindInfoModels(java.util.List<BindInfoModels> bindInfoModels) {
            this.bindInfoModels = bindInfoModels;
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListBindInfoResponseBody build() {
            return new ListBindInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBindInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListBindInfoResponseBody</p>
     */
    public static class BindInfoModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountType")
        private String accountType;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
        private String appInstanceGroupId;

        @com.aliyun.core.annotation.NameInMap("AppInstanceId")
        private String appInstanceId;

        @com.aliyun.core.annotation.NameInMap("AppVersion")
        private String appVersion;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("WyId")
        private String wyId;

        private BindInfoModels(Builder builder) {
            this.accountType = builder.accountType;
            this.appId = builder.appId;
            this.appInstanceGroupId = builder.appInstanceGroupId;
            this.appInstanceId = builder.appInstanceId;
            this.appVersion = builder.appVersion;
            this.productType = builder.productType;
            this.regionId = builder.regionId;
            this.userId = builder.userId;
            this.wyId = builder.wyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BindInfoModels create() {
            return builder().build();
        }

        /**
         * @return accountType
         */
        public String getAccountType() {
            return this.accountType;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appInstanceGroupId
         */
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        /**
         * @return appInstanceId
         */
        public String getAppInstanceId() {
            return this.appInstanceId;
        }

        /**
         * @return appVersion
         */
        public String getAppVersion() {
            return this.appVersion;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return wyId
         */
        public String getWyId() {
            return this.wyId;
        }

        public static final class Builder {
            private String accountType; 
            private String appId; 
            private String appInstanceGroupId; 
            private String appInstanceId; 
            private String appVersion; 
            private String productType; 
            private String regionId; 
            private String userId; 
            private String wyId; 

            /**
             * AccountType.
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppInstanceGroupId.
             */
            public Builder appInstanceGroupId(String appInstanceGroupId) {
                this.appInstanceGroupId = appInstanceGroupId;
                return this;
            }

            /**
             * AppInstanceId.
             */
            public Builder appInstanceId(String appInstanceId) {
                this.appInstanceId = appInstanceId;
                return this;
            }

            /**
             * AppVersion.
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * ProductType.
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * WyId.
             */
            public Builder wyId(String wyId) {
                this.wyId = wyId;
                return this;
            }

            public BindInfoModels build() {
                return new BindInfoModels(this);
            } 

        } 

    }
}
