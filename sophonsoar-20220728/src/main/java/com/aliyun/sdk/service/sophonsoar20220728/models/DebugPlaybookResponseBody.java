// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DebugPlaybookResponseBody} extends {@link TeaModel}
 *
 * <p>DebugPlaybookResponseBody</p>
 */
public class DebugPlaybookResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RequestUuid")
    private String requestUuid;

    private DebugPlaybookResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.requestUuid = builder.requestUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DebugPlaybookResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return requestUuid
     */
    public String getRequestUuid() {
        return this.requestUuid;
    }

    public static final class Builder {
        private String requestId; 
        private String requestUuid; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>75E56B2C-C8FA-5A2F-AA08-8745E2AC33EF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The UUID of the debugging task. You can use the UUID to query the result and other details of the debugging task.</p>
         * 
         * <strong>example:</strong>
         * <p>6d412cfa-0905-4567-8a83-xxxxxx</p>
         */
        public Builder requestUuid(String requestUuid) {
            this.requestUuid = requestUuid;
            return this;
        }

        public DebugPlaybookResponseBody build() {
            return new DebugPlaybookResponseBody(this);
        } 

    } 

}
