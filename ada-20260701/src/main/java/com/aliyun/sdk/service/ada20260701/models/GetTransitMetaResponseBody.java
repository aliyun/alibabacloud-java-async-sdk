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
         * <p>The temporary download URL. If Network is not specified, null is returned. The URL may be unavailable if the file is not yet available. Do not write this URL to logs, store it for a long time, or forward it to irrelevant users.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://download.example.invalid/code-review.zip?signature=">https://download.example.invalid/code-review.zip?signature=</a><REDACTED></p>
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * <p>The expiration time of the transit record. The value is a UTC UNIX timestamp in milliseconds, which is the number of milliseconds that have elapsed since 00:00:00 UTC on January 1, 1970. You can directly compare this value with the current UNIX timestamp in milliseconds without adding or subtracting 8 hours. Do not continue to use the record after this time.</p>
         * 
         * <strong>example:</strong>
         * <p>1787734800000</p>
         */
        public Builder expireAt(Long expireAt) {
            this.expireAt = expireAt;
            return this;
        }

        /**
         * <p>The opaque object path corresponding to the file. Callers must not parse or construct this value.</p>
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
         * <p>The file size, in bytes. If no available file is detected, null may be returned.</p>
         * 
         * <strong>example:</strong>
         * <p>4096</p>
         */
        public Builder size(Long size) {
            this.size = size;
            return this;
        }

        /**
         * <p>The status of the transit file. A value of PENDING indicates that the file is not yet available, and the caller can query again later. A value of SUCCESS indicates that the file is available.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The transit ID.</p>
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
