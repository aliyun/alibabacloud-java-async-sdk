// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

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
 * {@link OnsTraceQueryByMsgKeyResponseBody} extends {@link TeaModel}
 *
 * <p>OnsTraceQueryByMsgKeyResponseBody</p>
 */
public class OnsTraceQueryByMsgKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("QueryId")
    private String queryId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The ID of the query task. You can call the <a href="https://help.aliyun.com/document_detail/59832.html">OnsTraceGetResult</a> operation to query the details of the message trace based on the task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>272967562652883649157096685****</p>
         */
        public Builder queryId(String queryId) {
            this.queryId = queryId;
            return this;
        }

        /**
         * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>F8654231-122A-4DBD-801F-38E35538****</p>
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
