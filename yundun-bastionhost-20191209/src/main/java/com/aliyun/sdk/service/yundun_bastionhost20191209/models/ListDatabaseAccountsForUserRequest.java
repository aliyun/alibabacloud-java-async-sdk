// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDatabaseAccountsForUserRequest} extends {@link RequestModel}
 *
 * <p>ListDatabaseAccountsForUserRequest</p>
 */
public class ListDatabaseAccountsForUserRequest extends Request {
    @Query
    @NameInMap("DatabaseAccountName")
    private String databaseAccountName;

    @Query
    @NameInMap("DatabaseId")
    @Validation(required = true)
    private String databaseId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PageNumber")
    private String pageNumber;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private ListDatabaseAccountsForUserRequest(Builder builder) {
        super(builder);
        this.databaseAccountName = builder.databaseAccountName;
        this.databaseId = builder.databaseId;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatabaseAccountsForUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databaseAccountName
     */
    public String getDatabaseAccountName() {
        return this.databaseAccountName;
    }

    /**
     * @return databaseId
     */
    public String getDatabaseId() {
        return this.databaseId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
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

    public static final class Builder extends Request.Builder<ListDatabaseAccountsForUserRequest, Builder> {
        private String databaseAccountName; 
        private String databaseId; 
        private String instanceId; 
        private String pageNumber; 
        private String pageSize; 
        private String regionId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ListDatabaseAccountsForUserRequest request) {
            super(request);
            this.databaseAccountName = request.databaseAccountName;
            this.databaseId = request.databaseId;
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.userId = request.userId;
        } 

        /**
         * DatabaseAccountName.
         */
        public Builder databaseAccountName(String databaseAccountName) {
            this.putQueryParameter("DatabaseAccountName", databaseAccountName);
            this.databaseAccountName = databaseAccountName;
            return this;
        }

        /**
         * DatabaseId.
         */
        public Builder databaseId(String databaseId) {
            this.putQueryParameter("DatabaseId", databaseId);
            this.databaseId = databaseId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ListDatabaseAccountsForUserRequest build() {
            return new ListDatabaseAccountsForUserRequest(this);
        } 

    } 

}
