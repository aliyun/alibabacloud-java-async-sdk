// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link SendFileRequest} extends {@link RequestModel}
 *
 * <p>SendFileRequest</p>
 */
public class SendFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidInstanceIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> androidInstanceIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoInstall")
    private Boolean autoInstall;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileMd5")
    private String fileMd5;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceFilePath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceFilePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetFileName")
    private String targetFileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadEndpoint")
    private String uploadEndpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uploadType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uploadUrl;

    private SendFileRequest(Builder builder) {
        super(builder);
        this.androidInstanceIdList = builder.androidInstanceIdList;
        this.autoInstall = builder.autoInstall;
        this.clientToken = builder.clientToken;
        this.fileMd5 = builder.fileMd5;
        this.sourceFilePath = builder.sourceFilePath;
        this.targetFileName = builder.targetFileName;
        this.uploadEndpoint = builder.uploadEndpoint;
        this.uploadType = builder.uploadType;
        this.uploadUrl = builder.uploadUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendFileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return androidInstanceIdList
     */
    public java.util.List<String> getAndroidInstanceIdList() {
        return this.androidInstanceIdList;
    }

    /**
     * @return autoInstall
     */
    public Boolean getAutoInstall() {
        return this.autoInstall;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return fileMd5
     */
    public String getFileMd5() {
        return this.fileMd5;
    }

    /**
     * @return sourceFilePath
     */
    public String getSourceFilePath() {
        return this.sourceFilePath;
    }

    /**
     * @return targetFileName
     */
    public String getTargetFileName() {
        return this.targetFileName;
    }

    /**
     * @return uploadEndpoint
     */
    public String getUploadEndpoint() {
        return this.uploadEndpoint;
    }

    /**
     * @return uploadType
     */
    public String getUploadType() {
        return this.uploadType;
    }

    /**
     * @return uploadUrl
     */
    public String getUploadUrl() {
        return this.uploadUrl;
    }

    public static final class Builder extends Request.Builder<SendFileRequest, Builder> {
        private java.util.List<String> androidInstanceIdList; 
        private Boolean autoInstall; 
        private String clientToken; 
        private String fileMd5; 
        private String sourceFilePath; 
        private String targetFileName; 
        private String uploadEndpoint; 
        private String uploadType; 
        private String uploadUrl; 

        private Builder() {
            super();
        } 

        private Builder(SendFileRequest request) {
            super(request);
            this.androidInstanceIdList = request.androidInstanceIdList;
            this.autoInstall = request.autoInstall;
            this.clientToken = request.clientToken;
            this.fileMd5 = request.fileMd5;
            this.sourceFilePath = request.sourceFilePath;
            this.targetFileName = request.targetFileName;
            this.uploadEndpoint = request.uploadEndpoint;
            this.uploadType = request.uploadType;
            this.uploadUrl = request.uploadUrl;
        } 

        /**
         * <p>The IDs of one or more cloud phone instances.</p>
         * <p>This parameter is required.</p>
         */
        public Builder androidInstanceIdList(java.util.List<String> androidInstanceIdList) {
            this.putQueryParameter("AndroidInstanceIdList", androidInstanceIdList);
            this.androidInstanceIdList = androidInstanceIdList;
            return this;
        }

        /**
         * <p>Specifies whether to automatically install the application after the file is uploaded.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoInstall(Boolean autoInstall) {
            this.putQueryParameter("AutoInstall", autoInstall);
            this.autoInstall = autoInstall;
            return this;
        }

        /**
         * <p>A client-generated token that ensures request idempotence and prevents duplicate submissions. The token can contain up to 100 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>425F351C-3F8E-5218-A520-B6311D0D****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * FileMd5.
         */
        public Builder fileMd5(String fileMd5) {
            this.putQueryParameter("FileMd5", fileMd5);
            this.fileMd5 = fileMd5;
            return this;
        }

        /**
         * <p>The destination path on the cloud phone.</p>
         * <blockquote>
         * <p>If <code>UploadType</code> is <code>OSS</code> or <code>OSS_BRIDGED</code>, <code>SourceFilePath</code> must specify a directory, for example, <code>/sdcard/Download/</code>. If <code>UploadType</code> is <code>DOWNLOAD_URL</code>, <code>SourceFilePath</code> must specify a full file path, for example, <code>/sdcard/Download/MyFile.txt</code>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/sdcard/Download</p>
         */
        public Builder sourceFilePath(String sourceFilePath) {
            this.putQueryParameter("SourceFilePath", sourceFilePath);
            this.sourceFilePath = sourceFilePath;
            return this;
        }

        /**
         * <p>The name for the destination file on the cloud phone.</p>
         * <blockquote>
         * <p>This parameter is optional and takes effect only when <code>UploadType</code> is set to <code>OSS</code> or <code>OSS_BRIDGED</code>. If you specify this parameter, the file is saved with this name in the path specified by <code>SourceFilePath</code>. If you leave this parameter empty, the source file name is used. This parameter is ignored when <code>UploadType</code> is set to <code>DOWNLOAD_URL</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test.txt</p>
         */
        public Builder targetFileName(String targetFileName) {
            this.putQueryParameter("TargetFileName", targetFileName);
            this.targetFileName = targetFileName;
            return this;
        }

        /**
         * <p>The service endpoint of Object Storage Service (OSS). This parameter is required if <code>UploadType</code> is <code>OSS</code> or <code>OSS_BRIDGED</code>.</p>
         * <blockquote>
         * <p>If the cloud phone instance and the OSS bucket are in the same region, you can specify an internal endpoint to accelerate data transfer and avoid public data transfer costs. For example, the internal endpoint for the China (Hangzhou) region is <code>oss-cn-hangzhou-internal.aliyuncs.com</code>. For a complete list of endpoints, see <a href="https://help.aliyun.com/document_detail/31837.html">OSS regions and endpoints</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-hangzhou-internal.aliyuncs.com</p>
         */
        public Builder uploadEndpoint(String uploadEndpoint) {
            this.putQueryParameter("UploadEndpoint", uploadEndpoint);
            this.uploadEndpoint = uploadEndpoint;
            return this;
        }

        /**
         * <p>The storage type of the source file. Valid values:</p>
         * <ul>
         * <li><p><strong>OSS</strong>: The file is stored in Object Storage Service (OSS).</p>
         * </li>
         * <li><p><strong>DOWNLOAD_URL</strong>: The file is accessible via a public download link.</p>
         * </li>
         * <li><p><strong>OSS_BRIDGED</strong>: The service first downloads the file from a public download link to an internal OSS bucket, and then distributes it to the cloud phone instances over the internal network.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        public Builder uploadType(String uploadType) {
            this.putQueryParameter("UploadType", uploadType);
            this.uploadType = uploadType;
            return this;
        }

        /**
         * <ul>
         * <li>If <code>UploadType</code> is <code>OSS</code>, this parameter specifies the URI of the source object in Object Storage Service (OSS).</li>
         * </ul>
         * <blockquote>
         * <p>The URI must be in the <code>oss://&lt;bucket-name&gt;/&lt;object-key&gt;</code> format. The specified OSS bucket name must have the <code>cloudphone-saved-bucket-</code> prefix, for example, <code>cloudphone-saved-bucket-example</code>.</p>
         * </blockquote>
         * <ul>
         * <li>If <code>UploadType</code> is <code>DOWNLOAD_URL</code> or <code>OSS_BRIDGED</code>, this parameter specifies the public download link of the source file.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://cloudphone-saved-bucket-example/send/a.txt</p>
         */
        public Builder uploadUrl(String uploadUrl) {
            this.putQueryParameter("UploadUrl", uploadUrl);
            this.uploadUrl = uploadUrl;
            return this;
        }

        @Override
        public SendFileRequest build() {
            return new SendFileRequest(this);
        } 

    } 

}
