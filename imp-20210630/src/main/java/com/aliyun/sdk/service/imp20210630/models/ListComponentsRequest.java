// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListComponentsRequest} extends {@link RequestModel}
 *
 * <p>ListComponentsRequest</p>
 */
public class ListComponentsRequest extends Request {
    @Body
    @NameInMap("AppId")
    private String appId;

    @Body
    @NameInMap("AppTemplateId")
    private String appTemplateId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ListComponentsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appTemplateId = builder.appTemplateId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListComponentsRequest create() {
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

    public static final class Builder extends Request.Builder<ListComponentsRequest, Builder> {
        private String appId; 
        private String appTemplateId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListComponentsRequest request) {
            super(request);
            this.appId = request.appId;
            this.appTemplateId = request.appTemplateId;
            this.regionId = request.regionId;
        } 

        /**
         * 应用唯一标识
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * 应用模板唯一标识
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
        public ListComponentsRequest build() {
            return new ListComponentsRequest(this);
        } 

    } 

}
