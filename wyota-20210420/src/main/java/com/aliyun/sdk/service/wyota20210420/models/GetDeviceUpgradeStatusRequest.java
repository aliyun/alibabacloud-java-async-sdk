// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDeviceUpgradeStatusRequest} extends {@link RequestModel}
 *
 * <p>GetDeviceUpgradeStatusRequest</p>
 */
public class GetDeviceUpgradeStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppVersion")
    private String appVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientUid")
    private String clientUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Project")
    private String project;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskUid")
    private String taskUid;

    private GetDeviceUpgradeStatusRequest(Builder builder) {
        super(builder);
        this.appVersion = builder.appVersion;
        this.clientUid = builder.clientUid;
        this.project = builder.project;
        this.taskUid = builder.taskUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceUpgradeStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appVersion
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return clientUid
     */
    public String getClientUid() {
        return this.clientUid;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return taskUid
     */
    public String getTaskUid() {
        return this.taskUid;
    }

    public static final class Builder extends Request.Builder<GetDeviceUpgradeStatusRequest, Builder> {
        private String appVersion; 
        private String clientUid; 
        private String project; 
        private String taskUid; 

        private Builder() {
            super();
        } 

        private Builder(GetDeviceUpgradeStatusRequest request) {
            super(request);
            this.appVersion = request.appVersion;
            this.clientUid = request.clientUid;
            this.project = request.project;
            this.taskUid = request.taskUid;
        } 

        /**
         * AppVersion.
         */
        public Builder appVersion(String appVersion) {
            this.putQueryParameter("AppVersion", appVersion);
            this.appVersion = appVersion;
            return this;
        }

        /**
         * ClientUid.
         */
        public Builder clientUid(String clientUid) {
            this.putQueryParameter("ClientUid", clientUid);
            this.clientUid = clientUid;
            return this;
        }

        /**
         * Project.
         */
        public Builder project(String project) {
            this.putQueryParameter("Project", project);
            this.project = project;
            return this;
        }

        /**
         * TaskUid.
         */
        public Builder taskUid(String taskUid) {
            this.putQueryParameter("TaskUid", taskUid);
            this.taskUid = taskUid;
            return this;
        }

        @Override
        public GetDeviceUpgradeStatusRequest build() {
            return new GetDeviceUpgradeStatusRequest(this);
        } 

    } 

}
