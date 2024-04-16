// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceRequest} extends {@link RequestModel}
 *
 * <p>GetResourceRequest</p>
 */
public class GetResourceRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("ImageProcessParameter")
    private String imageProcessParameter;

    @Query
    @NameInMap("ModuleId")
    private String moduleId;

    @Query
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Query
    @NameInMap("Source")
    private String source;

    private GetResourceRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.imageProcessParameter = builder.imageProcessParameter;
        this.moduleId = builder.moduleId;
        this.resourceId = builder.resourceId;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceRequest create() {
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
     * @return imageProcessParameter
     */
    public String getImageProcessParameter() {
        return this.imageProcessParameter;
    }

    /**
     * @return moduleId
     */
    public String getModuleId() {
        return this.moduleId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<GetResourceRequest, Builder> {
        private String appId; 
        private String imageProcessParameter; 
        private String moduleId; 
        private String resourceId; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceRequest request) {
            super(request);
            this.appId = request.appId;
            this.imageProcessParameter = request.imageProcessParameter;
            this.moduleId = request.moduleId;
            this.resourceId = request.resourceId;
            this.source = request.source;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * ImageProcessParameter.
         */
        public Builder imageProcessParameter(String imageProcessParameter) {
            this.putQueryParameter("ImageProcessParameter", imageProcessParameter);
            this.imageProcessParameter = imageProcessParameter;
            return this;
        }

        /**
         * ModuleId.
         */
        public Builder moduleId(String moduleId) {
            this.putQueryParameter("ModuleId", moduleId);
            this.moduleId = moduleId;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public GetResourceRequest build() {
            return new GetResourceRequest(this);
        } 

    } 

}
