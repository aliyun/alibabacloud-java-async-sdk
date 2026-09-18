// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ada20260701.models;

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
 * {@link GetTransitMetaResponseBody} extends {@link TeaModel}
 *
 * <p>GetTransitMetaResponseBody</p>
 */
public class GetTransitMetaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DownloadUrl")
    private String downloadUrl;

    @com.aliyun.core.annotation.NameInMap("ExpireAt")
    private Long expireAt;

    @com.aliyun.core.annotation.NameInMap("FilePath")
    private String filePath;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Size")
    private Long size;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TransitId")
    private String transitId;

    private GetTransitMetaResponseBody(Builder builder) {
        this.downloadUrl = builder.downloadUrl;
        this.expireAt = builder.expireAt;
        this.filePath = builder.filePath;
        this.requestId = builder.requestId;
        this.size = builder.size;
        this.status = builder.status;
        this.transitId = builder.transitId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTransitMetaResponseBody create() {
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
     * @return expireAt
     */
    public Long getExpireAt() {
        return this.expireAt;
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return transitId
     */
    public String getTransitId() {
        return this.transitId;
    }

    public static final class Builder {
        private String downloadUrl; 
        private Long expireAt; 
        private String filePath; 
        private String requestId; 
        private Long size; 
        private String status; 
        private String transitId; 

        private Builder() {
        } 

        private Builder(GetTransitMetaResponseBody model) {
            this.downloadUrl = model.downloadUrl;
            this.expireAt = model.expireAt;
            this.filePath = model.filePath;
            this.requestId = model.requestId;
            this.size = model.size;
            this.status = model.status;
            this.transitId = model.transitId;
        } 

        /**
         * <p>The temporary download URL. If <code>Network</code> is not specified, <code>null</code> is returned. If the file is not yet available, the URL may not be accessible. Do not write this URL to logs, persist it for long-term use, or share it with unauthorized users.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://download.example.invalid/code-review.zip?signature=">https://download.example.invalid/code-review.zip?signature=</a><REDACTED></p>
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * <p>The expiration time of the Transit record, expressed as a UTC UNIX timestamp in milliseconds (the number of milliseconds elapsed since 1970-01-01 00:00:00 UTC). You can compare this value directly with the current UNIX timestamp in milliseconds without adding or subtracting 8 hours. Do not use the record after this time.</p>
         * 
         * <strong>example:</strong>
         * <p>1787734800000</p>
         */
        public Builder expireAt(Long expireAt) {
            this.expireAt = expireAt;
            return this;
        }

        /**
         * <p>The opaque object path of the file. Do not parse or manually construct this value.</p>
         * 
         * <strong>example:</strong>
         * <p>skill-bundle/tenant-demo/user-demo/20260904120000_code-review.zip</p>
         */
        public Builder filePath(String filePath) {
            this.filePath = filePath;
            return this;
        }

        /**
         * <p>The request ID, which is used for Tracing Analysis and troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>0A1B2C3D-4E5F-6789-ABCD-EF0123456789</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The file size in bytes. <code>null</code> may be returned if no available file has been detected.</p>
         * 
         * <strong>example:</strong>
         * <p>4096</p>
         */
        public Builder size(Long size) {
            this.size = size;
            return this;
        }

        /**
         * <p>The Transit file status. Valid values:</p>
         * <ul>
         * <li>PENDING: The file is not yet available. You can query again later.</li>
         * <li>SUCCESS: The file is available.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Transit ID。</p>
         * 
         * <strong>example:</strong>
         * <p>transit_0123456789abcdef0123456789abcdef</p>
         */
        public Builder transitId(String transitId) {
            this.transitId = transitId;
            return this;
        }

        public GetTransitMetaResponseBody build() {
            return new GetTransitMetaResponseBody(this);
        } 

    } 

}
