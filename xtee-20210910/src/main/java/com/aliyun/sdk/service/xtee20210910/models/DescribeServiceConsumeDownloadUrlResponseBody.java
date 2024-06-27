// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceConsumeDownloadUrlResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceConsumeDownloadUrlResponseBody</p>
 */
public class DescribeServiceConsumeDownloadUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("downloadFileUrl")
    private String downloadFileUrl;

    private DescribeServiceConsumeDownloadUrlResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.downloadFileUrl = builder.downloadFileUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceConsumeDownloadUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return downloadFileUrl
     */
    public String getDownloadFileUrl() {
        return this.downloadFileUrl;
    }

    public static final class Builder {
        private String requestId; 
        private String downloadFileUrl; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * downloadFileUrl.
         */
        public Builder downloadFileUrl(String downloadFileUrl) {
            this.downloadFileUrl = downloadFileUrl;
            return this;
        }

        public DescribeServiceConsumeDownloadUrlResponseBody build() {
            return new DescribeServiceConsumeDownloadUrlResponseBody(this);
        } 

    } 

}
