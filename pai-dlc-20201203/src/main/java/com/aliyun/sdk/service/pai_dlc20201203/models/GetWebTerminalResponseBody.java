// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link GetWebTerminalResponseBody} extends {@link TeaModel}
 *
 * <p>GetWebTerminalResponseBody</p>
 */
public class GetWebTerminalResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WebTerminalUrl")
    private String webTerminalUrl;

    private GetWebTerminalResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.webTerminalUrl = builder.webTerminalUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWebTerminalResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return webTerminalUrl
     */
    public String getWebTerminalUrl() {
        return this.webTerminalUrl;
    }

    public static final class Builder {
        private String requestId; 
        private String webTerminalUrl; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WebTerminalUrl.
         */
        public Builder webTerminalUrl(String webTerminalUrl) {
            this.webTerminalUrl = webTerminalUrl;
            return this;
        }

        public GetWebTerminalResponseBody build() {
            return new GetWebTerminalResponseBody(this);
        } 

    } 

}
