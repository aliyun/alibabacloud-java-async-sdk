// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsTraceQueryByMsgIdResponseBody} extends {@link TeaModel}
 *
 * <p>OnsTraceQueryByMsgIdResponseBody</p>
 */
public class OnsTraceQueryByMsgIdResponseBody extends TeaModel {
    @NameInMap("QueryId")
    private String queryId;

    @NameInMap("RequestId")
    private String requestId;

    private OnsTraceQueryByMsgIdResponseBody(Builder builder) {
        this.queryId = builder.queryId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsTraceQueryByMsgIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return queryId
     */
    public String getQueryId() {
        return this.queryId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String queryId; 
        private String requestId; 

        /**
         * The ID of the query task. You can call the [OnsTraceGetResult](~~59832~~) operation to query the details of the message trace based on the task ID.
         */
        public Builder queryId(String queryId) {
            this.queryId = queryId;
            return this;
        }

        /**
         * The ID of the request. The system generates a unique ID for each request. You can troubleshoot issues based on the request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OnsTraceQueryByMsgIdResponseBody build() {
            return new OnsTraceQueryByMsgIdResponseBody(this);
        } 

    } 

}
