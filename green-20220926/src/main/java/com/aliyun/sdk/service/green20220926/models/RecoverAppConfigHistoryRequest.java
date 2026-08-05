// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link RecoverAppConfigHistoryRequest} extends {@link RequestModel}
 *
 * <p>RecoverAppConfigHistoryRequest</p>
 */
public class RecoverAppConfigHistoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppVersion")
    private Long appVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    private RecoverAppConfigHistoryRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appVersion = builder.appVersion;
        this.regionId = builder.regionId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecoverAppConfigHistoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appVersion
     */
    public Long getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<RecoverAppConfigHistoryRequest, Builder> {
        private String appId; 
        private Long appVersion; 
        private String regionId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(RecoverAppConfigHistoryRequest request) {
            super(request);
            this.appId = request.appId;
            this.appVersion = request.appVersion;
            this.regionId = request.regionId;
            this.resourceType = request.resourceType;
        } 

        /**
         * <p>App ID。</p>
         * 
         * <strong>example:</strong>
         * <p>txt_check_agent_01</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AppVersion.
         */
        public Builder appVersion(Long appVersion) {
            this.putQueryParameter("AppVersion", appVersion);
            this.appVersion = appVersion;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public RecoverAppConfigHistoryRequest build() {
            return new RecoverAppConfigHistoryRequest(this);
        } 

    } 

}
