// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeCrossBackupMetaListRequest} extends {@link RequestModel}
 *
 * <p>DescribeCrossBackupMetaListRequest</p>
 */
public class DescribeCrossBackupMetaListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupSetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GetDbName")
    private String getDbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageIndex")
    private String pageIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pattern")
    private String pattern;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private DescribeCrossBackupMetaListRequest(Builder builder) {
        super(builder);
        this.backupSetId = builder.backupSetId;
        this.getDbName = builder.getDbName;
        this.ownerId = builder.ownerId;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.pattern = builder.pattern;
        this.region = builder.region;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCrossBackupMetaListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupSetId
     */
    public String getBackupSetId() {
        return this.backupSetId;
    }

    /**
     * @return getDbName
     */
    public String getGetDbName() {
        return this.getDbName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageIndex
     */
    public String getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pattern
     */
    public String getPattern() {
        return this.pattern;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<DescribeCrossBackupMetaListRequest, Builder> {
        private String backupSetId; 
        private String getDbName; 
        private Long ownerId; 
        private String pageIndex; 
        private String pageSize; 
        private String pattern; 
        private String region; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCrossBackupMetaListRequest request) {
            super(request);
            this.backupSetId = request.backupSetId;
            this.getDbName = request.getDbName;
            this.ownerId = request.ownerId;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.pattern = request.pattern;
            this.region = request.region;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The ID of the cross-region backup file that you want to use. You can call the <a href="https://help.aliyun.com/document_detail/121733.html">DescribeCrossRegionBackups</a> operation to query the ID of the cross-region backup file.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder backupSetId(String backupSetId) {
            this.putQueryParameter("BackupSetId", backupSetId);
            this.backupSetId = backupSetId;
            return this;
        }

        /**
         * <p>The name of the database that you want to query. The system implements exact match based on the value of this parameter and returns the name of the matched database and the names of the tables in the matched database.</p>
         * 
         * <strong>example:</strong>
         * <p>testdb1</p>
         */
        public Builder getDbName(String getDbName) {
            this.putQueryParameter("GetDbName", getDbName);
            this.getDbName = getDbName;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The number of the page to return. Valid values: any non-zero positive integer.</p>
         * <blockquote>
         * <p>This parameter only takes effect when you specify the <strong>PageSize</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(String pageIndex) {
            this.putQueryParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>The number of entries to return per page. Default value: <strong>1</strong>.</p>
         * <blockquote>
         * <p>This parameter only takes effect when you specify the <strong>PageIndex</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The name of the database that you want to query. The system implements fuzzy match based on the value of this parameter and returns only the name of the matched database.</p>
         * <blockquote>
         * <p>You can implement fuzzy match and then exact match. For example, you can set the Pattern parameter to test to query the testdb1 and testdb2 databases. Then, you can specify the <strong>GetDbName</strong> parameter to query only the matched database and the tables in the matched database.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder pattern(String pattern) {
            this.putQueryParameter("Pattern", pattern);
            this.pattern = pattern;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmy*****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public DescribeCrossBackupMetaListRequest build() {
            return new DescribeCrossBackupMetaListRequest(this);
        } 

    } 

}
