// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link GetUserIdByUserExternalIdRequest} extends {@link RequestModel}
 *
 * <p>GetUserIdByUserExternalIdRequest</p>
 */
public class GetUserIdByUserExternalIdRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("applicationId")
    @Validation(required = true)
    private String applicationId;

    @Header
    @NameInMap("Authorization")
    @Validation(required = true)
    private String authorization;

    @Body
    @NameInMap("userExternalId")
    @Validation(required = true)
    private String userExternalId;

    @Body
    @NameInMap("userSourceId")
    @Validation(required = true)
    private String userSourceId;

    @Body
    @NameInMap("userSourceType")
    @Validation(required = true)
    private String userSourceType;

    @Host
    @NameInMap("regionId")
    private String regionId;

    private GetUserIdByUserExternalIdRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.applicationId = builder.applicationId;
        this.authorization = builder.authorization;
        this.userExternalId = builder.userExternalId;
        this.userSourceId = builder.userSourceId;
        this.userSourceType = builder.userSourceType;
        this.regionId = builder.regionId;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetUserIdByUserExternalIdRequest, Builder> {
        private String instanceId; 
        private String applicationId; 
        private String authorization; 
        private String userExternalId; 
        private String userSourceId; 
        private String userSourceType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetUserIdByUserExternalIdRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.applicationId = request.applicationId;
            this.authorization = request.authorization;
            this.userExternalId = request.userExternalId;
            this.userSourceId = request.userSourceId;
            this.userSourceType = request.userSourceType;
            this.regionId = request.regionId;
        } 

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 应用ID
         */
        public Builder applicationId(String applicationId) {
            this.putPathParameter("applicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * 认证信息，格式:Bearer access_token
         */
        public Builder authorization(String authorization) {
            this.putHeaderParameter("Authorization", authorization);
            this.authorization = authorization;
            return this;
        }

        /**
         * 账户外部ID
         */
        public Builder userExternalId(String userExternalId) {
            this.putBodyParameter("userExternalId", userExternalId);
            this.userExternalId = userExternalId;
            return this;
        }

        /**
         * 账户来源ID,自建类型(build_in)值为实例ID，非自建类型，为对应企业ID，比如钉钉，对应的corpId
         */
        public Builder userSourceId(String userSourceId) {
            this.putBodyParameter("userSourceId", userSourceId);
            this.userSourceId = userSourceId;
            return this;
        }

        /**
         * 账户来源类型, 取值可选范围： build_in(自建), ding_talk(钉钉导入),ad(AD导入),ldap(LDAP导入)
         */
        public Builder userSourceType(String userSourceType) {
            this.putBodyParameter("userSourceType", userSourceType);
            this.userSourceType = userSourceType;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetUserIdByUserExternalIdRequest build() {
            return new GetUserIdByUserExternalIdRequest(this);
        } 

    } 

}
