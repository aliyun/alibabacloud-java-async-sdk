// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsTraceQueryByMsgKeyResponseBody} extends {@link TeaModel}
 *
 * <p>OnsTraceQueryByMsgKeyResponseBody</p>
 */
public class OnsTraceQueryByMsgKeyResponseBody extends TeaModel {
    @NameInMap("QueryId")
    private String queryId;

    @NameInMap("RequestId")
    private String requestId;

    private OnsTraceQueryByMsgKeyResponseBody(Builder builder) {
        this.queryId = builder.queryId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsTraceQueryByMsgKeyResponseBody create() {
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
         * The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OnsTraceQueryByMsgKeyResponseBody build() {
            return new OnsTraceQueryByMsgKeyResponseBody(this);
        } 

    } 

}
