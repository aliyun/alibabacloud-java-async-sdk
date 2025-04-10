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
 * {@link ModelOutputContentAsyncDetectRequest} extends {@link RequestModel}
 *
 * <p>ModelOutputContentAsyncDetectRequest</p>
 */
public class ModelOutputContentAsyncDetectRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BodyData")
    private BodyData bodyData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyIdentifier")
    private String policyIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneName")
    private String sceneName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    private ModelOutputContentAsyncDetectRequest(Builder builder) {
        super(builder);
        this.bodyData = builder.bodyData;
        this.policyIdentifier = builder.policyIdentifier;
        this.regionId = builder.regionId;
        this.sceneName = builder.sceneName;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelOutputContentAsyncDetectRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bodyData
     */
    public BodyData getBodyData() {
        return this.bodyData;
    }

    /**
     * @return policyIdentifier
     */
    public String getPolicyIdentifier() {
        return this.policyIdentifier;
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

    public static final class Builder extends Request.Builder<ModelOutputContentAsyncDetectRequest, Builder> {
        private BodyData bodyData; 
        private String policyIdentifier; 
        private String regionId; 
        private String sceneName; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(ModelOutputContentAsyncDetectRequest request) {
            super(request);
            this.bodyData = request.bodyData;
            this.policyIdentifier = request.policyIdentifier;
            this.regionId = request.regionId;
            this.sceneName = request.sceneName;
            this.serviceName = request.serviceName;
        } 

        /**
         * BodyData.
         */
        public Builder bodyData(BodyData bodyData) {
            String bodyDataShrink = shrink(bodyData, "BodyData", "json");
            this.putBodyParameter("BodyData", bodyDataShrink);
            this.bodyData = bodyData;
            return this;
        }

        /**
         * PolicyIdentifier.
         */
        public Builder policyIdentifier(String policyIdentifier) {
            this.putQueryParameter("PolicyIdentifier", policyIdentifier);
            this.policyIdentifier = policyIdentifier;
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

        @Override
        public ModelOutputContentAsyncDetectRequest build() {
            return new ModelOutputContentAsyncDetectRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModelOutputContentAsyncDetectRequest} extends {@link TeaModel}
     *
     * <p>ModelOutputContentAsyncDetectRequest</p>
     */
    public static class BodyData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        private BodyData(Builder builder) {
            this.content = builder.content;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BodyData create() {
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

            private Builder(BodyData model) {
                this.content = model.content;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            public BodyData build() {
                return new BodyData(this);
            } 

        } 

    }
}
