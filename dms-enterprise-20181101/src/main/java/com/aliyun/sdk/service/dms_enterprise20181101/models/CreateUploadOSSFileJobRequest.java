// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUploadOSSFileJobRequest} extends {@link RequestModel}
 *
 * <p>CreateUploadOSSFileJobRequest</p>
 */
public class CreateUploadOSSFileJobRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("FileName")
    @Validation(required = true)
    private String fileName;

    @Query
    @NameInMap("FileSource")
    @Validation(required = true)
    private String fileSource;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    @Query
    @NameInMap("UploadTarget")
    @Validation(required = true)
    private UploadTarget uploadTarget;

    private CreateUploadOSSFileJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.fileName = builder.fileName;
        this.fileSource = builder.fileSource;
        this.tid = builder.tid;
        this.uploadTarget = builder.uploadTarget;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUploadOSSFileJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    /**
     * @return uploadTarget
     */
    public UploadTarget getUploadTarget() {
        return this.uploadTarget;
    }

    public static final class Builder extends Request.Builder<CreateUploadOSSFileJobRequest, Builder> {
        private String regionId; 
        private String fileName; 
        private String fileSource; 
        private Long tid; 
        private UploadTarget uploadTarget; 

        private Builder() {
            super();
        } 

        private Builder(CreateUploadOSSFileJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.fileName = request.fileName;
            this.fileSource = request.fileSource;
            this.tid = request.tid;
            this.uploadTarget = request.uploadTarget;
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
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * UploadTarget.
         */
        public Builder uploadTarget(UploadTarget uploadTarget) {
            String uploadTargetShrink = shrink(uploadTarget, "UploadTarget", "json");
            this.putQueryParameter("UploadTarget", uploadTargetShrink);
            this.uploadTarget = uploadTarget;
            return this;
        }

        @Override
        public CreateUploadOSSFileJobRequest build() {
            return new CreateUploadOSSFileJobRequest(this);
        } 

    } 

    public static class UploadTarget extends TeaModel {
        @NameInMap("BucketName")
        @Validation(required = true)
        private String bucketName;

        @NameInMap("Endpoint")
        @Validation(required = true)
        private String endpoint;

        @NameInMap("ObjectName")
        @Validation(required = true)
        private String objectName;

        private UploadTarget(Builder builder) {
            this.bucketName = builder.bucketName;
            this.endpoint = builder.endpoint;
            this.objectName = builder.objectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UploadTarget create() {
            return builder().build();
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return objectName
         */
        public String getObjectName() {
            return this.objectName;
        }

        public static final class Builder {
            private String bucketName; 
            private String endpoint; 
            private String objectName; 

            /**
             * BucketName.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * Endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * ObjectName.
             */
            public Builder objectName(String objectName) {
                this.objectName = objectName;
                return this;
            }

            public UploadTarget build() {
                return new UploadTarget(this);
            } 

        } 

    }
}
