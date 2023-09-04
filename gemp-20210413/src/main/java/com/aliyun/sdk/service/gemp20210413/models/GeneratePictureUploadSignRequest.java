// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GeneratePictureUploadSignRequest} extends {@link RequestModel}
 *
 * <p>GeneratePictureUploadSignRequest</p>
 */
public class GeneratePictureUploadSignRequest extends Request {
    @Body
    @NameInMap("files")
    private java.util.List < Files> files;

    @Body
    @NameInMap("instanceId")
    private Long instanceId;

    @Body
    @NameInMap("instanceType")
    private String instanceType;

    private GeneratePictureUploadSignRequest(Builder builder) {
        super(builder);
        this.files = builder.files;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GeneratePictureUploadSignRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return files
     */
    public java.util.List < Files> getFiles() {
        return this.files;
    }

    /**
     * @return instanceId
     */
    public Long getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    public static final class Builder extends Request.Builder<GeneratePictureUploadSignRequest, Builder> {
        private java.util.List < Files> files; 
        private Long instanceId; 
        private String instanceType; 

        private Builder() {
            super();
        } 

        private Builder(GeneratePictureUploadSignRequest request) {
            super(request);
            this.files = request.files;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
        } 

        /**
         * files.
         */
        public Builder files(java.util.List < Files> files) {
            this.putBodyParameter("files", files);
            this.files = files;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(Long instanceId) {
            this.putBodyParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * instanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putBodyParameter("instanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        @Override
        public GeneratePictureUploadSignRequest build() {
            return new GeneratePictureUploadSignRequest(this);
        } 

    } 

    public static class Files extends TeaModel {
        @NameInMap("fileName")
        private String fileName;

        @NameInMap("fileSize")
        private Long fileSize;

        @NameInMap("fileType")
        private String fileType;

        private Files(Builder builder) {
            this.fileName = builder.fileName;
            this.fileSize = builder.fileSize;
            this.fileType = builder.fileType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Files create() {
            return builder().build();
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

        public static final class Builder {
            private String fileName; 
            private Long fileSize; 
            private String fileType; 

            /**
             * fileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * fileSize.
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * fileType.
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            public Files build() {
                return new Files(this);
            } 

        } 

    }
}
