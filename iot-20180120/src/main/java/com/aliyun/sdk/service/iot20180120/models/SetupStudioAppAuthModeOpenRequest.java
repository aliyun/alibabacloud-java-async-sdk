// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link SetupStudioAppAuthModeOpenRequest} extends {@link RequestModel}
 *
 * <p>SetupStudioAppAuthModeOpenRequest</p>
 */
public class SetupStudioAppAuthModeOpenRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer authMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(SetupStudioAppAuthModeOpenRequest request) {
            super(request);
            this.appId = request.appId;
            this.authMode = request.authMode;
            this.iotInstanceId = request.iotInstanceId;
            this.projectId = request.projectId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a12*****</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a123********</p>
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
