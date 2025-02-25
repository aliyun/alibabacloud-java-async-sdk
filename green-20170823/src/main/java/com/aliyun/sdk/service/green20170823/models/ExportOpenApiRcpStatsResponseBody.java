// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportOpenApiRcpStatsResponseBody} extends {@link TeaModel}
 *
 * <p>ExportOpenApiRcpStatsResponseBody</p>
 */
public class ExportOpenApiRcpStatsResponseBody extends TeaModel {
    @NameInMap("DownloadUrl")
    private String downloadUrl;

    @NameInMap("RequestId")
    private String requestId;

    private ExportOpenApiRcpStatsResponseBody(Builder builder) {
        this.downloadUrl = builder.downloadUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportOpenApiRcpStatsResponseBody create() {
        return builder().build();
    }

    /**
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String downloadUrl; 
        private String requestId; 

        /**
         * DownloadUrl.
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ExportOpenApiRcpStatsResponseBody build() {
            return new ExportOpenApiRcpStatsResponseBody(this);
        } 

    } 

}
