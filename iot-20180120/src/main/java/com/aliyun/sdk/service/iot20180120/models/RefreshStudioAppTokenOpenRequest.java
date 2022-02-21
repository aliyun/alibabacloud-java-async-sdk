// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshStudioAppTokenOpenRequest} extends {@link RequestModel}
 *
 * <p>RefreshStudioAppTokenOpenRequest</p>
 */
public class RefreshStudioAppTokenOpenRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    private RefreshStudioAppTokenOpenRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.iotInstanceId = builder.iotInstanceId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshStudioAppTokenOpenRequest create() {
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

    public static final class Builder extends Request.Builder<RefreshStudioAppTokenOpenRequest, Builder> {
        private String appId; 
        private String iotInstanceId; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(RefreshStudioAppTokenOpenRequest response) {
            super(response);
            this.appId = response.appId;
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
        public RefreshStudioAppTokenOpenRequest build() {
            return new RefreshStudioAppTokenOpenRequest(this);
        } 

    } 

}
