// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link UpdateSharedAccountPermissionRequest} extends {@link RequestModel}
 *
 * <p>UpdateSharedAccountPermissionRequest</p>
 */
public class UpdateSharedAccountPermissionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Permission")
    @com.aliyun.core.annotation.Validation(required = true)
    private String permission;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserAliUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long userAliUid;

    private UpdateSharedAccountPermissionRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.permission = builder.permission;
        this.regionId = builder.regionId;
        this.serviceId = builder.serviceId;
        this.type = builder.type;
        this.userAliUid = builder.userAliUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSharedAccountPermissionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return permission
     */
    public String getPermission() {
        return this.permission;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return userAliUid
     */
    public Long getUserAliUid() {
        return this.userAliUid;
    }

    public static final class Builder extends Request.Builder<UpdateSharedAccountPermissionRequest, Builder> {
        private String clientToken; 
        private String permission; 
        private String regionId; 
        private String serviceId; 
        private String type; 
        private Long userAliUid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSharedAccountPermissionRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.permission = request.permission;
            this.regionId = request.regionId;
            this.serviceId = request.serviceId;
            this.type = request.type;
            this.userAliUid = request.userAliUid;
        } 

        /**
         * <p>Client token, used to ensure the idempotence of requests. Generate a unique value for this parameter from your client to ensure it is unique across different requests. ClientToken supports only ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>10CM943JP0EN9D51H</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Permission type. Possible values:</p>
         * <ul>
         * <li>Deployable: Can be deployed.</li>
         * <li>Accessible: Can be accessed.</li>
         * <li>AccessibleIncludeBeta: Can access all versions, including Beta versions.</li>
         * <li>DeployableIncludeBeta: Can deploy all versions, including Beta versions.</li>
         * <li>Authorized: Authorized (for reselling scenarios)</li>
         * <li>Unauthorized: Unauthorized (for reselling scenarios)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Deployable</p>
         */
        public Builder permission(String permission) {
            this.putQueryParameter("Permission", permission);
            this.permission = permission;
            return this;
        }

        /**
         * <p>Region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Service ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>service-0d6e1d846e4c4axxxxxx</p>
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>Service sharing type, with a default value of SharedAccount. Available options:</p>
         * <ul>
         * <li><p>SharedAccount: Regular sharing type.</p>
         * </li>
         * <li><p>Reseller: Reselling sharing type.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SharedAccount</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>Whitelist account for service sharing.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1563457855xxxxxx</p>
         */
        public Builder userAliUid(Long userAliUid) {
            this.putQueryParameter("UserAliUid", userAliUid);
            this.userAliUid = userAliUid;
            return this;
        }

        @Override
        public UpdateSharedAccountPermissionRequest build() {
            return new UpdateSharedAccountPermissionRequest(this);
        } 

    } 

}
