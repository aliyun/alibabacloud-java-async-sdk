// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link CreateInstanceWebTerminalResponseBody} extends {@link TeaModel}
 *
 * <p>CreateInstanceWebTerminalResponseBody</p>
 */
public class CreateInstanceWebTerminalResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WebTerminalId")
    private String webTerminalId;

    private CreateInstanceWebTerminalResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.webTerminalId = builder.webTerminalId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceWebTerminalResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return webTerminalId
     */
    public String getWebTerminalId() {
        return this.webTerminalId;
    }

    public static final class Builder {
        private String requestId; 
        private String webTerminalId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WebTerminalId.
         */
        public Builder webTerminalId(String webTerminalId) {
            this.webTerminalId = webTerminalId;
            return this;
        }

        public CreateInstanceWebTerminalResponseBody build() {
            return new CreateInstanceWebTerminalResponseBody(this);
        } 

    } 

}
