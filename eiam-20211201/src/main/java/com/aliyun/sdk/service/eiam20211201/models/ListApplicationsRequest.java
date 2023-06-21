// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicationsRequest} extends {@link RequestModel}
 *
 * <p>ListApplicationsRequest</p>
 */
public class ListApplicationsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ApplicationIds")
    private java.util.List < String > applicationIds;

    @Query
    @NameInMap("ApplicationName")
    @Validation(maxLength = 64)
    private String applicationName;

    @Query
    @NameInMap("AuthorizationType")
    @Validation(maxLength = 64)
    private String authorizationType;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true, maxLength = 64)
    private String instanceId;

    @Query
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("Status")
    @Validation(maxLength = 32)
    private String status;

    private ListApplicationsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applicationIds = builder.applicationIds;
        this.applicationName = builder.applicationName;
        this.authorizationType = builder.authorizationType;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationsRequest create() {
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
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return authorizationType
     */
    public String getAuthorizationType() {
        return this.authorizationType;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListApplicationsRequest, Builder> {
        private String regionId; 
        private java.util.List < String > applicationIds; 
        private String applicationName; 
        private String authorizationType; 
        private String instanceId; 
        private Long pageNumber; 
        private Long pageSize; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListApplicationsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applicationIds = request.applicationIds;
            this.applicationName = request.applicationName;
            this.authorizationType = request.authorizationType;
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.status = request.status;
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
         * The IDs of the applications.
         */
        public Builder applicationIds(java.util.List < String > applicationIds) {
            this.putQueryParameter("ApplicationIds", applicationIds);
            this.applicationIds = applicationIds;
            return this;
        }

        /**
         * The name of the application. Only fuzzy match from the leftmost character is supported.
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("ApplicationName", applicationName);
            this.applicationName = applicationName;
            return this;
        }

        /**
         * The authorization of the application. Valid values:
         * <p>
         * 
         * *   authorize_required: Only the user with explicit authorization can access the application.
         * *   default_all: By default, all users can access the application.
         */
        public Builder authorizationType(String authorizationType) {
            this.putQueryParameter("AuthorizationType", authorizationType);
            this.authorizationType = authorizationType;
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
         * The status of the application. Valid values:
         * <p>
         * 
         * *   Enabled: The application is enabled.
         * *   Disabled: The application is disabled.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListApplicationsRequest build() {
            return new ListApplicationsRequest(this);
        } 

    } 

}
