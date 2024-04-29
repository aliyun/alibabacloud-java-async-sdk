// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportClientEventsResponseBody} extends {@link TeaModel}
 *
 * <p>ExportClientEventsResponseBody</p>
 */
public class ExportClientEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private ExportClientEventsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportClientEventsResponseBody create() {
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
         * The download address from which you can export desktop groups.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public ExportClientEventsResponseBody build() {
            return new ExportClientEventsResponseBody(this);
        } 

    } 

}
