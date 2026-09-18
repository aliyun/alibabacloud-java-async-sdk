// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.codesec20260401.models;

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
 * {@link CreateScanSbomExportResponseBody} extends {@link TeaModel}
 *
 * <p>CreateScanSbomExportResponseBody</p>
 */
public class CreateScanSbomExportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("downloadUrl")
    private String downloadUrl;

    @com.aliyun.core.annotation.NameInMap("fileName")
    private String fileName;

    @com.aliyun.core.annotation.NameInMap("format")
    private String format;

    @com.aliyun.core.annotation.NameInMap("mediaType")
    private String mediaType;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sha256")
    private String sha256;

    @com.aliyun.core.annotation.NameInMap("sizeBytes")
    private Long sizeBytes;

    private CreateScanSbomExportResponseBody(Builder builder) {
        this.downloadUrl = builder.downloadUrl;
        this.fileName = builder.fileName;
        this.format = builder.format;
        this.mediaType = builder.mediaType;
        this.requestId = builder.requestId;
        this.sha256 = builder.sha256;
        this.sizeBytes = builder.sizeBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScanSbomExportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return format
     */
    public String getFormat() {
        return this.format;
    }

    /**
     * @return mediaType
     */
    public String getMediaType() {
        return this.mediaType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sha256
     */
    public String getSha256() {
        return this.sha256;
    }

    /**
     * @return sizeBytes
     */
    public Long getSizeBytes() {
        return this.sizeBytes;
    }

    public static final class Builder {
        private String downloadUrl; 
        private String fileName; 
        private String format; 
        private String mediaType; 
        private String requestId; 
        private String sha256; 
        private Long sizeBytes; 

        private Builder() {
        } 

        private Builder(CreateScanSbomExportResponseBody model) {
            this.downloadUrl = model.downloadUrl;
            this.fileName = model.fileName;
            this.format = model.format;
            this.mediaType = model.mediaType;
            this.requestId = model.requestId;
            this.sha256 = model.sha256;
            this.sizeBytes = model.sizeBytes;
        } 

        /**
         * <p>短时签名的 GET URL（有效期见 <strong><code>url_expires_at</code></strong>），对象上已带 Content-Disposition</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://krypton-codesafe.oss-cn-hangzhou.aliyuncs.com/1609837153086803%2F1000108%2F1000893%2F1001080%2Fartifacts%2Fcyclonedx-json%2F1f8dc54097780e9c32941289d2aff5161df694b5bfb2d0aa3fe87fe72a751363.cdx.json?Expires=1789713461&OSSAccessKeyId=STS.NYDdfgGGhFqA4XBNu2EQebMeV&Signature=pnZPAML9CPKOIDyC4b1DK6gQmhs%3D&response-content-disposition=attachment%3B%20filename%3D%22test-sbom-cyclonedx.cdx.json%22%3B%20filename%2A%3DUTF-8%27%27test-sbom-cyclonedx.cdx.json&security-token=CAIS">https://krypton-codesafe.oss-cn-hangzhou.aliyuncs.com/1609837153086803%2F1000108%2F1000893%2F1001080%2Fartifacts%2Fcyclonedx-json%2F1f8dc54097780e9c32941289d2aff5161df694b5bfb2d0aa3fe87fe72a751363.cdx.json?Expires=1789713461&amp;OSSAccessKeyId=STS.NYDdfgGGhFqA4XBNu2EQebMeV&amp;Signature=pnZPAML9CPKOIDyC4b1DK6gQmhs%3D&amp;response-content-disposition=attachment%3B%20filename%3D%22test-sbom-cyclonedx.cdx.json%22%3B%20filename%2A%3DUTF-8%27%27test-sbom-cyclonedx.cdx.json&amp;security-token=CAIS</a>*</p>
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * <p>最终生效的文件名（客户端指定或后端默认），已签进 <strong><code>download_url</code></strong> 的 <strong><code>Content-Disposition</code></strong>， 浏览器直连下载即按此落盘。</p>
         * 
         * <strong>example:</strong>
         * <p>test-sbom-cyclonedx.cdx.json</p>
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * format.
         */
        public Builder format(String format) {
            this.format = format;
            return this;
        }

        /**
         * <p>交付文件 MIME 类型</p>
         * 
         * <strong>example:</strong>
         * <p>application/vnd.cyclonedx+json</p>
         */
        public Builder mediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>交付文件本身（注入后重算）的摘要，供下载完整性校验；与源制品的 sha256 不同</p>
         * 
         * <strong>example:</strong>
         * <p>1f8dc54097780e9c32941289d2aff5161df694b5bfb2d0aa3fe87fe72a751363</p>
         */
        public Builder sha256(String sha256) {
            this.sha256 = sha256;
            return this;
        }

        /**
         * <p>交付文件字节数</p>
         * 
         * <strong>example:</strong>
         * <p>791355</p>
         */
        public Builder sizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }

        public CreateScanSbomExportResponseBody build() {
            return new CreateScanSbomExportResponseBody(this);
        } 

    } 

}
