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
 * {@link UpdateApplicationInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateApplicationInfoRequest</p>
 */
public class UpdateApplicationInfoRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String applicationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationVisibility")
    private java.util.List<String> applicationVisibility;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogoUrl")
    @com.aliyun.core.annotation.Validation(maxLength = 512)
    private String logoUrl;

    private UpdateApplicationInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applicationId = builder.applicationId;
        this.applicationName = builder.applicationName;
        this.applicationVisibility = builder.applicationVisibility;
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
        this.logoUrl = builder.logoUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationInfoRequest create() {
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
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return applicationVisibility
     */
    public java.util.List<String> getApplicationVisibility() {
        return this.applicationVisibility;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return logoUrl
     */
    public String getLogoUrl() {
        return this.logoUrl;
    }

    public static final class Builder extends Request.Builder<UpdateApplicationInfoRequest, Builder> {
        private String regionId; 
        private String applicationId; 
        private String applicationName; 
        private java.util.List<String> applicationVisibility; 
        private String clientToken; 
        private String instanceId; 
        private String logoUrl; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApplicationInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applicationId = request.applicationId;
            this.applicationName = request.applicationName;
            this.applicationVisibility = request.applicationVisibility;
            this.clientToken = request.clientToken;
            this.instanceId = request.instanceId;
            this.logoUrl = request.logoUrl;
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
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>应用的表示名称</p>
         * <p>This parameter is required.</p>
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
         * ApplicationVisibility.
         */
        public Builder applicationVisibility(java.util.List<String> applicationVisibility) {
            this.putQueryParameter("ApplicationVisibility", applicationVisibility);
            this.applicationVisibility = applicationVisibility;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>IDaaS EIAM的实例id</p>
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
         * <p>应用Logo地址</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.aliyuncs.com/logo.png">https://example.aliyuncs.com/logo.png</a></p>
         */
        public Builder logoUrl(String logoUrl) {
            this.putQueryParameter("LogoUrl", logoUrl);
            this.logoUrl = logoUrl;
            return this;
        }

        @Override
        public UpdateApplicationInfoRequest build() {
            return new UpdateApplicationInfoRequest(this);
        } 

    } 

}
