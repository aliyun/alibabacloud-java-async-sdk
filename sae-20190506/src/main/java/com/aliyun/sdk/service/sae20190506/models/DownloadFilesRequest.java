// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DownloadFilesRequest} extends {@link RequestModel}
 *
 * <p>DownloadFilesRequest</p>
 */
public class DownloadFilesRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Localpath")
    private String localpath;

    private DownloadFilesRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.instanceId = builder.instanceId;
        this.localpath = builder.localpath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadFilesRequest create() {
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

    public static final class Builder extends Request.Builder<DownloadFilesRequest, Builder> {
        private String appId; 
        private String instanceId; 
        private String localpath; 

        private Builder() {
            super();
        } 

        private Builder(DownloadFilesRequest response) {
            super(response);
            this.appId = response.appId;
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
        public DownloadFilesRequest build() {
            return new DownloadFilesRequest(this);
        } 

    } 

}
