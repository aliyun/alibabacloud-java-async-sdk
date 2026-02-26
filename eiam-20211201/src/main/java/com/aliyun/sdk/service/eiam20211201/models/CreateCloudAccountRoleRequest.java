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
 * {@link CreateCloudAccountRoleRequest} extends {@link RequestModel}
 *
 * <p>CreateCloudAccountRoleRequest</p>
 */
public class CreateCloudAccountRoleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudAccountId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String cloudAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudAccountRoleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cloudAccountRoleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudAccountRoleType")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String cloudAccountRoleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    private CreateCloudAccountRoleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.cloudAccountId = builder.cloudAccountId;
        this.cloudAccountRoleName = builder.cloudAccountRoleName;
        this.cloudAccountRoleType = builder.cloudAccountRoleType;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudAccountRoleRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return cloudAccountId
     */
    public String getCloudAccountId() {
        return this.cloudAccountId;
    }

    /**
     * @return cloudAccountRoleName
     */
    public String getCloudAccountRoleName() {
        return this.cloudAccountRoleName;
    }

    /**
     * @return cloudAccountRoleType
     */
    public String getCloudAccountRoleType() {
        return this.cloudAccountRoleType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<CreateCloudAccountRoleRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private String cloudAccountId; 
        private String cloudAccountRoleName; 
        private String cloudAccountRoleType; 
        private String description; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCloudAccountRoleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.cloudAccountId = request.cloudAccountId;
            this.cloudAccountRoleName = request.cloudAccountRoleName;
            this.cloudAccountRoleType = request.cloudAccountRoleType;
            this.description = request.description;
            this.instanceId = request.instanceId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>client-token-example</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>云账号唯一标识</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ca_01kmegjc11qa1txxxxx</p>
         */
        public Builder cloudAccountId(String cloudAccountId) {
            this.putQueryParameter("CloudAccountId", cloudAccountId);
            this.cloudAccountId = cloudAccountId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>role-test</p>
         */
        public Builder cloudAccountRoleName(String cloudAccountRoleName) {
            this.putQueryParameter("CloudAccountRoleName", cloudAccountRoleName);
            this.cloudAccountRoleName = cloudAccountRoleName;
            return this;
        }

        /**
         * <p>云账号类型</p>
         * 
         * <strong>example:</strong>
         * <p>role</p>
         */
        public Builder cloudAccountRoleType(String cloudAccountRoleType) {
            this.putQueryParameter("CloudAccountRoleType", cloudAccountRoleType);
            this.cloudAccountRoleType = cloudAccountRoleType;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>IDaaS EIAM实例的ID。</p>
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

        @Override
        public CreateCloudAccountRoleRequest build() {
            return new CreateCloudAccountRoleRequest(this);
        } 

    } 

}
