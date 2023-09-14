// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExcessiveDeviceRegistrationApplicationsRequest} extends {@link RequestModel}
 *
 * <p>ListExcessiveDeviceRegistrationApplicationsRequest</p>
 */
public class ListExcessiveDeviceRegistrationApplicationsRequest extends Request {
    @Query
    @NameInMap("ApplicationIds")
    private java.util.List < String > applicationIds;

    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true)
    private Long currentPage;

    @Query
    @NameInMap("Department")
    private String department;

    @Query
    @NameInMap("DeviceTag")
    private String deviceTag;

    @Query
    @NameInMap("Hostname")
    private String hostname;

    @Query
    @NameInMap("Mac")
    private String mac;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Long pageSize;

    @Query
    @NameInMap("SaseUserId")
    private String saseUserId;

    @Query
    @NameInMap("Statuses")
    private java.util.List < String > statuses;

    @Query
    @NameInMap("Username")
    private String username;

    private ListExcessiveDeviceRegistrationApplicationsRequest(Builder builder) {
        super(builder);
        this.applicationIds = builder.applicationIds;
        this.currentPage = builder.currentPage;
        this.department = builder.department;
        this.deviceTag = builder.deviceTag;
        this.hostname = builder.hostname;
        this.mac = builder.mac;
        this.pageSize = builder.pageSize;
        this.saseUserId = builder.saseUserId;
        this.statuses = builder.statuses;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExcessiveDeviceRegistrationApplicationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationIds
     */
    public java.util.List < String > getApplicationIds() {
        return this.applicationIds;
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return department
     */
    public String getDepartment() {
        return this.department;
    }

    /**
     * @return deviceTag
     */
    public String getDeviceTag() {
        return this.deviceTag;
    }

    /**
     * @return hostname
     */
    public String getHostname() {
        return this.hostname;
    }

    /**
     * @return mac
     */
    public String getMac() {
        return this.mac;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return saseUserId
     */
    public String getSaseUserId() {
        return this.saseUserId;
    }

    /**
     * @return statuses
     */
    public java.util.List < String > getStatuses() {
        return this.statuses;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<ListExcessiveDeviceRegistrationApplicationsRequest, Builder> {
        private java.util.List < String > applicationIds; 
        private Long currentPage; 
        private String department; 
        private String deviceTag; 
        private String hostname; 
        private String mac; 
        private Long pageSize; 
        private String saseUserId; 
        private java.util.List < String > statuses; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(ListExcessiveDeviceRegistrationApplicationsRequest request) {
            super(request);
            this.applicationIds = request.applicationIds;
            this.currentPage = request.currentPage;
            this.department = request.department;
            this.deviceTag = request.deviceTag;
            this.hostname = request.hostname;
            this.mac = request.mac;
            this.pageSize = request.pageSize;
            this.saseUserId = request.saseUserId;
            this.statuses = request.statuses;
            this.username = request.username;
        } 

        /**
         * ApplicationIds.
         */
        public Builder applicationIds(java.util.List < String > applicationIds) {
            this.putQueryParameter("ApplicationIds", applicationIds);
            this.applicationIds = applicationIds;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Department.
         */
        public Builder department(String department) {
            this.putQueryParameter("Department", department);
            this.department = department;
            return this;
        }

        /**
         * DeviceTag.
         */
        public Builder deviceTag(String deviceTag) {
            this.putQueryParameter("DeviceTag", deviceTag);
            this.deviceTag = deviceTag;
            return this;
        }

        /**
         * Hostname.
         */
        public Builder hostname(String hostname) {
            this.putQueryParameter("Hostname", hostname);
            this.hostname = hostname;
            return this;
        }

        /**
         * Mac.
         */
        public Builder mac(String mac) {
            this.putQueryParameter("Mac", mac);
            this.mac = mac;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SaseUserId.
         */
        public Builder saseUserId(String saseUserId) {
            this.putQueryParameter("SaseUserId", saseUserId);
            this.saseUserId = saseUserId;
            return this;
        }

        /**
         * Statuses.
         */
        public Builder statuses(java.util.List < String > statuses) {
            this.putQueryParameter("Statuses", statuses);
            this.statuses = statuses;
            return this;
        }

        /**
         * Username.
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public ListExcessiveDeviceRegistrationApplicationsRequest build() {
            return new ListExcessiveDeviceRegistrationApplicationsRequest(this);
        } 

    } 

}
