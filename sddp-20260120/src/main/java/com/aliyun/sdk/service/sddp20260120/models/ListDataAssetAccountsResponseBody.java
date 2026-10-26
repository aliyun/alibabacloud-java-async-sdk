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
 * {@link ListDataAssetAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataAssetAccountsResponseBody</p>
 */
public class ListDataAssetAccountsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListDataAssetAccountsResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataAssetAccountsResponseBody create() {
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
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListDataAssetAccountsResponseBody model) {
            this.currentPage = model.currentPage;
            this.items = model.items;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number of the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The list of records returned in the current query.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The number of entries returned per page in the current query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID, which can be used to trace the current API call.</p>
         * 
         * <strong>example:</strong>
         * <p>7C6D8E9F-1234-5678-ABCD-0123456789AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries that meet the current statistics or query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDataAssetAccountsResponseBody build() {
            return new ListDataAssetAccountsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataAssetAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataAssetAccountsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("AuthDb")
        private String authDb;

        @com.aliyun.core.annotation.NameInMap("AuthRole")
        private String authRole;

        @com.aliyun.core.annotation.NameInMap("EncryptionKeyMode")
        private String encryptionKeyMode;

        @com.aliyun.core.annotation.NameInMap("EngineType")
        private String engineType;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private Long productId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RegionName")
        private String regionName;

        private Items(Builder builder) {
            this.accountName = builder.accountName;
            this.aliUid = builder.aliUid;
            this.authDb = builder.authDb;
            this.authRole = builder.authRole;
            this.encryptionKeyMode = builder.encryptionKeyMode;
            this.engineType = builder.engineType;
            this.expireTime = builder.expireTime;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.productCode = builder.productCode;
            this.productId = builder.productId;
            this.regionId = builder.regionId;
            this.regionName = builder.regionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return authDb
         */
        public String getAuthDb() {
            return this.authDb;
        }

        /**
         * @return authRole
         */
        public String getAuthRole() {
            return this.authRole;
        }

        /**
         * @return encryptionKeyMode
         */
        public String getEncryptionKeyMode() {
            return this.encryptionKeyMode;
        }

        /**
         * @return engineType
         */
        public String getEngineType() {
            return this.engineType;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
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

        public static final class Builder {
            private String accountName; 
            private Long aliUid; 
            private String authDb; 
            private String authRole; 
            private String encryptionKeyMode; 
            private String engineType; 
            private Long expireTime; 
            private Long id; 
            private String instanceId; 
            private String productCode; 
            private Long productId; 
            private String regionId; 
            private String regionName; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.accountName = model.accountName;
                this.aliUid = model.aliUid;
                this.authDb = model.authDb;
                this.authRole = model.authRole;
                this.encryptionKeyMode = model.encryptionKeyMode;
                this.engineType = model.engineType;
                this.expireTime = model.expireTime;
                this.id = model.id;
                this.instanceId = model.instanceId;
                this.productCode = model.productCode;
                this.productId = model.productId;
                this.regionId = model.regionId;
                this.regionName = model.regionName;
            } 

            /**
             * <p>The database account name.</p>
             * 
             * <strong>example:</strong>
             * <p>app_reader</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the asset belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789012****</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The authentication database of the MongoDB account. This parameter must be passed together with AccountName when modifying permissions.</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder authDb(String authDb) {
                this.authDb = authDb;
                return this;
            }

            /**
             * <p>The column encryption access permissions. Valid values:</p>
             * <ul>
             * <li>fullAccess: plaintext access</li>
             * <li>restrictedAccess: restricted access</li>
             * <li>noneAccess: decryption prohibited. This value applies only to ApsaraDB RDS for MySQL instances whose current effective key mode is client_key.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>fullAccess</p>
             */
            public Builder authRole(String authRole) {
                this.authRole = authRole;
                return this;
            }

            /**
             * <p>The current effective column encryption key mode. Valid values:</p>
             * <ul>
             * <li>client_key: local key</li>
             * <li>kms_key: KMS key
             * This parameter is not returned if no effective configuration exists.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>client_key</p>
             */
            public Builder encryptionKeyMode(String encryptionKeyMode) {
                this.encryptionKeyMode = encryptionKeyMode;
                return this;
            }

            /**
             * <p>The database engine type.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engineType(String engineType) {
                this.engineType = engineType;
                return this;
            }

            /**
             * <p>The expiration time of the plaintext access permissions. The value is a UNIX timestamp that represents the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. This parameter is not returned if no validity period is set.</p>
             * 
             * <strong>example:</strong>
             * <p>2145953410000</p>
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The database account ID. This ID is used as AccountId when configuring permissions.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The database instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-2ze1abcdefgh****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The cloud service code.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The cloud service type ID. Valid values: 5 (RDS), 8 (POLARDB), and 27 (PolarDBX2).</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder productId(Long productId) {
                this.productId = productId;
                return this;
            }

            /**
             * <p>The region ID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-zhangjiakou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The region name of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>China (Zhangjiakou)</p>
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
