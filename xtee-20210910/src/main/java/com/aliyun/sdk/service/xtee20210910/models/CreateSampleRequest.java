// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSampleRequest} extends {@link RequestModel}
 *
 * <p>CreateSampleRequest</p>
 */
public class CreateSampleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientFileName")
    private String clientFileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientPath")
    private String clientPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("fileType")
    private String fileType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sampleTag")
    private String sampleTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sampleType")
    private String sampleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sampleValues")
    private String sampleValues;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("uploadType")
    private String uploadType;

    private CreateSampleRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.clientFileName = builder.clientFileName;
        this.clientPath = builder.clientPath;
        this.fileType = builder.fileType;
        this.regId = builder.regId;
        this.sampleTag = builder.sampleTag;
        this.sampleType = builder.sampleType;
        this.sampleValues = builder.sampleValues;
        this.uploadType = builder.uploadType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSampleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return clientFileName
     */
    public String getClientFileName() {
        return this.clientFileName;
    }

    /**
     * @return clientPath
     */
    public String getClientPath() {
        return this.clientPath;
    }

    /**
     * @return fileType
     */
    public String getFileType() {
        return this.fileType;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return sampleTag
     */
    public String getSampleTag() {
        return this.sampleTag;
    }

    /**
     * @return sampleType
     */
    public String getSampleType() {
        return this.sampleType;
    }

    /**
     * @return sampleValues
     */
    public String getSampleValues() {
        return this.sampleValues;
    }

    /**
     * @return uploadType
     */
    public String getUploadType() {
        return this.uploadType;
    }

    public static final class Builder extends Request.Builder<CreateSampleRequest, Builder> {
        private String lang; 
        private String clientFileName; 
        private String clientPath; 
        private String fileType; 
        private String regId; 
        private String sampleTag; 
        private String sampleType; 
        private String sampleValues; 
        private String uploadType; 

        private Builder() {
            super();
        } 

        private Builder(CreateSampleRequest request) {
            super(request);
            this.lang = request.lang;
            this.clientFileName = request.clientFileName;
            this.clientPath = request.clientPath;
            this.fileType = request.fileType;
            this.regId = request.regId;
            this.sampleTag = request.sampleTag;
            this.sampleType = request.sampleType;
            this.sampleValues = request.sampleValues;
            this.uploadType = request.uploadType;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * clientFileName.
         */
        public Builder clientFileName(String clientFileName) {
            this.putQueryParameter("clientFileName", clientFileName);
            this.clientFileName = clientFileName;
            return this;
        }

        /**
         * clientPath.
         */
        public Builder clientPath(String clientPath) {
            this.putQueryParameter("clientPath", clientPath);
            this.clientPath = clientPath;
            return this;
        }

        /**
         * fileType.
         */
        public Builder fileType(String fileType) {
            this.putQueryParameter("fileType", fileType);
            this.fileType = fileType;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * sampleTag.
         */
        public Builder sampleTag(String sampleTag) {
            this.putQueryParameter("sampleTag", sampleTag);
            this.sampleTag = sampleTag;
            return this;
        }

        /**
         * sampleType.
         */
        public Builder sampleType(String sampleType) {
            this.putQueryParameter("sampleType", sampleType);
            this.sampleType = sampleType;
            return this;
        }

        /**
         * sampleValues.
         */
        public Builder sampleValues(String sampleValues) {
            this.putQueryParameter("sampleValues", sampleValues);
            this.sampleValues = sampleValues;
            return this;
        }

        /**
         * uploadType.
         */
        public Builder uploadType(String uploadType) {
            this.putQueryParameter("uploadType", uploadType);
            this.uploadType = uploadType;
            return this;
        }

        @Override
        public CreateSampleRequest build() {
            return new CreateSampleRequest(this);
        } 

    } 

}
