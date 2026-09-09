// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starops20260428.models;

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
 * {@link GetArtifactDownloadUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetArtifactDownloadUrlResponseBody</p>
 */
public class GetArtifactDownloadUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("expire")
    private Long expire;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("url")
    private String url;

    private GetArtifactDownloadUrlResponseBody(Builder builder) {
        this.expire = builder.expire;
        this.requestId = builder.requestId;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetArtifactDownloadUrlResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expire
     */
    public Long getExpire() {
        return this.expire;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private Long expire; 
        private String requestId; 
        private String url; 

        private Builder() {
        } 

        private Builder(GetArtifactDownloadUrlResponseBody model) {
            this.expire = model.expire;
            this.requestId = model.requestId;
            this.url = model.url;
        } 

        /**
         * <p>The expiration time of the download URL. This value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1770000000</p>
         */
        public Builder expire(Long expire) {
            this.expire = expire;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0A1B2C3D-4E5F-6789-ABCD-1234567890AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The temporary download URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example-bucket.oss-cn-shanghai.aliyuncs.com/agents/123/sample-agent/home/starops/reports/summary.pdf?response-content-disposition=attachment&Expires=1770000000&OSSAccessKeyId=LTAI******&Signature=">https://example-bucket.oss-cn-shanghai.aliyuncs.com/agents/123/sample-agent/home/starops/reports/summary.pdf?response-content-disposition=attachment&amp;Expires=1770000000&amp;OSSAccessKeyId=LTAI******&amp;Signature=</a>******</p>
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public GetArtifactDownloadUrlResponseBody build() {
            return new GetArtifactDownloadUrlResponseBody(this);
        } 

    } 

}
