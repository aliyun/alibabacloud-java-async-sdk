// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicationsForUserRequest} extends {@link RequestModel}
 *
 * <p>ListApplicationsForUserRequest</p>
 */
public class ListApplicationsForUserRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationIds")
    private java.util.List < String > applicationIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryMode")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String queryMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String userId;

    private ListApplicationsForUserRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applicationIds = builder.applicationIds;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queryMode = builder.queryMode;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationsForUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return applicationIds
     */
    public java.util.List < String > getApplicationIds() {
        return this.applicationIds;
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
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queryMode
     */
    public String getQueryMode() {
        return this.queryMode;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ListApplicationsForUserRequest, Builder> {
        private String regionId; 
        private java.util.List < String > applicationIds; 
        private String instanceId; 
        private Long pageNumber; 
        private Long pageSize; 
        private String queryMode; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ListApplicationsForUserRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applicationIds = request.applicationIds;
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.queryMode = request.queryMode;
            this.userId = request.userId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The IDs of the applications that the EIAM account can access. You can query a maximum of 100 application IDs at a time.
         */
        public Builder applicationIds(java.util.List < String > applicationIds) {
            this.putQueryParameter("ApplicationIds", applicationIds);
            this.applicationIds = applicationIds;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The query mode. Default value: **OnlyDirect**. Valid values:
         * <p>
         * 
         * *   OnlyDirect: Only the direct permissions are queried. Direct permissions are the permissions that are directly granted to the account.
         * *   IncludeInherit: Both the permissions that are directly granted to the account and the inherited permissions are queried. Inherited permissions are the permissions that an account inherits from the parent organization or the group to which the account belongs.
         */
        public Builder queryMode(String queryMode) {
            this.putQueryParameter("QueryMode", queryMode);
            this.queryMode = queryMode;
            return this;
        }

        /**
         * The ID of the EIAM account.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ListApplicationsForUserRequest build() {
            return new ListApplicationsForUserRequest(this);
        } 

    } 

}
