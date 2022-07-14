// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMediaListByURLRequest} extends {@link RequestModel}
 *
 * <p>QueryMediaListByURLRequest</p>
 */
public class QueryMediaListByURLRequest extends Request {
    @Query
    @NameInMap("FileURLs")
    @Validation(required = true)
    private String fileURLs;

    @Query
    @NameInMap("IncludeMediaInfo")
    private Boolean includeMediaInfo;

    @Query
    @NameInMap("IncludePlayList")
    private Boolean includePlayList;

    @Query
    @NameInMap("IncludeSnapshotList")
    private Boolean includeSnapshotList;

    @Query
    @NameInMap("IncludeSummaryList")
    private Boolean includeSummaryList;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private QueryMediaListByURLRequest(Builder builder) {
        super(builder);
        this.fileURLs = builder.fileURLs;
        this.includeMediaInfo = builder.includeMediaInfo;
        this.includePlayList = builder.includePlayList;
        this.includeSnapshotList = builder.includeSnapshotList;
        this.includeSummaryList = builder.includeSummaryList;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMediaListByURLRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileURLs
     */
    public String getFileURLs() {
        return this.fileURLs;
    }

    /**
     * @return includeMediaInfo
     */
    public Boolean getIncludeMediaInfo() {
        return this.includeMediaInfo;
    }

    /**
     * @return includePlayList
     */
    public Boolean getIncludePlayList() {
        return this.includePlayList;
    }

    /**
     * @return includeSnapshotList
     */
    public Boolean getIncludeSnapshotList() {
        return this.includeSnapshotList;
    }

    /**
     * @return includeSummaryList
     */
    public Boolean getIncludeSummaryList() {
        return this.includeSummaryList;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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

    public static final class Builder extends Request.Builder<QueryMediaListByURLRequest, Builder> {
        private String fileURLs; 
        private Boolean includeMediaInfo; 
        private Boolean includePlayList; 
        private Boolean includeSnapshotList; 
        private Boolean includeSummaryList; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(QueryMediaListByURLRequest request) {
            super(request);
            this.fileURLs = request.fileURLs;
            this.includeMediaInfo = request.includeMediaInfo;
            this.includePlayList = request.includePlayList;
            this.includeSnapshotList = request.includeSnapshotList;
            this.includeSummaryList = request.includeSummaryList;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * FileURLs.
         */
        public Builder fileURLs(String fileURLs) {
            this.putQueryParameter("FileURLs", fileURLs);
            this.fileURLs = fileURLs;
            return this;
        }

        /**
         * IncludeMediaInfo.
         */
        public Builder includeMediaInfo(Boolean includeMediaInfo) {
            this.putQueryParameter("IncludeMediaInfo", includeMediaInfo);
            this.includeMediaInfo = includeMediaInfo;
            return this;
        }

        /**
         * IncludePlayList.
         */
        public Builder includePlayList(Boolean includePlayList) {
            this.putQueryParameter("IncludePlayList", includePlayList);
            this.includePlayList = includePlayList;
            return this;
        }

        /**
         * IncludeSnapshotList.
         */
        public Builder includeSnapshotList(Boolean includeSnapshotList) {
            this.putQueryParameter("IncludeSnapshotList", includeSnapshotList);
            this.includeSnapshotList = includeSnapshotList;
            return this;
        }

        /**
         * IncludeSummaryList.
         */
        public Builder includeSummaryList(Boolean includeSummaryList) {
            this.putQueryParameter("IncludeSummaryList", includeSummaryList);
            this.includeSummaryList = includeSummaryList;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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
        public QueryMediaListByURLRequest build() {
            return new QueryMediaListByURLRequest(this);
        } 

    } 

}
