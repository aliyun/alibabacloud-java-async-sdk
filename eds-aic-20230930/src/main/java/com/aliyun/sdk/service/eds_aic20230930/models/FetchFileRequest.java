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
 * {@link FetchFileRequest} extends {@link RequestModel}
 *
 * <p>FetchFileRequest</p>
 */
public class FetchFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidInstanceIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> androidInstanceIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceFilePath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceFilePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadEndpoint")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uploadEndpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uploadType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uploadUrl;

    private FetchFileRequest(Builder builder) {
        super(builder);
        this.androidInstanceIdList = builder.androidInstanceIdList;
        this.clientToken = builder.clientToken;
        this.sourceFilePath = builder.sourceFilePath;
        this.uploadEndpoint = builder.uploadEndpoint;
        this.uploadType = builder.uploadType;
        this.uploadUrl = builder.uploadUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FetchFileRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return sourceFilePath
     */
    public String getSourceFilePath() {
        return this.sourceFilePath;
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

    public static final class Builder extends Request.Builder<FetchFileRequest, Builder> {
        private java.util.List<String> androidInstanceIdList; 
        private String clientToken; 
        private String sourceFilePath; 
        private String uploadEndpoint; 
        private String uploadType; 
        private String uploadUrl; 

        private Builder() {
            super();
        } 

        private Builder(FetchFileRequest request) {
            super(request);
            this.androidInstanceIdList = request.androidInstanceIdList;
            this.clientToken = request.clientToken;
            this.sourceFilePath = request.sourceFilePath;
            this.uploadEndpoint = request.uploadEndpoint;
            this.uploadType = request.uploadType;
            this.uploadUrl = request.uploadUrl;
        } 

        /**
         * <p>A list of cloud phone instance IDs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder androidInstanceIdList(java.util.List<String> androidInstanceIdList) {
            this.putQueryParameter("AndroidInstanceIdList", androidInstanceIdList);
            this.androidInstanceIdList = androidInstanceIdList;
            return this;
        }

        /**
         * <p>A client-generated token, up to 100 characters long, that ensures the idempotency of the request.</p>
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
         * <p>The path of the file or folder to fetch from the cloud phone.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/data/a.txt</p>
         */
        public Builder sourceFilePath(String sourceFilePath) {
            this.putQueryParameter("SourceFilePath", sourceFilePath);
            this.sourceFilePath = sourceFilePath;
            return this;
        }

        /**
         * <p>The endpoint for uploading files to OSS.</p>
         * <blockquote>
         * <p>If the cloud phone and the destination OSS bucket are in the same region, you can use an internal endpoint to accelerate the transfer and avoid public network charges. For example, in the China (Hangzhou) region, use <code>oss-cn-hangzhou-internal.aliyuncs.com</code>. For a complete list of endpoints, see <a href="https://help.aliyun.com/document_detail/31837.html">OSS regions and endpoints</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
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
         * <p>The type of storage service for the fetched file.</p>
         * <blockquote>
         * <p>Currently, only Object Storage Service (OSS) is supported.</p>
         * </blockquote>
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
         * <p>The destination URL in OSS.</p>
         * <blockquote>
         * <p>The destination bucket name must be prefixed with <code>cloudphone-saved-bucket-</code>. For example, <code>cloudphone-saved-bucket-example</code>. You must also create a folder in the bucket to serve as the destination directory. The <code>UploadUrl</code> must follow the format: <code>oss://&lt;bucket_name&gt;/&lt;folder_name&gt;</code>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://cloudphone-saved-bucket-example/received</p>
         */
        public Builder uploadUrl(String uploadUrl) {
            this.putQueryParameter("UploadUrl", uploadUrl);
            this.uploadUrl = uploadUrl;
            return this;
        }

        @Override
        public FetchFileRequest build() {
            return new FetchFileRequest(this);
        } 

    } 

}
