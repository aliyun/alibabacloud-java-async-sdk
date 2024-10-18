// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetServiceConfRequest} extends {@link RequestModel}
 *
 * <p>GetServiceConfRequest</p>
 */
public class GetServiceConfRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ByDefault")
    private Boolean byDefault;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Scene")
    private String scene;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    private String serviceCode;

    private GetServiceConfRequest(Builder builder) {
        super(builder);
        this.byDefault = builder.byDefault;
        this.regionId = builder.regionId;
        this.resourceType = builder.resourceType;
        this.scene = builder.scene;
        this.serviceCode = builder.serviceCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceConfRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return byDefault
     */
    public Boolean getByDefault() {
        return this.byDefault;
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

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    public static final class Builder extends Request.Builder<GetServiceConfRequest, Builder> {
        private Boolean byDefault; 
        private String regionId; 
        private String resourceType; 
        private String scene; 
        private String serviceCode; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceConfRequest request) {
            super(request);
            this.byDefault = request.byDefault;
            this.regionId = request.regionId;
            this.resourceType = request.resourceType;
            this.scene = request.scene;
            this.serviceCode = request.serviceCode;
        } 

        /**
         * ByDefault.
         */
        public Builder byDefault(Boolean byDefault) {
            this.putBodyParameter("ByDefault", byDefault);
            this.byDefault = byDefault;
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
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * Scene.
         */
        public Builder scene(String scene) {
            this.putBodyParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * ServiceCode.
         */
        public Builder serviceCode(String serviceCode) {
            this.putBodyParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        @Override
        public GetServiceConfRequest build() {
            return new GetServiceConfRequest(this);
        } 

    } 

}
