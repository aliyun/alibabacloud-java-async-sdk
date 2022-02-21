// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateProblemPictureUploadSignRequest} extends {@link RequestModel}
 *
 * <p>GenerateProblemPictureUploadSignRequest</p>
 */
public class GenerateProblemPictureUploadSignRequest extends Request {
    @Body
    @NameInMap("fileName")
    private String fileName;

    @Body
    @NameInMap("fileSize")
    private Long fileSize;

    @Body
    @NameInMap("fileType")
    private String fileType;

    @Body
    @NameInMap("problemId")
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

        private Builder(GenerateProblemPictureUploadSignRequest response) {
            super(response);
            this.fileName = response.fileName;
            this.fileSize = response.fileSize;
            this.fileType = response.fileType;
            this.problemId = response.problemId;
        } 

        /**
         * 文件名
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("fileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * 文件大小KB
         */
        public Builder fileSize(Long fileSize) {
            this.putBodyParameter("fileSize", fileSize);
            this.fileSize = fileSize;
            return this;
        }

        /**
         * 文件类型
         */
        public Builder fileType(String fileType) {
            this.putBodyParameter("fileType", fileType);
            this.fileType = fileType;
            return this;
        }

        /**
         * 故障id
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
