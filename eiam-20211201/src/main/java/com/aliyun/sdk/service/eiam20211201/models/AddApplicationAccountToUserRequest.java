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
 * {@link AddApplicationAccountToUserRequest} extends {@link RequestModel}
 *
 * <p>AddApplicationAccountToUserRequest</p>
 */
public class AddApplicationAccountToUserRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationUsername")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String applicationUsername;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String userId;

    private AddApplicationAccountToUserRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applicationId = builder.applicationId;
        this.applicationUsername = builder.applicationUsername;
        this.instanceId = builder.instanceId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddApplicationAccountToUserRequest create() {
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
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return applicationUsername
     */
    public String getApplicationUsername() {
        return this.applicationUsername;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<AddApplicationAccountToUserRequest, Builder> {
        private String regionId; 
        private String applicationId; 
        private String applicationUsername; 
        private String instanceId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(AddApplicationAccountToUserRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applicationId = request.applicationId;
            this.applicationUsername = request.applicationUsername;
            this.instanceId = request.instanceId;
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
         * <p>IDaaS的应用主键id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app_11111</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>应用账号名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        public Builder applicationUsername(String applicationUsername) {
            this.putQueryParameter("ApplicationUsername", applicationUsername);
            this.applicationUsername = applicationUsername;
            return this;
        }

        /**
         * <p>IDaaS EIAM的实例id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eiam-111ccc1111</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>用户Id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user_example</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public AddApplicationAccountToUserRequest build() {
            return new AddApplicationAccountToUserRequest(this);
        } 

    } 

}
