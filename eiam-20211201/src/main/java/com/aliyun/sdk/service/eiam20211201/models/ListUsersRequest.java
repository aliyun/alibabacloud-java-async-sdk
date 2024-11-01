// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListUsersRequest} extends {@link RequestModel}
 *
 * <p>ListUsersRequest</p>
 */
public class ListUsersRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayNameStartsWith")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String displayNameStartsWith;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrganizationalUnitId")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String organizationalUnitId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String phoneNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneRegion")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String phoneRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserExternalId")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String userExternalId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserIds")
    private java.util.List < String > userIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserSourceId")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String userSourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserSourceType")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String userSourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsernameStartsWith")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String usernameStartsWith;

    private ListUsersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.displayNameStartsWith = builder.displayNameStartsWith;
        this.email = builder.email;
        this.instanceId = builder.instanceId;
        this.organizationalUnitId = builder.organizationalUnitId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.phoneNumber = builder.phoneNumber;
        this.phoneRegion = builder.phoneRegion;
        this.status = builder.status;
        this.userExternalId = builder.userExternalId;
        this.userIds = builder.userIds;
        this.userSourceId = builder.userSourceId;
        this.userSourceType = builder.userSourceType;
        this.usernameStartsWith = builder.usernameStartsWith;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUsersRequest create() {
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
     * @return displayNameStartsWith
     */
    public String getDisplayNameStartsWith() {
        return this.displayNameStartsWith;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return organizationalUnitId
     */
    public String getOrganizationalUnitId() {
        return this.organizationalUnitId;
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
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @return phoneRegion
     */
    public String getPhoneRegion() {
        return this.phoneRegion;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return userExternalId
     */
    public String getUserExternalId() {
        return this.userExternalId;
    }

    /**
     * @return userIds
     */
    public java.util.List < String > getUserIds() {
        return this.userIds;
    }

    /**
     * @return userSourceId
     */
    public String getUserSourceId() {
        return this.userSourceId;
    }

    /**
     * @return userSourceType
     */
    public String getUserSourceType() {
        return this.userSourceType;
    }

    /**
     * @return usernameStartsWith
     */
    public String getUsernameStartsWith() {
        return this.usernameStartsWith;
    }

    public static final class Builder extends Request.Builder<ListUsersRequest, Builder> {
        private String regionId; 
        private String displayNameStartsWith; 
        private String email; 
        private String instanceId; 
        private String organizationalUnitId; 
        private Long pageNumber; 
        private Long pageSize; 
        private String phoneNumber; 
        private String phoneRegion; 
        private String status; 
        private String userExternalId; 
        private java.util.List < String > userIds; 
        private String userSourceId; 
        private String userSourceType; 
        private String usernameStartsWith; 

        private Builder() {
            super();
        } 

        private Builder(ListUsersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.displayNameStartsWith = request.displayNameStartsWith;
            this.email = request.email;
            this.instanceId = request.instanceId;
            this.organizationalUnitId = request.organizationalUnitId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.phoneNumber = request.phoneNumber;
            this.phoneRegion = request.phoneRegion;
            this.status = request.status;
            this.userExternalId = request.userExternalId;
            this.userIds = request.userIds;
            this.userSourceId = request.userSourceId;
            this.userSourceType = request.userSourceType;
            this.usernameStartsWith = request.usernameStartsWith;
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
         * <p>Displayname</p>
         * 
         * <strong>example:</strong>
         * <p>name_001</p>
         */
        public Builder displayNameStartsWith(String displayNameStartsWith) {
            this.putQueryParameter("DisplayNameStartsWith", displayNameStartsWith);
            this.displayNameStartsWith = displayNameStartsWith;
            return this;
        }

        /**
         * <p>The email address of the user who owns the account.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:user@example.com">user@example.com</a></p>
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
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
         * <p>The ID of the organizational unit.</p>
         * 
         * <strong>example:</strong>
         * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
         */
        public Builder organizationalUnitId(String organizationalUnitId) {
            this.putQueryParameter("OrganizationalUnitId", organizationalUnitId);
            this.organizationalUnitId = organizationalUnitId;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: 1.</p>
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
         * <p>The number of entries to return on each page. Default value: 20.</p>
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
         * <p>The mobile number of the user who owns the account.</p>
         * 
         * <strong>example:</strong>
         * <p>156xxxxxxx</p>
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * <p>The country code of the mobile number. For example, the country code of China is 86 without 00 or +.</p>
         * 
         * <strong>example:</strong>
         * <p>86</p>
         */
        public Builder phoneRegion(String phoneRegion) {
            this.putQueryParameter("PhoneRegion", phoneRegion);
            this.phoneRegion = phoneRegion;
            return this;
        }

        /**
         * <p>The status of the account. Valid values:</p>
         * <ul>
         * <li>enabled: The account is enabled.</li>
         * <li>disabled: The account is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The external ID of the account. The external ID can be used by external data to map the data of the account in IDaaS EIAM.</p>
         * <p>For accounts with the same source type and source ID, each account has a unique external ID.</p>
         * 
         * <strong>example:</strong>
         * <p>id_wovwffm62xifdziem7an7xxxxx</p>
         */
        public Builder userExternalId(String userExternalId) {
            this.putQueryParameter("UserExternalId", userExternalId);
            this.userExternalId = userExternalId;
            return this;
        }

        /**
         * <p>User ID set</p>
         */
        public Builder userIds(java.util.List < String > userIds) {
            this.putQueryParameter("UserIds", userIds);
            this.userIds = userIds;
            return this;
        }

        /**
         * <p>The source ID of the account.</p>
         * <p>If the account was created in IDaaS, its source ID is the ID of the IDaaS instance. If the account was imported, its source ID is the enterprise ID in the source. For example, if the account was imported from DingTalk, its source ID is the corpId value of the enterprise in DingTalk.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder userSourceId(String userSourceId) {
            this.putQueryParameter("UserSourceId", userSourceId);
            this.userSourceId = userSourceId;
            return this;
        }

        /**
         * <p>The source type of the account. Valid values:</p>
         * <ul>
         * <li>build_in: The account was created in IDaaS.</li>
         * <li>ding_talk: The account was imported from DingTalk.</li>
         * <li>ad: The account was imported from Microsoft Active Directory (AD).</li>
         * <li>ldap: The account was imported from a Lightweight Directory Access Protocol (LDAP) service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>build_in</p>
         */
        public Builder userSourceType(String userSourceType) {
            this.putQueryParameter("UserSourceType", userSourceType);
            this.userSourceType = userSourceType;
            return this;
        }

        /**
         * <p>Username</p>
         * 
         * <strong>example:</strong>
         * <p>name_001</p>
         */
        public Builder usernameStartsWith(String usernameStartsWith) {
            this.putQueryParameter("UsernameStartsWith", usernameStartsWith);
            this.usernameStartsWith = usernameStartsWith;
            return this;
        }

        @Override
        public ListUsersRequest build() {
            return new ListUsersRequest(this);
        } 

    } 

}
