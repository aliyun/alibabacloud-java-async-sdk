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
 * {@link DescribePurchasedApisResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePurchasedApisResponseBody</p>
 */
public class DescribePurchasedApisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PurchasedApis")
    private PurchasedApis purchasedApis;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribePurchasedApisResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.purchasedApis = model.purchasedApis;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The monitoring information about API call delays. The returned information is an array consisting of purchased APIs.</p>
         */
        public Builder purchasedApis(PurchasedApis purchasedApis) {
            this.purchasedApis = purchasedApis;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CE5722A6-AE78-4741-A9B0-6C817D360510</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribePurchasedApisResponseBody build() {
            return new DescribePurchasedApisResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePurchasedApisResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePurchasedApisResponseBody</p>
     */
    public static class PurchasedApi extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("DeployedTime")
        private String deployedTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("PurchasedTime")
        private String purchasedTime;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("StageName")
        private String stageName;

        @com.aliyun.core.annotation.NameInMap("Visibility")
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

            private Builder() {
            } 

            private Builder(PurchasedApi model) {
                this.apiId = model.apiId;
                this.apiName = model.apiName;
                this.deployedTime = model.deployedTime;
                this.description = model.description;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.modifiedTime = model.modifiedTime;
                this.purchasedTime = model.purchasedTime;
                this.regionId = model.regionId;
                this.stageName = model.stageName;
                this.visibility = model.visibility;
            } 

            /**
             * <p>The ID of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>eb6e54c1576d41149746e8e69b0a0792</p>
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The name of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>gw_rado_tissot_</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>The deployment time. Format: yyyy-mm-ddhh:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-1113:57:38</p>
             */
            public Builder deployedTime(String deployedTime) {
                this.deployedTime = deployedTime;
                return this;
            }

            /**
             * <p>The description of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the API group to which the API belongs. This ID is generated by the system and globally unique.</p>
             * 
             * <strong>example:</strong>
             * <p>3013a55c0c44483f984d26df27120513</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the API group.</p>
             * 
             * <strong>example:</strong>
             * <p>DMS_DEFAULT_GROUP_408589</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The last modification time (UTC) of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-11T13:57:38+08:00</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The time when the API was purchased.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-11T13:57:38+08:00</p>
             */
            public Builder purchasedTime(String purchasedTime) {
                this.purchasedTime = purchasedTime;
                return this;
            }

            /**
             * <p>The ID of the region in which the API is located.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The name of the runtime environment. Valid values:</p>
             * <ul>
             * <li><strong>RELEASE</strong></li>
             * <li><strong>PRE</strong></li>
             * <li><strong>TEST</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TEST</p>
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            /**
             * <p>Indicates whether the API is public. Valid values:</p>
             * <ul>
             * <li><strong>PUBLIC</strong></li>
             * <li><strong>PRIVATE</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PUBLIC</p>
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
    /**
     * 
     * {@link DescribePurchasedApisResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePurchasedApisResponseBody</p>
     */
    public static class PurchasedApis extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PurchasedApi")
        private java.util.List<PurchasedApi> purchasedApi;

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
        public java.util.List<PurchasedApi> getPurchasedApi() {
            return this.purchasedApi;
        }

        public static final class Builder {
            private java.util.List<PurchasedApi> purchasedApi; 

            private Builder() {
            } 

            private Builder(PurchasedApis model) {
                this.purchasedApi = model.purchasedApi;
            } 

            /**
             * PurchasedApi.
             */
            public Builder purchasedApi(java.util.List<PurchasedApi> purchasedApi) {
                this.purchasedApi = purchasedApi;
                return this;
            }

            public PurchasedApis build() {
                return new PurchasedApis(this);
            } 

        } 

    }
}
