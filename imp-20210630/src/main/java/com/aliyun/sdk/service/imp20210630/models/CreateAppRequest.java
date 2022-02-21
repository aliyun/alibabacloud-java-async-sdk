// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppRequest} extends {@link RequestModel}
 *
 * <p>CreateAppRequest</p>
 */
public class CreateAppRequest extends Request {
    @Body
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Body
    @NameInMap("AppTemplateId")
    @Validation(required = true)
    private String appTemplateId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CreateAppRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.appTemplateId = builder.appTemplateId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appTemplateId
     */
    public String getAppTemplateId() {
        return this.appTemplateId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateAppRequest, Builder> {
        private String appName; 
        private String appTemplateId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppRequest response) {
            super(response);
            this.appName = response.appName;
            this.appTemplateId = response.appTemplateId;
            this.regionId = response.regionId;
        } 

        /**
         * 应用名称
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * 模板ID
         */
        public Builder appTemplateId(String appTemplateId) {
            this.putBodyParameter("AppTemplateId", appTemplateId);
            this.appTemplateId = appTemplateId;
            return this;
        }

        /**
         * 地域
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateAppRequest build() {
            return new CreateAppRequest(this);
        } 

    } 

}
