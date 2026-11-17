// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ClearAgentInstanceMemoryResponseBody} extends {@link TeaModel}
 *
 * <p>ClearAgentInstanceMemoryResponseBody</p>
 */
public class ClearAgentInstanceMemoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ClearAgentInstanceMemoryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClearAgentInstanceMemoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(ClearAgentInstanceMemoryResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The unique ID of the request, which can be used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>01A1CEEB-CDFF-18F9-B2BF-9997600D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ClearAgentInstanceMemoryResponseBody build() {
            return new ClearAgentInstanceMemoryResponseBody(this);
        } 

    } 

}
