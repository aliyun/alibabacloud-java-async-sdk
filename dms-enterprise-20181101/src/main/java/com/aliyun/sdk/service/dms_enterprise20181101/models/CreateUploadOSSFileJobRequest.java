// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateUploadOSSFileJobRequest} extends {@link RequestModel}
 *
 * <p>CreateUploadOSSFileJobRequest</p>
 */
public class CreateUploadOSSFileJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSource")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadTarget")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The name of the file.</p>
         * <blockquote>
         * <p>The file name must end with .txt or .sql. For example, the file name can be text.txt.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test.sql</p>
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The purpose of the file upload task. Valid values:</p>
         * <ul>
         * <li><strong>datacorrect</strong>: The file is uploaded to change data.</li>
         * <li><strong>order_info_attachment</strong>: The file is uploaded as an attachment in a ticket.</li>
         * <li><strong>big-file</strong>: The file is uploaded to import multiple data records at a time.</li>
         * <li><strong>sqlreview</strong>: The file is uploaded for SQL review.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>datacorrect</p>
         */
        public Builder fileSource(String fileSource) {
            this.putQueryParameter("FileSource", fileSource);
            this.fileSource = fileSource;
            return this;
        }

        /**
         * <p>The ID of the tenant.</p>
         * <blockquote>
         * <p>To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the &quot;View information about the current tenant&quot; section of the <a href="https://help.aliyun.com/document_detail/181330.html">Manage DMS tenants</a> topic.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * <p>The information about the OSS file to be uploaded.</p>
         * <p>This parameter is required.</p>
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

    /**
     * 
     * {@link CreateUploadOSSFileJobRequest} extends {@link TeaModel}
     *
     * <p>CreateUploadOSSFileJobRequest</p>
     */
    public static class UploadTarget extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BucketName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        @com.aliyun.core.annotation.Validation(required = true)
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("ObjectName")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The name of the OSS bucket.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test_bucket</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>The endpoint of the OSS bucket.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://oss-cn-hangzhou.aliyuncs.com">http://oss-cn-hangzhou.aliyuncs.com</a></p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The name of the OSS object.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test.sql</p>
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
