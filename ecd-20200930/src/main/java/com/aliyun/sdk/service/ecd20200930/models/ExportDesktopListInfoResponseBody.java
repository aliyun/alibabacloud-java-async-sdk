// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportDesktopListInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ExportDesktopListInfoResponseBody</p>
 */
public class ExportDesktopListInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private ExportDesktopListInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportDesktopListInfoResponseBody create() {
        return builder().build();
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
        private String requestId; 
        private String url; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The URL of the exported file of the cloud computer list.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public ExportDesktopListInfoResponseBody build() {
            return new ExportDesktopListInfoResponseBody(this);
        } 

    } 

}
