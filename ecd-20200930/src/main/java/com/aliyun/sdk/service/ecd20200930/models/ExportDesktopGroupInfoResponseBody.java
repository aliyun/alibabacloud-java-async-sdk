// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportDesktopGroupInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ExportDesktopGroupInfoResponseBody</p>
 */
public class ExportDesktopGroupInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Url")
    private String url;

    private ExportDesktopGroupInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportDesktopGroupInfoResponseBody create() {
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
         * The download URL of the exported file that contains the monitoring data of sessions in the desktop group.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public ExportDesktopGroupInfoResponseBody build() {
            return new ExportDesktopGroupInfoResponseBody(this);
        } 

    } 

}
