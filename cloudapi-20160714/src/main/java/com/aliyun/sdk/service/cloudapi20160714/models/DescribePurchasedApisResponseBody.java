// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePurchasedApisResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePurchasedApisResponseBody</p>
 */
public class DescribePurchasedApisResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("PurchasedApis")
    private PurchasedApis purchasedApis;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribePurchasedApisResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.purchasedApis = builder.purchasedApis;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePurchasedApisResponseBody create() {
        return builder().build();
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
     * @return purchasedApis
     */
    public PurchasedApis getPurchasedApis() {
        return this.purchasedApis;
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
        private Integer pageNumber; 
        private Integer pageSize; 
        private PurchasedApis purchasedApis; 
        private String requestId; 
        private Integer totalCount; 

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
         * PurchasedApis.
         */
        public Builder purchasedApis(PurchasedApis purchasedApis) {
            this.purchasedApis = purchasedApis;
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

        public DescribePurchasedApisResponseBody build() {
            return new DescribePurchasedApisResponseBody(this);
        } 

    } 

    public static class PurchasedApi extends TeaModel {
        @NameInMap("ApiId")
        private String apiId;

        @NameInMap("ApiName")
        private String apiName;

        @NameInMap("DeployedTime")
        private String deployedTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("PurchasedTime")
        private String purchasedTime;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("StageName")
        private String stageName;

        @NameInMap("Visibility")
        private String visibility;

        private PurchasedApi(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.deployedTime = builder.deployedTime;
            this.description = builder.description;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.modifiedTime = builder.modifiedTime;
            this.purchasedTime = builder.purchasedTime;
            this.regionId = builder.regionId;
            this.stageName = builder.stageName;
            this.visibility = builder.visibility;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PurchasedApi create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public String getApiId() {
            return this.apiId;
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return deployedTime
         */
        public String getDeployedTime() {
            return this.deployedTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return purchasedTime
         */
        public String getPurchasedTime() {
            return this.purchasedTime;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return stageName
         */
        public String getStageName() {
            return this.stageName;
        }

        /**
         * @return visibility
         */
        public String getVisibility() {
            return this.visibility;
        }

        public static final class Builder {
            private String apiId; 
            private String apiName; 
            private String deployedTime; 
            private String description; 
            private String groupId; 
            private String groupName; 
            private String modifiedTime; 
            private String purchasedTime; 
            private String regionId; 
            private String stageName; 
            private String visibility; 

            /**
             * ApiId.
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * ApiName.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * DeployedTime.
             */
            public Builder deployedTime(String deployedTime) {
                this.deployedTime = deployedTime;
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
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * PurchasedTime.
             */
            public Builder purchasedTime(String purchasedTime) {
                this.purchasedTime = purchasedTime;
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
             * StageName.
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            /**
             * Visibility.
             */
            public Builder visibility(String visibility) {
                this.visibility = visibility;
                return this;
            }

            public PurchasedApi build() {
                return new PurchasedApi(this);
            } 

        } 

    }
    public static class PurchasedApis extends TeaModel {
        @NameInMap("PurchasedApi")
        private java.util.List < PurchasedApi> purchasedApi;

        private PurchasedApis(Builder builder) {
            this.purchasedApi = builder.purchasedApi;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PurchasedApis create() {
            return builder().build();
        }

        /**
         * @return purchasedApi
         */
        public java.util.List < PurchasedApi> getPurchasedApi() {
            return this.purchasedApi;
        }

        public static final class Builder {
            private java.util.List < PurchasedApi> purchasedApi; 

            /**
             * PurchasedApi.
             */
            public Builder purchasedApi(java.util.List < PurchasedApi> purchasedApi) {
                this.purchasedApi = purchasedApi;
                return this;
            }

            public PurchasedApis build() {
                return new PurchasedApis(this);
            } 

        } 

    }
}
