// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link CreateFileDetectRequest} extends {@link RequestModel}
 *
 * <p>CreateFileDetectRequest</p>
 */
public class CreateFileDetectRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Decompress")
    private Boolean decompress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DecompressMaxFileCount")
    private Integer decompressMaxFileCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DecompressMaxLayer")
    private Integer decompressMaxLayer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DownloadUrl")
    private String downloadUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HashKey")
    private String hashKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssKey")
    private String ossKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer type;

    private CreateFileDetectRequest(Builder builder) {
        super(builder);
        this.decompress = builder.decompress;
        this.decompressMaxFileCount = builder.decompressMaxFileCount;
        this.decompressMaxLayer = builder.decompressMaxLayer;
        this.downloadUrl = builder.downloadUrl;
        this.hashKey = builder.hashKey;
        this.ossKey = builder.ossKey;
        this.sourceIp = builder.sourceIp;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFileDetectRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return decompress
     */
    public Boolean getDecompress() {
        return this.decompress;
    }

    /**
     * @return decompressMaxFileCount
     */
    public Integer getDecompressMaxFileCount() {
        return this.decompressMaxFileCount;
    }

    /**
     * @return decompressMaxLayer
     */
    public Integer getDecompressMaxLayer() {
        return this.decompressMaxLayer;
    }

    /**
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * @return hashKey
     */
    public String getHashKey() {
        return this.hashKey;
    }

    /**
     * @return ossKey
     */
    public String getOssKey() {
        return this.ossKey;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateFileDetectRequest, Builder> {
        private Boolean decompress; 
        private Integer decompressMaxFileCount; 
        private Integer decompressMaxLayer; 
        private String downloadUrl; 
        private String hashKey; 
        private String ossKey; 
        private String sourceIp; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(CreateFileDetectRequest request) {
            super(request);
            this.decompress = request.decompress;
            this.decompressMaxFileCount = request.decompressMaxFileCount;
            this.decompressMaxLayer = request.decompressMaxLayer;
            this.downloadUrl = request.downloadUrl;
            this.hashKey = request.hashKey;
            this.ossKey = request.ossKey;
            this.sourceIp = request.sourceIp;
            this.type = request.type;
        } 

        /**
         * <p>Specifies whether to identify and decompress compressed files. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder decompress(Boolean decompress) {
            this.putQueryParameter("Decompress", decompress);
            this.decompress = decompress;
            return this;
        }

        /**
         * <p>The maximum number of files to decompress. Maximum value: 1000.</p>
         * <p>This parameter is required if Decompress is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder decompressMaxFileCount(Integer decompressMaxFileCount) {
            this.putQueryParameter("DecompressMaxFileCount", decompressMaxFileCount);
            this.decompressMaxFileCount = decompressMaxFileCount;
            return this;
        }

        /**
         * <p>The maximum number of decompression layers when compressed files are nested within a compressed package. Maximum value: 5.</p>
         * <p>This parameter is required if Decompress is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder decompressMaxLayer(Integer decompressMaxLayer) {
            this.putQueryParameter("DecompressMaxLayer", decompressMaxLayer);
            this.decompressMaxLayer = decompressMaxLayer;
            return this;
        }

        /**
         * <p>The download URL of the file. You can pass in a file download URL (public URL) to directly trigger file detection without uploading the file in advance.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxxxxxx.oss-cn-hangzhou-1.aliyuncs.com/xxxxx/xxxxxxxxxxxxxx?Expires=1671448125&OSSAccessKeyId=xxx">https://xxxxxxxx.oss-cn-hangzhou-1.aliyuncs.com/xxxxx/xxxxxxxxxxxxxx?Expires=1671448125&amp;OSSAccessKeyId=xxx</a></p>
         */
        public Builder downloadUrl(String downloadUrl) {
            this.putQueryParameter("DownloadUrl", downloadUrl);
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * <p>The unique identifier of the file. This parameter is required and must be the MD5 or SHA-256 hash of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>0a212417e65c26ff133cfff28f6c****</p>
         */
        public Builder hashKey(String hashKey) {
            this.putQueryParameter("HashKey", hashKey);
            this.hashKey = hashKey;
            return this;
        }

        /**
         * <p>The storage key of the file in the OSS bucket.</p>
         * <p>If you push the file for detection by using DownloadUrl, this parameter is optional. You can obtain this parameter by calling the <a href="~~CreateFileDetectUploadUrl~~">CreateFileDetectUploadUrl</a> operation.</p>
         * <p>Note: If Type is set to 0 and DownloadUrl is not provided, this parameter is required and must be obtained by calling the CreateFileDetectUploadUrl operation.</p>
         * 
         * <strong>example:</strong>
         * <p>1/2022/06/23/15/41/16559701077444693a0c6-33b2-4cc2-a99f-9f38b8b8****</p>
         */
        public Builder ossKey(String ossKey) {
            this.putQueryParameter("OssKey", ossKey);
            this.ossKey = ossKey;
            return this;
        }

        /**
         * <p>The IP address of the access source.</p>
         * 
         * <strong>example:</strong>
         * <p>115.213.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The type of the file to be detected. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: malicious file detection</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateFileDetectRequest build() {
            return new CreateFileDetectRequest(this);
        } 

    } 

}
