// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetFailFileResponseBody} extends {@link TeaModel}
 *
 * <p>GetFailFileResponseBody</p>
 */
public class GetFailFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DownloadLink")
    private String downloadLink;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetFailFileResponseBody(Builder builder) {
        this.downloadLink = builder.downloadLink;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFailFileResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return downloadLink
     */
    public String getDownloadLink() {
        return this.downloadLink;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String downloadLink; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetFailFileResponseBody model) {
            this.downloadLink = model.downloadLink;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The download link of the failed file.</p>
         * 
         * <strong>example:</strong>
         * <p>https://<strong><strong>.oss-cn-shenzhen.aliyuncs.com/fail-1593805857882113?Expires=1708659191&amp;OSSAccessKeyId=</strong></strong><strong><strong><strong>&amp;Signature=</strong></strong></strong>****</p>
         */
        public Builder downloadLink(String downloadLink) {
            this.downloadLink = downloadLink;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFailFileResponseBody build() {
            return new GetFailFileResponseBody(this);
        } 

    } 

}
