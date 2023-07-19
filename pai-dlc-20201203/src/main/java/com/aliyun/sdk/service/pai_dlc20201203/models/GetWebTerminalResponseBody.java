// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWebTerminalResponseBody} extends {@link TeaModel}
 *
 * <p>GetWebTerminalResponseBody</p>
 */
public class GetWebTerminalResponseBody extends TeaModel {
    @NameInMap("URL")
    private String URL;

    @NameInMap("requestId")
    private String requestId;

    private GetWebTerminalResponseBody(Builder builder) {
        this.URL = builder.URL;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWebTerminalResponseBody create() {
        return builder().build();
    }

    /**
     * @return URL
     */
    public String getURL() {
        return this.URL;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String URL; 
        private String requestId; 

        /**
         * URL.
         */
        public Builder URL(String URL) {
            this.URL = URL;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetWebTerminalResponseBody build() {
            return new GetWebTerminalResponseBody(this);
        } 

    } 

}
