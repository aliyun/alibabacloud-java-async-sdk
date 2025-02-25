// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateProblemPictureUploadSignRequest} extends {@link RequestModel}
 *
 * <p>GenerateProblemPictureUploadSignRequest</p>
 */
public class GenerateProblemPictureUploadSignRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fileName")
    private String fileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fileSize")
    private Long fileSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fileType")
    private String fileType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("problemId")
    private Long problemId;

    private GenerateProblemPictureUploadSignRequest(Builder builder) {
        super(builder);
        this.fileName = builder.fileName;
        this.fileSize = builder.fileSize;
        this.fileType = builder.fileType;
        this.problemId = builder.problemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateProblemPictureUploadSignRequest create() {
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
     * @return fileSize
     */
    public Long getFileSize() {
        return this.fileSize;
    }

    /**
     * @return fileType
     */
    public String getFileType() {
        return this.fileType;
    }

    /**
     * @return problemId
     */
    public Long getProblemId() {
        return this.problemId;
    }

    public static final class Builder extends Request.Builder<GenerateProblemPictureUploadSignRequest, Builder> {
        private String fileName; 
        private Long fileSize; 
        private String fileType; 
        private Long problemId; 

        private Builder() {
            super();
        } 

        private Builder(GenerateProblemPictureUploadSignRequest request) {
            super(request);
            this.fileName = request.fileName;
            this.fileSize = request.fileSize;
            this.fileType = request.fileType;
            this.problemId = request.problemId;
        } 

        /**
         * fileName.
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("fileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * fileSize.
         */
        public Builder fileSize(Long fileSize) {
            this.putBodyParameter("fileSize", fileSize);
            this.fileSize = fileSize;
            return this;
        }

        /**
         * fileType.
         */
        public Builder fileType(String fileType) {
            this.putBodyParameter("fileType", fileType);
            this.fileType = fileType;
            return this;
        }

        /**
         * problemId.
         */
        public Builder problemId(Long problemId) {
            this.putBodyParameter("problemId", problemId);
            this.problemId = problemId;
            return this;
        }

        @Override
        public GenerateProblemPictureUploadSignRequest build() {
            return new GenerateProblemPictureUploadSignRequest(this);
        } 

    } 

}
