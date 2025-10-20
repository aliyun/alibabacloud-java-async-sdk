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
 * {@link CreateApplicationTokenRequest} extends {@link RequestModel}
 *
 * <p>CreateApplicationTokenRequest</p>
 */
public class CreateApplicationTokenRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationTokenType")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String applicationTokenType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpirationTime")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private Long expirationTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    private CreateApplicationTokenRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applicationId = builder.applicationId;
        this.applicationTokenType = builder.applicationTokenType;
        this.expirationTime = builder.expirationTime;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationTokenRequest create() {
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
     * @return applicationTokenType
     */
    public String getApplicationTokenType() {
        return this.applicationTokenType;
    }

    /**
     * @return expirationTime
     */
    public Long getExpirationTime() {
        return this.expirationTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<CreateApplicationTokenRequest, Builder> {
        private String regionId; 
        private String applicationId; 
        private String applicationTokenType; 
        private Long expirationTime; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateApplicationTokenRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applicationId = request.applicationId;
            this.applicationTokenType = request.applicationTokenType;
            this.expirationTime = request.expirationTime;
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
         * <p>IDaaS的应用资源ID。</p>
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
         * <p>应用token类型</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bearer_token</p>
         */
        public Builder applicationTokenType(String applicationTokenType) {
            this.putQueryParameter("ApplicationTokenType", applicationTokenType);
            this.applicationTokenType = applicationTokenType;
            return this;
        }

        /**
         * <p>不填，默认1年后到期</p>
         * 
         * <strong>example:</strong>
         * <p>1735530123762</p>
         */
        public Builder expirationTime(Long expirationTime) {
            this.putQueryParameter("ExpirationTime", expirationTime);
            this.expirationTime = expirationTime;
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
        public CreateApplicationTokenRequest build() {
            return new CreateApplicationTokenRequest(this);
        } 

    } 

}
