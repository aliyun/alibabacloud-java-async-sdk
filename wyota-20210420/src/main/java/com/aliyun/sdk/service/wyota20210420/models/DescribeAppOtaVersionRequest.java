// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAppOtaVersionRequest} extends {@link RequestModel}
 *
 * <p>DescribeAppOtaVersionRequest</p>
 */
public class DescribeAppOtaVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppVersion")
    private String appVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Channel")
    private String channel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientType")
    private Integer clientType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Project")
    private String project;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionUid")
    private String versionUid;

    private DescribeAppOtaVersionRequest(Builder builder) {
        super(builder);
        this.appVersion = builder.appVersion;
        this.channel = builder.channel;
        this.clientType = builder.clientType;
        this.creator = builder.creator;
        this.project = builder.project;
        this.status = builder.status;
        this.versionUid = builder.versionUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppOtaVersionRequest create() {
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
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return clientType
     */
    public Integer getClientType() {
        return this.clientType;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return versionUid
     */
    public String getVersionUid() {
        return this.versionUid;
    }

    public static final class Builder extends Request.Builder<DescribeAppOtaVersionRequest, Builder> {
        private String appVersion; 
        private String channel; 
        private Integer clientType; 
        private String creator; 
        private String project; 
        private Integer status; 
        private String versionUid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAppOtaVersionRequest request) {
            super(request);
            this.appVersion = request.appVersion;
            this.channel = request.channel;
            this.clientType = request.clientType;
            this.creator = request.creator;
            this.project = request.project;
            this.status = request.status;
            this.versionUid = request.versionUid;
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
         * Channel.
         */
        public Builder channel(String channel) {
            this.putQueryParameter("Channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * ClientType.
         */
        public Builder clientType(Integer clientType) {
            this.putQueryParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * Creator.
         */
        public Builder creator(String creator) {
            this.putQueryParameter("Creator", creator);
            this.creator = creator;
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
         * Status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * VersionUid.
         */
        public Builder versionUid(String versionUid) {
            this.putQueryParameter("VersionUid", versionUid);
            this.versionUid = versionUid;
            return this;
        }

        @Override
        public DescribeAppOtaVersionRequest build() {
            return new DescribeAppOtaVersionRequest(this);
        } 

    } 

}
