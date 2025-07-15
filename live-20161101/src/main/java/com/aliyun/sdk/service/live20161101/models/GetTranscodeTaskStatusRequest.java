// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link GetTranscodeTaskStatusRequest} extends {@link RequestModel}
 *
 * <p>GetTranscodeTaskStatusRequest</p>
 */
public class GetTranscodeTaskStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("App")
    private String app;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PushDomain")
    private String pushDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamName")
    private String streamName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TranscodingTemplate")
    private String transcodingTemplate;

    private GetTranscodeTaskStatusRequest(Builder builder) {
        super(builder);
        this.app = builder.app;
        this.pushDomain = builder.pushDomain;
        this.securityToken = builder.securityToken;
        this.streamName = builder.streamName;
        this.transcodingTemplate = builder.transcodingTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTranscodeTaskStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return app
     */
    public String getApp() {
        return this.app;
    }

    /**
     * @return pushDomain
     */
    public String getPushDomain() {
        return this.pushDomain;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    /**
     * @return transcodingTemplate
     */
    public String getTranscodingTemplate() {
        return this.transcodingTemplate;
    }

    public static final class Builder extends Request.Builder<GetTranscodeTaskStatusRequest, Builder> {
        private String app; 
        private String pushDomain; 
        private String securityToken; 
        private String streamName; 
        private String transcodingTemplate; 

        private Builder() {
            super();
        } 

        private Builder(GetTranscodeTaskStatusRequest request) {
            super(request);
            this.app = request.app;
            this.pushDomain = request.pushDomain;
            this.securityToken = request.securityToken;
            this.streamName = request.streamName;
            this.transcodingTemplate = request.transcodingTemplate;
        } 

        /**
         * App.
         */
        public Builder app(String app) {
            this.putQueryParameter("App", app);
            this.app = app;
            return this;
        }

        /**
         * PushDomain.
         */
        public Builder pushDomain(String pushDomain) {
            this.putQueryParameter("PushDomain", pushDomain);
            this.pushDomain = pushDomain;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * StreamName.
         */
        public Builder streamName(String streamName) {
            this.putQueryParameter("StreamName", streamName);
            this.streamName = streamName;
            return this;
        }

        /**
         * TranscodingTemplate.
         */
        public Builder transcodingTemplate(String transcodingTemplate) {
            this.putQueryParameter("TranscodingTemplate", transcodingTemplate);
            this.transcodingTemplate = transcodingTemplate;
            return this;
        }

        @Override
        public GetTranscodeTaskStatusRequest build() {
            return new GetTranscodeTaskStatusRequest(this);
        } 

    } 

}
