// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rai20240701.models;

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
 * {@link ContentAsyncDetectRequest} extends {@link RequestModel}
 *
 * <p>ContentAsyncDetectRequest</p>
 */
public class ContentAsyncDetectRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneName")
    private String sceneName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceParameter")
    private ServiceParameter serviceParameter;

    private ContentAsyncDetectRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.sceneName = builder.sceneName;
        this.serviceName = builder.serviceName;
        this.serviceParameter = builder.serviceParameter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ContentAsyncDetectRequest create() {
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
     * @return sceneName
     */
    public String getSceneName() {
        return this.sceneName;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return serviceParameter
     */
    public ServiceParameter getServiceParameter() {
        return this.serviceParameter;
    }

    public static final class Builder extends Request.Builder<ContentAsyncDetectRequest, Builder> {
        private String regionId; 
        private String sceneName; 
        private String serviceName; 
        private ServiceParameter serviceParameter; 

        private Builder() {
            super();
        } 

        private Builder(ContentAsyncDetectRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.sceneName = request.sceneName;
            this.serviceName = request.serviceName;
            this.serviceParameter = request.serviceParameter;
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
         * SceneName.
         */
        public Builder sceneName(String sceneName) {
            this.putQueryParameter("SceneName", sceneName);
            this.sceneName = sceneName;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * serviceParameter.
         */
        public Builder serviceParameter(ServiceParameter serviceParameter) {
            this.putBodyParameter("serviceParameter", serviceParameter);
            this.serviceParameter = serviceParameter;
            return this;
        }

        @Override
        public ContentAsyncDetectRequest build() {
            return new ContentAsyncDetectRequest(this);
        } 

    } 

    /**
     * 
     * {@link ContentAsyncDetectRequest} extends {@link TeaModel}
     *
     * <p>ContentAsyncDetectRequest</p>
     */
    public static class ServiceParameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        private ServiceParameter(Builder builder) {
            this.content = builder.content;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceParameter create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        public static final class Builder {
            private String content; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            public ServiceParameter build() {
                return new ServiceParameter(this);
            } 

        } 

    }
}
