// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppRequest} extends {@link RequestModel}
 *
 * <p>CreateAppRequest</p>
 */
public class CreateAppRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StreamingAppId")
    private String streamingAppId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StreamingSolution")
    private String streamingSolution;

    private CreateAppRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.appType = builder.appType;
        this.streamingAppId = builder.streamingAppId;
        this.streamingSolution = builder.streamingSolution;
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
     * @return appType
     */
    public String getAppType() {
        return this.appType;
    }

    /**
     * @return streamingAppId
     */
    public String getStreamingAppId() {
        return this.streamingAppId;
    }

    /**
     * @return streamingSolution
     */
    public String getStreamingSolution() {
        return this.streamingSolution;
    }

    public static final class Builder extends Request.Builder<CreateAppRequest, Builder> {
        private String appName; 
        private String appType; 
        private String streamingAppId; 
        private String streamingSolution; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppRequest request) {
            super(request);
            this.appName = request.appName;
            this.appType = request.appType;
            this.streamingAppId = request.streamingAppId;
            this.streamingSolution = request.streamingSolution;
        } 

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * AppType.
         */
        public Builder appType(String appType) {
            this.putBodyParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * StreamingAppId.
         */
        public Builder streamingAppId(String streamingAppId) {
            this.putBodyParameter("StreamingAppId", streamingAppId);
            this.streamingAppId = streamingAppId;
            return this;
        }

        /**
         * StreamingSolution.
         */
        public Builder streamingSolution(String streamingSolution) {
            this.putBodyParameter("StreamingSolution", streamingSolution);
            this.streamingSolution = streamingSolution;
            return this;
        }

        @Override
        public CreateAppRequest build() {
            return new CreateAppRequest(this);
        } 

    } 

}
