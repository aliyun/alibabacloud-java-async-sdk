// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVideoComposeTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateVideoComposeTaskRequest</p>
 */
public class CreateVideoComposeTaskRequest extends Request {
    @Body
    @NameInMap("AudioFileName")
    @Validation(required = true)
    private String audioFileName;

    @Body
    @NameInMap("BucketName")
    @Validation(required = true)
    private String bucketName;

    @Body
    @NameInMap("CorpId")
    @Validation(required = true)
    private String corpId;

    @Body
    @NameInMap("DomainName")
    private String domainName;

    @Body
    @NameInMap("ImageFileNames")
    @Validation(required = true)
    private String imageFileNames;

    @Body
    @NameInMap("ImageParameters")
    @Validation(required = true)
    private String imageParameters;

    @Body
    @NameInMap("VideoFormat")
    private String videoFormat;

    @Body
    @NameInMap("VideoFrameRate")
    private Integer videoFrameRate;

    private CreateVideoComposeTaskRequest(Builder builder) {
        super(builder);
        this.audioFileName = builder.audioFileName;
        this.bucketName = builder.bucketName;
        this.corpId = builder.corpId;
        this.domainName = builder.domainName;
        this.imageFileNames = builder.imageFileNames;
        this.imageParameters = builder.imageParameters;
        this.videoFormat = builder.videoFormat;
        this.videoFrameRate = builder.videoFrameRate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVideoComposeTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return audioFileName
     */
    public String getAudioFileName() {
        return this.audioFileName;
    }

    /**
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return imageFileNames
     */
    public String getImageFileNames() {
        return this.imageFileNames;
    }

    /**
     * @return imageParameters
     */
    public String getImageParameters() {
        return this.imageParameters;
    }

    /**
     * @return videoFormat
     */
    public String getVideoFormat() {
        return this.videoFormat;
    }

    /**
     * @return videoFrameRate
     */
    public Integer getVideoFrameRate() {
        return this.videoFrameRate;
    }

    public static final class Builder extends Request.Builder<CreateVideoComposeTaskRequest, Builder> {
        private String audioFileName; 
        private String bucketName; 
        private String corpId; 
        private String domainName; 
        private String imageFileNames; 
        private String imageParameters; 
        private String videoFormat; 
        private Integer videoFrameRate; 

        private Builder() {
            super();
        } 

        private Builder(CreateVideoComposeTaskRequest response) {
            super(response);
            this.audioFileName = response.audioFileName;
            this.bucketName = response.bucketName;
            this.corpId = response.corpId;
            this.domainName = response.domainName;
            this.imageFileNames = response.imageFileNames;
            this.imageParameters = response.imageParameters;
            this.videoFormat = response.videoFormat;
            this.videoFrameRate = response.videoFrameRate;
        } 

        /**
         * AudioFileName.
         */
        public Builder audioFileName(String audioFileName) {
            this.putBodyParameter("AudioFileName", audioFileName);
            this.audioFileName = audioFileName;
            return this;
        }

        /**
         * BucketName.
         */
        public Builder bucketName(String bucketName) {
            this.putBodyParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * ImageFileNames.
         */
        public Builder imageFileNames(String imageFileNames) {
            this.putBodyParameter("ImageFileNames", imageFileNames);
            this.imageFileNames = imageFileNames;
            return this;
        }

        /**
         * ImageParameters.
         */
        public Builder imageParameters(String imageParameters) {
            this.putBodyParameter("ImageParameters", imageParameters);
            this.imageParameters = imageParameters;
            return this;
        }

        /**
         * VideoFormat.
         */
        public Builder videoFormat(String videoFormat) {
            this.putBodyParameter("VideoFormat", videoFormat);
            this.videoFormat = videoFormat;
            return this;
        }

        /**
         * VideoFrameRate.
         */
        public Builder videoFrameRate(Integer videoFrameRate) {
            this.putBodyParameter("VideoFrameRate", videoFrameRate);
            this.videoFrameRate = videoFrameRate;
            return this;
        }

        @Override
        public CreateVideoComposeTaskRequest build() {
            return new CreateVideoComposeTaskRequest(this);
        } 

    } 

}
