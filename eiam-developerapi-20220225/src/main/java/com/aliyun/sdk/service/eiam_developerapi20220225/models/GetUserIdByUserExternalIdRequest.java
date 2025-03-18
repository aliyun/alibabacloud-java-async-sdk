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
 * {@link GetUserIdByUserExternalIdRequest} extends {@link RequestModel}
 *
 * <p>GetUserIdByUserExternalIdRequest</p>
 */
public class GetUserIdByUserExternalIdRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("userExternalId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userExternalId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userSourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userSourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userSourceType;

    private GetUserIdByUserExternalIdRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.applicationId = builder.applicationId;
        this.authorization = builder.authorization;
        this.userExternalId = builder.userExternalId;
        this.userSourceId = builder.userSourceId;
        this.userSourceType = builder.userSourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserIdByUserExternalIdRequest create() {
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
     * @return userExternalId
     */
    public String getUserExternalId() {
        return this.userExternalId;
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

    public static final class Builder extends Request.Builder<GetUserIdByUserExternalIdRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String applicationId; 
        private String authorization; 
        private String userExternalId; 
        private String userSourceId; 
        private String userSourceType; 

        private Builder() {
            super();
        } 

        private Builder(GetUserIdByUserExternalIdRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.applicationId = request.applicationId;
            this.authorization = request.authorization;
            this.userExternalId = request.userExternalId;
            this.userSourceId = request.userSourceId;
            this.userSourceType = request.userSourceType;
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
         * <p>The external ID of the account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx001</p>
         */
        public Builder userExternalId(String userExternalId) {
            this.putBodyParameter("userExternalId", userExternalId);
            this.userExternalId = userExternalId;
            return this;
        }

        /**
         * <p>The source ID of the account. If the account was created in IDaaS, its source ID is the ID of the IDaaS instance. If the account was imported, its source ID is the enterprise ID in the source. For example, if the account was imported from DingTalk, its source ID is the corpId value of the enterprise in DingTalk.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder userSourceId(String userSourceId) {
            this.putBodyParameter("userSourceId", userSourceId);
            this.userSourceId = userSourceId;
            return this;
        }

        /**
         * <p>The source type of the account. Valid values:</p>
         * <ul>
         * <li>build_in: The account was created in Identity as a Service (IDaaS).</li>
         * <li>ding_talk: The account was imported from DingTalk.</li>
         * <li>ad: The account was imported from Microsoft Active Directory (AD).</li>
         * <li>ldap: The account was imported from a Lightweight Directory Access Protocol (LDAP) service.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>build_in</p>
         */
        public Builder userSourceType(String userSourceType) {
            this.putBodyParameter("userSourceType", userSourceType);
            this.userSourceType = userSourceType;
            return this;
        }

        @Override
        public GetUserIdByUserExternalIdRequest build() {
            return new GetUserIdByUserExternalIdRequest(this);
        } 

    } 

}
