// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadFilesRequest} extends {@link RequestModel}
 *
 * <p>UploadFilesRequest</p>
 */
public class UploadFilesRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("CloudUrl")
    private String cloudUrl;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Localpath")
    private String localpath;

    private UploadFilesRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.cloudUrl = builder.cloudUrl;
        this.instanceId = builder.instanceId;
        this.localpath = builder.localpath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadFilesRequest create() {
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
     * @return cloudUrl
     */
    public String getCloudUrl() {
        return this.cloudUrl;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return localpath
     */
    public String getLocalpath() {
        return this.localpath;
    }

    public static final class Builder extends Request.Builder<UploadFilesRequest, Builder> {
        private String appId; 
        private String cloudUrl; 
        private String instanceId; 
        private String localpath; 

        private Builder() {
            super();
        } 

        private Builder(UploadFilesRequest response) {
            super(response);
            this.appId = response.appId;
            this.cloudUrl = response.cloudUrl;
            this.instanceId = response.instanceId;
            this.localpath = response.localpath;
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
         * CloudUrl.
         */
        public Builder cloudUrl(String cloudUrl) {
            this.putQueryParameter("CloudUrl", cloudUrl);
            this.cloudUrl = cloudUrl;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Localpath.
         */
        public Builder localpath(String localpath) {
            this.putQueryParameter("Localpath", localpath);
            this.localpath = localpath;
            return this;
        }

        @Override
        public UploadFilesRequest build() {
            return new UploadFilesRequest(this);
        } 

    } 

}
