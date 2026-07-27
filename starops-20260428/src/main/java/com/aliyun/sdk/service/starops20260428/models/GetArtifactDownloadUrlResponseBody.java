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
         * expire.
         */
        public Builder expire(Long expire) {
            this.expire = expire;
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
         * url.
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
