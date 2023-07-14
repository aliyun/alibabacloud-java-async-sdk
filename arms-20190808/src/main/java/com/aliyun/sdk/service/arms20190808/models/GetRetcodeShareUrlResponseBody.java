// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRetcodeShareUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetRetcodeShareUrlResponseBody</p>
 */
public class GetRetcodeShareUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Url")
    private String url;

    private GetRetcodeShareUrlResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRetcodeShareUrlResponseBody create() {
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
         * Queries the logon-free URL of a Browser Monitoring application.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public GetRetcodeShareUrlResponseBody build() {
            return new GetRetcodeShareUrlResponseBody(this);
        } 

    } 

}
