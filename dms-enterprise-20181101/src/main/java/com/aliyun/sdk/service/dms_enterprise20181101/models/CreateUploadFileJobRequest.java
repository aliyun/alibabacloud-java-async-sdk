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
 * {@link CreateUploadFileJobRequest} extends {@link RequestModel}
 *
 * <p>CreateUploadFileJobRequest</p>
 */
public class CreateUploadFileJobRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("UploadURL")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uploadURL;

    private CreateUploadFileJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.fileName = builder.fileName;
        this.fileSource = builder.fileSource;
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
     * @return uploadURL
     */
    public String getUploadURL() {
        return this.uploadURL;
    }

    public static final class Builder extends Request.Builder<CreateUploadFileJobRequest, Builder> {
        private String regionId; 
        private String fileName; 
        private String fileSource; 
        private Long tid; 
        private String uploadURL; 

        private Builder() {
            super();
        } 

        private Builder(CreateUploadFileJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.fileName = request.fileName;
            this.fileSource = request.fileSource;
            this.tid = request.tid;
            this.uploadURL = request.uploadURL;
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
         * <p>The name of the attachment file.</p>
         * <blockquote>
         * <p> The file name must end with .txt or .sql. For example, the file name can be test.txt or test.sql.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test.txt</p>
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The purpose of the attachment file. Valid values:</p>
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
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> operation to query the tenant ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * <p>The URL of the attachment file. The URL must be an HTTP URL or an HTTPS URL.</p>
         * <blockquote>
         * <p> You can upload the attachment file to an Object Storage Service (OSS) bucket and obtain the URL of the file in the OSS console. For more information, see <a href="https://help.aliyun.com/document_detail/195674.html">Share objects</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://XXX.oss-cn-hangzhou.aliyuncs.com/test.txt">https://XXX.oss-cn-hangzhou.aliyuncs.com/test.txt</a></p>
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
