// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20260120.models;

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
 * {@link ListDataSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataSourcesResponseBody</p>
 */
public class ListDataSourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListDataSourcesResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private Integer currentPage; 
        private java.util.List<Items> items; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListDataSourcesResponseBody model) {
            this.currentPage = model.currentPage;
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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

        public ListDataSourcesResponseBody build() {
            return new ListDataSourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataSourcesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectStatus")
        private String connectStatus;

        @com.aliyun.core.annotation.NameInMap("DataAssetId")
        private String dataAssetId;

        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private String dataSourceId;

        @com.aliyun.core.annotation.NameInMap("DataSourceSize")
        private Long dataSourceSize;

        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EngineType")
        private String engineType;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IdentifyStatus")
        private String identifyStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MemberAccount")
        private Long memberAccount;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Long port;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private Long productId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RegionName")
        private String regionName;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private Items(Builder builder) {
            this.connectStatus = builder.connectStatus;
            this.dataAssetId = builder.dataAssetId;
            this.dataSourceId = builder.dataSourceId;
            this.dataSourceSize = builder.dataSourceSize;
            this.dbName = builder.dbName;
            this.description = builder.description;
            this.engineType = builder.engineType;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.id = builder.id;
            this.identifyStatus = builder.identifyStatus;
            this.instanceId = builder.instanceId;
            this.memberAccount = builder.memberAccount;
            this.port = builder.port;
            this.productCode = builder.productCode;
            this.productId = builder.productId;
            this.regionId = builder.regionId;
            this.regionName = builder.regionName;
            this.resourceGroupId = builder.resourceGroupId;
            this.tenantId = builder.tenantId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return connectStatus
         */
        public String getConnectStatus() {
            return this.connectStatus;
        }

        /**
         * @return dataAssetId
         */
        public String getDataAssetId() {
            return this.dataAssetId;
        }

        /**
         * @return dataSourceId
         */
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        /**
         * @return dataSourceSize
         */
        public Long getDataSourceSize() {
            return this.dataSourceSize;
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return engineType
         */
        public String getEngineType() {
            return this.engineType;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return identifyStatus
         */
        public String getIdentifyStatus() {
            return this.identifyStatus;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return memberAccount
         */
        public Long getMemberAccount() {
            return this.memberAccount;
        }

        /**
         * @return port
         */
        public Long getPort() {
            return this.port;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return productId
         */
        public Long getProductId() {
            return this.productId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String connectStatus; 
            private String dataAssetId; 
            private String dataSourceId; 
            private Long dataSourceSize; 
            private String dbName; 
            private String description; 
            private String engineType; 
            private String errorCode; 
            private String errorMessage; 
            private Long id; 
            private String identifyStatus; 
            private String instanceId; 
            private Long memberAccount; 
            private Long port; 
            private String productCode; 
            private Long productId; 
            private String regionId; 
            private String regionName; 
            private String resourceGroupId; 
            private String tenantId; 
            private String userName; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.connectStatus = model.connectStatus;
                this.dataAssetId = model.dataAssetId;
                this.dataSourceId = model.dataSourceId;
                this.dataSourceSize = model.dataSourceSize;
                this.dbName = model.dbName;
                this.description = model.description;
                this.engineType = model.engineType;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.id = model.id;
                this.identifyStatus = model.identifyStatus;
                this.instanceId = model.instanceId;
                this.memberAccount = model.memberAccount;
                this.port = model.port;
                this.productCode = model.productCode;
                this.productId = model.productId;
                this.regionId = model.regionId;
                this.regionName = model.regionName;
                this.resourceGroupId = model.resourceGroupId;
                this.tenantId = model.tenantId;
                this.userName = model.userName;
            } 

            /**
             * ConnectStatus.
             */
            public Builder connectStatus(String connectStatus) {
                this.connectStatus = connectStatus;
                return this;
            }

            /**
             * DataAssetId.
             */
            public Builder dataAssetId(String dataAssetId) {
                this.dataAssetId = dataAssetId;
                return this;
            }

            /**
             * DataSourceId.
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * DataSourceSize.
             */
            public Builder dataSourceSize(Long dataSourceSize) {
                this.dataSourceSize = dataSourceSize;
                return this;
            }

            /**
             * DbName.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
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
             * EngineType.
             */
            public Builder engineType(String engineType) {
                this.engineType = engineType;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IdentifyStatus.
             */
            public Builder identifyStatus(String identifyStatus) {
                this.identifyStatus = identifyStatus;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * MemberAccount.
             */
            public Builder memberAccount(Long memberAccount) {
                this.memberAccount = memberAccount;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
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
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RegionName.
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
