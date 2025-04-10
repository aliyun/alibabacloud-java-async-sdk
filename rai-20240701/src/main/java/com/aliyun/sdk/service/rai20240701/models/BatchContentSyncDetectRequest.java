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
 * {@link BatchContentSyncDetectRequest} extends {@link RequestModel}
 *
 * <p>BatchContentSyncDetectRequest</p>
 */
public class BatchContentSyncDetectRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("serviceParameterList")
    private java.util.List<ServiceParameterList> serviceParameterList;

    private BatchContentSyncDetectRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.sceneName = builder.sceneName;
        this.serviceName = builder.serviceName;
        this.serviceParameterList = builder.serviceParameterList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchContentSyncDetectRequest create() {
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
     * @return serviceParameterList
     */
    public java.util.List<ServiceParameterList> getServiceParameterList() {
        return this.serviceParameterList;
    }

    public static final class Builder extends Request.Builder<BatchContentSyncDetectRequest, Builder> {
        private String regionId; 
        private String sceneName; 
        private String serviceName; 
        private java.util.List<ServiceParameterList> serviceParameterList; 

        private Builder() {
            super();
        } 

        private Builder(BatchContentSyncDetectRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.sceneName = request.sceneName;
            this.serviceName = request.serviceName;
            this.serviceParameterList = request.serviceParameterList;
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
         * serviceParameterList.
         */
        public Builder serviceParameterList(java.util.List<ServiceParameterList> serviceParameterList) {
            this.putBodyParameter("serviceParameterList", serviceParameterList);
            this.serviceParameterList = serviceParameterList;
            return this;
        }

        @Override
        public BatchContentSyncDetectRequest build() {
            return new BatchContentSyncDetectRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchContentSyncDetectRequest} extends {@link TeaModel}
     *
     * <p>BatchContentSyncDetectRequest</p>
     */
    public static class ServiceParameterList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        private ServiceParameterList(Builder builder) {
            this.content = builder.content;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceParameterList create() {
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

            private Builder() {
            } 

            private Builder(ServiceParameterList model) {
                this.content = model.content;
            } 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            public ServiceParameterList build() {
                return new ServiceParameterList(this);
            } 

        } 

    }
}
