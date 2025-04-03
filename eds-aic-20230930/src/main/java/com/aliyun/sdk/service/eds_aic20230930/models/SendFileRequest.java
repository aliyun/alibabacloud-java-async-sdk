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
            this.sourceFilePath = request.sourceFilePath;
            this.targetFileName = request.targetFileName;
            this.uploadEndpoint = request.uploadEndpoint;
            this.uploadType = request.uploadType;
            this.uploadUrl = request.uploadUrl;
        } 

        /**
         * <p>The IDs of the cloud phone instances.</p>
         * <p>This parameter is required.</p>
         */
        public Builder androidInstanceIdList(java.util.List<String> androidInstanceIdList) {
            this.putQueryParameter("AndroidInstanceIdList", androidInstanceIdList);
            this.androidInstanceIdList = androidInstanceIdList;
            return this;
        }

        /**
         * <p>The path to which you want to upload the pushed file in the cloud phone instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/data</p>
         */
        public Builder sourceFilePath(String sourceFilePath) {
            this.putQueryParameter("SourceFilePath", sourceFilePath);
            this.sourceFilePath = sourceFilePath;
            return this;
        }

        /**
         * <p>The name of the file uploaded from the Object Storage Service (OSS) to the cloud phone instance.</p>
         * <blockquote>
         * <p> If UploadType is set to OSS, you must specify TargetFileName. If TargetFileName is empty, the file uploaded from the OSS bucket to the cloud phone instance retains its original name. If TargetFileName is provided with a value, the uploaded file in the SourceFilePath directory uses the specified name (TargetFileName). If UploadType is set to DOWNLOAD_URL, TargetFileName does not take effect.</p>
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
         * <p>The endpoint of the OSS bucket in which the file is stored.</p>
         * <blockquote>
         * <p> Set the value to an internal endpoint when the cloud phone instance and the OSS bucket are in the same region to improve transfer speed without incurring public traffic fees. Sample endpoint: <code>oss-cn-hangzhou-internal.aliyuncs.com</code>. For more information, see <a href="https://help.aliyun.com/document_detail/31837.html">OSS regions and endpoints</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-hangzhou.aliyuncs.com</p>
         */
        public Builder uploadEndpoint(String uploadEndpoint) {
            this.putQueryParameter("UploadEndpoint", uploadEndpoint);
            this.uploadEndpoint = uploadEndpoint;
            return this;
        }

        /**
         * <p>The storage type of the file that you want to upload.</p>
         * <ul>
         * <li>Set the value to OSS.</li>
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
         * <p>The OSS URL of the file.</p>
         * <blockquote>
         * <p> The OSS bucket name must start with &quot;cloudphone-saved-bucket-&quot;, for example, &quot;cloudphone-saved-bucket-example&quot;. You must also create an OSS directory to store the backup data. Set the value for UploadUrl in this format: oss://&lt;BucketName&gt;/&lt;OSSDirectoryName&gt;&lt;FileName&gt;.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
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
