// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWirelessCloudConnectorGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListWirelessCloudConnectorGroupsResponseBody</p>
 */
public class ListWirelessCloudConnectorGroupsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private String maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private String totalCount;

    @NameInMap("WirelessCloudConnectorGroups")
    private java.util.List < WirelessCloudConnectorGroups> wirelessCloudConnectorGroups;

    private ListWirelessCloudConnectorGroupsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.wirelessCloudConnectorGroups = builder.wirelessCloudConnectorGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWirelessCloudConnectorGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public String getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
    public String getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return wirelessCloudConnectorGroups
     */
    public java.util.List < WirelessCloudConnectorGroups> getWirelessCloudConnectorGroups() {
        return this.wirelessCloudConnectorGroups;
    }

    public static final class Builder {
        private String maxResults; 
        private String nextToken; 
        private String requestId; 
        private String totalCount; 
        private java.util.List < WirelessCloudConnectorGroups> wirelessCloudConnectorGroups; 

        /**
         * MaxResults.
         */
        public Builder maxResults(String maxResults) {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * 数组，返回示例目录。
         */
        public Builder wirelessCloudConnectorGroups(java.util.List < WirelessCloudConnectorGroups> wirelessCloudConnectorGroups) {
            this.wirelessCloudConnectorGroups = wirelessCloudConnectorGroups;
            return this;
        }

        public ListWirelessCloudConnectorGroupsResponseBody build() {
            return new ListWirelessCloudConnectorGroupsResponseBody(this);
        } 

    } 

    public static class WirelessCloudConnectors extends TeaModel {
        @NameInMap("BusinessType")
        private String businessType;

        @NameInMap("CardCount")
        private String cardCount;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DataPackageId")
        private String dataPackageId;

        @NameInMap("DataPackageType")
        private String dataPackageType;

        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ServiceType")
        private String serviceType;

        @NameInMap("Status")
        private String status;

        @NameInMap("UseCase")
        private String useCase;

        @NameInMap("WirelessCloudConnectorId")
        private String wirelessCloudConnectorId;

        private WirelessCloudConnectors(Builder builder) {
            this.businessType = builder.businessType;
            this.cardCount = builder.cardCount;
            this.createTime = builder.createTime;
            this.dataPackageId = builder.dataPackageId;
            this.dataPackageType = builder.dataPackageType;
            this.description = builder.description;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.serviceType = builder.serviceType;
            this.status = builder.status;
            this.useCase = builder.useCase;
            this.wirelessCloudConnectorId = builder.wirelessCloudConnectorId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WirelessCloudConnectors create() {
            return builder().build();
        }

        /**
         * @return businessType
         */
        public String getBusinessType() {
            return this.businessType;
        }

        /**
         * @return cardCount
         */
        public String getCardCount() {
            return this.cardCount;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataPackageId
         */
        public String getDataPackageId() {
            return this.dataPackageId;
        }

        /**
         * @return dataPackageType
         */
        public String getDataPackageType() {
            return this.dataPackageType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return useCase
         */
        public String getUseCase() {
            return this.useCase;
        }

        /**
         * @return wirelessCloudConnectorId
         */
        public String getWirelessCloudConnectorId() {
            return this.wirelessCloudConnectorId;
        }

        public static final class Builder {
            private String businessType; 
            private String cardCount; 
            private String createTime; 
            private String dataPackageId; 
            private String dataPackageType; 
            private String description; 
            private String name; 
            private String regionId; 
            private String serviceType; 
            private String status; 
            private String useCase; 
            private String wirelessCloudConnectorId; 

            /**
             * BusinessType.
             */
            public Builder businessType(String businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * CardCount.
             */
            public Builder cardCount(String cardCount) {
                this.cardCount = cardCount;
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
             * DataPackageId.
             */
            public Builder dataPackageId(String dataPackageId) {
                this.dataPackageId = dataPackageId;
                return this;
            }

            /**
             * DataPackageType.
             */
            public Builder dataPackageType(String dataPackageType) {
                this.dataPackageType = dataPackageType;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * ServiceType.
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UseCase.
             */
            public Builder useCase(String useCase) {
                this.useCase = useCase;
                return this;
            }

            /**
             * WirelessCloudConnectorId.
             */
            public Builder wirelessCloudConnectorId(String wirelessCloudConnectorId) {
                this.wirelessCloudConnectorId = wirelessCloudConnectorId;
                return this;
            }

            public WirelessCloudConnectors build() {
                return new WirelessCloudConnectors(this);
            } 

        } 

    }
    public static class WirelessCloudConnectorGroups extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        @NameInMap("WirelessCloudConnectorGroupId")
        private String wirelessCloudConnectorGroupId;

        @NameInMap("WirelessCloudConnectors")
        private java.util.List < WirelessCloudConnectors> wirelessCloudConnectors;

        private WirelessCloudConnectorGroups(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.wirelessCloudConnectorGroupId = builder.wirelessCloudConnectorGroupId;
            this.wirelessCloudConnectors = builder.wirelessCloudConnectors;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WirelessCloudConnectorGroups create() {
            return builder().build();
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return wirelessCloudConnectorGroupId
         */
        public String getWirelessCloudConnectorGroupId() {
            return this.wirelessCloudConnectorGroupId;
        }

        /**
         * @return wirelessCloudConnectors
         */
        public java.util.List < WirelessCloudConnectors> getWirelessCloudConnectors() {
            return this.wirelessCloudConnectors;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String name; 
            private String regionId; 
            private String status; 
            private String wirelessCloudConnectorGroupId; 
            private java.util.List < WirelessCloudConnectors> wirelessCloudConnectors; 

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
             * 代表创建时间的资源属性字段
             */
            public Builder name(String name) {
                this.name = name;
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
             * 代表资源名称的资源属性字段
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 代表资源一级ID的资源属性字段
             */
            public Builder wirelessCloudConnectorGroupId(String wirelessCloudConnectorGroupId) {
                this.wirelessCloudConnectorGroupId = wirelessCloudConnectorGroupId;
                return this;
            }

            /**
             * WirelessCloudConnectors.
             */
            public Builder wirelessCloudConnectors(java.util.List < WirelessCloudConnectors> wirelessCloudConnectors) {
                this.wirelessCloudConnectors = wirelessCloudConnectors;
                return this;
            }

            public WirelessCloudConnectorGroups build() {
                return new WirelessCloudConnectorGroups(this);
            } 

        } 

    }
}
