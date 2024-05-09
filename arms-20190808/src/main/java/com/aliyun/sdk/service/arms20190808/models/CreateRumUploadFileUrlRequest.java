// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRumUploadFileUrlRequest} extends {@link RequestModel}
 *
 * <p>CreateRumUploadFileUrlRequest</p>
 */
public class CreateRumUploadFileUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentType")
    private String contentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pid")
    private String pid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourcemapType")
    private String sourcemapType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionId")
    private String versionId;

    private CreateRumUploadFileUrlRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.contentType = builder.contentType;
        this.fileName = builder.fileName;
        this.pid = builder.pid;
        this.regionId = builder.regionId;
        this.sourcemapType = builder.sourcemapType;
        this.uuid = builder.uuid;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRumUploadFileUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return pid
     */
    public String getPid() {
        return this.pid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sourcemapType
     */
    public String getSourcemapType() {
        return this.sourcemapType;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<CreateRumUploadFileUrlRequest, Builder> {
        private String appName; 
        private String contentType; 
        private String fileName; 
        private String pid; 
        private String regionId; 
        private String sourcemapType; 
        private String uuid; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRumUploadFileUrlRequest request) {
            super(request);
            this.appName = request.appName;
            this.contentType = request.contentType;
            this.fileName = request.fileName;
            this.pid = request.pid;
            this.regionId = request.regionId;
            this.sourcemapType = request.sourcemapType;
            this.uuid = request.uuid;
            this.versionId = request.versionId;
        } 

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * ContentType.
         */
        public Builder contentType(String contentType) {
            this.putQueryParameter("ContentType", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * Pid.
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SourcemapType.
         */
        public Builder sourcemapType(String sourcemapType) {
            this.putQueryParameter("SourcemapType", sourcemapType);
            this.sourcemapType = sourcemapType;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        /**
         * VersionId.
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public CreateRumUploadFileUrlRequest build() {
            return new CreateRumUploadFileUrlRequest(this);
        } 

    } 

}
