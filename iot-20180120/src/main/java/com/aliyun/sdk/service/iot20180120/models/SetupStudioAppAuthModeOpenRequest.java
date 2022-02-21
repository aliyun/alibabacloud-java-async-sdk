// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetupStudioAppAuthModeOpenRequest} extends {@link RequestModel}
 *
 * <p>SetupStudioAppAuthModeOpenRequest</p>
 */
public class SetupStudioAppAuthModeOpenRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("AuthMode")
    @Validation(required = true)
    private Integer authMode;

    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    private SetupStudioAppAuthModeOpenRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.authMode = builder.authMode;
        this.iotInstanceId = builder.iotInstanceId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetupStudioAppAuthModeOpenRequest create() {
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
     * @return authMode
     */
    public Integer getAuthMode() {
        return this.authMode;
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

    public static final class Builder extends Request.Builder<SetupStudioAppAuthModeOpenRequest, Builder> {
        private String appId; 
        private Integer authMode; 
        private String iotInstanceId; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(SetupStudioAppAuthModeOpenRequest response) {
            super(response);
            this.appId = response.appId;
            this.authMode = response.authMode;
            this.iotInstanceId = response.iotInstanceId;
            this.projectId = response.projectId;
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
         * AuthMode.
         */
        public Builder authMode(Integer authMode) {
            this.putBodyParameter("AuthMode", authMode);
            this.authMode = authMode;
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

        @Override
        public SetupStudioAppAuthModeOpenRequest build() {
            return new SetupStudioAppAuthModeOpenRequest(this);
        } 

    } 

}
