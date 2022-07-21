// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateStudioAppDomainOpenRequest} extends {@link RequestModel}
 *
 * <p>CreateStudioAppDomainOpenRequest</p>
 */
public class CreateStudioAppDomainOpenRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("Host")
    @Validation(required = true)
    private String host;

    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Body
    @NameInMap("Protocol")
    @Validation(required = true)
    private String protocol;

    private CreateStudioAppDomainOpenRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.host = builder.host;
        this.iotInstanceId = builder.iotInstanceId;
        this.projectId = builder.projectId;
        this.protocol = builder.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStudioAppDomainOpenRequest create() {
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
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    public static final class Builder extends Request.Builder<CreateStudioAppDomainOpenRequest, Builder> {
        private String appId; 
        private String host; 
        private String iotInstanceId; 
        private String projectId; 
        private String protocol; 

        private Builder() {
            super();
        } 

        private Builder(CreateStudioAppDomainOpenRequest request) {
            super(request);
            this.appId = request.appId;
            this.host = request.host;
            this.iotInstanceId = request.iotInstanceId;
            this.projectId = request.projectId;
            this.protocol = request.protocol;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Host.
         */
        public Builder host(String host) {
            this.putBodyParameter("Host", host);
            this.host = host;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * Protocol.
         */
        public Builder protocol(String protocol) {
            this.putBodyParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        @Override
        public CreateStudioAppDomainOpenRequest build() {
            return new CreateStudioAppDomainOpenRequest(this);
        } 

    } 

}
