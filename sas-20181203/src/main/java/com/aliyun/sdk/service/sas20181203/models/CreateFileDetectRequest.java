// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFileDetectRequest} extends {@link RequestModel}
 *
 * <p>CreateFileDetectRequest</p>
 */
public class CreateFileDetectRequest extends Request {
    @Query
    @NameInMap("Decompress")
    private Boolean decompress;

    @Query
    @NameInMap("DecompressMaxFileCount")
    private Integer decompressMaxFileCount;

    @Query
    @NameInMap("DecompressMaxLayer")
    private Integer decompressMaxLayer;

    @Query
    @NameInMap("DownloadUrl")
    private String downloadUrl;

    @Query
    @NameInMap("HashKey")
    @Validation(required = true)
    private String hashKey;

    @Query
    @NameInMap("OssKey")
    private String ossKey;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
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
         * Decompress.
         */
        public Builder decompress(Boolean decompress) {
            this.putQueryParameter("Decompress", decompress);
            this.decompress = decompress;
            return this;
        }

        /**
         * DecompressMaxFileCount.
         */
        public Builder decompressMaxFileCount(Integer decompressMaxFileCount) {
            this.putQueryParameter("DecompressMaxFileCount", decompressMaxFileCount);
            this.decompressMaxFileCount = decompressMaxFileCount;
            return this;
        }

        /**
         * DecompressMaxLayer.
         */
        public Builder decompressMaxLayer(Integer decompressMaxLayer) {
            this.putQueryParameter("DecompressMaxLayer", decompressMaxLayer);
            this.decompressMaxLayer = decompressMaxLayer;
            return this;
        }

        /**
         * The URL that is used to download the file. You can specify this parameter to trigger file detection without the need to upload the file in advance.
         */
        public Builder downloadUrl(String downloadUrl) {
            this.putQueryParameter("DownloadUrl", downloadUrl);
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * The identifier of the file. Only MD5 hash values are supported.
         */
        public Builder hashKey(String hashKey) {
            this.putQueryParameter("HashKey", hashKey);
            this.hashKey = hashKey;
            return this;
        }

        /**
         * The key of the file that is stored in the Object Storage Service (OSS) bucket. If you specify the DownloadUrl parameter, you can leave this parameter empty. You can call the [CreateFileDetectUploadUrl](~~CreateFileDetectUploadUrl~~) operation to query the keys of files.
         */
        public Builder ossKey(String ossKey) {
            this.putQueryParameter("OssKey", ossKey);
            this.ossKey = ossKey;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The type of the file. Valid values:
         * <p>
         * 
         * *   **0**: unknown files
         * *   **1**: binary files
         * *   **2**: webshell files
         * *   **4**: script files
         * 
         * >  If you do not know the type of the file, set this parameter to 0.
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
