// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcipam20230228.models;

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
 * {@link ListIpamsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIpamsResponseBody</p>
 */
public class ListIpamsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("Ipams")
    private java.util.List<Ipams> ipams;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListIpamsResponseBody(Builder builder) {
        this.count = builder.count;
        this.ipams = builder.ipams;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIpamsResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return ipams
     */
    public java.util.List<Ipams> getIpams() {
        return this.ipams;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long count; 
        private java.util.List<Ipams> ipams; 
        private Long maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Count.
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The IPAMs.</p>
         */
        public Builder ipams(java.util.List<Ipams> ipams) {
            this.ipams = ipams;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
         * <li>If a value of <strong>NextToken</strong> is returned, the value indicates the token that is used for the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>23CA0A0B-B0F5-5495-B355-7D9A9203A46B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListIpamsResponseBody build() {
            return new ListIpamsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIpamsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIpamsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIpamsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIpamsResponseBody</p>
     */
    public static class Ipams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DefaultResourceDiscoveryAssociationId")
        private String defaultResourceDiscoveryAssociationId;

        @com.aliyun.core.annotation.NameInMap("DefaultResourceDiscoveryId")
        private String defaultResourceDiscoveryId;

        @com.aliyun.core.annotation.NameInMap("IpamDescription")
        private String ipamDescription;

        @com.aliyun.core.annotation.NameInMap("IpamId")
        private String ipamId;

        @com.aliyun.core.annotation.NameInMap("IpamName")
        private String ipamName;

        @com.aliyun.core.annotation.NameInMap("IpamStatus")
        private String ipamStatus;

        @com.aliyun.core.annotation.NameInMap("OperatingRegionList")
        private java.util.List<String> operatingRegionList;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private Long ownerId;

        @com.aliyun.core.annotation.NameInMap("PrivateDefaultScopeId")
        private String privateDefaultScopeId;

        @com.aliyun.core.annotation.NameInMap("PublicDefaultScopeId")
        private String publicDefaultScopeId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceDiscoveryAssociationCount")
        private Integer resourceDiscoveryAssociationCount;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ScopeCount")
        private Integer scopeCount;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private Ipams(Builder builder) {
            this.createTime = builder.createTime;
            this.defaultResourceDiscoveryAssociationId = builder.defaultResourceDiscoveryAssociationId;
            this.defaultResourceDiscoveryId = builder.defaultResourceDiscoveryId;
            this.ipamDescription = builder.ipamDescription;
            this.ipamId = builder.ipamId;
            this.ipamName = builder.ipamName;
            this.ipamStatus = builder.ipamStatus;
            this.operatingRegionList = builder.operatingRegionList;
            this.ownerId = builder.ownerId;
            this.privateDefaultScopeId = builder.privateDefaultScopeId;
            this.publicDefaultScopeId = builder.publicDefaultScopeId;
            this.regionId = builder.regionId;
            this.resourceDiscoveryAssociationCount = builder.resourceDiscoveryAssociationCount;
            this.resourceGroupId = builder.resourceGroupId;
            this.scopeCount = builder.scopeCount;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipams create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return defaultResourceDiscoveryAssociationId
         */
        public String getDefaultResourceDiscoveryAssociationId() {
            return this.defaultResourceDiscoveryAssociationId;
        }

        /**
         * @return defaultResourceDiscoveryId
         */
        public String getDefaultResourceDiscoveryId() {
            return this.defaultResourceDiscoveryId;
        }

        /**
         * @return ipamDescription
         */
        public String getIpamDescription() {
            return this.ipamDescription;
        }

        /**
         * @return ipamId
         */
        public String getIpamId() {
            return this.ipamId;
        }

        /**
         * @return ipamName
         */
        public String getIpamName() {
            return this.ipamName;
        }

        /**
         * @return ipamStatus
         */
        public String getIpamStatus() {
            return this.ipamStatus;
        }

        /**
         * @return operatingRegionList
         */
        public java.util.List<String> getOperatingRegionList() {
            return this.operatingRegionList;
        }

        /**
         * @return ownerId
         */
        public Long getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return privateDefaultScopeId
         */
        public String getPrivateDefaultScopeId() {
            return this.privateDefaultScopeId;
        }

        /**
         * @return publicDefaultScopeId
         */
        public String getPublicDefaultScopeId() {
            return this.publicDefaultScopeId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceDiscoveryAssociationCount
         */
        public Integer getResourceDiscoveryAssociationCount() {
            return this.resourceDiscoveryAssociationCount;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return scopeCount
         */
        public Integer getScopeCount() {
            return this.scopeCount;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String createTime; 
            private String defaultResourceDiscoveryAssociationId; 
            private String defaultResourceDiscoveryId; 
            private String ipamDescription; 
            private String ipamId; 
            private String ipamName; 
            private String ipamStatus; 
            private java.util.List<String> operatingRegionList; 
            private Long ownerId; 
            private String privateDefaultScopeId; 
            private String publicDefaultScopeId; 
            private String regionId; 
            private Integer resourceDiscoveryAssociationCount; 
            private String resourceGroupId; 
            private Integer scopeCount; 
            private java.util.List<Tags> tags; 

            /**
             * <p>The time when the IPAM was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-01T02:05:23Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DefaultResourceDiscoveryAssociationId.
             */
            public Builder defaultResourceDiscoveryAssociationId(String defaultResourceDiscoveryAssociationId) {
                this.defaultResourceDiscoveryAssociationId = defaultResourceDiscoveryAssociationId;
                return this;
            }

            /**
             * DefaultResourceDiscoveryId.
             */
            public Builder defaultResourceDiscoveryId(String defaultResourceDiscoveryId) {
                this.defaultResourceDiscoveryId = defaultResourceDiscoveryId;
                return this;
            }

            /**
             * <p>The description of the IPAM.</p>
             * 
             * <strong>example:</strong>
             * <p>test description</p>
             */
            public Builder ipamDescription(String ipamDescription) {
                this.ipamDescription = ipamDescription;
                return this;
            }

            /**
             * <p>The ID of the IPAM.</p>
             * 
             * <strong>example:</strong>
             * <p>ipam-ccxbnsbhew0d6t****</p>
             */
            public Builder ipamId(String ipamId) {
                this.ipamId = ipamId;
                return this;
            }

            /**
             * <p>The name of the IPAM.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder ipamName(String ipamName) {
                this.ipamName = ipamName;
                return this;
            }

            /**
             * <p>The status of the IPAM. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong></li>
             * <li><strong>Created</strong></li>
             * <li><strong>Deleting</strong></li>
             * <li><strong>Deleted</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Created</p>
             */
            public Builder ipamStatus(String ipamStatus) {
                this.ipamStatus = ipamStatus;
                return this;
            }

            /**
             * <p>The effective regions of the IPAM.</p>
             */
            public Builder operatingRegionList(java.util.List<String> operatingRegionList) {
                this.operatingRegionList = operatingRegionList;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account that owns the IPAM.</p>
             * 
             * <strong>example:</strong>
             * <p>1210123456******</p>
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The default private scope created by the system after the IPAM is created.</p>
             * 
             * <strong>example:</strong>
             * <p>ipam-scope-okoerbco6unqfr****</p>
             */
            public Builder privateDefaultScopeId(String privateDefaultScopeId) {
                this.privateDefaultScopeId = privateDefaultScopeId;
                return this;
            }

            /**
             * <p>The default public scope created by the system after the IPAM is created.</p>
             * 
             * <strong>example:</strong>
             * <p>ipam-scope-ovb76p1g1m19dr****</p>
             */
            public Builder publicDefaultScopeId(String publicDefaultScopeId) {
                this.publicDefaultScopeId = publicDefaultScopeId;
                return this;
            }

            /**
             * <p>The region ID of the IPAM.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceDiscoveryAssociationCount.
             */
            public Builder resourceDiscoveryAssociationCount(Integer resourceDiscoveryAssociationCount) {
                this.resourceDiscoveryAssociationCount = resourceDiscoveryAssociationCount;
                return this;
            }

            /**
             * <p>The resource group ID of the IPAM.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek2dbprgpt****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The number of IPAM scopes. Value: <strong>2 to 5</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder scopeCount(Integer scopeCount) {
                this.scopeCount = scopeCount;
                return this;
            }

            /**
             * <p>The tag list.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Ipams build() {
                return new Ipams(this);
            } 

        } 

    }
}
