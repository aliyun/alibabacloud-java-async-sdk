// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.sdk.gateway.eiam.dev.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * 
 * {@link GetOrganizationalUnitIdByExternalIdRequest} extends {@link RequestModel}
 *
 * <p>GetOrganizationalUnitIdByExternalIdRequest</p>
 */
public class GetOrganizationalUnitIdByExternalIdRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("applicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("Authorization")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authorization;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("organizationalUnitExternalId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationalUnitExternalId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("organizationalUnitSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationalUnitSourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("organizationalUnitSourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationalUnitSourceType;

    private GetOrganizationalUnitIdByExternalIdRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.applicationId = builder.applicationId;
        this.authorization = builder.authorization;
        this.organizationalUnitExternalId = builder.organizationalUnitExternalId;
        this.organizationalUnitSourceId = builder.organizationalUnitSourceId;
        this.organizationalUnitSourceType = builder.organizationalUnitSourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOrganizationalUnitIdByExternalIdRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return authorization
     */
    public String getAuthorization() {
        return this.authorization;
    }

    /**
     * @return organizationalUnitExternalId
     */
    public String getOrganizationalUnitExternalId() {
        return this.organizationalUnitExternalId;
    }

    /**
     * @return organizationalUnitSourceId
     */
    public String getOrganizationalUnitSourceId() {
        return this.organizationalUnitSourceId;
    }

    /**
     * @return organizationalUnitSourceType
     */
    public String getOrganizationalUnitSourceType() {
        return this.organizationalUnitSourceType;
    }

    public static final class Builder extends Request.Builder<GetOrganizationalUnitIdByExternalIdRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String applicationId; 
        private String authorization; 
        private String organizationalUnitExternalId; 
        private String organizationalUnitSourceId; 
        private String organizationalUnitSourceType; 

        private Builder() {
            super();
        } 

        private Builder(GetOrganizationalUnitIdByExternalIdRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.applicationId = request.applicationId;
            this.authorization = request.authorization;
            this.organizationalUnitExternalId = request.organizationalUnitExternalId;
            this.organizationalUnitSourceId = request.organizationalUnitSourceId;
            this.organizationalUnitSourceType = request.organizationalUnitSourceType;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        public Builder applicationId(String applicationId) {
            this.putPathParameter("applicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The authentication information. Format: Bearer ${access_token}. Example: Bearer ATxxxx.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Bearer AT8csE2seYxxxxxij</p>
         */
        public Builder authorization(String authorization) {
            this.putHeaderParameter("Authorization", authorization);
            this.authorization = authorization;
            return this;
        }

        /**
         * <p>The external ID of the organizational unit. The external ID can be used to map external data to the data of the organizational unit in Employee Identity and Access Management (EIAM) of Identity as a Service (IDaaS). By default, the external ID is the organizational unit ID.</p>
         * <p>Note: For organizational units with the same source type and source ID, each organizational unit has a unique external ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
         */
        public Builder organizationalUnitExternalId(String organizationalUnitExternalId) {
            this.putBodyParameter("organizationalUnitExternalId", organizationalUnitExternalId);
            this.organizationalUnitExternalId = organizationalUnitExternalId;
            return this;
        }

        /**
         * <p>The source ID of the organizational unit.</p>
         * <p>If the organizational unit was created in IDaaS, its source ID is the ID of the IDaaS instance. If the organizational unit was imported, its source ID is the enterprise ID in the source. For example, if the organizational unit was imported from DingTalk, its source ID is the corpId value of the enterprise in DingTalk.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder organizationalUnitSourceId(String organizationalUnitSourceId) {
            this.putBodyParameter("organizationalUnitSourceId", organizationalUnitSourceId);
            this.organizationalUnitSourceId = organizationalUnitSourceId;
            return this;
        }

        /**
         * <p>The source type of the organizational unit. Valid values:</p>
         * <ul>
         * <li>build_in: The organizational unit was created in IDaaS.</li>
         * <li>ding_talk: The organizational unit was imported from DingTalk.</li>
         * <li>ad: The organizational unit was imported from Microsoft Active Directory (AD).</li>
         * <li>ldap: The organizational unit was imported from a Lightweight Directory Access Protocol (LDAP) service.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>build_in</p>
         */
        public Builder organizationalUnitSourceType(String organizationalUnitSourceType) {
            this.putBodyParameter("organizationalUnitSourceType", organizationalUnitSourceType);
            this.organizationalUnitSourceType = organizationalUnitSourceType;
            return this;
        }

        @Override
        public GetOrganizationalUnitIdByExternalIdRequest build() {
            return new GetOrganizationalUnitIdByExternalIdRequest(this);
        } 

    } 

}
