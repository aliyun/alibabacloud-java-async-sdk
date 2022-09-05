// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadRequest} extends {@link RequestModel}
 *
 * <p>UploadRequest</p>
 */
public class UploadRequest extends Request {
    @Query
    @NameInMap("Edition")
    private String edition;

    @Body
    @NameInMap("File")
    private String file;

    @Query
    @NameInMap("FileName")
    @Validation(required = true)
    private String fileName;

    @Query
    @NameInMap("Pid")
    @Validation(required = true)
    private String pid;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Version")
    private String version;

    private UploadRequest(Builder builder) {
        super(builder);
        this.edition = builder.edition;
        this.file = builder.file;
        this.fileName = builder.fileName;
        this.pid = builder.pid;
        this.regionId = builder.regionId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return edition
     */
    public String getEdition() {
        return this.edition;
    }

    /**
     * @return file
     */
    public String getFile() {
        return this.file;
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
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<UploadRequest, Builder> {
        private String edition; 
        private String file; 
        private String fileName; 
        private String pid; 
        private String regionId; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(UploadRequest request) {
            super(request);
            this.edition = request.edition;
            this.file = request.file;
            this.fileName = request.fileName;
            this.pid = request.pid;
            this.regionId = request.regionId;
            this.version = request.version;
        } 

        /**
         * Edition.
         */
        public Builder edition(String edition) {
            this.putQueryParameter("Edition", edition);
            this.edition = edition;
            return this;
        }

        /**
         * File.
         */
        public Builder file(String file) {
            this.putBodyParameter("File", file);
            this.file = file;
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
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public UploadRequest build() {
            return new UploadRequest(this);
        } 

    } 

}
