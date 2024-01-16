// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DebugPlaybookResponseBody} extends {@link TeaModel}
 *
 * <p>DebugPlaybookResponseBody</p>
 */
public class DebugPlaybookResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RequestUuid")
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The UUID of the debugging task. You can use the UUID to query the result and other details of the debugging task.
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
