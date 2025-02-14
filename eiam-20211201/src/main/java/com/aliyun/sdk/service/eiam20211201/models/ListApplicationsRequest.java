// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link ListApplicationsRequest} extends {@link RequestModel}
 *
 * <p>ListApplicationsRequest</p>
 */
public class ListApplicationsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationIds")
    private java.util.List<String> applicationIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationName")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String applicationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationType")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String authorizationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("M2MClientStatus")
    private String m2MClientStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceServerStatus")
    private String resourceServerStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SsoType")
    private String ssoType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String status;

    private ListApplicationsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applicationIds = builder.applicationIds;
        this.applicationName = builder.applicationName;
        this.authorizationType = builder.authorizationType;
        this.instanceId = builder.instanceId;
        this.m2MClientStatus = builder.m2MClientStatus;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceServerStatus = builder.resourceServerStatus;
        this.ssoType = builder.ssoType;
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
    public java.util.List<String> getApplicationIds() {
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
     * @return m2MClientStatus
     */
    public String getM2MClientStatus() {
        return this.m2MClientStatus;
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
     * @return resourceServerStatus
     */
    public String getResourceServerStatus() {
        return this.resourceServerStatus;
    }

    /**
     * @return ssoType
     */
    public String getSsoType() {
        return this.ssoType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListApplicationsRequest, Builder> {
        private String regionId; 
        private java.util.List<String> applicationIds; 
        private String applicationName; 
        private String authorizationType; 
        private String instanceId; 
        private String m2MClientStatus; 
        private Long pageNumber; 
        private Long pageSize; 
        private String resourceServerStatus; 
        private String ssoType; 
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
            this.m2MClientStatus = request.m2MClientStatus;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceServerStatus = request.resourceServerStatus;
            this.ssoType = request.ssoType;
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
         * <p>The IDs of the applications.</p>
         * 
         * <strong>example:</strong>
         * <p>Ram Account SSO</p>
         */
        public Builder applicationIds(java.util.List<String> applicationIds) {
            this.putQueryParameter("ApplicationIds", applicationIds);
            this.applicationIds = applicationIds;
            return this;
        }

        /**
         * <p>The name of the application. Only fuzzy match from the leftmost character is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Ram Account SSO</p>
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("ApplicationName", applicationName);
            this.applicationName = applicationName;
            return this;
        }

        /**
         * <p>The authorization of the application. Valid values:</p>
         * <ul>
         * <li>authorize_required: Only the user with explicit authorization can access the application.</li>
         * <li>default_all: By default, all users can access the application.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>authorize_required</p>
         */
        public Builder authorizationType(String authorizationType) {
            this.putQueryParameter("AuthorizationType", authorizationType);
            this.authorizationType = authorizationType;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * M2MClientStatus.
         */
        public Builder m2MClientStatus(String m2MClientStatus) {
            this.putQueryParameter("M2MClientStatus", m2MClientStatus);
            this.m2MClientStatus = m2MClientStatus;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ResourceServerStatus.
         */
        public Builder resourceServerStatus(String resourceServerStatus) {
            this.putQueryParameter("ResourceServerStatus", resourceServerStatus);
            this.resourceServerStatus = resourceServerStatus;
            return this;
        }

        /**
         * SsoType.
         */
        public Builder ssoType(String ssoType) {
            this.putQueryParameter("SsoType", ssoType);
            this.ssoType = ssoType;
            return this;
        }

        /**
         * <p>The status of the application. Valid values:</p>
         * <ul>
         * <li>Enabled: The application is enabled.</li>
         * <li>Disabled: The application is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
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
