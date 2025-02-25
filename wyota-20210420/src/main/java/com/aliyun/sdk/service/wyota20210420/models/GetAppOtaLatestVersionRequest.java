// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetAppOtaLatestVersionRequest} extends {@link RequestModel}
 *
 * <p>GetAppOtaLatestVersionRequest</p>
 */
public class GetAppOtaLatestVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaseVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String baseVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientType")
    private Integer clientType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientUid")
    private String clientUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OsType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String osType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Project")
    private String project;

    private GetAppOtaLatestVersionRequest(Builder builder) {
        super(builder);
        this.baseVersion = builder.baseVersion;
        this.clientType = builder.clientType;
        this.clientUid = builder.clientUid;
        this.osType = builder.osType;
        this.project = builder.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppOtaLatestVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baseVersion
     */
    public String getBaseVersion() {
        return this.baseVersion;
    }

    /**
     * @return clientType
     */
    public Integer getClientType() {
        return this.clientType;
    }

    /**
     * @return clientUid
     */
    public String getClientUid() {
        return this.clientUid;
    }

    /**
     * @return osType
     */
    public String getOsType() {
        return this.osType;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    public static final class Builder extends Request.Builder<GetAppOtaLatestVersionRequest, Builder> {
        private String baseVersion; 
        private Integer clientType; 
        private String clientUid; 
        private String osType; 
        private String project; 

        private Builder() {
            super();
        } 

        private Builder(GetAppOtaLatestVersionRequest request) {
            super(request);
            this.baseVersion = request.baseVersion;
            this.clientType = request.clientType;
            this.clientUid = request.clientUid;
            this.osType = request.osType;
            this.project = request.project;
        } 

        /**
         * BaseVersion.
         */
        public Builder baseVersion(String baseVersion) {
            this.putQueryParameter("BaseVersion", baseVersion);
            this.baseVersion = baseVersion;
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
         * ClientUid.
         */
        public Builder clientUid(String clientUid) {
            this.putQueryParameter("ClientUid", clientUid);
            this.clientUid = clientUid;
            return this;
        }

        /**
         * OsType.
         */
        public Builder osType(String osType) {
            this.putQueryParameter("OsType", osType);
            this.osType = osType;
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

        @Override
        public GetAppOtaLatestVersionRequest build() {
            return new GetAppOtaLatestVersionRequest(this);
        } 

    } 

}
