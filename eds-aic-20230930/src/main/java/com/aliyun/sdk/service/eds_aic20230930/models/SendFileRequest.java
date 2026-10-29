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
         * <p>The list of instances.</p>
         * <p>This parameter is required.</p>
         */
        public Builder androidInstanceIdList(java.util.List<String> androidInstanceIdList) {
            this.putQueryParameter("AndroidInstanceIdList", androidInstanceIdList);
            this.androidInstanceIdList = androidInstanceIdList;
            return this;
        }

        /**
         * <p>Specifies whether to automatically install the uploaded application.</p>
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
         * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions. The token can be up to 100 characters in length.</p>
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
         * <p>The MD5 value of the input file.</p>
         */
        public Builder fileMd5(String fileMd5) {
            this.putQueryParameter("FileMd5", fileMd5);
            this.fileMd5 = fileMd5;
            return this;
        }

        /**
         * <p>The upload path inside the cloud phone to which the file is uploaded.</p>
         * <blockquote>
         * <p>If UploadType is OSS or OSS_BRIDGED, the upload path SourceFilePath inside the cloud phone must be a directory, such as /sdcard/Download. If UploadType is DOWNLOAD_URL, the upload path SourceFilePath inside the cloud phone must be a file, such as /sdcard/Download/MyFile.txt.</p>
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
         * <p>The name of the file uploaded from OSS to the cloud phone.</p>
         * <blockquote>
         * <p>If UploadType is OSS or OSS_BRIDGED, the TargetFileName parameter is optional. If TargetFileName is empty, the original file name is retained when the OSS file is uploaded to the cloud phone. If TargetFileName is not empty, the file name in the SourceFilePath directory on the cloud phone is set to the value of TargetFileName. If UploadType is DOWNLOAD_URL, the TargetFileName parameter does not take effect.</p>
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
         * <p>The service domain name for uploading files to OSS. This parameter is required when UploadType is set to OSS or OSS_BRIDGED.</p>
         * <blockquote>
         * <p>If the cloud phone and the OSS bucket are in the same region, you can use an internal endpoint to accelerate the transmission speed and avoid Internet traffic fees. For example, the internal endpoint for the China (Hangzhou) region is <code>oss-cn-hangzhou-internal.aliyuncs.com</code>. For more information about the mapping between regions and endpoints, see <a href="https://help.aliyun.com/document_detail/31837.html">Regions and endpoints</a>.</p>
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
         * <p>The storage type of the file to be uploaded.</p>
         * <ul>
         * <li>OSS: The file to be uploaded is an OSS resource.</li>
         * <li>DOWNLOAD_URL: The file to be uploaded is a public download URL.</li>
         * <li>OSS_BRIDGED: The file is synchronized to OSS through a public download URL and then distributed to cloud phone instances over the OSS internal network.</li>
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
         * <li>If UploadType is OSS, UploadUrl is the cloud address of the file uploaded to OSS.<blockquote>
         * <p>The OSS bucket name must start with the prefix &quot;cloudphone-saved-bucket-&quot;, such as &quot;cloudphone-saved-bucket-example&quot;. You must create an OSS folder as the backup directory. The format of UploadUrl is &quot;oss://&quot; + &quot;Bucket name&quot; + &quot;/&quot; + &quot;Folder name&quot; + &quot;Uploaded file name&quot;.</p>
         * </blockquote>
         * </li>
         * <li>If UploadType is DOWNLOAD or OSS_BRIDGED, UploadUrl is the public download URL of the file.</li>
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
