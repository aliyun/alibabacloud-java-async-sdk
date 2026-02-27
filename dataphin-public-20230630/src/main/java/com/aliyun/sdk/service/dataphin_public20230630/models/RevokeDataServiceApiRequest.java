// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link RevokeDataServiceApiRequest} extends {@link RequestModel}
 *
 * <p>RevokeDataServiceApiRequest</p>
 */
public class RevokeDataServiceApiRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RevokeCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private RevokeCommand revokeCommand;

    private RevokeDataServiceApiRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.projectId = builder.projectId;
        this.revokeCommand = builder.revokeCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeDataServiceApiRequest create() {
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
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return projectId
     */
    public Integer getProjectId() {
        return this.projectId;
    }

    /**
     * @return revokeCommand
     */
    public RevokeCommand getRevokeCommand() {
        return this.revokeCommand;
    }

    public static final class Builder extends Request.Builder<RevokeDataServiceApiRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private Integer projectId; 
        private RevokeCommand revokeCommand; 

        private Builder() {
            super();
        } 

        private Builder(RevokeDataServiceApiRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.projectId = request.projectId;
            this.revokeCommand = request.revokeCommand;
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
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>102102</p>
         */
        public Builder projectId(Integer projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder revokeCommand(RevokeCommand revokeCommand) {
            String revokeCommandShrink = shrink(revokeCommand, "RevokeCommand", "json");
            this.putBodyParameter("RevokeCommand", revokeCommandShrink);
            this.revokeCommand = revokeCommand;
            return this;
        }

        @Override
        public RevokeDataServiceApiRequest build() {
            return new RevokeDataServiceApiRequest(this);
        } 

    } 

    /**
     * 
     * {@link RevokeDataServiceApiRequest} extends {@link TeaModel}
     *
     * <p>RevokeDataServiceApiRequest</p>
     */
    public static class RevokeCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long apiId;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private Integer appId;

        @com.aliyun.core.annotation.NameInMap("AuthType")
        private String authType;

        @com.aliyun.core.annotation.NameInMap("Env")
        private String env;

        @com.aliyun.core.annotation.NameInMap("GranteeType")
        private String granteeType;

        @com.aliyun.core.annotation.NameInMap("Reason")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
        private String reason;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private RevokeCommand(Builder builder) {
            this.apiId = builder.apiId;
            this.appId = builder.appId;
            this.authType = builder.authType;
            this.env = builder.env;
            this.granteeType = builder.granteeType;
            this.reason = builder.reason;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RevokeCommand create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public Long getApiId() {
            return this.apiId;
        }

        /**
         * @return appId
         */
        public Integer getAppId() {
            return this.appId;
        }

        /**
         * @return authType
         */
        public String getAuthType() {
            return this.authType;
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return granteeType
         */
        public String getGranteeType() {
            return this.granteeType;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long apiId; 
            private Integer appId; 
            private String authType; 
            private String env; 
            private String granteeType; 
            private String reason; 
            private String userId; 

            private Builder() {
            } 

            private Builder(RevokeCommand model) {
                this.apiId = model.apiId;
                this.appId = model.appId;
                this.authType = model.authType;
                this.env = model.env;
                this.granteeType = model.granteeType;
                this.reason = model.reason;
                this.userId = model.userId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1021</p>
             */
            public Builder apiId(Long apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * AppId.
             */
            public Builder appId(Integer appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AuthType.
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * Env.
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * GranteeType.
             */
            public Builder granteeType(String granteeType) {
                this.granteeType = granteeType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public RevokeCommand build() {
                return new RevokeCommand(this);
            } 

        } 

    }
}
