// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUploadFileJobRequest} extends {@link RequestModel}
 *
 * <p>CreateUploadFileJobRequest</p>
 */
public class CreateUploadFileJobRequest extends Request {
    @Query
    @NameInMap("FileName")
    @Validation(required = true)
    private String fileName;

    @Query
    @NameInMap("FileSource")
    @Validation(required = true)
    private String fileSource;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    @Query
    @NameInMap("UploadURL")
    @Validation(required = true)
    private String uploadURL;

    private CreateUploadFileJobRequest(Builder builder) {
        super(builder);
        this.fileName = builder.fileName;
        this.fileSource = builder.fileSource;
        this.regionId = builder.regionId;
        this.tid = builder.tid;
        this.uploadURL = builder.uploadURL;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUploadFileJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return fileSource
     */
    public String getFileSource() {
        return this.fileSource;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    /**
     * @return uploadURL
     */
    public String getUploadURL() {
        return this.uploadURL;
    }

    public static final class Builder extends Request.Builder<CreateUploadFileJobRequest, Builder> {
        private String fileName; 
        private String fileSource; 
        private String regionId; 
        private Long tid; 
        private String uploadURL; 

        private Builder() {
            super();
        } 

        private Builder(CreateUploadFileJobRequest response) {
            super(response);
            this.fileName = response.fileName;
            this.fileSource = response.fileSource;
            this.regionId = response.regionId;
            this.tid = response.tid;
            this.uploadURL = response.uploadURL;
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
         * FileSource.
         */
        public Builder fileSource(String fileSource) {
            this.putQueryParameter("FileSource", fileSource);
            this.fileSource = fileSource;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * UploadURL.
         */
        public Builder uploadURL(String uploadURL) {
            this.putQueryParameter("UploadURL", uploadURL);
            this.uploadURL = uploadURL;
            return this;
        }

        @Override
        public CreateUploadFileJobRequest build() {
            return new CreateUploadFileJobRequest(this);
        } 

    } 

}
